package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.TtfSkuVH;
import kotlin.jvm.internal.o;

/* renamed from: X.Rfz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70147Rfz implements InterfaceC70165RgH {
    public final /* synthetic */ TtfSkuVH LIZ;
    public final /* synthetic */ C70247Rhb LIZIZ;
    public final /* synthetic */ RXV LIZJ;
    public final /* synthetic */ SkcInfo LIZLLL;

    public C70147Rfz(TtfSkuVH ttfSkuVH, C70247Rhb c70247Rhb, RXV rxv, SkcInfo skcInfo) {
        this.LIZ = ttfSkuVH;
        this.LIZIZ = c70247Rhb;
        this.LIZJ = rxv;
        this.LIZLLL = skcInfo;
    }

    @Override // X.InterfaceC70165RgH
    public final void LIZ(InterfaceC70268Rhw view, int i, String selectPropValueId, int i2, boolean z) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(selectPropValueId, "selectPropValueId");
        this.LIZ.logClick(this.LIZIZ, i, selectPropValueId, this.LIZJ, i2);
        this.LIZ.updateNoticeText(this.LIZJ.LIZIZ);
        if (z) {
            this.LIZ.notifySkuChangeOuter(view, i, selectPropValueId, this.LIZLLL);
        } else {
            this.LIZ.notifySkuChangeOuter(view, i, null, this.LIZLLL);
        }
    }
}