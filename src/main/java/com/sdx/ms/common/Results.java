package com.sdx.ms.common;

import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * 结果显示辅助类
 * Created by yelo on 2015/10/7.
 */
public class Results implements Serializable{

    public static final Result SUCCESS = new Result(Result.SUCCESS, "处理成功");
    public static final Result ACCOUNT_INVALID = new Result(Result.ACCOUNT_INVALID, "账号无效");
    public static final Result NO_REGIST = new Result(Result.NO_REGIST, "未注册");
    public static final Result SEND_FAIL = new Result(Result.SEND_FAIL, "发送失败");
    public static final Result SYSTEM_BUSY = new Result(Result.SYSTEM_BUSY, "系统繁忙");
    public static final Result PARAMETER_INCORRENT = new Result(Result.PARAMETER_INCORRENT, "请求参数有误");
    public static final Result ACCOUNT_EXIST = new Result(Result.ACCOUNT_EXIST, "帐户已注册");
    public static final Result CAPTCHA_INCORRENT = new Result(Result.CAPTCHA_INCORRENT, "验证码错误");
    public static final Result TOKEN_INCORRECT = new Result(Result.TOKEN_INCORRECT, "验证失效，请重新登录");
    public static final Result CAPTCHA_INVALID = new Result(Result.CAPTCHA_INVALID, "验证码失效");
    public static final Result ACCOUNT_NOT_EXIST = new Result(Result.ACCOUNT_NOT_EXIST, "帐号不存在");
    public static final Result REPEAT_SEND = new Result(Result.TOKEN_INCORRECT, "一分钟内只能请求一次");
    public static final Result ACCOUNT_OR_PASSWORD_WRONG = new Result(Result.ACCOUNT_OR_PASSWORD_WRONG, "帐号或者密码错误");
    public static final Result PASSWORD_WRONG = new Result(Result.PASSWORD_WRONG, "密码错误");
    public static final Result ACCOUNT_IS_PULL_THE_BLACK = new Result(Result.ACCOUNT_IS_PULL_THE_BLACK, "账号已被拉黑");
    public static final Result NOT_FIND_ADDRESS = new Result(Result.NOT_FIND_ADDRESS, "找不到地址信息");
    public static final Result STOCK_NOT_ENOUGH = new Result(Result.STOCK_NOT_ENOUGH, "商品数量不够");
    public static final Result NOT_FIND_ORDER = new Result(Result.NOT_FIND_ORDER, "找不定订单");
    public static final Result NOT_FIND = new Result(Result.NOT_FIND, "找不到");
    public static final Result NOT_BUY_THIS_GOODS = new Result(Result.NOT_BUY_THIS_GOODS, "不能购买该商品");
    public static final Result ALREADY_COMMENT = new Result(Result.ALREADY_COMMENT, "已经评论过此商品");
    public static final Result ALREADY_PRAISE = new Result(Result.ALREADY_PRAISE, "已经点过赞或者反对");
    public static final Result ALREADY_COLLECT = new Result(Result.ALREADY_COLLECT, "已经收藏过");
    public static final Result PASS_LIMIT = new Result(Result.PASS_LIMIT, "购买超出限制数量");
    public static final Result ALREADY_SIGN_IN = new Result(Result.ALREADY_SIGN_IN, "已登录");
    public static final Result GOODS_NOT_FIND = new Result(Result.GOODS_NOT_FIND, "找不到商品");
    public static final Result NOT_SERVICE_GOODS = new Result(Result.NOT_SERVICE_GOODS, "不是免费服务商品");
    public static final Result COUPON_NOT_CAN_USE = new Result(Result.COUPON_NOT_CAN_USE, "优惠卷不能使用");
    public static final Result POINTS_BALANCE_NOT_ENOUGH = new Result(Result.POINTS_BALANCE_NOT_ENOUGH, "积分不够");
    public static final Result ORDER_NOT_CAN_DELETE = new Result(Result.ORDER_NOT_CAN_DELETE, "无法删除订单");
    public static final Result NOT_GET_VERSION_INFO = new Result(Result.NOT_GET_VERSION_INFO, "无法获取版本信息");
    public static final Result NOT_EXCHANGE_MAP = new Result(Result.NOT_EXCHANGE_MAP, "无换购活动");
    public static final Result IS_ADD_EXCHANGE_MAP = new Result(Result.IS_ADD_EXCHANGE_MAP, "用户当天已参加过活动,或待付款订单里有换购订单请删除后再参与");
    public static final Result NOT_BUY_EXCHANGE_GOODS = new Result(Result.NOT_BUY_EXCHANGE_GOODS, "换购商品不存在");
    public static final Result NOT_EXCHANGE_GOODS = new Result(Result.NOT_EXCHANGE_GOODS, "订单金额不足，不能参该活动");
    public static final Result BRANCH_NOT_SHOP_TIME = new Result(Result.BRANCH_NOT_SHOP_TIME, "很抱歉，本店已打烊，详情请看营业时间公告。");
    public static final Result BRANCH_NOT_SHOP_DATE = new Result(Result.BRANCH_NOT_SHOP_DATE, "很抱歉，本店已打烊，详情请看营业时间公告。");
    public static final Result RESET_PASSWORD_FAILURE = new Result(Result.RESET_PASSWORD_FAILURE, "修改密码失败");
    public static final Result GAIN_MSG_FAILURE = new Result(Result.GAIN_MSG_FAILURE, "获取信息失败");
    public static final Result COUPON_NOT_ENOUGH_AMOUNT = new Result(Result.COUPON_NOT_ENOUGH_AMOUNT, "代金券需达到限定金额才能兑现");
    public static final Result UNKNOWN_PAY_WAY = new Result(Result.UNKNOWN_PAY_WAY, "未知的支付方式");
    public static final Result SAVE_FAILURE = new Result(Result.SAVE_FAILURE, "保存失败");
    public static final Result UPDATE_FAILURE = new Result(Result.UPDATE_FAILURE, "更新失败");
    public static final Result DELETE_FAILURE = new Result(Result.DELETE_FAILURE, "删除失败");
    public static final Result QUERY_FAILURE = new Result(Result.QUERY_FAILURE, "查询失败");
    public static final Result EFFECT_FAILURE = new Result(Result.EFFECT_FAILURE, "生效失败");
    public static final Result CANCEL_FAILURE = new Result(Result.CANCEL_FAILURE, "作废失败");
    public static final Result STORE_NOT_ALLOW_APPROVE = new Result(Result.UPDATE_FAILURE, "不能审批该店铺，状态无效");
    /**
     * 采购明细应收单价或者实收单价不能为空
     */
    public static Result CAPTCHA_API_FORBIDDEN = new Result(Result.SAVE_FAILURE, "您的叮当来啦版本过低，请更新以后再注册吧！");
    public static Result CAPTCHA_PWD_API_FORBIDDEN = new Result(Result.SAVE_FAILURE, "您的叮当来啦版本过低，请更新以后再修改密码！");

