package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UCM extends AbstractC76172Tuy {
    public static final UCM LIZ = new UCM();

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return 20000;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 29999;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
        C0K2.LIZIZ(new Throwable(th), AbstractC76172Tuy.LJ(i, msg, th), map);
    }
}
