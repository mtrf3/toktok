package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ugs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77846Ugs implements InterfaceC77762UfW {
    public final /* synthetic */ InterfaceC77845Ugr LJLIL;

    @Override // X.InterfaceC77762UfW
    public final void LIZ() {
    }

    public C77846Ugs(InterfaceC77845Ugr interfaceC77845Ugr) {
        this.LJLIL = interfaceC77845Ugr;
    }

    @Override // X.InterfaceC77762UfW
    public final void LIZIZ(String pageType) {
        o.LJIIIZ(pageType, "pageType");
        BZI LIZ = C28787BRn.LIZ("livesdk_exchange_billing_address_location_show");
        LIZ.LJIJJ(this.LJLIL.getRequestPage(), "request_page");
        LIZ.LJIJJ(this.LJLIL.getChargeReason(), "charge_reason");
        LIZ.LJIJJ(pageType, "page_type");
        LIZ.LJJIIJZLJL();
    }
}
