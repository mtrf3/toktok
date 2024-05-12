package X;

import com.bytedance.globalpayment.iap.google.service.provider.GoogleIapExternalServiceProvider;

/* renamed from: X.UpS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78378UpS implements InterfaceC78390Upe {
    public final /* synthetic */ InterfaceC78390Upe LIZ;

    public C78378UpS(InterfaceC78390Upe interfaceC78390Upe) {
        this.LIZ = interfaceC78390Upe;
    }

    @Override // X.InterfaceC78390Upe
    public final void LIZ(C78368UpI c78368UpI) {
        GoogleIapExternalServiceProvider.supportNewBilling = Boolean.FALSE;
        if (c78368UpI != null && c78368UpI.getCode() == 0) {
            C79146V4k.LIZLLL = "billing_3";
        } else {
            C79146V4k.LIZLLL = "billing_unavailable";
        }
        this.LIZ.LIZ(c78368UpI);
    }
}
