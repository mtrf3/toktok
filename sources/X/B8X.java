package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveAnimationDegradeSettings;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B8X {
    public static B8Y LIZ(ViewGroup viewGroup, C80797VnN c80797VnN) {
        if (viewGroup == null || viewGroup.getContext() == null) {
            return null;
        }
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "vg.context");
        B8Y b8y = new B8Y(context, c80797VnN);
        viewGroup.addView(b8y, -1, -1);
        if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            b8y.LJLILLLLZI.LJ();
        }
        b8y.setAlpha(0.0f);
        b8y.animate().alpha(1.0f).setDuration(300L).start();
        HashMap hashMap = new HashMap();
        hashMap.put("strength", B8U.LIZIZ());
        hashMap.put("type", B8U.LIZ);
        String LIZLLL = C28594BKc.LIZJ().LIZLLL();
        o.LJIIIIZZ(LIZLLL, "getInstance().liveDrawerRequestPage");
        hashMap.put("request_page", LIZLLL);
        BZI LIZ = C28787BRn.LIZ("draw_guide_show");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
        return b8y;
    }
}
