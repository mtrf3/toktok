package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ONLY_COMMERCIAL_MUSIC_TEXT_VIEW' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes11.dex */
public final class NAF {
    public static final NAF AI_RECOMMEND_MUSIC_CARD_LIST_VIEW;
    public static final /* synthetic */ NAF[] LJLJJI;
    public static final NAF NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW;
    public static final NAF NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW;
    public static final NAF NOTHING;
    public static final NAF ONLY_COMMERCIAL_MUSIC_TEXT_VIEW;
    public final boolean LJLIL;
    public final NAL LJLILLLLZI;
    public final EnumC58762N4k LJLJI;

    public static NAF valueOf(String str) {
        return (NAF) V0N.LJJJ(NAF.class, str);
    }

    public static NAF[] values() {
        return (NAF[]) LJLJJI.clone();
    }

    static {
        NAF naf = new NAF("NOTHING", 0, true, NAL.DIRECT_TO_SHOOT, EnumC58762N4k.NONE);
        NOTHING = naf;
        NAL nal = NAL.BANNED;
        NAF naf2 = new NAF("ONLY_COMMERCIAL_MUSIC_TEXT_VIEW", 1, false, nal, EnumC58762N4k.TEXT_ONLY);
        ONLY_COMMERCIAL_MUSIC_TEXT_VIEW = naf2;
        NAF naf3 = new NAF("AI_RECOMMEND_MUSIC_CARD_LIST_VIEW", 2, false, nal, EnumC58762N4k.RECOMMEND_MUSIC_LIST);
        AI_RECOMMEND_MUSIC_CARD_LIST_VIEW = naf3;
        NAF naf4 = new NAF("NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW", 3, true, NAL.DIRECT_TO_MUSIC_VIDEO_SHEET, EnumC58762N4k.NEW_UI_2_MV_LIST_SHEET);
        NEW_AI_RECOMMENDED_MUSIC_SHEET_MV_VIEW = naf4;
        NAF naf5 = new NAF("NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW", 4, true, NAL.DIRECT_TO_MUSIC_LIST_SHEET, EnumC58762N4k.NEW_UI_2_MUSIC_LIST_SHEET);
        NEW_AI_RECOMMENDED_MUSIC_SHEET_MUSIC_VIEW = naf5;
        LJLJJI = new NAF[]{naf, naf2, naf3, naf4, naf5};
    }

    public final boolean getEnableNormalUiElements() {
        return this.LJLIL;
    }

    public final NAL getShootAction() {
        return this.LJLILLLLZI;
    }

    public final EnumC58762N4k getVersion() {
        return this.LJLJI;
    }

    public NAF(String str, int i, boolean z, NAL nal, EnumC58762N4k enumC58762N4k) {
        this.LJLIL = z;
        this.LJLILLLLZI = nal;
        this.LJLJI = enumC58762N4k;
    }
}
