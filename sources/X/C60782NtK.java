package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NtK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60782NtK extends OM2 {
    public final /* synthetic */ C60786NtO LJLIL;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public C60782NtK(C60786NtO c60786NtO) {
        this.LJLIL = c60786NtO;
    }

    @Override // X.OM2
    public final void LJJJIL(int i, int i2, boolean z, boolean z2) {
        if (z || z2) {
            OM1 extendable = getExtendable();
            o.LJII(extendable, "null cannot be cast to non-null type android.webkit.WebView");
            extendable.requestDisallowInterceptTouchEvent(false);
        }
        super.LJJJIL(i, i2, z, z2);
    }
}
