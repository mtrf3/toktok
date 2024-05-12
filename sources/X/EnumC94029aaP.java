package X;

/* renamed from: X.aaP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC94029aaP {
    QUALITY_PREVIEW_COUNT("quality_preview_count"),
    QUALITY_OBJECT_COUNT("quality_object_count"),
    QUALITY_FEATURE_TYPE_COUNT("quality_feature_type_count"),
    QUALITY_VALID_COMMAND_COUNT("quality_valid_command_count"),
    QUALITY_OBJECT_WITH_USER_ASSETS_COUNT("quality_object_with_user_assets_count"),
    QUALITY_VALID_ACTION_COUNT("quality_valid_action_count"),
    QUALITY_ASSETS_TYPE("quality_assets_type"),
    MODERATION_TEXTS("moderation_texts"),
    MODERATION_ASSETS("moderation_assets");

    public static final C94028aaO Companion = new Object() { // from class: X.aaO
    };
    public final String LJLIL;

    public static EnumC94029aaP valueOf(String str) {
        return (EnumC94029aaP) V0N.LJJJ(EnumC94029aaP.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.LJLIL;
    }

    EnumC94029aaP(String str) {
        this.LJLIL = str;
    }
}
