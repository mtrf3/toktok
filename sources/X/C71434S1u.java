package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.S1u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71434S1u extends S2R<SG5, C69876Rbc> {
    public final java.util.Map<String, String> LIZLLL;
    public InterfaceC71436S1w LJ;

    public C71434S1u(SG5 sg5) {
        super(sg5);
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new C53645L3p();
    }

    public final void LIZLLL(C69876Rbc c69876Rbc) {
        List<String> urls;
        Object LJLLLLLL;
        ((LinkedHashMap) this.LIZLLL).clear();
        ArrayList arrayList = new ArrayList();
        List<PromotionLogo> list = c69876Rbc.LIZIZ;
        if (list != null) {
            for (PromotionLogo promotionLogo : list) {
                Image image = promotionLogo.image;
                if (image != null && (urls = image.getUrls()) != null && (LJLLLLLL = ORZ.LJLLLLLL(0, urls)) != null) {
                    arrayList.add(LJLLLLLL);
                    this.LIZLLL.putAll(promotionLogo.LIZ());
                }
            }
        }
        ((SG5) this.LIZ).LJJJIL(c69876Rbc.LIZ, arrayList, this.LJ.LIZIZ());
    }
}
