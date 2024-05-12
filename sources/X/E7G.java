package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E7G implements EAA {
    public final /* synthetic */ E7F LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.EAA
    public final String[] LIZ() {
        String[] LJIIIIZZ = this.LIZ.LIZLLL.LJIIIIZZ(this.LIZIZ, new String[0]);
        o.LJFF(LJIIIIZZ, "dataStorage.getStringArr…geKey, arrayOf<String>())");
        return LJIIIIZZ;
    }

    @Override // X.EAA
    public final void LIZIZ(String[] strArr) {
        this.LIZ.LIZLLL.LJIIIZ(this.LIZIZ, strArr);
    }

    public E7G(E7F e7f, String str) {
        this.LIZ = e7f;
        this.LIZIZ = str;
    }
}
