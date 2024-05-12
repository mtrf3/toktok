package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes16.dex */
public final class YP1 extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ YP1(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new C47121t6(context, attributeSet);
            default:
                return new C53691L5j(context, attributeSet);
        }
    }
}
