package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C150545vW;
import X.C150575vZ;
import X.C1539362j;
import X.C45927I0t;
import X.C76800UCe;
import X.C81667W3j;
import X.InterfaceC87207YKl;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.YKR;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditTextStickerViewState extends UiState {
    public final C45927I0t<C76800UCe> addGuidanceStickerIfNeed;
    public final C150575vZ<TextStickerData, Boolean> addSticker;
    public final C45927I0t<TextWatcher> addTextChangeListenerEvent;
    public final C45927I0t<String> addTextStickerViaString;
    public final C45927I0t<OSZ<TextStickerData, String>> afterChangeTextAutoRead;
    public final C145425nG cancelNewStickerRead;
    public final C150545vW changeTextEditPageReadIcon;
    public final C45927I0t<InterfaceC88471Ynr<YKR, YKR, C76800UCe>> changeToTopListener;
    public final C145425nG dismissHitText;
    public final C45927I0t<YKR> editTextSticker;
    public final C150545vW enableDirectEditEvent;
    public final C45927I0t<String> fakeTextDataAndRead;
    public final C150545vW forceHideReadItemEvent;
    public final C150545vW getNowStringGoToReadWithFake;
    public final C45927I0t<YKR> goReadTextStickerScene;
    public final C45927I0t<View.OnClickListener> guideListener;
    public final C150545vW guideViewVisibility;
    public final boolean inTimeEditView;
    public final C45927I0t<TextStickerData> mobClickTextReadingEvent;
    public final C150545vW muteReadText;
    public final C45927I0t<InterfaceC88472Yns<YKR, C76800UCe>> readTextClickListener;
    public final C145425nG registerTimeEditRefreshListener;
    public final C145425nG reloadStickerEvent;
    public final C145425nG removeAllStickerEvent;
    public final C145425nG removeAllTextSticker;
    public final C145425nG removeGuidanceText;
    public final C45927I0t<YKR> removeTextSticker;
    public final C145425nG resetGuideViewVisibilityEvent;
    public final C45927I0t<YKR> showInputView;
    public final C45927I0t<YKR> sticker2Top;
    public final C45927I0t<OSZ<Integer, Integer>> targetCanvasSize;
    public final C45927I0t<InterfaceC87207YKl> textStickerEditListener;
    public final C45927I0t<InterfaceC88472Yns<YKR, C76800UCe>> timeClickListener;
    public final AbstractC81666W3i ui;
    public final C145425nG unRegisterTimeEditRefreshListener;
    public final C145425nG updateLayoutSizeEvent;
    public final C1539362j updateStickerTime;
    public final C150545vW videoPlayState;

    /* JADX WARN: Multi-variable type inference failed */
    public EditTextStickerViewState() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EditTextStickerViewState copy$default(EditTextStickerViewState editTextStickerViewState, AbstractC81666W3i abstractC81666W3i, boolean z, C45927I0t c45927I0t, C145425nG c145425nG, C150575vZ c150575vZ, C45927I0t c45927I0t2, C145425nG c145425nG2, C45927I0t c45927I0t3, C45927I0t c45927I0t4, C45927I0t c45927I0t5, C45927I0t c45927I0t6, C45927I0t c45927I0t7, C45927I0t c45927I0t8, C45927I0t c45927I0t9, C45927I0t c45927I0t10, C145425nG c145425nG3, C145425nG c145425nG4, C150545vW c150545vW, C145425nG c145425nG5, C150545vW c150545vW2, C45927I0t c45927I0t11, C145425nG c145425nG6, C45927I0t c45927I0t12, C150545vW c150545vW3, C150545vW c150545vW4, C45927I0t c45927I0t13, C45927I0t c45927I0t14, C150545vW c150545vW5, C150545vW c150545vW6, C45927I0t c45927I0t15, C45927I0t c45927I0t16, C45927I0t c45927I0t17, C1539362j c1539362j, C145425nG c145425nG7, C145425nG c145425nG8, C145425nG c145425nG9, C145425nG c145425nG10, C150545vW c150545vW7, int i, int i2, Object obj) {
        AbstractC81666W3i abstractC81666W3i2 = abstractC81666W3i;
        C45927I0t c45927I0t18 = c45927I0t9;
        C45927I0t c45927I0t19 = c45927I0t8;
        C45927I0t c45927I0t20 = c45927I0t7;
        C45927I0t c45927I0t21 = c45927I0t6;
        C45927I0t c45927I0t22 = c45927I0t5;
        C45927I0t c45927I0t23 = c45927I0t4;
        C45927I0t c45927I0t24 = c45927I0t3;
        C45927I0t c45927I0t25 = c45927I0t;
        boolean z2 = z;
        C145425nG c145425nG11 = c145425nG;
        C150575vZ c150575vZ2 = c150575vZ;
        C45927I0t c45927I0t26 = c45927I0t2;
        C145425nG c145425nG12 = c145425nG2;
        C145425nG c145425nG13 = c145425nG9;
        C145425nG c145425nG14 = c145425nG8;
        C45927I0t c45927I0t27 = c45927I0t17;
        C1539362j c1539362j2 = c1539362j;
        C45927I0t c45927I0t28 = c45927I0t16;
        C150545vW c150545vW8 = c150545vW2;
        C145425nG c145425nG15 = c145425nG5;
        C150545vW c150545vW9 = c150545vW;
        C145425nG c145425nG16 = c145425nG10;
        C145425nG c145425nG17 = c145425nG4;
        C45927I0t c45927I0t29 = c45927I0t10;
        C145425nG c145425nG18 = c145425nG3;
        C45927I0t c45927I0t30 = c45927I0t11;
        C145425nG c145425nG19 = c145425nG6;
        C45927I0t c45927I0t31 = c45927I0t12;
        C145425nG c145425nG20 = c145425nG7;
        C150545vW c150545vW10 = c150545vW3;
        C150545vW c150545vW11 = c150545vW7;
        C150545vW c150545vW12 = c150545vW4;
        C45927I0t c45927I0t32 = c45927I0t13;
        C45927I0t c45927I0t33 = c45927I0t14;
        C150545vW c150545vW13 = c150545vW5;
        C150545vW c150545vW14 = c150545vW6;
        C45927I0t c45927I0t34 = c45927I0t15;
        if ((i & 1) != 0) {
            abstractC81666W3i2 = editTextStickerViewState.getUi();
        }
        if ((i & 2) != 0) {
            z2 = editTextStickerViewState.inTimeEditView;
        }
        if ((i & 4) != 0) {
            c45927I0t25 = editTextStickerViewState.sticker2Top;
        }
        if ((i & 8) != 0) {
            c145425nG11 = editTextStickerViewState.dismissHitText;
        }
        if ((i & 16) != 0) {
            c150575vZ2 = editTextStickerViewState.addSticker;
        }
        if ((i & 32) != 0) {
            c45927I0t26 = editTextStickerViewState.guideListener;
        }
        if ((i & 64) != 0) {
            c145425nG12 = editTextStickerViewState.reloadStickerEvent;
        }
        if ((i & 128) != 0) {
            c45927I0t24 = editTextStickerViewState.changeToTopListener;
        }
        if ((i & 256) != 0) {
            c45927I0t23 = editTextStickerViewState.textStickerEditListener;
        }
        if ((i & 512) != 0) {
            c45927I0t22 = editTextStickerViewState.timeClickListener;
        }
        if ((i & 1024) != 0) {
            c45927I0t21 = editTextStickerViewState.readTextClickListener;
        }
        if ((i & 2048) != 0) {
            c45927I0t20 = editTextStickerViewState.addGuidanceStickerIfNeed;
        }
        if ((i & 4096) != 0) {
            c45927I0t19 = editTextStickerViewState.targetCanvasSize;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c45927I0t18 = editTextStickerViewState.showInputView;
        }
        if ((i & 16384) != 0) {
            c45927I0t29 = editTextStickerViewState.editTextSticker;
        }
        if ((32768 & i) != 0) {
            c145425nG18 = editTextStickerViewState.removeAllStickerEvent;
        }
        if ((65536 & i) != 0) {
            c145425nG17 = editTextStickerViewState.updateLayoutSizeEvent;
        }
        if ((131072 & i) != 0) {
            c150545vW9 = editTextStickerViewState.guideViewVisibility;
        }
        if ((262144 & i) != 0) {
            c145425nG15 = editTextStickerViewState.resetGuideViewVisibilityEvent;
        }
        if ((524288 & i) != 0) {
            c150545vW8 = editTextStickerViewState.forceHideReadItemEvent;
        }
        if ((1048576 & i) != 0) {
            c45927I0t30 = editTextStickerViewState.goReadTextStickerScene;
        }
        if ((2097152 & i) != 0) {
            c145425nG19 = editTextStickerViewState.cancelNewStickerRead;
        }
        if ((4194304 & i) != 0) {
            c45927I0t31 = editTextStickerViewState.fakeTextDataAndRead;
        }
        if ((8388608 & i) != 0) {
            c150545vW10 = editTextStickerViewState.getNowStringGoToReadWithFake;
        }
        if ((16777216 & i) != 0) {
            c150545vW12 = editTextStickerViewState.changeTextEditPageReadIcon;
        }
        if ((33554432 & i) != 0) {
            c45927I0t32 = editTextStickerViewState.afterChangeTextAutoRead;
        }
        if ((67108864 & i) != 0) {
            c45927I0t33 = editTextStickerViewState.mobClickTextReadingEvent;
        }
        if ((134217728 & i) != 0) {
            c150545vW13 = editTextStickerViewState.muteReadText;
        }
        if ((268435456 & i) != 0) {
            c150545vW14 = editTextStickerViewState.enableDirectEditEvent;
        }
        if ((536870912 & i) != 0) {
            c45927I0t34 = editTextStickerViewState.addTextChangeListenerEvent;
        }
        if ((1073741824 & i) != 0) {
            c45927I0t28 = editTextStickerViewState.addTextStickerViaString;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            c45927I0t27 = editTextStickerViewState.removeTextSticker;
        }
        if ((i2 & 1) != 0) {
            c1539362j2 = editTextStickerViewState.updateStickerTime;
        }
        if ((i2 & 2) != 0) {
            c145425nG20 = editTextStickerViewState.removeGuidanceText;
        }
        if ((i2 & 4) != 0) {
            c145425nG14 = editTextStickerViewState.registerTimeEditRefreshListener;
        }
        if ((i2 & 8) != 0) {
            c145425nG13 = editTextStickerViewState.unRegisterTimeEditRefreshListener;
        }
        if ((i2 & 16) != 0) {
            c145425nG16 = editTextStickerViewState.removeAllTextSticker;
        }
        if ((i2 & 32) != 0) {
            c150545vW11 = editTextStickerViewState.videoPlayState;
        }
        C150545vW c150545vW15 = c150545vW11;
        return editTextStickerViewState.copy(abstractC81666W3i2, z2, c45927I0t25, c145425nG11, c150575vZ2, c45927I0t26, c145425nG12, c45927I0t24, c45927I0t23, c45927I0t22, c45927I0t21, c45927I0t20, c45927I0t19, c45927I0t18, c45927I0t29, c145425nG18, c145425nG17, c150545vW9, c145425nG15, c150545vW8, c45927I0t30, c145425nG19, c45927I0t31, c150545vW10, c150545vW12, c45927I0t32, c45927I0t33, c150545vW13, c150545vW14, c45927I0t34, c45927I0t28, c45927I0t27, c1539362j2, c145425nG20, c145425nG14, c145425nG13, c145425nG16, c150545vW15);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final EditTextStickerViewState copy(AbstractC81666W3i ui, boolean z, C45927I0t<? extends YKR> c45927I0t, C145425nG c145425nG, C150575vZ<TextStickerData, Boolean> c150575vZ, C45927I0t<? extends View.OnClickListener> c45927I0t2, C145425nG c145425nG2, C45927I0t<? extends InterfaceC88471Ynr<? super YKR, ? super YKR, C76800UCe>> c45927I0t3, C45927I0t<? extends InterfaceC87207YKl> c45927I0t4, C45927I0t<? extends InterfaceC88472Yns<? super YKR, C76800UCe>> c45927I0t5, C45927I0t<? extends InterfaceC88472Yns<? super YKR, C76800UCe>> c45927I0t6, C45927I0t<C76800UCe> c45927I0t7, C45927I0t<OSZ<Integer, Integer>> c45927I0t8, C45927I0t<? extends YKR> c45927I0t9, C45927I0t<? extends YKR> c45927I0t10, C145425nG c145425nG3, C145425nG c145425nG4, C150545vW c150545vW, C145425nG c145425nG5, C150545vW c150545vW2, C45927I0t<? extends YKR> c45927I0t11, C145425nG c145425nG6, C45927I0t<String> c45927I0t12, C150545vW c150545vW3, C150545vW c150545vW4, C45927I0t<OSZ<TextStickerData, String>> c45927I0t13, C45927I0t<TextStickerData> c45927I0t14, C150545vW muteReadText, C150545vW c150545vW5, C45927I0t<? extends TextWatcher> c45927I0t15, C45927I0t<String> c45927I0t16, C45927I0t<? extends YKR> c45927I0t17, C1539362j c1539362j, C145425nG c145425nG7, C145425nG c145425nG8, C145425nG c145425nG9, C145425nG c145425nG10, C150545vW c150545vW6) {
        o.LJIIIZ(ui, "ui");
        o.LJIIIZ(muteReadText, "muteReadText");
        return new EditTextStickerViewState(ui, z, c45927I0t, c145425nG, c150575vZ, c45927I0t2, c145425nG2, c45927I0t3, c45927I0t4, c45927I0t5, c45927I0t6, c45927I0t7, c45927I0t8, c45927I0t9, c45927I0t10, c145425nG3, c145425nG4, c150545vW, c145425nG5, c150545vW2, c45927I0t11, c145425nG6, c45927I0t12, c150545vW3, c150545vW4, c45927I0t13, c45927I0t14, muteReadText, c150545vW5, c45927I0t15, c45927I0t16, c45927I0t17, c1539362j, c145425nG7, c145425nG8, c145425nG9, c145425nG10, c150545vW6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTextStickerViewState)) {
            return false;
        }
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return o.LJ(getUi(), editTextStickerViewState.getUi()) && this.inTimeEditView == editTextStickerViewState.inTimeEditView && o.LJ(this.sticker2Top, editTextStickerViewState.sticker2Top) && o.LJ(this.dismissHitText, editTextStickerViewState.dismissHitText) && o.LJ(this.addSticker, editTextStickerViewState.addSticker) && o.LJ(this.guideListener, editTextStickerViewState.guideListener) && o.LJ(this.reloadStickerEvent, editTextStickerViewState.reloadStickerEvent) && o.LJ(this.changeToTopListener, editTextStickerViewState.changeToTopListener) && o.LJ(this.textStickerEditListener, editTextStickerViewState.textStickerEditListener) && o.LJ(this.timeClickListener, editTextStickerViewState.timeClickListener) && o.LJ(this.readTextClickListener, editTextStickerViewState.readTextClickListener) && o.LJ(this.addGuidanceStickerIfNeed, editTextStickerViewState.addGuidanceStickerIfNeed) && o.LJ(this.targetCanvasSize, editTextStickerViewState.targetCanvasSize) && o.LJ(this.showInputView, editTextStickerViewState.showInputView) && o.LJ(this.editTextSticker, editTextStickerViewState.editTextSticker) && o.LJ(this.removeAllStickerEvent, editTextStickerViewState.removeAllStickerEvent) && o.LJ(this.updateLayoutSizeEvent, editTextStickerViewState.updateLayoutSizeEvent) && o.LJ(this.guideViewVisibility, editTextStickerViewState.guideViewVisibility) && o.LJ(this.resetGuideViewVisibilityEvent, editTextStickerViewState.resetGuideViewVisibilityEvent) && o.LJ(this.forceHideReadItemEvent, editTextStickerViewState.forceHideReadItemEvent) && o.LJ(this.goReadTextStickerScene, editTextStickerViewState.goReadTextStickerScene) && o.LJ(this.cancelNewStickerRead, editTextStickerViewState.cancelNewStickerRead) && o.LJ(this.fakeTextDataAndRead, editTextStickerViewState.fakeTextDataAndRead) && o.LJ(this.getNowStringGoToReadWithFake, editTextStickerViewState.getNowStringGoToReadWithFake) && o.LJ(this.changeTextEditPageReadIcon, editTextStickerViewState.changeTextEditPageReadIcon) && o.LJ(this.afterChangeTextAutoRead, editTextStickerViewState.afterChangeTextAutoRead) && o.LJ(this.mobClickTextReadingEvent, editTextStickerViewState.mobClickTextReadingEvent) && o.LJ(this.muteReadText, editTextStickerViewState.muteReadText) && o.LJ(this.enableDirectEditEvent, editTextStickerViewState.enableDirectEditEvent) && o.LJ(this.addTextChangeListenerEvent, editTextStickerViewState.addTextChangeListenerEvent) && o.LJ(this.addTextStickerViaString, editTextStickerViewState.addTextStickerViaString) && o.LJ(this.removeTextSticker, editTextStickerViewState.removeTextSticker) && o.LJ(this.updateStickerTime, editTextStickerViewState.updateStickerTime) && o.LJ(this.removeGuidanceText, editTextStickerViewState.removeGuidanceText) && o.LJ(this.registerTimeEditRefreshListener, editTextStickerViewState.registerTimeEditRefreshListener) && o.LJ(this.unRegisterTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener) && o.LJ(this.removeAllTextSticker, editTextStickerViewState.removeAllTextSticker) && o.LJ(this.videoPlayState, editTextStickerViewState.videoPlayState);
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
        C45927I0t<YKR> c45927I0t = this.sticker2Top;
        int hashCode2 = (i2 + (c45927I0t == null ? 0 : c45927I0t.hashCode())) * 31;
        C145425nG c145425nG = this.dismissHitText;
        int hashCode3 = (hashCode2 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        C150575vZ<TextStickerData, Boolean> c150575vZ = this.addSticker;
        int hashCode4 = (hashCode3 + (c150575vZ == null ? 0 : c150575vZ.hashCode())) * 31;
        C45927I0t<View.OnClickListener> c45927I0t2 = this.guideListener;
        int hashCode5 = (hashCode4 + (c45927I0t2 == null ? 0 : c45927I0t2.hashCode())) * 31;
        C145425nG c145425nG2 = this.reloadStickerEvent;
        int hashCode6 = (hashCode5 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        C45927I0t<InterfaceC88471Ynr<YKR, YKR, C76800UCe>> c45927I0t3 = this.changeToTopListener;
        int hashCode7 = (hashCode6 + (c45927I0t3 == null ? 0 : c45927I0t3.hashCode())) * 31;
        C45927I0t<InterfaceC87207YKl> c45927I0t4 = this.textStickerEditListener;
        int hashCode8 = (hashCode7 + (c45927I0t4 == null ? 0 : c45927I0t4.hashCode())) * 31;
        C45927I0t<InterfaceC88472Yns<YKR, C76800UCe>> c45927I0t5 = this.timeClickListener;
        int hashCode9 = (hashCode8 + (c45927I0t5 == null ? 0 : c45927I0t5.hashCode())) * 31;
        C45927I0t<InterfaceC88472Yns<YKR, C76800UCe>> c45927I0t6 = this.readTextClickListener;
        int hashCode10 = (hashCode9 + (c45927I0t6 == null ? 0 : c45927I0t6.hashCode())) * 31;
        C45927I0t<C76800UCe> c45927I0t7 = this.addGuidanceStickerIfNeed;
        int hashCode11 = (hashCode10 + (c45927I0t7 == null ? 0 : c45927I0t7.hashCode())) * 31;
        C45927I0t<OSZ<Integer, Integer>> c45927I0t8 = this.targetCanvasSize;
        int hashCode12 = (hashCode11 + (c45927I0t8 == null ? 0 : c45927I0t8.hashCode())) * 31;
        C45927I0t<YKR> c45927I0t9 = this.showInputView;
        int hashCode13 = (hashCode12 + (c45927I0t9 == null ? 0 : c45927I0t9.hashCode())) * 31;
        C45927I0t<YKR> c45927I0t10 = this.editTextSticker;
        int hashCode14 = (hashCode13 + (c45927I0t10 == null ? 0 : c45927I0t10.hashCode())) * 31;
        C145425nG c145425nG3 = this.removeAllStickerEvent;
        int hashCode15 = (hashCode14 + (c145425nG3 == null ? 0 : c145425nG3.hashCode())) * 31;
        C145425nG c145425nG4 = this.updateLayoutSizeEvent;
        int hashCode16 = (hashCode15 + (c145425nG4 == null ? 0 : c145425nG4.hashCode())) * 31;
        C150545vW c150545vW = this.guideViewVisibility;
        int hashCode17 = (hashCode16 + (c150545vW == null ? 0 : c150545vW.hashCode())) * 31;
        C145425nG c145425nG5 = this.resetGuideViewVisibilityEvent;
        int hashCode18 = (hashCode17 + (c145425nG5 == null ? 0 : c145425nG5.hashCode())) * 31;
        C150545vW c150545vW2 = this.forceHideReadItemEvent;
        int hashCode19 = (hashCode18 + (c150545vW2 == null ? 0 : c150545vW2.hashCode())) * 31;
        C45927I0t<YKR> c45927I0t11 = this.goReadTextStickerScene;
        int hashCode20 = (hashCode19 + (c45927I0t11 == null ? 0 : c45927I0t11.hashCode())) * 31;
        C145425nG c145425nG6 = this.cancelNewStickerRead;
        int hashCode21 = (hashCode20 + (c145425nG6 == null ? 0 : c145425nG6.hashCode())) * 31;
        C45927I0t<String> c45927I0t12 = this.fakeTextDataAndRead;
        int hashCode22 = (hashCode21 + (c45927I0t12 == null ? 0 : c45927I0t12.hashCode())) * 31;
        C150545vW c150545vW3 = this.getNowStringGoToReadWithFake;
        int hashCode23 = (hashCode22 + (c150545vW3 == null ? 0 : c150545vW3.hashCode())) * 31;
        C150545vW c150545vW4 = this.changeTextEditPageReadIcon;
        int hashCode24 = (hashCode23 + (c150545vW4 == null ? 0 : c150545vW4.hashCode())) * 31;
        C45927I0t<OSZ<TextStickerData, String>> c45927I0t13 = this.afterChangeTextAutoRead;
        int hashCode25 = (hashCode24 + (c45927I0t13 == null ? 0 : c45927I0t13.hashCode())) * 31;
        C45927I0t<TextStickerData> c45927I0t14 = this.mobClickTextReadingEvent;
        int hashCode26 = (this.muteReadText.hashCode() + ((hashCode25 + (c45927I0t14 == null ? 0 : c45927I0t14.hashCode())) * 31)) * 31;
        C150545vW c150545vW5 = this.enableDirectEditEvent;
        int hashCode27 = (hashCode26 + (c150545vW5 == null ? 0 : c150545vW5.hashCode())) * 31;
        C45927I0t<TextWatcher> c45927I0t15 = this.addTextChangeListenerEvent;
        int hashCode28 = (hashCode27 + (c45927I0t15 == null ? 0 : c45927I0t15.hashCode())) * 31;
        C45927I0t<String> c45927I0t16 = this.addTextStickerViaString;
        int hashCode29 = (hashCode28 + (c45927I0t16 == null ? 0 : c45927I0t16.hashCode())) * 31;
        C45927I0t<YKR> c45927I0t17 = this.removeTextSticker;
        int hashCode30 = (hashCode29 + (c45927I0t17 == null ? 0 : c45927I0t17.hashCode())) * 31;
        C1539362j c1539362j = this.updateStickerTime;
        int hashCode31 = (hashCode30 + (c1539362j == null ? 0 : c1539362j.hashCode())) * 31;
        C145425nG c145425nG7 = this.removeGuidanceText;
        int hashCode32 = (hashCode31 + (c145425nG7 == null ? 0 : c145425nG7.hashCode())) * 31;
        C145425nG c145425nG8 = this.registerTimeEditRefreshListener;
        int hashCode33 = (hashCode32 + (c145425nG8 == null ? 0 : c145425nG8.hashCode())) * 31;
        C145425nG c145425nG9 = this.unRegisterTimeEditRefreshListener;
        int hashCode34 = (hashCode33 + (c145425nG9 == null ? 0 : c145425nG9.hashCode())) * 31;
        C145425nG c145425nG10 = this.removeAllTextSticker;
        int hashCode35 = (hashCode34 + (c145425nG10 == null ? 0 : c145425nG10.hashCode())) * 31;
        C150545vW c150545vW6 = this.videoPlayState;
        return hashCode35 + (c150545vW6 != null ? c150545vW6.hashCode() : 0);
    }

    public String toString() {
        return "EditTextStickerViewState(ui=" + getUi() + ", inTimeEditView=" + this.inTimeEditView + ", sticker2Top=" + this.sticker2Top + ", dismissHitText=" + this.dismissHitText + ", addSticker=" + this.addSticker + ", guideListener=" + this.guideListener + ", reloadStickerEvent=" + this.reloadStickerEvent + ", changeToTopListener=" + this.changeToTopListener + ", textStickerEditListener=" + this.textStickerEditListener + ", timeClickListener=" + this.timeClickListener + ", readTextClickListener=" + this.readTextClickListener + ", addGuidanceStickerIfNeed=" + this.addGuidanceStickerIfNeed + ", targetCanvasSize=" + this.targetCanvasSize + ", showInputView=" + this.showInputView + ", editTextSticker=" + this.editTextSticker + ", removeAllStickerEvent=" + this.removeAllStickerEvent + ", updateLayoutSizeEvent=" + this.updateLayoutSizeEvent + ", guideViewVisibility=" + this.guideViewVisibility + ", resetGuideViewVisibilityEvent=" + this.resetGuideViewVisibilityEvent + ", forceHideReadItemEvent=" + this.forceHideReadItemEvent + ", goReadTextStickerScene=" + this.goReadTextStickerScene + ", cancelNewStickerRead=" + this.cancelNewStickerRead + ", fakeTextDataAndRead=" + this.fakeTextDataAndRead + ", getNowStringGoToReadWithFake=" + this.getNowStringGoToReadWithFake + ", changeTextEditPageReadIcon=" + this.changeTextEditPageReadIcon + ", afterChangeTextAutoRead=" + this.afterChangeTextAutoRead + ", mobClickTextReadingEvent=" + this.mobClickTextReadingEvent + ", muteReadText=" + this.muteReadText + ", enableDirectEditEvent=" + this.enableDirectEditEvent + ", addTextChangeListenerEvent=" + this.addTextChangeListenerEvent + ", addTextStickerViaString=" + this.addTextStickerViaString + ", removeTextSticker=" + this.removeTextSticker + ", updateStickerTime=" + this.updateStickerTime + ", removeGuidanceText=" + this.removeGuidanceText + ", registerTimeEditRefreshListener=" + this.registerTimeEditRefreshListener + ", unRegisterTimeEditRefreshListener=" + this.unRegisterTimeEditRefreshListener + ", removeAllTextSticker=" + this.removeAllTextSticker + ", videoPlayState=" + this.videoPlayState + ')';
    }

    public final C45927I0t<C76800UCe> getAddGuidanceStickerIfNeed() {
        return this.addGuidanceStickerIfNeed;
    }

    public final C150575vZ<TextStickerData, Boolean> getAddSticker() {
        return this.addSticker;
    }

    public final C45927I0t<TextWatcher> getAddTextChangeListenerEvent() {
        return this.addTextChangeListenerEvent;
    }

    public final C45927I0t<String> getAddTextStickerViaString() {
        return this.addTextStickerViaString;
    }

    public final C45927I0t<OSZ<TextStickerData, String>> getAfterChangeTextAutoRead() {
        return this.afterChangeTextAutoRead;
    }

    public final C145425nG getCancelNewStickerRead() {
        return this.cancelNewStickerRead;
    }

    public final C150545vW getChangeTextEditPageReadIcon() {
        return this.changeTextEditPageReadIcon;
    }

    public final C45927I0t<InterfaceC88471Ynr<YKR, YKR, C76800UCe>> getChangeToTopListener() {
        return this.changeToTopListener;
    }

    public final C145425nG getDismissHitText() {
        return this.dismissHitText;
    }

    public final C45927I0t<YKR> getEditTextSticker() {
        return this.editTextSticker;
    }

    public final C150545vW getEnableDirectEditEvent() {
        return this.enableDirectEditEvent;
    }

    public final C45927I0t<String> getFakeTextDataAndRead() {
        return this.fakeTextDataAndRead;
    }

    public final C150545vW getForceHideReadItemEvent() {
        return this.forceHideReadItemEvent;
    }

    public final C150545vW getGetNowStringGoToReadWithFake() {
        return this.getNowStringGoToReadWithFake;
    }

    public final C45927I0t<YKR> getGoReadTextStickerScene() {
        return this.goReadTextStickerScene;
    }

    public final C45927I0t<View.OnClickListener> getGuideListener() {
        return this.guideListener;
    }

    public final C150545vW getGuideViewVisibility() {
        return this.guideViewVisibility;
    }

    public final boolean getInTimeEditView() {
        return this.inTimeEditView;
    }

    public final C45927I0t<TextStickerData> getMobClickTextReadingEvent() {
        return this.mobClickTextReadingEvent;
    }

    public final C150545vW getMuteReadText() {
        return this.muteReadText;
    }

    public final C45927I0t<InterfaceC88472Yns<YKR, C76800UCe>> getReadTextClickListener() {
        return this.readTextClickListener;
    }

    public final C145425nG getRegisterTimeEditRefreshListener() {
        return this.registerTimeEditRefreshListener;
    }

    public final C145425nG getReloadStickerEvent() {
        return this.reloadStickerEvent;
    }

    public final C145425nG getRemoveAllStickerEvent() {
        return this.removeAllStickerEvent;
    }

    public final C145425nG getRemoveAllTextSticker() {
        return this.removeAllTextSticker;
    }

    public final C145425nG getRemoveGuidanceText() {
        return this.removeGuidanceText;
    }

    public final C45927I0t<YKR> getRemoveTextSticker() {
        return this.removeTextSticker;
    }

    public final C145425nG getResetGuideViewVisibilityEvent() {
        return this.resetGuideViewVisibilityEvent;
    }

    public final C45927I0t<YKR> getShowInputView() {
        return this.showInputView;
    }

    public final C45927I0t<YKR> getSticker2Top() {
        return this.sticker2Top;
    }

    public final C45927I0t<OSZ<Integer, Integer>> getTargetCanvasSize() {
        return this.targetCanvasSize;
    }

    public final C45927I0t<InterfaceC87207YKl> getTextStickerEditListener() {
        return this.textStickerEditListener;
    }

    public final C45927I0t<InterfaceC88472Yns<YKR, C76800UCe>> getTimeClickListener() {
        return this.timeClickListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    public final C145425nG getUnRegisterTimeEditRefreshListener() {
        return this.unRegisterTimeEditRefreshListener;
    }

    public final C145425nG getUpdateLayoutSizeEvent() {
        return this.updateLayoutSizeEvent;
    }

    public final C1539362j getUpdateStickerTime() {
        return this.updateStickerTime;
    }

    public final C150545vW getVideoPlayState() {
        return this.videoPlayState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EditTextStickerViewState(AbstractC81666W3i ui, boolean z, C45927I0t<? extends YKR> c45927I0t, C145425nG c145425nG, C150575vZ<TextStickerData, Boolean> c150575vZ, C45927I0t<? extends View.OnClickListener> c45927I0t2, C145425nG c145425nG2, C45927I0t<? extends InterfaceC88471Ynr<? super YKR, ? super YKR, C76800UCe>> c45927I0t3, C45927I0t<? extends InterfaceC87207YKl> c45927I0t4, C45927I0t<? extends InterfaceC88472Yns<? super YKR, C76800UCe>> c45927I0t5, C45927I0t<? extends InterfaceC88472Yns<? super YKR, C76800UCe>> c45927I0t6, C45927I0t<C76800UCe> c45927I0t7, C45927I0t<OSZ<Integer, Integer>> c45927I0t8, C45927I0t<? extends YKR> c45927I0t9, C45927I0t<? extends YKR> c45927I0t10, C145425nG c145425nG3, C145425nG c145425nG4, C150545vW c150545vW, C145425nG c145425nG5, C150545vW c150545vW2, C45927I0t<? extends YKR> c45927I0t11, C145425nG c145425nG6, C45927I0t<String> c45927I0t12, C150545vW c150545vW3, C150545vW c150545vW4, C45927I0t<OSZ<TextStickerData, String>> c45927I0t13, C45927I0t<TextStickerData> c45927I0t14, C150545vW muteReadText, C150545vW c150545vW5, C45927I0t<? extends TextWatcher> c45927I0t15, C45927I0t<String> c45927I0t16, C45927I0t<? extends YKR> c45927I0t17, C1539362j c1539362j, C145425nG c145425nG7, C145425nG c145425nG8, C145425nG c145425nG9, C145425nG c145425nG10, C150545vW c150545vW6) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        o.LJIIIZ(muteReadText, "muteReadText");
        this.ui = ui;
        this.inTimeEditView = z;
        this.sticker2Top = c45927I0t;
        this.dismissHitText = c145425nG;
        this.addSticker = c150575vZ;
        this.guideListener = c45927I0t2;
        this.reloadStickerEvent = c145425nG2;
        this.changeToTopListener = c45927I0t3;
        this.textStickerEditListener = c45927I0t4;
        this.timeClickListener = c45927I0t5;
        this.readTextClickListener = c45927I0t6;
        this.addGuidanceStickerIfNeed = c45927I0t7;
        this.targetCanvasSize = c45927I0t8;
        this.showInputView = c45927I0t9;
        this.editTextSticker = c45927I0t10;
        this.removeAllStickerEvent = c145425nG3;
        this.updateLayoutSizeEvent = c145425nG4;
        this.guideViewVisibility = c150545vW;
        this.resetGuideViewVisibilityEvent = c145425nG5;
        this.forceHideReadItemEvent = c150545vW2;
        this.goReadTextStickerScene = c45927I0t11;
        this.cancelNewStickerRead = c145425nG6;
        this.fakeTextDataAndRead = c45927I0t12;
        this.getNowStringGoToReadWithFake = c150545vW3;
        this.changeTextEditPageReadIcon = c150545vW4;
        this.afterChangeTextAutoRead = c45927I0t13;
        this.mobClickTextReadingEvent = c45927I0t14;
        this.muteReadText = muteReadText;
        this.enableDirectEditEvent = c150545vW5;
        this.addTextChangeListenerEvent = c45927I0t15;
        this.addTextStickerViaString = c45927I0t16;
        this.removeTextSticker = c45927I0t17;
        this.updateStickerTime = c1539362j;
        this.removeGuidanceText = c145425nG7;
        this.registerTimeEditRefreshListener = c145425nG8;
        this.unRegisterTimeEditRefreshListener = c145425nG9;
        this.removeAllTextSticker = c145425nG10;
        this.videoPlayState = c150545vW6;
    }

    public /* synthetic */ EditTextStickerViewState(AbstractC81666W3i abstractC81666W3i, boolean z, C45927I0t c45927I0t, C145425nG c145425nG, C150575vZ c150575vZ, C45927I0t c45927I0t2, C145425nG c145425nG2, C45927I0t c45927I0t3, C45927I0t c45927I0t4, C45927I0t c45927I0t5, C45927I0t c45927I0t6, C45927I0t c45927I0t7, C45927I0t c45927I0t8, C45927I0t c45927I0t9, C45927I0t c45927I0t10, C145425nG c145425nG3, C145425nG c145425nG4, C150545vW c150545vW, C145425nG c145425nG5, C150545vW c150545vW2, C45927I0t c45927I0t11, C145425nG c145425nG6, C45927I0t c45927I0t12, C150545vW c150545vW3, C150545vW c150545vW4, C45927I0t c45927I0t13, C45927I0t c45927I0t14, C150545vW c150545vW5, C150545vW c150545vW6, C45927I0t c45927I0t15, C45927I0t c45927I0t16, C45927I0t c45927I0t17, C1539362j c1539362j, C145425nG c145425nG7, C145425nG c145425nG8, C145425nG c145425nG9, C145425nG c145425nG10, C150545vW c150545vW7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C81667W3j() : abstractC81666W3i, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : c45927I0t, (i & 8) != 0 ? null : c145425nG, (i & 16) != 0 ? null : c150575vZ, (i & 32) != 0 ? null : c45927I0t2, (i & 64) != 0 ? null : c145425nG2, (i & 128) != 0 ? null : c45927I0t3, (i & 256) != 0 ? null : c45927I0t4, (i & 512) != 0 ? null : c45927I0t5, (i & 1024) != 0 ? null : c45927I0t6, (i & 2048) != 0 ? null : c45927I0t7, (i & 4096) != 0 ? null : c45927I0t8, (i & FileUtils.BUFFER_SIZE) != 0 ? null : c45927I0t9, (i & 16384) != 0 ? null : c45927I0t10, (32768 & i) != 0 ? null : c145425nG3, (65536 & i) != 0 ? null : c145425nG4, (131072 & i) != 0 ? null : c150545vW, (262144 & i) != 0 ? null : c145425nG5, (524288 & i) != 0 ? null : c150545vW2, (1048576 & i) != 0 ? null : c45927I0t11, (2097152 & i) != 0 ? null : c145425nG6, (4194304 & i) != 0 ? null : c45927I0t12, (8388608 & i) != 0 ? null : c150545vW3, (16777216 & i) != 0 ? null : c150545vW4, (33554432 & i) != 0 ? null : c45927I0t13, (67108864 & i) != 0 ? null : c45927I0t14, (134217728 & i) != 0 ? new C150545vW(false) : c150545vW5, (268435456 & i) != 0 ? null : c150545vW6, (536870912 & i) != 0 ? null : c45927I0t15, (1073741824 & i) != 0 ? null : c45927I0t16, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : c45927I0t17, (i2 & 1) != 0 ? null : c1539362j, (i2 & 2) != 0 ? null : c145425nG7, (i2 & 4) != 0 ? null : c145425nG8, (i2 & 8) != 0 ? null : c145425nG9, (i2 & 16) != 0 ? null : c145425nG10, (i2 & 32) != 0 ? null : c150545vW7);
    }
}
