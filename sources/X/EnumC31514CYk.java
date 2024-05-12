package X;

/* renamed from: X.CYk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31514CYk {
    DEFAULT(0),
    GIFT_RANK(1),
    E_COMMERCE(2),
    GAME_RANK(3);

    public static final C31513CYj Companion = new C31513CYj();
    public final int LJLIL;

    public static EnumC31514CYk valueOf(String str) {
        return (EnumC31514CYk) V0N.LJJJ(EnumC31514CYk.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC31514CYk(int i) {
        this.LJLIL = i;
    }
}
