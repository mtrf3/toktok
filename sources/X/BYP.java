package X;

/* loaded from: classes6.dex */
public enum BYP {
    BAN_FOR_LINK(13),
    BAN_FOR_BROADCASTING(2);

    public final int type;

    public static BYP valueOf(String str) {
        return (BYP) V0N.LJJJ(BYP.class, str);
    }

    BYP(int i) {
        this.type = i;
    }
}
