package X;

/* loaded from: classes11.dex */
public enum ONP {
    UNSET(0),
    FINISH(1),
    SKIP(2),
    LIKE(3),
    FOLLOW(4),
    COVER(5),
    HEAD(6),
    COMMENT(7),
    DISLIKE(8),
    SHOOT(9),
    SHARE_IN(10),
    SHARE_OUT(11),
    FAVORITE(12);

    public int LJLIL;

    public static ONP valueOf(String str) {
        return (ONP) V0N.LJJJ(ONP.class, str);
    }

    public final int getTYPE() {
        return this.LJLIL;
    }

    public final void setTYPE(int i) {
        this.LJLIL = i;
    }

    ONP(int i) {
        this.LJLIL = i;
    }
}
