package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.C1DF;
import X.C221108m2;
import X.C38350F3i;
import X.C40996G7c;
import X.C40997G7d;
import X.C41446GOk;
import X.C41453GOr;
import X.C41458GOw;
import X.C44384HbQ;
import X.C45804HyK;
import X.C59367NRr;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.GF4;
import X.GFD;
import X.GGG;
import X.GGH;
import X.GGI;
import X.GGJ;
import X.H7R;
import X.InterfaceC41201GEz;
import X.InterfaceC41449GOn;
import X.InterfaceC41450GOo;
import X.InterfaceC41451GOp;
import X.InterfaceC55644Lse;
import X.InterfaceC74236TBo;
import X.OF1;
import X.TBT;
import Y.AObserverS75S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BCPageModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC55644Lse(service = {InterfaceC41201GEz.class})
/* loaded from: classes8.dex */
public final class CommerceTcmPublishModule implements InterfaceC41201GEz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final GGH LJLIL;
    public boolean LJLJJLL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, GGI.LJLIL);
    public final OF1 LJLJI = C1DF.LJJIFFI(this, GGG.LJLIL);
    public final OF1 LJLJJI = C1DF.LJJIFFI(this, GGJ.LJLIL);
    public final OF1 LJLJJL = C1DF.LJJIFFI(this, GFD.LJLIL);
    public final BrandedContentSwitchStatus LJLJL = new BrandedContentSwitchStatus();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 755));
    public final ICommerceToolsTcmService LJLJLLL = CommerceToolsTcmServiceImpl.LJIJJ();

    static {
        TBT tbt = new TBT(CommerceTcmPublishModule.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(CommerceTcmPublishModule.class, "fragment", "getFragment()Landroidx/fragment/app/Fragment;", 0, c65351Pkp), C61845OOz.LIZJ(CommerceTcmPublishModule.class, "tcmModel", "getTcmModel()Lcom/ss/android/ugc/aweme/commerce/tools/tcm/CommerceToolsTcmModel;", 0, c65351Pkp), C61845OOz.LIZJ(CommerceTcmPublishModule.class, "structList", "getStructList()Ljava/util/List;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC40967G5z
    public final void LIZ() {
    }

    @Override // X.InterfaceC40998G7e
    public final void P0() {
    }

    public final Fragment LIZIZ() {
        return (Fragment) this.LJLJI.LIZ(this, LJLL[1]);
    }

    public final VideoPublishEditModel LIZJ() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLL[0]);
    }

    public final CommerceToolsTcmModel LIZLLL() {
        return (CommerceToolsTcmModel) this.LJLJJI.LIZ(this, LJLL[2]);
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        ((InterfaceC41449GOn) L9()).LJIIJJI(this);
        ((InterfaceC41451GOp) L9()).getLifecycleOwner().getLifecycle().addObserver(this);
        C59367NRr.LIZJ(this);
    }

    @Override // X.InterfaceC41201GEz, X.InterfaceC41448GOm
    public final void onResume() {
        C41446GOk.onResume(this);
        if (this.LJLIL.LJIIJ() || this.LJLJLLL.LJIIZILJ() || (C41458GOw.LIZLLL() && H7R.LJJJJL(LIZJ()))) {
            String brandedContentSwitch = LIZLLL().getBrandedContentSwitch();
            if (brandedContentSwitch == null) {
                brandedContentSwitch = CardStruct.IStatusCode.DEFAULT;
            }
            LJ(brandedContentSwitch);
            if (LIZLLL().getTcmPreventSelfSee() == 2) {
                this.LJLIL.LJII(true);
            } else if (LIZLLL().getTcmPreventSelfSee() == 1) {
                this.LJLIL.LJII(false);
            }
            this.LJLIL.LJ(LIZLLL().isTcmOrder());
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC41201GEz, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C41446GOk.onCreate(this);
    }

    @Override // X.InterfaceC41201GEz, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C41446GOk.onDestroy(this);
    }

    @Override // X.InterfaceC41201GEz, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C41446GOk.onPause(this);
    }

    @Override // X.InterfaceC41201GEz, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C41446GOk.onStart(this);
    }

    @Override // X.InterfaceC41201GEz, X.InterfaceC41448GOm
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C41446GOk.onStop(this);
    }

    public CommerceTcmPublishModule(GF4 gf4) {
        this.LJLIL = gf4;
    }

    @Override // X.InterfaceC41201GEz
    public final void Kf(boolean z) {
        LIZLLL().setHasTaggedBA(z);
    }

    public final void LJ(String str) {
        boolean vz = vz(str);
        this.LJLJLLL.LJIIIIZZ(C44384HbQ.LLIILZL(this), str);
        this.LJLIL.LJIILL(vz);
        this.LJLIL.LIZ().setValue(Boolean.valueOf(vz));
    }

    @Override // X.InterfaceC41201GEz
    public final void N10(boolean z) {
        String str;
        CommerceToolsTcmModel LIZLLL = LIZLLL();
        BrandedContentSwitchStatus brandedContentSwitchStatus = this.LJLJL;
        o.LJIIIZ(brandedContentSwitchStatus, "brandedContentSwitchStatus");
        if (z) {
            brandedContentSwitchStatus.LJLILLLLZI.setValue("1002");
            return;
        }
        if (LIZLLL != null) {
            str = LIZLLL.getBrandOrganicType();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, "1002")) {
            return;
        }
        brandedContentSwitchStatus.LJLILLLLZI.setValue(CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.InterfaceC40998G7e
    public final boolean Nb0(InterfaceC41450GOo action) {
        o.LJIIIZ(action, "action");
        C40996G7c c40996G7c = new C40996G7c(new AqS157S0100000_7(action, 71), new AqS157S0100000_7(action, 72));
        c40996G7c.LIZ(new AqS173S0100000_7(this, 51));
        c40996G7c.LIZ(new AqS173S0100000_7(this, 52));
        c40996G7c.LIZ(new AqS173S0100000_7(this, 53));
        c40996G7c.LIZ(new AqS173S0100000_7(c40996G7c, 227));
        C40997G7d c40997G7d = c40996G7c.LIZJ;
        if (c40997G7d != null) {
            c40997G7d.LIZLLL();
        }
        return action.getIntercepted();
    }

    @Override // X.InterfaceC41201GEz
    public final void Sn0(boolean z) {
        String str;
        CommerceToolsTcmModel LIZLLL = LIZLLL();
        BrandedContentSwitchStatus brandedContentSwitchStatus = this.LJLJL;
        o.LJIIIZ(brandedContentSwitchStatus, "brandedContentSwitchStatus");
        if (z) {
            brandedContentSwitchStatus.LJLIL.setValue("7");
            return;
        }
        if (LIZLLL != null) {
            str = LIZLLL.getBrandedContentSwitch();
        } else {
            str = null;
        }
        if (!o.LJ(str, "7")) {
            return;
        }
        brandedContentSwitchStatus.LJLIL.setValue(CardStruct.IStatusCode.DEFAULT);
    }

    @Override // X.InterfaceC41201GEz
    public final void sr(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLJLLL.LJIJI((BCPageModel) this.LJLJLJ.getValue());
        ((BCPageModel) this.LJLJLJ.getValue()).LJLIL.observe(fragment, new AObserverS75S0100000_7(this, 8));
    }

    @Override // X.InterfaceC41201GEz
    public final boolean vz(String str) {
        Integer LJJIL;
        if (str == null || (LJJIL = C38350F3i.LJJIL(str)) == null || LJJIL.intValue() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC41201GEz
    public final void wb0(Context context) {
        Activity activity;
        ICommerceToolsTcmService LJIJJ = CommerceToolsTcmServiceImpl.LJIJJ();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        LJIJJ.LJIIL(activity, C41453GOr.LIZIZ(LIZJ()), LIZLLL(), C41453GOr.LIZ(LIZJ()), H7R.LJI(LIZJ()));
    }

    @Override // X.InterfaceC40967G5z
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        CommerceToolsTcmModel LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            if (LIZLLL.getTcmPreventSelfSee() == 2) {
                this.LJLIL.LJIIL(true);
            } else if (LIZLLL.getTcmPreventSelfSee() == 1) {
                this.LJLIL.LJIIL(false);
            }
        }
        ICommerceToolsTcmService iCommerceToolsTcmService = this.LJLJLLL;
        View findViewById = view.findViewById(R.id.aht);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.bc_view_stub)");
        iCommerceToolsTcmService.LJIILJJIL((ViewStub) findViewById, C41453GOr.LIZ(LIZJ()), C41453GOr.LIZLLL(LIZJ()));
        ICommerceToolsTcmService iCommerceToolsTcmService2 = this.LJLJLLL;
        Fragment LIZIZ = LIZIZ();
        View findViewById2 = view.findViewById(R.id.l1v);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tcm_setting_item)");
        iCommerceToolsTcmService2.LJII(LIZIZ, (ViewStub) findViewById2, LIZLLL(), H7R.LJJJJL(LIZJ()), C41453GOr.LIZIZ(LIZJ()), C41453GOr.LIZ(LIZJ()), H7R.LJI(LIZJ()));
        this.LJLJL.LJLIL.observe(LIZIZ(), new AObserverS75S0100000_7(this, 9));
        this.LJLJL.LJLILLLLZI.observe(LIZIZ(), new AObserverS75S0100000_7(this, 10));
        this.LJLJL.LJLJI.observe(LIZIZ(), new AObserverS75S0100000_7(this, 11));
        sr(LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC41201GEz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object rd0(androidx.fragment.app.Fragment r13, X.InterfaceC67352kd<? super java.lang.Integer> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C41447GOl
            if (r0 == 0) goto L5f
            r11 = r14
            X.GOl r11 = (X.C41447GOl) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r11.LJLJI = r2
        L12:
            java.lang.Object r1 = r11.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L65
            X.C141335gf.LIZJ(r1)
        L20:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L26:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            return r0
        L2c:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel r2 = r12.LIZLLL()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.LIZJ()
            int r1 = r0.creationMode
            r0 = 2
            if (r1 != r0) goto L3e
            r1 = 0
            goto L26
        L3e:
            com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService r5 = r12.LJLJLLL
            r7 = 0
            java.lang.String r1 = r2.getBrandedContentSwitch()
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r8 = r0 ^ 1
            boolean r9 = r2.getAdsAuthorizationSwitch()
            boolean r10 = r2.getHasTaggedBA()
            r11.LJLJI = r3
            r6 = r13
            java.lang.Object r1 = r5.LJIIJJI(r6, r7, r8, r9, r10, r11)
            if (r1 != r4) goto L20
            return r4
        L5f:
            X.GOl r11 = new X.GOl
            r11.<init>(r12, r14)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceTcmPublishModule.rd0(androidx.fragment.app.Fragment, X.2kd):java.lang.Object");
    }
}
