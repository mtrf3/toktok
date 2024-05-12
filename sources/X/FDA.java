package X;

import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.settings.EcomGeckoFrontUpdateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* loaded from: classes7.dex */
public final class FDA extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends EcomGeckoFrontUpdateModel>> {
    public static final FDA LJLIL = new FDA();

    public FDA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends EcomGeckoFrontUpdateModel> invoke() {
        Long l;
        String str;
        EcomGeckoUpdateInterceptor ecomGeckoUpdateInterceptor = EcomGeckoUpdateInterceptor.LJLIL;
        FDH[] fdhArr = {FDG.LIZ, FDC.LIZ, FDD.LIZ, FDE.LIZ, FDF.LIZ};
        ecomGeckoUpdateInterceptor.getClass();
        LinkedHashMap linkedHashMap = null;
        try {
            ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                arrayList.add(fdhArr[i].LIZ());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(((java.util.Map) it.next()).keySet(), arrayList2);
            }
            java.util.Set<String> LLJJ = ORZ.LLJJ(arrayList2);
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LLJJ, 10));
            for (String str2 : LLJJ) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel = (EcomGeckoFrontUpdateModel) ((java.util.Map) it2.next()).get(str2);
                    if (ecomGeckoFrontUpdateModel != null) {
                        str = ecomGeckoFrontUpdateModel.getUpdate();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                }
                String LLD = ORZ.LLD(arrayList4, ",", null, null, null, 62);
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel2 = (EcomGeckoFrontUpdateModel) ((java.util.Map) it3.next()).get(str2);
                    if (ecomGeckoFrontUpdateModel2 != null) {
                        l = Long.valueOf(ecomGeckoFrontUpdateModel2.getDelay());
                    } else {
                        l = null;
                    }
                    if (l != null) {
                        arrayList5.add(l);
                    }
                }
                arrayList3.add(new EcomGeckoFrontUpdateModel(str2, LLD, ((Number) ORZ.LLFF(arrayList5)).longValue()));
            }
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList3, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(LJJIIZ);
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                linkedHashMap2.put(((EcomGeckoFrontUpdateModel) next).getScene(), next);
            }
            linkedHashMap = linkedHashMap2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        if (linkedHashMap == null) {
            return C113554cx.LJJJLIIL();
        }
        return linkedHashMap;
    }
}
