package com.ss.android.ugc.aweme.ftc.components.sticker.text;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C150575vZ;
import X.C1539362j;
import X.C45927I0t;
import X.C67P;
import X.C76800UCe;
import X.C81667W3j;
import X.InterfaceC1542963t;
import X.InterfaceC1543363x;
import X.InterfaceC1552467k;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditTextStickerViewState extends UiState {
    public final C150575vZ<TextStickerData, Boolean> addSticker;
    public final C45927I0t<InterfaceC88471Ynr<C67P, C67P, C76800UCe>> changeToTopListener;
    public final C145425nG dismissHitText;
    public final boolean inTimeEditView;
    public final C145425nG reloadStickerEvent;
    public final C145425nG removeAllStickerEvent;
    public final C145425nG resetGuideViewVisibilityEvent;
    public final C45927I0t<C67P> showInputView;
    public final C45927I0t<C67P> sticker2Top;
    public final C45927I0t<OSZ<Integer, Integer>> targetCanvasSize;
    public final C45927I0t<InterfaceC1552467k> textStickerEditListener;
    public final C45927I0t<InterfaceC1542963t> textStickerListener;
    public final C45927I0t<InterfaceC1543363x> textStickerMob;
    public final C45927I0t<InterfaceC88472Yns<C67P, C76800UCe>> timeClickListener;
    public final AbstractC81666W3i ui;
    public final C145425nG updateLayoutSizeEvent;
    public final C1539362j updateStickerTime;

    public FTCEditTextStickerViewState() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ FTCEditTextStickerViewState copy$default(FTCEditTextStickerViewState fTCEditTextStickerViewState, AbstractC81666W3i abstractC81666W3i, boolean z, C45927I0t c45927I0t, C145425nG c145425nG, C150575vZ c150575vZ, C145425nG c145425nG2, C45927I0t c45927I0t2, C45927I0t c45927I0t3, C45927I0t c45927I0t4, C45927I0t c45927I0t5, C45927I0t c45927I0t6, C45927I0t c45927I0t7, C45927I0t c45927I0t8, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5, C1539362j c1539362j, int i, Object obj) {
        AbstractC81666W3i abstractC81666W3i2 = abstractC81666W3i;
        boolean z2 = z;
        C145425nG c145425nG6 = c145425nG2;
        C150575vZ c150575vZ2 = c150575vZ;
        C45927I0t c45927I0t9 = c45927I0t;
        C145425nG c145425nG7 = c145425nG;
        C45927I0t c45927I0t10 = c45927I0t5;
        C45927I0t c45927I0t11 = c45927I0t4;
        C45927I0t c45927I0t12 = c45927I0t2;
        C45927I0t c45927I0t13 = c45927I0t3;
        C45927I0t c45927I0t14 = c45927I0t8;
        C45927I0t c45927I0t15 = c45927I0t6;
        C145425nG c145425nG8 = c145425nG3;
        C45927I0t c45927I0t16 = c45927I0t7;
        C1539362j c1539362j2 = c1539362j;
        C145425nG c145425nG9 = c145425nG4;
        C145425nG c145425nG10 = c145425nG5;
        if ((i & 1) != 0) {
            abstractC81666W3i2 = fTCEditTextStickerViewState.getUi();
        }
        if ((i & 2) != 0) {
            z2 = fTCEditTextStickerViewState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            c45927I0t9 = fTCEditTextStickerViewState.sticker2Top;
        }
        if ((i & 8) != 0) {
            c145425nG7 = fTCEditTextStickerViewState.dismissHitText;
        }
        if ((i & 16) != 0) {
            c150575vZ2 = fTCEditTextStickerViewState.addSticker;
        }
        if ((i & 32) != 0) {
            c145425nG6 = fTCEditTextStickerViewState.reloadStickerEvent;
        }
        if ((i & 64) != 0) {
            c45927I0t12 = fTCEditTextStickerViewState.textStickerListener;
        }
        if ((i & 128) != 0) {
            c45927I0t13 = fTCEditTextStickerViewState.changeToTopListener;
        }
        if ((i & 256) != 0) {
            c45927I0t11 = fTCEditTextStickerViewState.textStickerEditListener;
        }
        if ((i & 512) != 0) {
            c45927I0t10 = fTCEditTextStickerViewState.timeClickListener;
        }
        if ((i & 1024) != 0) {
            c45927I0t15 = fTCEditTextStickerViewState.textStickerMob;
        }
        if ((i & 2048) != 0) {
            c45927I0t16 = fTCEditTextStickerViewState.targetCanvasSize;
        }
        if ((i & 4096) != 0) {
            c45927I0t14 = fTCEditTextStickerViewState.showInputView;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c145425nG8 = fTCEditTextStickerViewState.removeAllStickerEvent;
        }
        if ((i & 16384) != 0) {
            c145425nG9 = fTCEditTextStickerViewState.updateLayoutSizeEvent;
        }
        if ((32768 & i) != 0) {
            c145425nG10 = fTCEditTextStickerViewState.resetGuideViewVisibilityEvent;
        }
        if ((i & 65536) != 0) {
            c1539362j2 = fTCEditTextStickerViewState.updateStickerTime;
        }
        C145425nG c145425nG11 = c145425nG7;
        return fTCEditTextStickerViewState.copy(abstractC81666W3i2, z2, c45927I0t9, c145425nG11, c150575vZ2, c145425nG6, c45927I0t12, c45927I0t13, c45927I0t11, c45927I0t10, c45927I0t15, c45927I0t16, c45927I0t14, c145425nG8, c145425nG9, c145425nG10, c1539362j2);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final FTCEditTextStickerViewState copy(AbstractC81666W3i ui, boolean z, C45927I0t<? extends C67P> c45927I0t, C145425nG c145425nG, C150575vZ<TextStickerData, Boolean> c150575vZ, C145425nG c145425nG2, C45927I0t<? extends InterfaceC1542963t> c45927I0t2, C45927I0t<? extends InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe>> c45927I0t3, C45927I0t<? extends InterfaceC1552467k> c45927I0t4, C45927I0t<? extends InterfaceC88472Yns<? super C67P, C76800UCe>> c45927I0t5, C45927I0t<? extends InterfaceC1543363x> c45927I0t6, C45927I0t<OSZ<Integer, Integer>> c45927I0t7, C45927I0t<? extends C67P> c45927I0t8, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5, C1539362j c1539362j) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditTextStickerViewState(ui, z, c45927I0t, c145425nG, c150575vZ, c145425nG2, c45927I0t2, c45927I0t3, c45927I0t4, c45927I0t5, c45927I0t6, c45927I0t7, c45927I0t8, c145425nG3, c145425nG4, c145425nG5, c1539362j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditTextStickerViewState)) {
            return false;
        }
        FTCEditTextStickerViewState fTCEditTextStickerViewState = (FTCEditTextStickerViewState) obj;
        return o.LJ(getUi(), fTCEditTextStickerViewState.getUi()) && this.inTimeEditView == fTCEditTextStickerViewState.inTimeEditView && o.LJ(this.sticker2Top, fTCEditTextStickerViewState.sticker2Top) && o.LJ(this.dismissHitText, fTCEditTextStickerViewState.dismissHitText) && o.LJ(this.addSticker, fTCEditTextStickerViewState.addSticker) && o.LJ(this.reloadStickerEvent, fTCEditTextStickerViewState.reloadStickerEvent) && o.LJ(this.textStickerListener, fTCEditTextStickerViewState.textStickerListener) && o.LJ(this.changeToTopListener, fTCEditTextStickerViewState.changeToTopListener) && o.LJ(this.textStickerEditListener, fTCEditTextStickerViewState.textStickerEditListener) && o.LJ(this.timeClickListener, fTCEditTextStickerViewState.timeClickListener) && o.LJ(this.textStickerMob, fTCEditTextStickerViewState.textStickerMob) && o.LJ(this.targetCanvasSize, fTCEditTextStickerViewState.targetCanvasSize) && o.LJ(this.showInputView, fTCEditTextStickerViewState.showInputView) && o.LJ(this.removeAllStickerEvent, fTCEditTextStickerViewState.removeAllStickerEvent) && o.LJ(this.updateLayoutSizeEvent, fTCEditTextStickerViewState.updateLayoutSizeEvent) && o.LJ(this.resetGuideViewVisibilityEvent, fTCEditTextStickerViewState.resetGuideViewVisibilityEvent) && o.LJ(this.updateStickerTime, fTCEditTextStickerViewState.updateStickerTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        boolean z = this.inTimeEditView;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C45927I0t<C67P> c45927I0t = this.sticker2Top;
        int hashCode2 = (i2 + (c45927I0t == null ? 0 : c45927I0t.hashCode())) * 31;
        C145425nG c145425nG = this.dismissHitText;
        int hashCode3 = (hashCode2 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        C150575vZ<TextStickerData, Boolean> c150575vZ = this.addSticker;
        int hashCode4 = (hashCode3 + (c150575vZ == null ? 0 : c150575vZ.hashCode())) * 31;
        C145425nG c145425nG2 = this.reloadStickerEvent;
        int hashCode5 = (hashCode4 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C45927I0t<InterfaceC1542963t> c45927I0t2 = this.textStickerListener;
        int hashCode6 = (hashCode5 + (c45927I0t2 == null ? 0 : c45927I0t2.hashCode())) * 31;
        C45927I0t<InterfaceC88471Ynr<C67P, C67P, C76800UCe>> c45927I0t3 = this.changeToTopListener;
        int hashCode7 = (hashCode6 + (c45927I0t3 == null ? 0 : c45927I0t3.hashCode())) * 31;
        C45927I0t<InterfaceC1552467k> c45927I0t4 = this.textStickerEditListener;
        int hashCode8 = (hashCode7 + (c45927I0t4 == null ? 0 : c45927I0t4.hashCode())) * 31;
        C45927I0t<InterfaceC88472Yns<C67P, C76800UCe>> c45927I0t5 = this.timeClickListener;
        int hashCode9 = (hashCode8 + (c45927I0t5 == null ? 0 : c45927I0t5.hashCode())) * 31;
        C45927I0t<InterfaceC1543363x> c45927I0t6 = this.textStickerMob;
        int hashCode10 = (hashCode9 + (c45927I0t6 == null ? 0 : c45927I0t6.hashCode())) * 31;
        C45927I0t<OSZ<Integer, Integer>> c45927I0t7 = this.targetCanvasSize;
        int hashCode11 = (hashCode10 + (c45927I0t7 == null ? 0 : c45927I0t7.hashCode())) * 31;
        C45927I0t<C67P> c45927I0t8 = this.showInputView;
        int hashCode12 = (hashCode11 + (c45927I0t8 == null ? 0 : c45927I0t8.hashCode())) * 31;
        C145425nG c145425nG3 = this.removeAllStickerEvent;
        int hashCode13 = (hashCode12 + (c145425nG3 == null ? 0 : c145425nG3.hashCode())) * 31;
        C145425nG c145425nG4 = this.updateLayoutSizeEvent;
        int hashCode14 = (hashCode13 + (c145425nG4 == null ? 0 : c145425nG4.hashCode())) * 31;
        C145425nG c145425nG5 = this.resetGuideViewVisibilityEvent;
        int hashCode15 = (hashCode14 + (c145425nG5 == null ? 0 : c145425nG5.hashCode())) * 31;
        C1539362j c1539362j = this.updateStickerTime;
        return hashCode15 + (c1539362j != null ? c1539362j.hashCode() : 0);
    }

    public String toString() {
        return "FTCEditTextStickerViewState(ui=" + getUi() + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", reloadStickerEvent=" + this.reloadStickerEvent + ", textStickerListener=" + this.textStickerListener + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", textStickerMob=" + this.textStickerMob + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ", updateStickerTime=" + this.updateStickerTime + ')';
    }

    public final C150575vZ<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final C45927I0t<InterfaceC88471Ynr<C67P, C67P, C76800UCe>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final C145425nG getDismissHitText() {
        return this.dismissHitText;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C145425nG getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final C145425nG getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final C145425nG getResetGuideViewVisibilityEvent() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final C45927I0t<C67P> getShowInputView() {
        return this.showInputView;
    }

    public final C45927I0t<C67P> getSticker2Top() {
        return this.sticker2Top;
    }

    public final C45927I0t<OSZ<Integer, Integer>> getTargetCanvasSize() {
        return this.targetCanvasSize;
    }

    public final C45927I0t<InterfaceC1552467k> getTextStickerEditListener() {
        return this.textStickerEditListener;
    }

    public final C45927I0t<InterfaceC1542963t> getTextStickerListener() {
        return this.textStickerListener;
    }

    public final C45927I0t<InterfaceC1543363x> getTextStickerMob() {
        return this.textStickerMob;
    }

    public final C45927I0t<InterfaceC88472Yns<C67P, C76800UCe>> getTimeClickListener() {
        return this.timeClickListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final C145425nG getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    public final C1539362j getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FTCEditTextStickerViewState(AbstractC81666W3i ui, boolean z, C45927I0t<? extends C67P> c45927I0t, C145425nG c145425nG, C150575vZ<TextStickerData, Boolean> c150575vZ, C145425nG c145425nG2, C45927I0t<? extends InterfaceC1542963t> c45927I0t2, C45927I0t<? extends InterfaceC88471Ynr<? super C67P, ? super C67P, C76800UCe>> c45927I0t3, C45927I0t<? extends InterfaceC1552467k> c45927I0t4, C45927I0t<? extends InterfaceC88472Yns<? super C67P, C76800UCe>> c45927I0t5, C45927I0t<? extends InterfaceC1543363x> c45927I0t6, C45927I0t<OSZ<Integer, Integer>> c45927I0t7, C45927I0t<? extends C67P> c45927I0t8, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5, C1539362j c1539362j) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.inTimeEditView = z;
        this.sticker2Top = c45927I0t;
        this.dismissHitText = c145425nG;
        this.addSticker = c150575vZ;
        this.reloadStickerEvent = c145425nG2;
        this.textStickerListener = c45927I0t2;
        this.changeToTopListener = c45927I0t3;
        this.textStickerEditListener = c45927I0t4;
        this.timeClickListener = c45927I0t5;
        this.textStickerMob = c45927I0t6;
        this.targetCanvasSize = c45927I0t7;
        this.showInputView = c45927I0t8;
        this.removeAllStickerEvent = c145425nG3;
        this.updateLayoutSizeEvent = c145425nG4;
        this.resetGuideViewVisibilityEvent = c145425nG5;
        this.updateStickerTime = c1539362j;
    }

    public /* synthetic */ FTCEditTextStickerViewState(AbstractC81666W3i abstractC81666W3i, boolean z, C45927I0t c45927I0t, C145425nG c145425nG, C150575vZ c150575vZ, C145425nG c145425nG2, C45927I0t c45927I0t2, C45927I0t c45927I0t3, C45927I0t c45927I0t4, C45927I0t c45927I0t5, C45927I0t c45927I0t6, C45927I0t c45927I0t7, C45927I0t c45927I0t8, C145425nG c145425nG3, C145425nG c145425nG4, C145425nG c145425nG5, C1539362j c1539362j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : c45927I0t, (i & 8) != 0 ? null : c145425nG, (i & 16) != 0 ? null : c150575vZ, (i & 32) != 0 ? null : c145425nG2, (i & 64) != 0 ? null : c45927I0t2, (i & 128) != 0 ? null : c45927I0t3, (i & 256) != 0 ? null : c45927I0t4, (i & 512) != 0 ? null : c45927I0t5, (i & 1024) != 0 ? null : c45927I0t6, (i & 2048) != 0 ? null : c45927I0t7, (i & 4096) != 0 ? null : c45927I0t8, (i & FileUtils.BUFFER_SIZE) != 0 ? null : c145425nG3, (i & 16384) != 0 ? null : c145425nG4, (32768 & i) != 0 ? null : c145425nG5, (i & 65536) != 0 ? null : c1539362j);
    }
}
