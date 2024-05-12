package X;

/* renamed from: X.TIj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74413TIj<M> {
    public M LIZ;
    public EnumC74323TEx LIZIZ;
    public Throwable LIZJ;

    public static <M> C74413TIj<M> LIZIZ() {
        C74413TIj<M> c74413TIj = new C74413TIj<>();
        c74413TIj.LIZIZ = EnumC74323TEx.LOADING;
        return c74413TIj;
    }

    public static <T extends Throwable, M> C74413TIj<M> LIZ(T t) {
        C74413TIj<M> c74413TIj = new C74413TIj<>();
        c74413TIj.LIZIZ = EnumC74323TEx.ERROR;
        c74413TIj.LIZJ = t;
        return c74413TIj;
    }

    public static <M> C74413TIj<M> LIZJ(M m) {
        C74413TIj<M> c74413TIj = new C74413TIj<>();
        c74413TIj.LIZIZ = EnumC74323TEx.SUCCESS;
        c74413TIj.LIZ = m;
        return c74413TIj;
    }

    public static <M> C74413TIj<M> LIZLLL(EnumC74323TEx enumC74323TEx, M m) {
        C74413TIj<M> c74413TIj = new C74413TIj<>();
        c74413TIj.LIZIZ = enumC74323TEx;
        c74413TIj.LIZ = m;
        return c74413TIj;
    }
}
