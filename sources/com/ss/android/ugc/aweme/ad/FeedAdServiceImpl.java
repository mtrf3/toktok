package com.ss.android.ugc.aweme.ad;

import X.AnonymousClass813;
import X.C214018ab;
import X.C214038ad;
import X.C47261Igj;
import X.C56752Kp;
import X.C58096Mr6;
import X.C58653N0f;
import X.C58655N0h;
import X.C58662Ry;
import X.C58704N2e;
import X.C58847N7r;
import X.C59058NFu;
import X.C59059NFv;
import X.C59060NFw;
import X.C59061NFx;
import X.C59096NHg;
import X.C59105NHp;
import X.C59171NKd;
import X.C59177NKj;
import X.C59181NKn;
import X.C59192NKy;
import X.C59211NLr;
import X.C59320NPw;
import X.C59367NRr;
import X.C59775Nd5;
import X.C63081OpJ;
import X.C93833mF;
import X.IDY;
import X.InterfaceC48720JAe;
import X.InterfaceC58172Qb;
import X.InterfaceC59191NKx;
import X.InterfaceC59245NMz;
import X.N40;
import X.NI8;
import X.NKM;
import X.NKP;
import X.NKZ;
import X.NL3;
import X.NL7;
import X.NLI;
import X.NLP;
import X.NLY;
import X.NQ4;
import X.NQC;
import X.OSZ;
import X.ViewOnClickListenerC59350NRa;
import Y.ARunnableS12S0300000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class FeedAdServiceImpl implements IFeedAdService {
    public String LIZ;
    public Bundle LIZIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final List<InterfaceC48720JAe> LJIILIIL() {
        return C47261Igj.LJJIJIIJI(new C59060NFw(), new C59058NFu(), new C59059NFv(), new C59061NFx());
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIILLIIL() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final List<InterfaceC58172Qb> LJIL() {
        return C47261Igj.LJJIJIIJI(NKP.LIZ, C59181NKn.LIZ, C59171NKd.LIZ, NKZ.LIZ, C59177NKj.LIZ, NKM.LIZ, C58662Ry.LIZ);
    }

    public static IFeedAdService LJJIJLIJ() {
        Object LIZ = C58096Mr6.LIZ(IFeedAdService.class, false);
        if (LIZ != null) {
            return (IFeedAdService) LIZ;
        }
        if (C58096Mr6.LJLLILLLL == null) {
            synchronized (IFeedAdService.class) {
                if (C58096Mr6.LJLLILLLL == null) {
                    C58096Mr6.LJLLILLLL = new FeedAdServiceImpl();
                }
            }
        }
        return C58096Mr6.LJLLILLLL;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59060NFw LJ() {
        return new C59060NFw();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final InterfaceC59245NMz LJI() {
        return (InterfaceC59245NMz) C59367NRr.LIZIZ(InterfaceC59245NMz.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final IDY LJIIIIZZ() {
        return new IDY();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59059NFv LJJIJIIJI() {
        return new C59059NFv();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59058NFu LJJIJL() {
        return new C59058NFu();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIILJJIL() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIJ() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJIII() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJIIJZLJL() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final Bundle LJJIJIL() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final String getEnterFrom() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final ViewOnClickListenerC59350NRa LIZIZ(C214018ab c214018ab) {
        ViewOnClickListenerC59350NRa viewOnClickListenerC59350NRa = new ViewOnClickListenerC59350NRa(c214018ab);
        viewOnClickListenerC59350NRa.initialize();
        return viewOnClickListenerC59350NRa;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59211NLr LIZLLL(View view) {
        o.LJIIIZ(view, "view");
        return new C59211NLr(view);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59192NKy LJFF(ViewStub viewStub) {
        return new C59192NKy(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final NL7 LJII(ViewStub viewStub) {
        return new NL7(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final NL3 LJIIJ(ViewStub viewStub) {
        return new NL3(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final boolean LJIILL(Aweme aweme) {
        if (C58847N7r.LIZIZ(aweme) || C58847N7r.LIZ(aweme) || C58847N7r.LIZJ(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59775Nd5 LJIJI(ViewGroup viewGroup) {
        return new C59775Nd5(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJIJJ(InterfaceC59191NKx depend) {
        o.LJIIIZ(depend, "depend");
        C59061NFx c59061NFx = new C59061NFx();
        C56752Kp c56752Kp = (C56752Kp) depend;
        Context context = c56752Kp.LIZ;
        if (context != null) {
            c59061NFx.LJIIIIZZ(c56752Kp.LIZIZ, context, c56752Kp.LIZLLL.mAdapter.Q8());
            c56752Kp.LIZIZ().postDelayed(new ARunnableS12S0300000_1(depend, c59061NFx, context, 1), 100L);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59096NHg LJIJJLI(AnonymousClass813 anonymousClass813) {
        if (C63081OpJ.LJJZZI(anonymousClass813.getAweme())) {
            C59096NHg c59096NHg = new C59096NHg(anonymousClass813);
            c59096NHg.initialize();
            return c59096NHg;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final NLI LJJ(ViewStub viewStub) {
        return new NLI(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final NQ4 LJJII(C214038ad c214038ad) {
        NQ4 nq4 = new NQ4(c214038ad);
        nq4.initialize();
        return nq4;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59105NHp LJJIIJ(ViewStub viewStub) {
        return new C59105NHp(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJIIZ(Bundle bundle) {
        this.LIZIZ = bundle;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final C59320NPw LJJIIZI(NQC nqc) {
        C59320NPw c59320NPw = new C59320NPw(nqc);
        c59320NPw.initialize();
        return c59320NPw;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final NLY LJJIJ(ViewStub viewStub) {
        return new NLY(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void setEnterFrom(String str) {
        this.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final NLP LJIIL(ViewStub viewStub, FrameLayout container) {
        o.LJIIIZ(container, "container");
        return new NLP(viewStub, container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (X.C63081OpJ.LJJLJ(r13) == true) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.sheet.actionsheet.TuxActionSheet LIZ(android.content.Context r12, final com.ss.android.ugc.aweme.feed.model.Aweme r13, final java.lang.String r14) {
        /*
            r11 = this;
            r6 = r13
            if (r6 == 0) goto Le
            boolean r1 = X.C63081OpJ.LJJLJ(r6)
            r0 = 1
            if (r1 != r0) goto Le
        La:
            r4 = 0
            if (r0 != 0) goto L10
            return r4
        Le:
            r0 = 0
            goto La
        L10:
            if (r6 == 0) goto L1e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L1e
            java.lang.String r8 = r0.getPhoneNumber()
            if (r8 != 0) goto L1f
        L1e:
            return r4
        L1f:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = X.AAX.LIZ
            java.lang.Object r7 = r0.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r9 = r14
            r5 = r12
            if (r7 == 0) goto L6b
            int r3 = r7.intValue()
            r2 = 8
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "ad_phone_call_restrict_times"
            r1.getClass()     // Catch: java.lang.Throwable -> L3e
            int r2 = com.bytedance.ies.abmock.SettingsManager.LJ(r0, r2)     // Catch: java.lang.Throwable -> L3e
        L3e:
            if (r3 < r2) goto L6b
            if (r5 == 0) goto L6a
            android.app.Activity r0 = X.C45804HyK.LJIJJ(r5)
            if (r0 == 0) goto L6a
            X.AKb r1 = new X.AKb
            r1.<init>(r0)
            r0 = 2131824883(0x7f1110f3, float:1.9282606E38)
            r1.LJIIIIZZ(r0)
            r1.LJIIJ()
            java.lang.String r1 = "othershow"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            X.N0h r2 = X.C58704N2e.LIZLLL(r9, r1, r0)
            java.lang.String r1 = "refer"
            java.lang.String r0 = "tooltip"
            r2.LIZJ(r0, r1)
            r2.LJI()
        L6a:
            return r4
        L6b:
            r0 = 2131834628(0x7f113704, float:1.9302372E38)
            X.9vq r3 = X.C06530Nl.LIZIZ(r0)
            r3.LJFF = r8
            kotlin.jvm.internal.AqS3S2300000_4 r4 = new kotlin.jvm.internal.AqS3S2300000_4
            r10 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            Y.ACListenerS21S0100000_1 r1 = new Y.ACListenerS21S0100000_1
            r0 = 27
            r1.<init>(r4, r0)
            r3.LJ = r1
            X.9jz r2 = new X.9jz
            r2.<init>()
            java.util.List r0 = X.C47261Igj.LJJIJ(r3)
            r2.LJFF(r0)
            r0 = 2131824904(0x7f111108, float:1.928265E38)
            r2.LIZLLL(r0)
            X.Lj6 r0 = X.DialogInterfaceOnDismissListenerC55052Lj6.LJLIL
            com.bytedance.tux.sheet.actionsheet.TuxActionSheet r1 = r2.LIZ
            r1.LJLILLLLZI = r0
            X.7xQ r0 = new X.7xQ
            r0.<init>()
            r1.LJLIL = r0
            com.bytedance.tux.sheet.actionsheet.TuxActionSheet r0 = r2.LIZJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.FeedAdServiceImpl.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.bytedance.tux.sheet.actionsheet.TuxActionSheet");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJI(Aweme aweme, C58653N0f label, String str) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(label, "label");
        N40 n40 = new N40(new OSZ(this.LIZ, str));
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        n40.LJIIIZ(label, awemeRawAd, new AqS176S0100000_10(aweme, 95));
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final NI8 LJJIFFI(View rootView, VideoBaseCell component, String eventType) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(component, "component");
        o.LJIIIZ(eventType, "eventType");
        return new NI8(rootView, component, eventType);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void LJJIJIIJIL(String eventName, AwemeRawAd awemeRawAd, C93833mF c93833mF) {
        o.LJIIIZ(eventName, "eventName");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", eventName, awemeRawAd);
        LIZLLL.LIZJ("ec_ug_vsa_card", "refer");
        LIZLLL.LIZ(c93833mF);
        LIZLLL.LJI();
    }
}
