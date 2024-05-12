package com.ss.android.ugc.aweme.image.progressbar;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C150545vW;
import X.C81668W3k;
import X.OSZ;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ImagesProgressState extends UiState {
    public final C150545vW pause;
    public final OSZ<Integer, Float> progress;
    public final C145425nG resume;
    public final AbstractC81666W3i ui;
    public final C150545vW viewState;

    public ImagesProgressState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImagesProgressState copy$default(ImagesProgressState imagesProgressState, AbstractC81666W3i abstractC81666W3i, OSZ osz, C150545vW c150545vW, C145425nG c145425nG, C150545vW c150545vW2, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = imagesProgressState.getUi();
        }
        if ((i & 2) != 0) {
            osz = imagesProgressState.progress;
        }
        if ((i & 4) != 0) {
            c150545vW = imagesProgressState.pause;
        }
        if ((i & 8) != 0) {
            c145425nG = imagesProgressState.resume;
        }
        if ((i & 16) != 0) {
            c150545vW2 = imagesProgressState.viewState;
        }
        return imagesProgressState.copy(abstractC81666W3i, osz, c150545vW, c145425nG, c150545vW2);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final ImagesProgressState copy(AbstractC81666W3i ui, OSZ<Integer, Float> osz, C150545vW c150545vW, C145425nG c145425nG, C150545vW c150545vW2) {
        o.LJIIIZ(ui, "ui");
        return new ImagesProgressState(ui, osz, c150545vW, c145425nG, c150545vW2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesProgressState)) {
            return false;
        }
        ImagesProgressState imagesProgressState = (ImagesProgressState) obj;
        return o.LJ(getUi(), imagesProgressState.getUi()) && o.LJ(this.progress, imagesProgressState.progress) && o.LJ(this.pause, imagesProgressState.pause) && o.LJ(this.resume, imagesProgressState.resume) && o.LJ(this.viewState, imagesProgressState.viewState);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        OSZ<Integer, Float> osz = this.progress;
        int hashCode2 = (hashCode + (osz == null ? 0 : osz.hashCode())) * 31;
        C150545vW c150545vW = this.pause;
        int hashCode3 = (hashCode2 + (c150545vW == null ? 0 : c150545vW.hashCode())) * 31;
        C145425nG c145425nG = this.resume;
        int hashCode4 = (hashCode3 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        C150545vW c150545vW2 = this.viewState;
        return hashCode4 + (c150545vW2 != null ? c150545vW2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImagesProgressState(ui=");
        LIZ.append(getUi());
        LIZ.append(", progress=");
        LIZ.append(this.progress);
        LIZ.append(", pause=");
        LIZ.append(this.pause);
        LIZ.append(", resume=");
        LIZ.append(this.resume);
        LIZ.append(", viewState=");
        LIZ.append(this.viewState);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C150545vW getPause() {
        return this.pause;
    }

    public final OSZ<Integer, Float> getProgress() {
        return this.progress;
    }

    public final C145425nG getResume() {
        return this.resume;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final C150545vW getViewState() {
        return this.viewState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesProgressState(AbstractC81666W3i ui, OSZ<Integer, Float> osz, C150545vW c150545vW, C145425nG c145425nG, C150545vW c150545vW2) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.progress = osz;
        this.pause = c150545vW;
        this.resume = c145425nG;
        this.viewState = c150545vW2;
    }

    public /* synthetic */ ImagesProgressState(AbstractC81666W3i abstractC81666W3i, OSZ osz, C150545vW c150545vW, C145425nG c145425nG, C150545vW c150545vW2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81668W3k() : abstractC81666W3i, (i & 2) != 0 ? null : osz, (i & 4) != 0 ? null : c150545vW, (i & 8) != 0 ? null : c145425nG, (i & 16) == 0 ? c150545vW2 : null);
    }
}
