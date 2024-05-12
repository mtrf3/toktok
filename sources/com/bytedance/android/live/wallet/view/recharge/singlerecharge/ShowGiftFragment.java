package com.bytedance.android.live.wallet.view.recharge.singlerecharge;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C15490jB;
import X.C15640jQ;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C41081jM;
import X.C47261Igj;
import X.C63129Oq5;
import X.C73039SlX;
import X.C76800UCe;
import X.C77591Ucl;
import X.C77616UdA;
import X.C77617UdB;
import X.C77619UdD;
import X.C77667Udz;
import X.C77686UeI;
import X.C90903hW;
import X.InterfaceC77693UeP;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ShowGiftFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJL = 0;
    public C73039SlX LJLILLLLZI;
    public C77591Ucl LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final List<InterfaceC77693UeP> LJLIL = C47261Igj.LJJIJIL(new C77617UdB(), new C77616UdA(), new C77619UdD(), new C77686UeI());

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC77693UeP interfaceC77693UeP;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C73039SlX c73039SlX = this.LJLILLLLZI;
        String str2 = null;
        if (c73039SlX != null) {
            String quantityString = getResources().getQuantityString(R.plurals.oi, (int) c73039SlX.LIZIZ);
            o.LJIIIIZZ(quantityString, "resources\n            .g…vailableDiamonds.toInt())");
            String LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(quantityString, "{number_1}", String.valueOf(c73039SlX.LIZIZ), false), "{number_2}", String.valueOf(c73039SlX.LIZ.count), false);
            String str3 = c73039SlX.LIZ.price;
            str3.toString();
            String LJJJJZ2 = ujb.o.LJJJJZ(LJJJJZ, "{amount}", str3, false);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.nv6);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_recharge_title)");
            C77667Udz c77667Udz = new C77667Udz(LJIILJJIL, LJJJJZ2);
            Iterator<InterfaceC77693UeP> it = this.LJLIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    interfaceC77693UeP = it.next();
                    InterfaceC77693UeP interfaceC77693UeP2 = interfaceC77693UeP;
                    C77591Ucl c77591Ucl = this.LJLJI;
                    if (c77591Ucl != null) {
                        if (interfaceC77693UeP2.LIZIZ(c77591Ucl.LJ, c77591Ucl.LIZJ)) {
                            break;
                        }
                    } else {
                        o.LJIJI("rechargeDialogConfig");
                        throw null;
                    }
                } else {
                    interfaceC77693UeP = null;
                    break;
                }
            }
            InterfaceC77693UeP interfaceC77693UeP3 = interfaceC77693UeP;
            if (interfaceC77693UeP3 != null) {
                C77591Ucl c77591Ucl2 = this.LJLJI;
                if (c77591Ucl2 != null) {
                    interfaceC77693UeP3.LIZ(c77667Udz, c77591Ucl2.LJ);
                } else {
                    o.LJIJI("rechargeDialogConfig");
                    throw null;
                }
            }
            ((TextView) _$_findCachedViewById(R.id.mo6)).setText(c77667Udz.LIZLLL);
            ((TextView) _$_findCachedViewById(R.id.mlu)).setText(c77667Udz.LJ);
            if (c77667Udz.LIZ != null) {
                C15640jQ.LIZLLL((ImageView) _$_findCachedViewById(R.id.f3t), c77667Udz.LIZ);
                return;
            }
            if (c77667Udz.LIZIZ != null) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.f3t);
                C63129Oq5 c63129Oq5 = c77667Udz.LIZIZ;
                if (c63129Oq5 != null) {
                    str = c63129Oq5.LJLIL;
                    str2 = c63129Oq5.LIZ();
                } else {
                    str = null;
                }
                C15490jB.LJ(_$_findCachedViewById, str, str2);
                return;
            }
            if (c77667Udz.LIZJ == 0) {
                return;
            }
            ((C41081jM) _$_findCachedViewById(R.id.f3t)).setImageResource(c77667Udz.LIZJ);
            return;
        }
        o.LJIJI("data");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5e, viewGroup, false);
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
}
