package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.Vsn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81133Vsn extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ C81133Vsn(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new AppCompatImageView(context, attributeSet);
            default:
                return new C199947t0(context, attributeSet);
        }
    }
}
