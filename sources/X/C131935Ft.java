package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131935Ft {
    public static volatile InterfaceC131945Fu LIZ = new InterfaceC131945Fu() { // from class: X.5Fv
        @Override // X.InterfaceC131945Fu
        public final void d(String msg) {
            o.LJIIIZ(msg, "msg");
        }

        @Override // X.InterfaceC131945Fu
        public final void e(String str, Throwable th) {
        }

        @Override // X.InterfaceC131945Fu
        public final void i(String msg) {
            o.LJIIIZ(msg, "msg");
        }

        @Override // X.InterfaceC131945Fu
        public final void w(String msg) {
            o.LJIIIZ(msg, "msg");
        }
    };
    public static final String LIZIZ = "Davinci-Editor";

    public static final void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        InterfaceC131945Fu interfaceC131945Fu = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append(' ');
        LIZ2.append(msg);
        interfaceC131945Fu.d(X1D.LIZIZ(LIZ2));
    }

    public static final void LIZJ(String str) {
        InterfaceC131945Fu interfaceC131945Fu = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        interfaceC131945Fu.e(C0MT.LIZ(LIZ2, LIZIZ, ' ', str, LIZ2), null);
    }

    public static final void LJFF(String str) {
        InterfaceC131945Fu interfaceC131945Fu = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append(' ');
        LIZ2.append(str);
        interfaceC131945Fu.w(X1D.LIZIZ(LIZ2));
    }

    public static final void LIZIZ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        InterfaceC131945Fu interfaceC131945Fu = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(tag);
        LIZ2.append("  ");
        LIZ2.append(msg);
        interfaceC131945Fu.d(X1D.LIZIZ(LIZ2));
    }

    public static final void LIZLLL(String str, String str2) {
        InterfaceC131945Fu interfaceC131945Fu = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("  ");
        LIZ2.append(str2);
        interfaceC131945Fu.e(X1D.LIZIZ(LIZ2), null);
    }

    public static final void LJ(String str, String msg) {
        o.LJIIIZ(msg, "msg");
        InterfaceC131945Fu interfaceC131945Fu = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("  ");
        LIZ2.append(msg);
        interfaceC131945Fu.i(X1D.LIZIZ(LIZ2));
    }
}
