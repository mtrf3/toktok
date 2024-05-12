package com.ss.android.ugc.aweme.captionsheet;

import X.AC3;
import X.AC4;
import X.AC7;
import X.AC8;
import X.AC9;
import X.ACC;
import X.AEB;
import X.AEG;
import X.AK4;
import X.C16880lQ;
import X.C221108m2;
import X.C235119Kp;
import X.C245579kP;
import X.C25792AAi;
import X.C25848ACm;
import X.C25849ACn;
import X.C25859ACx;
import X.C25860ACy;
import X.C45804HyK;
import X.C47261Igj;
import X.C62822Ol8;
import X.C78496UrM;
import X.C79045V0n;
import X.C7GS;
import X.C7MY;
import X.C84763XOl;
import X.C86670Xzu;
import X.C8BR;
import X.C91O;
import X.EF7;
import X.EnumC218698i9;
import X.EnumC25835ABz;
import X.InterfaceC55058LjC;
import X.InterfaceC55235Lm3;
import X.ORY;
import X.SYL;
import X.Y2G;
import Y.ACListenerS24S0100000_4;
import Y.IDLListenerS58S0200000_4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.cla.et.newet.ChangeTranslElementStatusEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TranslationPanelFragment extends BaseCaptionSheetFragment {
    public final C62822Ol8 LJLJJL;
    public AC8 LJLJJLL;
    public C25860ACy LJLJL;
    public C25860ACy LJLJLJ;
    public AEG LJLJLLL;
    public C25849ACn LJLL;
    public C25849ACn LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final Map<Integer, View> LJLLJ;

    public TranslationPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean Dl() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLJ;
        Integer valueOf = Integer.valueOf(R.id.i04);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.i04)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final String getTitle() {
        return (String) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C235119Kp createNavActions() {
        Integer LJI;
        C235119Kp createNavActions = super.createNavActions();
        createNavActions.LIZLLL = true;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            createNavActions.LIZJ(LJI.intValue());
        }
        createNavActions.LIZLLL = false;
        return createNavActions;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Activity LJIJJ;
        super.onResume();
        C25860ACy c25860ACy = this.LJLJL;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(ACC.LJLIL);
            C25860ACy c25860ACy2 = this.LJLJLJ;
            if (c25860ACy2 != null) {
                c25860ACy2.LJIIJ(AC9.LJLIL);
                boolean LJ = o.LJ(C86670Xzu.LJJIJIL(xl().LIZ.getAweme()), Boolean.TRUE);
                AEG aeg = this.LJLJLLL;
                if (aeg != null) {
                    aeg.LJIIJ(new AqS9S0010000_4(LJ, 23));
                    C25849ACn c25849ACn = this.LJLL;
                    if (c25849ACn != null) {
                        c25849ACn.LJIIJ(new AqS9S0010000_4(LJ, 24));
                        C25849ACn c25849ACn2 = this.LJLLI;
                        if (c25849ACn2 != null) {
                            c25849ACn2.LJIIJ(new AqS9S0010000_4(LJ, 25));
                            Intent LIZ = C91O.LIZ().LIZ();
                            if (LIZ != null) {
                                C91O.LIZ().LJFF();
                                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(LIZ, "updated_language_name");
                                if (LLJJIJIIJIL != null && LLJJIJIIJIL.length() != 0) {
                                    C25860ACy c25860ACy3 = this.LJLJL;
                                    if (c25860ACy3 != null) {
                                        c25860ACy3.LJIILIIL(LLJJIJIIJIL);
                                    } else {
                                        o.LJIJI("translationLanguageUnit");
                                        throw null;
                                    }
                                }
                                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(LIZ, "updated_language_code");
                                if (!LIZ.getBooleanExtra("updated_language_is_refreshing_needed", true)) {
                                    return;
                                }
                                if (LLJJIJIIJIL2 != null && LLJJIJIIJIL2.length() != 0) {
                                    SharePrefCache.inst().getSelectedTranslationLanguage().LIZLLL(LLJJIJIIJIL2);
                                    Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
                                    if (LJIIIIZZ == null) {
                                        LJIIIIZZ = EF7.LIZIZ();
                                    }
                                    if ((LJIIIIZZ instanceof InterfaceC55058LjC) && (LJIJJ = C45804HyK.LJIJJ(LJIIIIZZ)) != null) {
                                        LJIJJ.finish();
                                    }
                                    SmartRoute buildRoute = SmartRouter.buildRoute(LJIIIIZZ, "//main");
                                    buildRoute.addFlags(268468224);
                                    buildRoute.open();
                                }
                            }
                            if (C91O.LIZ().LIZJ() != null) {
                                C91O.LIZ().LJII();
                                String[] LIZIZ = C25792AAi.LIZ().LIZIZ();
                                if (LIZIZ != null) {
                                    String LJJJJLL = ORY.LJJJJLL(LIZIZ, ", ", null, null, null, 62);
                                    C25860ACy c25860ACy4 = this.LJLJLJ;
                                    if (c25860ACy4 != null) {
                                        c25860ACy4.LJIILIIL(LJJJJLL);
                                    } else {
                                        o.LJIJI("doNotTranslateUnit");
                                        throw null;
                                    }
                                }
                            }
                            AC8 ac8 = this.LJLJJLL;
                            if (ac8 != null) {
                                ac8.LIZLLL();
                            }
                            if (!this.LJLILLLLZI) {
                                return;
                            }
                            SYL power_list = (SYL) _$_findCachedViewById(R.id.i04);
                            o.LJIIIIZZ(power_list, "power_list");
                            if (!Al()) {
                                return;
                            }
                            power_list.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(this, power_list, 4));
                            return;
                        }
                        o.LJIJI("stickerToggleUnit");
                        throw null;
                    }
                    o.LJIJI("descriptionToggleUnit");
                    throw null;
                }
                o.LJIJI("dividerUnit");
                throw null;
            }
            o.LJIJI("doNotTranslateUnit");
            throw null;
        }
        o.LJIJI("translationLanguageUnit");
        throw null;
    }

    public TranslationPanelFragment(int i) {
        EnumC25835ABz type = EnumC25835ABz.TRANSLATION;
        o.LJIIIZ(type, "type");
        this.LJLLJ = new LinkedHashMap();
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1052));
        this.LJLLILLLL = C221108m2.LIZIZ(C245579kP.LJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        context.setTheme(R.style.kp);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final View Hl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.vf, viewGroup, false, "inflater.inflate(R.layou…l_view, container, false)");
    }

    public final void Il(EnumC218698i9 enumC218698i9, boolean z) {
        AC4 ac4;
        String value;
        InterfaceC55235Lm3 v2 = xl().LIZ.v2();
        String value2 = xl().LIZ.getEnterMethod().getValue();
        String value3 = enumC218698i9.getValue();
        if (z) {
            ac4 = AC4.ON;
        } else {
            ac4 = AC4.OFF;
        }
        String value4 = ac4.getValue();
        if (AK4.LIZ().LJJIIZI()) {
            value = AC3.ON.getValue();
        } else {
            value = AC3.OFF.getValue();
        }
        Y2G.LJ(ChangeTranslElementStatusEvent.class, v2, C47261Igj.LJJIJ(new C7GS(value2, value3, value4, value)), 4);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        SYL power_list = (SYL) _$_findCachedViewById(R.id.i04);
        o.LJIIIIZZ(power_list, "power_list");
        AC8 ac8 = new AC8(power_list);
        this.LJLJJLL = ac8;
        String string = getString(R.string.daq);
        o.LJIIIIZZ(string, "getString(R.string.claCo…ranslationDisplay_toggle)");
        C25860ACy c25860ACy = new C25860ACy(new C25859ACx(string, null, null, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388606));
        this.LJLJL = c25860ACy;
        ac8.LIZ(c25860ACy);
        AC8 ac82 = this.LJLJJLL;
        if (ac82 != null) {
            String string2 = getString(R.string.dar);
            o.LJIIIIZZ(string2, "getString(R.string.claCo…nHideSelectionMenu_title)");
            C25860ACy c25860ACy2 = new C25860ACy(new C25859ACx(string2, null, null, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388606));
            this.LJLJLJ = c25860ACy2;
            ac82.LIZ(c25860ACy2);
        }
        AC8 ac83 = this.LJLJJLL;
        if (ac83 != null) {
            AEG aeg = new AEG(new AEB("", true, false, false, false, null, null, null, Integer.valueOf(C7MY.LIZIZ(4)), null, null, 15356));
            this.LJLJLLL = aeg;
            ac83.LIZ(aeg);
        }
        AC8 ac84 = this.LJLJJLL;
        if (ac84 != null) {
            boolean LIZJ = AK4.LIZ().LIZJ();
            String string3 = getString(R.string.dan);
            o.LJIIIIZZ(string3, "getString(R.string.claCo…e_TranslDescToggle_title)");
            C25849ACn c25849ACn = new C25849ACn(new C25848ACm(LIZJ, string3, new ACListenerS24S0100000_4(this, 231), false, null, null, null, null, false, false, false, null, 65528));
            this.LJLL = c25849ACn;
            ac84.LIZ(c25849ACn);
        }
        AC8 ac85 = this.LJLJJLL;
        if (ac85 != null) {
            boolean LJJJIL = AK4.LIZ().LJJJIL();
            String string4 = getString(R.string.dao);
            o.LJIIIIZZ(string4, "getString(R.string.claCo…slateStickerToggle_title)");
            C25849ACn c25849ACn2 = new C25849ACn(new C25848ACm(LJJJIL, string4, new ACListenerS24S0100000_4(this, 232), false, null, null, null, null, false, false, false, null, 65528));
            this.LJLLI = c25849ACn2;
            ac85.LIZ(c25849ACn2);
        }
        ((C8BR) this.LJLLILLLL.getValue()).LJJI(new AC7(new AqS170S0100000_4(this, 935), this));
        ((C8BR) this.LJLLILLLL.getValue()).LJIILL(new Object[0]);
    }
}
