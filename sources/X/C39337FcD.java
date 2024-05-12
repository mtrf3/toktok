package X;

import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.PNSKrDeviceConsentUI;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager2;
import kotlin.jvm.internal.o;

/* renamed from: X.FcD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39337FcD extends AbstractC65781Prl implements InterfaceC65784Pro<UniversalPopupService2> {
    public static final C39337FcD LJLIL = new C39337FcD();

    public C39337FcD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final UniversalPopupService2 invoke() {
        UniversalPopupService2 LIZLLL = UniversalPopupManager2.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "this");
        C39339FcF.LIZ(LIZLLL);
        LIZLLL.LIZ(PNSKrDeviceConsentUI.class, "consent_kr");
        return LIZLLL;
    }
}
