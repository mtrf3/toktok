package com.bytedance.android.live.wallet.view.recharge.singlerecharge;

import X.ActivityC45651qj;
import X.BEQ;
import X.C0NB;
import X.C10A;
import X.C11090c5;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C29306Beo;
import X.C29S;
import X.C2A7;
import X.C30868C9o;
import X.C31767CdP;
import X.C32207CkV;
import X.C32357Cmv;
import X.C3C5;
import X.C41081jM;
import X.C47121t6;
import X.C47261Igj;
import X.C48292IxM;
import X.C51029K0z;
import X.C5H3;
import X.C65352Pkq;
import X.C72259SXn;
import X.C73039SlX;
import X.C76800UCe;
import X.C77518Uba;
import X.C77541Ubx;
import X.C77591Ucl;
import X.C77607Ud1;
import X.C77612Ud6;
import X.C77649Udh;
import X.C77702UeY;
import X.C77706Uec;
import X.C78996UzQ;
import X.C90903hW;
import X.CMR;
import X.CN1;
import X.DialogC31813Ce9;
import X.EnumC77641UdZ;
import X.InterfaceC11100c6;
import X.InterfaceC77595Ucp;
import X.InterfaceC77611Ud5;
import X.InterfaceC77675Ue7;
import X.InterfaceC77676Ue8;
import X.InterfaceC77682UeE;
import X.T4W;
import X.UI8;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.live.wallet.view.recharge.BaseRechargeFragment;
import com.bytedance.android.live.wallet.viewmodel.recharge.singlepage.SingleRechargeVM;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeInsufficientPackageRecommendationTimeout;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class SingleRechargeFragment extends BaseRechargeFragment implements InterfaceC77676Ue8, InterfaceC77595Ucp {
    public static final /* synthetic */ int LJLJLJ = 0;
    public InterfaceC77611Ud5 LJLILLLLZI;
    public C77591Ucl LJLJI;
    public C32357Cmv LJLJJI;
    public C48292IxM LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C5H3 LJLJJLL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 182));

    @Override // com.bytedance.android.live.wallet.view.recharge.BaseRechargeFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC77595Ucp
    public final void l4(NoticesResult.Notice notice) {
    }

    @Override // X.InterfaceC77595Ucp
    public final void me(DiamondPackageExtra diamondPackageExtra, List<? extends Diamond> productList) {
        o.LJIIIZ(productList, "productList");
    }

    @Override // com.bytedance.android.live.wallet.view.recharge.BaseRechargeFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    static {
        C65352Pkq.LIZ(SingleRechargeFragment.class).LJFF();
    }

    @Override // X.InterfaceC77595Ucp
    public final void LJII() {
        C32357Cmv c32357Cmv = this.LJLJJI;
        if (c32357Cmv != null) {
            c32357Cmv.LIZ.LIZLLL();
        } else {
            o.LJIJI("rechargeStatusView");
            throw null;
        }
    }

    @Override // X.InterfaceC77595Ucp
    public final void LJIJ() {
        C32357Cmv c32357Cmv = this.LJLJJI;
        if (c32357Cmv != null) {
            c32357Cmv.LIZ.LIZ();
        } else {
            o.LJIJI("rechargeStatusView");
            throw null;
        }
    }

    @Override // X.InterfaceC77595Ucp
    public final void LLLLLILLIL() {
        C48292IxM c48292IxM = this.LJLJJL;
        if (c48292IxM != null) {
            try {
                DialogC31813Ce9 dialogC31813Ce9 = (DialogC31813Ce9) c48292IxM.LIZ;
                if (dialogC31813Ce9 != null) {
                    C29306Beo.LJJJJ(dialogC31813Ce9);
                }
            } catch (Exception e) {
                C0NB.LJII(e);
            }
        }
        C51029K0z.LJIILIIL(this);
    }

    public final C77591Ucl vl() {
        C77591Ucl c77591Ucl = this.LJLJI;
        if (c77591Ucl != null) {
            return c77591Ucl;
        }
        o.LJIJI("rechargeConfig");
        throw null;
    }

    public final InterfaceC77611Ud5 wl() {
        InterfaceC77611Ud5 interfaceC77611Ud5 = this.LJLILLLLZI;
        if (interfaceC77611Ud5 != null) {
            return interfaceC77611Ud5;
        }
        o.LJIJI("rechargeDialog");
        throw null;
    }

    public final SingleRechargeVM xl() {
        return (SingleRechargeVM) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC77676Ue8
    public final void fb(C73039SlX c73039SlX) {
        _$_findCachedViewById(R.id.dde).setVisibility(0);
        _$_findCachedViewById(R.id.mbc).setVisibility(0);
        _$_findCachedViewById(R.id.ave).setVisibility(0);
        _$_findCachedViewById(R.id.cah).setVisibility(0);
        if (C77649Udh.LIZ() instanceof C77706Uec) {
            C77591Ucl vl = vl();
            ShowGiftFragment showGiftFragment = new ShowGiftFragment();
            showGiftFragment.LJLILLLLZI = c73039SlX;
            showGiftFragment.LJLJI = vl;
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJIIJ(showGiftFragment, null, R.id.dde);
            c1b3.LJII();
        } else {
            vl();
            ShowPkgFragment showPkgFragment = new ShowPkgFragment();
            showPkgFragment.LJLIL = c73039SlX;
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            C1B3 c1b32 = new C1B3(childFragmentManager2);
            c1b32.LJIIJ(showPkgFragment, null, R.id.dde);
            c1b32.LJII();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C15380j0.LJIILJJIL(R.string.t1n));
        if (C77649Udh.LIZ() instanceof C77706Uec) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('(');
            LIZ.append("{icon}");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b0.LIZJ(LIZ, c73039SlX.LIZ.count, ')', LIZ));
            Drawable LJI = C15380j0.LJI(R.drawable.cub);
            int LIZ2 = C15380j0.LIZ(13.5f);
            LJI.setBounds(0, 0, LIZ2, LIZ2);
            spannableStringBuilder2.setSpan(new C32207CkV(LJI), 1, 7, 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        ((C2A7) _$_findCachedViewById(R.id.ave)).setText(spannableStringBuilder);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        wl().dismiss();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // X.InterfaceC77595Ucp
    public final void j7(Diamond diamond, C77612Ud6 c77612Ud6) {
        SingleRechargeVM xl = xl();
        xl.getClass();
        C77541Ubx.LJIL(diamond.count, String.valueOf(c77612Ud6.LIZIZ), String.valueOf(Integer.valueOf(c77612Ud6.LIZJ)), xl.LJLLL, xl.LJLLLL, false, xl.rv0(), true, xl.LJLJL, false, false);
        InterfaceC77682UeE Fk = wl().Fk();
        if (Fk != null) {
            Fk.onSuccess(diamond.id);
        }
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.so5));
        xl().pv0(diamond, c77612Ud6.LIZJ);
        if (vl().LIZLLL == 0) {
            CMR.LIZ(mo49getActivity());
        }
        long hv0 = xl().hv0();
        if (diamond.count + hv0 < 0) {
            SingleRechargeVM xl2 = xl();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            int i = diamond.count;
            xl2.getClass();
            BaseRechargeViewModel.ov0(mo49getActivity, i, i + hv0, i);
        }
        wl().dismiss();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        BEQ beq = (BEQ) view.findViewById(R.id.kf_);
        o.LJIIIIZZ(beq, "view.status_view");
        C32357Cmv c32357Cmv = new C32357Cmv(beq, vl());
        this.LJLJJI = c32357Cmv;
        LayoutInflater layoutInflater = getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "layoutInflater");
        c32357Cmv.LIZIZ(layoutInflater, null);
        C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.mbc), new ACListenerS33S0100000_13(this, 170));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.ave), new ACListenerS33S0100000_13(this, 171));
        C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.f0h), new ACListenerS33S0100000_13(this, 172));
        View iv_close = _$_findCachedViewById(R.id.f0h);
        o.LJIIIIZZ(iv_close, "iv_close");
        C72259SXn.LIZIZ(iv_close, 20, 20, 20, 20);
        SingleRechargeVM xl = xl();
        InterfaceC77595Ucp interfaceC77595Ucp = xl.LJLIL;
        if (interfaceC77595Ucp != null) {
            interfaceC77595Ucp.LJII();
        }
        long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        RecommendStrategyParam recommendStrategyParam = new RecommendStrategyParam();
        String str = xl.LJLLL.LJI;
        o.LJIIIZ(str, "<set-?>");
        recommendStrategyParam.scene = str;
        String str2 = xl.LJLLL.LIZJ;
        o.LJIIIZ(str2, "<set-?>");
        recommendStrategyParam.chargeReason = str2;
        recommendStrategyParam.giftIds = C47261Igj.LJJIJIL(Long.valueOf(xl.LJLLL.LJ));
        long j = xl.LJLLL.LJII;
        recommendStrategyParam.giftTotalCoins = j;
        recommendStrategyParam.coinsGap = j - LIZ;
        xl.lv0(recommendStrategyParam, EnumC77641UdZ.NON_USE_AND_NON_CACHE, LiveRechargeInsufficientPackageRecommendationTimeout.INSTANCE.getValue(), false);
    }

    @Override // X.InterfaceC77595Ucp
    public final void s8(int i, long j) {
        String str;
        Resources resources;
        if (this.LJLJJL == null) {
            this.LJLJJL = new C48292IxM(3);
        }
        C48292IxM c48292IxM = this.LJLJJL;
        if (c48292IxM != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && mo49getActivity.isFinishing()) {
                return;
            }
            if (c48292IxM.LIZ == null) {
                c48292IxM.LIZ = new C31767CdP(mo49getActivity).LIZ();
            }
            DialogC31813Ce9 dialogC31813Ce9 = (DialogC31813Ce9) c48292IxM.LIZ;
            if (dialogC31813Ce9 != null) {
                if (i == 0) {
                    str = "";
                } else if (mo49getActivity != null && (resources = mo49getActivity.getResources()) != null) {
                    str = resources.getString(i);
                } else {
                    str = null;
                }
                dialogC31813Ce9.LJLILLLLZI = str;
                T4W t4w = dialogC31813Ce9.LJLJI;
                if (t4w != null) {
                    t4w.setMessage(str);
                }
            }
            Dialog dialog = (Dialog) c48292IxM.LIZ;
            if (dialog == null) {
                return;
            }
            C29306Beo.LJJJJIZL(dialog);
        }
    }

    @Override // X.InterfaceC77595Ucp
    public final void df(int i, int i2, Exception exception) {
        o.LJIIIZ(exception, "exception");
        InterfaceC11100c6.LIZ.getClass();
        C11090c5.LIZ().LIZJ(InterfaceC77675Ue7.class, new C77702UeY());
        wl().d7();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5g, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.InterfaceC77595Ucp
    public final void B4(int i, int i2, int i3, C77518Uba c77518Uba) {
        InterfaceC77682UeE Fk = wl().Fk();
        if (Fk != null) {
            Fk.LIZ(c77518Uba.LIZ);
        }
        c77518Uba.LJFF.put("request_page", vl().LJIIJJI);
        c77518Uba.LJ = new UI8(i, i2, i3, c77518Uba.LIZ, true, vl().LIZJ, xl().rv0().count, false);
        C77607Ud1.LIZ().LIZ(getContext(), "recharge_pay_fail", c77518Uba);
    }
}
