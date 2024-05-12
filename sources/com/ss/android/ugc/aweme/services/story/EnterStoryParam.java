package com.ss.android.ugc.aweme.services.story;

import X.C79062V1e;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EnterStoryParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<EnterStoryParam> CREATOR = new Creator();
    public final String creationId;
    public final String enterFrom;
    public final String enterMethod;
    public final boolean isStory;
    public final boolean isStoryEnhancedEntrance;
    public final boolean isWestWindowExist;
    public final boolean launchAsActivity;
    public final boolean needPublishWithAnim;
    public final String shootEnterFrom;
    public final String shootEnterMethod;
    public final ShootExtraData shootExtraData;
    public final String shootWay;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<EnterStoryParam> {
        @Override // android.os.Parcelable.Creator
        public final EnterStoryParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new EnterStoryParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (ShootExtraData) parcel.readParcelable(EnterStoryParam.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EnterStoryParam[] newArray(int i) {
            return new EnterStoryParam[i];
        }
    }

    public EnterStoryParam() {
        this(null, null, null, false, false, false, false, null, null, null, false, null, 4095, null);
    }

    public static /* synthetic */ EnterStoryParam copy$default(EnterStoryParam enterStoryParam, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, String str4, String str5, String str6, boolean z5, ShootExtraData shootExtraData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enterStoryParam.shootWay;
        }
        if ((i & 2) != 0) {
            str2 = enterStoryParam.enterMethod;
        }
        if ((i & 4) != 0) {
            str3 = enterStoryParam.enterFrom;
        }
        if ((i & 8) != 0) {
            z = enterStoryParam.needPublishWithAnim;
        }
        if ((i & 16) != 0) {
            z2 = enterStoryParam.launchAsActivity;
        }
        if ((i & 32) != 0) {
            z3 = enterStoryParam.isWestWindowExist;
        }
        if ((i & 64) != 0) {
            z4 = enterStoryParam.isStory;
        }
        if ((i & 128) != 0) {
            str4 = enterStoryParam.shootEnterFrom;
        }
        if ((i & 256) != 0) {
            str5 = enterStoryParam.shootEnterMethod;
        }
        if ((i & 512) != 0) {
            str6 = enterStoryParam.creationId;
        }
        if ((i & 1024) != 0) {
            z5 = enterStoryParam.isStoryEnhancedEntrance;
        }
        if ((i & 2048) != 0) {
            shootExtraData = enterStoryParam.shootExtraData;
        }
        return enterStoryParam.copy(str, str2, str3, z, z2, z3, z4, str4, str5, str6, z5, shootExtraData);
    }

    public static /* synthetic */ void getLaunchAsActivity$annotations() {
    }

    public static /* synthetic */ void getNeedPublishWithAnim$annotations() {
    }

    public static /* synthetic */ void isStory$annotations() {
    }

    public static /* synthetic */ void isWestWindowExist$annotations() {
    }

    public final EnterStoryParam copy(String str, String enterMethod, String enterFrom, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, String str4, boolean z5, ShootExtraData shootExtraData) {
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(shootExtraData, "shootExtraData");
        return new EnterStoryParam(str, enterMethod, enterFrom, z, z2, z3, z4, str2, str3, str4, z5, shootExtraData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterStoryParam)) {
            return false;
        }
        EnterStoryParam enterStoryParam = (EnterStoryParam) obj;
        return o.LJ(this.shootWay, enterStoryParam.shootWay) && o.LJ(this.enterMethod, enterStoryParam.enterMethod) && o.LJ(this.enterFrom, enterStoryParam.enterFrom) && this.needPublishWithAnim == enterStoryParam.needPublishWithAnim && this.launchAsActivity == enterStoryParam.launchAsActivity && this.isWestWindowExist == enterStoryParam.isWestWindowExist && this.isStory == enterStoryParam.isStory && o.LJ(this.shootEnterFrom, enterStoryParam.shootEnterFrom) && o.LJ(this.shootEnterMethod, enterStoryParam.shootEnterMethod) && o.LJ(this.creationId, enterStoryParam.creationId) && this.isStoryEnhancedEntrance == enterStoryParam.isStoryEnhancedEntrance && o.LJ(this.shootExtraData, enterStoryParam.shootExtraData);
    }

    public String toString() {
        return "EnterStoryParam(shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", needPublishWithAnim=" + this.needPublishWithAnim + ", launchAsActivity=" + this.launchAsActivity + ", isWestWindowExist=" + this.isWestWindowExist + ", isStory=" + this.isStory + ", shootEnterFrom=" + this.shootEnterFrom + ", shootEnterMethod=" + this.shootEnterMethod + ", creationId=" + this.creationId + ", isStoryEnhancedEntrance=" + this.isStoryEnhancedEntrance + ", shootExtraData=" + this.shootExtraData + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.shootWay);
        out.writeString(this.enterMethod);
        out.writeString(this.enterFrom);
        out.writeInt(this.needPublishWithAnim ? 1 : 0);
        out.writeInt(this.launchAsActivity ? 1 : 0);
        out.writeInt(this.isWestWindowExist ? 1 : 0);
        out.writeInt(this.isStory ? 1 : 0);
        out.writeString(this.shootEnterFrom);
        out.writeString(this.shootEnterMethod);
        out.writeString(this.creationId);
        out.writeInt(this.isStoryEnhancedEntrance ? 1 : 0);
        out.writeParcelable(this.shootExtraData, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.shootWay;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.enterFrom, C79062V1e.LJ(this.enterMethod, hashCode * 31, 31), 31);
        boolean z = this.needPublishWithAnim;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LJ + i3) * 31;
        boolean z2 = this.launchAsActivity;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z3 = this.isWestWindowExist;
        int i7 = z3;
        if (z3 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z4 = this.isStory;
        int i9 = z4;
        if (z4 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        String str2 = this.shootEnterFrom;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.shootEnterMethod;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.creationId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i13 = (i12 + i) * 31;
        if (!this.isStoryEnhancedEntrance) {
            i2 = 0;
        }
        return this.shootExtraData.hashCode() + ((i13 + i2) * 31);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final boolean getLaunchAsActivity() {
        return this.launchAsActivity;
    }

    public final boolean getNeedPublishWithAnim() {
        return this.needPublishWithAnim;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final String getShootEnterMethod() {
        return this.shootEnterMethod;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final boolean isStory() {
        return this.isStory;
    }

    public final boolean isStoryEnhancedEntrance() {
        return this.isStoryEnhancedEntrance;
    }

    public final boolean isWestWindowExist() {
        return this.isWestWindowExist;
    }

    public EnterStoryParam(String str, String enterMethod, String enterFrom, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, String str4, boolean z5, ShootExtraData shootExtraData) {
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(shootExtraData, "shootExtraData");
        this.shootWay = str;
        this.enterMethod = enterMethod;
        this.enterFrom = enterFrom;
        this.needPublishWithAnim = z;
        this.launchAsActivity = z2;
        this.isWestWindowExist = z3;
        this.isStory = z4;
        this.shootEnterFrom = str2;
        this.shootEnterMethod = str3;
        this.creationId = str4;
        this.isStoryEnhancedEntrance = z5;
        this.shootExtraData = shootExtraData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EnterStoryParam(java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, boolean r34, boolean r35, boolean r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, boolean r40, com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r29 = this;
            r1 = r42
            r2 = r41
            r7 = r38
            r3 = r37
            r18 = r31
            r17 = r30
            r20 = r33
            r21 = r34
            r22 = r35
            r23 = r36
            r0 = r1 & 1
            if (r0 == 0) goto L1a
            java.lang.String r17 = "story"
        L1a:
            r0 = r1 & 2
            java.lang.String r19 = "unknown"
            if (r0 == 0) goto L22
            r18 = r19
        L22:
            r0 = r1 & 4
            if (r0 == 0) goto L7f
        L26:
            r0 = r1 & 8
            r27 = 0
            if (r0 == 0) goto L2e
            r20 = 0
        L2e:
            r0 = r1 & 16
            if (r0 == 0) goto L34
            r21 = 0
        L34:
            r0 = r1 & 32
            if (r0 == 0) goto L3a
            r22 = 0
        L3a:
            r0 = r1 & 64
            if (r0 == 0) goto L40
            r23 = 0
        L40:
            r0 = r1 & 128(0x80, float:1.8E-43)
            r26 = 0
            if (r0 == 0) goto L48
            r3 = r26
        L48:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4e
            r7 = r26
        L4e:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L7c
        L52:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L79
        L56:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L6d
            com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData r2 = new com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData
            r4 = 0
            r15 = 4078(0xfee, float:5.714E-42)
            r5 = r4
            r6 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r16 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L6d:
            r16 = r29
            r24 = r3
            r25 = r7
            r28 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        L79:
            r27 = r40
            goto L56
        L7c:
            r26 = r39
            goto L52
        L7f:
            r19 = r32
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.story.EnterStoryParam.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
