package X;

/* renamed from: X.ScZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC72483ScZ {
    TT_NOW(1),
    TT_NOW_INVITE_FRIEND(4),
    TT_INBOX_NEW_FOLLOWER(5),
    TT_RELATION_PAGE(6),
    UNKNOWN(-1);

    public static final C72488Sce Companion = new C72488Sce();
    public final int LJLIL;

    public static EnumC72483ScZ valueOf(String str) {
        return (EnumC72483ScZ) V0N.LJJJ(EnumC72483ScZ.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC72483ScZ(int i) {
        this.LJLIL = i;
    }
}
