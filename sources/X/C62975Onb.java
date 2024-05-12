package X;

import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import java.util.Iterator;

/* renamed from: X.Onb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62975Onb implements InterfaceC62996Onw {
    public final /* synthetic */ PNSDeviceConsentServiceImpl LIZ;

    @Override // X.InterfaceC62996Onw
    public final void LIZ() {
        this.LIZ.LJFF();
    }

    @Override // X.InterfaceC62996Onw
    public final void LIZIZ() {
        PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl = this.LIZ;
        Iterator<InterfaceC62981Onh> it = pNSDeviceConsentServiceImpl.LJFF.iterator();
        while (it.hasNext()) {
            it.next().LIZ(pNSDeviceConsentServiceImpl.LJII);
        }
    }

    public C62975Onb(PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl) {
        this.LIZ = pNSDeviceConsentServiceImpl;
    }
}
