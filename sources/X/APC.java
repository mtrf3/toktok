package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;

/* loaded from: classes5.dex */
public final class APC extends AP9 {
    @Override // X.AP9
    public int getVerifyIconMarginEnd() {
        return -C17N.LJIILL(4.0d);
    }

    @Override // X.AP9
    public int getVerifyIconSize() {
        return C17N.LJIILL(16.0d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
