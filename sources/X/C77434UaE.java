package X;

import android.app.Activity;
import android.content.Intent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UaE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77434UaE {
    public static DialogC77438UaI LIZ;

    public static void LIZ(Activity activity, Intent intent) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(intent, "intent");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "type");
        if (C29306Beo.LJIJJLI(LLJJIJIIJIL)) {
            C29306Beo.LJJJJ(LIZ);
            C77437UaH c77437UaH = new C77437UaH(activity);
            c77437UaH.LJI(R.string.mdk);
            c77437UaH.LIZIZ(R.string.mdo);
            c77437UaH.LIZJ(R.string.mdp, DialogInterfaceOnClickListenerC77436UaG.LJLIL, false);
            c77437UaH.LJ(R.string.mdm, new DialogInterfaceOnClickListenerC77435UaF(activity, intent, LLJJIJIIJIL), false);
            DialogC77438UaI LIZ2 = c77437UaH.LIZ();
            LIZ = LIZ2;
            C29306Beo.LJJJJIZL(LIZ2);
        }
    }
}
