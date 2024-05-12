package X;

/* renamed from: X.Xe2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85314Xe2 {
    ENTER_POST_PAGE(1001),
    POST(1002),
    SAVE_DRAFT(1003),
    GIVE_UP_POST(1004),
    TURN_PAGE(1005),
    SELECT_POI_FROM_LIST(1006),
    SELECT_POI_FROM_RECOMMEND(1007),
    DELETE_POI(1008),
    SLIDE_RECOMMEND(1009),
    OPEN_POI_LIST(1010),
    CLOSE_POI_LIST(1011),
    SEARCH_KEY_WORD(1012),
    EMPTY_SEARCH(1013),
    SEARCH_RESULT_CALLBACK(1014);

    public final int LJLIL;

    public static EnumC85314Xe2 valueOf(String str) {
        return (EnumC85314Xe2) V0N.LJJJ(EnumC85314Xe2.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC85314Xe2(int i) {
        this.LJLIL = i;
    }
}
