package com.ss.android.ugc.aweme.ftc.components.cutmusic;

import X.AbstractC81666W3i;
import X.C81667W3j;
import X.OSJ;
import X.X1D;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FTCEditMusicCutState extends UiState {
    public final OSJ<AVMusicWaveBean, Integer, Integer> musicWaveData;
    public final AbstractC81666W3i ui;
    public final Integer videoLength;

    public FTCEditMusicCutState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditMusicCutState copy$default(FTCEditMusicCutState fTCEditMusicCutState, OSJ osj, Integer num, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            osj = fTCEditMusicCutState.musicWaveData;
        }
        if ((i & 2) != 0) {
            num = fTCEditMusicCutState.videoLength;
        }
        if ((i & 4) != 0) {
            abstractC81666W3i = fTCEditMusicCutState.getUi();
        }
        return fTCEditMusicCutState.copy(osj, num, abstractC81666W3i);
    }

    public final AbstractC81666W3i component3() {
        return getUi();
    }

    public final FTCEditMusicCutState copy(OSJ<AVMusicWaveBean, Integer, Integer> osj, Integer num, AbstractC81666W3i ui) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditMusicCutState(osj, num, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditMusicCutState)) {
            return false;
        }
        FTCEditMusicCutState fTCEditMusicCutState = (FTCEditMusicCutState) obj;
        return o.LJ(this.musicWaveData, fTCEditMusicCutState.musicWaveData) && o.LJ(this.videoLength, fTCEditMusicCutState.videoLength) && o.LJ(getUi(), fTCEditMusicCutState.getUi());
    }

    public int hashCode() {
        OSJ<AVMusicWaveBean, Integer, Integer> osj = this.musicWaveData;
        int hashCode = (osj == null ? 0 : osj.hashCode()) * 31;
        Integer num = this.videoLength;
        return getUi().hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditMusicCutState(musicWaveData=");
        LIZ.append(this.musicWaveData);
        LIZ.append(", videoLength=");
        LIZ.append(this.videoLength);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final OSJ<AVMusicWaveBean, Integer, Integer> getMusicWaveData() {
        return this.musicWaveData;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditMusicCutState(OSJ<AVMusicWaveBean, Integer, Integer> osj, Integer num, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.musicWaveData = osj;
        this.videoLength = num;
        this.ui = ui;
    }

    public /* synthetic */ FTCEditMusicCutState(OSJ osj, Integer num, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : osj, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
