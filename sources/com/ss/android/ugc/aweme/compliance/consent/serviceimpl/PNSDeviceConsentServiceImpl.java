package com.ss.android.ugc.aweme.compliance.consent.serviceimpl;

import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C221108m2;
import X.C39264Fb2;
import X.C39337FcD;
import X.C58096Mr6;
import X.C58197Msj;
import X.C62822Ol8;
import X.C62975Onb;
import X.C73411SrX;
import X.C73969T1h;
import X.C77275UUl;
import X.C84763XOl;
import X.E4G;
import X.E4U;
import X.EnumC35839E4t;
import X.FMX;
import X.G3N;
import X.G3O;
import X.InterfaceC62981Onh;
import Y.ARunnableS46S0100000_10;
import Y.AfS62S0100000_10;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.PNSConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.PNSDeviceConsentLegoTask;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS160S0100000_10;
import ujb.o;

/* loaded from: classes11.dex */
public final class PNSDeviceConsentServiceImpl implements IPNSDeviceConsentService {
    public PthreadTimer LIZIZ;
    public C73411SrX LIZJ;
    public C73411SrX LIZLLL;
    public C73411SrX LJ;
    public boolean LJI;
    public String LJII;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62975Onb LJIILLIIL;
    public final Set<String> LJIIZILJ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(E4U.LJLIL);
    public final List<InterfaceC62981Onh> LJFF = new ArrayList();
    public final ArrayList<String> LJIIIIZZ = new ArrayList<>();
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 37));
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 38));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final boolean LIZIZ() {
        E4G e4g;
        IPluginService.PluginDataWrapper value;
        IPluginService.SimplePluginData simplePluginData;
        boolean z = false;
        Iterator<E4G> it = PluginService.createIPluginServicebyMonsterPlugin(false).getCurrentPluginList().iterator();
        do {
            e4g = null;
            if (!it.hasNext()) {
                break;
            }
            e4g = it.next();
        } while (e4g.getType() != EnumC35839E4t.CONSENT_BOX_IMPROVED);
        E4G e4g2 = e4g;
        if (e4g2 == null || (value = e4g2.getValue()) == null || (simplePluginData = value.simplePluginData) == null || Integer.valueOf(simplePluginData.abGroup) == null) {
            return false;
        }
        IPluginService.SimplePluginData simplePluginData2 = value.simplePluginData;
        if (simplePluginData2 != null && simplePluginData2.abGroup == 2) {
            z = true;
        }
        return !z;
    }

    public PNSDeviceConsentServiceImpl() {
        C221108m2.LIZIZ(C39337FcD.LJLIL);
        this.LJIIJJI = C221108m2.LIZIZ(G3N.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(C58197Msj.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 156));
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 155));
        this.LJIILL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 154));
        this.LJIILLIIL = new C62975Onb(this);
        this.LJIIZILJ = C77275UUl.LJIIIIZZ("AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK");
    }

    public static IPNSDeviceConsentService LJI() {
        Object LIZ = C58096Mr6.LIZ(IPNSDeviceConsentService.class, false);
        if (LIZ != null) {
            return (IPNSDeviceConsentService) LIZ;
        }
        if (C58096Mr6.a == null) {
            synchronized (IPNSDeviceConsentService.class) {
                if (C58096Mr6.a == null) {
                    C58096Mr6.a = new PNSDeviceConsentServiceImpl();
                }
            }
        }
        return C58096Mr6.a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LIZ() {
        if (C19N.LJ("device_consent_integration_into_consent_framework_android", false)) {
            PNSConsentServiceImpl.LJ().LIZLLL();
        } else if (this.LJI) {
            PopupManager.LJI(G3O.class);
            PopupManager.LIZJ(G3O.class);
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS46S0100000_10(this, 47));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final PNSDeviceConsentLegoTask LIZJ() {
        return new PNSDeviceConsentLegoTask();
    }

    public final void LJFF() {
        PthreadTimer pthreadTimer = this.LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LIZIZ = null;
        C73411SrX c73411SrX = this.LIZJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJ;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        C73411SrX c73411SrX3 = this.LIZLLL;
        if (c73411SrX3 != null) {
            c73411SrX3.dispose();
        }
        LJII().LIZLLL();
        Iterator it = ((ArrayList) this.LJFF).iterator();
        while (it.hasNext()) {
            ((InterfaceC62981Onh) it.next()).LIZIZ();
        }
    }

    public final ITpcConsentService LJII() {
        return (ITpcConsentService) this.LJIIJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void init() {
        this.LIZJ = (C73411SrX) C84763XOl.LJ().LJJJJZI(new AfS62S0100000_10(this, 13));
        this.LIZLLL = (C73411SrX) C84763XOl.LIZLLL().LJIIJJI(2L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS62S0100000_10(this, 14));
        this.LJ = (C73411SrX) C84763XOl.LJFF().LJJJJZI(new AfS62S0100000_10(this, 15));
        this.LJIIIIZZ.add("com.twitter.sdk.android.core.identity.OAuthActivity");
        this.LJIIIIZZ.add("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity");
        this.LJIIIIZZ.add("com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupActivity2");
        this.LJIIIIZZ.add("com.bytedance.lobby.internal.LobbyInvisibleActivity");
        this.LJIIIIZZ.add("com.facebook.FacebookActivity");
        this.LJIIIIZZ.add("com.vk.api.sdk.ui.VKWebViewAuthActivity");
        this.LJIIIIZZ.add("com.google.android.gms.auth.api.signin.internal.SignInHubActivity");
        this.LJIIIIZZ.add("openauthorize.AwemeAuthorizedActivity");
        this.LJIIIIZZ.add("net.openid.appauth.AuthorizationManagementActivity");
        this.LJIIIIZZ.add("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity");
        this.LJIIIIZZ.add("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity");
        this.LJIIIIZZ.add("com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity");
    }

    public static void LJIIIIZZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "consent_popup");
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("description", str);
        FMX.LJIIL("pns_analysis_event", c188727au.LIZ);
    }

    public static void LJIIIZ(String str) {
        String path;
        if (str == null || str.length() == 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "consent_skip");
        Uri parse = UriProtector.parse(str);
        if (o.LJJJLIIL(str, "aweme://webview?", false)) {
            path = UriProtector.getQueryParameter(parse, "url");
        } else {
            path = parse.getPath();
        }
        if (path != null && path.length() != 0) {
            str = path;
        }
        c188727au.LJIIIZ("description", str);
        FMX.LJIIL("pns_analysis_event", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0155, code lost:
    
        if (r0 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018a, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0187, code lost:
    
        if (r0 != null) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(boolean r13) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl.LIZLLL(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJ(C39264Fb2 listener) {
        kotlin.jvm.internal.o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJFF).add(listener);
    }
}
