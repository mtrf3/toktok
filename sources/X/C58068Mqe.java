package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.Mqe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58068Mqe extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ C58068Mqe(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new ConstraintLayout(context, attributeSet);
            default:
                return new C58049MqL(context, attributeSet);
        }
    }
}
