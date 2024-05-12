package X;

/* loaded from: classes10.dex */
public enum MG7 {
    FANS("fans"),
    OTHER_FANS("other_fans"),
    FOLLOWING("following_list"),
    OTHER_FOLLOWING("other_following");

    public final String LJLIL;

    public static MG7 valueOf(String str) {
        return (MG7) V0N.LJJJ(MG7.class, str);
    }

    public final String getMobString() {
        return this.LJLIL;
    }

    MG7(String str) {
        this.LJLIL = str;
    }
}
