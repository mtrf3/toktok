package X;

import com.amazon.device.iap.model.Product;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import defpackage.b1;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.UpE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78364UpE implements InterfaceC78399Upn {
    public final /* synthetic */ C78363UpD LIZ;

    public C78364UpE(C78363UpD c78363UpD) {
        this.LIZ = c78363UpD;
    }

    @Override // X.InterfaceC78399Upn
    public final void LIZ(String str, String str2) {
        IapChannelUserData iapChannelUserData = new IapChannelUserData(IapPaymentMethod.AMAZON, str, str2);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        Currency currency = Currency.getInstance(new Locale("", str2));
        String currencyCode = currency.getCurrencyCode();
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("currencyCode is ");
        LIZ.append(currencyCode);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        currencyInstance.setMinimumFractionDigits(currency.getDefaultFractionDigits());
        currencyInstance.setMaximumFractionDigits(currency.getDefaultFractionDigits());
        currencyInstance.setCurrency(currency);
        String format = currencyInstance.format(Double.valueOf(10.0d));
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("final price string is ");
        LIZ2.append(format);
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        String substring = format.substring(0, format.indexOf("1"));
        C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("currencyPreFix is ");
        LIZ3.append(substring);
        X1D.LIZIZ(LIZ3);
        LJ3.getClass();
        C79359VCp c79359VCp = new C79359VCp(currencyCode, substring);
        Iterator it = this.LIZ.LIZJ.keySet().iterator();
        while (it.hasNext()) {
            this.LIZ.LIZIZ.add(new C78440UqS((Product) this.LIZ.LIZJ.get(it.next()), c79359VCp, iapChannelUserData, str2));
        }
        b1.LIZLLL();
        InterfaceC78385UpZ interfaceC78385UpZ = this.LIZ.LIZ;
        AbsResult absResult = new AbsResult();
        absResult.withErrorCode(0);
        interfaceC78385UpZ.LIZ(absResult, this.LIZ.LIZIZ);
    }
}
