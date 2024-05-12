package X;

/* renamed from: X.Tmw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75674Tmw {
    NONE(0),
    SUPPORT_MULTI(2);

    public static final C75675Tmx Companion = new C75675Tmx();
    public int LJLIL;

    public static EnumC75674Tmw valueOf(String str) {
        return (EnumC75674Tmw) V0N.LJJJ(EnumC75674Tmw.class, str);
    }

    public final boolean isMultiCoHost() {
        if (this == SUPPORT_MULTI) {
            return true;
        }
        return false;
    }

    public final int getPermissionType() {
        return this.LJLIL;
    }

    public final void setPermissionType(int i) {
        this.LJLIL = i;
    }

    EnumC75674Tmw(int i) {
        this.LJLIL = i;
    }
}
