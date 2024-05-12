package X;

/* loaded from: classes7.dex */
public enum E6N {
    LIKE(100),
    DISLIKE(200),
    LIKE_CANCEL(201),
    VIDEO_PLAY_END(300),
    UNKNOWN(-1);

    public int LJLIL;

    public static E6N valueOf(String str) {
        return (E6N) V0N.LJJJ(E6N.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    public final void setType(int i) {
        this.LJLIL = i;
    }

    E6N(int i) {
        this.LJLIL = i;
    }
}
