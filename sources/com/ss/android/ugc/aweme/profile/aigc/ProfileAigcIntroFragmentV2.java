package com.ss.android.ugc.aweme.profile.aigc;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C26045AKb;
import X.C26357AWb;
import X.C29822Bn8;
import X.C29S;
import X.C39914FlW;
import X.C3C5;
import X.C41165GDp;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C71897SJp;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73969T1h;
import X.C76800UCe;
import X.C78999UzT;
import X.C90903hW;
import X.FMX;
import X.InterfaceC61213O0r;
import X.OPG;
import X.OPH;
import X.OPI;
import X.OPK;
import X.OPL;
import X.OSZ;
import X.T16;
import X.T5U;
import Y.ACListenerS30S0100000_10;
import Y.AfS62S0100000_10;
import Y.IDCSpanS0S0200000_1;
import Y.IDhS103S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC61213O0r(attachActivity = ProfileAigcIntroFragmentV2$$Activity.class)
/* loaded from: classes11.dex */
public final class ProfileAigcIntroFragmentV2 extends ProfileAigcIntroFragment {
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public boolean LJLLLL = true;
    public boolean LJLLLLLL = true;
    public OPL LJLZ = OPL.SLOW;
    public final C73318Sq2 LJZ = new C73318Sq2();
    public boolean LJZI = true;
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(C26357AWb.LJLIL);
    public boolean LL = true;

    @Override // com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
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

