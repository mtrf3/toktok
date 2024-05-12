package com.ss.android.ugc.aweme.creative.model;

import X.C43669HBx;
import X.HC2;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NowsExtra implements Parcelable {

    @InterfaceC65349Pkn("countDownStart")
    public int countDownStart;

    @InterfaceC65349Pkn("dualType")
    public String dualType;

    @InterfaceC65349Pkn("enterFrom")
    public String enterFrom;

    @InterfaceC65349Pkn("isBlueVUser")
    public boolean isBlueVUser;

    @InterfaceC65349Pkn("isDualCamera")
    public boolean isDualCamera;

    @InterfaceC65349Pkn("is_new_page")
    public int isNewPage;

    @InterfaceC65349Pkn("is_now_publish")
    public boolean isNowPublish;

    @InterfaceC65349Pkn("nowBlurShootPosition")
    public String nowBlurShootPosition;

    @InterfaceC65349Pkn("nowCardType")
    public String nowCardType;

    @InterfaceC65349Pkn("nowPostBy")
    public String nowPostBy;

    @InterfaceC65349Pkn("now_tab_enter_method")
    public String nowTabEnterMethod;

    @InterfaceC65349Pkn("nowType")
    public String nowType;

    @InterfaceC65349Pkn("previous_page")
    public String previousPage;

    @InterfaceC65349Pkn("recordTimeLag")
    public int recordTimeLag;

    @InterfaceC65349Pkn("retakeNum")
    public int retakeNum;

    @InterfaceC65349Pkn("shootEnterPosition")
    public String shootEnterPosition;

    @InterfaceC65349Pkn("shootEnterScene")
    public String shootEnterScene;

    @InterfaceC65349Pkn("shootOrder")
    public String shootOrder;

    @InterfaceC65349Pkn("nowShootWay")
    public String shootWay;

    @InterfaceC65349Pkn("tabName")
    public String tabName;

    @InterfaceC65349Pkn("zoomStatus")
    public String zoomStatus;
    public static final HC2 Companion = new HC2();
    public static final Parcelable.Creator<NowsExtra> CREATOR = new C43669HBx();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowsExtra() {
        /*
            r24 = this;
            r1 = 0
            r4 = 0
            r22 = 2097151(0x1fffff, float:2.938734E-39)
            r0 = r24
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r4
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r4
            r19 = r1
            r20 = r1
            r21 = r4
            r23 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.NowsExtra.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.shootOrder);
        out.writeString(this.dualType);
        out.writeString(this.zoomStatus);
        out.writeInt(this.countDownStart);
        out.writeInt(this.recordTimeLag);
        out.writeInt(this.retakeNum);
        out.writeInt(this.isBlueVUser ? 1 : 0);
        out.writeString(this.nowCardType);
        out.writeString(this.nowType);
        out.writeString(this.nowPostBy);
        out.writeString(this.nowBlurShootPosition);
        out.writeString(this.shootEnterPosition);
        out.writeInt(this.isDualCamera ? 1 : 0);
        out.writeString(this.tabName);
        out.writeString(this.enterFrom);
        out.writeString(this.shootWay);
        out.writeString(this.shootEnterScene);
        out.writeInt(this.isNewPage);
        out.writeString(this.previousPage);
        out.writeString(this.nowTabEnterMethod);
        out.writeInt(this.isNowPublish ? 1 : 0);
    }

    public NowsExtra(String shootOrder, String dualType, String zoomStatus, int i, int i2, int i3, boolean z, String nowCardType, String str, String nowPostBy, String nowBlurShootPosition, String str2, boolean z2, String tabName, String str3, String str4, String str5, int i4, String str6, String str7, boolean z3) {
        o.LJIIIZ(shootOrder, "shootOrder");
        o.LJIIIZ(dualType, "dualType");
        o.LJIIIZ(zoomStatus, "zoomStatus");
        o.LJIIIZ(nowCardType, "nowCardType");
        o.LJIIIZ(nowPostBy, "nowPostBy");
        o.LJIIIZ(nowBlurShootPosition, "nowBlurShootPosition");
        o.LJIIIZ(tabName, "tabName");
        this.shootOrder = shootOrder;
        this.dualType = dualType;
        this.zoomStatus = zoomStatus;
        this.countDownStart = i;
        this.recordTimeLag = i2;
        this.retakeNum = i3;
        this.isBlueVUser = z;
        this.nowCardType = nowCardType;
        this.nowType = str;
        this.nowPostBy = nowPostBy;
        this.nowBlurShootPosition = nowBlurShootPosition;
        this.shootEnterPosition = str2;
        this.isDualCamera = z2;
        this.tabName = tabName;
        this.enterFrom = str3;
        this.shootWay = str4;
        this.shootEnterScene = str5;
        this.isNewPage = i4;
        this.previousPage = str6;
        this.nowTabEnterMethod = str7;
        this.isNowPublish = z3;
    }

    public /* synthetic */ NowsExtra(String str, String str2, String str3, int i, int i2, int i3, boolean z, String str4, String str5, String str6, String str7, String str8, boolean z2, String str9, String str10, String str11, String str12, int i4, String str13, String str14, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "back_first" : str, (i5 & 2) != 0 ? "both_photo" : str2, (i5 & 4) != 0 ? "1" : str3, (i5 & 8) != 0 ? 180 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? false : z, (i5 & 128) != 0 ? "" : str4, (i5 & 256) != 0 ? null : str5, (i5 & 512) != 0 ? "" : str6, (i5 & 1024) != 0 ? "" : str7, (i5 & 2048) == 0 ? str8 : "", (i5 & 4096) != 0 ? true : z2, (i5 & FileUtils.BUFFER_SIZE) != 0 ? "now" : str9, (i5 & 16384) != 0 ? "now_shoot_page" : str10, (32768 & i5) != 0 ? null : str11, (65536 & i5) != 0 ? null : str12, (131072 & i5) != 0 ? 0 : i4, (262144 & i5) != 0 ? null : str13, (524288 & i5) != 0 ? null : str14, (i5 & 1048576) != 0 ? false : z3);
    }
}
