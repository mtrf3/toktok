package X;

import android.text.TextUtils;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uov, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78345Uov implements PurchasingListener {
    public static volatile C78345Uov LJIIIZ;
    public static boolean LJIIJ;
    public final java.util.Map<String, InterfaceC78311UoN> LIZ;
    public final java.util.Map<String, PurchaseResponse> LIZIZ;
    public HandlerC78370UpK LIZJ;
    public final java.util.Map<String, InterfaceC78385UpZ<AbsIapProduct>> LIZLLL;
    public final java.util.Map<String, ProductDataResponse> LJ;
    public final java.util.Map<String, InterfaceC78382UpW> LJFF;
    public final java.util.Map<String, PurchaseUpdatesResponse> LJI;
    public final java.util.Map<String, InterfaceC78399Upn> LJII;
    public final java.util.Map<String, UserDataResponse> LJIIIIZZ;

    public static C78345Uov LIZJ() {
        if (LJIIIZ == null) {
            synchronized (C78345Uov.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new C78345Uov();
                }
            }
        }
        return LJIIIZ;
    }

    public C78345Uov() {
        PurchasingService.registerListener(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ, this);
        this.LIZ = new HashMap();
        this.LIZIZ = new HashMap();
        this.LJII = new HashMap();
        this.LJIIIIZZ = new HashMap();
        this.LIZLLL = new HashMap();
        this.LJ = new HashMap();
        this.LJFF = new HashMap();
        this.LJI = new HashMap();
    }

    public final void LIZIZ(InterfaceC78399Upn interfaceC78399Upn) {
        String str;
        String str2;
        String requestId = PurchasingService.getUserData().toString();
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAmazonUserId , requestId is ");
        LIZ.append(requestId);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (!TextUtils.isEmpty(requestId) && interfaceC78399Upn != null) {
            UserDataResponse userDataResponse = (UserDataResponse) ((HashMap) this.LJIIIIZZ).get(requestId);
            if (userDataResponse != null) {
                UserData userData = userDataResponse.getUserData();
                if (userData != null) {
                    str = userData.getUserId();
                    str2 = userData.getMarketplace();
                } else {
                    str = "";
                    str2 = "";
                }
                interfaceC78399Upn.LIZ(str, str2);
                ((HashMap) this.LIZIZ).remove(requestId);
                return;
            }
            ((HashMap) this.LJII).put(requestId, interfaceC78399Upn);
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public final void onProductDataResponse(ProductDataResponse productDataResponse) {
        if (productDataResponse == null) {
            return;
        }
        try {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onProductDataResponse: ");
            LIZ.append(productDataResponse.toJSON().toString());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            String requestId = productDataResponse.getRequestId().toString();
            InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ = (InterfaceC78385UpZ) ((HashMap) this.LIZLLL).get(requestId);
            if (interfaceC78385UpZ != null) {
                if (productDataResponse.getRequestStatus() == ProductDataResponse.RequestStatus.SUCCESSFUL) {
                    LIZ(productDataResponse.getProductData(), interfaceC78385UpZ);
                } else {
                    AbsResult absResult = new AbsResult();
                    absResult.withErrorCode(301);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("query product details failed because:");
                    LIZ2.append(productDataResponse.getRequestStatus().name());
                    absResult.withMessage(X1D.LIZIZ(LIZ2));
                    interfaceC78385UpZ.LIZ(absResult, null);
                }
                ((HashMap) this.LIZ).remove(requestId);
                return;
            }
            ((HashMap) this.LJ).put(requestId, productDataResponse);
        } catch (Throwable th) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onProductDataResponse: ");
            LIZ3.append(th.getMessage());
            X1D.LIZIZ(LIZ3);
            LJ2.getClass();
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public final void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        try {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPurchaseResponse: ");
            LIZ.append(purchaseResponse.toJSON().toString());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            String requestId = purchaseResponse.getRequestId().toString();
            C78278Unq.LIZ().getClass();
            C78278Unq.LIZIZ(requestId, purchaseResponse);
            InterfaceC78311UoN interfaceC78311UoN = (InterfaceC78311UoN) ((HashMap) this.LIZ).get(requestId);
            if (interfaceC78311UoN != null) {
                interfaceC78311UoN.LIZ(new C78331Uoh(purchaseResponse));
                ((HashMap) this.LIZ).remove(requestId);
            } else {
                ((HashMap) this.LIZIZ).put(requestId, purchaseResponse);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public final void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        if (purchaseUpdatesResponse == null) {
            return;
        }
        try {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPurchaseUpdatesResponse: ");
            LIZ.append(purchaseUpdatesResponse.toJSON().toString());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            String requestId = purchaseUpdatesResponse.getRequestId().toString();
            InterfaceC78382UpW interfaceC78382UpW = (InterfaceC78382UpW) ((HashMap) this.LJFF).get(requestId);
            if (interfaceC78382UpW != null) {
                if (purchaseUpdatesResponse.getRequestStatus() == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
                    List<Receipt> receipts = purchaseUpdatesResponse.getReceipts();
                    ArrayList arrayList = new ArrayList();
                    Iterator<Receipt> it = receipts.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C78331Uoh(it.next(), purchaseUpdatesResponse.getUserData()));
                    }
                    IapPaymentMethod iapPaymentMethod = IapPaymentMethod.AMAZON;
                    AbsResult absResult = new AbsResult();
                    absResult.withErrorCode(0);
                    interfaceC78382UpW.onQueryFinished(iapPaymentMethod, absResult, arrayList);
                } else {
                    IapPaymentMethod iapPaymentMethod2 = IapPaymentMethod.AMAZON;
                    AbsResult absResult2 = new AbsResult();
                    absResult2.withErrorCode(1);
                    absResult2.withDetailCode(purchaseUpdatesResponse.getRequestStatus().ordinal());
                    absResult2.withMessage("query un ack order from amazon failed");
                    interfaceC78382UpW.onQueryFinished(iapPaymentMethod2, absResult2, null);
                }
                ((HashMap) this.LJFF).remove(requestId);
                return;
            }
            ((HashMap) this.LJI).put(requestId, purchaseUpdatesResponse);
        } catch (Throwable th) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onProductDataResponse: ");
            LIZ2.append(th.getMessage());
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public final void onUserDataResponse(UserDataResponse userDataResponse) {
        String str;
        String str2;
        if (userDataResponse == null) {
            return;
        }
        try {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onUserDataResponse: ");
            LIZ.append(userDataResponse.toJSON().toString());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            String requestId = userDataResponse.getRequestId().toString();
            InterfaceC78399Upn interfaceC78399Upn = (InterfaceC78399Upn) ((HashMap) this.LJII).get(requestId);
            if (interfaceC78399Upn != null) {
                UserData userData = userDataResponse.getUserData();
                if (userData != null) {
                    str = userData.getUserId();
                    str2 = userData.getMarketplace();
                } else {
                    str = "";
                    str2 = "";
                }
                interfaceC78399Upn.LIZ(str, str2);
                ((HashMap) this.LIZ).remove(requestId);
                return;
            }
            ((HashMap) this.LJIIIIZZ).put(requestId, userDataResponse);
        } catch (Throwable th) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserDataResponse: ");
            LIZ2.append(th.getMessage());
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
        }
    }

    public final void LIZ(java.util.Map<String, Product> map, InterfaceC78385UpZ<AbsIapProduct> interfaceC78385UpZ) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            LIZIZ(new C78363UpD(this, interfaceC78385UpZ, arrayList, map));
            return;
        }
        C78273Unl.LJIIIZ().LJ().getClass();
        AbsResult absResult = new AbsResult();
        absResult.withErrorCode(1);
        absResult.withMessage("product map from amazon is empty");
        interfaceC78385UpZ.LIZ(absResult, arrayList);
    }
}
