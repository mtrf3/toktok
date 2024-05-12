package X;

/* renamed from: X.OMj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC61777OMj {
    BINARY(0),
    FIVE_LEVEL(1),
    SINGLE_CHOICE(2),
    MULTIPLE_CHOICE(3),
    MULTIPLE_CHOICE_INPUT(4);

    public static final C61778OMk Companion = new C61778OMk();
    public final int LJLIL;

    public static EnumC61777OMj valueOf(String str) {
        return (EnumC61777OMj) V0N.LJJJ(EnumC61777OMj.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC61777OMj(int i) {
        this.LJLIL = i;
    }
}
