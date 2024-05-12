package X;

/* renamed from: X.Fov, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC40125Fov {
    LOAD_INIT(0),
    LOAD_START(100),
    LOAD_RES_LOADED(200),
    LOAD_FINISH(300);

    public final int LJLIL;

    public static EnumC40125Fov valueOf(String str) {
        return (EnumC40125Fov) V0N.LJJJ(EnumC40125Fov.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC40125Fov(int i) {
        this.LJLIL = i;
    }
}
