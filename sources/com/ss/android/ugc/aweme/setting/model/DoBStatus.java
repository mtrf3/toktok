package com.ss.android.ugc.aweme.setting.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DoBStatus extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("appeal_url")
    public final String appealUrl;

    @InterfaceC65349Pkn("default_birthdate")
    public final String defaultDoB;

    @InterfaceC65349Pkn("desc_type")
    public final Integer descType;

    @InterfaceC65349Pkn("notification_msg")
    public final String msg;

    @InterfaceC65349Pkn("edibility_birthdate_type")
    public final Integer type;

    @InterfaceC65349Pkn("upper_bound_date")
    public final String upperBoundDate;

    /* JADX WARN: Multi-variable type inference failed */
    public DoBStatus() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DoBStatus copy$default(DoBStatus doBStatus, Integer num, String str, String str2, String str3, String str4, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = doBStatus.type;
        }
        if ((i & 2) != 0) {
            str = doBStatus.defaultDoB;
        }
        if ((i & 4) != 0) {
            str2 = doBStatus.msg;
        }
        if ((i & 8) != 0) {
            str3 = doBStatus.appealUrl;
        }
        if ((i & 16) != 0) {
            str4 = doBStatus.upperBoundDate;
        }
        if ((i & 32) != 0) {
            num2 = doBStatus.descType;
        }
        return doBStatus.copy(num, str, str2, str3, str4, num2);
    }

    public final DoBStatus copy(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        return new DoBStatus(num, str, str2, str3, str4, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoBStatus)) {
            return false;
        }
        DoBStatus doBStatus = (DoBStatus) obj;
        return o.LJ(this.type, doBStatus.type) && o.LJ(this.defaultDoB, doBStatus.defaultDoB) && o.LJ(this.msg, doBStatus.msg) && o.LJ(this.appealUrl, doBStatus.appealUrl) && o.LJ(this.upperBoundDate, doBStatus.upperBoundDate) && o.LJ(this.descType, doBStatus.descType);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.defaultDoB;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.msg;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appealUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.upperBoundDate;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.descType;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DoBStatus(type=");
        LIZ.append(this.type);
        LIZ.append(", defaultDoB=");
        LIZ.append(this.defaultDoB);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", appealUrl=");
        LIZ.append(this.appealUrl);
        LIZ.append(", upperBoundDate=");
        LIZ.append(this.upperBoundDate);
        LIZ.append(", descType=");
        return s0.LIZJ(LIZ, this.descType, ')', LIZ);
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final String getDefaultDoB() {
        return this.defaultDoB;
    }

    public final Integer getDescType() {
        return this.descType;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getUpperBoundDate() {
        return this.upperBoundDate;
    }

    public DoBStatus(Integer num, String str, String str2, String str3, String str4, Integer num2) {
        this.type = num;
        this.defaultDoB = str;
        this.msg = str2;
        this.appealUrl = str3;
        this.upperBoundDate = str4;
        this.descType = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DoBStatus(java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Integer r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r8 = this;
            r5 = r12
            r4 = r11
            r2 = r9
            r3 = r10
            r1 = r15 & 1
            r0 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Le
            r2 = r7
        Le:
            r0 = r15 & 2
            java.lang.String r6 = ""
            if (r0 == 0) goto L15
            r3 = r6
        L15:
            r0 = r15 & 4
            if (r0 == 0) goto L1a
            r4 = r6
        L1a:
            r0 = r15 & 8
            if (r0 == 0) goto L1f
            r5 = r6
        L1f:
            r0 = r15 & 16
            if (r0 == 0) goto L2e
        L23:
            r0 = r15 & 32
            if (r0 == 0) goto L2c
        L27:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L2c:
            r7 = r14
            goto L27
        L2e:
            r6 = r13
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.model.DoBStatus.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
