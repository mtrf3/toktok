package com.ss.android.ugc.aweme.setting.page.base;

import X.AI8;
import X.AIF;
import X.C1FJ;
import X.C1FL;
import X.C253569xI;
import X.C26338AVi;
import X.C45804HyK;
import X.C79045V0n;
import X.InterfaceC57784Mm4;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class RightTextCell<T extends C253569xI> extends PowerCell<T> implements View.OnClickListener {
    public Activity LJLIL;
    public AI8 LJLILLLLZI;
    public AIF LJLJI;

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        o.LJIIIZ(v, "v");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        AIF aif;
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 != null) {
            C253569xI c253569xI = (C253569xI) getItem();
            if (c253569xI != null && c253569xI.LJLILLLLZI != -1 && (aif = this.LJLJI) != null) {
                aif.LJIILIIL(ai8.getContext().getText(c253569xI.LJLILLLLZI));
            }
            AIF aif2 = this.LJLJI;
            if (aif2 != null) {
                aif2.LJIILL(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 item) {
        AI8 ai8;
        Object obj;
        C253569xI c253569xI;
        C253569xI c253569xI2;
        o.LJIIIZ(item, "item");
        View view = this.itemView;
        AIF aif = null;
        if (view instanceof AI8) {
            ai8 = (AI8) view;
        } else {
            ai8 = null;
        }
        this.LJLILLLLZI = ai8;
        if (ai8 != null) {
            obj = ai8.getAccessory();
        } else {
            obj = null;
        }
        if (obj instanceof AIF) {
            aif = (AIF) obj;
        }
        this.LJLJI = aif;
        L();
        AI8 ai82 = this.LJLILLLLZI;
        if (ai82 != null && (c253569xI2 = (C253569xI) getItem()) != null && c253569xI2.LJLJI != -1) {
            ai82.setSubtitle(ai82.getContext().getText(c253569xI2.LJLJI));
        }
        AI8 ai83 = this.LJLILLLLZI;
        if (ai83 != null && (c253569xI = (C253569xI) getItem()) != null && c253569xI.LJLIL != -1) {
            ai83.setTitle(ai83.getContext().getText(c253569xI.LJLIL));
        }
        AIF aif2 = this.LJLJI;
        if (aif2 != null) {
            aif2.LJIILJJIL(this);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLIL = C45804HyK.LJIJJ(context);
        View LIZIZ = C1FL.LIZIZ(parent, R.layout.cke, parent, false, "onCreateItemView$lambda$0");
        C26338AVi.LJI(LIZIZ, C1FJ.LIZIZ(8), null, C1FJ.LIZIZ(8), null, false, 26);
        Context context2 = LIZIZ.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.ci, context2);
        o.LJI(LJI);
        LIZIZ.setBackgroundColor(LJI.intValue());
        return LIZIZ;
    }
}
