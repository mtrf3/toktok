package X;

/* renamed from: X.NEq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59028NEq {
    public static final C5H3<C59028NEq> LIZJ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C59029NEr.LJLIL);
    public final C0M6<String, NFT> LIZ = new C0M6<>(100);
    public final C0M6<String, C59030NEs> LIZIZ = new C0M6<>(100);

    public final int LIZ(String str) {
        C0M6<String, C59030NEs> c0m6;
        C59030NEs LIZIZ;
        if (str == null || (c0m6 = this.LIZIZ) == null || (LIZIZ = c0m6.LIZIZ(str)) == null) {
            return 0;
        }
        return LIZIZ.LIZ;
    }

    public final boolean LIZIZ(String str) {
        C0M6<String, C59030NEs> c0m6;
        C59030NEs LIZIZ;
        if (str == null || (c0m6 = this.LIZIZ) == null || (LIZIZ = c0m6.LIZIZ(str)) == null) {
            return false;
        }
        return LIZIZ.LIZIZ;
    }
}
