package com.ss.android.ugc.aweme.notice.api.bean;

import X.C43588H8u;
import X.C57179McJ;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class GuideOutPushParam implements Parcelable {
    public static final Parcelable.Creator<GuideOutPushParam> CREATOR = new C57179McJ();
    public String avatar;
    public String enterFrom;
    public String enterMethod;
    public String panelType;
    public String trigger;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GuideOutPushParam() {
        /*
            r6 = this;
            r1 = 0
            r5 = 31
            r0 = r6
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuideOutPushParam)) {
            return false;
        }
        GuideOutPushParam guideOutPushParam = (GuideOutPushParam) obj;
        return o.LJ(this.panelType, guideOutPushParam.panelType) && o.LJ(this.enterFrom, guideOutPushParam.enterFrom) && o.LJ(this.enterMethod, guideOutPushParam.enterMethod) && o.LJ(this.trigger, guideOutPushParam.trigger) && o.LJ(this.avatar, guideOutPushParam.avatar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.panelType);
        out.writeString(this.enterFrom);
        out.writeString(this.enterMethod);
        out.writeString(this.trigger);
        out.writeString(this.avatar);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.trigger, C79062V1e.LJ(this.enterMethod, C79062V1e.LJ(this.enterFrom, this.panelType.hashCode() * 31, 31), 31), 31);
        String str = this.avatar;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuideOutPushParam(panelType=");
        LIZ.append(this.panelType);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", trigger=");
        LIZ.append(this.trigger);
        LIZ.append(", avatar=");
        return q.LIZIZ(LIZ, this.avatar, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GuideOutPushParam(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r6 = this;
            r2 = r7
            r3 = r8
            r0 = r11 & 1
            r5 = 0
            if (r0 == 0) goto L26
            java.lang.String r1 = "normal"
        L9:
            r0 = r11 & 2
            java.lang.String r4 = ""
            if (r0 == 0) goto L10
            r2 = r4
        L10:
            r0 = r11 & 4
            if (r0 == 0) goto L15
            r3 = r4
        L15:
            r0 = r11 & 8
            if (r0 == 0) goto L24
        L19:
            r0 = r11 & 16
            if (r0 == 0) goto L22
        L1d:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L22:
            r5 = r10
            goto L1d
        L24:
            r4 = r9
            goto L19
        L26:
            r1 = r5
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public GuideOutPushParam(String str, String str2, String str3, String str4, String str5) {
        C43588H8u.LIZLLL(str, "panelType", str2, "enterFrom", str3, "enterMethod", str4, "trigger");
        this.panelType = str;
        this.enterFrom = str2;
        this.enterMethod = str3;
        this.trigger = str4;
        this.avatar = str5;
    }
}
