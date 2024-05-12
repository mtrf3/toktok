package X;

import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import kotlin.jvm.internal.AqS160S0100000_10;
import ujb.s;

/* renamed from: X.Ong, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62980Ong implements InterfaceC82928Wge {
    public final /* synthetic */ PNSDeviceConsentServiceImpl LIZ;

    @Override // X.InterfaceC82928Wge
    public final void LIZ() {
    }

    public C62980Ong(PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl) {
        this.LIZ = pNSDeviceConsentServiceImpl;
    }

    @Override // X.InterfaceC82928Wge
    public final void LIZIZ(java.util.Map<String, String> map, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String localClassName;
        if (PopupManager.LJFF()) {
            M74 LJ = PopupManager.LJ();
            if (LJ != null && LJ.getPriority() > 0) {
                interfaceC65784Pro.invoke();
                return;
            }
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null || (localClassName = LJIIIIZZ.getLocalClassName()) == null || s.LJJJLZIJ(localClassName, "UniversalPopupActivity", false)) {
                return;
            }
            interfaceC65784Pro.invoke();
            return;
        }
        PopupManager.LJIIL(new G3O(this.LIZ.LJII(), new AqS160S0100000_10(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 157)));
    }
}
