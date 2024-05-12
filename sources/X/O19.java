package X;

/* loaded from: classes11.dex */
public enum O19 {
    kMainFrame(0),
    kSubFrame(1),
    kStylesheet(2),
    kScript(3),
    kImage(4),
    kFontResource(5),
    kSubResource(6),
    kObject(7),
    kMedia(8),
    kWorker(9),
    kSharedWorker(10),
    kPrefetch(11),
    kFavicon(12),
    kXhr(13),
    kPing(14),
    kServiceWorker(15),
    kCspReport(16),
    kPluginResource(17),
    kNavigationPreload(18);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static O19 valueOf(String str) {
        return (O19) V0N.LJJJ(O19.class, str);
    }

    O19(int i) {
        this.LJLIL = i;
    }
}
