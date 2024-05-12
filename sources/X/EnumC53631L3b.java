package X;

/* renamed from: X.L3b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC53631L3b {
    UNFOLLOW(0),
    SINGLE_FOLLOW(1),
    MUTUAL_FOLLOW(2),
    SINGLE_FOLLOWED(3),
    REQUESTED(4);

    public final int LJLIL;

    public static EnumC53631L3b valueOf(String str) {
        return (EnumC53631L3b) V0N.LJJJ(EnumC53631L3b.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC53631L3b(int i) {
        this.LJLIL = i;
    }
}
