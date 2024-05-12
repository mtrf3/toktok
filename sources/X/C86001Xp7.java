package X;

/* renamed from: X.Xp7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86001Xp7 extends AbstractC86000Xp6 {
    public static final C86001Xp7 LJLJI;

    static {
        C86001Xp7 c86001Xp7 = new C86001Xp7();
        LJLJI = c86001Xp7;
        c86001Xp7.setStackTrace(AbstractC86000Xp6.LJLILLLLZI);
    }

    public static C86001Xp7 getFormatInstance() {
        if (AbstractC86000Xp6.LJLIL) {
            return new C86001Xp7();
        }
        return LJLJI;
    }

    public C86001Xp7() {
    }

    public C86001Xp7(Throwable th) {
        super(th);
    }

    public static C86001Xp7 getFormatInstance(Throwable th) {
        if (AbstractC86000Xp6.LJLIL) {
            return new C86001Xp7(th);
        }
        return LJLJI;
    }
}
