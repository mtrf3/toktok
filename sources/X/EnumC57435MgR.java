package X;

/* renamed from: X.MgR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC57435MgR {
    NONE(-1),
    UNFOLLOW(0),
    FOLLOWED(1),
    FOLLOW_MUTUAL(2),
    SAME_USER(3),
    FOLLOW_REQUESTED(4),
    UNFOLLOW_BUT_BE_FOLLOWED(5);

    public static final C57437MgT Companion = new C57437MgT();
    public final int LJLIL;

    public static final EnumC57435MgR getByValue(int i) {
        Companion.getClass();
        return C57437MgT.LIZ(i);
    }

    public static EnumC57435MgR valueOf(String str) {
        return (EnumC57435MgR) V0N.LJJJ(EnumC57435MgR.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC57435MgR(int i) {
        this.LJLIL = i;
    }
}
