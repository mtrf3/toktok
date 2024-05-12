package X;

import kotlin.jvm.internal.o;

/* renamed from: X.APi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26182APi {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        boolean z;
        if (o.LJ(str, "story_click") && C26180APg.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (((Boolean) JBV.LIZLLL.getValue()).booleanValue() || JBV.LIZIZ()) {
            if (z || o.LJ(str, "story_show")) {
                return "animation";
            }
            return "static";
        }
        return "static";
    }
}
