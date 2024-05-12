package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EH7 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EH8.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EHB.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(EH9.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(EHA.LJLIL);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int LIZ(String key) {
        o.LJIIIZ(key, "key");
        switch (key.hashCode()) {
            case -30016963:
                if (key.equals("live_view_action")) {
                    return ((Number) LIZJ.getValue()).intValue();
                }
                return 30;
            case 401047372:
                if (key.equals("video_view_action")) {
                    return ((Number) LIZIZ.getValue()).intValue();
                }
                return 30;
            case 937355437:
                if (key.equals("search_action")) {
                    return ((Number) LIZLLL.getValue()).intValue();
                }
                return 30;
            case 1543147943:
                if (key.equals("goods_view_action")) {
                    return ((Number) LIZ.getValue()).intValue();
                }
                return 30;
            default:
                return 30;
        }
    }
}
