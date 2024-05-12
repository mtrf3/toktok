package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JeJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49659JeJ extends F9E implements KK7 {
    public final C49847JhL LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().Gb().LIZIZ(C65352Pkq.LIZ(C49659JeJ.class), C49658JeI.LJLIL);
    }

    public C49659JeJ(C49847JhL streamRoot) {
        o.LJIIIZ(streamRoot, "streamRoot");
        this.LJLIL = streamRoot;
    }
}
