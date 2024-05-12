package X;

/* renamed from: X.2cM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC62222cM {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");

    public final String LJLIL;

    EnumC62222cM(String str) {
        this.LJLIL = str;
    }

    public static EnumC62222cM valueOf(String str) {
        return (EnumC62222cM) V0N.LJJJ(EnumC62222cM.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }
}
