package X;

/* renamed from: X.9Q1, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9Q1 {
    OFFLINE_MODE_SETTING_PANEL("offline_mode_setting_panel", "show_offline_mode_setting_panel"),
    OFFLINE_MODE_PANEL("offline_mode_panel", "show_offline_mode_panel");

    public static final C9Q2 Companion = new Object() { // from class: X.9Q2
    };
    public final String LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI = false;

    public static C9Q1 valueOf(String str) {
        return (C9Q1) V0N.LJJJ(C9Q1.class, str);
    }

    public final String getPageName() {
        return this.LJLIL;
    }

    public final String getShowEventName() {
        return this.LJLILLLLZI;
    }

    public final boolean getWithBack() {
        return this.LJLJI;
    }

    public final void setWithBack(boolean z) {
        this.LJLJI = z;
    }

    C9Q1(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
