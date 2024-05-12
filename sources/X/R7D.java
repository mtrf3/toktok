package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R7D<T> implements InterfaceC73518StG {
    public final /* synthetic */ boolean LIZ = false;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZJ;

    public R7D(String str, java.util.Map map) {
        this.LIZIZ = str;
        this.LIZJ = map;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8P r8p = new R8P(c73516StE);
        if (this.LIZ) {
            Object value = R5N.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-commonRequestApi>(...)");
            ((R7F) value).LIZ(this.LIZIZ, this.LIZJ, r8p);
        } else {
            Object value2 = R5N.LIZ.getValue();
            o.LJIIIIZZ(value2, "<get-commonRequestApi>(...)");
            ((R7F) value2).LIZIZ(this.LIZIZ, this.LIZJ, r8p);
        }
    }
}
