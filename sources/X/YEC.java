package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;

/* loaded from: classes16.dex */
public final class YEC extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new Space(context, attributeSet);
            default:
                return new T5P(context, attributeSet);
        }
    }
}
