package com.ss.android.ugc.aweme.captionsheet;

import X.AC8;
import X.ACG;
import X.ACJ;
import X.ACO;
import X.ACQ;
import X.ACW;
import X.AEB;
import X.AEG;
import X.AET;
import X.AK4;
import X.C162476Zf;
import X.C221108m2;
import X.C235119Kp;
import X.C25824ABo;
import X.C25825ABp;
import X.C25840ACe;
import X.C25846ACk;
import X.C25848ACm;
import X.C25849ACn;
import X.C25859ACx;
import X.C25860ACy;
import X.C34011DWl;
import X.C41032G8m;
import X.C47261Igj;
import X.C60042Xg;
import X.C60052Xh;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C78496UrM;
import X.C79004UzY;
import X.C79045V0n;
import X.C7MY;
import X.C86661Xzl;
import X.C86670Xzu;
import X.EnumC25835ABz;
import X.EnumC86689Y0n;
import X.EnumC86777Y3x;
import X.InterfaceC54035LIp;
import X.InterfaceC60152Xr;
import X.ORY;
import X.Q8U;
import X.SYL;
import X.Y01;
import X.Y04;
import X.Y2B;
import X.Y2G;
import Y.ACListenerS24S0100000_4;
import Y.IDLListenerS58S0200000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.cla.et.newet.CaptionsSettingShowEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS28S0210000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class CaptionsPanelFragment extends BaseCaptionSheetFragment {
    public final C62822Ol8 LJLJJL;
    public AC8 LJLJJLL;
    public C25849ACn LJLJL;
    public C25860ACy LJLJLJ;
    public C25825ABp LJLJLLL;
    public final C62822Ol8 LJLL;
    public final CaptionsPanelFragment$captionPanelForByteLingoProvider$1 LJLLI;
    public final CaptionsPanelFragment$captionSheetParamsProvider$1 LJLLILLLL;
    public final Map<Integer, View> LJLLJ;

    public CaptionsPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean Dl() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    public View _$_findCachedViewById(int i) {
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
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void Il() {
        String string;
        C86661Xzl.LJIIZILJ((C86661Xzl) this.LJLJJL.getValue(), xl().LIZ.X7(), EnumC86777Y3x.CAPTION_SETTINGS, null, null, xl().LIZ.LLZLL(), null, null, null, C79004UzY.LJJJIL(getContext(), xl().LIZ()), 236);
        if (ACW.LIZ() == EnumC25835ABz.CAPTIONS && ACW.LIZIZ() && C25840ACe.LIZIZ != 0) {
            AC8 ac8 = this.LJLJJLL;
            if (ac8 != null) {
                if (Y04.LIZIZ(xl().LIZ.getAweme())) {
                    ACO.LIZ.getClass();
                    Object[] supportedLangValues = (Object[]) ACO.LIZJ.getValue();
                    o.LJIIIIZZ(supportedLangValues, "supportedLangValues");
                    if (ORY.LJJIJIIJIL(C86670Xzu.LJIIIZ(xl().LIZ.getAweme()), supportedLangValues)) {
                        string = getString(R.string.ddx);
                        o.LJIIIIZZ(string, "if (CaptionTranslationUt…                        }");
                        C25860ACy c25860ACy = new C25860ACy(new C25859ACx(string, null, null, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388606));
                        this.LJLJLJ = c25860ACy;
                        ac8.LIZ(c25860ACy);
                    }
                }
                string = getString(R.string.de1);
                o.LJIIIIZZ(string, "if (CaptionTranslationUt…                        }");
                C25860ACy c25860ACy2 = new C25860ACy(new C25859ACx(string, null, null, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388606));
                this.LJLJLJ = c25860ACy2;
                ac8.LIZ(c25860ACy2);
            }
            C25860ACy c25860ACy3 = this.LJLJLJ;
            if (c25860ACy3 != null) {
                c25860ACy3.LJIIJ(new AqS170S0100000_4(this, 148));
            }
        }
    }

    public AEG Kl() {
        return new AEG(new AEB("", true, false, false, false, null, null, null, Integer.valueOf(C7MY.LIZIZ(4)), null, null, 7164));
    }

    public void Ll() {
        AC8 ac8 = this.LJLJJLL;
        if (ac8 != null) {
            String string = getString(R.string.daj);
            o.LJIIIIZZ(string, "getString(R.string.claCo…ranslationSettings_title)");
            ac8.LIZ(new C25860ACy(new C25859ACx(string, null, new ACListenerS24S0100000_4(this, 22), null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388602)));
        }
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final String getTitle() {
        return (String) this.LJLL.getValue();
    }

    public final String Jl() {
        Aweme LIZ;
        Video video;
        CaptionModel captionModel;
        CaptionModel.NoCaptionReasonEnum noCaptionReason;
        int i;
        ACG acg;
        if (C86670Xzu.LJJIII(xl().LIZ.getAweme()) || (LIZ = xl().LIZ()) == null || (video = LIZ.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (noCaptionReason = captionModel.getNoCaptionReason()) == null || (i = ACQ.LIZ[noCaptionReason.ordinal()]) == -1) {
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return null;
                        }
                        throw new C162476Zf();
                    }
                    acg = ACG.OTHERS;
                } else {
                    acg = ACG.LANGUAGE_NOT_SUPPORTED;
                }
            } else {
                acg = ACG.SPEECH_NOT_RECOGNIZED;
            }
        } else {
            acg = ACG.NO_AUTHORIZATION;
        }
        if (acg == null) {
            return null;
        }
        return acg.getValue();
    }

    public void Ml() {
        xl().LIZ.hk();
    }

    public void Nl() {
        xl().LIZ.V4(Y2B.COMBINE_ENTRANCE_MASTER_TOGGLE);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public C235119Kp createNavActions() {
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
        super.onResume();
        if (Al()) {
            SYL power_list = (SYL) _$_findCachedViewById(R.id.i04);
            o.LJIIIIZZ(power_list, "power_list");
            if (!Al()) {
                return;
            }
            power_list.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(this, power_list, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (C25840ACe.LIZ) {
            C62814Ol0.LJJIIJZLJL(xl().LIZ.v2(), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LJLLI));
        } else {
            if (!C41032G8m.LIZ()) {
                return;
            }
            C62814Ol0.LJJIIJZLJL(xl().LIZ.v2(), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LJLLILLLL));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (C25840ACe.LIZ) {
            C62814Ol0.LJJIJL(xl().LIZ.v2(), ETParamsProvider.class, this.LJLLI);
        } else {
            if (!C41032G8m.LIZ()) {
                return;
            }
            C62814Ol0.LJJIJL(xl().LIZ.v2(), ETParamsProvider.class, this.LJLLILLLL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$captionPanelForByteLingoProvider$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$captionSheetParamsProvider$1] */
    public CaptionsPanelFragment(int i) {
        EnumC25835ABz type = EnumC25835ABz.CAPTIONS;
        o.LJIIIZ(type, "type");
        this.LJLLJ = new LinkedHashMap();
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1053));
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1054));
        this.LJLLI = new ETParamsProvider<C60042Xg>() { // from class: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$captionPanelForByteLingoProvider$1
            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final C60042Xg t() {
                ACJ acj;
                CaptionsPanelFragment.this.getClass();
                if (o.LJ(null, Boolean.TRUE) && ACW.LIZ() == EnumC25835ABz.CAPTIONS) {
                    acj = ACJ.CAPTION;
                } else {
                    acj = ACJ.SUBTITLE_PANEL;
                }
                return new C60042Xg(acj.getValue());
            }

            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC54035LIp getParam() {
                if (d2(C60042Xg.class)) {
                    return t();
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
                o.LJIIIZ(clazz, "clazz");
                if (!o.LJ(clazz, C60042Xg.class)) {
                    return false;
                }
                return true;
            }
        };
        this.LJLLILLLL = new ETParamsProvider<C60052Xh>() { // from class: com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$captionSheetParamsProvider$1
            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC54035LIp getParam() {
                if (d2(C60052Xh.class)) {
                    return new C60052Xh(CaptionsPanelFragment.this.xl().LIZ.getEnterMethod().getValue(), CaptionsPanelFragment.this.Jl());
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final C60052Xh t() {
                return new C60052Xh(CaptionsPanelFragment.this.xl().LIZ.getEnterMethod().getValue(), CaptionsPanelFragment.this.Jl());
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
                o.LJIIIZ(clazz, "clazz");
                return o.LJ(clazz, C60052Xh.class);
            }
        };
    }

    public void Ol(Context context) {
        o.LJIIIZ(context, "context");
        context.setTheme(R.style.kp);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        Ol(context);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public View Hl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.vb, viewGroup, false, "inflater.inflate(R.layou…l_view, container, false)");
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        C25825ABp c25825ABp;
        String str;
        boolean z2;
        String str2;
        String string;
        Aweme LIZ;
        Video video;
        CaptionModel captionModel;
        CaptionModel.NoCaptionReasonEnum noCaptionReason;
        boolean z3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        SYL power_list = (SYL) _$_findCachedViewById(R.id.i04);
        o.LJIIIIZZ(power_list, "power_list");
        this.LJLJJLL = new AC8(power_list);
        if (ACW.LIZIZ()) {
            AC8 ac8 = this.LJLJJLL;
            if (ac8 != null) {
                if (xl().LIZ.LLZLL() != EnumC86689Y0n.COLLAPSED) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String string2 = getString(R.string.ddv);
                o.LJIIIIZZ(string2, "getString(R.string.clasu…ubtitleSettingsPanel_cta)");
                C25849ACn c25849ACn = new C25849ACn(new C25848ACm(z3, string2, null, false, null, null, null, null, false, false, false, null, 65532));
                this.LJLJL = c25849ACn;
                ac8.LIZ(c25849ACn);
            }
            C25849ACn c25849ACn2 = this.LJLJL;
            if (c25849ACn2 != null) {
                c25849ACn2.LJIIJ(new AqS135S0200000_4(c25849ACn2, this, 147));
            }
            Il();
            Y2G.LJ(CaptionsSettingShowEvent.class, xl().LIZ.v2(), null, 12);
        } else {
            String str3 = null;
            if (C41032G8m.LIZ()) {
                boolean LJJIII = C86670Xzu.LJJIII(xl().LIZ.getAweme());
                if (!LJJIII && (LIZ = xl().LIZ()) != null && (video = LIZ.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (noCaptionReason = captionModel.getNoCaptionReason()) != null && noCaptionReason != CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_NO_OP) {
                    int i2 = ACQ.LIZ[noCaptionReason.ordinal()];
                    str3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? getString(R.string.dai) : getString(R.string.dag) : getString(R.string.dad) : getString(R.string.dae);
                }
                AC8 ac82 = this.LJLJJLL;
                if (ac82 != null) {
                    boolean LJ = C86670Xzu.LJ(xl().LIZ.getAweme());
                    if (LJJIII) {
                        string = getString(R.string.dah);
                    } else {
                        string = getString(R.string.daf);
                    }
                    o.LJIIIIZZ(string, "if (captionsAvailable) {…le)\n                    }");
                    C25849ACn c25849ACn3 = new C25849ACn(new C25848ACm(LJ, string, null, false, null, null, null, str3, false, false, false, null, 64508));
                    this.LJLJL = c25849ACn3;
                    ac82.LIZ(c25849ACn3);
                }
                C25849ACn c25849ACn4 = this.LJLJL;
                if (c25849ACn4 != null) {
                    c25849ACn4.LJIIJ(new AqS28S0210000_4(c25849ACn4, this, LJJIII, 6));
                }
                if (!C34011DWl.LIZ()) {
                    AC8 ac83 = this.LJLJJLL;
                    if (ac83 != null) {
                        ac83.LIZ(Kl());
                    }
                    if (o.LJ(C86670Xzu.LJJIJIL(xl().LIZ.getAweme()), Boolean.TRUE)) {
                        String LJJIIZI = Y01.LIZIZ.LJJIIZI();
                        String str4 = CaptionKevaServiceImpl.LJJJJI().LJJIL().get(LJJIIZI);
                        Aweme aweme = xl().LIZ.getAweme();
                        String LJIIIZ = C86670Xzu.LJIIIZ(aweme);
                        if (C86670Xzu.LJJIII(aweme) && !o.LJ(LJJIIZI, LJIIIZ) && !Y04.LIZIZ(aweme) && !ORY.LJJIJIIJIL(LJIIIZ, C86670Xzu.LJIJ().LJIILLIIL())) {
                            z2 = true;
                            str2 = getString(R.string.dav);
                        } else {
                            z2 = false;
                            str2 = null;
                        }
                        AC8 ac84 = this.LJLJJLL;
                        if (ac84 != null) {
                            boolean LJJIIZI2 = AK4.LIZ().LJJIIZI();
                            String string3 = getString(R.string.das);
                            o.LJIIIIZZ(string3, "getString(R.string.claCo…_translationToggle_title)");
                            C25825ABp c25825ABp2 = new C25825ABp(new C25846ACk(LJJIIZI2, Q8U.LIZIZ(new Object[]{str4}, 1, string3, "format(format, *args)"), null, true, false, null, null, null, null, AET.NORMAL, null, false, str2, true, false, false, false));
                            this.LJLJLLL = c25825ABp2;
                            ac84.LIZ(c25825ABp2);
                        }
                        C25825ABp c25825ABp3 = this.LJLJLLL;
                        if (c25825ABp3 != null) {
                            c25825ABp3.LJIIJ(new C25824ABo(c25825ABp3, this, LJJIII, z2));
                        }
                    }
                    Ll();
                }
                C86661Xzl c86661Xzl = (C86661Xzl) this.LJLJJL.getValue();
                boolean X7 = xl().LIZ.X7();
                EnumC86777Y3x enterMethod = xl().LIZ.getEnterMethod();
                EnumC86689Y0n LLZLL = xl().LIZ.LLZLL();
                C25849ACn c25849ACn5 = this.LJLJL;
                if (c25849ACn5 != null) {
                    z = true;
                    if (c25849ACn5.LJFF().LJZI) {
                        i = 1;
                        Integer valueOf = Integer.valueOf(i ^ 1);
                        String Jl = Jl();
                        c25825ABp = this.LJLJLLL;
                        if (c25825ABp == null && c25825ABp.LJFF().LLD == z) {
                            C25825ABp c25825ABp4 = this.LJLJLLL;
                            if (c25825ABp4 != null && c25825ABp4.LJFF().LJZI == z) {
                                str = "see_original";
                            } else {
                                str = "see_translation";
                            }
                        } else {
                            str = null;
                        }
                        C86661Xzl.LJIIZILJ(c86661Xzl, X7, enterMethod, null, null, LLZLL, valueOf, Jl, str, C79004UzY.LJJJIL(getContext(), xl().LIZ()), 12);
                    }
                } else {
                    z = true;
                }
                i = 0;
                Integer valueOf2 = Integer.valueOf(i ^ 1);
                String Jl2 = Jl();
                c25825ABp = this.LJLJLLL;
                if (c25825ABp == null) {
                }
                str = null;
                C86661Xzl.LJIIZILJ(c86661Xzl, X7, enterMethod, null, null, LLZLL, valueOf2, Jl2, str, C79004UzY.LJJJIL(getContext(), xl().LIZ()), 12);
            }
        }
        AC8 ac85 = this.LJLJJLL;
        if (ac85 != null) {
            ac85.LIZLLL();
        }
    }
}
