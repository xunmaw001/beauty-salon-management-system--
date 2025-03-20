package com.entity.view;

import com.entity.ChanpinfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 产品服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 22:18:19
 */
@TableName("chanpinfuwu")
public class ChanpinfuwuView  extends ChanpinfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChanpinfuwuView(){
	}
 
 	public ChanpinfuwuView(ChanpinfuwuEntity chanpinfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, chanpinfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
