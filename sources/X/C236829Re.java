package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236829Re extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, AbstractC236819Rd, C76800UCe> {
    public static final C236829Re LJLIL = new C236829Re();

    public C236829Re() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, AbstractC236819Rd abstractC236819Rd) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View view10;
        View view11;
        View view12;
        View view13;
        UIAssem selectSubscribe = uIAssem;
        AbstractC236819Rd linkCheckStatus = abstractC236819Rd;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(linkCheckStatus, "linkCheckStatus");
        View containerView = selectSubscribe.getContainerView();
        View root = null;
        if (containerView != null) {
            view = containerView.findViewById(R.id.cy2);
        } else {
            view = null;
        }
        view.setVisibility(8);
        View containerView2 = selectSubscribe.getContainerView();
        if (containerView2 != null) {
            view2 = containerView2.findViewById(R.id.i1l);
        } else {
            view2 = null;
        }
        view2.setVisibility(8);
        View containerView3 = selectSubscribe.getContainerView();
        if (containerView3 != null) {
            view3 = containerView3.findViewById(R.id.k_h);
        } else {
            view3 = null;
        }
        ((C116414hZ) view3).setVisibility(8);
        View containerView4 = selectSubscribe.getContainerView();
        if (containerView4 != null) {
            view4 = containerView4.findViewById(R.id.dye);
        } else {
            view4 = null;
        }
        ((ImageView) view4).setVisibility(8);
        View containerView5 = selectSubscribe.getContainerView();
        if (containerView5 != null) {
            view5 = containerView5.findViewById(R.id.beg);
        } else {
            view5 = null;
        }
        ((ImageView) view5).setVisibility(8);
        View containerView6 = selectSubscribe.getContainerView();
        if (containerView6 != null) {
            view6 = containerView6.findViewById(R.id.eom);
        } else {
            view6 = null;
        }
        view6.setVisibility(8);
        View containerView7 = selectSubscribe.getContainerView();
        if (containerView7 != null) {
            view7 = containerView7.findViewById(R.id.bqy);
        } else {
            view7 = null;
        }
        ((SY4) view7).setEnabled(false);
        if (!o.LJ(linkCheckStatus, C236579Qf.LIZ)) {
            if (o.LJ(linkCheckStatus, C236899Rl.LIZ)) {
                View containerView8 = selectSubscribe.getContainerView();
                if (containerView8 != null) {
                    root = containerView8.findViewById(R.id.k_h);
                }
                ((C116414hZ) root).setVisibility(0);
            } else if (linkCheckStatus instanceof C9RY) {
                View containerView9 = selectSubscribe.getContainerView();
                if (containerView9 != null) {
                    view11 = containerView9.findViewById(R.id.cy2);
                } else {
                    view11 = null;
                }
                view11.setVisibility(0);
                View containerView10 = selectSubscribe.getContainerView();
                if (containerView10 != null) {
                    view12 = containerView10.findViewById(R.id.beg);
                } else {
                    view12 = null;
                }
                ((ImageView) view12).setVisibility(0);
                View containerView11 = selectSubscribe.getContainerView();
                if (containerView11 != null) {
                    view13 = containerView11.findViewById(R.id.eom);
                } else {
                    view13 = null;
                }
                view13.setVisibility(0);
                View containerView12 = selectSubscribe.getContainerView();
                if (containerView12 != null) {
                    root = containerView12.findViewById(R.id.cy2);
                }
                ((TextView) root).setText(((C9RY) linkCheckStatus).LIZ);
            } else if (o.LJ(linkCheckStatus, C236799Rb.LIZ)) {
                View containerView13 = selectSubscribe.getContainerView();
                if (containerView13 != null) {
                    view9 = containerView13.findViewById(R.id.i1l);
                } else {
                    view9 = null;
                }
                view9.setVisibility(0);
                View containerView14 = selectSubscribe.getContainerView();
                if (containerView14 != null) {
                    view10 = containerView14.findViewById(R.id.dye);
                } else {
                    view10 = null;
                }
                ((ImageView) view10).setVisibility(0);
                View containerView15 = selectSubscribe.getContainerView();
                if (containerView15 != null) {
                    root = containerView15.findViewById(R.id.bqy);
                }
                ((SY4) root).setEnabled(true);
            } else if (o.LJ(linkCheckStatus, C236879Rj.LIZ)) {
                View containerView16 = selectSubscribe.getContainerView();
                if (containerView16 != null) {
                    view8 = containerView16.findViewById(R.id.j71);
                } else {
                    view8 = null;
                }
                Context context = view8.getContext();
                o.LJIIIIZZ(context, "root.context");
                if (C48203Ivv.LIZJ(context)) {
                    View containerView17 = selectSubscribe.getContainerView();
                    if (containerView17 != null) {
                        root = containerView17.findViewById(R.id.j71);
                    }
                    o.LJIIIIZZ(root, "root");
                    C26045AKb c26045AKb = new C26045AKb(root);
                    c26045AKb.LJIIIIZZ(R.string.dtk);
                    c26045AKb.LJIIJ();
                } else {
                    T35.LIZIZ(selectSubscribe.getContext());
                }
            } else if (o.LJ(linkCheckStatus, C236889Rk.LIZ)) {
                View containerView18 = selectSubscribe.getContainerView();
                if (containerView18 != null) {
                    root = containerView18.findViewById(R.id.j71);
                }
                o.LJIIIIZZ(root, "root");
                C26045AKb c26045AKb2 = new C26045AKb(root);
                c26045AKb2.LJIIIIZZ(R.string.bsq);
                c26045AKb2.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }
}
