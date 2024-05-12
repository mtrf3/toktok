package com.ss.android.ugc.aweme.discover.hitrank;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class HitTaskInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("compeleted_task_cnt")
    public int compeletedTaskCnt;

    @InterfaceC65349Pkn("total_task_cnt")
    public int totalTaskCnt;

    public static /* synthetic */ HitTaskInfo copy$default(HitTaskInfo hitTaskInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hitTaskInfo.compeletedTaskCnt;
        }
        if ((i3 & 2) != 0) {
            i2 = hitTaskInfo.totalTaskCnt;
        }
        return hitTaskInfo.copy(i, i2);
    }

    public final HitTaskInfo copy(int i, int i2) {
        return new HitTaskInfo(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.compeletedTaskCnt), Integer.valueOf(this.totalTaskCnt)};
    }

    public final int getCompeletedTaskCnt() {
        return this.compeletedTaskCnt;
    }

    public final int getTotalTaskCnt() {
        return this.totalTaskCnt;
    }

    public final void setCompeletedTaskCnt(int i) {
        this.compeletedTaskCnt = i;
    }

    public final void setTotalTaskCnt(int i) {
        this.totalTaskCnt = i;
    }

    public HitTaskInfo(int i, int i2) {
        this.compeletedTaskCnt = i;
        this.totalTaskCnt = i2;
    }
}
