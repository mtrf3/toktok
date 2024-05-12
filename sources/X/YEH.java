package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes16.dex */
public final class YEH extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ YEH(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new C29701Eo(context, attributeSet);
            default:
                return new C208218Fd(context, attributeSet);
        }
    }
}