    /**
     * 未设置用户店铺信息
     */
    public static final Result ERROR_USER_NOTSET_STORE = new Result(Result.QUERY_FAILURE, "未设置用户店铺信息！");
    /**
     * 用户店铺未设置信息管理店铺
     */
    public static final Result ERROR_USER_NOTSET_ADMIN_STORE = new Result(Result.QUERY_FAILURE, "用户所在店铺不是区域管理店铺！");
    /**
     * 用户店铺未设置信息管理店铺
     */
    public static final Result ERROR_USER_NO_PERMISSIONS = new Result(Result.QUERY_FAILURE, "当前用户类型不能登录该系统！");
    public static final Result ERROR_USER_STORE_NO_PERMISSIONS = new Result(Result.QUERY_FAILURE, "当前用户店铺类型不允许登录该系统！");
    /**
     * 查询商品失败
     */
    public static final Result MAIN_STORE_SYSAREAS_QUERY_STORE_ERROR = new Result(Result.QUERY_FAILURE, "查询总店商品失败！");
    //区域
    public static final Result SYSAREAS_UNABLE_EDIT_AREA_INFO = new Result(Result.UPDATE_FAILURE, "只能操作草稿或者待审批的区域信息！");
    public static final Result SYSAREAS_UNABLE_DELETE_AREA_INFO = new Result(Result.UPDATE_FAILURE, "只能操作草稿的区域信息！");
    public static final Result ERROR_PROXY_STORE_CANT_DELETE = new Result(Result.UPDATE_FAILURE, "代理店铺不能删除！");
    public static final Result ERROR_PROXY_STORE_CANT_MODIFY = new Result(Result.UPDATE_FAILURE, "代理店铺不能修改！");
    public static final Result ERROR_AREA_NOT_EXISTS = new Result(Result.QUERY_FAILURE, "区域不存在！");
    //店铺
    public static final Result ERROR_STORE_NOT_ACTIVITY = new Result(Result.UPDATE_FAILURE, "店铺状态不是生效！");
    public static final Result ERROR_STORE_NOT_ALLOW_ADD_STORE_ITEMS = new Result(Result.UPDATE_FAILURE, "当前用户不允许给其他店铺添加商品！");
    public static final Result ERROR_STORE_NOT_ALLOW_ADD_USER = new Result(Result.UPDATE_FAILURE, "选择的店铺不能添加区/市代理账号！");
    //店铺商品
    public static final Result ERROR_STORE_ITEM_STOCK_NOT_EMPTY = new Result(Result.UPDATE_FAILURE, "商品库存不为空！");
    //红包
    public static final Result ERROR_REDENVELOPE_BEEN_SOLED_OUT = new Result(Result.SOLDOUT_FAILURE, "红包已经抢购完了！");
    public static final Result ERROR_REDENVELOPE_BEEN_GRAPED = new Result(Result.GRAP_FAILURE, "已经抢过红包!");
    public static final Result ERROR_REDENVELOPE_NO_ACTIVITY = new Result(Result.NO_ACTIVITY, "没有红包活动!");
    public static final Result ERROR_REDENVELOPE_OUT_DATE = new Result(Result.OUT_DATE, "红包已经过期!");
    public static final Result ERROR_REDENVELOPE_OUT_LIMIT = new Result(Result.OUT_LIMIT, "当天超过抢红包次数!");
    public static final Result ERROR_REDENVELOPE_PHONE_NULL = new Result(Result.PHONE_NULL, "电话号码为空");
    public static final Result ERROR_REDENVELOPE_WXOPENID_NULL = new Result(Result.WXOPENID_NULL, "微信ID为空");
    //代金券
    public static final Result ERROR_NO_COUPONS = new Result(Result.NO_COUPONS, "没有可用的代金券");
    public static final Result ERROR_OUT_TOTAY_USE_LIMIT = new Result(Result.OUT_USE_LIMIT, "今日使用红包已经超过2个");
    //订单
    public static final Result ORDER_NOT_FIND = new Result(Result.QUERY_FAILURE, "订单信息不存在！");
    public static final Result ORDER_NOT_PAID = new Result(Result.QUERY_FAILURE, "订单未支付或者已退单！");
    public static final Result ORDER_CANT_REMINDER_DELIVERY_TIME = new Result(Result.QUERY_FAILURE, "订单支付时间未超过20分钟！");
    public static final Result ORDER_CANT_REMINDER_RETURN_TIME = new Result(Result.QUERY_FAILURE, "订单支付时间未超过30分钟！");
    public static final Result ORDER_CANT_REMINDER_RETURN_TIME_DAY = new Result(Result.QUERY_FAILURE, "订单太久远不能操作！");
    public static final Result ORDER_HAD_REMINDER_RETURN = new Result(Result.QUERY_FAILURE, "该订单已经提醒店铺退货！");
    public static final Result ORDER_HAD_REMINDER_DELIVERY = new Result(Result.QUERY_FAILURE, "该订单已经提醒店铺送货！");
    //自采
    public static final Result ERROR_STORE_PURCHASE_CANNOT_STORAGE= new Result(Result.UPDATE_FAILURE, "采购单已入库不能重复入库！");
    public static final Result ERROR_STORE_PURCHASE_NOT_ALLOW_STORAGE= new Result(Result.UPDATE_FAILURE, "店铺不允许自采！");
    public static final Result ERROR_STORE_PURCHASE_ITEM_NOT_ALLOW= new Result(Result.UPDATE_FAILURE, "部分商品不允许自采,请重新创建自采单！");

