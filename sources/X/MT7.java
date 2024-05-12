package X;

/* loaded from: classes10.dex */
public enum MT7 {
    FIRST_REQUEST(true, true),
    REFRESH(true, false),
    REFRESH_ALL(true, true),
    LOAD_MORE(false, false),
    CHANGE_TAB(false, false),
    CHANGE_TAB_ALL(false, false),
    CHANGE_SORT_TYPE(false, false),
    CHANGE_FILTER_TYPE(false, false),
    DELETED_NOTICE(false, false);

    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    public static MT7 valueOf(String str) {
        return (MT7) V0N.LJJJ(MT7.class, str);
    }

    public final boolean getNeedMarkRead() {
        return this.LJLIL;
    }

    public final boolean getNeedMarkReadAll() {
        return this.LJLILLLLZI;
    }

    MT7(boolean z, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }
}
