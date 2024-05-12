package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RXq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69714RXq extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        SizeGuide sizeGuide;
        String str;
        String str2;
        PdpViewModel vm = (PdpViewModel) obj;
        o.LJIIIZ(vm, "vm");
        Integer Wv0 = vm.Wv0();
        if (Wv0 == null || Wv0.intValue() != 0) {
            ProductPackStruct productPackStruct = ry7.LIZ;
            ArrayList arrayList = new ArrayList();
            if ((((!vm.Zv0() || !ry7.LIZLLL) && PdpViewModel.Nv0(productPackStruct)) || ry7.LJ) && !ry7.LIZLLL) {
                ModelCard modelCard = productPackStruct.modelCard;
                ProductBase productBase = productPackStruct.baseInfo;
                Image image = null;
                if (productBase != null) {
                    sizeGuide = productBase.sizeGuide;
                } else {
                    sizeGuide = null;
                }
                if (modelCard == null) {
                    if (sizeGuide != null) {
                        if (sizeGuide.skuSizeGuideSchema == null && (sizeGuide == null || sizeGuide.originSizeGuideImage == null)) {
                            return arrayList;
                        }
                    } else {
                        return arrayList;
                    }
                }
                arrayList.add(C69717RXt.LIZ);
                if (sizeGuide != null) {
                    str = sizeGuide.skuSizeGuideSchema;
                    str2 = sizeGuide.skuSizeGuideTitle;
                    image = sizeGuide.originSizeGuideImage;
                } else {
                    str = null;
                    str2 = null;
                }
                arrayList.add(new C27505Aqr(modelCard, str, str2, image));
                return arrayList;
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}
