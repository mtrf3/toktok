package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

/* renamed from: X.Upu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78406Upu implements InterfaceC78382UpW {
    public final /* synthetic */ Purchase LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C78408Upw LJ;

    @Override // X.InterfaceC78382UpW
    public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
        this.LJ.LJIIIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public C78406Upu(C78408Upw c78408Upw, Purchase purchase, String str, String str2, String str3) {
        this.LJ = c78408Upw;
        this.LIZ = purchase;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
