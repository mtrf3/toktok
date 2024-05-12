package X;

/* renamed from: X.Gpe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42718Gpe {
    CACHE("cache"),
    RESOURCE("resource"),
    DRAFT("draft"),
    STORY("story"),
    IMAGE("image");

    public final String LJLIL;

    public static EnumC42718Gpe valueOf(String str) {
        return (EnumC42718Gpe) V0N.LJJJ(EnumC42718Gpe.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC42718Gpe(String str) {
        this.LJLIL = str;
    }
}
