package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSlardarReportWhiteList;
import java.util.LinkedHashMap;

/* renamed from: X.J7v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48659J7v extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem>> {
    public static final C48659J7v LJLIL = new C48659J7v();

    public C48659J7v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem> invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[] ecomSlardarReportWhiteItemArr = EcomSlardarReportWhiteList.LIZIZ;
        EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[] ecomSlardarReportWhiteItemArr2 = (EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[]) LIZLLL.LJIIIIZZ("ec_slardar_report_whitelist", EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[].class, ecomSlardarReportWhiteItemArr);
        if (ecomSlardarReportWhiteItemArr2 != null) {
            ecomSlardarReportWhiteItemArr = ecomSlardarReportWhiteItemArr2;
        }
        int LJJIIZ = C51029K0z.LJJIIZ(ecomSlardarReportWhiteItemArr.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem ecomSlardarReportWhiteItem : ecomSlardarReportWhiteItemArr) {
            linkedHashMap.put(ecomSlardarReportWhiteItem.getName(), ecomSlardarReportWhiteItem);
        }
        return linkedHashMap;
    }
}
