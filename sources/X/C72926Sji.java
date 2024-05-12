package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sji, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72926Sji<T> implements InterfaceC64592gB {
    public final /* synthetic */ U8Q LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C72926Sji(U8Q u8q, int i, int i2) {
        this.LJLIL = u8q;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object it) {
        U8Q u8q = this.LJLIL;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        o.LJIIIIZZ(it, "it");
        u8q.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bitmap_");
        LIZ.append(i);
        LIZ.append('_');
        LIZ.append(i2);
        u8q.LIZLLL.put(X1D.LIZIZ(LIZ), it);
    }
}
