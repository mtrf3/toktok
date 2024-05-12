package com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework;

import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C62975Onb;
import X.E9H;
import X.EF7;
import X.EnumC62988Ono;
import X.FMX;
import X.G3M;
import X.G3O;
import X.HG3;
import X.InterfaceC62996Onw;
import X.ORZ;
import X.RBX;
import X.UPJ;
import X.X1D;
import Y.ARunnableS46S0100000_10;
import Y.IDComparatorS38S0000000_10;
import android.os.Handler;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PNSConsentServiceImpl implements IPNSConsentService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(G3M.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 36));
    public final HashMap<String, HashSet<InterfaceC62996Onw>> LIZJ = new HashMap<>();
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 150));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 151));
    public final E9H LJFF = new E9H();
    public final List<IPNSConsentHandlerService> LJI;

    public static IPNSConsentService LJ() {
        Object LIZ = C58096Mr6.LIZ(IPNSConsentService.class, false);
        if (LIZ != null) {
            return (IPNSConsentService) LIZ;
        }
        if (C58096Mr6.LLZZZIL == null) {
            synchronized (IPNSConsentService.class) {
                if (C58096Mr6.LLZZZIL == null) {
                    C58096Mr6.LLZZZIL = new PNSConsentServiceImpl();
                }
            }
        }
        return C58096Mr6.LLZZZIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService
    public final void LIZ() {
        this.LJFF.LIZJ().clear();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService
    public final void LIZLLL() {
        PopupManager.LJI(G3O.class);
        PopupManager.LIZJ(G3O.class);
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS46S0100000_10(this, 46));
    }

    public PNSConsentServiceImpl() {
        Set services = ServiceManager.get().getServices(IPNSConsentHandlerService.class);
        o.LJIIIIZZ(services, "get().getServices(IPNSCo…ndlerService::class.java)");
        this.LJI = ORZ.LLILII(new IDComparatorS38S0000000_10(6), services);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService
    public final void LIZJ(String str) {
        E9H e9h = this.LJFF;
        e9h.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CACHED_CONSENT_RECORDS");
        LIZ.append('_');
        e9h.LIZJ().erase(UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ));
    }

    public final IPNSConsentHandlerService LJI(String str) {
        for (IPNSConsentHandlerService iPNSConsentHandlerService : this.LJI) {
            if (iPNSConsentHandlerService.LIZ(str)) {
                return iPNSConsentHandlerService;
            }
        }
        return null;
    }

    public static void LJFF(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("description", str2);
        FMX.LJIIL("pns_consent_framework", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentService
    public final void LIZIZ(EnumC62988Ono consentKey, C62975Onb c62975Onb) {
        o.LJIIIZ(consentKey, "consentKey");
        IPNSConsentHandlerService LJI = LJI(consentKey.getKey().LIZ);
        if (LJI == null) {
            return;
        }
        LJI.LJJLIIJ();
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-universalPopupService>(...)");
        ((UniversalPopupService) value).LJ(LJI.LIZIZ(), EF7.LIZIZ());
        if (c62975Onb != null) {
            HashSet<InterfaceC62996Onw> hashSet = this.LIZJ.get(consentKey.getKey().LIZ);
            if (hashSet == null) {
                hashSet = new HashSet<>();
            }
            hashSet.add(c62975Onb);
            this.LIZJ.put(consentKey.getKey().LIZ, hashSet);
        }
        LJFF("collect_consent_if_not_granted", consentKey.getKey().LIZ);
    }
}
