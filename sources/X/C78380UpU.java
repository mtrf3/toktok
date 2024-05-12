package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;

/* renamed from: X.UpU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78380UpU implements InterfaceC78399Upn {
    public final /* synthetic */ OrderData LIZ;
    public final /* synthetic */ InterfaceC78395Upj LIZIZ;
    public final /* synthetic */ AbstractC78343Uot LIZJ;

    @Override // X.InterfaceC78399Upn
    public final void LIZ(String str, String str2) {
        this.LIZ.setChannelUserId(str);
        this.LIZJ.payInternal(this.LIZ, this.LIZIZ);
    }

    public C78380UpU(AbstractC78343Uot abstractC78343Uot, OrderData orderData, InterfaceC78395Upj interfaceC78395Upj) {
        this.LIZJ = abstractC78343Uot;
        this.LIZ = orderData;
        this.LIZIZ = interfaceC78395Upj;
    }
}
