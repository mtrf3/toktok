package com.ss.android.ugc.aweme.ftc.components.audiorecord;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditAudioRecordState extends UiState {
    public final C145425nG clearAudioData;
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public FTCEditAudioRecordState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FTCEditAudioRecordState copy$default(FTCEditAudioRecordState fTCEditAudioRecordState, AbstractC81666W3i abstractC81666W3i, C145425nG c145425nG, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = fTCEditAudioRecordState.getUi();
        }
        if ((i & 2) != 0) {
            c145425nG = fTCEditAudioRecordState.clearAudioData;
        }
        return fTCEditAudioRecordState.copy(abstractC81666W3i, c145425nG);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final FTCEditAudioRecordState copy(AbstractC81666W3i ui, C145425nG c145425nG) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditAudioRecordState(ui, c145425nG);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditAudioRecordState)) {
            return false;
        }
        FTCEditAudioRecordState fTCEditAudioRecordState = (FTCEditAudioRecordState) obj;
        return o.LJ(getUi(), fTCEditAudioRecordState.getUi()) && o.LJ(this.clearAudioData, fTCEditAudioRecordState.clearAudioData);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        C145425nG c145425nG = this.clearAudioData;
        return hashCode + (c145425nG == null ? 0 : c145425nG.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditAudioRecordState(ui=");
        LIZ.append(getUi());
        LIZ.append(", clearAudioData=");
        LIZ.append(this.clearAudioData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C145425nG getClearAudioData() {
        return this.clearAudioData;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditAudioRecordState(AbstractC81666W3i ui, C145425nG c145425nG) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.clearAudioData = c145425nG;
    }

    public /* synthetic */ FTCEditAudioRecordState(AbstractC81666W3i abstractC81666W3i, C145425nG c145425nG, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i, (i & 2) != 0 ? null : c145425nG);
    }
}
