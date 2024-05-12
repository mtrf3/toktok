package X;

/* renamed from: X.KzU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC53520KzU implements L4O {
    UNFOLLOW("unfollow"),
    SINGLE_FOLLOW("single_follow"),
    MUTUAL_FOLLOW("mutual_follow");

    public final String LJLIL;

    public static EnumC53520KzU valueOf(String str) {
        return (EnumC53520KzU) V0N.LJJJ(EnumC53520KzU.class, str);
    }

    @Override // X.L4O
    public String getString() {
        return this.LJLIL;
    }

    EnumC53520KzU(String str) {
        this.LJLIL = str;
    }
}