    //广告
    public static final Result ERROR_UPLOAD_AD_IMAGE = new Result(Result.UPLOAD_FAIL, "上传广告失败!");
    public static final Result ERROR_AD_OUT_RATIO = new Result(Result.OUT_RATIO, "广告总占比超过100%");
    /**
     * 登录成功
     */
    public static Result LOGIN_SUCCESS = new Result(Result.SUCCESS, "登录成功");
    /**
     * 对象不存在
     */
    public static Result OBJECT_OUT_EXIST = new Result(Result.SUCCESS, "对象不存在!");
    /**
     * 保存成功
     */
    public static Result SAVE_SUCCESS = new Result(Result.SUCCESS, "保存成功");
    /**
     * 操作成功
     */
    public static Result OPERATE_SUCCESS = new Result(Result.SUCCESS, "操作成功");
    /**
     * 退出登录
     */
    public static Result EXIT_LOGIN_SUCCESS = new Result(Result.SUCCESS, "退出成功");
    /**
     * 采购单生效必须是草稿状态，否则不给生效
     */
    public static Result PURCHASE_VERIFY_EFFECT_FAIL = new Result(Result.SUCCESS, "该采购单必须是采购审核状态，才能生效！");
    /**
     * 采购单采购审核必须先生效
     */
    public static Result PURCHASE_VERIFY_PURVERIFY_FAIL = new Result(Result.SUCCESS, "采购单必须是草稿状态才能进行采购审核！");
    /**
     * 采购单财务审核必须先生效
     */
    public static Result PURCHASE_VERIFY_FINANCE_FAIL = new Result(Result.SUCCESS, "采购单必须是生效状态才能进行财务审核！");
    /**
     * 采购单出货必须先财务审核
     */
    public static Result PURCHASE_VERIFY_STOCKREMOVE_FAIL = new Result(Result.SUCCESS, "采购单必须财务审核才能进行出货！");
    /**
     *  只能新建一间本地仓库
     */
    public static Result STORE_ONLYONE_WAREHOUSE = new Result(Result.SUCCESS, "只能新建一间本地仓库！");
    /**
     *  顶级类别不能新增商品
     */
    public static Result CATEGORY_ERROR = new Result(Result.SUCCESS, "顶级类别不能新增商品！");
    /**
     * 客户号码不能为空
     */
    public static Result CUSTOMER_PHONENO_NOT_NULL = new Result(Result.SUCCESS, "客户号码不能为空！");
    /**
     *  分机号码不能为空
     */
    public static Result MACHINENO_NOT_NULL = new Result(Result.SUCCESS, "分机号码不能为空！");
    /**
     * 该分机号码暂时没有客户信息！
     */
    public static Result MACHINENO_NOT_PHONE_INFO = new Result(Result.SUCCESS, "该分机号码暂时没有客户信息！");
    /**
     * 类别不能为空
     */
    public static Result CATEGORY_NOT_NULL = new Result(Result.SUCCESS, "类别不能为空！");
    /**
     * 类别简称不能为空或重复
     */
    public static Result CATEGORY_EXIST_NOT_NULL = new Result(Result.SUCCESS, "类别简称不能为空或重复！");
    /**
     * 采购明细应收数量或者实收数量不能为空
     */
    public static Result PURCHASE_NUMBER_NOT_NULL = new Result(Result.SUCCESS, "采购明细应收数量或者实收数量不能为空！");
    /**
     * 采购明细应收单价或者实收单价不能为空
     */
    public static Result PURCHASE_PRICE_NOT_NULL = new Result(Result.SUCCESS, "采购明细应收单价或者实收单价不能为空或0！");
    private Map<String, Object> result;

