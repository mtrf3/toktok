package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UCO extends AbstractC76172Tuy {
    public static final UCO LIZ = new UCO();

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return 100;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 199;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
        C0K2.LIZIZ(new Throwable(th), AbstractC76172Tuy.LJ(i, msg, th), map);
    }
}
