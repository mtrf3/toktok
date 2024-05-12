package X;

/* renamed from: X.Fz3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC40753Fz3 {
    NUJ_SCENE_NEW_USER("new_user_journey"),
    NUJ_SCENE_NEW_VERSION("new_version_journey"),
    NUJ_SCENE_DEFAULT("default_journey");

    public final String LJLIL;

    public static EnumC40753Fz3 valueOf(String str) {
        return (EnumC40753Fz3) V0N.LJJJ(EnumC40753Fz3.class, str);
    }

    public final String getId() {
        return this.LJLIL;
    }

    EnumC40753Fz3(String str) {
        this.LJLIL = str;
    }
}
