package X;

import com.amazon.device.iap.model.Product;
import com.bytedance.globalpayment.iap.model.AbsIapOneTimePurchaseOffer;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import java.util.regex.Matcher;

/* renamed from: X.UqS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78440UqS extends AbsIapProduct {
    public C78440UqS(Product product, C79359VCp c79359VCp, IapChannelUserData iapChannelUserData, String str) {
        Double valueOf;
        Matcher matcher;
        this.mProductId = product.getSku();
        this.mProductType = product.getProductType().name();
        String price = product.getPrice();
        try {
            matcher = PatternProtector.compile("(\\d+(\\.\\d+)?)").matcher(price);
        } catch (Throwable unused) {
        }
        if (matcher.find()) {
            valueOf = CastDoubleProtector.valueOf(matcher.group(1));
            Long valueOf2 = Long.valueOf((long) (valueOf.doubleValue() * 1000000.0d));
            if (!price.startsWith((String) c79359VCp.LIZ) && !price.startsWith(str)) {
                StringBuilder LIZ = X1D.LIZ();
                price = JBR.LJFF(LIZ, (String) c79359VCp.LIZ, price, LIZ);
            }
            String str2 = (String) c79359VCp.LIZ;
            this.mTitle = product.getTitle();
            this.mDescription = product.getDescription();
            this.mOneTimePurchaseOffer = new AbsIapOneTimePurchaseOffer(price, valueOf2.longValue(), str2);
            this.mChannelUserData = iapChannelUserData;
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("currencyPreFix is ");
        LIZ2.append((String) c79359VCp.LIZIZ);
        X1D.LIZIZ(LIZ2);
        LJ.getClass();
        String substring = price.substring(((String) c79359VCp.LIZIZ).length());
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("priceNumberStr is ");
        LIZ3.append(substring);
        X1D.LIZIZ(LIZ3);
        LJ2.getClass();
        valueOf = CastDoubleProtector.valueOf(substring);
        C39670Fha LJ3 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("doublePrice is ");
        LIZ4.append(valueOf);
        X1D.LIZIZ(LIZ4);
        LJ3.getClass();
        Long valueOf22 = Long.valueOf((long) (valueOf.doubleValue() * 1000000.0d));
        if (!price.startsWith((String) c79359VCp.LIZ)) {
            StringBuilder LIZ5 = X1D.LIZ();
            price = JBR.LJFF(LIZ5, (String) c79359VCp.LIZ, price, LIZ5);
        }
        String str22 = (String) c79359VCp.LIZ;
        this.mTitle = product.getTitle();
        this.mDescription = product.getDescription();
        this.mOneTimePurchaseOffer = new AbsIapOneTimePurchaseOffer(price, valueOf22.longValue(), str22);
        this.mChannelUserData = iapChannelUserData;
    }
}
