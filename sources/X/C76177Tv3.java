package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tv3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76177Tv3 extends AbstractC76172Tuy {
    public static final C76177Tv3 LIZ = new C76177Tv3();

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return 90000;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 99999;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
        C0K2.LIZIZ(new Throwable(th), AbstractC76172Tuy.LJ(i, msg, th), map);
    }
}