    public Results() {
        this.result = Maps.newHashMap();
    }

    public static Results of() {
        return new Results();
    }

    public Results put(String name, Object value) {
        this.result.put(name, value);
        return this;
    }

    public Map<String, Object> toMap() {
        return this.result;
    }

    public static class Result implements Serializable{

        // 处理成功
        public final static int SUCCESS = 200;
        // 系统繁忙
        public final static int SYSTEM_BUSY = -1;
        //未注册
        public final static int NO_REGIST = 3000;
        //发送失败
        public final static int SEND_FAIL = 40000;
        // 请求参数有误
        public final static int PARAMETER_INCORRENT = 40002;
        // 帐户已注册
        public final static int ACCOUNT_EXIST = 40003;
        // 帐号或者密码错误
        public final static int ACCOUNT_OR_PASSWORD_WRONG = 40004;
        //账号无效
        public final static int ACCOUNT_INVALID = -40004;
        // 验证码错误
        public final static int CAPTCHA_INCORRENT = 40007;
        // TOKEN失效
        public final static int TOKEN_INCORRECT = 40008;
        // 账号未注册
        public final static int ACCOUNT_NOT_EXIST = 40009;
        //手机验证码失效
        public final static int CAPTCHA_INVALID = 40010;
        // 1分钟内重复发送
        public final static int REPEAT_SEND = 40011;
        //密码错误
        public final static int PASSWORD_WRONG = 40012;
        //账号已被拉黑
        public final static int ACCOUNT_IS_PULL_THE_BLACK = 40013;
        //地址不存在
        public final static int NOT_FIND_ADDRESS = 40100;
        //库存不足
        public final static int STOCK_NOT_ENOUGH = 50000;
        //找不到
        public final static int NOT_FIND = -50000;
        //没找到订单
        public final static int NOT_FIND_ORDER = 50001;
        //未购买过此商品
        public final static int NOT_BUY_THIS_GOODS = 50002;
        //已经评论过此商品
        public final static int ALREADY_COMMENT = 50003;
        //已经点过赞或者反对
        public final static int ALREADY_PRAISE = 50004;
        //已经收藏过
        public final static int ALREADY_COLLECT = 50005;
        //购买超出限制数量
        public final static int PASS_LIMIT = 50006;
        //已经签到过
        public final static int ALREADY_SIGN_IN = 50007;
        //商品没找到
        public final static int GOODS_NOT_FIND = 60000;
        //不是免费服务商品
        public final static int NOT_SERVICE_GOODS = 60001;
        //用户积分余额不足
        public final static int POINTS_BALANCE_NOT_ENOUGH = 70000;
        //优惠券不可用
        public static final int COUPON_NOT_CAN_USE = 70001;
        //订单不能删除
        public static final int ORDER_NOT_CAN_DELETE = 80000;
        //未获取版本信息
        public static final int NOT_GET_VERSION_INFO = 90000;
        //不在营业日期内
        public static final int BRANCH_NOT_SHOP_DATE = 20001;
        //不在营业时间内
        public static final int BRANCH_NOT_SHOP_TIME = 20002;
        // 无换购活动
        public static final int NOT_EXCHANGE_MAP = 20004;
        // 无换购活动
        public static final String NOT_EXCHANGE = "NOT_EXCHANGE";
        // 用户当天已参加过活动
        public static final int IS_ADD_EXCHANGE_MAP = 20005;
        // 用户当天已参加过活动
        public static final String IS_ADD_EXCHANGE = "IS_ADD_EXCHANGE";
        //换购商品不存在
        public final static int NOT_BUY_EXCHANGE_GOODS = 20006;
        //订单金额不足，不能参该活动
        public final static int NOT_EXCHANGE_GOODS = 20007;
        //修改密码失败
        public final static int RESET_PASSWORD_FAILURE = 40044;
        //获取信息失败
        public static final int GAIN_MSG_FAILURE = 40045;
        //保存失败
        public static final int SAVE_FAILURE = 10001;
        //更新失败
        public static final int UPDATE_FAILURE = 10002;
        //删除失败
        public static final int DELETE_FAILURE = 10003;
        //查询失败
        public static final int QUERY_FAILURE = 10004;
        //生效失败
        public static final int EFFECT_FAILURE = 10005;
        //作废失败
        public static final int CANCEL_FAILURE = 10006;
        //代金卷达不到指定金额
        public static final int COUPON_NOT_ENOUGH_AMOUNT = 10007;

