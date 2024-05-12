package X;

import com.bytedance.globalpayment.iap.google.service.provider.GoogleIapExternalServiceProvider;

/* renamed from: X.UpJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78369UpJ implements InterfaceC78390Upe {
    public final /* synthetic */ InterfaceC78390Upe LIZ;
    public final /* synthetic */ InterfaceC78390Upe LIZIZ;

    @Override // X.InterfaceC78390Upe
    public final void LIZ(C78368UpI c78368UpI) {
        if (c78368UpI != null && c78368UpI.getCode() == 0 && ((C78408Upw) C78408Upw.LJFF()).LIZIZ().booleanValue()) {
            GoogleIapExternalServiceProvider.supportNewBilling = Boolean.TRUE;
            C79146V4k.LIZLLL = "billing_5";
            this.LIZ.LIZ(c78368UpI);
        } else {
            ((C78407Upv) C78407Upv.LIZLLL()).LJ(this.LIZIZ);
        }
    }

    public C78369UpJ(InterfaceC78390Upe interfaceC78390Upe, C78378UpS c78378UpS) {
        this.LIZ = interfaceC78390Upe;
        this.LIZIZ = c78378UpS;
    }
}
