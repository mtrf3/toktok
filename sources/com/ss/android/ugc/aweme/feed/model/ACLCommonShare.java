package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ACLCommonShare implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("code")
    public int code;

    @InterfaceC65349Pkn("mute")
    public boolean mute;

    @InterfaceC65349Pkn("show_type")
    public int showType = 2;

    @InterfaceC65349Pkn("toast_msg")
    public String toastMsg = "";

    @InterfaceC65349Pkn("extra")
    public String extra = "";

    @InterfaceC65349Pkn("transcode")
    public int transcode = 3;

    @InterfaceC65349Pkn("popup_msg")
    public String popupMsg = "";

    @InterfaceC65349Pkn("platform_id")
    public String platformId = "";
    public AclType awemeAclType = AclType.SHARE_GENERAL;

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final AclType getAwemeAclType() {
        return this.awemeAclType;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final String getPlatformId() {
        return this.platformId;
    }

    public final String getPopupMsg() {
        return this.popupMsg;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final String getToastMsg() {
        return this.toastMsg;
    }

    public final int getTranscode() {
        return this.transcode;
    }

    public final void setAwemeAclType(AclType aclType) {
        o.LJIIIZ(aclType, "<set-?>");
        this.awemeAclType = aclType;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setMute(boolean z) {
        this.mute = z;
    }

    public final void setPlatformId(String str) {
        this.platformId = str;
    }

    public final void setPopupMsg(String str) {
        this.popupMsg = str;
    }

    public final void setShowType(int i) {
        this.showType = i;
    }

    public final void setToastMsg(String str) {
        this.toastMsg = str;
    }

    public final void setTranscode(int i) {
        this.transcode = i;
    }
}
