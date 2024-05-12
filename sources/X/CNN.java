package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class CNN implements CNT {
    public final /* synthetic */ int LIZ;

    public CNN(int i) {
        this.LIZ = i;
    }

    @Override // X.CNT
    public final void LIZ(View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() - this.LIZ, view.getPaddingRight(), view.getPaddingBottom());
    }

    @Override // X.CNT
    public final void LIZIZ(View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + this.LIZ, view.getPaddingRight(), view.getPaddingBottom());
    }
}
