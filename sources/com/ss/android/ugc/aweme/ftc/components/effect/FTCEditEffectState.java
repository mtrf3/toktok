package com.ss.android.ugc.aweme.ftc.components.effect;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C1539362j;
import X.C81667W3j;
import X.X1D;
import com.bytedance.ui_component.UiState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditEffectState extends UiState {
    public final C145425nG refreshCoverEvent;
    public final C145425nG regenerateReverseVideo;
    public final C145425nG removeTimeEffect;
    public final Integer setVideoLength;
    public final AbstractC81666W3i ui;
    public final C1539362j updateEffectTime;

    public FTCEditEffectState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ FTCEditEffectState copy$default(FTCEditEffectState fTCEditEffectState, AbstractC81666W3i abstractC81666W3i, Integer num, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C1539362j c1539362j, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = fTCEditEffectState.getUi();
        }
        if ((i & 2) != 0) {
            num = fTCEditEffectState.setVideoLength;
        }
        if ((i & 4) != 0) {
            c145425nG = fTCEditEffectState.regenerateReverseVideo;
        }
        if ((i & 8) != 0) {
            c145425nG2 = fTCEditEffectState.removeTimeEffect;
        }
        if ((i & 16) != 0) {
            c145425nG3 = fTCEditEffectState.refreshCoverEvent;
        }
        if ((i & 32) != 0) {
            c1539362j = fTCEditEffectState.updateEffectTime;
        }
        return fTCEditEffectState.copy(abstractC81666W3i, num, c145425nG, c145425nG2, c145425nG3, c1539362j);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final FTCEditEffectState copy(AbstractC81666W3i ui, Integer num, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C1539362j c1539362j) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditEffectState(ui, num, c145425nG, c145425nG2, c145425nG3, c1539362j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditEffectState)) {
            return false;
        }
        FTCEditEffectState fTCEditEffectState = (FTCEditEffectState) obj;
        return o.LJ(getUi(), fTCEditEffectState.getUi()) && o.LJ(this.setVideoLength, fTCEditEffectState.setVideoLength) && o.LJ(this.regenerateReverseVideo, fTCEditEffectState.regenerateReverseVideo) && o.LJ(this.removeTimeEffect, fTCEditEffectState.removeTimeEffect) && o.LJ(this.refreshCoverEvent, fTCEditEffectState.refreshCoverEvent) && o.LJ(this.updateEffectTime, fTCEditEffectState.updateEffectTime);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        Integer num = this.setVideoLength;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        C145425nG c145425nG = this.regenerateReverseVideo;
        int hashCode3 = (hashCode2 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        C145425nG c145425nG2 = this.removeTimeEffect;
        int hashCode4 = (hashCode3 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C145425nG c145425nG3 = this.refreshCoverEvent;
        int hashCode5 = (hashCode4 + (c145425nG3 == null ? 0 : c145425nG3.hashCode())) * 31;
        C1539362j c1539362j = this.updateEffectTime;
        return hashCode5 + (c1539362j != null ? c1539362j.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCEditEffectState(ui=");
        LIZ.append(getUi());
        LIZ.append(", setVideoLength=");
        LIZ.append(this.setVideoLength);
        LIZ.append(", regenerateReverseVideo=");
        LIZ.append(this.regenerateReverseVideo);
        LIZ.append(", removeTimeEffect=");
        LIZ.append(this.removeTimeEffect);
        LIZ.append(", refreshCoverEvent=");
        LIZ.append(this.refreshCoverEvent);
        LIZ.append(", updateEffectTime=");
        LIZ.append(this.updateEffectTime);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C145425nG getRefreshCoverEvent() {
        return this.refreshCoverEvent;
    }

    public final C145425nG getRegenerateReverseVideo() {
        return this.regenerateReverseVideo;
    }

    public final C145425nG getRemoveTimeEffect() {
        return this.removeTimeEffect;
    }

    public final Integer getSetVideoLength() {
        return this.setVideoLength;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final C1539362j getUpdateEffectTime() {
        return this.updateEffectTime;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditEffectState(AbstractC81666W3i ui, Integer num, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C1539362j c1539362j) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.setVideoLength = num;
        this.regenerateReverseVideo = c145425nG;
        this.removeTimeEffect = c145425nG2;
        this.refreshCoverEvent = c145425nG3;
        this.updateEffectTime = c1539362j;
    }

    public /* synthetic */ FTCEditEffectState(AbstractC81666W3i abstractC81666W3i, Integer num, C145425nG c145425nG, C145425nG c145425nG2, C145425nG c145425nG3, C1539362j c1539362j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : c145425nG, (i & 8) != 0 ? null : c145425nG2, (i & 16) != 0 ? null : c145425nG3, (i & 32) == 0 ? c1539362j : null);
    }
}
