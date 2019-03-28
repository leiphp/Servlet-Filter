/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : jdbc

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-03-28 00:43:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for imooc_goddess
-- ----------------------------
DROP TABLE IF EXISTS `imooc_goddess`;
CREATE TABLE `imooc_goddess` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `sex` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobile` varchar(11) DEFAULT NULL,
  `create_user` varchar(30) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `update_user` varchar(30) DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  `isdel` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of imooc_goddess
-- ----------------------------
INSERT INTO `imooc_goddess` VALUES ('1', '小美', null, '22', null, 'xiaomei@imooc.com', '13798262415', null, null, null, null, null);
INSERT INTO `imooc_goddess` VALUES ('5', '小夏', '1', '21', '2019-03-01', 'xiaoxia@imooc.com', '13798262504', 'admin', '2019-03-01', 'admin1', '2019-03-01', '1');
INSERT INTO `imooc_goddess` VALUES ('6', '小青', '1', '25', '2019-03-02', 'xiaoqing@163.com', '15688888888', null, '2019-03-02', null, '2019-03-02', '0');
INSERT INTO `imooc_goddess` VALUES ('7', '小园', '1', '28', '1990-11-30', 'xiaoyuan@163.com', '13798262410', 'ADMIN', '2019-03-02', 'ADMIN', '2019-03-02', '0');
INSERT INTO `imooc_goddess` VALUES ('8', '小乔', '1', '20', '1992-02-14', 'xiaoqiao@163.com', '13798262415', 'ADMIN', '2019-03-02', 'ADMIN', '2019-03-02', '0');

-- ----------------------------
-- Table structure for tbl_address
-- ----------------------------
DROP TABLE IF EXISTS `tbl_address`;
CREATE TABLE `tbl_address` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `city` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `user_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_address
-- ----------------------------
INSERT INTO `tbl_address` VALUES ('1', 'beijing', 'china', '1');
INSERT INTO `tbl_address` VALUES ('2', 'tianjin', 'china', '2');

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(50) NOT NULL DEFAULT '',
  `email` varchar(50) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', 'xiaoming', '123456', 'xiaoming@gmail.com');
INSERT INTO `tbl_user` VALUES ('2', 'xiaozhang', '123456', 'xiaozhang@gmain.com');
