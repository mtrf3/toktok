package X;

import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

/* renamed from: X.UpQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC78376UpQ {
    void LIZ(InterfaceC78382UpW interfaceC78382UpW);

    void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    boolean isSupportGooglePay();

    void queryHasSubscriptionProducts(InterfaceC78395Upj interfaceC78395Upj);

    void queryProductDetails(List<String> list, boolean z, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ);

    void setGpListener(InterfaceC78381UpV interfaceC78381UpV);
}
