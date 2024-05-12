package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import defpackage.a1;
import defpackage.q;

/* renamed from: X.Ado, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26696Ado extends FrameLayout {
    public final LinearLayout LJLIL;
    public InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> LJLILLLLZI;
    public C26695Adn LJLJI;
    public C26695Adn LJLJJI;

    public final void setOnSelectedChangeListener(InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> interfaceC88471Ynr) {
        this.LJLILLLLZI = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26696Ado(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        LinearLayout LIZ = q.LIZ(context, 0);
        this.LJLIL = LIZ;
        addView(LIZ);
    }
}
