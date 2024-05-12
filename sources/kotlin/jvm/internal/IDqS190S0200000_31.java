package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC91695Zyl;
import X.ActivityC45651qj;
import X.AnonymousClass057;
import X.C03720Cq;
import X.C07730Sb;
import X.C09290Yb;
import X.C0YZ;
import X.C16880lQ;
import X.C1DJ;
import X.C1M1;
import X.C21350sd;
import X.C21430sl;
import X.C24440xc;
import X.C24610xt;
import X.C24830yF;
import X.C31631Lz;
import X.C33381Ss;
import X.C40431iJ;
import X.C46041rM;
import X.C55096Ljo;
import X.C56509MFt;
import X.C70657RoD;
import X.C76800UCe;
import X.C78929UyL;
import X.C91671ZyN;
import X.C91673ZyP;
import X.C91676ZyS;
import X.C91791a0J;
import X.C91817a0j;
import X.C91834a10;
import X.C92145a61;
import X.C92147a63;
import X.C92253a7l;
import X.C92269a81;
import X.C92315a8l;
import X.C93071aKx;
import X.EnumC91916a2K;
import X.EnumC91920a2O;
import X.EnumC91995a3b;
import X.InterfaceC03730Cr;
import X.InterfaceC06520Nk;
import X.InterfaceC07760Se;
import X.InterfaceC07790Sh;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC24760y8;
import X.InterfaceC273215k;
import X.InterfaceC35811ar;
import X.InterfaceC88471Ynr;
import X.InterfaceC91996a3c;
import X.SY4;
import X.V8E;
import Y.IDCListenerS85S0200000_31;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.pipo.checkout.sdk.internal.CheckoutActivity;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.BillRepaymentPrepareInfo;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Notice;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg;
import com.ss.android.ugc.aweme.bnpl.biz.bill.result.RepaymentRetAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes20.dex */
public class IDqS190S0200000_31 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void invoke$0(UIAssem subscribe, C92253a7l state) {
        int i;
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
        View view14;
        View view15;
        View view16;
        View view17;
        View view18;
        View view19;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(state, "state");
        if (state.LJLIL != EnumC91916a2K.SUCCESS) {
            return;
        }
        EnumC91995a3b enumC91995a3b = state.LJLILLLLZI;
        if (enumC91995a3b == null) {
            i = -1;
        } else {
            i = C91791a0J.LIZ[enumC91995a3b.ordinal()];
        }
        View view20 = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C33381Ss c33381Ss = new C33381Ss();
                    c33381Ss.LJLIL = R.drawable.bd8;
                    Context context = ((View) this.l0).getContext();
                    o.LJIIIIZZ(context, "view.context");
                    V8E LIZ = c33381Ss.LIZ(context);
                    View containerView = subscribe.getContainerView();
                    if (containerView != null) {
                        view18 = containerView.findViewById(R.id.d7);
                    } else {
                        view18 = null;
                    }
                    ((ImageView) view18).setImageDrawable(LIZ);
                    View containerView2 = subscribe.getContainerView();
                    if (containerView2 != null) {
                        view19 = containerView2.findViewById(R.id.d6);
                    } else {
                        view19 = null;
                    }
                    ((TextView) view19).setText(((View) this.l0).getContext().getString(R.string.jo7));
                }
            } else {
                C33381Ss c33381Ss2 = new C33381Ss();
                c33381Ss2.LJLIL = R.drawable.bd9;
                Context context2 = ((View) this.l0).getContext();
                o.LJIIIIZZ(context2, "view.context");
                V8E LIZ2 = c33381Ss2.LIZ(context2);
                View containerView3 = subscribe.getContainerView();
                if (containerView3 != null) {
                    view16 = containerView3.findViewById(R.id.d7);
                } else {
                    view16 = null;
                }
                ((ImageView) view16).setImageDrawable(LIZ2);
                View containerView4 = subscribe.getContainerView();
                if (containerView4 != null) {
                    view17 = containerView4.findViewById(R.id.d6);
                } else {
                    view17 = null;
                }
                ((TextView) view17).setText(((View) this.l0).getContext().getString(R.string.jo9));
            }
        } else {
            C33381Ss c33381Ss3 = new C33381Ss();
            c33381Ss3.LJLIL = R.drawable.bd_;
            Context context3 = ((View) this.l0).getContext();
            o.LJIIIIZZ(context3, "view.context");
            V8E LIZ3 = c33381Ss3.LIZ(context3);
            View containerView5 = subscribe.getContainerView();
            if (containerView5 != null) {
                view = containerView5.findViewById(R.id.d7);
            } else {
                view = null;
            }
            ((ImageView) view).setImageDrawable(LIZ3);
            View containerView6 = subscribe.getContainerView();
            if (containerView6 != null) {
                view2 = containerView6.findViewById(R.id.d6);
            } else {
                view2 = null;
            }
            ((TextView) view2).setText(((View) this.l0).getContext().getString(R.string.jo9));
        }
        View containerView7 = subscribe.getContainerView();
        if (containerView7 != null) {
            view3 = containerView7.findViewById(R.id.dh);
        } else {
            view3 = null;
        }
        ((TextView) view3).setText(state.LJLJJL);
        String str = state.LJLJJLL;
        if (str != null) {
            View containerView8 = subscribe.getContainerView();
            if (containerView8 != null) {
                view15 = containerView8.findViewById(R.id.dg);
            } else {
                view15 = null;
            }
            ((TextView) view15).setText(str);
        }
        View containerView9 = subscribe.getContainerView();
        if (containerView9 != null) {
            view4 = containerView9.findViewById(R.id.d6);
        } else {
            view4 = null;
        }
        C16880lQ.LJJIZ((SY4) view4, new IDCListenerS85S0200000_31(subscribe, (RepaymentRetAssem) this.l1, 0));
        Notice notice = state.LJLJL;
        if (notice != null) {
            View containerView10 = subscribe.getContainerView();
            if (containerView10 != null) {
                view13 = containerView10.findViewById(R.id.co);
            } else {
                view13 = null;
            }
            ((C91817a0j) view13).LIZ(notice);
            View containerView11 = subscribe.getContainerView();
            if (containerView11 != null) {
                view14 = containerView11.findViewById(R.id.co);
            } else {
                view14 = null;
            }
            view14.setVisibility(0);
        }
        if (state.LJLJL == null) {
            View containerView12 = subscribe.getContainerView();
            if (containerView12 != null) {
                view12 = containerView12.findViewById(R.id.co);
            } else {
                view12 = null;
            }
            view12.setVisibility(8);
        }
        Boolean bool = state.LJLJLLL;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            View containerView13 = subscribe.getContainerView();
            if (containerView13 != null) {
                view10 = containerView13.findViewById(R.id.d4);
            } else {
                view10 = null;
            }
            view10.setVisibility(0);
            View containerView14 = subscribe.getContainerView();
            if (containerView14 != null) {
                view11 = containerView14.findViewById(R.id.d4);
            } else {
                view11 = null;
            }
            C16880lQ.LJJIZ((SY4) view11, new IDCListenerS85S0200000_31(subscribe, (RepaymentRetAssem) this.l1, 1));
        } else {
            View containerView15 = subscribe.getContainerView();
            if (containerView15 != null) {
                view5 = containerView15.findViewById(R.id.d4);
            } else {
                view5 = null;
            }
            view5.setVisibility(8);
        }
        if (o.LJ(state.LJLJLJ, bool2)) {
            View containerView16 = subscribe.getContainerView();
            if (containerView16 != null) {
                view7 = containerView16.findViewById(R.id.d5);
            } else {
                view7 = null;
            }
            view7.setVisibility(0);
            View containerView17 = subscribe.getContainerView();
            if (containerView17 != null) {
                view8 = containerView17.findViewById(R.id.d5);
            } else {
                view8 = null;
            }
            C16880lQ.LJJIZ((SY4) view8, new IDCListenerS85S0200000_31(subscribe, (RepaymentRetAssem) this.l1, 2));
            View containerView18 = subscribe.getContainerView();
            if (containerView18 != null) {
                view9 = containerView18.findViewById(R.id.d5);
            } else {
                view9 = null;
            }
            ((SY4) view9).setLoading(state.LJLJI);
        } else {
            View containerView19 = subscribe.getContainerView();
            if (containerView19 != null) {
                view6 = containerView19.findViewById(R.id.d5);
            } else {
                view6 = null;
            }
            view6.setVisibility(8);
        }
        if (!o.LJ(state.LJLJLLL, bool2) && !o.LJ(state.LJLJLJ, bool2)) {
            View containerView20 = subscribe.getContainerView();
            if (containerView20 != null) {
                view20 = containerView20.findViewById(R.id.d6);
            }
            ((SY4) view20).setButtonVariant(0);
            return;
        }
        View containerView21 = subscribe.getContainerView();
        if (containerView21 != null) {
            view20 = containerView21.findViewById(R.id.d6);
        }
        ((SY4) view20).setButtonVariant(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS190S0200000_31(InterfaceC91996a3c interfaceC91996a3c, InterfaceC35811ar interfaceC35811ar, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC91996a3c;
        this.l1 = interfaceC35811ar;
    }

    public static final Object invoke$0(IDqS190S0200000_31 iDqS190S0200000_31, Object obj, Object obj2) {
        BillRepaymentPrepareInfo billRepaymentPrepareInfo = (BillRepaymentPrepareInfo) obj;
        if (billRepaymentPrepareInfo != null && billRepaymentPrepareInfo.canRepay) {
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((UIAssem) iDqS190S0200000_31.l0);
            if (LJIIIIZZ != null) {
                LJIIIIZZ.onBackPressed();
            }
            C91834a10.LIZJ(Boolean.TRUE, "continue_to_repay", ((RepaymentRetAssem) iDqS190S0200000_31.l1).v3().LJLILLLLZI);
            Context context = ((UIAssem) iDqS190S0200000_31.l0).getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            String str = billRepaymentPrepareInfo.dueAmount;
            String str2 = billRepaymentPrepareInfo.totalDueAmount;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            boolean LJ = o.LJ(billRepaymentPrepareInfo.userStatus, EnumC91920a2O.USER_OVERDUE.getValue());
            String str4 = billRepaymentPrepareInfo.suggestAmount;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = billRepaymentPrepareInfo.minAmount;
            if (str5 == null) {
                str5 = "";
            }
            long j = billRepaymentPrepareInfo.dueDate;
            String str6 = billRepaymentPrepareInfo.currency;
            String str7 = billRepaymentPrepareInfo.inProgressMsg;
            if (str7 == null) {
                str7 = "";
            }
            boolean z = billRepaymentPrepareInfo.inProgress;
            String str8 = billRepaymentPrepareInfo.inProgressSchema;
            if (str8 != null) {
                str3 = str8;
            }
            C91834a10.LIZ(context, new RepaymentArg("bnpl_repayment_result", str, str2, LJ, str4, str5, str6, j, z, str7, str3));
        } else {
            C91834a10.LIZJ(Boolean.FALSE, "continue_to_repay", ((RepaymentRetAssem) iDqS190S0200000_31.l1).v3().LJLILLLLZI);
            RepaymentRetAssem repaymentRetAssem = (RepaymentRetAssem) iDqS190S0200000_31.l1;
            repaymentRetAssem.getClass();
            Context context2 = repaymentRetAssem.getContainerView().getContext();
            o.LJIIIIZZ(context2, "containerView.context");
            C91834a10.LJFF(context2, repaymentRetAssem.v3().LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS190S0200000_31 iDqS190S0200000_31, Object obj, Object obj2) {
        iDqS190S0200000_31.invoke$0((UIAssem) obj, (C92253a7l) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS190S0200000_31 iDqS190S0200000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            C92145a61 LIZIZ = C92147a63.LIZIZ(new AbstractC91695Zyl[0], interfaceC24520xk);
            C24610xt.LJ(LIZIZ, new C93071aKx((CheckoutActivity) iDqS190S0200000_31.l0, LIZIZ, null), interfaceC24520xk);
            C91673ZyP.LIZ(Boolean.valueOf(C91671ZyN.LIZ), null, Boolean.valueOf(C91671ZyN.LIZIZ), C91671ZyN.LIZIZ(), C1DJ.LJ(interfaceC24520xk, -819903767, new IDqS41S0300000_31((CheckoutActivity) iDqS190S0200000_31.l1, LIZIZ, (CheckoutActivity) iDqS190S0200000_31.l0, 1)), interfaceC24520xk, 24576, 2);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS190S0200000_31 iDqS190S0200000_31, Object obj, Object obj2) {
        long j;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            InterfaceC07760Se.LJJJ.getClass();
            C31631Lz c31631Lz = C07730Sb.LJFF;
            InterfaceC91996a3c interfaceC91996a3c = (InterfaceC91996a3c) iDqS190S0200000_31.l0;
            InterfaceC24760y8 interfaceC24760y8 = (InterfaceC24760y8) iDqS190S0200000_31.l1;
            interfaceC24520xk.LJJIIJ(733328855);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC273215k LIZJ = C0YZ.LIZJ(c31631Lz, false, interfaceC24520xk);
            interfaceC24520xk.LJJIIJ(-1323940314);
            Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
            if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
                interfaceC24520xk.LJIJI();
                if (interfaceC24520xk.LJIJJLI()) {
                    interfaceC24520xk.LJJI(c46041rM);
                } else {
                    interfaceC24520xk.LIZIZ();
                }
                interfaceC24520xk.LJJIIZI();
                C24830yF.LIZ(interfaceC24520xk, LIZJ, C03720Cq.LJ);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(interfaceC24520xk, LJIILLIIL3, C03720Cq.LJI);
                interfaceC24520xk.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(interfaceC24520xk), interfaceC24520xk, 0);
                interfaceC24520xk.LJJIIJ(2058660585);
                interfaceC24520xk.LJJIIJ(-2137368960);
                String LIZ = interfaceC91996a3c.LIZ();
                InterfaceC07790Sh LJIJJ = C70657RoD.LJIJJ(C09290Yb.LJII(c1m1), 12, 0.0f, 2);
                if (((Boolean) interfaceC24760y8.getValue()).booleanValue()) {
                    interfaceC24520xk.LJJIIJ(-1803779350);
                    j = C91671ZyN.LIZ(interfaceC24520xk).LIZJ;
                } else {
                    interfaceC24520xk.LJJIIJ(-1803779324);
                    j = C91671ZyN.LIZ(interfaceC24520xk).LJ;
                }
                interfaceC24520xk.LJJIJIIJIL();
                C21430sl.LIZIZ(LIZ, LJIJJ, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, null, C91676ZyS.LJFF(C21350sd.LIZJ(interfaceC24520xk), interfaceC24520xk), interfaceC24520xk, 48, 3120, 22520);
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJIJ();
                interfaceC24520xk.LJJIJIIJIL();
                interfaceC24520xk.LJJIJIIJIL();
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS190S0200000_31 iDqS190S0200000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            ((C92269a81) iDqS190S0200000_31.l0).LJLL.invoke((NavBackStackEntry) iDqS190S0200000_31.l1, interfaceC24520xk, 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS190S0200000_31 iDqS190S0200000_31, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if (((((Number) obj2).intValue() & 11) ^ 2) != 0 || !interfaceC24520xk.LIZ()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) iDqS190S0200000_31.l0;
            ((C92315a8l) navBackStackEntry.LJLILLLLZI).LJLJLLL.invoke((InterfaceC06520Nk) iDqS190S0200000_31.l1, navBackStackEntry, interfaceC24520xk, 72);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS190S0200000_31(C92269a81 c92269a81, NavBackStackEntry navBackStackEntry, int i) {
        super(2);
        this.$t = i;
        this.l0 = c92269a81;
        this.l1 = navBackStackEntry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS190S0200000_31(View view, RepaymentRetAssem repaymentRetAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = repaymentRetAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS190S0200000_31(NavBackStackEntry navBackStackEntry, InterfaceC06520Nk interfaceC06520Nk, int i) {
        super(2);
        this.$t = i;
        this.l0 = navBackStackEntry;
        this.l1 = interfaceC06520Nk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS190S0200000_31(UIAssem uIAssem, RepaymentRetAssem repaymentRetAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = repaymentRetAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS190S0200000_31(CheckoutActivity checkoutActivity, CheckoutActivity checkoutActivity2, int i) {
        super(2);
        this.$t = i;
        this.l0 = checkoutActivity;
        this.l1 = checkoutActivity2;
    }
}
