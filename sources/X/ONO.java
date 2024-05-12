package X;

/* loaded from: classes11.dex */
public enum ONO {
    DEFAULT(0),
    FINISH(1),
    SKIP(2),
    LIKE(3),
    FOLLOW(4),
    COVER(5),
    HEAD(6),
    COMMENT(7),
    DISLIKE(8),
    SHOOT(9),
    SHAREIN(10),
    SHAREOUT(11),
    FAVORITE(12);

    public final int LJLIL;

    public static ONO valueOf(String str) {
        return (ONO) V0N.LJJJ(ONO.class, str);
    }

    public final int getId() {
        return this.LJLIL;
    }

    ONO(int i) {
        this.LJLIL = i;
    }
}
