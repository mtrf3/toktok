package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPropertyItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ace, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26624Ace extends AbstractC65781Prl implements InterfaceC88473Ynt<View, ProductPropertyItem, Integer, C76800UCe> {
    public static final C26624Ace LJLIL = new C26624Ace();

    public C26624Ace() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(View view, ProductPropertyItem productPropertyItem, Integer num) {
        View bindItems = view;
        ProductPropertyItem prop = productPropertyItem;
        num.intValue();
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(prop, "prop");
        ((TextView) bindItems.findViewById(R.id.m2v)).setText(prop.propValue);
        C26338AVi.LJI(bindItems, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))), AnonymousClass391.LIZJ(12), false, 19);
        return C76800UCe.LIZ;
    }
}
