package X;

/* loaded from: classes14.dex */
public enum U4E {
    Invite(0),
    Apply(1);

    public int val;

    public static U4E valueOf(String str) {
        return (U4E) V0N.LJJJ(U4E.class, str);
    }

    U4E(int i) {
        this.val = i;
    }
}
