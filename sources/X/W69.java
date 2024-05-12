package X;

import android.app.ActivityManager;

/* loaded from: classes15.dex */
public final class W69 extends W6A {
    public final /* synthetic */ W68 LIZIZ;

    @Override // X.W6A
    /* renamed from: LIZ */
    public final C81738W6c get() {
        return new C81738W6c(this.LIZIZ.LIZJ, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Override // X.W6A, X.W4P
    public final /* bridge */ /* synthetic */ C81738W6c get() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W69(W68 w68, ActivityManager activityManager) {
        super(activityManager);
        this.LIZIZ = w68;
    }
}
