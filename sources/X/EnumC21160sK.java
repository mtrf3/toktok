package X;

/* renamed from: X.0sK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC21160sK {
    ADD_FAV("favorite"),
    REMOVE_FAV("cancel_favorite");

    public final String LJLIL;

    public static EnumC21160sK valueOf(String str) {
        return (EnumC21160sK) V0N.LJJJ(EnumC21160sK.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC21160sK(String str) {
        this.LJLIL = str;
    }
}
