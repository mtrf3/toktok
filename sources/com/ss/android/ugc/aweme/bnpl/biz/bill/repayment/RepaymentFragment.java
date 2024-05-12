package com.ss.android.ugc.aweme.bnpl.biz.bill.repayment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C29S;
import X.C39647FhD;
import X.C3C5;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C91832a0y;
import X.C91851a1H;
import X.C91924a2S;
import X.C92217a7B;
import X.C92549aCX;
import X.C92550aCY;
import X.EnumC92109a5R;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.QD3;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class RepaymentFragment extends BaseFragment implements JBS {
    public final C214378bB LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // X.JBS
    public final /* synthetic */ void onBackPressed_Activity() {
        JBR.LIZIZ(this);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    public RepaymentFragment() {
        AqS60S0110000_3 LJJ;
        C65776Prg LIZ = C65352Pkq.LIZ(RepaymentViewModel.class);
        C92550aCY c92550aCY = C92550aCY.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c92550aCY, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        KeyboardUtils.LJ(16, 240, mo49getActivity());
        fragmentConfiguration(C92549aCX.LJLIL);
        EventBus.LIZJ().LJIILJJIL(this);
        C91924a2S c91924a2S = C91924a2S.LIZ;
        RepaymentArg repaymentArg = (RepaymentArg) this.LJLIL.getValue();
        if (repaymentArg != null) {
            str = repaymentArg.getPreviousPageId();
        } else {
            str = null;
        }
        c91924a2S.LIZIZ("bnpl_start_repayment", str);
    }

    @QD3
    public final void onEvent(C92217a7B event) {
        o.LJIIIZ(event, "event");
        Iterator<Map.Entry<String, WeakReference<Activity>>> it = C91851a1H.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            WeakReference<Activity> value = it.next().getValue();
            Activity activity = value.get();
            if (activity != null) {
                activity.finish();
                value.clear();
            }
        }
        C91851a1H.LIZ.clear();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new IDqS418S0100000_31(this, 15));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C91832a0y c91832a0y = ((RepaymentViewModel) this.LJLILLLLZI.getValue()).LJLJJI;
        if (c91832a0y != null && i == c91832a0y.LIZIZ && i2 == -1) {
            if (intent != null) {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "code");
                C16880lQ.LLJJIJIIJIL(intent, "msg");
                if (LLJJIJIIJIL != null) {
                    c91832a0y.LIZ.onResult(EnumC92109a5R.valueOf(LLJJIJIIJIL).getValue());
                    return;
                }
            }
            c91832a0y.LIZ.onResult(EnumC92109a5R.INNER_EXCEPTION.getValue());
        }
    }

    @Override // X.JBS
    public final void onActivityResult_Activity(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a7, viewGroup, false);
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
