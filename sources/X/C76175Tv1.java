package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tv1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76175Tv1 extends AbstractC76172Tuy {
    public static final C76175Tv1 LIZ = new C76175Tv1();

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return 40000;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 49999;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
        C0K2.LIZIZ(new Throwable(th), AbstractC76172Tuy.LJ(i, msg, th), map);
    }
}
