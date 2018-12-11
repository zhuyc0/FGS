package system.enums;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum ExcptionEnum {
    /**
     *
     */
    DATA_NULL(2,"数据为空"),
    /**
     *
     */
    SYSTEM_ERROR(500,"服务器异常")
    ;
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}