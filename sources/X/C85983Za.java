package X;

/* renamed from: X.3Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85983Za {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i) {
        return (i == 0 || i == 2) ? 0 : 2;
    }

    public static int LIZIZ(C85993Zb c85993Zb) {
        if (c85993Zb == null) {
            return 4;
        }
        if (c85993Zb.LJLJJI == C3ZE.FOLLOW_EACH_OTHER.getStatus()) {
            return 0;
        }
        if (c85993Zb.LJLJJI == C3ZE.FOLLOWING.getStatus()) {
            return 2;
        }
        if (c85993Zb.LJLILLLLZI) {
            return 3;
        }
        if (!c85993Zb.LJLJJL) {
            return 4;
        }
        return 1;
    }
}
