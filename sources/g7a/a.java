package g7a;

import X.C38350F3i;
import X.C53700L5s;
import X.EnumC53701L5t;
import X.EnumC53704L5w;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class a {
    public static void LIZ(String str, p8.a aVar, C53700L5s c53700L5s, ViewGroup.LayoutParams layoutParams) {
        float f;
        String str2;
        String str3;
        switch (str.hashCode()) {
            case -1535121397:
                if (!str.equals("app:radius")) {
                    return;
                }
                Context context = c53700L5s.getContext();
                o.LJIIIIZZ(context, "view.context");
                c53700L5s.setRadius(q8.a.LIZJ(context, aVar));
                return;
            case 681713385:
                if (str.equals("app:theme_type") && (str3 = aVar.LIZ) != null) {
                    int hashCode = str3.hashCode();
                    if (hashCode != -358423381) {
                        if (hashCode != -350297506) {
                            if (hashCode != 1373927726 || !str3.equals("brand_dark")) {
                                return;
                            }
                            c53700L5s.setThemeType(EnumC53704L5w.DARK);
                            return;
                        }
                        if (!str3.equals("brand_light")) {
                            return;
                        }
                        c53700L5s.setThemeType(EnumC53704L5w.LIGHT);
                        return;
                    }
                    if (!str3.equals("brand_const")) {
                        return;
                    }
                    c53700L5s.setThemeType(EnumC53704L5w.CONST);
                    return;
                }
                return;
            case 887664112:
                if (!str.equals("app:ring_width")) {
                    return;
                }
                Context context2 = c53700L5s.getContext();
                o.LJIIIIZZ(context2, "view.context");
                c53700L5s.setRingWidth(q8.a.LIZJ(context2, aVar));
                return;
            case 1506662996:
                if (!str.equals("app:brand_mode") || (str2 = aVar.LIZ) == null) {
                    return;
                }
                switch (str2.hashCode()) {
                    case -1459637676:
                        if (!str2.equals("brand_fill_circle")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.BRAND_FILL_CIRCLE);
                        return;
                    case -1380923296:
                        if (!str2.equals("breath")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.BREATH);
                        return;
                    case -1001078227:
                        if (!str2.equals("progress")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.PRORGRESS);
                        return;
                    case -923427188:
                        if (!str2.equals("gray_ring")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.GRAY_RING);
                        return;
                    case -785375970:
                        if (!str2.equals("red_ring")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.RED_RING);
                        return;
                    case 3392903:
                        if (!str2.equals("null")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.NONE);
                        return;
                    case 1374352360:
                        if (!str2.equals("brand_ring")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.BRAND_RING);
                        return;
                    case 1390514227:
                        if (!str2.equals("version2_background")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.VERSION2_BACKGROUND);
                        return;
                    case 1639822566:
                        if (!str2.equals("brand_background")) {
                            return;
                        }
                        c53700L5s.setMode(EnumC53701L5t.BRAND_BACKGROUND);
                        return;
                    default:
                        return;
                }
            case 2121631558:
                if (!str.equals("app:background_alpha")) {
                    return;
                }
                String str4 = aVar.LIZ;
                o.LJIIIIZZ(str4, "value.value");
                Float LJJIJLIJ = C38350F3i.LJJIJLIJ(str4);
                if (LJJIJLIJ != null) {
                    f = LJJIJLIJ.floatValue();
                } else {
                    f = 1.0f;
                }
                c53700L5s.setBackgroundAlpha(f);
                return;
            default:
                return;
        }
    }
}
