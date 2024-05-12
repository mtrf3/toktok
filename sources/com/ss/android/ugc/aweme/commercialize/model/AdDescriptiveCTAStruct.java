package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AdDescriptiveCTAStruct implements Serializable {

    @InterfaceC65349Pkn("bottom_container_info")
    public final AdBottomContainerInfoStruct bottomContainer;

    @InterfaceC65349Pkn("default_bottom_container_info")
    public final AdDefaultContainerInfoStruct defaultContainer;

    @InterfaceC65349Pkn("fold_button_info")
    public final AdFoldButtonInfoStruct foldButton;

    @InterfaceC65349Pkn("gecko_channel_list")
    public final List<String> geckoChannelList;

    @InterfaceC65349Pkn("hide_music_disc")
    public final boolean hideMusicDisc;

    @InterfaceC65349Pkn("left_container_info")
    public final AdTopContainerInfoStruct leftContainer;

    /* JADX WARN: Multi-variable type inference failed */
    public AdDescriptiveCTAStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 63, 0 == true ? 1 : 0);
    }

    public final AdBottomContainerInfoStruct getBottomContainer() {
        return this.bottomContainer;
    }

    public final AdDefaultContainerInfoStruct getDefaultContainer() {
        return this.defaultContainer;
    }

    public final AdFoldButtonInfoStruct getFoldButton() {
        return this.foldButton;
    }

    public final List<String> getGeckoChannelList() {
        return this.geckoChannelList;
    }

    public final boolean getHideMusicDisc() {
        return this.hideMusicDisc;
    }

    public final AdTopContainerInfoStruct getLeftContainer() {
        return this.leftContainer;
    }

    public AdDescriptiveCTAStruct(List<String> list, AdTopContainerInfoStruct adTopContainerInfoStruct, AdBottomContainerInfoStruct adBottomContainerInfoStruct, AdDefaultContainerInfoStruct adDefaultContainerInfoStruct, AdFoldButtonInfoStruct adFoldButtonInfoStruct, boolean z) {
        this.geckoChannelList = list;
        this.leftContainer = adTopContainerInfoStruct;
        this.bottomContainer = adBottomContainerInfoStruct;
        this.defaultContainer = adDefaultContainerInfoStruct;
        this.foldButton = adFoldButtonInfoStruct;
        this.hideMusicDisc = z;
    }

    public /* synthetic */ AdDescriptiveCTAStruct(List list, AdTopContainerInfoStruct adTopContainerInfoStruct, AdBottomContainerInfoStruct adBottomContainerInfoStruct, AdDefaultContainerInfoStruct adDefaultContainerInfoStruct, AdFoldButtonInfoStruct adFoldButtonInfoStruct, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : adTopContainerInfoStruct, (i & 4) != 0 ? null : adBottomContainerInfoStruct, (i & 8) != 0 ? null : adDefaultContainerInfoStruct, (i & 16) == 0 ? adFoldButtonInfoStruct : null, (i & 32) != 0 ? false : z);
    }
}
