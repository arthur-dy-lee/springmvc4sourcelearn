DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` bigint(20) AUTO_INCREMENT ,
  `name` varchar(50) not NULL COMMENT '名称',
	`height` double(4,2) comment '身高',
	`class_no` int(11) COMMENT '所属班级',
  `sex` tinyint(1)  COMMENT  '性别',
  `iq` int(11)  COMMENT '智商',
	`focus` tinyint(1)  COMMENT '是否特别关注',
  `cultivate_hobby` varchar(500) COMMENT '培养兴趣',
  `phone` int(11) DEFAULT NULL COMMENT '电话号码',
  `address` varchar(500)  COMMENT '地址',
  `is_delete` tinyint(1) not NULL COMMENT '是否删除',
  `modifier` varchar(50) not NULL COMMENT '修改人',
  `gmt_create` date not NULL COMMENT '创建时间',
  `gmt_modified` date not NULL COMMENT '修改时间',
  `bak` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET=utf8 COMMENT='学生表';