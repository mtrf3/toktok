package com.ss.android.ugc.aweme.setting.page.base;

import X.AI2;
import X.AI8;
import X.C1FJ;
import X.C1FL;
import X.C253699xV;
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
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class SwitchCell<T extends C253699xV> extends PowerCell<T> implements View.OnClickListener {
    public Activity LJLIL;
    public AI8 LJLILLLLZI;
    public AI2 LJLJI;

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        o.LJIIIZ(v, "v");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void L() {
        C253699xV c253699xV;
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 != null && (c253699xV = (C253699xV) getItem()) != null && c253699xV.LJLILLLLZI != -1) {
            ai8.setSubtitle(ai8.getContext().getText(c253699xV.LJLILLLLZI));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 item) {
        AI8 ai8;
        Object obj;
        C253699xV c253699xV;
        C253699xV c253699xV2;
        AI2 ai2;
        o.LJIIIZ(item, "item");
        View view = this.itemView;
        AI2 ai22 = null;
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
        if (obj instanceof AI2) {
            ai22 = (AI2) obj;
        }
        this.LJLJI = ai22;
        if (this.LJLILLLLZI != null && (c253699xV2 = (C253699xV) getItem()) != null && (ai2 = this.LJLJI) != null) {
            boolean LJIIL = ai2.LJIIL();
            boolean z = c253699xV2.LJLJI;
            if (LJIIL != z) {
                ai2.LJIILIIL(z);
            }
        }
        L();
        AI8 ai82 = this.LJLILLLLZI;
        if (ai82 != null && (c253699xV = (C253699xV) getItem()) != null && c253699xV.LJLIL != -1) {
            ai82.setTitle(ai82.getContext().getText(c253699xV.LJLIL));
        }
        AI2 ai23 = this.LJLJI;
        if (ai23 != null) {
            ai23.LJIILJJIL(new AqS154S0100000_4(this, (SwitchCell<C253699xV>) 1171));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLIL = C45804HyK.LJIJJ(context);
        View LIZIZ = C1FL.LIZIZ(parent, R.layout.ckf, parent, false, "onCreateItemView$lambda$0");
        C26338AVi.LJI(LIZIZ, C1FJ.LIZIZ(8), null, C1FJ.LIZIZ(8), null, false, 26);
        Context context2 = LIZIZ.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.ci, context2);
        o.LJI(LJI);
        LIZIZ.setBackgroundColor(LJI.intValue());
        return LIZIZ;
    }
}
