package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditAudioEffectState extends UiState {
    public final C145425nG clearAudioEffect;
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public FTCEditAudioEffectState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FTCEditAudioEffectState copy$default(FTCEditAudioEffectState fTCEditAudioEffectState, C145425nG c145425nG, AbstractC81666W3i abstractC81666W3i, int i, Object obj) {
        if ((i & 1) != 0) {
            c145425nG = fTCEditAudioEffectState.clearAudioEffect;
        }
        if ((i & 2) != 0) {
            abstractC81666W3i = fTCEditAudioEffectState.getUi();
        }
        return fTCEditAudioEffectState.copy(c145425nG, abstractC81666W3i);
    }

    public final AbstractC81666W3i component2() {
        return getUi();
    }

    public final FTCEditAudioEffectState copy(C145425nG c145425nG, AbstractC81666W3i ui) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditAudioEffectState(c145425nG, ui);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditAudioEffectState)) {
            return false;
        }
        FTCEditAudioEffectState fTCEditAudioEffectState = (FTCEditAudioEffectState) obj;
        return o.LJ(this.clearAudioEffect, fTCEditAudioEffectState.clearAudioEffect) && o.LJ(getUi(), fTCEditAudioEffectState.getUi());
    }

    public int hashCode() {
        C145425nG c145425nG = this.clearAudioEffect;
        return getUi().hashCode() + ((c145425nG == null ? 0 : c145425nG.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditAudioEffectState(clearAudioEffect=");
        LIZ.append(this.clearAudioEffect);
        LIZ.append(", ui=");
        LIZ.append(getUi());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C145425nG getClearAudioEffect() {
        return this.clearAudioEffect;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditAudioEffectState(C145425nG c145425nG, AbstractC81666W3i ui) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.clearAudioEffect = c145425nG;
        this.ui = ui;
    }

    public /* synthetic */ FTCEditAudioEffectState(C145425nG c145425nG, AbstractC81666W3i abstractC81666W3i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c145425nG, (i & 2) != 0 ? new C81667W3j() : abstractC81666W3i);
    }
}
