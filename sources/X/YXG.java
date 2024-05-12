package X;

/* loaded from: classes17.dex */
public enum YXG {
    MUTUAL(1),
    SINGLE_FOLLOWING_FRIEND(2),
    SINGLE_FOLLOWING_NO_FRIEND(3),
    SINGLE_FOLLOWED_FRIEND(4),
    SINGLE_FOLLOWED_NOT_FRIEND(5),
    UNFOLLOW_FRIEND(6),
    UNFOLLOW_NOT_FRIEND(7),
    ELSE(8);

    public final int LJLIL;

    public static YXG valueOf(String str) {
        return (YXG) V0N.LJJJ(YXG.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    YXG(int i) {
        this.LJLIL = i;
    }
}
