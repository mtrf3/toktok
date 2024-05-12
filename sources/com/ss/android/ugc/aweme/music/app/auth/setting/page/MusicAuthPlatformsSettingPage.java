package com.ss.android.ugc.aweme.music.app.auth.setting.page;

import X.AG6;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C245319jz;
import X.C252669vq;
import X.C252709vu;
import X.C25851ACp;
import X.C62822Ol8;
import X.C73305Spp;
import X.C76800UCe;
import X.C94302aeo;
import X.C94413agb;
import X.C94577ajF;
import X.C94578ajG;
import X.C94579ajH;
import X.C94729alh;
import X.C94812an2;
import X.C9KF;
import X.DialogInterfaceOnCancelListenerC93580aTA;
import X.EnumC93896aYG;
import X.InterfaceC61213O0r;
import X.InterfaceC88472Yns;
import X.KMV;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.music.app.auth.setting.cell.DspPlatformCell;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes34.dex */
public final class MusicAuthPlatformsSettingPage extends BasePage {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 77));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.dwk;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final C25851ACp Al() {
        return (C25851ACp) this.LJLJI.getValue();
    }

    public final void Gl() {
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        c73305Spp.setVisibility(0);
        c73305Spp.LJFF();
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94812an2(this, null), 3);
    }

    public final void Hl(DspPlatform dspPlatform) {
        DspPlatform LJIIIIZZ = C94302aeo.LJIIIIZZ(null);
        if (LJIIIIZZ != DspPlatform.UNKNOWN && LJIIIIZZ != dspPlatform) {
            Jl(dspPlatform, LJIIIIZZ, true);
        } else {
            Dl(dspPlatform, LJIIIIZZ, true);
        }
    }

    public final void Il(DspPlatform selectedDspPlatform) {
        for (AG6<?> ag6 : Al().LIZIZ()) {
            if (ag6 instanceof C94413agb) {
                C94413agb c94413agb = (C94413agb) ag6;
                c94413agb.getClass();
                o.LJIIIZ(selectedDspPlatform, "selectedDspPlatform");
                c94413agb.LJIIJ(new IDqS175S0200000_42(selectedDspPlatform, c94413agb, 0));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.kp);
        }
        super.onBeforeActivityCreated(activity);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Al().LIZ.LLLF.LJZL(DspPlatformCell.class);
        fragmentConfiguration(C94729alh.LJLIL);
        ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(false);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_arrow_left_ltr;
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ(new IDqS423S0100000_42(this, 160));
        c235119Kp.LIZLLL(c234529Ii);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.baz);
        o.LJIIIIZZ(string, "getString(R.string.addMu…e_musicPage_sectionTitle)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        c252709vu.setNavActions(c235119Kp);
        Gl();
    }

    public final void Dl(DspPlatform dspPlatform, DspPlatform dspPlatform2, boolean z) {
        C94302aeo.LJJIJ(mo49getActivity(), dspPlatform, EnumC93896aYG.SELECT, new C94577ajF(this, dspPlatform, dspPlatform2, z), new C94578ajG(this, dspPlatform, z));
    }

    public final void Jl(DspPlatform dspPlatform, DspPlatform dspPlatform2, boolean z) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        String string = getString(R.string.bat, dspPlatform.getTitle(), dspPlatform2.getTitle());
        o.LJIIIIZZ(string, "getString(\n             ….title,\n                )");
        c245319jz.LIZ.LJLLILLLL = string;
        C252669vq c252669vq = new C252669vq();
        String string2 = getString(R.string.bar);
        o.LJIIIIZZ(string2, "getString(R.string.addMu…itchLinkActionSheet_cta1)");
        c252669vq.LIZ = string2;
        c252669vq.LJ = new ACListenerS21S0100000_1(new C94579ajH(this, dspPlatform, dspPlatform2, z), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZIZ(c252669vq);
        c245319jz.LIZ.LJLIL = new DialogInterfaceOnCancelListenerC93580aTA(dspPlatform, z);
        c245319jz.LIZJ().show(fragmentManager, "settings_music_auth_select_action_sheet");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity instanceof KMV) {
            ((KMV) mo49getActivity).onActivityResult_Activity(i, i2, intent);
        }
        switch (i) {
            case 3456:
                C94302aeo.LJLIL.LJIIZILJ(intent, mo49getActivity(), this, new IDqS423S0100000_42(this, 74));
                return;
            case 3457:
                C94302aeo.LJLIL.LJIILLIIL(intent, mo49getActivity(), this, new IDqS423S0100000_42(this, 75));
                return;
            case 3458:
                C94302aeo.LJLIL.LJIJ(i2, intent, mo49getActivity(), this, new IDqS423S0100000_42(this, 76));
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }
}
