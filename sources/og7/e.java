package og7;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes13.dex */
public final class e {
    public static void LIZ(String str, a.b bVar, LiveIconView liveIconView, ViewGroup.LayoutParams layoutParams) {
        String LJ = q8.a.LJ(str);
        if (o.LJ(LJ, "iconTint")) {
            Context context = liveIconView.getContext();
            o.LJIIIIZZ(context, "view.context");
            liveIconView.setIconTint(q8.a.LIZIZ(context, bVar));
        } else if (o.LJ(LJ, "icon")) {
            if (o.LJ(bVar.LIZIZ, "attr")) {
                String str2 = bVar.LIZ;
                o.LJIIIIZZ(str2, "type.value");
                liveIconView.setIconAttr(CastIntegerProtector.parseInt(str2));
            } else {
                if (!o.LJ(bVar.LIZIZ, "drawable")) {
                    return;
                }
                String str3 = bVar.LIZ;
                o.LJIIIIZZ(str3, "type.value");
                liveIconView.setIcon(CastIntegerProtector.parseInt(str3));
            }
        }
    }
}
