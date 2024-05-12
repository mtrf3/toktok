package X;

import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class N2R {
    public static final N2R LIZ = new N2R();
    public static final EcomImageXConfig.EcomImageXConfigData LIZIZ;
    public static final java.util.Map<String, EcomImageXConfig.EcomImageXConfigModel> LIZJ;
    public static final java.util.Map<String, EcomImageXConfig.EcomImageXConfigModel> LIZLLL;

    static {
        EcomImageXConfig.EcomImageXConfigData ecomImageXConfigData = new EcomImageXConfig.EcomImageXConfigData(null, null, null, 7, null);
        FFL.LJIIIZ().getClass();
        EcomImageXConfig.EcomImageXConfigData ecomImageXConfigData2 = (EcomImageXConfig.EcomImageXConfigData) FFL.LJIJ(true, "ecom_imagex_config_extra", 31744, EcomImageXConfig.EcomImageXConfigData.class, ecomImageXConfigData);
        if (ecomImageXConfigData2 != null) {
            ecomImageXConfigData = ecomImageXConfigData2;
        }
        LIZIZ = ecomImageXConfigData;
        List<EcomImageXConfig.EcomImageXConfigModel> config = ecomImageXConfigData.getConfig();
        ArrayList arrayList = new ArrayList();
        for (EcomImageXConfig.EcomImageXConfigModel ecomImageXConfigModel : config) {
            if (C78685UuP.LJJJZ(ecomImageXConfigModel.getScene())) {
                arrayList.add(ecomImageXConfigModel);
            }
        }
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList, 10));
        int i = 16;
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((EcomImageXConfig.EcomImageXConfigModel) next).getScene(), next);
        }
        LIZJ = linkedHashMap;
        List<EcomImageXConfig.EcomImageXConfigModel> config2 = LIZIZ.getConfig();
        ArrayList arrayList2 = new ArrayList();
        for (EcomImageXConfig.EcomImageXConfigModel ecomImageXConfigModel2 : config2) {
            if (C78685UuP.LJJJZ(ecomImageXConfigModel2.getPage())) {
                arrayList2.add(ecomImageXConfigModel2);
            }
        }
        int LJJIIZ2 = C51029K0z.LJJIIZ(C32I.LJJL(arrayList2, 10));
        if (LJJIIZ2 >= 16) {
            i = LJJIIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            linkedHashMap2.put(((EcomImageXConfig.EcomImageXConfigModel) next2).getPage(), next2);
        }
        LIZLLL = linkedHashMap2;
    }
}
