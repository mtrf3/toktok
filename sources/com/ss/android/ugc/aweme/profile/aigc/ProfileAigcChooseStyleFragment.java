package com.ss.android.ugc.aweme.profile.aigc;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C00F;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C19N;
import X.C214298b3;
import X.C214528bQ;
import X.C223338pd;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C41163GDn;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC61213O0r;
import X.Q7K;
import X.STD;
import X.STS;
import X.STT;
import X.STV;
import X.SY4;
import X.TBT;
import Y.IDrS46S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public final class ProfileAigcChooseStyleFragment extends BaseFragment {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public ProfileAigcChooseStyleFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcStyleViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 836);
        STV stv = STV.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), stv, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), stv, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C41163GDn.LJLIL);
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int LIZIZ;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((C223338pd) _$_findCachedViewById(R.id.g7s)).LIZIZ();
        View findViewById = view.findViewById(R.id.kej);
        Context context = findViewById.getContext();
        if (context != null) {
            findViewById.getLayoutParams().height = C63081OpJ.LJJJJLI(context);
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 18));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getResources().getString(R.string.en);
        o.LJIIIIZZ(string, "resources.getString(R.st…electScreen_styles_title)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        if (C19N.LJ("aigc_creative_slow_max_limit_period_daily", true)) {
            LIZIZ = Q7K.LIZIZ("aigc_creative_slow_max_limit_count_daily", 1);
        } else {
            LIZIZ = Q7K.LIZIZ("aigc_creative_slow_max_limit_count_weekly", 1);
        }
        if (C00F.LIZ(31744, 0, "aigc_avatar_setting", true) == 1) {
            if (C19N.LJ("aigc_creative_slow_max_limit_period_daily", true)) {
                i = R.plurals.d;
            } else {
                i = R.plurals.e;
            }
        } else if (C19N.LJ("aigc_creative_slow_max_limit_period_daily", true)) {
            i = R.plurals.h;
        } else {
            i = R.plurals.i;
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ap4), new STS(this, i, LIZIZ));
        ProfileAigcStyleViewModel.hv0((ProfileAigcStyleViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.ELB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EL9) obj).LJLILLLLZI;
            }
        }, new AqS167S0100000_1(this, 19));
        C8VV.LIZ(this, false, new AqS178S0100000_12(this, 254));
        ProfileAigcStyleViewModel.hv0((ProfileAigcStyleViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.STU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EL9) obj).LJLIL;
            }
        }, new AqS178S0100000_12(this, 255));
        ((RecyclerView) _$_findCachedViewById(R.id.btw)).LJIIJJI(new IDrS46S0100000_7(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (onBackPressedDispatcher = mo49getActivity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new STT(this));
        }
        C29S c29s = null;
        STD.LIZ(null, "show");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c3c, viewGroup, false);
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
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
