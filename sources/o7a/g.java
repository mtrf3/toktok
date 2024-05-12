package o7a;

import X.C71898SJq;
import X.EnumC71803SFz;
import X.EnumC71900SJs;
import X.O6R;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class g {
    public static void LIZ(String str, p8.a aVar, C71898SJq c71898SJq, ViewGroup.LayoutParams layoutParams) {
        String str2;
        String str3;
        switch (str.hashCode()) {
            case -1718316538:
                if (!str.equals("app:tux_shader") || (str3 = aVar.LIZ) == null) {
                    return;
                }
                switch (str3.hashCode()) {
                    case -1965072618:
                        if (!str3.equals("ease_in")) {
                            return;
                        }
                        c71898SJq.setShader(EnumC71900SJs.EASE_IN);
                        return;
                    case -1102672091:
                        if (!str3.equals("linear")) {
                            return;
                        }
                        c71898SJq.setShader(EnumC71900SJs.LINEAR);
                        return;
                    case -787702915:
                        if (!str3.equals("ease_out")) {
                            return;
                        }
                        c71898SJq.setShader(EnumC71900SJs.EASE_OUT);
                        return;
                    case 1065009829:
                        if (!str3.equals("ease_in_out")) {
                            return;
                        }
                        c71898SJq.setShader(EnumC71900SJs.EASE_IN_OUT);
                        return;
                    default:
                        return;
                }
            case -1225922857:
                if (!str.equals("app:tux_shadeColor")) {
                    return;
                }
                Context context = c71898SJq.getContext();
                o.LJIIIIZZ(context, "view.context");
                c71898SJq.setShadeColor(q8.a.LIZIZ(context, aVar));
                return;
            case -1222079336:
                if (!str.equals("app:tux_endShadeOpacity")) {
                    return;
                }
                String str4 = aVar.LIZ;
                o.LJIIIIZZ(str4, "value.value");
                c71898SJq.setEndShadeOpacity(CastFloatProtector.parseFloat(str4));
                return;
            case -470191194:
                if (!str.equals("app:tux_beginShadeOpacity")) {
                    return;
                }
                String str5 = aVar.LIZ;
                o.LJIIIIZZ(str5, "value.value");
                c71898SJq.setBeginShadeOpacity(CastFloatProtector.parseFloat(str5));
                return;
            case 72692886:
                if (!str.equals("app:tux_layerWidth")) {
                    return;
                }
                Context context2 = c71898SJq.getContext();
                o.LJIIIIZZ(context2, "view.context");
                c71898SJq.setLayerWidth(O6R.LJJIIZ(q8.a.LIZJ(context2, aVar)));
                return;
            case 1468971888:
                if (str.equals("app:tux_style") && (str2 = aVar.LIZ) != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -1984141450) {
                        if (hashCode != -938579425) {
                            if (hashCode != 1387629604 || !str2.equals("horizontal")) {
                                return;
                            }
                            c71898SJq.setStyle(EnumC71803SFz.HORIZONTAL);
                            return;
                        }
                        if (!str2.equals("radial")) {
                            return;
                        }
                        c71898SJq.setStyle(EnumC71803SFz.RADIAL);
                        return;
                    }
                    if (!str2.equals("vertical")) {
                        return;
                    }
                    c71898SJq.setStyle(EnumC71803SFz.VERTICAL);
                    return;
                }
                return;
            case 1820484695:
                if (!str.equals("app:tux_layerHeight")) {
                    return;
                }
                Context context3 = c71898SJq.getContext();
                o.LJIIIIZZ(context3, "view.context");
                c71898SJq.setLayerHeight(O6R.LJJIIZ(q8.a.LIZJ(context3, aVar)));
                return;
            default:
                return;
        }
    }
}
