package X;

import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.AqS177S0200000_15;

/* renamed from: X.XfR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85401XfR implements InterfaceC54674Ld0 {
    public final /* synthetic */ ILocationBaseServiceForMT LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> LIZIZ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        boolean isInAppPrecise = this.LIZ.isInAppPrecise();
        InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.TRUE, Boolean.valueOf(isInAppPrecise));
        }
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
        boolean isInAppPrecise = this.LIZ.isInAppPrecise();
        InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.FALSE, Boolean.valueOf(isInAppPrecise));
        }
    }

    public C85401XfR(ILocationBaseServiceForMT iLocationBaseServiceForMT, AqS177S0200000_15 aqS177S0200000_15) {
        this.LIZ = iLocationBaseServiceForMT;
        this.LIZIZ = aqS177S0200000_15;
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
        boolean isInAppPrecise = this.LIZ.isInAppPrecise();
        InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> interfaceC88471Ynr = this.LIZIZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Boolean.FALSE, Boolean.valueOf(isInAppPrecise));
        }
    }
}
