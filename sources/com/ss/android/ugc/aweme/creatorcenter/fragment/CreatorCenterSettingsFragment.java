package com.ss.android.ugc.aweme.creatorcenter.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C25848ACm;
import X.C25849ACn;
import X.C25851ACp;
import X.C25873ADl;
import X.C29S;
import X.C3C5;
import X.C55888Lwa;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78496UrM;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.EnumC42934Gt8;
import X.HG3;
import X.InterfaceC61213O0r;
import X.RBX;
import X.SYL;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.setting.ui.cell.SettingHeaderCell;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class CreatorCenterSettingsFragment extends BaseFragment {
    public C252709vu LJLIL;
    public SYL LJLILLLLZI;
    public C25849ACn LJLJI;
    public C25849ACn LJLJJI;
    public C25849ACn LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 101));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    public final C25851ACp vl() {
        return (C25851ACp) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C25873ADl.LJLIL);
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 1162));
            c252709vu.LIZJ(LIZJ);
        }
        C252709vu c252709vu2 = this.LJLIL;
        if (c252709vu2 != null) {
            C9KF c9kf = new C9KF();
            String string = getString(R.string.e_3);
            o.LJIIIIZZ(string, "getString(R.string.creat…creen_screenHeader_Title)");
            c9kf.LIZJ = string;
            c252709vu2.LJIILLIIL(c9kf);
        }
        C252709vu c252709vu3 = this.LJLIL;
        if (c252709vu3 != null) {
            c252709vu3.LJIILJJIL(false);
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
        if (LJI != null) {
            int intValue = LJI.intValue();
            C252709vu c252709vu4 = this.LJLIL;
            if (c252709vu4 != null) {
                c252709vu4.setNavBackground(intValue);
            }
        }
        SYL syl = this.LJLILLLLZI;
        if (syl != null) {
            syl.LLLF.LJZL(SettingHeaderCell.class);
        }
        boolean adAuthorization = ((RBX) HG3.LJIILL()).getCurUser().getAdAuthorization();
        C25851ACp vl = vl();
        String string2 = getString(R.string.hvy);
        String string3 = getString(R.string.hvz);
        ACListenerS24S0100000_4 aCListenerS24S0100000_4 = new ACListenerS24S0100000_4(this, 266);
        o.LJIIIIZZ(string2, "getString(R.string.location_change_ad_setting)");
        C25849ACn c25849ACn = new C25849ACn(new C25848ACm(adAuthorization, string2, aCListenerS24S0100000_4, true, null, null, null, string3, false, true, false, null, 56304));
        this.LJLJI = c25849ACn;
        vl.LIZ(c25849ACn);
        C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
        if (c55888Lwa.LJIIZILJ()) {
            C25851ACp vl2 = vl();
            String string4 = getString(R.string.e_m);
            String string5 = getString(R.string.e_n);
            boolean LJJI = c55888Lwa.LJJI(false);
            ACListenerS24S0100000_4 aCListenerS24S0100000_42 = new ACListenerS24S0100000_4(this, 268);
            o.LJIIIIZZ(string4, "getString(R.string.creat…orTools_setting_headline)");
            C25849ACn c25849ACn2 = new C25849ACn(new C25848ACm(LJJI, string4, aCListenerS24S0100000_42, true, null, null, null, string5, false, false, false, null, 64496));
            this.LJLJJI = c25849ACn2;
            vl2.LIZ(c25849ACn2);
        }
        if (!AnchorListServiceImpl.LIZLLL().LIZJ(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) ? AutoSoundCheckService.LIZLLL().LIZ() : ECommerceAnchorService.LJJJJI().LJJIIZI()) {
            AutoSoundCheckService.LIZLLL().LIZJ(new AqS170S0100000_4(this, 1113));
        }
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        Integer LJI2 = C79045V0n.LJI(R.attr.c9, requireContext2);
        if (LJI2 != null) {
            view.setBackgroundColor(LJI2.intValue());
        }
        vl().LIZLLL();
        view.post(new ARunnableS40S0100000_4(this, 23));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cjy, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
        this.LJLIL = (C252709vu) LIZIZ.findViewById(R.id.la4);
        this.LJLILLLLZI = (SYL) LIZIZ.findViewById(R.id.js3);
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
