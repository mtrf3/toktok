package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Adu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26702Adu extends AbstractC65781Prl implements InterfaceC88473Ynt<View, Image, Integer, C76800UCe> {
    public static final C26702Adu INSTANCE = new C26702Adu();

    public C26702Adu() {
        super(3);
    }

    public final void invoke(View bindItems, Image item, int i) {
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        W5F LIZLLL = C70759Rpr.LIZLLL(item.toThumbFirstImageUrlModel());
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJIILIIL = C7MY.LIZJ(bindItems, "context", R.attr.cj);
        LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
        LIZLLL.LJJIIJ = (SmartImageView) bindItems.findViewById(R.id.jjx);
        C16880lQ.LLJJJ(LIZLLL);
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ C76800UCe invoke(View view, Image image, Integer num) {
        invoke(view, image, num.intValue());
        return C76800UCe.LIZ;
    }
}
