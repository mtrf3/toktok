package com.ss.android.ugc.aweme.services.recording;

import X.C05040Hs;
import X.C07670Rv;
import X.C79062V1e;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NowsShootActivityArg implements IRouteArg {
    public static final Parcelable.Creator<NowsShootActivityArg> CREATOR = new Creator();
    public final String authorId;
    public final String enterFrom;
    public final String enterMethod;
    public final String enterPosition;
    public final String fromAwemeId;
    public final boolean isBlueVUser;
    public int isNewPage;
    public final String nowCardType;
    public final String nowPostBy;
    public final String nowShootEnterScene;
    public String nowTabEnterMethod;
    public final String nowType;
    public String previousPage;
    public final String requestId;
    public final String shootPosition;
    public final String shootWay;
    public final boolean shouldBackToCurPageAfterPublish;
    public Long startNowsRecordTime;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<NowsShootActivityArg> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NowsShootActivityArg createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new NowsShootActivityArg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NowsShootActivityArg[] newArray(int i) {
            return new NowsShootActivityArg[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowsShootActivityArg() {
        /*
            r21 = this;
            r1 = 0
            r4 = 0
            r19 = 262143(0x3ffff, float:3.6734E-40)
            r0 = r21
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r4
            r16 = r1
            r17 = r1
            r18 = r1
            r20 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg.<init>():void");
    }

    public static /* synthetic */ NowsShootActivityArg copy$default(NowsShootActivityArg nowsShootActivityArg, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, int i, String str12, String str13, String str14, int i2, Object obj) {
        boolean z3 = z;
        String str15 = str3;
        String str16 = str;
        String str17 = str2;
        String str18 = str7;
        String str19 = str6;
        String str20 = str5;
        boolean z4 = z2;
        String str21 = str4;
        Long l2 = l;
        String str22 = str11;
        String str23 = str10;
        String str24 = str8;
        String str25 = str9;
        String str26 = str14;
        String str27 = str13;
        int i3 = i;
        String str28 = str12;
        if ((i2 & 1) != 0) {
            str16 = nowsShootActivityArg.shootWay;
        }
        if ((i2 & 2) != 0) {
            str17 = nowsShootActivityArg.enterMethod;
        }
        if ((i2 & 4) != 0) {
            str15 = nowsShootActivityArg.enterFrom;
        }
        if ((i2 & 8) != 0) {
            z3 = nowsShootActivityArg.isBlueVUser;
        }
        if ((i2 & 16) != 0) {
            z4 = nowsShootActivityArg.shouldBackToCurPageAfterPublish;
        }
        if ((i2 & 32) != 0) {
            str21 = nowsShootActivityArg.nowCardType;
        }
        if ((i2 & 64) != 0) {
            str20 = nowsShootActivityArg.nowType;
        }
        if ((i2 & 128) != 0) {
            str19 = nowsShootActivityArg.enterPosition;
        }
        if ((i2 & 256) != 0) {
            str18 = nowsShootActivityArg.fromAwemeId;
        }
        if ((i2 & 512) != 0) {
            str24 = nowsShootActivityArg.nowPostBy;
        }
        if ((i2 & 1024) != 0) {
            str25 = nowsShootActivityArg.shootPosition;
        }
        if ((i2 & 2048) != 0) {
            str23 = nowsShootActivityArg.requestId;
        }
        if ((i2 & 4096) != 0) {
            str22 = nowsShootActivityArg.authorId;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            l2 = nowsShootActivityArg.startNowsRecordTime;
        }
        if ((i2 & 16384) != 0) {
            i3 = nowsShootActivityArg.isNewPage;
        }
        if ((32768 & i2) != 0) {
            str28 = nowsShootActivityArg.previousPage;
        }
        if ((65536 & i2) != 0) {
            str27 = nowsShootActivityArg.nowTabEnterMethod;
        }
        if ((i2 & 131072) != 0) {
            str26 = nowsShootActivityArg.nowShootEnterScene;
        }
        String str29 = str21;
        String str30 = str20;
        String str31 = str19;
        return nowsShootActivityArg.copy(str16, str17, str15, z3, z4, str29, str30, str31, str18, str24, str25, str23, str22, l2, i3, str28, str27, str26);
    }

    public final NowsShootActivityArg copy(String shootWay, String enterMethod, String enterFrom, boolean z, boolean z2, String nowCardType, String str, String str2, String str3, String nowPostBy, String shootPosition, String requestId, String authorId, Long l, int i, String str4, String str5, String str6) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(nowCardType, "nowCardType");
        o.LJIIIZ(nowPostBy, "nowPostBy");
        o.LJIIIZ(shootPosition, "shootPosition");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(authorId, "authorId");
        return new NowsShootActivityArg(shootWay, enterMethod, enterFrom, z, z2, nowCardType, str, str2, str3, nowPostBy, shootPosition, requestId, authorId, l, i, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowsShootActivityArg)) {
            return false;
        }
        NowsShootActivityArg nowsShootActivityArg = (NowsShootActivityArg) obj;
        return o.LJ(this.shootWay, nowsShootActivityArg.shootWay) && o.LJ(this.enterMethod, nowsShootActivityArg.enterMethod) && o.LJ(this.enterFrom, nowsShootActivityArg.enterFrom) && this.isBlueVUser == nowsShootActivityArg.isBlueVUser && this.shouldBackToCurPageAfterPublish == nowsShootActivityArg.shouldBackToCurPageAfterPublish && o.LJ(this.nowCardType, nowsShootActivityArg.nowCardType) && o.LJ(this.nowType, nowsShootActivityArg.nowType) && o.LJ(this.enterPosition, nowsShootActivityArg.enterPosition) && o.LJ(this.fromAwemeId, nowsShootActivityArg.fromAwemeId) && o.LJ(this.nowPostBy, nowsShootActivityArg.nowPostBy) && o.LJ(this.shootPosition, nowsShootActivityArg.shootPosition) && o.LJ(this.requestId, nowsShootActivityArg.requestId) && o.LJ(this.authorId, nowsShootActivityArg.authorId) && o.LJ(this.startNowsRecordTime, nowsShootActivityArg.startNowsRecordTime) && this.isNewPage == nowsShootActivityArg.isNewPage && o.LJ(this.previousPage, nowsShootActivityArg.previousPage) && o.LJ(this.nowTabEnterMethod, nowsShootActivityArg.nowTabEnterMethod) && o.LJ(this.nowShootEnterScene, nowsShootActivityArg.nowShootEnterScene);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int LJ = C79062V1e.LJ(this.enterFrom, C79062V1e.LJ(this.enterMethod, this.shootWay.hashCode() * 31, 31), 31);
        boolean z = this.isBlueVUser;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        if (!this.shouldBackToCurPageAfterPublish) {
            i = 0;
        }
        int LJ2 = C79062V1e.LJ(this.nowCardType, (i3 + i) * 31, 31);
        String str = this.nowType;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (LJ2 + hashCode) * 31;
        String str2 = this.enterPosition;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str3 = this.fromAwemeId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int LJ3 = C79062V1e.LJ(this.authorId, C79062V1e.LJ(this.requestId, C79062V1e.LJ(this.shootPosition, C79062V1e.LJ(this.nowPostBy, (i6 + hashCode3) * 31, 31), 31), 31), 31);
        Long l = this.startNowsRecordTime;
        if (l == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l.hashCode();
        }
        int i7 = (((LJ3 + hashCode4) * 31) + this.isNewPage) * 31;
        String str4 = this.previousPage;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        String str5 = this.nowTabEnterMethod;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        String str6 = this.nowShootEnterScene;
        if (str6 != null) {
            i4 = str6.hashCode();
        }
        return i9 + i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NowsShootActivityArg(shootWay=");
        sb.append(this.shootWay);
        sb.append(", enterMethod=");
        sb.append(this.enterMethod);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", isBlueVUser=");
        sb.append(this.isBlueVUser);
        sb.append(", shouldBackToCurPageAfterPublish=");
        sb.append(this.shouldBackToCurPageAfterPublish);
        sb.append(", nowCardType=");
        sb.append(this.nowCardType);
        sb.append(", nowType=");
        sb.append(this.nowType);
        sb.append(", enterPosition=");
        sb.append(this.enterPosition);
        sb.append(", fromAwemeId=");
        sb.append(this.fromAwemeId);
        sb.append(", nowPostBy=");
        sb.append(this.nowPostBy);
        sb.append(", shootPosition=");
        sb.append(this.shootPosition);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", startNowsRecordTime=");
        sb.append(this.startNowsRecordTime);
        sb.append(", isNewPage=");
        sb.append(this.isNewPage);
        sb.append(", previousPage=");
        sb.append(this.previousPage);
        sb.append(", nowTabEnterMethod=");
        sb.append(this.nowTabEnterMethod);
        sb.append(", nowShootEnterScene=");
        return C07670Rv.LIZIZ(sb, this.nowShootEnterScene, ')');
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final String getFromAwemeId() {
        return this.fromAwemeId;
    }

    public final String getNowCardType() {
        return this.nowCardType;
    }

    public final String getNowPostBy() {
        return this.nowPostBy;
    }

    public final String getNowShootEnterScene() {
        return this.nowShootEnterScene;
    }

    public final String getNowTabEnterMethod() {
        return this.nowTabEnterMethod;
    }

    public final String getNowType() {
        return this.nowType;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getShootPosition() {
        return this.shootPosition;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final boolean getShouldBackToCurPageAfterPublish() {
        return this.shouldBackToCurPageAfterPublish;
    }

    public final Long getStartNowsRecordTime() {
        return this.startNowsRecordTime;
    }

    public final boolean isBlueVUser() {
        return this.isBlueVUser;
    }

    public final int isNewPage() {
        return this.isNewPage;
    }

    public final void setNewPage(int i) {
        this.isNewPage = i;
    }

    public final void setNowTabEnterMethod(String str) {
        this.nowTabEnterMethod = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setStartNowsRecordTime(Long l) {
        this.startNowsRecordTime = l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.shootWay);
        out.writeString(this.enterMethod);
        out.writeString(this.enterFrom);
        out.writeInt(this.isBlueVUser ? 1 : 0);
        out.writeInt(this.shouldBackToCurPageAfterPublish ? 1 : 0);
        out.writeString(this.nowCardType);
        out.writeString(this.nowType);
        out.writeString(this.enterPosition);
        out.writeString(this.fromAwemeId);
        out.writeString(this.nowPostBy);
        out.writeString(this.shootPosition);
        out.writeString(this.requestId);
        out.writeString(this.authorId);
        Long l = this.startNowsRecordTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeInt(this.isNewPage);
        out.writeString(this.previousPage);
        out.writeString(this.nowTabEnterMethod);
        out.writeString(this.nowShootEnterScene);
    }

    public NowsShootActivityArg(String shootWay, String enterMethod, String enterFrom, boolean z, boolean z2, String nowCardType, String str, String str2, String str3, String nowPostBy, String shootPosition, String requestId, String authorId, Long l, int i, String str4, String str5, String str6) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(nowCardType, "nowCardType");
        o.LJIIIZ(nowPostBy, "nowPostBy");
        o.LJIIIZ(shootPosition, "shootPosition");
        o.LJIIIZ(requestId, "requestId");
        o.LJIIIZ(authorId, "authorId");
        this.shootWay = shootWay;
        this.enterMethod = enterMethod;
        this.enterFrom = enterFrom;
        this.isBlueVUser = z;
        this.shouldBackToCurPageAfterPublish = z2;
        this.nowCardType = nowCardType;
        this.nowType = str;
        this.enterPosition = str2;
        this.fromAwemeId = str3;
        this.nowPostBy = nowPostBy;
        this.shootPosition = shootPosition;
        this.requestId = requestId;
        this.authorId = authorId;
        this.startNowsRecordTime = l;
        this.isNewPage = i;
        this.previousPage = str4;
        this.nowTabEnterMethod = str5;
        this.nowShootEnterScene = str6;
    }

    public /* synthetic */ NowsShootActivityArg(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, int i, String str12, String str13, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "now" : str, (i2 & 2) != 0 ? "click_regular_push" : str2, (i2 & 4) != 0 ? "push" : str3, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? "friends" : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : l, (i2 & 16384) != 0 ? 0 : i, (32768 & i2) != 0 ? "" : str12, (65536 & i2) != 0 ? "" : str13, (i2 & 131072) == 0 ? str14 : "");
    }
}
