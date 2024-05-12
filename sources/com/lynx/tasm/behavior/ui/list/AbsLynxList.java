package com.lynx.tasm.behavior.ui.list;

import X.C79655VNz;
import X.F5B;
import X.VNU;
import X.VOR;
import X.VPD;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class AbsLynxList<T extends ViewGroup> extends UISimpleView<T> {
    public final C79655VNz LJLIL;
    public LynxBaseUI LJLILLLLZI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
    }

    @VPD(customType = "1", name = "cache-queue-ratio")
    public abstract void setCacheQueueRatio(F5B f5b);

    @VPD(defaultInt = 1, name = "column-count")
    public abstract void setColumnCount(int i);

    @VPD(defaultBoolean = false, name = "component-init-measure")
    public abstract void setComponentInitMeasure(boolean z);

    @VPD(customType = CardStruct.IStatusCode.DEFAULT, name = "list-cross-axis-gap")
    public abstract void setCrossAxisGap(float f);

    @VPD(customType = "false", name = "paging-enabled")
    public abstract void setEnablePagerSnap(F5B f5b);

    @VPD(name = "sticky")
    public abstract void setEnableSticky(F5B f5b);

    @VPD(customType = CardStruct.IStatusCode.DEFAULT, name = "initial-scroll-index")
    public abstract void setInitialScrollIndex(F5B f5b);

    @VPD(defaultBoolean = false, name = "internal-cell-appear-notification")
    public void setInternalCellAppearNotification(boolean z) {
    }

    @VPD(defaultBoolean = false, name = "internal-cell-disappear-notification")
    public void setInternalCellDisappearNotification(boolean z) {
    }

    @VPD(defaultBoolean = false, name = "internal-cell-prepare-for-reuse-notification")
    public void setInternalCellPrepareForReuseNotification(boolean z) {
    }

    @VPD(customType = "single", name = "list-type")
    public abstract void setListType(String str);

    @VPD(defaultInt = 50, name = "lower-threshold")
    public abstract void setLowerThreshold(F5B f5b);

    @VPD(defaultInt = 0, name = "lower-threshold-item-count")
    public void setLowerThresholdItemCount(F5B f5b) {
    }

    @VPD(customType = CardStruct.IStatusCode.DEFAULT, name = "list-main-axis-gap")
    public abstract void setMainAxisGap(float f);

    @VPD(defaultBoolean = false, name = "needs-visible-cells")
    public abstract void setNeedVisibleCells(boolean z);

    @VPD(defaultBoolean = false, name = "no-invalidate")
    public abstract void setNoInvalidate(boolean z);

    @VPD(customType = "true", name = "enable-scroll")
    public abstract void setScrollEnable(F5B f5b);

    @VPD(customType = "200", name = "scroll-event-throttle")
    public abstract void setScrollEventThrottle(F5B f5b);

    @VPD(customType = "10", name = "scroll-state-change-event-throttle")
    public abstract void setScrollStateChangeEventThrottle(String str);

    @VPD(customType = "false", name = "scroll-x")
    public abstract void setScrollX(F5B f5b);

    @VPD(customType = "true", name = "scroll-y")
    public abstract void setScrollY(F5B f5b);

    @VPD(defaultInt = 0, name = "sticky-offset")
    public abstract void setStickyOffset(F5B f5b);

    @VPD(customType = "true", name = "touch-scroll")
    public abstract void setTouchScroll(F5B f5b);

    @VPD(customType = LiveGiftNewGifterBadgeSetting.DEFAULT, name = "update-animation")
    public abstract void setUpdateAnimation(String str);

    @VPD(defaultInt = 50, name = "upper-threshold")
    public abstract void setUpperThreshold(F5B f5b);

    @VPD(defaultInt = 0, name = "upper-threshold-item-count")
    public void setUpperThresholdItemCount(F5B f5b) {
    }

    public AbsLynxList(VNU vnu) {
        super(vnu);
        this.LJLIL = vnu.LJLJL;
        this.LJLILLLLZI = null;
    }

    public final void LJIL(UIComponent uIComponent) {
        C79655VNz c79655VNz = this.LJLIL;
        int sign = getSign();
        int sign2 = uIComponent.getSign();
        TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIJI(sign, sign2);
        }
    }

    @VPD(customType = "true", name = "over-scroll")
    public void setOverScroll(F5B f5b) {
        boolean asBoolean;
        ReadableType type = f5b.getType();
        if (type == ReadableType.String) {
            asBoolean = "true".equals(f5b.asString());
        } else {
            if (type == ReadableType.Boolean) {
                asBoolean = f5b.asBoolean();
            }
            this.mView.setOverScrollMode(0);
        }
        if (!asBoolean) {
            this.mView.setOverScrollMode(2);
            return;
        }
        this.mView.setOverScrollMode(0);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.LJLILLLLZI = lynxBaseUI;
        lynxBaseUI.setParent(this);
        List<LynxBaseUI> list = this.mChildren;
        ListProtector.add(list, list.size(), lynxBaseUI);
        onInsertChild(lynxBaseUI, i);
    }

    public final UIComponent LJIJJLI(int i, long j, boolean z) {
        int i2;
        VOR vor;
        LynxBaseUI LJIIJ;
        C79655VNz c79655VNz = this.LJLIL;
        int sign = getSign();
        TemplateAssembler templateAssembler = (TemplateAssembler) c79655VNz.LIZ;
        if (templateAssembler != null) {
            i2 = templateAssembler.LJIILJJIL(sign, i, j, z);
        } else {
            i2 = -1;
        }
        if (i2 <= 0 || (vor = this.mContext.LJLLI.get()) == null || (LJIIJ = vor.LJIIJ(i2)) == null || !(LJIIJ instanceof UIComponent)) {
            return null;
        }
        return (UIComponent) LJIIJ;
    }
}
