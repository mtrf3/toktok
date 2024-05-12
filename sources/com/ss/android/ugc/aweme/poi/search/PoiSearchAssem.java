package com.ss.android.ugc.aweme.poi.search;

import X.ActivityC45651qj;
import X.C12460eI;
import X.C132805Jc;
import X.C16880lQ;
import X.C17N;
import X.C184077Kh;
import X.C2068389v;
import X.C213648a0;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C227918x1;
import X.C32I;
import X.C34K;
import X.C45243HpH;
import X.C45804HyK;
import X.C47704Ins;
import X.C51733KSb;
import X.C53082KsQ;
import X.C54578LbS;
import X.C55749LuL;
import X.C56179M3b;
import X.C56412MCa;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C78685UuP;
import X.C78926UyI;
import X.C85207XcJ;
import X.C85208XcK;
import X.C85219XcV;
import X.C85221XcX;
import X.C85223XcZ;
import X.C85224Xca;
import X.C85225Xcb;
import X.C85226Xcc;
import X.C85227Xcd;
import X.C85228Xce;
import X.C85229Xcf;
import X.C85230Xcg;
import X.C85231Xch;
import X.C85232Xci;
import X.C85233Xcj;
import X.C85234Xck;
import X.C85256Xd6;
import X.C85258Xd8;
import X.C85296Xdk;
import X.C8TO;
import X.C8VC;
import X.C8W0;
import X.C8YN;
import X.DialogC25756A8y;
import X.E8H;
import X.EnumC85244Xcu;
import X.FFL;
import X.FMX;
import X.HG3;
import X.InterfaceC225588tG;
import X.InterfaceC65784Pro;
import X.InterfaceC85240Xcq;
import X.OHI;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.SYL;
import X.T35;
import X.T3D;
import X.TBT;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.experiment.PoiSearchConfig;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiSearchAssem extends UIListContentAssem<PoiSearchVM> implements InterfaceC225588tG {
    public static final C85228Xce LLF = new C85228Xce();
    public View LJLIL;
    public C73305Spp LJLILLLLZI;
    public List<Boolean> LJLJJI;
    public List<Boolean> LJLJJL;
    public TuxTextView LJLJJLL;
    public DialogC25756A8y LJLJL;
    public View LJLJLLL;
    public final C214378bB LJLL;
    public final boolean LJLLI;
    public final TokenCert LJLLILLLL;
    public final TokenCert LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public T3D LJZ;
    public volatile String LJZI;
    public C85221XcX LJZL;
    public final C5H3 LL;
    public Map<Integer, View> LLD = new LinkedHashMap();
    public final List<String> LJLJI = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).locationPermissions();
    public final C55749LuL LJLJLJ = new C55749LuL(C47704Ins.LIZJ(this, C213648a0.class, "PoiSearchHierarchyData"), checkSupervisorPrepared());

    public void _$_clearFindViewByIdCache() {
        this.LLD.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLD;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC225588tG, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public PoiSearchAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C85227Xcd c85227Xcd = C85227Xcd.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiSearchVM.class);
        C227918x1 c227918x1 = C227918x1.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 788);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLL = new C214378bB(LIZ, c85227Xcd, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c227918x1, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLLI = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isSupportedPreciseGps();
        TokenCert.Companion companion = TokenCert.Companion;
        this.LJLLILLLL = companion.with("bpea-fetch_fine_location_permission_in_search_page");
        this.LJLLJ = companion.with("bpea-gps_banner_in_poi_search_page_system_precise");
        this.LJLLLLLL = true;
        this.LL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 542));
    }

    private final C213648a0 F3() {
        return (C213648a0) this.LJLJLJ.getValue();
    }

    public final void C3() {
        C85296Xdk.LIZ.getClass();
        if (C85296Xdk.LIZLLL("poi", "add_location")) {
            C34K c34k = new C34K();
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            View view = this.LJLIL;
            if (view != null) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "content.context");
                this.LJLJLLL = iLocationBaseServiceForMT.getGpsBannerHeaderView(context, v3(), new AqS146S0200000_15(this, iLocationBaseServiceForMT, 23), new AqS165S0100000_15(this, 537), new AqS162S0200000_15(this, c34k, 21));
                v3().LJLLI();
                boolean z = false;
                if (!c34k.element) {
                    View view2 = this.LJLJLLL;
                    if (view2 != null) {
                        v3().LJLJL(0, view2);
                    }
                    z = true;
                }
                this.LJLLL = z;
                return;
            }
            o.LJIJI("content");
            throw null;
        }
    }

    public final void E3() {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            if (this.LJLJJL != null) {
                if (!r1.contains(Boolean.TRUE)) {
                    PoiSearchVM A3 = A3();
                    boolean LJIJ = LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION");
                    A3.LJLJLLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    A3.LJLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    A3.LJLLI = LJIJ;
                    Gj(null, true);
                    return;
                }
                LJII();
                TokenCert.Companion companion = TokenCert.Companion;
                TokenCert with = companion.with("bpea-poi_search_fetcher_location");
                with.auth("mttu");
                TokenCert with2 = companion.with("bpea-poi_search_fetcher_location_decrypt");
                with2.auth("mckd");
                C51733KSb.LIZ("poi", "add_location", with, with2, new C85219XcV(this), 32);
                return;
            }
            o.LJIJI("currentPermissionsStatus");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: I3 */
    public PoiSearchVM A3() {
        return (PoiSearchVM) this.LJLL.getValue();
    }

    public final void Ji() {
        try {
            ((InterfaceC85240Xcq) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC85240Xcq.class), null)).Ji();
        } catch (Exception e) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi_search", e.getMessage());
        }
    }

    public final void LJII() {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C53082KsQ.LIZ.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 0, "opt_poi_search_page_loading_style", false) == 0) {
                C17N.LJJIIJZLJL(v3());
            } else {
                C73305Spp c73305Spp2 = this.LJLILLLLZI;
                if (c73305Spp2 != null) {
                    if (c73305Spp2.getBackground() != null) {
                        C73305Spp c73305Spp3 = this.LJLILLLLZI;
                        if (c73305Spp3 != null) {
                            c73305Spp3.setBackground(null);
                        } else {
                            o.LJIJI("statusView");
                            throw null;
                        }
                    }
                    C17N.LJJLIIIJJI(v3());
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
            C73305Spp c73305Spp4 = this.LJLILLLLZI;
            if (c73305Spp4 != null) {
                c73305Spp4.LJFF();
                return;
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final void N3() {
        T3D t3d = this.LJZ;
        if (t3d != null) {
            t3d.LIZIZ();
        }
        this.LJZ = null;
    }

    public final boolean Y3() {
        if (this.LJLLLL || this.LJLLL) {
            return false;
        }
        if (!this.LJLLLLLL) {
            C85221XcX c85221XcX = this.LJZL;
            if (c85221XcX != null) {
                if (c85221XcX.LIZJ == c85221XcX.LIZ()) {
                    return false;
                }
            } else {
                o.LJIJI("locationPermissionManagerBeforeRefresh");
                throw null;
            }
        }
        return true;
    }

    public final void c4() {
        if (!this.LJLLL) {
            Ji();
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public SYL v3() {
        Object value = this.LL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    private final Class<? extends PowerCell<?>> H3() {
        Integer num = PoiSearchConfig.LIZ().showCategoryStyle;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return PoiSearchCellV1.class;
            }
            if (intValue == 2) {
                return PoiSearchCellV2.class;
            }
        }
        return PoiSearchCell.class;
    }

    private final boolean Z3() {
        E8H e8h;
        boolean z;
        boolean z2;
        boolean z3;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        boolean inAppPreciseUnknown = iLocationBaseServiceForMT.inAppPreciseUnknown();
        boolean isInAppPrecise = iLocationBaseServiceForMT.isInAppPrecise();
        View view = this.LJLIL;
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "content.context");
            boolean isSystemPrecise = iLocationBaseServiceForMT.isSystemPrecise(context);
            boolean isSupportedPreciseGps = iLocationBaseServiceForMT.isSupportedPreciseGps();
            if (inAppPreciseUnknown) {
                e8h = C85233Xcj.LIZIZ;
            } else {
                e8h = C85232Xci.LIZIZ;
            }
            if ((inAppPreciseUnknown || !isInAppPrecise) && !e8h.LIZ() && A3().LJLIL != EnumC85244Xcu.POI_RE_TAG) {
                z = true;
            } else {
                z = false;
            }
            if (!C85234Xck.LIZIZ.LIZ() && A3().LJLIL != EnumC85244Xcu.POI_RE_TAG) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!C85231Xch.LIZIZ.LIZ() && A3().LJLIL == EnumC85244Xcu.ADD_LOCATION) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!isSupportedPreciseGps) {
                return z3;
            }
            if (!isSystemPrecise) {
                if (z || z2 || z3) {
                    return true;
                }
            } else if (z || z3) {
                return true;
            }
            return false;
        }
        o.LJIJI("content");
        throw null;
    }

    private final void b4() {
        boolean z;
        ILocationService LJIJJ = LocationServiceImpl.LJIJJ();
        if (LJIJJ.LIZLLL() || LJIJJ.LJFF() || LJIJJ.LJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C73305Spp c73305Spp = this.LJLILLLLZI;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(8);
                TuxTextView tuxTextView = this.LJLJJLL;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                    v3().setVisibility(0);
                    LocationServiceImpl.LJIJJ().LJIIJJI(this.LJLJLLL);
                    return;
                }
                o.LJIJI("tvNoResult");
                throw null;
            }
            o.LJIJI("statusView");
            throw null;
        }
        C73305Spp c73305Spp2 = this.LJLILLLLZI;
        if (c73305Spp2 != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_map_pin;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            C73305Spp c73305Spp3 = this.LJLILLLLZI;
            if (c73305Spp3 != null) {
                String string = c73305Spp3.getContext().getString(R.string.e5e);
                o.LJIIIIZZ(string, "statusView.context.getSt…oi_search_location_title)");
                c73306Spq.LJFF = string;
                C73305Spp c73305Spp4 = this.LJLILLLLZI;
                if (c73305Spp4 != null) {
                    String string2 = c73305Spp4.getContext().getString(R.string.e5d);
                    o.LJIIIIZZ(string2, "statusView.context.getSt…poi_search_location_body)");
                    c73306Spq.LJI = string2;
                    c73306Spq.LJII = new AqS181S0100000_15(this, 93);
                    c73305Spp2.setStatus(c73306Spq);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final void L3() {
        boolean z;
        v3().setVisibility(8);
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            String str = (String) withState(A3(), C85208XcK.LJLIL);
            boolean z2 = true;
            if (str == null || str.length() == 0) {
                boolean LIZ = C85256Xd6.LIZ();
                Context context = v3().getContext();
                o.LJIIIIZZ(context, "list.context");
                boolean LIZIZ = C85256Xd6.LIZIZ(context);
                C8TO.LIZ.getClass();
                FFL.LJIIIZ().getClass();
                if (FFL.LJIIJ(31744, 1, "poi_search_page_permission_popup", false) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || !o.LJ(F3().LJLIL, "video_edit_page")) {
                    z2 = false;
                }
                if (LIZ && !LIZIZ && !z2) {
                    b4();
                }
                if (LIZ) {
                    if (!LIZIZ) {
                        if (z2) {
                            C73305Spp c73305Spp2 = this.LJLILLLLZI;
                            if (c73305Spp2 != null) {
                                c73305Spp2.setVisibility(8);
                                TuxTextView tuxTextView = this.LJLJJLL;
                                if (tuxTextView != null) {
                                    tuxTextView.setVisibility(0);
                                    return;
                                } else {
                                    o.LJIJI("tvNoResult");
                                    throw null;
                                }
                            }
                            o.LJIJI("statusView");
                            throw null;
                        }
                        return;
                    }
                    C73305Spp c73305Spp3 = this.LJLILLLLZI;
                    if (c73305Spp3 != null) {
                        C73306Spq c73306Spq = new C73306Spq();
                        C73312Spw.LJIIIZ(c73306Spq);
                        c73305Spp3.setStatus(c73306Spq);
                        return;
                    }
                    o.LJIJI("statusView");
                    throw null;
                }
                if (o.LJ(F3().LJLIL, "video_edit_page")) {
                    C73305Spp c73305Spp4 = this.LJLILLLLZI;
                    if (c73305Spp4 != null) {
                        c73305Spp4.setVisibility(8);
                        TuxTextView tuxTextView2 = this.LJLJJLL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setVisibility(0);
                        } else {
                            o.LJIJI("tvNoResult");
                            throw null;
                        }
                    } else {
                        o.LJIJI("statusView");
                        throw null;
                    }
                }
                C73305Spp c73305Spp5 = this.LJLILLLLZI;
                if (c73305Spp5 != null) {
                    C73306Spq c73306Spq2 = new C73306Spq();
                    C73312Spw.LJIIIZ(c73306Spq2);
                    c73305Spp5.setStatus(c73306Spq2);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            }
            C73305Spp c73305Spp6 = this.LJLILLLLZI;
            if (c73305Spp6 != null) {
                C73306Spq c73306Spq3 = new C73306Spq();
                C73312Spw.LJIIIZ(c73306Spq3);
                c73305Spp6.setStatus(c73306Spq3);
                return;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final void M3() {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        View view = this.LJLIL;
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "content.context");
            if (!iLocationBaseServiceForMT.isSystemPrecise(context)) {
                W3("click_precise_banner", this.LJLLJ, true, new AqS165S0100000_15(this, 543));
                return;
            } else {
                P3("click_precise_banner", TokenCert.Companion.with("bpea-gps_banner_in_poi_search_page_in_app_precise"), true, new AqS165S0100000_15(this, 544));
                return;
            }
        }
        o.LJIJI("content");
        throw null;
    }

    public final void O3() {
        if (v3().getHeaderCount() != 0) {
            v3().LJLLI();
        }
    }

    public final void a4() {
        String string;
        String string2;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) withState(A3(), C85207XcJ.LJLIL);
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_magnify_glass;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        if (poiSearchResultWrapper == null || (string = poiSearchResultWrapper.hintMainTitle) == null) {
            C73305Spp c73305Spp = this.LJLILLLLZI;
            if (c73305Spp != null) {
                string = c73305Spp.getContext().getString(R.string.oz5);
                o.LJIIIIZZ(string, "statusView.context.getSt…earchPage_results_header)");
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        c73306Spq.LJFF = string;
        if (poiSearchResultWrapper == null || (string2 = poiSearchResultWrapper.hintSubtitle) == null) {
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 != null) {
                string2 = c73305Spp2.getContext().getString(R.string.oz4);
                o.LJIIIIZZ(string2, "statusView.context.getSt…hPage_results_emptystate)");
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        c73306Spq.LJI = string2;
        C73305Spp c73305Spp3 = this.LJLILLLLZI;
        if (c73305Spp3 != null) {
            c73305Spp3.setStatus(c73306Spq);
            v3().setVisibility(8);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        Object obj;
        Activity activity;
        super.onDestroy();
        Context context = getContext();
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        Context context2 = getContext();
        if (context2 != null) {
            activity = C45804HyK.LJIJJ(context2);
        } else {
            activity = null;
        }
        o.LJI(activity);
        inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        N3();
        wg(null);
    }

    @Override // X.C8W0
    public void onPause() {
        super.onPause();
        List<String> list = this.LJLJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (String str : list) {
            OHI ohi = OHI.LIZ;
            View view = this.LJLIL;
            if (view != null) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "content.context");
                ohi.getClass();
                arrayList.add(Boolean.valueOf(OHI.LJ(context, str)));
            } else {
                o.LJIJI("content");
                throw null;
            }
        }
        this.LJLJJI = arrayList;
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        o.LJIIIIZZ(LJIIIZ, "get().getService(IScreenshotService::class.java)");
        LJIIIZ.LJI(null);
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
        List<String> list = this.LJLJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (String str : list) {
            OHI ohi = OHI.LIZ;
            View view = this.LJLIL;
            if (view != null) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "content.context");
                ohi.getClass();
                arrayList.add(Boolean.valueOf(OHI.LJ(context, str)));
            } else {
                o.LJIJI("content");
                throw null;
            }
        }
        this.LJLJJL = arrayList;
        List<Boolean> list2 = this.LJLJJI;
        if (list2 != null) {
            ArrayList arrayList2 = (ArrayList) ORZ.LLJJIII(arrayList, list2);
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    OSZ osz = (OSZ) it.next();
                    if (((Boolean) osz.getFirst()).booleanValue() != ((Boolean) osz.getSecond()).booleanValue()) {
                        E3();
                        break;
                    }
                }
            }
            if (!this.LJLLLLLL) {
                this.LJLLLL = Z3();
            }
            ScreenShotService.LJIIIZ().LIZ("search_poi", new C85223XcZ());
            return;
        }
        o.LJIJI("lastLocationPermissionsStatus");
        throw null;
    }

    @Override // X.InterfaceC225588tG
    public String Z1() {
        return this.LJZI;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TokenCert with;
        TokenCert.Companion companion;
        String str;
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        List<String> list = this.LJLJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (String str2 : list) {
            OHI ohi = OHI.LIZ;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            ohi.getClass();
            arrayList.add(Boolean.valueOf(OHI.LJ(context, str2)));
        }
        this.LJLJJI = arrayList;
        this.LJLJJL = arrayList;
        this.LJZL = new C85221XcX();
        this.LJLLLL = Z3();
        if (A3().LJLIL == EnumC85244Xcu.ADD_LOCATION) {
            C85231Xch c85231Xch = C85231Xch.LIZIZ;
            if (!c85231Xch.LIZ()) {
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                Keva keva = c85231Xch.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("coarse_permission_popup_enter_poi_search_page");
                LIZ.append("_count_");
                LIZ.append(curUserId);
                int i = keva.getInt(X1D.LIZIZ(LIZ), 0);
                c85231Xch.LIZ.storeLong(a1.LJ("coarse_permission_popup_enter_poi_search_page", "_ts_", curUserId), System.currentTimeMillis());
                c85231Xch.LIZ.storeInt(a1.LJ("coarse_permission_popup_enter_poi_search_page", "_count_", curUserId), i + 1);
                if (this.LJLLI) {
                    companion = TokenCert.Companion;
                    str = "bpea-poi_search_auto_for_precise";
                } else {
                    companion = TokenCert.Companion;
                    str = "bpea-poi_search_auto";
                }
                R3(companion.with(str), F3().LJLILLLLZI, "add_location", new AqS165S0100000_15(this, 547));
            }
        }
        super.onViewCreated(view);
        View view2 = this.LJLIL;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.kf_);
            o.LJIIIIZZ(findViewById, "content.findViewById(R.id.status_view)");
            this.LJLILLLLZI = (C73305Spp) findViewById;
            View view3 = this.LJLIL;
            if (view3 != null) {
                View findViewById2 = view3.findViewById(R.id.m5j);
                o.LJIIIIZZ(findViewById2, "content.findViewById(R.i…ed_permission_no_results)");
                this.LJLJJLL = (TuxTextView) findViewById2;
                v3().LLLF.LJZL(H3());
                v3().LLLF.LJZL(PoiIpRecommendTipCell.class);
                PoiSearchVM A3 = A3();
                C56412MCa c56412MCa = new C56412MCa();
                c56412MCa.LIZ = true;
                A3.asyncSubscribe(new TBT() { // from class: X.XcE
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        C85192Xc4 c85192Xc4 = (C85192Xc4) obj;
                        c85192Xc4.getClass();
                        return C208708Ha.LIZLLL(c85192Xc4);
                    }
                }, c56412MCa, this, new AqS181S0100000_15(this, 95), C85230Xcg.LJLIL, new AqS181S0100000_15(this, 96));
                PoiSearchVM A32 = A3();
                C56412MCa c56412MCa2 = new C56412MCa();
                c56412MCa2.LIZ = true;
                A32.asyncSubscribe(new TBT() { // from class: X.XcF
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        C85192Xc4 c85192Xc4 = (C85192Xc4) obj;
                        c85192Xc4.getClass();
                        return C208708Ha.LIZJ(c85192Xc4);
                    }
                }, c56412MCa2, this, C85226Xcc.LJLIL, C85229Xcf.LJLIL, new AqS181S0100000_15(this, 94));
                C8YN.LJII(this, A3(), new TBT() { // from class: X.XcG
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C85192Xc4) obj).LJLILLLLZI;
                    }
                }, null, new AqS197S0100000_15(this, 19), 6);
                E3();
                if (A3().LJLIL != EnumC85244Xcu.POI_RE_TAG) {
                    ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
                    View view4 = this.LJLIL;
                    if (view4 != null) {
                        Context context2 = view4.getContext();
                        o.LJIIIIZZ(context2, "content.context");
                        if (!iLocationBaseServiceForMT.isSystemPrecise(context2)) {
                            String str3 = F3().LJLILLLLZI;
                            if (this.LJLLI) {
                                with = TokenCert.Companion.with("bpea-poi_search_request_system_conversion_popup_for_precise");
                            } else {
                                with = TokenCert.Companion.with("bpea-poi_search_request_system_conversion_popup");
                            }
                            X3(this, str3, with, false, new AqS165S0100000_15(this, 545), 4, null);
                        } else {
                            Q3(this, F3().LJLILLLLZI, this.LJLLILLLL, false, new AqS165S0100000_15(this, 546), 4, null);
                        }
                    } else {
                        o.LJIJI("content");
                        throw null;
                    }
                }
                PerfMonitorServiceImpl.LIZ().LJ(v3(), "poi_search");
                return;
            }
            o.LJIJI("content");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    @Override // X.InterfaceC225588tG
    public void wg(String str) {
        this.LJZI = str;
    }

    @Override // X.InterfaceC225588tG
    public void Gj(String str, boolean z) {
        boolean z2;
        String str2;
        Integer num;
        this.LJLZ = false;
        if (z) {
            LJII();
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            str2 = "search_poi";
        } else {
            str2 = "default_search_poi";
        }
        if (str == null || str.length() == 0) {
            View view = this.LJLJLLL;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View view2 = this.LJLJLLL;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        PoiSearchVM A3 = A3();
        if (str != null) {
            if (A3.LJLZ == 0) {
                A3.LJLZ = Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis();
            }
        } else {
            A3.getClass();
        }
        PoiSearchVM A32 = A3();
        A32.getClass();
        A32.setState(new AqS28S1000000_3(str, 32));
        A32.manualListRefresh();
        View view3 = this.LJLIL;
        String str3 = null;
        if (view3 != null) {
            boolean LIZJ = C45243HpH.LIZJ(view3, "content.context");
            String str4 = F3().LJLIL;
            PoiMobParam poiMobParam = A3().LJLLILLLL;
            if (poiMobParam != null) {
                num = poiMobParam.getAwemeType();
            } else {
                num = null;
            }
            long j = A3().LJLZ;
            PoiMobParam poiMobParam2 = A3().LJLLILLLL;
            if (poiMobParam2 != null) {
                str3 = poiMobParam2.getCreationId();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("enter_from", str4);
            if (str != null) {
                linkedHashMap.put("key_word", str);
            }
            C132805Jc.LJFF(linkedHashMap, "enter_method", str2, LIZJ ? 1 : 0, "enable_location");
            if (num != null) {
                linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
            }
            if (C78685UuP.LJJJZ(str)) {
                linkedHashMap.put("search_session_id", String.valueOf(j));
            }
            if (C78685UuP.LJJJZ(str3)) {
                linkedHashMap.put("creation_id", str3);
            }
            linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
            FMX.LJIIL("search_poi", linkedHashMap);
            return;
        }
        o.LJIJI("content");
        throw null;
    }

    public final void K3(boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            Context context = c73305Spp.getContext();
            o.LJIIIIZZ(context, "statusView.context");
            OSZ<String, String> LIZ = T35.LIZ(context);
            if (this.LJZ == null) {
                this.LJZ = new T3D(new AqS165S0100000_15(this, 539), new AqS165S0100000_15(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 540), true);
            }
            T3D t3d = this.LJZ;
            if (t3d != null) {
                t3d.LIZ();
            }
            if (z) {
                C73305Spp c73305Spp2 = this.LJLILLLLZI;
                if (c73305Spp2 != null) {
                    c73305Spp2.setVisibility(8);
                    C73305Spp c73305Spp3 = this.LJLILLLLZI;
                    if (c73305Spp3 != null) {
                        T35.LIZIZ(c73305Spp3.getContext());
                        return;
                    } else {
                        o.LJIJI("statusView");
                        throw null;
                    }
                }
                o.LJIJI("statusView");
                throw null;
            }
            C73305Spp c73305Spp4 = this.LJLILLLLZI;
            if (c73305Spp4 != null) {
                c73305Spp4.setVisibility(0);
                C73305Spp c73305Spp5 = this.LJLILLLLZI;
                if (c73305Spp5 != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    C73312Spw.LJIIIIZZ(c73306Spq, LIZ.getFirst(), LIZ.getSecond(), 0, new AqS165S0100000_15(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 541), 28);
                    c73305Spp5.setStatus(c73306Spq);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.InterfaceC225588tG
    public void cj(String str, String str2) {
        if (!o.LJ(str, str2)) {
            C12460eI.LIZ(v3());
        }
    }

    private final void W3(String str, TokenCert tokenCert, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        View view = this.LJLIL;
        if (view != null) {
            Context context = view.getContext();
            o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) context;
            String str2 = F3().LJLIL;
            if (str2 == null) {
                str2 = "video_post_page";
            }
            iLocationBaseServiceForMT.requestSystemConversionPopup("poi", "add_location", tokenCert, activityC45651qj, new C85258Xd8("search_poi", str, str2, false, 248), new C85225Xcb(this, interfaceC65784Pro), true, z);
            return;
        }
        o.LJIJI("content");
        throw null;
    }

    public final void P3(String str, TokenCert tokenCert, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        E8H e8h;
        boolean inAppPreciseUnknown = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).inAppPreciseUnknown();
        boolean isInAppPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise();
        if (!z) {
            if (inAppPreciseUnknown) {
                e8h = C85233Xcj.LIZIZ;
            } else {
                e8h = C85232Xci.LIZIZ;
            }
        } else {
            e8h = null;
        }
        if (inAppPreciseUnknown || !isInAppPrecise) {
            Object service = ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            o.LJIIIIZZ(service, "get().getService(ILocati…ServiceForMT::class.java)");
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) service;
            String str2 = F3().LJLIL;
            if (str2 == null) {
                str2 = "video_post_page";
            }
            View view = this.LJLIL;
            if (view != null) {
                Context context = view.getContext();
                o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                C54578LbS.LIZ(iLocationBaseServiceForMT, "search_poi", str2, (ActivityC45651qj) context, e8h, tokenCert, new AqS162S0200000_15(this, (PoiSearchAssem) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 20), null, null, str, 192);
                return;
            }
            o.LJIJI("content");
            throw null;
        }
    }

    public final void R3(Cert cert, String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str3 = F3().LJLIL;
        if (str3 == null) {
            str3 = "video_post_page";
        }
        C8TO.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        boolean z = true;
        if (FFL.LJIIJ(31744, 1, "poi_search_page_permission_popup", false) != 2 || !o.LJ(F3().LJLIL, "video_edit_page")) {
            z = false;
        }
        C85258Xd8 c85258Xd8 = new C85258Xd8("search_poi", str, str3, z, 240);
        C56179M3b c56179M3b = C56179M3b.LIZ;
        View view = this.LJLIL;
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "content.context");
            if (!c56179M3b.LJIILLIIL(0, context)) {
                View view2 = this.LJLIL;
                if (view2 != null) {
                    Context context2 = view2.getContext();
                    o.LJII(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    c56179M3b.LJIJI("poi", str2, cert, (ActivityC45651qj) context2, c85258Xd8, new C85224Xca(this, interfaceC65784Pro), null);
                    return;
                }
                o.LJIJI("content");
                throw null;
            }
            return;
        }
        o.LJIJI("content");
        throw null;
    }

    public static /* synthetic */ void Q3(PoiSearchAssem poiSearchAssem, String str, TokenCert tokenCert, boolean z, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        poiSearchAssem.P3(str, tokenCert, z, interfaceC65784Pro);
    }

    public static /* synthetic */ void U3(PoiSearchAssem poiSearchAssem, Cert cert, String str, String str2, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        poiSearchAssem.R3(cert, str, str2, interfaceC65784Pro);
    }

    public static /* synthetic */ void X3(PoiSearchAssem poiSearchAssem, String str, TokenCert tokenCert, boolean z, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        poiSearchAssem.W3(str, tokenCert, z, interfaceC65784Pro);
    }
}