    @Override // com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void wl() {
        ActivityC45651qj mo49getActivity;
        if (this.LL && (mo49getActivity = mo49getActivity()) != null) {
            this.LL = false;
            C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
            c26045AKb.LJIIIIZZ(R.string.dj);
            c26045AKb.LIZLLL(3000L);
            c26045AKb.LJIIJ();
            C78999UzT.LJFF(AbstractC73672Svk.LJJLIIIJLJLI(3000L, TimeUnit.MILLISECONDS).LJJJLIIL(new AfS62S0100000_10(this, 19), OPG.LJLIL), this.LJZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJZI = false;
        this.LL = false;
        C78999UzT.LJFF(C73542Ste.LJII(AbstractC73638SvC.LJIILLIIL(OPI.LJLIL).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIJI(new IDhS103S0100000_10(this, 0)), OPH.LJLIL, null, 2), this.LJZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C41165GDp.LJLIL);
        super.onCreate(bundle);
        ProfileAIGCMainArg profileAIGCMainArg = (ProfileAIGCMainArg) this.LJLJJI.getValue();
        boolean z = true;
        if (profileAIGCMainArg != null) {
            Boolean introPageWithNavBar = profileAIGCMainArg.getIntroPageWithNavBar();
            if (introPageWithNavBar != null) {
                z = introPageWithNavBar.booleanValue();
            }
            this.LJLIL = z;
            this.LJLILLLLZI = profileAIGCMainArg.getEnterFrom();
            this.LJLJI = profileAIGCMainArg.getEnterMethod();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.LJLIL = arguments.getBoolean("intro_page_nav_bar", true);
        this.LJLILLLLZI = arguments.getString("enter_from");
        this.LJLJI = arguments.getString("enter_method");
    }

    public final void vl(OPL opl) {
        if (this.LJLLJ == null || this.LJLLL == null) {
            return;
        }
        if (opl == OPL.FAST && this.LJLLLLLL) {
            this.LJLZ = opl;
            ((C71897SJp) _$_findCachedViewById(R.id.ht7)).setChecked(false);
            _$_findCachedViewById(R.id.ht7).setVisibility(4);
            ((C71897SJp) _$_findCachedViewById(R.id.fui)).setChecked(true);
            _$_findCachedViewById(R.id.fui).setVisibility(0);
            _$_findCachedViewById(R.id.ht6).setBackgroundResource(R.drawable.bwa);
            _$_findCachedViewById(R.id.fuh).setBackgroundResource(R.drawable.bw_);
            return;
        }
        if (opl != OPL.SLOW || !this.LJLLLL) {
            return;
        }
        this.LJLZ = opl;
        ((C71897SJp) _$_findCachedViewById(R.id.ht7)).setChecked(true);
        _$_findCachedViewById(R.id.ht7).setVisibility(0);
        ((C71897SJp) _$_findCachedViewById(R.id.fui)).setChecked(false);
        _$_findCachedViewById(R.id.fui).setVisibility(4);
        _$_findCachedViewById(R.id.ht6).setBackgroundResource(R.drawable.bw_);
        _$_findCachedViewById(R.id.fuh).setBackgroundResource(R.drawable.bwa);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        OSZ osz;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.zn);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.aigc_intro_disclaimer)");
        this.LJLJJLL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.zo);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.aigc_intro_image)");
        this.LJLJJL = (SmartImageView) findViewById2;
        Context context = getContext();
        String str2 = null;
        if (context != null) {
            String LIZ = C29822Bn8.LIZ(context, R.string.da, "it.resources.getString(R…ing.AIGC_introPage_terms)");
            String LIZ2 = C29822Bn8.LIZ(context, R.string.db, "it.resources.getString(R…ng.AIGC_introPage_terms2)");
            SpannableString spannableString = new SpannableString(ujb.o.LJJJJZ(LIZ, "%@", LIZ2, false));
            IDCSpanS0S0200000_1 iDCSpanS0S0200000_1 = new IDCSpanS0S0200000_1(this, context, 0);
            Integer valueOf = Integer.valueOf(s.LJJLIIIJL(spannableString, LIZ2, 0, false, 6));
            if (valueOf.intValue() != -1) {
                osz = new OSZ(Integer.valueOf(valueOf.intValue()), Integer.valueOf(LIZ2.length()));
            } else {
                osz = new OSZ(0, Integer.valueOf(Math.min(LIZ2.length(), spannableString.length())));
            }
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue() + intValue;
            spannableString.setSpan(iDCSpanS0S0200000_1, intValue, intValue2, 33);
            spannableString.setSpan(new T5U(53, false), intValue, intValue2, 33);
            TuxTextView tuxTextView = this.LJLJJLL;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableString);
                TuxTextView tuxTextView2 = this.LJLJJLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setHighlightColor(0);
                    TuxTextView tuxTextView3 = this.LJLJJLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
                    } else {
                        o.LJIJI("termText");
                        throw null;
                    }
                } else {
                    o.LJIJI("termText");
                    throw null;
                }
            } else {
                o.LJIJI("termText");
                throw null;
            }
        }
        View findViewById3 = view.findViewById(R.id.kej);
        Context context2 = findViewById3.getContext();
        if (context2 != null) {
            findViewById3.getLayoutParams().height = C63081OpJ.LJJJJLI(context2);
        }
        this.LJLLI = findViewById3;
        View findViewById4 = view.findViewById(R.id.gwg);
        C252709vu c252709vu = (C252709vu) findViewById4;
        if (this.LJLIL) {
            c252709vu.setVisibility(0);
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_x_mark;
            c234529Ii.LIZIZ(new AqS160S0100000_10(this, 306));
            c252709vu.LIZJ(c234529Ii);
        } else {
            c252709vu.setVisibility(8);
        }
        c252709vu.LJIILJJIL(false);
        o.LJIIIIZZ(findViewById4, "view.findViewById<TuxNav…eparator(false)\n        }");
        View findViewById5 = view.findViewById(R.id.f0h);
        if (this.LJLIL) {
            findViewById5.setVisibility(8);
        } else {
            findViewById5.setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 52), findViewById5);
        }
        o.LJIIIIZZ(findViewById5, "view.findViewById<View>(…}\n            }\n        }");
        this.LJLLILLLL = findViewById5;
        View findViewById6 = view.findViewById(R.id.zp);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.aigc_intro_title)");
        ((TuxTextView) findViewById6).LJJJ(32.0f);
        if (((Boolean) this.LJZL.getValue()).booleanValue()) {
            ((TextView) _$_findCachedViewById(R.id.byo)).setText(R.string.d5);
            ((ViewStub) _$_findCachedViewById(R.id.jmt)).setOnInflateListener(new OPK(this, view));
            ((ViewStub) _$_findCachedViewById(R.id.jmt)).inflate();
        } else {
            ((TextView) _$_findCachedViewById(R.id.byo)).setText(R.string.dl);
            ((TextView) _$_findCachedViewById(R.id.zm)).setText(getResources().getString(R.string.dk));
        }
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.byo), new ACListenerS30S0100000_10(this, 55));
        Forest LIZ3 = C39914FlW.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setChannel("tiktok_tool_aigc_avatar");
        requestParams.setBundle("aigc_intro.webp");
        requestParams.setWaitGeckoUpdate(true);
        LIZ3.fetchResourceAsync("", requestParams, new AqS167S0100000_1(this, 18));
        String str3 = this.LJLILLLLZI;
        String str4 = this.LJLJI;
        C188727au c188727au = new C188727au();
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str = null;
        }
        c188727au.LJIIIZ("enter_from", str);
        if (str4 != null) {
            str2 = str4.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        c188727au.LJIIIZ("enter_method", str2);
        FMX.LJIIL("ai_avatar_intro_page_enter", c188727au.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c37, viewGroup, false);
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
