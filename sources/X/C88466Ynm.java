package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.Ynm, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88466Ynm extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ C88466Ynm(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new C2A4(context, attributeSet);
            default:
                return new C48887JGp(context, attributeSet);
        }
    }
}
