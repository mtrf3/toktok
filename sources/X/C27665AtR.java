package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import ujb.o;

/* renamed from: X.AtR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27665AtR extends AbstractC27664AtQ<String, String> {
    public final BrickInfo LJLIL;
    public final CommonData LJLILLLLZI;

    @Override // X.AbstractC27664AtQ
    public final Object LJIIJ(String str) {
        return str;
    }

    @Override // X.AbstractC27664AtQ
    public final Object LJIIJJI(String str) {
        return str;
    }

    public final String LJIIL() {
        boolean z;
        String str;
        String str2 = this.LJLIL.brickLynxSchema;
        if (str2 == null || o.LJJJJJL(str2)) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (z) {
            return "";
        }
        Uri.Builder buildUpon = UriProtector.parse(this.LJLIL.brickLynxSchema).buildUpon();
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("brick_name", Integer.valueOf(this.LJLIL.brickName));
        CommonData commonData = this.LJLILLLLZI;
        if (commonData != null && (str = commonData.productId) != null) {
            str3 = str;
        }
        oszArr[1] = new OSZ("product_id", str3);
        String builder = buildUpon.appendQueryParameter("scene_data", C237429Tm.LIZIZ(C113554cx.LJJL(oszArr))).appendQueryParameter("biz_extra", LIZIZ()).toString();
        kotlin.jvm.internal.o.LJIIIIZZ(builder, "parse(brickInfo.brickLyn…              .toString()");
        return builder;
    }

    @Override // X.AbstractC27664AtQ
    public final BrickInfo LJ() {
        return this.LJLIL;
    }

    @Override // X.AbstractC27664AtQ
    public final CommonData LJIIIIZZ() {
        return this.LJLILLLLZI;
    }

    public C27665AtR(BrickInfo brickInfo, CommonData commonData) {
        super(brickInfo, commonData);
        this.LJLIL = brickInfo;
        this.LJLILLLLZI = commonData;
    }
}
