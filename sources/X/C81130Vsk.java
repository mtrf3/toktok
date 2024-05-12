package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.Vsk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81130Vsk extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ C81130Vsk(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new C45621qg(context, attributeSet);
            default:
                return new JGI(context, attributeSet);
        }
    }
}
