package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.PNSConsentServiceImpl;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.Onn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62987Onn implements InterfaceC82928Wge {
    public final /* synthetic */ PNSConsentServiceImpl LIZ;

    @Override // X.InterfaceC82928Wge
    public final void LIZ() {
    }

    public C62987Onn(PNSConsentServiceImpl pNSConsentServiceImpl) {
        this.LIZ = pNSConsentServiceImpl;
    }

    @Override // X.InterfaceC82928Wge
    public final void LIZIZ(java.util.Map<String, String> map, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        IPNSConsentHandlerService LJI;
        String str = (String) ((LinkedHashMap) map).get("consentKey");
        if (str == null || (LJI = this.LIZ.LJI(str)) == null) {
            return;
        }
        if (PopupManager.LJFF()) {
            LJI.LJ();
            interfaceC65784Pro.invoke();
        } else {
            PopupManager.LJIIL(new G3O((ITpcConsentService) this.LIZ.LIZ.getValue(), new AqS160S0100000_10(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 152)));
        }
    }
}
