package X;

import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

/* renamed from: X.UpO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78374UpO implements InterfaceC78399Upn {
    public final /* synthetic */ InterfaceC78395Upj LIZ;

    public C78374UpO(InterfaceC78395Upj interfaceC78395Upj) {
        this.LIZ = interfaceC78395Upj;
    }

    @Override // X.InterfaceC78399Upn
    public final void LIZ(String str, String str2) {
        IapChannelUserData iapChannelUserData = new IapChannelUserData(IapPaymentMethod.AMAZON, str, str2);
        C78368UpI c78368UpI = new C78368UpI(0, -1, "get user data success from amazon");
        ((C78392Upg) C78379UpT.LJ().LIZJ()).LJFF(c78368UpI, this.LIZ, iapChannelUserData);
        ((C78391Upf) C78379UpT.LJ().LIZLLL()).LJIIIZ(c78368UpI, iapChannelUserData);
    }
}
