package o7a;

import X.C71897SJp;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class f {
    public static void LIZ(String str, p8.a aVar, C71897SJp c71897SJp, ViewGroup.LayoutParams layoutParams) {
        switch (str.hashCode()) {
            case -1345082459:
                if (!str.equals("app:tux_checkBoxSize")) {
                    return;
                }
                String str2 = aVar.LIZ;
                if (o.LJ(str2, "small")) {
                    c71897SJp.setSize(0);
                    return;
                } else {
                    if (!o.LJ(str2, "medium")) {
                        return;
                    }
                    c71897SJp.setSize(1);
                    return;
                }
            case 684761017:
                if (!str.equals("app:tux_checkBoxUncheckedColor")) {
                    return;
                }
                Context context = c71897SJp.getContext();
                o.LJIIIIZZ(context, "view.context");
                c71897SJp.setCheckBoxUncheckedColor(q8.a.LIZIZ(context, aVar));
                return;
            case 687998880:
                if (!str.equals("app:tux_checkBoxCheckedColor")) {
                    return;
                }
                Context context2 = c71897SJp.getContext();
                o.LJIIIIZZ(context2, "view.context");
                c71897SJp.setCheckBoxCheckedColor(q8.a.LIZIZ(context2, aVar));
                return;
            case 1252063357:
                if (!str.equals("app:tux_checkBoxShape")) {
                    return;
                }
                String str3 = aVar.LIZ;
                if (o.LJ(str3, "circle")) {
                    c71897SJp.setShape(0);
                    return;
                } else {
                    if (!o.LJ(str3, "square")) {
                        return;
                    }
                    c71897SJp.setShape(1);
                    return;
                }
            default:
                return;
        }
    }
}
