package X;

/* renamed from: X.Rby, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC69898Rby {
    UNKNOWN(0),
    UNPUBLISHED(1),
    PUBLISHED(2);

    public static final C69899Rbz Companion = new C69899Rbz();
    public final int LJLIL;

    public static EnumC69898Rby valueOf(String str) {
        return (EnumC69898Rby) V0N.LJJJ(EnumC69898Rby.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC69898Rby(int i) {
        this.LJLIL = i;
    }
}
