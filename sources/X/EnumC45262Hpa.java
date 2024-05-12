package X;

/* renamed from: X.Hpa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC45262Hpa {
    VESDK("vesdk"),
    VEEDITOR("veeditor"),
    EFFECT_MANAGER("effectmanager"),
    EFFECT_MANAGER_MODEL("effectmodel"),
    MEDIA_CACHE("media_cache"),
    TEMPLATE_CACHE("template_cache"),
    TEMPLATE_WORKSPACE("workspace"),
    OUTPUT("output"),
    ARTIST_CACHE("artist_cache"),
    IMUSE_CACHE("imuse_cache"),
    MATERIAL_RESOURCE_CACHE("material_resource_cache");

    public final String LJLIL;

    public static EnumC45262Hpa valueOf(String str) {
        return (EnumC45262Hpa) V0N.LJJJ(EnumC45262Hpa.class, str);
    }

    public final String getDirName() {
        return this.LJLIL;
    }

    EnumC45262Hpa(String str) {
        this.LJLIL = str;
    }
}
