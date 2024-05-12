package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class DuetModel implements Serializable {

    @InterfaceC65349Pkn("can_shoot")
    public Boolean canShoot = Boolean.TRUE;

    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("duet_awemes")
    public List<? extends Aweme> duetAwemes;

    @InterfaceC65349Pkn("enter_from")
    public String enterFrom;

    @InterfaceC65349Pkn("shoot_way")
    public String shootWay;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("task_id")
    public String taskId;

    public final Boolean getCanShoot() {
        return this.canShoot;
    }

    public final String getCid() {
        return this.cid;
    }

    public final List<Aweme> getDuetAwemes() {
        return this.duetAwemes;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final void setCanShoot(Boolean bool) {
        this.canShoot = bool;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setDuetAwemes(List<? extends Aweme> list) {
        this.duetAwemes = list;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }
}
