package X;

/* loaded from: classes10.dex */
public enum LHC {
    UNKNOWN(0),
    FRIENDS_FEED(1),
    FRIEND_FOLLOWING_MERGE_FEED(4);

    public final int LJLIL;

    public static LHC valueOf(String str) {
        return (LHC) V0N.LJJJ(LHC.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    LHC(int i) {
        this.LJLIL = i;
    }
}
