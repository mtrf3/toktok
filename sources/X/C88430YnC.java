package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;

/* renamed from: X.YnC, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88430YnC extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new ViewStub(context, attributeSet);
            default:
                return new C207768Dk(context, attributeSet);
        }
    }
}
