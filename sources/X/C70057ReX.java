package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidget;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;

/* renamed from: X.ReX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70057ReX implements InterfaceC70280Ri8 {
    public final /* synthetic */ SkuWidget LIZ;

    public C70057ReX(SkuWidget skuWidget) {
        this.LIZ = skuWidget;
    }

    @Override // X.InterfaceC70280Ri8
    public final void LIZ(C70068Rei c70068Rei) {
        this.LIZ.getMViewModel().LJZI = c70068Rei.LJLILLLLZI;
    }

    @Override // X.InterfaceC70280Ri8
    public final void LIZIZ(String[] strArr) {
        this.LIZ.getMViewModel().kw0(strArr);
    }

    @Override // X.InterfaceC70280Ri8
    public final void LIZJ(int i, int i2, Image image, boolean z) {
        if (image != null) {
            if (z) {
                SkuPanelState skuPanelState = this.LIZ.getMViewModel().LJLLI;
                if (skuPanelState != null) {
                    skuPanelState.setClickImageSource(new ImageSelectData(image, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.SKU, i2));
                }
            } else {
                SkuPanelState skuPanelState2 = this.LIZ.getMViewModel().LJLLI;
                if (skuPanelState2 != null) {
                    skuPanelState2.setClickImageSource(new ImageSelectData(image, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.SKU, -1));
                }
            }
        }
        SkuPanelState skuPanelState3 = this.LIZ.getMViewModel().LJLLI;
        if (skuPanelState3 != null) {
            ArrayList<Integer> clickSpecGroupIds = skuPanelState3.getClickSpecGroupIds();
            if (clickSpecGroupIds == null) {
                clickSpecGroupIds = new ArrayList<>();
            }
            if (!clickSpecGroupIds.contains(Integer.valueOf(i))) {
                clickSpecGroupIds.add(Integer.valueOf(i));
            }
            skuPanelState3.setClickSpecGroupIds(clickSpecGroupIds);
        }
        C70307RiZ.LJ(this.LIZ.getMViewModel().LLFF, Boolean.valueOf(z), Integer.valueOf(i + 1), Integer.valueOf(i2 + 1));
    }
}
