package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ar5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27519Ar5 extends AbstractC65781Prl implements InterfaceC88473Ynt<View, RelateProduct, Integer, C76800UCe> {
    public static final C27519Ar5 INSTANCE = new C27519Ar5();

    public C27519Ar5() {
        super(3);
    }

    public final void invoke(View bindItems, RelateProduct item, int i) {
        C62562cu c62562cu;
        Image image;
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        if ((i + 1) % 4 == 0) {
            C26338AVi.LJI(bindItems, null, null, 0, null, false, 27);
        }
        List<Image> list = item.images;
        if (list != null && (image = (Image) ORZ.LJLLLL(list)) != null) {
            c62562cu = image.toImageUrlModel();
        } else {
            c62562cu = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
        LIZLLL.LJIILIIL = C7MY.LIZJ(bindItems, "context", R.attr.cj);
        LIZLLL.LJJIIJ = (InterfaceC85013Vh) bindItems.findViewById(R.id.icq);
        C16880lQ.LLJJJ(LIZLLL);
        ((TextView) bindItems.findViewById(R.id.i47)).setText(item.price);
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ C76800UCe invoke(View view, RelateProduct relateProduct, Integer num) {
        invoke(view, relateProduct, num.intValue());
        return C76800UCe.LIZ;
    }
}
