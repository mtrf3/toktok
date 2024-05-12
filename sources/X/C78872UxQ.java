package X;

/* renamed from: X.UxQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78872UxQ extends XIB {
    public static final C78872UxQ LJLILLLLZI;
    public static final XIA LJLJI;

    @Override // X.XKW
    public final String toString() {
        return "Dispatchers.Default";
    }

    static {
        C78872UxQ c78872UxQ = new C78872UxQ();
        LJLILLLLZI = c78872UxQ;
        int i = C78873UxR.LIZ;
        if (64 >= i) {
            i = 64;
        }
        LJLJI = new XIA(c78872UxQ, C78866UxK.LJJZZI("kotlinx.coroutines.io.parallelism", i, 0, 0, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
}
