package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.AbstractC188397aN;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C213958aV;
import X.C213968aW;
import X.C213978aX;
import X.C213988aY;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C53148KtU;
import X.C56179M3b;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C76800UCe;
import X.C78926UyI;
import X.C78W;
import X.C79045V0n;
import X.C89P;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.GFQ;
import X.InterfaceC57784Mm4;
import X.InterfaceC61213O0r;
import X.JBR;
import X.Q8U;
import X.SYL;
import X.T5U;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServiceManagementSettings;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS15S1201000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS67S0201000_3;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class LocationServicesFragment extends BaseFragment {
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final C214298b3 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.optionalArg(this, C213968aW.LJLIL, "enter_from", String.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    public LocationServicesFragment() {
        C214298b3 c214298b3;
        StringBuilder LIZ = X1D.LIZ();
        LocationServiceManagementSettings.LocationServiceManagementModel locationServiceManagementModel = LocationServiceManagementSettings.LIZ;
        String LJFF = JBR.LJFF(LIZ, locationServiceManagementModel.domain, "/%s/", LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJFF);
        LIZ2.append(locationServiceManagementModel.centerPath);
        this.LJLILLLLZI = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LJFF);
        LIZ3.append(locationServiceManagementModel.centerLocationPath);
        this.LJLJI = X1D.LIZIZ(LIZ3);
        this.LJLJJI = "event";
        this.LJLJJL = "enterMethod";
        this.LJLJJLL = "gps_authorization";
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ4 = C65352Pkq.LIZ(LocationServicesVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ4, 176);
        C213978aX c213978aX = C213978aX.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c213978aX, LIZ4);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c213978aX, LIZ4);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJL = c214298b3;
    }

    public final LocationServicesVM wl() {
        return (LocationServicesVM) this.LJLJL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC57784Mm4 locationAccuracySettingItem;
        super.onResume();
        Context context = getContext();
        if (context != null) {
            LocationServicesVM wl = wl();
            wl.getClass();
            wl.setState(new AqS169S0100000_3(context, 957));
        }
        if (xl() && (locationAccuracySettingItem = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationAccuracySettingItem()) != null && !((ArrayList) ((SYL) _$_findCachedViewById(R.id.i04)).getState().LJII()).contains(locationAccuracySettingItem)) {
            C72808Sho<InterfaceC57784Mm4> state = ((SYL) _$_findCachedViewById(R.id.i04)).getState();
            String string = getResources().getString(R.string.ozw);
            o.LJIIIIZZ(string, "resources.getString(R.st…i_precise_advanced_title)");
            state.LIZIZ(2, new C78W(string));
            ((SYL) _$_findCachedViewById(R.id.i04)).getState().LIZIZ(3, locationAccuracySettingItem);
        }
    }

    public final boolean xl() {
        if (!C53148KtU.LIZ() && ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).needShowAccuracySettingCell(getContext())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setTheme(R.style.kp);
        }
        super.onCreate(bundle);
        fragmentConfiguration(GFQ.LJLIL);
        if (bundle != null) {
            Context context = getContext();
            if (context != null) {
                bool = Boolean.valueOf(C56179M3b.LIZ.LJIILLIIL(0, context));
            } else {
                bool = null;
            }
            boolean LJ = o.LJ(bool, Boolean.TRUE);
            String string = bundle.getString(this.LJLJJI);
            if (string != null) {
                C213958aV c213958aV = new C213958aV(this, LJ ? 1 : 0);
                AqS67S0201000_3 aqS67S0201000_3 = new AqS67S0201000_3(bundle, this, LJ ? 1 : 0, 0);
                AqS15S1201000_3 aqS15S1201000_3 = new AqS15S1201000_3(string, bundle, this, LJ ? 1 : 0, 0);
                if (o.LJ(string, "system_location_setting_off_result")) {
                    c213958aV.invoke();
                } else if (o.LJ(string, "system_location_device_setting_result")) {
                    aqS67S0201000_3.invoke();
                } else {
                    aqS15S1201000_3.invoke();
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        Object obj = wl().LJLJJI.get(this.LJLJJI);
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(outState, this, 18);
        AqS150S0200000_3 aqS150S0200000_32 = new AqS150S0200000_3(outState, this, 19);
        AqS150S0200000_3 aqS150S0200000_33 = new AqS150S0200000_3(outState, this, 20);
        if (o.LJ(obj, "system_location_setting_off_result")) {
            aqS150S0200000_3.invoke();
        } else if (o.LJ(obj, "system_location_device_setting_result")) {
            aqS150S0200000_32.invoke();
        } else {
            aqS150S0200000_33.invoke();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C213988aY c213988aY;
        InterfaceC57784Mm4 locationAccuracySettingItem;
        Class<? extends PowerCell<?>> locationAccuracySettingCell;
        Integer LJI;
        o.LJIIIZ(view, "view");
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gx7);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 175));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getResources().getString(R.string.ozc);
        o.LJIIIIZZ(string, "resources.getString(R.st…oi_backend_setting_title)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            c252709vu.setNavBackground(LJI.intValue());
        }
        ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(LocationServicesHeaderCell.class);
        ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(GPSPermissionCell.class);
        ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(LocationServicesHistoryCell.class);
        ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(LocationServicesFooterCell.class);
        if (!C53148KtU.LIZ() && (locationAccuracySettingCell = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationAccuracySettingCell()) != null) {
            ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(locationAccuracySettingCell);
        }
        C72808Sho<InterfaceC57784Mm4> state = ((SYL) _$_findCachedViewById(R.id.i04)).getState();
        String string2 = getResources().getString(R.string.jg0);
        o.LJIIIIZZ(string2, "resources.getString(R.st…rm_setting_section_title)");
        state.LIZJ(new C78W(string2));
        C72808Sho<InterfaceC57784Mm4> state2 = ((SYL) _$_findCachedViewById(R.id.i04)).getState();
        if (getContext() != null) {
            String string3 = getResources().getString(R.string.jg4);
            o.LJIIIIZZ(string3, "resources.getString(R.st…m_setting_title_two_desc)");
            String string4 = getResources().getString(R.string.oz8);
            o.LJIIIIZZ(string4, "resources.getString(R.st…ng.poi_addkeys_learnmore)");
            c213988aY = new C213988aY(vl(string3, string4, this.LJLJI), (String) this.LJLIL.getValue(), getContext(), wl());
        } else {
            c213988aY = null;
        }
        state2.LIZJ(c213988aY);
        if (xl() && (locationAccuracySettingItem = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getLocationAccuracySettingItem()) != null) {
            C72808Sho<InterfaceC57784Mm4> state3 = ((SYL) _$_findCachedViewById(R.id.i04)).getState();
            String string5 = getResources().getString(R.string.ozw);
            o.LJIIIIZZ(string5, "resources.getString(R.st…i_precise_advanced_title)");
            state3.LIZJ(new C78W(string5));
            ((SYL) _$_findCachedViewById(R.id.i04)).getState().LIZJ(locationAccuracySettingItem);
        }
        C72808Sho<InterfaceC57784Mm4> state4 = ((SYL) _$_findCachedViewById(R.id.i04)).getState();
        String string6 = getResources().getString(R.string.oz9);
        o.LJIIIIZZ(string6, "resources.getString(R.string.poi_addkeys_lochis)");
        state4.LIZJ(new C78W(string6));
        ((SYL) _$_findCachedViewById(R.id.i04)).getState().LIZJ(new InterfaceC57784Mm4() { // from class: X.33v
            public final boolean LJLIL = true;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C778733v) && this.LJLIL == ((C778733v) obj).LJLIL;
            }

            @Override // X.InterfaceC57784Mm4
            public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
                return null;
            }

            public final int hashCode() {
                boolean z = this.LJLIL;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("LocationServicesHistoryItem(placeholder=");
                return C48339Iy7.LIZJ(LIZ, this.LJLIL, ')', LIZ);
            }

            @Override // X.InterfaceC57784Mm4
            public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
                return o.LJ(interfaceC57784Mm4, this);
            }

            @Override // X.InterfaceC57784Mm4
            public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
                return o.LJ(interfaceC57784Mm4, this);
            }
        });
        C72808Sho<InterfaceC57784Mm4> state5 = ((SYL) _$_findCachedViewById(R.id.i04)).getState();
        String string7 = getResources().getString(R.string.jfx);
        o.LJIIIIZZ(string7, "resources.getString(R.string.perm_setting_footer)");
        String string8 = getResources().getString(R.string.oz7);
        o.LJIIIIZZ(string8, "resources.getString(R.st…g.poi_addkeys_helpcenart)");
        state5.LIZJ(new C89P(vl(string7, string8, this.LJLILLLLZI)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ah1, viewGroup, false);
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

    public final SpannableStringBuilder vl(String str, String str2, final String str3) {
        final Integer num;
        String LIZIZ = Q8U.LIZIZ(new Object[]{str2}, 1, str, "format(format, *args)");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(LIZIZ);
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, str2, 0, false, 6);
        int length = str2.length() + LJJLIIIJL;
        Context context = getContext();
        final Integer num2 = null;
        if (context != null) {
            num = C79045V0n.LJI(R.attr.gu, context);
        } else {
            num = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            num2 = C79045V0n.LJI(R.attr.dv, context2);
        }
        if (num != null && num2 != null) {
            valueOf.setSpan(new AbstractC188397aN(num, num2, this, str3) { // from class: X.8Tl
                public final /* synthetic */ LocationServicesFragment LJLJJI;
                public final /* synthetic */ String LJLJJL;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    this.LJLJJI.getContext();
                    if (C2NU.LIZ.LIZIZ()) {
                        String LIZIZ2 = Q8U.LIZIZ(new Object[]{IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage()}, 1, this.LJLJJL, "format(this, *args)");
                        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLJJI.getContext(), "aweme://webview");
                        buildRoute.withParam("url", LIZIZ2);
                        buildRoute.withParam("title", "");
                        buildRoute.withParam("show_separate_line", true);
                        buildRoute.open();
                        return;
                    }
                    C26045AKb c26045AKb = new C26045AKb(this.LJLJJI);
                    c26045AKb.LJIIIIZZ(R.string.img);
                    c26045AKb.LJIIJ();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(num.intValue(), num2.intValue());
                    this.LJLJJI = this;
                    this.LJLJJL = str3;
                }
            }, LJJLIIIJL, length, 33);
        }
        valueOf.setSpan(new T5U(52, false), LJJLIIIJL, length, 33);
        valueOf.setSpan(new AbsoluteSizeSpan(14, true), LJJLIIIJL, length, 33);
        return valueOf;
    }
}
