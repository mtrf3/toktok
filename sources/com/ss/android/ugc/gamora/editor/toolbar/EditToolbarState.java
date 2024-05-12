package com.ss.android.ugc.gamora.editor.toolbar;

import X.AbstractC81666W3i;
import X.C08880Wm;
import X.C145425nG;
import X.C148455s9;
import X.C150575vZ;
import X.C1539362j;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ui_component.UiState;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditToolbarState extends UiState {
    public final boolean aiCaptionOn;
    public final C148455s9 autoEnhanceStatus;
    public final String backTipText;
    public final Boolean backTipVisible;
    public final Boolean backVisible;
    public final Integer bottomHeight;
    public final Drawable chooseMusicIcon;
    public final Integer chooseMusicIconRes;
    public final String chooseMusicText;
    public final Boolean enableAudioEnhance;
    public final C145425nG hideMoreEvent;
    public final C150575vZ<Integer, InterfaceC88472Yns<View, C76800UCe>> iconAnimation;
    public final C150575vZ<Integer, String> iconLottieAnimation;
    public final Integer marginValue;
    public final C1539362j musicChooseState;
    public final C145425nG refresh;
    public final Integer topMargin;
    public final AbstractC81666W3i ui;

    public static /* synthetic */ EditToolbarState copy$default(EditToolbarState editToolbarState, AbstractC81666W3i abstractC81666W3i, Boolean bool, Boolean bool2, String str, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, C145425nG c145425nG2, Boolean bool3, C1539362j c1539362j, C150575vZ c150575vZ, C150575vZ c150575vZ2, C148455s9 c148455s9, Integer num3, Integer num4, boolean z, int i, Object obj) {
        AbstractC81666W3i abstractC81666W3i2 = abstractC81666W3i;
        String str3 = str;
        Boolean bool4 = bool;
        Boolean bool5 = bool2;
        Integer num5 = num2;
        Integer num6 = num;
        Drawable drawable2 = drawable;
        C145425nG c145425nG3 = c145425nG;
        String str4 = str2;
        C150575vZ c150575vZ3 = c150575vZ2;
        C150575vZ c150575vZ4 = c150575vZ;
        C1539362j c1539362j2 = c1539362j;
        C145425nG c145425nG4 = c145425nG2;
        Boolean bool6 = bool3;
        boolean z2 = z;
        Integer num7 = num4;
        C148455s9 c148455s92 = c148455s9;
        Integer num8 = num3;
        if ((i & 1) != 0) {
            abstractC81666W3i2 = editToolbarState.getUi();
        }
        if ((i & 2) != 0) {
            bool4 = editToolbarState.backVisible;
        }
        if ((i & 4) != 0) {
            bool5 = editToolbarState.backTipVisible;
        }
        if ((i & 8) != 0) {
            str3 = editToolbarState.backTipText;
        }
        if ((i & 16) != 0) {
            c145425nG3 = editToolbarState.hideMoreEvent;
        }
        if ((i & 32) != 0) {
            str4 = editToolbarState.chooseMusicText;
        }
        if ((i & 64) != 0) {
            drawable2 = editToolbarState.chooseMusicIcon;
        }
        if ((i & 128) != 0) {
            num6 = editToolbarState.topMargin;
        }
        if ((i & 256) != 0) {
            num5 = editToolbarState.bottomHeight;
        }
        if ((i & 512) != 0) {
            c145425nG4 = editToolbarState.refresh;
        }
        if ((i & 1024) != 0) {
            bool6 = editToolbarState.enableAudioEnhance;
        }
        if ((i & 2048) != 0) {
            c1539362j2 = editToolbarState.musicChooseState;
        }
        if ((i & 4096) != 0) {
            c150575vZ4 = editToolbarState.iconAnimation;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            c150575vZ3 = editToolbarState.iconLottieAnimation;
        }
        if ((i & 16384) != 0) {
            c148455s92 = editToolbarState.autoEnhanceStatus;
        }
        if ((32768 & i) != 0) {
            num8 = editToolbarState.marginValue;
        }
        if ((65536 & i) != 0) {
            num7 = editToolbarState.chooseMusicIconRes;
        }
        if ((i & 131072) != 0) {
            z2 = editToolbarState.aiCaptionOn;
        }
        C145425nG c145425nG5 = c145425nG3;
        return editToolbarState.copy(abstractC81666W3i2, bool4, bool5, str3, c145425nG5, str4, drawable2, num6, num5, c145425nG4, bool6, c1539362j2, c150575vZ4, c150575vZ3, c148455s92, num8, num7, z2);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final EditToolbarState copy(AbstractC81666W3i ui, Boolean bool, Boolean bool2, String str, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, C145425nG c145425nG2, Boolean bool3, C1539362j c1539362j, C150575vZ<Integer, InterfaceC88472Yns<View, C76800UCe>> c150575vZ, C150575vZ<Integer, String> c150575vZ2, C148455s9 c148455s9, Integer num3, Integer num4, boolean z) {
        o.LJIIIZ(ui, "ui");
        return new EditToolbarState(ui, bool, bool2, str, c145425nG, str2, drawable, num, num2, c145425nG2, bool3, c1539362j, c150575vZ, c150575vZ2, c148455s9, num3, num4, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditToolbarState)) {
            return false;
        }
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return o.LJ(getUi(), editToolbarState.getUi()) && o.LJ(this.backVisible, editToolbarState.backVisible) && o.LJ(this.backTipVisible, editToolbarState.backTipVisible) && o.LJ(this.backTipText, editToolbarState.backTipText) && o.LJ(this.hideMoreEvent, editToolbarState.hideMoreEvent) && o.LJ(this.chooseMusicText, editToolbarState.chooseMusicText) && o.LJ(this.chooseMusicIcon, editToolbarState.chooseMusicIcon) && o.LJ(this.topMargin, editToolbarState.topMargin) && o.LJ(this.bottomHeight, editToolbarState.bottomHeight) && o.LJ(this.refresh, editToolbarState.refresh) && o.LJ(this.enableAudioEnhance, editToolbarState.enableAudioEnhance) && o.LJ(this.musicChooseState, editToolbarState.musicChooseState) && o.LJ(this.iconAnimation, editToolbarState.iconAnimation) && o.LJ(this.iconLottieAnimation, editToolbarState.iconLottieAnimation) && o.LJ(this.autoEnhanceStatus, editToolbarState.autoEnhanceStatus) && o.LJ(this.marginValue, editToolbarState.marginValue) && o.LJ(this.chooseMusicIconRes, editToolbarState.chooseMusicIconRes) && this.aiCaptionOn == editToolbarState.aiCaptionOn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        Boolean bool = this.backVisible;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.backTipVisible;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.backTipText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C145425nG c145425nG = this.hideMoreEvent;
        int hashCode5 = (hashCode4 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        String str2 = this.chooseMusicText;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int hashCode7 = (hashCode6 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.topMargin;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomHeight;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C145425nG c145425nG2 = this.refresh;
        int hashCode10 = (hashCode9 + (c145425nG2 == null ? 0 : c145425nG2.hashCode())) * 31;
        Boolean bool3 = this.enableAudioEnhance;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C1539362j c1539362j = this.musicChooseState;
        int hashCode12 = (hashCode11 + (c1539362j == null ? 0 : c1539362j.hashCode())) * 31;
        C150575vZ<Integer, InterfaceC88472Yns<View, C76800UCe>> c150575vZ = this.iconAnimation;
        int hashCode13 = (hashCode12 + (c150575vZ == null ? 0 : c150575vZ.hashCode())) * 31;
        C150575vZ<Integer, String> c150575vZ2 = this.iconLottieAnimation;
        int hashCode14 = (hashCode13 + (c150575vZ2 == null ? 0 : c150575vZ2.hashCode())) * 31;
        C148455s9 c148455s9 = this.autoEnhanceStatus;
        int hashCode15 = (hashCode14 + (c148455s9 == null ? 0 : c148455s9.hashCode())) * 31;
        Integer num3 = this.marginValue;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.chooseMusicIconRes;
        int hashCode17 = (hashCode16 + (num4 != null ? num4.hashCode() : 0)) * 31;
        boolean z = this.aiCaptionOn;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode17 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EditToolbarState(ui=");
        sb.append(getUi());
        sb.append(", backVisible=");
        sb.append(this.backVisible);
        sb.append(", backTipVisible=");
        sb.append(this.backTipVisible);
        sb.append(", backTipText=");
        sb.append(this.backTipText);
        sb.append(", hideMoreEvent=");
        sb.append(this.hideMoreEvent);
        sb.append(", chooseMusicText=");
        sb.append(this.chooseMusicText);
        sb.append(", chooseMusicIcon=");
        sb.append(this.chooseMusicIcon);
        sb.append(", topMargin=");
        sb.append(this.topMargin);
        sb.append(", bottomHeight=");
        sb.append(this.bottomHeight);
        sb.append(", refresh=");
        sb.append(this.refresh);
        sb.append(", enableAudioEnhance=");
        sb.append(this.enableAudioEnhance);
        sb.append(", musicChooseState=");
        sb.append(this.musicChooseState);
        sb.append(", iconAnimation=");
        sb.append(this.iconAnimation);
        sb.append(", iconLottieAnimation=");
        sb.append(this.iconLottieAnimation);
        sb.append(", autoEnhanceStatus=");
        sb.append(this.autoEnhanceStatus);
        sb.append(", marginValue=");
        sb.append(this.marginValue);
        sb.append(", chooseMusicIconRes=");
        sb.append(this.chooseMusicIconRes);
        sb.append(", aiCaptionOn=");
        return C08880Wm.LIZJ(sb, this.aiCaptionOn, ')');
    }

    public final boolean getAiCaptionOn() {
        return this.aiCaptionOn;
    }

    public final C148455s9 getAutoEnhanceStatus() {
        return this.autoEnhanceStatus;
    }

    public final String getBackTipText() {
        return this.backTipText;
    }

    public final Boolean getBackTipVisible() {
        return this.backTipVisible;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final Integer getChooseMusicIconRes() {
        return this.chooseMusicIconRes;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final Boolean getEnableAudioEnhance() {
        return this.enableAudioEnhance;
    }

    public final C145425nG getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final C150575vZ<Integer, InterfaceC88472Yns<View, C76800UCe>> getIconAnimation() {
        return this.iconAnimation;
    }

    public final C150575vZ<Integer, String> getIconLottieAnimation() {
        return this.iconLottieAnimation;
    }

    public final Integer getMarginValue() {
        return this.marginValue;
    }

    public final C1539362j getMusicChooseState() {
        return this.musicChooseState;
    }

    public final C145425nG getRefresh() {
        return this.refresh;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditToolbarState(AbstractC81666W3i ui, Boolean bool, Boolean bool2, String str, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, C145425nG c145425nG2, Boolean bool3, C1539362j c1539362j, C150575vZ<Integer, InterfaceC88472Yns<View, C76800UCe>> c150575vZ, C150575vZ<Integer, String> c150575vZ2, C148455s9 c148455s9, Integer num3, Integer num4, boolean z) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.backVisible = bool;
        this.backTipVisible = bool2;
        this.backTipText = str;
        this.hideMoreEvent = c145425nG;
        this.chooseMusicText = str2;
        this.chooseMusicIcon = drawable;
        this.topMargin = num;
        this.bottomHeight = num2;
        this.refresh = c145425nG2;
        this.enableAudioEnhance = bool3;
        this.musicChooseState = c1539362j;
        this.iconAnimation = c150575vZ;
        this.iconLottieAnimation = c150575vZ2;
        this.autoEnhanceStatus = c148455s9;
        this.marginValue = num3;
        this.chooseMusicIconRes = num4;
        this.aiCaptionOn = z;
    }

    public /* synthetic */ EditToolbarState(AbstractC81666W3i abstractC81666W3i, Boolean bool, Boolean bool2, String str, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, C145425nG c145425nG2, Boolean bool3, C1539362j c1539362j, C150575vZ c150575vZ, C150575vZ c150575vZ2, C148455s9 c148455s9, Integer num3, Integer num4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC81666W3i, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : c145425nG, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : drawable, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : c145425nG2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : c1539362j, (i & 4096) != 0 ? null : c150575vZ, (i & FileUtils.BUFFER_SIZE) != 0 ? null : c150575vZ2, (i & 16384) != 0 ? null : c148455s9, (32768 & i) != 0 ? 0 : num3, (65536 & i) == 0 ? num4 : null, (i & 131072) == 0 ? z : false);
    }
}
