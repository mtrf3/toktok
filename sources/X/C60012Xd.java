package X;

import com.ss.android.ugc.aweme.ecommerce.ab.EcomSparkLruInjectConfig;
import java.util.LinkedHashMap;

/* renamed from: X.2Xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60012Xd extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends EcomSparkLruInjectConfig.EcomSparkLruInjectModel>> {
    public static final C60012Xd LJLIL = new C60012Xd();

    public C60012Xd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends EcomSparkLruInjectConfig.EcomSparkLruInjectModel> invoke() {
        EcomSparkLruInjectConfig.LIZ.getClass();
        EcomSparkLruInjectConfig.EcomSparkLruInjectModel[] ecomSparkLruInjectModelArr = EcomSparkLruInjectConfig.LIZIZ;
        if (ecomSparkLruInjectModelArr.length == 0) {
            return C113554cx.LJJJLIIL();
        }
        int LJJIIZ = C51029K0z.LJJIIZ(ecomSparkLruInjectModelArr.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EcomSparkLruInjectConfig.EcomSparkLruInjectModel ecomSparkLruInjectModel : ecomSparkLruInjectModelArr) {
            linkedHashMap.put(ecomSparkLruInjectModel.getChannel(), ecomSparkLruInjectModel);
        }
        return linkedHashMap;
    }
}
