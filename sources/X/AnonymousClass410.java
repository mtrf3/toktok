package X;

import android.view.View;

/* renamed from: X.410, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass410 implements AnonymousClass412 {
    public final View LIZ;

    @Override // X.AnonymousClass412
    public final void pause() {
        this.LIZ.setVisibility(8);
    }

    @Override // X.AnonymousClass412
    public final void resume() {
        this.LIZ.setVisibility(0);
    }

    public AnonymousClass410(View view) {
        this.LIZ = view;
    }
}
