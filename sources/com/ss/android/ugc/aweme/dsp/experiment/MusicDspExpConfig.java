package com.ss.android.ugc.aweme.dsp.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class MusicDspExpConfig extends F9E {

    @InterfaceC65349Pkn("dsp_enable_background_play")
    public final boolean dspEnableBgPlay;

    @InterfaceC65349Pkn("dsp_enable_feed_card")
    public final boolean dspEnableFeedCard;

    @InterfaceC65349Pkn("dsp_entrance")
    public final int dspEntrance;

    @InterfaceC65349Pkn("dsp_ugc_entrance")
    public final int dspUgcEntrance;

    @InterfaceC65349Pkn("dsp_ui_style")
    public final int dspUiStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicDspExpConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    public static /* synthetic */ MusicDspExpConfig copy$default(MusicDspExpConfig musicDspExpConfig, int i, int i2, boolean z, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = musicDspExpConfig.dspEntrance;
        }
        if ((i4 & 2) != 0) {
            i2 = musicDspExpConfig.dspUiStyle;
        }
        if ((i4 & 4) != 0) {
            z = musicDspExpConfig.dspEnableBgPlay;
        }
        if ((i4 & 8) != 0) {
            z2 = musicDspExpConfig.dspEnableFeedCard;
        }
        if ((i4 & 16) != 0) {
            i3 = musicDspExpConfig.dspUgcEntrance;
        }
        return musicDspExpConfig.copy(i, i2, z, z2, i3);
    }

    public final MusicDspExpConfig copy(int i, int i2, boolean z, boolean z2, int i3) {
        return new MusicDspExpConfig(i, i2, z, z2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.dspEntrance), Integer.valueOf(this.dspUiStyle), Boolean.valueOf(this.dspEnableBgPlay), Boolean.valueOf(this.dspEnableFeedCard), Integer.valueOf(this.dspUgcEntrance)};
    }

    public final boolean getDspEnableBgPlay() {
        return this.dspEnableBgPlay;
    }

    public final boolean getDspEnableFeedCard() {
        return this.dspEnableFeedCard;
    }

    public final int getDspEntrance() {
        return this.dspEntrance;
    }

    public final int getDspUgcEntrance() {
        return this.dspUgcEntrance;
    }

    public final int getDspUiStyle() {
        return this.dspUiStyle;
    }

    public MusicDspExpConfig(int i, int i2, boolean z, boolean z2, int i3) {
        this.dspEntrance = i;
        this.dspUiStyle = i2;
        this.dspEnableBgPlay = z;
        this.dspEnableFeedCard = z2;
        this.dspUgcEntrance = i3;
    }

    public /* synthetic */ MusicDspExpConfig(int i, int i2, boolean z, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? false : z, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? 0 : i3);
    }
}
