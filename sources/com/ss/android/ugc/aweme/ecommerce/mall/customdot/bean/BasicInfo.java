package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BasicInfo {

    @InterfaceC65349Pkn("create_time")
    public final String createTime;
    public final int group;
    public final String id;

    public static /* synthetic */ BasicInfo copy$default(BasicInfo basicInfo, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = basicInfo.group;
        }
        if ((i2 & 2) != 0) {
            str = basicInfo.id;
        }
        if ((i2 & 4) != 0) {
            str2 = basicInfo.createTime;
        }
        return basicInfo.copy(i, str, str2);
    }

    public final BasicInfo copy(int i, String str, String str2) {
        return new BasicInfo(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInfo)) {
            return false;
        }
        BasicInfo basicInfo = (BasicInfo) obj;
        return this.group == basicInfo.group && o.LJ(this.id, basicInfo.id) && o.LJ(this.createTime, basicInfo.createTime);
    }

    public int hashCode() {
        int i = this.group * 31;
        String str = this.id;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createTime;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BasicInfo(group=");
        LIZ.append(this.group);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", createTime=");
        return q.LIZIZ(LIZ, this.createTime, ')', LIZ);
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final int getGroup() {
        return this.group;
    }

    public final String getId() {
        return this.id;
    }

    public BasicInfo(int i, String str, String str2) {
        this.group = i;
        this.id = str;
        this.createTime = str2;
    }
}
