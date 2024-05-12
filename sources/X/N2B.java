package X;

/* loaded from: classes11.dex */
public enum N2B {
    DEBUG_SHORTCUT("DEBUG_SHORTCUT", "DEBUG_SHORTCUT"),
    WATCH_NOW("WATCH_NOW", "WATCH_NOW"),
    CLEAN_MEMORY("CLEAN_MEMORY", "CLEAN_MEMORY"),
    WILL_GET_MOST("WILL_GET_MOST", "WILL_GET_MOST"),
    WITHDRAWAL("WITHDRAWAL", "WITHDRAWAL"),
    GUEST_MODE_SHORTCUT("GUEST_MODE_SHORTCUT", "GUEST_MODE_SHORTCUT"),
    NOTIFICATION("NOTIFICATION", "NOTIFICATION"),
    SHOOTING("SHOOTING", "SHOOTING"),
    FRIENDS("FRIENDS", "FRIENDS"),
    DISCOVER("DISCOVER", "DISCOVER"),
    SCAN("SCAN", "SCAN"),
    DEFAULT("DEFAULT", "DEFAULT");

    public final String LJLIL;
    public final int LJLILLLLZI;

    public static N2B valueOf(String str) {
        return (N2B) V0N.LJJJ(N2B.class, str);
    }

    public final String getShortcutId() {
        return this.LJLIL;
    }

    public final int getShortcutPriority() {
        return this.LJLILLLLZI;
    }

    N2B(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r2;
    }
}