        public static final int UNKNOWN_PAY_WAY = 10008;
        //红包已经抢购完
        public static final int SOLDOUT_FAILURE = 11001;
        //已经抢过红包
        public static final int GRAP_FAILURE = 11002;
        //没有红包活动
        public static final int NO_ACTIVITY = 11003;
        //红包过期
        public static final int OUT_DATE = 11004;
        //当天超过红包抢的次数
        public  static final int OUT_LIMIT=11005;
        //手机号码为空
        public static final int PHONE_NULL = 11006;
        //微信ID为空
        public static final int WXOPENID_NULL = 11007;
        //没有代金券
        public static final int NO_COUPONS = 12000;
        //今日红包使用限制已经过超过3个
        public static final int OUT_USE_LIMIT = 12001;
        //上传广告图片失败
        public static final int UPLOAD_FAIL = 13000;
        //广告比率超过100%
        public static final int OUT_RATIO = 13001;
        private int code;
        private String msg;
        private Object result = Results.of().put("orderNo", 111).put("total", 10).toMap();

        public Result(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public Result(int code, String msg, Object result) {
            this.code = code;
            this.msg = msg;
            this.result = result;
        }

        public Result(Result rest, Object result) {
            this.code = rest.getCode();
            this.msg = rest.getMsg();
            this.result = result;
        }

        public Object getResult() {
            return result;
        }

        public void setResult(Object result) {
            this.result = result;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
    }
