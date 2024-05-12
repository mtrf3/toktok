package o7a;

import X.O6R;
import X.SY4;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class e {
    public static void LIZ(String str, p8.a aVar, SY4 sy4, ViewGroup.LayoutParams layoutParams) {
        String str2;
        String str3;
        switch (str.hashCode()) {
            case -2143256671:
                if (!str.equals("app:tux_iconEnd")) {
                    return;
                }
                String str4 = aVar.LIZ;
                o.LJIIIIZZ(str4, "type.value");
                sy4.setButtonEndIcon(Integer.valueOf(CastIntegerProtector.parseInt(str4)));
                return;
            case -1909861454:
                if (!str.equals("app:tux_buttonVariant") || (str3 = aVar.LIZ) == null) {
                    return;
                }
                switch (str3.hashCode()) {
                    case -1908079720:
                        if (!str3.equals("const_secondary")) {
                            return;
                        }
                        sy4.setButtonVariant(2);
                        return;
                    case -817598092:
                        if (!str3.equals("secondary")) {
                            return;
                        }
                        sy4.setButtonVariant(1);
                        return;
                    case -314765822:
                        if (!str3.equals("primary")) {
                            return;
                        }
                        sy4.setButtonVariant(0);
                        return;
                    case 3387192:
                        if (!str3.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                            return;
                        }
                        sy4.setButtonVariant(-1);
                        return;
                    case 98331279:
                        if (!str3.equals("ghost")) {
                            return;
                        }
                        sy4.setButtonVariant(4);
                        return;
                    default:
                        return;
                }
            case -697836383:
                if (!str.equals("app:tux_iconHeight")) {
                    return;
                }
                Context context = sy4.getContext();
                o.LJIIIIZZ(context, "view.context");
                sy4.setIconHeight(O6R.LJJIIZ(q8.a.LIZJ(context, aVar)));
                return;
            case 486716404:
                if (!str.equals("app:tux_buttonSize") || (str2 = aVar.LIZ) == null) {
                    return;
                }
                switch (str2.hashCode()) {
                    case -1078030475:
                        if (!str2.equals("medium")) {
                            return;
                        }
                        sy4.setButtonSize(2);
                        return;
                    case 3387192:
                        if (!str2.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                            return;
                        }
                        sy4.setButtonSize(-1);
                        return;
                    case 3560192:
                        if (!str2.equals("tiny")) {
                            return;
                        }
                        sy4.setButtonSize(0);
                        return;
                    case 102742843:
                        if (!str2.equals("large")) {
                            return;
                        }
                        sy4.setButtonSize(3);
                        return;
                    case 109548807:
                        if (!str2.equals("small")) {
                            return;
                        }
                        sy4.setButtonSize(1);
                        return;
                    default:
                        return;
                }
            case 902192320:
                if (!str.equals("app:tux_buttonAutoSizing")) {
                    return;
                }
                sy4.LJJJIL(q8.a.LIZ(aVar));
                return;
            case 1927750056:
                if (!str.equals("app:tux_iconStart")) {
                    return;
                }
                String str5 = aVar.LIZ;
                o.LJIIIIZZ(str5, "type.value");
                sy4.setButtonStartIcon(Integer.valueOf(CastIntegerProtector.parseInt(str5)));
                return;
            case 1931119372:
                if (!str.equals("app:tux_iconWidth")) {
                    return;
                }
                Context context2 = sy4.getContext();
                o.LJIIIIZZ(context2, "view.context");
                sy4.setIconWidth(O6R.LJJIIZ(q8.a.LIZJ(context2, aVar)));
                return;
            default:
                return;
        }
    }
}
