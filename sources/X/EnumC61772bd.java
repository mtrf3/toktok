package X;

/* renamed from: X.2bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC61772bd {
    PERCENTAGE(1),
    DURATION(2);

    public static final C61892bp Companion = new C61892bp();
    public int LJLIL;

    public static EnumC61772bd valueOf(String str) {
        return (EnumC61772bd) V0N.LJJJ(EnumC61772bd.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    public final void setType(int i) {
        this.LJLIL = i;
    }

    EnumC61772bd(int i) {
        this.LJLIL = i;
    }
}
