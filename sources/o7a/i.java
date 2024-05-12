package o7a;

import X.O6R;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class i {
    public static void LIZ(String str, p8.a aVar, TuxIconView tuxIconView, ViewGroup.LayoutParams layoutParams) {
        switch (str.hashCode()) {
            case -1754043686:
                if (!str.equals("app:tux_icon")) {
                    return;
                }
                String str2 = aVar.LIZ;
                o.LJIIIIZZ(str2, "type.value");
                tuxIconView.setIconRes(CastIntegerProtector.parseInt(str2));
                return;
            case -697836383:
                if (!str.equals("app:tux_iconHeight")) {
                    return;
                }
                Context context = tuxIconView.getContext();
                o.LJIIIIZZ(context, "view.context");
                tuxIconView.setIconHeight(O6R.LJJIIZ(q8.a.LIZJ(context, aVar)));
                return;
            case -380386150:
                if (!str.equals("app:tux_iconShadow")) {
                    return;
                }
                tuxIconView.LIZIZ(q8.a.LIZ(aVar));
                return;
            case 361903975:
                if (!str.equals("app:tux_tintColor")) {
                    return;
                }
                Context context2 = tuxIconView.getContext();
                o.LJIIIIZZ(context2, "view.context");
                tuxIconView.setTintColor(q8.a.LIZIZ(context2, aVar));
                return;
            case 1931119372:
                if (!str.equals("app:tux_iconWidth")) {
                    return;
                }
                Context context3 = tuxIconView.getContext();
                o.LJIIIIZZ(context3, "view.context");
                tuxIconView.setIconWidth(O6R.LJJIIZ(q8.a.LIZJ(context3, aVar)));
                return;
            default:
                return;
        }
    }
}
