package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.I4p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46027I4p extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C46026I4o LIZJ;

    public C46027I4p(C46026I4o c46026I4o, boolean z) {
        this.LIZJ = c46026I4o;
        this.LIZIZ = z;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (this.LIZIZ || this.LIZJ.LJLL) {
            this.LIZJ.LJ();
        }
        C46026I4o c46026I4o = this.LIZJ;
        c46026I4o.LJLL = true;
        c46026I4o.LIZIZ();
    }
}
