package com.ss.android.ugc.aweme.paidcontent.manageseries.fragment;

import X.A1R;
import X.A1S;
import X.A1T;
import X.A1U;
import X.A1W;
import X.ActivityC45651qj;
import X.C04650Gf;
import X.C04740Go;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C252709vu;
import X.C29822Bn8;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C5H3;
import X.C61878OQg;
import X.C73305Spp;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC61213O0r;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class SeriesCreationIntroFragment extends BaseFragment {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public C73305Spp LJLJI;
    public View LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public SeriesCreationIntroFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArgNotNull(this, A1T.LJLIL, "enter_from", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArgNotNull(this, A1U.LJLIL, "entry_point", String.class);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(A1S.LJLIL);
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = view.findViewById(R.id.jp1);
        C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.jp8);
        this.LJLJI = c73305Spp;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            c73305Spp.LJFF();
        }
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.jp0);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 593));
        c252709vu.LIZJ(LIZJ);
        c252709vu.LJIILJJIL(false);
        c252709vu.LJIILL(R.style.ux);
        c252709vu.setNavBackground(0);
        c252709vu.setBackgroundColor(0);
        Context context = getContext();
        if (context != null) {
            C04740Go c04740Go = new C04740Go();
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(new A1R(C29822Bn8.LIZ(context, R.string.qjd, "context.resources.getStr…ox_pushNotifLanding_body)"), C29822Bn8.LIZ(context, R.string.qje, "context.resources.getStr…shNotifLanding_bodyLine2)"), C47261Igj.LJJIJIIJI("+", C29822Bn8.LIZ(context, R.string.ebb, "context.resources.getStr…ring.creator_tools_entry)"), C29822Bn8.LIZ(context, R.string.qnq, "context.resources.getStr…ing.series_profile_entry)"))), new A1R(C29822Bn8.LIZ(context, R.string.qjf, "context.resources.getStr…shNotifLanding_bodyLine3)"), C29822Bn8.LIZ(context, R.string.qjg, "context.resources.getStr…shNotifLanding_bodyLine4)"), C47261Igj.LJJIJIIJI(context.getResources().getString(R.string.qv), context.getResources().getString(R.string.qnc))), new A1R(C29822Bn8.LIZ(context, R.string.qjh, "context.resources.getStr…shNotifLanding_bodyLine5)"), C29822Bn8.LIZ(context, R.string.qji, "context.resources.getStr…shNotifLanding_bodyLine6)"), C61878OQg.INSTANCE));
            ActivityC45651qj mo49getActivity = mo49getActivity();
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("series_creation_intro_lottie_url", "https://p16-sg.tiktokcdn.com/obj/tiktok-creator-monetization-us/creation_series_video_tux_lottie.json");
            o.LJIIIIZZ(LJI, "getInstance()\n        .g…eFileSetting::class.java)");
            C04650Gf.LJIIIZ(mo49getActivity, LJI).LIZIZ(new A1W(c04740Go, context, LJJIJIIJI, this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aj6, viewGroup, false);
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
