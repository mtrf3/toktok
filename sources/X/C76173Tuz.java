package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tuz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76173Tuz extends AbstractC76172Tuy {
    public static final C76173Tuz LIZ = new C76173Tuz();

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return 30000;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 39999;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
        C0K2.LIZIZ(new Throwable(th), AbstractC76172Tuy.LJ(i, msg, th), map);
    }
}
