package com.ss.android.ugc.aweme.poi.videopublish;

import X.AII;
import X.AbstractC72772ShE;
import X.AbstractC72775ShH;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C212608Wa;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C225248si;
import X.C26338AVi;
import X.C32151Nz;
import X.C32I;
import X.C45243HpH;
import X.C47261Igj;
import X.C47704Ins;
import X.C48203Ivv;
import X.C51733KSb;
import X.C53148KtU;
import X.C53258KvG;
import X.C54578LbS;
import X.C55749LuL;
import X.C56412MCa;
import X.C56440MDc;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78924UyG;
import X.C78926UyI;
import X.C84661XKn;
import X.C85233Xcj;
import X.C85256Xd6;
import X.C85315Xe3;
import X.C85350Xec;
import X.C85360Xem;
import X.C85367Xet;
import X.C85378Xf4;
import X.C85379Xf5;
import X.C85385XfB;
import X.C85387XfD;
import X.C85390XfG;
import X.C85395XfL;
import X.C8W0;
import X.C8YN;
import X.C9BE;
import X.EnumC85345XeX;
import X.FRW;
import X.InterfaceC40948G5g;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.MBB;
import X.O6R;
import X.T5R;
import X.TBT;
import X.TBV;
import X.X1D;
import X.XKX;
import Y.ACListenerS29S0100000_9;
import Y.ACListenerS35S0100000_15;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS40S0200000_9;
import Y.IDObjectS0S0101000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.anchor.service.AnchorOperationServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS177S0200000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiPublishExtensionAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public String LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;
    public View LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final C214298b3 LJLJL;
    public final C214378bB LJLJLJ;
    public final HashSet<String> LJLJLLL;
    public final List<Boolean> LJLL;
    public TuxIconView LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final ACListenerS35S0100000_15 LJLLJ;
    public final ACListenerS35S0100000_15 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C55749LuL LJLZ;
    public final C62822Ol8 LJZ;
    public final AnchorLock$IAnchorStateService LJZI;
    public final AnchorLock$IAnchorOperationService LJZL;
    public final C62822Ol8 LL;
    public EnumC85345XeX LLD;
    public Integer LLF;
    public final List<TuxTextView> LLFF;
    public String LLFFF;
    public final C212608Wa LLFII;
    public boolean LLFZ;

    static {
        TBV tbv = new TBV(PoiPublishExtensionAssem.class, "addLocationCellShowTs", "getAddLocationCellShowTs()J", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbv};
    }

    public PoiPublishExtensionAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = "";
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiPublishExtensionVM.class);
        this.LJLJL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 660), C85378Xf4.INSTANCE, null);
        C85395XfL c85395XfL = C85395XfL.LJLIL;
        C65776Prg LIZ2 = C65352Pkq.LIZ(PoiSearchVM.class);
        C85379Xf5 c85379Xf5 = C85379Xf5.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS165S0100000_15((C8W0) this, 558);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJLJ = new C214378bB(LIZ2, c85395XfL, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c85379Xf5, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJLLL = new HashSet<>();
        this.LJLL = new ArrayList();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 661));
        this.LJLLJ = new ACListenerS35S0100000_15(this, 118);
        this.LJLLL = new ACListenerS35S0100000_15(this, 117);
        this.LJLLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 563));
        this.LJLLLLLL = C221108m2.LIZIZ(C85387XfD.LJLIL);
        this.LJLZ = new C55749LuL(C47704Ins.LIZJ(this, C85360Xem.class, "PoiPublishExtensionData"), checkSupervisorPrepared());
        this.LJZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 562));
        this.LJZI = AnchorStateServiceImpl.LJIIJ();
        this.LJZL = AnchorOperationServiceImpl.LIZJ();
        this.LL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 559));
        this.LLFF = new ArrayList();
        this.LLFII = new C212608Wa();
        this.LLFZ = true;
    }

    public final void C3() {
        C56440MDc c56440MDc = new C56440MDc(this);
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert with = companion.with("bpea-poi_publish_extension_fetcher_location");
        with.auth("mttu");
        TokenCert with2 = companion.with("bpea-poi_publish_extension_fetcher_location_decrypt");
        with2.auth("mckd");
        C51733KSb.LIZ("poi", "add_location", with, with2, c56440MDc, 32);
    }

    public final AII E3() {
        return (AII) this.LJLLILLLL.getValue();
    }

    public final C85360Xem F3() {
        return (C85360Xem) this.LJLZ.getValue();
    }

    public final HorizontalScrollView H3() {
        return (HorizontalScrollView) this.LL.getValue();
    }

    public final AVPublishPageScene I3() {
        return (AVPublishPageScene) this.LJZ.getValue();
    }

    public final LinearLayout K3() {
        return (LinearLayout) this.LJLLLL.getValue();
    }

    public final IAVPublishService L3() {
        return (IAVPublishService) this.LJLLLLLL.getValue();
    }

    public final PoiPublishExtensionVM P3() {
        return (PoiPublishExtensionVM) this.LJLJL.getValue();
    }

    public final boolean R3() {
        View view = this.LJLJJI;
        if (view != null) {
            return C45243HpH.LIZJ(view, "content.context");
        }
        o.LJIJI("content");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        if (r1 != null) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e4() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem.e4():void");
    }

    public final String M3() {
        return (String) withState(P3(), C85367Xet.LJLIL);
    }

    public final int O3() {
        if (L3().isEnableCombineCDS()) {
            return 62;
        }
        if (L3().isEnablePutSettingsIntoMoreOption()) {
            return 61;
        }
        return 72;
    }

    public final boolean X3() {
        if (F3().LJLJI == null && I3() == AVPublishPageScene.MAIN) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C84661XKn c84661XKn = P3().LJLJJLL;
        if (c84661XKn != null) {
            c84661XKn.LIZIZ(null);
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        Integer num;
        super.onResume();
        EnumC85345XeX enumC85345XeX = this.LLD;
        boolean z = true;
        if (enumC85345XeX != null && enumC85345XeX != x3() && P3().getState().LJLILLLLZI == null && ((num = this.LLF) == null || num.intValue() != 2)) {
            if (R3()) {
                C3();
                Iterator it = ((ArrayList) this.LJLL).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    c4(this, 4, null, 6);
                } else {
                    c4(this, 5, null, 6);
                }
            } else {
                Y3(null);
            }
        }
        if (this.LJLJLLL.isEmpty() && !this.LLFZ) {
            H3().post(new ARunnableS45S0100000_9(this, 93));
        }
    }

    public final EnumC85345XeX x3() {
        if (!R3()) {
            return EnumC85345XeX.NOT_GRANTED;
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        View view = this.LJLJJI;
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "content.context");
            boolean isSystemPrecise = iLocationBaseServiceForMT.isSystemPrecise(context);
            boolean inAppPreciseUnknown = iLocationBaseServiceForMT.inAppPreciseUnknown();
            boolean isInAppPrecise = iLocationBaseServiceForMT.isInAppPrecise();
            if (!inAppPreciseUnknown && isInAppPrecise && isSystemPrecise) {
                return EnumC85345XeX.PRECISE;
            }
            return EnumC85345XeX.COARSE;
        }
        o.LJIJI("content");
        throw null;
    }

    public final void A3(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(new AUListenerS97S0100000_9(this, 13));
        valueAnimator.addListener(new IDAListenerS40S0200000_9(this, interfaceC65784Pro, 0));
        valueAnimator.start();
    }

    public final CharSequence N3(String str) {
        if (L3().isEnablePutSettingsIntoMoreOption()) {
            T5R t5r = new T5R(str);
            t5r.LIZ(42);
            return t5r;
        }
        return str;
    }

    public final void U3(int i) {
        String creationId = F3().LJLILLLLZI.getMobParam().getCreationId();
        View view = this.LJLJJI;
        if (view != null) {
            C225248si.LJIILLIIL(C45243HpH.LIZJ(view, "content.context") ? 1 : 0, i, this.LJLJI ? 1 : 0, creationId);
            return;
        }
        o.LJIJI("content");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y3(com.bytedance.bdlocation.BDLocation r26) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem.Y3(com.bytedance.bdlocation.BDLocation):void");
    }

    public final void Z3(boolean z) {
        LinearLayout poiContainer = K3();
        o.LJIIIIZZ(poiContainer, "poiContainer");
        Iterator<View> it = C78924UyG.LIZLLL(poiContainer).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (iDObjectS0S0101000.hasNext()) {
                View view = (View) iDObjectS0S0101000.next();
                if (view instanceof AbstractC72772ShE) {
                    ((AbstractC72775ShH) view).setLoading(z);
                    view.invalidate();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a4(X.InterfaceC67352kd<? super java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem.a4(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        boolean z;
        String str3;
        PoiData poiData;
        String str4;
        Resources resources;
        o.LJIIIZ(view, "view");
        this.LLFII.LIZIZ(LLI[0], this, Long.valueOf(System.currentTimeMillis()));
        this.LJLJJI = view;
        P3().LJLJJL = F3().LJLILLLLZI.getMobParam().getEnterFrom();
        AssemViewModel.asyncSubscribe$default(P3(), new TBT() { // from class: X.Xf2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85286Xda) obj).LJLIL;
            }
        }, null, new AqS181S0100000_15(this, 103), null, new AqS181S0100000_15(this, 104), 10, null);
        if (C53258KvG.LIZIZ()) {
            this.LJZL.LIZIZ(3, new AqS165S0100000_15(this, 560));
            this.LJZL.LIZIZ(1, new AqS165S0100000_15(this, 561));
        }
        PoiPublishExtensionVM P3 = P3();
        C85390XfG c85390XfG = new TBT() { // from class: X.XfG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C85286Xda) obj).LJLILLLLZI;
            }
        };
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZ = true;
        C8YN.LJII(this, P3, c85390XfG, c56412MCa, new AqS177S0200000_15(this, view, 0), 4);
        C16880lQ.LJJJ((TuxIconView) E3()._$_findCachedViewById(R.id.mu), new ACListenerS35S0100000_15(this, 180));
        TuxIconView tuxIconView = this.LJLLI;
        if (tuxIconView != null) {
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 181), tuxIconView);
        }
        C16880lQ.LJJJ((TuxIconView) E3()._$_findCachedViewById(R.id.elx), new ACListenerS29S0100000_9(this, 94));
        View _$_findCachedViewById = E3()._$_findCachedViewById(R.id.elx);
        o.LJIIIIZZ(_$_findCachedViewById, "clAddLocation.info_icon");
        C78897Uxp.LJJJJLI(_$_findCachedViewById, null);
        AII E3 = E3();
        View view2 = this.LJLJJI;
        if (view2 != null) {
            Context context = view2.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getString(R.string.p12);
            } else {
                str = null;
            }
            E3.setTitle(N3(str));
            InterfaceC40948G5g publishExtensionDataContainer = F3().LJLILLLLZI.getPublishExtensionDataContainer();
            if (publishExtensionDataContainer != null) {
                str2 = ((VideoPublishContainerScene) publishExtensionDataContainer).LLLLJ();
            } else {
                str2 = null;
            }
            PublishExtensionModel fromString = PublishExtensionModel.fromString(str2);
            if (fromString != null && (poiData = fromString.poiData) != null) {
                this.LJLJJL = true;
                this.LJLJJLL = true;
                P3().iv0(poiData);
                PoiPublishExtensionVM P32 = P3();
                PoiMobParam mobParam = poiData.getMobParam();
                if (mobParam != null) {
                    str4 = mobParam.getEnterMethod();
                } else {
                    str4 = null;
                }
                P32.LJLIL = str4;
                P3().LJLILLLLZI = poiData.getLogId();
                U3(1);
            }
            PoiData poiData2 = F3().LJLILLLLZI.getPoiData();
            if (poiData2 != null) {
                P3().iv0(poiData2);
                PoiPublishExtensionVM P33 = P3();
                PoiMobParam mobParam2 = poiData2.getMobParam();
                if (mobParam2 != null) {
                    str3 = mobParam2.getEnterMethod();
                } else {
                    str3 = null;
                }
                P33.LJLIL = str3;
                P3().LJLILLLLZI = poiData2.getLogId();
                U3(1);
                z = true;
            } else {
                z = false;
            }
            if (!this.LJLJJL && !z) {
                U3(0);
            }
            if (!this.LJLJJL && !z && !X3() && I3() == AVPublishPageScene.MAIN) {
                P3().LJLIL = "poi_sticker";
                P3().iv0(F3().LJLJI);
            }
            if (!this.LJLJJL && !z && X3()) {
                View view3 = this.LJLJJI;
                if (view3 != null) {
                    if (C45243HpH.LIZJ(view3, "content.context")) {
                        C3();
                    } else {
                        Y3(null);
                    }
                } else {
                    o.LJIJI("content");
                    throw null;
                }
            }
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            View view4 = this.LJLJJI;
            if (view4 != null) {
                Context context2 = view4.getContext();
                o.LJIIIIZZ(context2, "content.context");
                boolean isSystemPrecise = iLocationBaseServiceForMT.isSystemPrecise(context2);
                boolean inAppPreciseUnknown = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).inAppPreciseUnknown();
                boolean isInAppPrecise = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).isInAppPrecise();
                if (!C53148KtU.LIZ() ? !(!isSystemPrecise || !inAppPreciseUnknown) : !(!isSystemPrecise || isInAppPrecise)) {
                    Object service = ServiceManager.get().getService(ILocationBaseServiceForMT.class);
                    o.LJIIIIZZ(service, "get().getService(ILocati…ServiceForMT::class.java)");
                    ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) service;
                    View view5 = this.LJLJJI;
                    if (view5 != null) {
                        Context context3 = view5.getContext();
                        o.LJII(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        C54578LbS.LIZ(iLocationBaseServiceForMT2, "video_post_page", null, (ActivityC45651qj) context3, C85233Xcj.LIZIZ, TokenCert.Companion.with("bpea-fetch_fine_location_permission_in_publish_page"), new AqS165S0100000_15(this, 767), null, null, null, 448);
                    } else {
                        o.LJIJI("content");
                        throw null;
                    }
                }
                this.LJLJLJ.getValue();
                return;
            }
            o.LJIJI("content");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    public final void v3(boolean z) {
        E3()._$_findCachedViewById(R.id.mu);
        if (z) {
            E3().setShowArrow(true);
            TuxIconView tuxIconView = this.LJLLI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            View _$_findCachedViewById = E3()._$_findCachedViewById(R.id.b86);
            o.LJIIIIZZ(_$_findCachedViewById, "clAddLocation.cell_container");
            C26338AVi.LJIIIZ(_$_findCachedViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, 26);
            return;
        }
        E3().setShowArrow(false);
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(0);
        }
        View _$_findCachedViewById2 = E3()._$_findCachedViewById(R.id.b86);
        o.LJIIIIZZ(_$_findCachedViewById2, "clAddLocation.cell_container");
        C26338AVi.LJIIIZ(_$_findCachedViewById2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 26);
    }

    public final void Q3(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, boolean z) {
        boolean z2;
        List<PoiData> list;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        if (poiSearchResultWrapper != null && poiSearchResultWrapper.code == 200) {
            z2 = true;
        } else {
            z2 = false;
        }
        Integer num = null;
        if (poiSearchResultWrapper != null && (poiSearchResult = poiSearchResultWrapper.poiSearchResult) != null) {
            list = poiSearchResult.getPoiList();
        } else {
            list = null;
        }
        if (z2) {
            if (list != null && !list.isEmpty()) {
                XKX.LJ(MBB.INSTANCE, new C85350Xec(poiSearchResultWrapper, this, null));
                return;
            }
            Context context = getContext();
            if (context != null && C85256Xd6.LIZIZ(context)) {
                withState(P3(), new AqS181S0100000_15(this, 101));
            } else if (C85256Xd6.LIZ()) {
                c4(this, 0, null, 6);
            } else {
                c4(this, 3, null, 6);
            }
            FRW.LIZIZ(2L, "poi_data_request_result");
            W3(0, 0, this.LJLILLLLZI, "poi list is empty");
            return;
        }
        Context context2 = getContext();
        if (context2 != null && C85256Xd6.LIZIZ(context2)) {
            withState(P3(), new AqS181S0100000_15(this, 102));
        } else {
            x3();
        }
        if (z) {
            View view = this.LJLJJI;
            if (view != null) {
                Context context3 = view.getContext();
                o.LJIIIIZZ(context3, "content.context");
                if (C48203Ivv.LJ(context3)) {
                    FRW.LIZIZ(4L, "poi_data_request_result");
                    W3(0, 0, this.LJLILLLLZI, "network is available");
                    return;
                } else {
                    FRW.LIZIZ(5L, "poi_data_request_result");
                    W3(0, 0, this.LJLILLLLZI, "search_poi response is empty");
                    return;
                }
            }
            o.LJIJI("content");
            throw null;
        }
        FRW.LIZIZ(3L, "poi_data_request_result");
        long j = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("status code = ");
        PoiSearchApi.PoiSearchResultWrapper LIZ2 = P3().getState().LJLIL.LIZ();
        if (LIZ2 != null) {
            num = Integer.valueOf(LIZ2.status_code);
        }
        LIZ.append(num);
        W3(0, 0, j, X1D.LIZIZ(LIZ));
    }

    public final void b4(int i, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Resources resources;
        Resources resources2;
        E3().setWithInfoIcon(false);
        String str = null;
        switch (i) {
            case 0:
                v3(true);
                H3().setVisibility(8);
                if (C85256Xd6.LIZ() && I3() == AVPublishPageScene.MAIN) {
                    AII E3 = E3();
                    Context context = getContext();
                    if (context != null && (resources2 = context.getResources()) != null) {
                        str = resources2.getString(R.string.e59);
                    }
                    E3.setSubtitle(str);
                    C225248si.LJIJ("video_post_page", "turn_on_location", F3().LJLILLLLZI.getMobParam().getCreationId(), F3().LJLIL.getContentType(), F3().LJLILLLLZI.getMobParam().getShootWay());
                    C16880lQ.LJJJJI((TuxTextView) E3()._$_findCachedViewById(R.id.ks_), this.LJLLJ);
                    break;
                }
                break;
            case 1:
                v3(true);
                Boolean valueOf = Boolean.valueOf(this.LJLJI);
                AII E32 = E3();
                Boolean bool = Boolean.TRUE;
                E32.setWithInfoIcon(true ^ o.LJ(valueOf, bool));
                if (!o.LJ(valueOf, bool)) {
                    t1.LJFF("enter_from", "video_post_page", "location_info_prompt_button_show");
                }
                E3().setSubtitle(null);
                if (this.LJZI.LJII(2)) {
                    if (!z) {
                        A3(interfaceC65784Pro);
                        break;
                    } else {
                        E3()._$_findCachedViewById(R.id.ks_).postDelayed(new ARunnableS28S0200000_9(interfaceC65784Pro, this, 25), 800L);
                        break;
                    }
                }
                break;
            case 2:
                v3(false);
                E3().setSubtitle(null);
                H3().setVisibility(8);
                break;
            case 3:
                v3(true);
                H3().setVisibility(8);
                if (I3() == AVPublishPageScene.MAIN) {
                    AII E33 = E3();
                    Context context2 = getContext();
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        str = resources.getString(R.string.oz2);
                    }
                    E33.setSubtitle(str);
                    C225248si.LJIJ("video_post_page", "try_search", F3().LJLILLLLZI.getMobParam().getCreationId(), F3().LJLIL.getContentType(), F3().LJLILLLLZI.getMobParam().getShootWay());
                    C16880lQ.LJJJJI((TuxTextView) E3()._$_findCachedViewById(R.id.ks_), this.LJLLL);
                    break;
                }
                break;
            case 4:
                v3(true);
                E3().setSubtitle(null);
                H3().setVisibility(8);
                break;
            case 5:
                v3(true);
                E3().setSubtitle(null);
                H3().setVisibility(0);
                Z3(true);
                break;
            case 6:
                v3(true);
                Boolean valueOf2 = Boolean.valueOf(this.LJLJI);
                AII E34 = E3();
                Boolean bool2 = Boolean.TRUE;
                E34.setWithInfoIcon(!o.LJ(valueOf2, bool2));
                if (!o.LJ(valueOf2, bool2)) {
                    t1.LJFF("enter_from", "video_post_page", "location_info_prompt_button_show");
                }
                E3().setSubtitle(null);
                Z3(false);
                break;
        }
        this.LLF = Integer.valueOf(i);
    }

    public static /* synthetic */ void c4(PoiPublishExtensionAssem poiPublishExtensionAssem, int i, AqS165S0100000_15 aqS165S0100000_15, int i2) {
        if ((i2 & 4) != 0) {
            aqS165S0100000_15 = null;
        }
        poiPublishExtensionAssem.b4(i, false, aqS165S0100000_15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    public final void W3(int i, int i2, long j, String str) {
        ?? r12;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        List<PoiData> poiList;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) withState(P3(), C85385XfB.LJLIL);
        String str2 = "";
        if (poiSearchResultWrapper != null && (poiSearchResult = poiSearchResultWrapper.poiSearchResult) != null && (poiList = poiSearchResult.getPoiList()) != null) {
            r12 = new ArrayList(C32I.LJJL(poiList, 10));
            Iterator<PoiData> it = poiList.iterator();
            while (it.hasNext()) {
                String poiId = it.next().getPoiId();
                if (poiId == null) {
                    poiId = "";
                }
                r12.add(poiId);
            }
        } else {
            r12 = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = r12.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            it2.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                arrayList.add(String.valueOf(i3));
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String str3 = (String) withState(P3(), C85315Xe3.LJLIL);
        String creationId = F3().LJLILLLLZI.getMobParam().getCreationId();
        String contentType = F3().LJLIL.getContentType();
        String shootWay = F3().LJLILLLLZI.getMobParam().getShootWay();
        if (shootWay != null) {
            str2 = shootWay;
        }
        View view = this.LJLJJI;
        if (view != null) {
            C225248si.LJJ(i, creationId, contentType, str2, C45243HpH.LIZJ(view, "content.context") ? 1 : 0, j, i2, str, r12, arrayList, str3);
        } else {
            o.LJIJI("content");
            throw null;
        }
    }
}
