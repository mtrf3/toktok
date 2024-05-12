package X;

/* renamed from: X.aSi, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC93552aSi {
    CODE("code"),
    TOKEN("token"),
    ERROR("error"),
    EMPTY("empty"),
    UNKNOWN("unknown");

    public final String LJLIL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    public static EnumC93552aSi valueOf(String str) {
        return (EnumC93552aSi) V0N.LJJJ(EnumC93552aSi.class, str);
    }

    EnumC93552aSi(String str) {
        this.LJLIL = str;
    }
}
