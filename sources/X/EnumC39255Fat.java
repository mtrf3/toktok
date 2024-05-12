package X;

/* renamed from: X.Fat, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39255Fat {
    SCENE_CUSTOMIZED_LOADER(-1),
    SCENE_COLD_LAUNCH(0),
    SCENE_LOGIN(1);

    public final int LJLIL;

    public static EnumC39255Fat valueOf(String str) {
        return (EnumC39255Fat) V0N.LJJJ(EnumC39255Fat.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC39255Fat(int i) {
        this.LJLIL = i;
    }
}
