package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PhotoModeConfig extends F9E {

    @InterfaceC65349Pkn("edit_screen_multi_image_style")
    public final PhotoUiType editScreenUiStyle;

    @InterfaceC65349Pkn("feed_multi_image_present_style")
    public final PhotoUiType feedUiStyle;

    @InterfaceC65349Pkn("image_format_consumption_enabled")
    public final boolean isConsumptionEnabled;

    @InterfaceC65349Pkn("upload_image_format_enabled")
    public final boolean isUploadEnabled;

    @InterfaceC65349Pkn("should_keep_auto_playing_after_user_swipes")
    public final boolean shouldKeepAutoPlayingAfterUserSwipes;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PhotoModeConfig() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r1
            r4 = r2
            r5 = r1
            r7 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.PhotoModeConfig.<init>():void");
    }

    public static /* synthetic */ PhotoModeConfig copy$default(PhotoModeConfig photoModeConfig, boolean z, PhotoUiType photoUiType, boolean z2, PhotoUiType photoUiType2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = photoModeConfig.isUploadEnabled;
        }
        if ((i & 2) != 0) {
            photoUiType = photoModeConfig.editScreenUiStyle;
        }
        if ((i & 4) != 0) {
            z2 = photoModeConfig.isConsumptionEnabled;
        }
        if ((i & 8) != 0) {
            photoUiType2 = photoModeConfig.feedUiStyle;
        }
        if ((i & 16) != 0) {
            z3 = photoModeConfig.shouldKeepAutoPlayingAfterUserSwipes;
        }
        return photoModeConfig.copy(z, photoUiType, z2, photoUiType2, z3);
    }

    public final PhotoModeConfig copy(boolean z, PhotoUiType editScreenUiStyle, boolean z2, PhotoUiType feedUiStyle, boolean z3) {
        o.LJIIIZ(editScreenUiStyle, "editScreenUiStyle");
        o.LJIIIZ(feedUiStyle, "feedUiStyle");
        return new PhotoModeConfig(z, editScreenUiStyle, z2, feedUiStyle, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isUploadEnabled), this.editScreenUiStyle, Boolean.valueOf(this.isConsumptionEnabled), this.feedUiStyle, Boolean.valueOf(this.shouldKeepAutoPlayingAfterUserSwipes)};
    }

    public final PhotoUiType getEditScreenUiStyle() {
        return this.editScreenUiStyle;
    }

    public final PhotoUiType getFeedUiStyle() {
        return this.feedUiStyle;
    }

    public final boolean getShouldKeepAutoPlayingAfterUserSwipes() {
        return this.shouldKeepAutoPlayingAfterUserSwipes;
    }

    public final boolean isConsumptionEnabled() {
        return this.isConsumptionEnabled;
    }

    public final boolean isUploadEnabled() {
        return this.isUploadEnabled;
    }

    public PhotoModeConfig(boolean z, PhotoUiType editScreenUiStyle, boolean z2, PhotoUiType feedUiStyle, boolean z3) {
        o.LJIIIZ(editScreenUiStyle, "editScreenUiStyle");
        o.LJIIIZ(feedUiStyle, "feedUiStyle");
        this.isUploadEnabled = z;
        this.editScreenUiStyle = editScreenUiStyle;
        this.isConsumptionEnabled = z2;
        this.feedUiStyle = feedUiStyle;
        this.shouldKeepAutoPlayingAfterUserSwipes = z3;
    }

    public /* synthetic */ PhotoModeConfig(boolean z, PhotoUiType photoUiType, boolean z2, PhotoUiType photoUiType2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? PhotoUiType.NO_SWIPE_OR_PINCH : photoUiType, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? PhotoUiType.NO_SWIPE_OR_PINCH : photoUiType2, (i & 16) != 0 ? false : z3);
    }
}
