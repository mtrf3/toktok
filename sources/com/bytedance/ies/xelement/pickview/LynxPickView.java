package com.bytedance.ies.xelement.pickview;

import X.C40658FxW;
import X.VNU;
import X.VPD;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UIView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxPickView extends UIView {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        List<LynxBaseUI> list;
        List<LynxBaseUI> list2;
        List<LynxBaseUI> list3;
        String str = this.LJLIL;
        if (str != null && (list3 = this.mChildren) != null) {
            Iterator it = C40658FxW.LJJZZIII(list3, LynxPickerViewColumn.class).iterator();
            while (it.hasNext()) {
                ((LynxPickerViewColumn) it.next()).setIndicatorStyle(str);
            }
        }
        String str2 = this.LJLILLLLZI;
        if (str2 != null && (list2 = this.mChildren) != null) {
            Iterator it2 = C40658FxW.LJJZZIII(list2, LynxPickerViewColumn.class).iterator();
            while (it2.hasNext()) {
                ((LynxPickerViewColumn) it2.next()).setMaskStyle(str2);
            }
        }
        String str3 = this.LJLJI;
        if (str3 != null && (list = this.mChildren) != null) {
            Iterator it3 = C40658FxW.LJJZZIII(list, LynxPickerViewColumn.class).iterator();
            while (it3.hasNext()) {
                ((LynxPickerViewColumn) it3.next()).setVisibleCount(str3);
            }
        }
        super.measureChildren();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxPickView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @VPD(name = "indicator-style")
    public final void setIndicatorStyle(String style) {
        o.LJIIJ(style, "style");
        this.LJLIL = style;
    }

    @VPD(name = "mask-style")
    public final void setMaskStyle(String style) {
        o.LJIIJ(style, "style");
        this.LJLILLLLZI = style;
    }

    @VPD(name = "visible-count")
    public final void setVisibleCount(String value) {
        o.LJIIJ(value, "value");
        this.LJLJI = value;
    }
}
