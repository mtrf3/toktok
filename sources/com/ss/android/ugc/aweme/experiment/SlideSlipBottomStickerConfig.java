package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class SlideSlipBottomStickerConfig extends F9E {

    @InterfaceC65349Pkn("shoot_same_auto_open")
    public final boolean autoOpen;

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("move_record_button_down")
    public final boolean moveRecordButtonDown;

    @InterfaceC65349Pkn("multi_sticker_optimize")
    public final boolean multiStickerOptimize;

    @InterfaceC65349Pkn("optimize_forbid_icon")
    public final boolean optimizeForbidIcon;

    @InterfaceC65349Pkn("optimize_shoot")
    public final boolean optimizeShoot;

    @InterfaceC65349Pkn("scroll_hide_tools")
    public final boolean scrollHideTools;

    @InterfaceC65349Pkn("show_more_text")
    public final boolean showMoreText;

    @InterfaceC65349Pkn("show_sticker_name")
    public final boolean showStickerName;

    @InterfaceC65349Pkn("support_cancel")
    public final boolean supportCancel;

    @InterfaceC65349Pkn("support_explore_icon")
    public final boolean supportExploreIcon;

    @InterfaceC65349Pkn("support_hold_effect_onExit")
    public final boolean supportHoldEffectOnExit;

    @InterfaceC65349Pkn("support_swipe_gesture")
    public final boolean supportLeftRightGesture;

    @InterfaceC65349Pkn("support_load_more")
    public final boolean supportLoadMore;

    @InterfaceC65349Pkn("support_prefetch_effects")
    public final boolean supportPrefetchEffects;

    @InterfaceC65349Pkn("support_show_fav_list")
    public final boolean supportShowFavouriteList;

    @InterfaceC65349Pkn("support_tap_open_photoMode")
    public final int supportTapOpenPhotoMode;

    @InterfaceC65349Pkn("support_up_gesture")
    public final boolean supportUpGesture;

    @InterfaceC65349Pkn("support_upslide_open_effect_panel")
    public final boolean supportUpslideOpenPanel;

    @InterfaceC65349Pkn("support_tap_open")
    public final boolean tapOpen;

    /* JADX WARN: Multi-variable type inference failed */
    public SlideSlipBottomStickerConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1048575, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.supportUpGesture), Boolean.valueOf(this.showStickerName), Boolean.valueOf(this.showMoreText), Boolean.valueOf(this.supportCancel), Boolean.valueOf(this.supportLoadMore), Boolean.valueOf(this.supportExploreIcon), Boolean.valueOf(this.scrollHideTools), Integer.valueOf(this.count), Boolean.valueOf(this.autoOpen), Boolean.valueOf(this.tapOpen), Boolean.valueOf(this.optimizeShoot), Boolean.valueOf(this.multiStickerOptimize), Boolean.valueOf(this.supportShowFavouriteList), Boolean.valueOf(this.supportUpslideOpenPanel), Boolean.valueOf(this.optimizeForbidIcon), Boolean.valueOf(this.supportLeftRightGesture), Boolean.valueOf(this.moveRecordButtonDown), Boolean.valueOf(this.supportPrefetchEffects), Integer.valueOf(this.supportTapOpenPhotoMode), Boolean.valueOf(this.supportHoldEffectOnExit)};
    }

    public SlideSlipBottomStickerConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i2, boolean z18) {
        this.supportUpGesture = z;
        this.showStickerName = z2;
        this.showMoreText = z3;
        this.supportCancel = z4;
        this.supportLoadMore = z5;
        this.supportExploreIcon = z6;
        this.scrollHideTools = z7;
        this.count = i;
        this.autoOpen = z8;
        this.tapOpen = z9;
        this.optimizeShoot = z10;
        this.multiStickerOptimize = z11;
        this.supportShowFavouriteList = z12;
        this.supportUpslideOpenPanel = z13;
        this.optimizeForbidIcon = z14;
        this.supportLeftRightGesture = z15;
        this.moveRecordButtonDown = z16;
        this.supportPrefetchEffects = z17;
        this.supportTapOpenPhotoMode = i2;
        this.supportHoldEffectOnExit = z18;
    }

    public /* synthetic */ SlideSlipBottomStickerConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i2, boolean z18, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? true : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? false : z6, (i3 & 64) != 0 ? false : z7, (i3 & 128) != 0 ? 50 : i, (i3 & 256) != 0 ? false : z8, (i3 & 512) != 0 ? false : z9, (i3 & 1024) != 0 ? false : z10, (i3 & 2048) == 0 ? z11 : true, (i3 & 4096) != 0 ? false : z12, (i3 & FileUtils.BUFFER_SIZE) != 0 ? false : z13, (i3 & 16384) != 0 ? false : z14, (32768 & i3) != 0 ? false : z15, (65536 & i3) != 0 ? false : z16, (131072 & i3) != 0 ? false : z17, (262144 & i3) != 0 ? 0 : i2, (i3 & 524288) != 0 ? false : z18);
    }
}
