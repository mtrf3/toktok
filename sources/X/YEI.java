package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes16.dex */
public final class YEI extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new LinearLayout(context, attributeSet);
            default:
                return new C164086cG(context, attributeSet);
        }
    }
}
