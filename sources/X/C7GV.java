package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7GV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GV {
    public static final float LIZ = C32151Nz.LJIIZILJ(Integer.valueOf(UserLevelGeckoUpdateSetting.DEFAULT));

    public static void LIZ(int i, View view) {
        if (view == null || !C87026YDm.LIZIZ() || !C87026YDm.LIZIZ()) {
            return;
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.l2);
        c110614Vt.LIZJ = C61328O5c.LIZJ(i);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        view.setBackground(c110614Vt.LIZ(context));
    }
}
