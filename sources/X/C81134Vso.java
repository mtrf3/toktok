package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vso, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81134Vso extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ C81134Vso(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new RecyclerView(context, attributeSet);
            default:
                return new C50070Jkw(context, attributeSet);
        }
    }
}
