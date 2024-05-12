package X;

/* renamed from: X.IVw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC46736IVw {
    FixedListCache("fixed-list-cache", 50),
    Normal(null, -1),
    GHouse("g-house", 100),
    OfflineMode("offline-mode", 2000),
    FeedColdCache("feed-cold-cache", 200);

    public final String LJLIL;
    public final long LJLILLLLZI;

    public static EnumC46736IVw valueOf(String str) {
        return (EnumC46736IVw) V0N.LJJJ(EnumC46736IVw.class, str);
    }

    public final String getCacheDir() {
        return this.LJLIL;
    }

    public final long getSizeMB() {
        return this.LJLILLLLZI;
    }

    EnumC46736IVw(String str, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }
}
