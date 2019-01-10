package cn.mesmile.aigou.util;

/**
 * @Created with IDEA
 * @author: Super Zheng
 * @Description: java类作用描述
 * @Date:2019/1/9
 * @Time:15:07
 */
public class AjaxResult {
    private Boolean success = true;
    private String message = "成功";

    private Object object;

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * 成功
     * @return
     */
    public static AjaxResult success(){
        return new AjaxResult();
    }
}
