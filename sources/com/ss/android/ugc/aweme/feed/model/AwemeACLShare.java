package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AwemeACLShare implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("download_general")
    public ACLCommonShare downloadGeneral;

    @InterfaceC65349Pkn("download_mask_panel")
    public ACLCommonShare downloadMaskPanel;

    @InterfaceC65349Pkn("download_share_panel")
    public ACLCommonShare downloadSharePanel;

    @InterfaceC65349Pkn("platform_list")
    public List<ACLCommonShare> platformList;

    @InterfaceC65349Pkn("share_general")
    public ACLCommonShare shareGeneral;

    @InterfaceC65349Pkn("share_list_status")
    public int shareListStatus;

    @InterfaceC65349Pkn("share_third_platform")
    public ACLCommonShare shareThirdPlatform;

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final ACLCommonShare getDownloadGeneral() {
        return this.downloadGeneral;
    }

    public final ACLCommonShare getDownloadMaskPanel() {
        return this.downloadMaskPanel;
    }

    public final ACLCommonShare getDownloadSharePanel() {
        return this.downloadSharePanel;
    }

    public final List<ACLCommonShare> getPlatformList() {
        return this.platformList;
    }

    public final ACLCommonShare getShareGeneral() {
        return this.shareGeneral;
    }

    public final int getShareListStat() {
        return this.shareListStatus;
    }

    public final int getShareListStatus() {
        return this.shareListStatus;
    }

    public final ACLCommonShare getShareThirdPlatform() {
        return this.shareThirdPlatform;
    }

    public final void setDownloadGeneral(ACLCommonShare aCLCommonShare) {
        this.downloadGeneral = aCLCommonShare;
    }

    public final void setDownloadMaskPanel(ACLCommonShare aCLCommonShare) {
        this.downloadMaskPanel = aCLCommonShare;
    }

    public final void setDownloadSharePanel(ACLCommonShare aCLCommonShare) {
        this.downloadSharePanel = aCLCommonShare;
    }

    public final void setPlatformList(List<ACLCommonShare> list) {
        this.platformList = list;
    }

    public final void setShareGeneral(ACLCommonShare aCLCommonShare) {
        this.shareGeneral = aCLCommonShare;
    }

    public final void setShareListStatus(int i) {
        this.shareListStatus = i;
    }

    public final void setShareThirdPlatform(ACLCommonShare aCLCommonShare) {
        this.shareThirdPlatform = aCLCommonShare;
    }
}
