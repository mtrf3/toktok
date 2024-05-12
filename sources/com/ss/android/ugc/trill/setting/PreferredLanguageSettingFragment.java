package com.ss.android.ugc.trill.setting;

import X.ASQ;
import X.ASX;
import X.AbstractC029409q;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C109824Ss;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C2299390r;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25893AEf;
import X.C25895AEh;
import X.C25907AEt;
import X.C26045AKb;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C40328FsC;
import X.C47261Igj;
import X.C62822Ol8;
import X.C73969T1h;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.HG3;
import X.InterfaceC25897AEj;
import X.InterfaceC25906AEs;
import X.KL2;
import X.ORY;
import X.ORZ;
import X.RBX;
import X.T16;
import Y.ACListenerS24S0100000_4;
import Y.AObserverS72S0100000_4;
import Y.IDrS44S0100000_4;
import Y.IDxS25S0300000_4;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationLangKevaServiceImpl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PreferredLanguageSettingFragment extends Fragment implements InterfaceC25897AEj, InterfaceC25906AEs {
    public static final /* synthetic */ int LJLL = 0;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public int LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public PreferredLanguageSettingFragment() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 983));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 986));
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 985));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 984));
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 979));
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1455));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1454));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 987));
    }

    public final View vl() {
        return (View) this.LJLJJL.getValue();
    }

    public final RecyclerView w6() {
        return (RecyclerView) this.LJLIL.getValue();
    }

    public final C252709vu wl() {
        return (C252709vu) this.LJLJI.getValue();
    }

    public final PreferredLanguageSettingPageViewModel xl() {
        return (PreferredLanguageSettingPageViewModel) this.LJLJLLL.getValue();
    }

    public final boolean Al() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("IS_HALF_SHEET");
        }
        return false;
    }

    public final void Dl() {
        PreferredLanguageSettingPageViewModel xl = xl();
        xl.LJLJJLL.postValue(Boolean.TRUE);
        C25907AEt c25907AEt = xl.LJLLLL;
        List gv0 = PreferredLanguageSettingPageViewModel.gv0(xl.LJLJLLL.getValue());
        ArrayList arrayList = new ArrayList(C32I.LJJL(gv0, 10));
        Iterator it = gv0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C25895AEh) it.next()).LJLIL);
        }
        String[] contentLanguageCodes = (String[]) arrayList.toArray(new String[0]);
        List gv02 = PreferredLanguageSettingPageViewModel.gv0(xl.LJLJLLL.getValue());
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(gv02, 10));
        Iterator it2 = gv02.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C25895AEh) it2.next()).LJLILLLLZI);
        }
        String[] contentLanguagesNames = (String[]) arrayList2.toArray(new String[0]);
        c25907AEt.getClass();
        o.LJIIIZ(contentLanguageCodes, "contentLanguageCodes");
        o.LJIIIZ(contentLanguagesNames, "contentLanguagesNames");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        c25907AEt.LIZIZ.setContentLanguage("content_language", ORY.LJJJJLL(contentLanguageCodes, ",", null, null, null, 62), 2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS25S0300000_4(c25907AEt, contentLanguageCodes, contentLanguagesNames, 1));
    }

    @Override // X.InterfaceC25897AEj
    public final void Dk(boolean z) {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("enter_from")) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", string);
            FMX.LJIIL("enter_preferred_lang_more", c188727au.LIZ);
        }
        PreferredLanguageSettingPageViewModel xl = xl();
        xl.LJLJL.setValue(Boolean.valueOf(z));
        MutableLiveData<Boolean> mutableLiveData = xl.LJLJL;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    @Override // X.InterfaceC25906AEs
    public final void pb(Throwable th) {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.g5w);
        c26045AKb.LJIIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC25906AEs
    public final void Wf(String[] selectedLanguageCodes, String[] selectedLanguageNames) {
        ActivityC45651qj mo49getActivity;
        String string;
        String str;
        MutableLiveData mutableLiveData;
        Boolean bool;
        o.LJIIIZ(selectedLanguageCodes, "selectedLanguageCodes");
        o.LJIIIZ(selectedLanguageNames, "selectedLanguageNames");
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("enter_from")) != null) {
            boolean LJJIJIIJIL = ORY.LJJIJIIJIL(SettingServiceImpl.LIZ().getAppLanguage(), selectedLanguageCodes);
            List LJLJJL = ORZ.LJLJJL(ORY.LJJLIIIJLJLI(4, C2299390r.LIZ()));
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
            Iterator it = LJLJJL.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                Integer num = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        if (ORY.LJJIJIIJIL(((ContentLanguage) next).getLanguageCode(), selectedLanguageCodes)) {
                            num = Integer.valueOf(i2);
                        }
                        arrayList.add(num);
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                } else {
                    Object[] array = ORZ.LJLJJL(ORZ.LJLL(arrayList)).toArray(new Integer[0]);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", string);
                    c188727au.LJFF(selectedLanguageCodes, "lang");
                    c188727au.LIZLLL(selectedLanguageCodes.length, "lang_num");
                    c188727au.LIZLLL(LJJIJIIJIL ? 1 : 0, "is_app_lang");
                    c188727au.LJFF(array, "lang_rank");
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        num = Integer.valueOf(arguments2.getInt("previous_popup_shown_count"));
                    }
                    c188727au.LJFF(num, "previous_popup_cnt");
                    String[] strArr = xl().LJLJJI;
                    if (ORY.LJJJI(strArr) >= 0) {
                        str = strArr[0];
                    } else {
                        str = "";
                    }
                    c188727au.LJIIIZ("model_language", str);
                    if (Al() && (mutableLiveData = xl().LJLLJ) != null && (bool = (Boolean) mutableLiveData.getValue()) != null && bool.booleanValue()) {
                        i = 1;
                    }
                    c188727au.LIZLLL(i, "is_show_more");
                    FMX.LJIIL("save_preferred_lang", c188727au.LIZ);
                }
            }
        }
        TranslationLangKevaServiceImpl.LJIIZILJ().LJIIJ(selectedLanguageCodes);
        TranslationLangKevaServiceImpl.LJIIZILJ().LJIILJJIL(selectedLanguageNames);
        if (Al() && (mo49getActivity = mo49getActivity()) != null) {
            C40328FsC.LIZLLL(mo49getActivity, R.string.hpz);
        }
        if (Al()) {
            ASQ.LJ(this, ASX.LIZ);
            return;
        }
        Intent intent = new Intent();
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            mo49getActivity2.setResult(-1, intent);
        }
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 == null) {
            return;
        }
        mo49getActivity3.finish();
    }

    @Override // X.InterfaceC25897AEj
    public final void gf(String code, boolean z) {
        o.LJIIIZ(code, "code");
        if (o.LJ(xl().LJLL.getValue(), Boolean.FALSE)) {
            PreferredLanguageSettingPageViewModel xl = xl();
            xl.getClass();
            List<C25895AEh> value = xl.LJLJLLL.getValue();
            C25895AEh c25895AEh = null;
            if (value != null) {
                Iterator<C25895AEh> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C25895AEh next = it.next();
                    if (o.LJ(code, next.LJLIL)) {
                        c25895AEh = next;
                        break;
                    }
                }
                C25895AEh c25895AEh2 = c25895AEh;
                if (c25895AEh2 != null) {
                    c25895AEh2.LJLJI = z;
                }
            }
            List gv0 = PreferredLanguageSettingPageViewModel.gv0(xl.LJLJLLL.getValue());
            ArrayList arrayList = new ArrayList(C32I.LJJL(gv0, 10));
            Iterator it2 = gv0.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C25895AEh) it2.next()).LJLIL);
            }
            xl.LJLJLJ.postValue(Boolean.valueOf(!ORY.LJLIL(xl.LJLJI).equals(ORY.LJLIL(arrayList.toArray(new String[0])))));
            MutableLiveData<List<C25895AEh>> mutableLiveData = xl.LJLJLLL;
            mutableLiveData.postValue(mutableLiveData.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView w6;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView w62 = w6();
        if (w62 != null) {
            w62.setAdapter(new C25893AEf(this));
            w62.getContext();
            w62.setLayoutManager(new WrapLinearLayoutManager());
        }
        if (Al()) {
            String[] strArr = xl().LJLJJI;
            if (ORY.LJJJI(strArr) >= 0) {
                str = strArr[0];
            } else {
                str = "";
            }
            if (o.LJ(str, SettingServiceImpl.LIZ().getAppLanguage())) {
                RecyclerView w63 = w6();
                AbstractC029409q abstractC029409q = null;
                if (w63 != null) {
                    abstractC029409q = w63.getAdapter();
                }
                if ((abstractC029409q instanceof C25893AEf) && abstractC029409q != null) {
                    abstractC029409q.notifyDataSetChanged();
                }
            }
        }
        if (Al()) {
            C252709vu wl = wl();
            if (wl != null) {
                C235119Kp c235119Kp = new C235119Kp();
                C9KF c9kf = new C9KF();
                String string = getString(R.string.hps);
                o.LJIIIIZZ(string, "getString(R.string.langu…etting_onboarding_title2)");
                c9kf.LIZJ = string;
                c235119Kp.LIZJ = c9kf;
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_x_mark_small;
                LIZJ.LIZIZ(new AqS154S0100000_4(this, 980));
                c235119Kp.LIZIZ(LIZJ);
                wl.setNavActions(c235119Kp);
            }
            C252709vu wl2 = wl();
            if (wl2 != null) {
                wl2.setNavBackground(-1);
            }
            C252709vu wl3 = wl();
            if (wl3 != null) {
                wl3.setAlpha(0.0f);
            }
            C252709vu wl4 = wl();
            if (wl4 != null) {
                wl4.setVisibility(0);
            }
            C252709vu c252709vu = (C252709vu) this.LJLILLLLZI.getValue();
            if (c252709vu != null) {
                C235119Kp c235119Kp2 = new C235119Kp();
                C234529Ii LIZJ2 = s1.LIZJ();
                LIZJ2.LIZJ = R.raw.icon_x_mark_small;
                c235119Kp2.LIZIZ(LIZJ2);
                c252709vu.setNavActions(c235119Kp2);
            }
            View view2 = (View) this.LJLILLLLZI.getValue();
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View vl = vl();
            if (vl != null) {
                vl.setVisibility(0);
            }
            View vl2 = vl();
            if (vl2 != null) {
                C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 204), vl2);
            }
            View vl3 = vl();
            if (vl3 != null) {
                vl3.setEnabled(true);
            }
            RecyclerView w64 = w6();
            if (w64 != null) {
                w64.setPadding(0, 0, 0, (int) KL2.LIZJ(getContext(), 20.0f));
            }
        } else {
            C252709vu wl5 = wl();
            if (wl5 != null) {
                C235119Kp c235119Kp3 = new C235119Kp();
                C234509Ig c234509Ig = new C234509Ig();
                String string2 = getString(R.string.cel);
                o.LJIIIIZZ(string2, "getString(R.string.button_cancel)");
                c234509Ig.LIZJ = string2;
                c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 981));
                C9KF LIZLLL = t1.LIZLLL(c235119Kp3, new AbstractC234519Ih[]{c234509Ig});
                String string3 = getString(R.string.hpt);
                o.LJIIIIZZ(string3, "getString(R.string.langu…etting_onboarding_title3)");
                LIZLLL.LIZJ = string3;
                c235119Kp3.LIZJ = LIZLLL;
                C234509Ig c234509Ig2 = new C234509Ig();
                String string4 = getString(R.string.gi1);
                o.LJIIIIZZ(string4, "getString(R.string.finish)");
                c234509Ig2.LIZJ = string4;
                c234509Ig2.LIZIZ = "nav_end";
                c234509Ig2.LIZ = new C109824Ss(new AqS154S0100000_4(this, 982));
                c235119Kp3.LIZIZ(c234509Ig2);
                wl5.setNavActions(c235119Kp3);
            }
            C252709vu wl6 = wl();
            if (wl6 != null) {
                wl6.setVisibility(0);
            }
            View vl4 = vl();
            if (vl4 != null) {
                vl4.setVisibility(8);
            }
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
            o.LJI(LJI);
            int intValue = LJI.intValue();
            view.setBackgroundColor(intValue);
            C252709vu wl7 = wl();
            if (wl7 != null) {
                wl7.setNavBackground(intValue);
            }
            C252709vu c252709vu2 = (C252709vu) this.LJLILLLLZI.getValue();
            if (c252709vu2 != null) {
                c252709vu2.setNavBackground(intValue);
            }
        }
        xl().LJLLILLLL.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 19));
        xl().LJLLJ.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 20));
        xl().LJLLL.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 21));
        xl().LJLLI.observe(getViewLifecycleOwner(), new AObserverS72S0100000_4(this, 18));
        if (Al() && (w6 = w6()) != null) {
            w6.LJIIJJI(new IDrS44S0100000_4(this, 9));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.clc, viewGroup, false);
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
