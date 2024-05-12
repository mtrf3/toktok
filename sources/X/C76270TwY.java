package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TwY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76270TwY<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C76270TwY(int i, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable throwable = (Throwable) obj;
        C76265TwT.LJII(this.LJLIL, "cancel_failed");
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        long j = C76265TwT.LJIIIIZZ;
        o.LJIIIIZZ(throwable, "throwable");
        c76271TwZ.LJJJIL(j, throwable, this.LJLILLLLZI);
    }
}
