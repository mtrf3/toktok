package com.ss.android.ugc.aweme.ftc.components.volume;

import X.AbstractC81666W3i;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FTCEditVolumeState extends UiState {
    public final String musicTitle;
    public final Integer musicVolume;
    public final AbstractC81666W3i ui;
    public final String voiceTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public FTCEditVolumeState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FTCEditVolumeState copy$default(FTCEditVolumeState fTCEditVolumeState, String str, String str2, Integer num, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fTCEditVolumeState.musicTitle;
        }
        if ((i & 2) != 0) {
            str2 = fTCEditVolumeState.voiceTitle;
        }
        if ((i & 4) != 0) {
            num = fTCEditVolumeState.musicVolume;
        }
        if ((i & 8) != 0) {
            abstractC81666W3i = fTCEditVolumeState.getUi();
        }
        return fTCEditVolumeState.copy(str, str2, num, abstractC81666W3i);
    }

    public final AbstractC81666W3i component4() {
        return getUi();
    }

    public final FTCEditVolumeState copy(String str, String str2, Integer num, AbstractC81666W3i ui) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditVolumeState(str, str2, num, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditVolumeState)) {
            return false;
        }
        FTCEditVolumeState fTCEditVolumeState = (FTCEditVolumeState) obj;
        return o.LJ(this.musicTitle, fTCEditVolumeState.musicTitle) && o.LJ(this.voiceTitle, fTCEditVolumeState.voiceTitle) && o.LJ(this.musicVolume, fTCEditVolumeState.musicVolume) && o.LJ(getUi(), fTCEditVolumeState.getUi());
    }

    public int hashCode() {
        String str = this.musicTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voiceTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.musicVolume;
        return getUi().hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditVolumeState(musicTitle=");
        LIZ.append(this.musicTitle);
        LIZ.append(", voiceTitle=");
        LIZ.append(this.voiceTitle);
        LIZ.append(", musicVolume=");
        LIZ.append(this.musicVolume);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getMusicTitle() {
        return this.musicTitle;
    }

    public final Integer getMusicVolume() {
        return this.musicVolume;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final String getVoiceTitle() {
        return this.voiceTitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditVolumeState(String str, String str2, Integer num, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.musicTitle = str;
        this.voiceTitle = str2;
        this.musicVolume = num;
        this.ui = ui;
    }

    public /* synthetic */ FTCEditVolumeState(String str, String str2, Integer num, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
