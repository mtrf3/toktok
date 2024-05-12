package com.ss.android.ugc.aweme.ftc.components.toolbar;

import X.AbstractC81666W3i;
import X.C145425nG;
import X.C1536461g;
import X.UC7;
import android.graphics.drawable.Drawable;
import com.bytedance.ui_component.UiState;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditToolbarState extends UiState {
    public final String backTipText;
    public final Boolean backTipVisible;
    public final Boolean backVisible;
    public final List<C1536461g> bottomBarItems;
    public final Integer bottomHeight;
    public final Drawable chooseMusicIcon;
    public final Integer chooseMusicRawIconRes;
    public final String chooseMusicText;
    public final C145425nG hideMoreEvent;
    public final List<C1536461g> titleBarItems;
    public final Integer topMargin;
    public final AbstractC81666W3i ui;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditToolbarState copy$default(FTCEditToolbarState fTCEditToolbarState, AbstractC81666W3i abstractC81666W3i, Boolean bool, Boolean bool2, String str, List list, List list2, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC81666W3i = fTCEditToolbarState.getUi();
        }
        if ((i & 2) != 0) {
            bool = fTCEditToolbarState.backVisible;
        }
        if ((i & 4) != 0) {
            bool2 = fTCEditToolbarState.backTipVisible;
        }
        if ((i & 8) != 0) {
            str = fTCEditToolbarState.backTipText;
        }
        if ((i & 16) != 0) {
            list = fTCEditToolbarState.titleBarItems;
        }
        if ((i & 32) != 0) {
            list2 = fTCEditToolbarState.bottomBarItems;
        }
        if ((i & 64) != 0) {
            c145425nG = fTCEditToolbarState.hideMoreEvent;
        }
        if ((i & 128) != 0) {
            str2 = fTCEditToolbarState.chooseMusicText;
        }
        if ((i & 256) != 0) {
            drawable = fTCEditToolbarState.chooseMusicIcon;
        }
        if ((i & 512) != 0) {
            num = fTCEditToolbarState.topMargin;
        }
        if ((i & 1024) != 0) {
            num2 = fTCEditToolbarState.bottomHeight;
        }
        if ((i & 2048) != 0) {
            num3 = fTCEditToolbarState.chooseMusicRawIconRes;
        }
        return fTCEditToolbarState.copy(abstractC81666W3i, bool, bool2, str, list, list2, c145425nG, str2, drawable, num, num2, num3);
    }

    public final AbstractC81666W3i component1() {
        return getUi();
    }

    public final FTCEditToolbarState copy(AbstractC81666W3i ui, Boolean bool, Boolean bool2, String str, List<C1536461g> list, List<C1536461g> list2, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, Integer num3) {
        o.LJIIIZ(ui, "ui");
        return new FTCEditToolbarState(ui, bool, bool2, str, list, list2, c145425nG, str2, drawable, num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditToolbarState)) {
            return false;
        }
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return o.LJ(getUi(), fTCEditToolbarState.getUi()) && o.LJ(this.backVisible, fTCEditToolbarState.backVisible) && o.LJ(this.backTipVisible, fTCEditToolbarState.backTipVisible) && o.LJ(this.backTipText, fTCEditToolbarState.backTipText) && o.LJ(this.titleBarItems, fTCEditToolbarState.titleBarItems) && o.LJ(this.bottomBarItems, fTCEditToolbarState.bottomBarItems) && o.LJ(this.hideMoreEvent, fTCEditToolbarState.hideMoreEvent) && o.LJ(this.chooseMusicText, fTCEditToolbarState.chooseMusicText) && o.LJ(this.chooseMusicIcon, fTCEditToolbarState.chooseMusicIcon) && o.LJ(this.topMargin, fTCEditToolbarState.topMargin) && o.LJ(this.bottomHeight, fTCEditToolbarState.bottomHeight) && o.LJ(this.chooseMusicRawIconRes, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public int hashCode() {
        int hashCode = getUi().hashCode() * 31;
        Boolean bool = this.backVisible;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.backTipVisible;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.backTipText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<C1536461g> list = this.titleBarItems;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<C1536461g> list2 = this.bottomBarItems;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C145425nG c145425nG = this.hideMoreEvent;
        int hashCode7 = (hashCode6 + (c145425nG == null ? 0 : c145425nG.hashCode())) * 31;
        String str2 = this.chooseMusicText;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable = this.chooseMusicIcon;
        int hashCode9 = (hashCode8 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.topMargin;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bottomHeight;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.chooseMusicRawIconRes;
        return hashCode11 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FTCEditToolbarState(ui=");
        sb.append(getUi());
        sb.append(", backVisible=");
        sb.append(this.backVisible);
        sb.append(", backTipVisible=");
        sb.append(this.backTipVisible);
        sb.append(", backTipText=");
        sb.append(this.backTipText);
        sb.append(", titleBarItems=");
        sb.append(this.titleBarItems);
        sb.append(", bottomBarItems=");
        sb.append(this.bottomBarItems);
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
        sb.append(", chooseMusicRawIconRes=");
        return UC7.LIZ(sb, this.chooseMusicRawIconRes, ')');
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

    public final List<C1536461g> getBottomBarItems() {
        return this.bottomBarItems;
    }

    public final Integer getBottomHeight() {
        return this.bottomHeight;
    }

    public final Drawable getChooseMusicIcon() {
        return this.chooseMusicIcon;
    }

    public final Integer getChooseMusicRawIconRes() {
        return this.chooseMusicRawIconRes;
    }

    public final String getChooseMusicText() {
        return this.chooseMusicText;
    }

    public final C145425nG getHideMoreEvent() {
        return this.hideMoreEvent;
    }

    public final List<C1536461g> getTitleBarItems() {
        return this.titleBarItems;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public AbstractC81666W3i getUi() {
        return this.ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTCEditToolbarState(AbstractC81666W3i ui, Boolean bool, Boolean bool2, String str, List<C1536461g> list, List<C1536461g> list2, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, Integer num3) {
        super(ui);
        o.LJIIIZ(ui, "ui");
        this.ui = ui;
        this.backVisible = bool;
        this.backTipVisible = bool2;
        this.backTipText = str;
        this.titleBarItems = list;
        this.bottomBarItems = list2;
        this.hideMoreEvent = c145425nG;
        this.chooseMusicText = str2;
        this.chooseMusicIcon = drawable;
        this.topMargin = num;
        this.bottomHeight = num2;
        this.chooseMusicRawIconRes = num3;
    }

    public /* synthetic */ FTCEditToolbarState(AbstractC81666W3i abstractC81666W3i, Boolean bool, Boolean bool2, String str, List list, List list2, C145425nG c145425nG, String str2, Drawable drawable, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC81666W3i, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : c145425nG, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : drawable, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2, (i & 2048) == 0 ? num3 : null);
    }
}
