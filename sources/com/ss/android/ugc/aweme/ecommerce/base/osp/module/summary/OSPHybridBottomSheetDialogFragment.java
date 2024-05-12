package com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C38956FQq;
import X.C3C5;
import X.C40127Fox;
import X.C40342FsQ;
import X.C40343FsR;
import X.C60193Njp;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.E98;
import X.NVG;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSPHybridBottomSheetDialogFragment extends CommerceBottomSheetDialogFragment {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSPHybridBottomSheetDialogFragment(String title, String url) {
        super(false, 1, null);
        o.LJIIIZ(title, "title");
        o.LJIIIZ(url, "url");
        this.LJLJI = new LinkedHashMap();
        this.LJLIL = title;
        this.LJLILLLLZI = url;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZ(this.LJLIL);
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZIZ(new AqS160S0100000_10(this, 170));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer) {
            Uri LIZ = E98.LIZ(C38956FQq.LIZIZ(this.LJLILLLLZI), "aweme");
            _$_findCachedViewById(R.id.k98);
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "this@OSPHybridBottomShee…Fragment.requireContext()");
            SparkContext sparkContext = new SparkContext();
            String uri = LIZ.toString();
            o.LJIIIIZZ(uri, "sparkUri.toString()");
            sparkContext.LJJIJLIJ(uri);
            c40342FsQ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C40343FsR.LIZ(C40342FsQ.LIZ(requireContext, sparkContext));
            LIZ2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ((ViewGroup) _$_findCachedViewById(R.id.k98)).addView(LIZ2);
            LIZ2.LIZIZ();
            return;
        }
        C60193Njp c60193Njp = (C60193Njp) _$_findCachedViewById(R.id.b14);
        c60193Njp.LIZLLL(BulletService.LIZ().LJIILIIL());
        IBulletService LIZ3 = BulletService.LIZ();
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        c60193Njp.n8(LIZ3.LJIIJJI(requireContext2), 17, 0, 0, 0, 0);
        NVG.LIZ(c60193Njp, C38956FQq.LIZIZ(this.LJLILLLLZI), null, null, 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a1h, viewGroup, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a1e, viewGroup, false);
        }
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
