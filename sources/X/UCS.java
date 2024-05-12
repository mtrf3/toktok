package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UCS extends AbstractC76172Tuy {
    public static final UCS LIZ = new UCS();

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return 800;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 899;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
        C0K2.LIZIZ(new Throwable(th), AbstractC76172Tuy.LJ(i, msg, th), map);
    }
}
