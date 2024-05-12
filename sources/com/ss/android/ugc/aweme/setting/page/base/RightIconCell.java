package com.ss.android.ugc.aweme.setting.page.base;

import X.AI8;
import X.AIF;
import X.C1FJ;
import X.C1FL;
import X.C253359wx;
import X.C26338AVi;
import X.C32151Nz;
import X.C45804HyK;
import X.C79045V0n;
import X.InterfaceC57784Mm4;
import X.O6R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class RightIconCell<T extends C253359wx> extends PowerCell<T> implements View.OnClickListener {
    public static final int LJLJJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
    public Activity LJLIL;
    public AI8 LJLILLLLZI;
    public AIF LJLJI;
    public TuxIconView LJLJJI;

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        o.LJIIIZ(v, "v");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        int i;
        Activity activity;
        if (this.LJLJJI == null && (activity = this.LJLIL) != null) {
            TuxIconView tuxIconView = new TuxIconView(activity, null, 0, 6, null);
            int i2 = LJLJJL;
            tuxIconView.setIconWidth(i2);
            tuxIconView.setIconHeight(i2);
            this.LJLJJI = tuxIconView;
        }
        AIF aif = this.LJLJI;
        if (aif != null) {
            TuxIconView tuxIconView2 = this.LJLJJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
                aif.LJIIL(tuxIconView2);
                aif.LJIILL(false);
                C253359wx c253359wx = (C253359wx) getItem();
                if (c253359wx != null && (i = c253359wx.LJLILLLLZI) != -1 && c253359wx.LJLJI != -1) {
                    tuxIconView2.setIconRes(i);
                    tuxIconView2.setTintColorRes(c253359wx.LJLJI);
                    tuxIconView2.setVisibility(0);
                }
            }
            aif.LJIILL(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 item) {
        AI8 ai8;
        Object obj;
        C253359wx c253359wx;
        C253359wx c253359wx2;
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
        if (ai82 != null && (c253359wx2 = (C253359wx) getItem()) != null && c253359wx2.LJLJJI != -1) {
            ai82.setSubtitle(ai82.getContext().getText(c253359wx2.LJLJJI));
        }
        AI8 ai83 = this.LJLILLLLZI;
        if (ai83 != null && (c253359wx = (C253359wx) getItem()) != null && c253359wx.LJLIL != -1) {
            ai83.setTitle(ai83.getContext().getText(c253359wx.LJLIL));
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
        View LIZIZ = C1FL.LIZIZ(parent, R.layout.ckd, parent, false, "onCreateItemView$lambda$0");
        C26338AVi.LJI(LIZIZ, C1FJ.LIZIZ(8), null, C1FJ.LIZIZ(8), null, false, 26);
        Context context2 = LIZIZ.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.ci, context2);
        o.LJI(LJI);
        LIZIZ.setBackgroundColor(LJI.intValue());
        return LIZIZ;
    }
}
