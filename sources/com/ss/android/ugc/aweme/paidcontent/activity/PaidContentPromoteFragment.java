package com.ss.android.ugc.aweme.paidcontent.activity;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C254229yM;
import X.C29S;
import X.C3C5;
import X.C55230Lly;
import X.C55247LmF;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.GDV;
import X.HG3;
import X.InterfaceC61213O0r;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class PaidContentPromoteFragment extends BaseFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Intent intent;
        Intent intent2;
        fragmentConfiguration(GDV.LJLIL);
        super.onCreate(bundle);
        String curUserId = HG3.LJIILL().getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        long parseLong = CastLongProtector.parseLong(curUserId);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (intent2 = mo49getActivity.getIntent()) == null || (str = C16880lQ.LLJJIJIIJIL(intent2, "enter_from")) == null) {
            str = "";
        }
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            intent = mo49getActivity2.getIntent();
        } else {
            intent = null;
        }
        C254229yM c254229yM = new C254229yM(parseLong, 1, str, LIZ, intent, false, true, 0);
        C55247LmF.LIZIZ(C55230Lly.LIZJ(this, null), c254229yM, C254229yM.class, "source_default_key");
        C8VV.LIZ(this, false, new AqS132S0200000_1(this, c254229yM, 30));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aiv, viewGroup, false);
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
