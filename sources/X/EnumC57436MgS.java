package X;

/* renamed from: X.MgS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC57436MgS {
    TT_NOW_NORMAL_UNFOLLOW(5),
    TT_NOW_NORMAL_FOLLOWING(6),
    TT_NOW_FOLLOW_BACK_OVERLAY(7),
    TT_NOW_POST_UNFOLLOW(8),
    TT_NOW_POST_FOLLOWING(9);

    public final int LJLIL;

    public static EnumC57436MgS valueOf(String str) {
        return (EnumC57436MgS) V0N.LJJJ(EnumC57436MgS.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC57436MgS(int i) {
        this.LJLIL = i;
    }
}
