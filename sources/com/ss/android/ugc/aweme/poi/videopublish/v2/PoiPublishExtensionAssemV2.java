package com.ss.android.ugc.aweme.poi.videopublish.v2;

import X.AII;
import X.AbstractC72772ShE;
import X.AbstractC72775ShH;
import X.AbstractC85354Xeg;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C212428Vi;
import X.C212608Wa;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C225248si;
import X.C26338AVi;
import X.C2K0;
import X.C32151Nz;
import X.C32I;
import X.C45804HyK;
import X.C47261Igj;
import X.C47704Ins;
import X.C48203Ivv;
import X.C53148KtU;
import X.C54578LbS;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C56412MCa;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78924UyG;
import X.C78926UyI;
import X.C85233Xcj;
import X.C85246Xcw;
import X.C85256Xd6;
import X.C85339XeR;
import X.C85342XeU;
import X.C85349Xeb;
import X.C85351Xed;
import X.C85353Xef;
import X.C85355Xeh;
import X.C85358Xek;
import X.C85359Xel;
import X.C85366Xes;
import X.C85373Xez;
import X.C85380Xf6;
import X.C85381Xf7;
import X.C85386XfC;
import X.C85388XfE;
import X.C85391XfH;
import X.C85396XfM;
import X.C85400XfQ;
import X.C8W0;
import X.C8YN;
import X.C9BE;
import X.EV9;
import X.EnumC85244Xcu;
import X.EnumC85364Xeq;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterfaceC85336XeO;
import X.MBB;
import X.O6R;
import X.SYL;
import X.T5R;
import X.TBT;
import X.TBV;
import X.X1D;
import X.XKX;
import Y.ACListenerS29S0100000_9;
import Y.ACListenerS35S0100000_15;
import Y.ARunnableS28S0200000_9;
import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS40S0200000_9;
import Y.IDObjectS0S0101000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell;
import com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListFooterCell;
import com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListHeaderCell;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PoiPublishExtensionAssemV2 extends UIContentAssem implements IPoiPublishUpdateUiStatusAbility {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public View LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214378bB LJLJI;
    public final C62822Ol8 LJLJJI;
    public TuxIconView LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final ACListenerS35S0100000_15 LJLJL;
    public final ACListenerS35S0100000_15 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C55749LuL LJLL;
    public AbstractC85354Xeg LJLLI;
    public final AnchorLock$IAnchorStateService LJLLILLLL;
    public final C85339XeR LJLLJ;
    public EnumC85364Xeq LJLLL;
    public final C212608Wa LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();

    static {
        TBV tbv = new TBV(PoiPublishExtensionAssemV2.class, "addLocationCellShowTs", "getAddLocationCellShowTs()J", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbv};
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJZ;
        Integer valueOf = Integer.valueOf(R.id.iol);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.iol)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public PoiPublishExtensionAssemV2() {
        InterfaceC65784Pro LJIILJJIL;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiPublishExtensionVMV2.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 663), C85380Xf6.INSTANCE, null);
        C85396XfM c85396XfM = C85396XfM.LJLIL;
        C65776Prg LIZ2 = C65352Pkq.LIZ(PoiSearchVM.class);
        C85381Xf7 c85381Xf7 = C85381Xf7.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS165S0100000_15((C8W0) this, 567);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJI = new C214378bB(LIZ2, c85396XfM, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c85381Xf7, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJJI = C221108m2.LIZIZ(C85388XfE.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 662));
        this.LJLJL = new ACListenerS35S0100000_15(this, LiveTryModeCountDownThresholdSetting.DEFAULT);
        this.LJLJLJ = new ACListenerS35S0100000_15(this, 119);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 565));
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, C85359Xel.class, "PoiPublishExtensionDataV2"), checkSupervisorPrepared());
        this.LJLLILLLL = AnchorStateServiceImpl.LJIIJ();
        this.LJLLJ = C85342XeU.LIZ();
        this.LJLLLL = new C212608Wa();
        this.LJLLLLLL = true;
    }

    public final AII C3() {
        return (AII) this.LJLJJLL.getValue();
    }

    public final C85359Xel E3() {
        return (C85359Xel) this.LJLL.getValue();
    }

    public final LinearLayout F3() {
        return (LinearLayout) this.LJLJLLL.getValue();
    }

    public final PoiPublishExtensionVMV2 I3() {
        return (PoiPublishExtensionVMV2) this.LJLILLLLZI.getValue();
    }

    public final void M3() {
        List<InterfaceC57784Mm4> listItems = ((SYL) _$_findCachedViewById(R.id.iol)).getListItems();
        if (listItems == null || listItems.isEmpty()) {
            return;
        }
        ((SYL) _$_findCachedViewById(R.id.iol)).getState().LJFF();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((InterfaceC85336XeO) I3().LJLL.getValue().getOperator()).LJIJJLI();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), IPoiPublishUpdateUiStatusAbility.class, null);
        }
    }

    public final void x3() {
        if (C85256Xd6.LIZ()) {
            R3(this, EnumC85364Xeq.STATUS_NO_POI, false, 6);
        } else {
            R3(this, EnumC85364Xeq.STATUS_POI_ERROR, false, 6);
        }
    }

    public final void A3(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(new AUListenerS97S0100000_9(this, 14));
        valueAnimator.addListener(new IDAListenerS40S0200000_9(this, interfaceC65784Pro, 1));
        valueAnimator.start();
    }

    public final CharSequence H3(String str) {
        if (((IAVPublishService) this.LJLJJI.getValue()).isEnablePutSettingsIntoMoreOption()) {
            T5R t5r = new T5R(str);
            t5r.LIZ(42);
            return t5r;
        }
        return str;
    }

    public final void N3(boolean z) {
        ViewGroup rcmd_list = (ViewGroup) _$_findCachedViewById(R.id.iol);
        o.LJIIIIZZ(rcmd_list, "rcmd_list");
        Iterator<View> it = C78924UyG.LIZLLL(rcmd_list).iterator();
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O3(X.InterfaceC67352kd<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C85363Xep
            if (r0 == 0) goto L87
            r3 = r7
            X.Xep r3 = (X.C85363Xep) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L12:
            java.lang.Object r2 = r3.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJI
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 != r5) goto La6
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionAssemV2 r1 = r3.LJLIL
            X.C141335gf.LIZJ(r2)
        L22:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L8d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L2d:
            X.C141335gf.LIZJ(r2)
            android.content.Context r0 = r6.getContext()
            if (r0 != 0) goto L39
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L39:
            X.Xdk r0 = X.C85296Xdk.LIZ
            r0.getClass()
            java.lang.String r1 = "poi"
            java.lang.String r0 = "add_location"
            boolean r0 = X.C85296Xdk.LIZLLL(r1, r0)
            if (r0 != 0) goto L4b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L4b:
            X.OHI r2 = X.OHI.LIZ
            android.view.View r0 = r6.LJLIL
            if (r0 == 0) goto Lae
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "content.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.getClass()
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = X.OHI.LJ(r1, r0)
            if (r0 == 0) goto L68
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L68:
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2 r0 = r6.I3()
            r3.LJLIL = r6
            r3.LJLJJI = r5
            X.8as r0 = r0.LJLL
            java.lang.Object r0 = r0.getValue()
            X.8aw r0 = (X.InterfaceC214228aw) r0
            X.3e4 r0 = r0.getOperator()
            X.XeO r0 = (X.InterfaceC85336XeO) r0
            java.lang.Object r2 = r0.LJJJJLL(r3)
            if (r2 != r4) goto L85
            return r4
        L85:
            r1 = r6
            goto L22
        L87:
            X.Xep r3 = new X.Xep
            r3.<init>(r6, r7)
            goto L12
        L8d:
            r0 = 2131374314(0x7f0a30ea, float:1.8368744E38)
            android.view.View r0 = r1._$_findCachedViewById(r0)
            X.SYL r0 = (X.SYL) r0
            X.Sho r2 = r0.getState()
            X.DwL r1 = new X.DwL
            r0 = 0
            r1.<init>(r0)
            r2.LIZJ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lae:
            java.lang.String r0 = "content"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionAssemV2.O3(X.2kd):java.lang.Object");
    }

    public final void P3(Boolean bool) {
        AII C3 = C3();
        Boolean bool2 = Boolean.TRUE;
        C3.setWithInfoIcon(!o.LJ(bool, bool2));
        if (!o.LJ(bool, bool2)) {
            t1.LJFF("enter_from", "video_post_page", "location_info_prompt_button_show");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AbstractC85354Xeg c85355Xeh;
        String str;
        Resources resources;
        o.LJIIIZ(view, "view");
        boolean z = false;
        this.LJLLLL.LIZIZ(LJZI[0], this, Long.valueOf(System.currentTimeMillis()));
        this.LJLIL = view;
        I3().LJLJJL = E3().LJLILLLLZI.getMobParam().getEnterFrom();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            InterfaceC55235Lm3 LIZLLL = C55230Lly.LIZLLL(LIZ, null);
            C2K0 LIZ2 = C55096Ljo.LIZ(LIZLLL, IPoiPublishUpdateUiStatusAbility.class, null);
            if (LIZ2 == null) {
                C55096Ljo.LJIIJJI(LIZLLL, this, IPoiPublishUpdateUiStatusAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ2);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ2);
                    Object newProxyInstance = Proxy.newProxyInstance(IPoiPublishUpdateUiStatusAbility.class.getClassLoader(), new Class[]{IPoiPublishUpdateUiStatusAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZLLL, (C2K0) newProxyInstance, IPoiPublishUpdateUiStatusAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.videopublish.v2.IPoiPublishUpdateUiStatusAbility");
                    }
                }
            }
        }
        View view2 = this.LJLIL;
        if (view2 != null) {
            Context context = view2.getContext();
            o.LJIIIIZZ(context, "content.context");
            C85373Xez c85373Xez = new C85373Xez(context, this, E3());
            EnumC85244Xcu pageScene = E3().LJLJJI;
            o.LJIIIZ(pageScene, "pageScene");
            int i = C85246Xcw.LIZ[pageScene.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c85355Xeh = new C85358Xek(c85373Xez.LIZ, c85373Xez.LIZIZ, c85373Xez.LIZJ);
                    } else {
                        throw new Exception("Page scene is illegitimate");
                    }
                } else {
                    c85355Xeh = new C85353Xef(c85373Xez.LIZ, c85373Xez.LIZIZ, c85373Xez.LIZJ);
                }
            } else {
                c85355Xeh = new C85355Xeh(c85373Xez.LIZ, c85373Xez.LIZIZ, c85373Xez.LIZJ);
            }
            this.LJLLI = c85355Xeh;
            PoiPublishExtensionVMV2 I3 = I3();
            AbstractC85354Xeg abstractC85354Xeg = this.LJLLI;
            if (abstractC85354Xeg != null) {
                I3.LJLJLJ = abstractC85354Xeg;
                AssemViewModel.asyncSubscribe$default(I3(), new TBT() { // from class: X.Xf3
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C85333XeL) obj).LJLIL;
                    }
                }, null, new AqS181S0100000_15(this, 110), null, new AqS181S0100000_15(this, 111), 10, null);
                PoiPublishExtensionVMV2 I32 = I3();
                C85391XfH c85391XfH = new TBT() { // from class: X.XfH
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C85333XeL) obj).LJLILLLLZI;
                    }
                };
                C56412MCa c56412MCa = new C56412MCa();
                c56412MCa.LIZ = true;
                C8YN.LJII(this, I32, c85391XfH, c56412MCa, new AqS197S0100000_15(this, 21), 4);
                C8YN.LJII(this, I3(), new TBT() { // from class: X.XeY
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C85333XeL) obj).LJLJJI;
                    }
                }, null, new AqS197S0100000_15(this, 22), 6);
                C8YN.LJII(this, I3(), new TBT() { // from class: X.XfI
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C85333XeL) obj).LJLJI;
                    }
                }, null, new AqS197S0100000_15(this, 20), 6);
                C16880lQ.LJJJ((TuxIconView) C3()._$_findCachedViewById(R.id.mu), new ACListenerS35S0100000_15(this, 191));
                TuxIconView tuxIconView = this.LJLJJL;
                if (tuxIconView != null) {
                    C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 192), tuxIconView);
                }
                C16880lQ.LJJJ((TuxIconView) C3()._$_findCachedViewById(R.id.elx), new ACListenerS29S0100000_9(this, 103));
                View _$_findCachedViewById = C3()._$_findCachedViewById(R.id.elx);
                o.LJIIIIZZ(_$_findCachedViewById, "clAddLocation.info_icon");
                C78897Uxp.LJJJJLI(_$_findCachedViewById, null);
                AII C3 = C3();
                View view3 = this.LJLIL;
                if (view3 != null) {
                    Context context2 = view3.getContext();
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        str = resources.getString(R.string.p12);
                    } else {
                        str = null;
                    }
                    C3.setTitle(H3(str));
                    SYL syl = (SYL) _$_findCachedViewById(R.id.iol);
                    syl.LLLF.LJZL(PoiPublishRcmdListCell.class);
                    syl.LLLF.LJZL(PoiPublishRcmdListHeaderCell.class);
                    syl.LLLF.LJZL(PoiPublishRcmdListFooterCell.class);
                    syl.setOrientation(0);
                    syl.setLifecycleOwner(this);
                    AbstractC85354Xeg abstractC85354Xeg2 = this.LJLLI;
                    if (abstractC85354Xeg2 != null) {
                        abstractC85354Xeg2.LJII();
                        C85339XeR c85339XeR = this.LJLLJ;
                        View view4 = this.LJLIL;
                        if (view4 != null) {
                            Context context3 = view4.getContext();
                            o.LJIIIIZZ(context3, "content.context");
                            c85339XeR.getClass();
                            boolean isSystemPrecise = c85339XeR.LIZIZ().isSystemPrecise(context3);
                            boolean inAppPreciseUnknown = c85339XeR.LIZIZ().inAppPreciseUnknown();
                            boolean isInAppPrecise = c85339XeR.LIZIZ().isInAppPrecise();
                            if (!C53148KtU.LIZ() ? !(!isSystemPrecise || !inAppPreciseUnknown) : !(!isSystemPrecise || isInAppPrecise)) {
                                z = true;
                            }
                            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context3);
                            if (LJJIFFI != null && z) {
                                C54578LbS.LIZ(c85339XeR.LIZIZ(), "video_post_page", null, LJJIFFI, C85233Xcj.LIZIZ, TokenCert.Companion.with("bpea-fetch_fine_location_permission_in_publish_page"), C85400XfQ.LJLIL, null, null, null, 448);
                            }
                            this.LJLJI.getValue();
                            PerfMonitorService LIZ3 = PerfMonitorServiceImpl.LIZ();
                            RecyclerView rcmd_list = (RecyclerView) _$_findCachedViewById(R.id.iol);
                            o.LJIIIIZZ(rcmd_list, "rcmd_list");
                            LIZ3.LJ(rcmd_list, "video_post_page");
                            return;
                        }
                        o.LJIJI("content");
                        throw null;
                    }
                    o.LJIJI("publishScene");
                    throw null;
                }
                o.LJIJI("content");
                throw null;
            }
            o.LJIJI("publishScene");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.v2.IPoiPublishUpdateUiStatusAbility
    public final void uq(View view) {
        o.LJIIIZ(view, "view");
        if (view instanceof AbstractC72772ShE) {
            if (this.LJLLL == EnumC85364Xeq.STATUS_POI_REFRESHING) {
                ((AbstractC72775ShH) view).setLoading(true);
                view.invalidate();
                return;
            }
            AbstractC72775ShH abstractC72775ShH = (AbstractC72775ShH) view;
            if (!abstractC72775ShH.LIZJ()) {
                return;
            }
            abstractC72775ShH.setLoading(false);
            view.invalidate();
        }
    }

    public final void v3(boolean z) {
        if (z) {
            C3().setShowArrow(true);
            TuxIconView tuxIconView = this.LJLJJL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            View _$_findCachedViewById = C3()._$_findCachedViewById(R.id.b86);
            o.LJIIIIZZ(_$_findCachedViewById, "clAddLocation.cell_container");
            C26338AVi.LJIIIZ(_$_findCachedViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, 26);
            return;
        }
        C3().setShowArrow(false);
        TuxIconView tuxIconView2 = this.LJLJJL;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(0);
        }
        View _$_findCachedViewById2 = C3()._$_findCachedViewById(R.id.b86);
        o.LJIIIIZZ(_$_findCachedViewById2, "clAddLocation.cell_container");
        C26338AVi.LJIIIZ(_$_findCachedViewById2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 26);
    }

    public final void K3(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, boolean z) {
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
            if (list == null || list.isEmpty()) {
                if (this.LJLLJ.LIZJ()) {
                    withState(I3(), new AqS181S0100000_15(this, 108));
                } else {
                    x3();
                }
                L3(0, 0, I3().LJLJL, "poi list is empty");
                return;
            }
            AbstractC85354Xeg abstractC85354Xeg = this.LJLLI;
            if (abstractC85354Xeg != null) {
                if (abstractC85354Xeg.LJIIJ()) {
                    XKX.LJ(MBB.INSTANCE, new C85351Xed(poiSearchResultWrapper, this, null));
                    return;
                }
                return;
            }
            o.LJIJI("publishScene");
            throw null;
        }
        if (this.LJLLJ.LIZJ()) {
            withState(I3(), new AqS181S0100000_15(this, 109));
        } else {
            x3();
        }
        if (z) {
            View view = this.LJLIL;
            if (view != null) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "content.context");
                if (C48203Ivv.LJ(context)) {
                    L3(0, 0, I3().LJLJL, "network is available");
                    return;
                } else {
                    L3(0, 0, I3().LJLJL, "search_poi response is empty");
                    return;
                }
            }
            o.LJIJI("content");
            throw null;
        }
        long j = I3().LJLJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("status code = ");
        PoiSearchApi.PoiSearchResultWrapper LIZ2 = I3().getState().LJLIL.LIZ();
        if (LIZ2 != null) {
            num = Integer.valueOf(LIZ2.status_code);
        }
        LIZ.append(num);
        L3(0, 0, j, X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.v2.IPoiPublishUpdateUiStatusAbility
    public final void GU(EnumC85364Xeq status, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(status, "status");
        Q3(status, z, interfaceC65784Pro);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0019. Please report as an issue. */
    public final void Q3(EnumC85364Xeq enumC85364Xeq, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str;
        Resources resources;
        String str2;
        Resources resources2;
        C3().setWithInfoIcon(false);
        switch (C85366Xes.LIZ[enumC85364Xeq.ordinal()]) {
            case 1:
                v3(true);
                F3().setVisibility(8);
                if (C85256Xd6.LIZ()) {
                    AII C3 = C3();
                    Context context = getContext();
                    if (context != null && (resources2 = context.getResources()) != null) {
                        str2 = resources2.getString(R.string.e59);
                    } else {
                        str2 = null;
                    }
                    C3.setSubtitle(str2);
                    AbstractC85354Xeg abstractC85354Xeg = this.LJLLI;
                    if (abstractC85354Xeg != null) {
                        C225248si.LJIJ(abstractC85354Xeg.LIZIZ(), "turn_on_location", E3().LJLILLLLZI.getMobParam().getCreationId(), E3().LJLIL.getContentType(), E3().LJLILLLLZI.getMobParam().getShootWay());
                        C16880lQ.LJJJJI((TuxTextView) C3()._$_findCachedViewById(R.id.ks_), this.LJLJL);
                    } else {
                        o.LJIJI("publishScene");
                        throw null;
                    }
                }
                this.LJLLL = enumC85364Xeq;
                return;
            case 2:
                v3(true);
                P3(I3().getState().LJLJI);
                C3().setSubtitle(null);
                if (this.LJLLILLLL.LJII(2)) {
                    if (!z) {
                        A3(interfaceC65784Pro);
                    } else {
                        C3()._$_findCachedViewById(R.id.ks_).postDelayed(new ARunnableS28S0200000_9(interfaceC65784Pro, this, 26), 800L);
                    }
                }
                this.LJLLL = enumC85364Xeq;
                return;
            case 3:
                v3(true);
                P3(I3().getState().LJLJI);
                C3().setSubtitle(null);
                N3(false);
                this.LJLLL = enumC85364Xeq;
                return;
            case 4:
                v3(false);
                C3().setSubtitle(null);
                F3().setVisibility(8);
                this.LJLLL = enumC85364Xeq;
                return;
            case 5:
                v3(true);
                C3().setSubtitle(null);
                F3().setVisibility(0);
                N3(true);
                this.LJLLL = enumC85364Xeq;
                return;
            case 6:
                v3(true);
                C3().setSubtitle(null);
                F3().setVisibility(8);
                this.LJLLL = enumC85364Xeq;
                return;
            case 7:
                v3(true);
                F3().setVisibility(8);
                AII C32 = C3();
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    str = resources.getString(R.string.oz2);
                } else {
                    str = null;
                }
                C32.setSubtitle(str);
                AbstractC85354Xeg abstractC85354Xeg2 = this.LJLLI;
                if (abstractC85354Xeg2 != null) {
                    C225248si.LJIJ(abstractC85354Xeg2.LIZIZ(), "try_search", E3().LJLILLLLZI.getMobParam().getCreationId(), E3().LJLIL.getContentType(), E3().LJLILLLLZI.getMobParam().getShootWay());
                    C16880lQ.LJJJJI((TuxTextView) C3()._$_findCachedViewById(R.id.ks_), this.LJLJLJ);
                    this.LJLLL = enumC85364Xeq;
                    return;
                }
                o.LJIJI("publishScene");
                throw null;
            default:
                this.LJLLL = enumC85364Xeq;
                return;
        }
    }

    public static /* synthetic */ void R3(PoiPublishExtensionAssemV2 poiPublishExtensionAssemV2, EnumC85364Xeq enumC85364Xeq, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        poiPublishExtensionAssemV2.Q3(enumC85364Xeq, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    public final void L3(int i, int i2, long j, String str) {
        ?? r11;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        List<PoiData> poiList;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) withState(I3(), C85386XfC.LJLIL);
        String str2 = "";
        if (poiSearchResultWrapper != null && (poiSearchResult = poiSearchResultWrapper.poiSearchResult) != null && (poiList = poiSearchResult.getPoiList()) != null) {
            r11 = new ArrayList(C32I.LJJL(poiList, 10));
            Iterator<PoiData> it = poiList.iterator();
            while (it.hasNext()) {
                String poiId = it.next().getPoiId();
                if (poiId == null) {
                    poiId = "";
                }
                r11.add(poiId);
            }
        } else {
            r11 = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = r11.iterator();
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
        String str3 = (String) withState(I3(), C85349Xeb.LJLIL);
        String creationId = E3().LJLILLLLZI.getMobParam().getCreationId();
        String contentType = E3().LJLIL.getContentType();
        String shootWay = E3().LJLILLLLZI.getMobParam().getShootWay();
        if (shootWay != null) {
            str2 = shootWay;
        }
        C225248si.LJJ(i, creationId, contentType, str2, this.LJLLJ.LIZJ() ? 1 : 0, j, i2, str, r11, arrayList, str3);
    }
}
