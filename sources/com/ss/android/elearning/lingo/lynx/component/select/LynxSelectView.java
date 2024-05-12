package com.ss.android.elearning.lingo.lynx.component.select;

import X.C49615Jdb;
import X.C61498OBq;
import X.C79907VXr;
import X.C79909VXt;
import X.EWS;
import X.OSZ;
import X.TBP;
import X.VNL;
import X.VNU;
import X.VPD;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxSelectView extends UISimpleView<TBP> {
    public final VNU LJLIL;

    @EWS
    public final void dismissSelect() {
        C79907VXr c79907VXr;
        TBP tbp = (TBP) this.mView;
        if (tbp == null || (c79907VXr = tbp.LJLIL) == null || !c79907VXr.LJJJJLL()) {
            return;
        }
        C79909VXt c79909VXt = c79907VXr.LJLZ;
        if (c79909VXt != null) {
            c79909VXt.LIZIZ();
        }
        c79907VXr.LJJJJL();
    }

    public LynxSelectView(VNU vnu) {
        super(vnu);
        this.LJLIL = vnu;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        TBP tbp = new TBP(context);
        C61498OBq c61498OBq = new C61498OBq(this);
        C79907VXr c79907VXr = tbp.LJLIL;
        if (c79907VXr != null) {
            c79907VXr.setSelectableOnChangeListener(c61498OBq);
        }
        tbp.LIZIZ("#FE2C5533", "#FE2C55");
        return tbp;
    }

    @VPD(name = "auto-comple")
    public final void enableAutoComplete(boolean z) {
        TBP tbp = (TBP) this.mView;
        if (tbp != null) {
            tbp.setEnableAutoComplete(z);
        }
    }

    @VPD(name = "enable-rtl")
    public final void enableRTL(boolean z) {
        TBP tbp = (TBP) this.mView;
        if (tbp != null) {
            if (z) {
                C79907VXr c79907VXr = tbp.LJLIL;
                if (c79907VXr == null) {
                    return;
                }
                c79907VXr.setTextAlignment(3);
                return;
            }
            C79907VXr c79907VXr2 = tbp.LJLIL;
            if (c79907VXr2 == null) {
                return;
            }
            c79907VXr2.setTextAlignment(2);
        }
    }

    @VPD(name = "enable-select")
    public final void enableSelect(boolean z) {
        C79907VXr c79907VXr;
        TBP tbp = (TBP) this.mView;
        if (tbp != null && (c79907VXr = tbp.LJLIL) != null) {
            c79907VXr.setEnableTextSelect(z);
        }
    }

    @VPD(name = "selectable-color")
    public final void setSelectableColor(String selectableColor) {
        o.LJIIIZ(selectableColor, "selectableColor");
        TBP tbp = (TBP) this.mView;
        if (tbp != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(selectableColor);
            LIZ.append("33");
            tbp.LIZIZ(X1D.LIZIZ(LIZ), selectableColor);
        }
    }

    @VPD(name = "text-models")
    public final void setTextModels(ReadableArray textModels) {
        o.LJIIIZ(textModels, "textModels");
        TBP tbp = (TBP) this.mView;
        if (tbp != null) {
            tbp.setTextModels(textModels);
        }
    }

    public final void LJIJJLI(String str, OSZ<String, ? extends Object>... oszArr) {
        VNL vnl;
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "selectEvents");
        for (OSZ<String, ? extends Object> osz : oszArr) {
            c49615Jdb.LIZJ(osz.getSecond(), osz.getFirst());
        }
        VNU vnu = this.LJLIL;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(c49615Jdb);
        }
    }
}
