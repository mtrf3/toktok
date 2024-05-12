package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes11.dex */
public class UgActivityTasks {

    @InterfaceC65349Pkn("finish_push")
    public String finishPush;

    @InterfaceC65349Pkn("frame")
    public List<List<Integer>> frame;
    public Boolean reported;

    @InterfaceC65349Pkn("show")
    public Boolean show;
    public Boolean succeed;

    @InterfaceC65349Pkn("task_id")
    public String taskId;

    @InterfaceC65349Pkn("task_type")
    public Integer taskType;

    @InterfaceC65349Pkn("time")
    public Integer time;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UgActivityTasks m125clone() {
        UgActivityTasks ugActivityTasks = new UgActivityTasks();
        ugActivityTasks.taskId = this.taskId;
        ugActivityTasks.taskType = this.taskType;
        ugActivityTasks.time = this.time;
        ugActivityTasks.finishPush = this.finishPush;
        return ugActivityTasks;
    }

    public String getFinishPush() {
        String str = this.finishPush;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getTaskId() {
        String str = this.taskId;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getTaskType() {
        Integer num = this.taskType;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getTime() {
        Integer num = this.time;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public UgActivityTasks() {
        Boolean bool = Boolean.FALSE;
        this.reported = bool;
        this.succeed = bool;
    }

    public List<List<Integer>> getFrame() {
        return this.frame;
    }

    public Boolean getReported() {
        return this.reported;
    }

    public Boolean getShow() {
        return this.show;
    }

    public Boolean getSucceed() {
        return this.succeed;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public UgActivityTasks clone(Integer num) {
        UgActivityTasks m125clone = m125clone();
        if (num != null) {
            m125clone.time = num;
        }
        return m125clone;
    }

    public void setFrame(List<List<Integer>> list) {
        this.frame = list;
    }

    public void setReported(Boolean bool) {
        this.reported = bool;
    }

    public void setShow(Boolean bool) {
        this.show = bool;
    }

    public void setSucceed(Boolean bool) {
        this.succeed = bool;
    }

    public void setTime(Integer num) {
        this.time = num;
    }
}
