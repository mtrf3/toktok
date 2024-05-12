package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.dsp.v2.TTDspActivityV2;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Zrh, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91257Zrh {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        if (activity instanceof TTDspActivityV2) {
            return true;
        }
        L41.LIZ.getClass();
        if (L41.LIZLLL()) {
            return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activity);
        }
        return false;
    }

    public static C47164IfA LIZJ(String string) {
        boolean z;
        o.LJIIIZ(string, "string");
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            C47164IfA c47164IfA = new C47164IfA();
            C47163If9 c47163If9 = new C47163If9();
            c47163If9.LIZJ(new JSONObject(string));
            c47164IfA.LJJIJIIJI(c47163If9);
            return c47164IfA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void LIZ(Activity activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        if (z) {
            C27740Aue.LJIIIIZZ(activity);
            C244389iU.LIZ(activity);
            LTT.LIZJ(activity);
        } else {
            C27740Aue.LJIIIIZZ(activity);
            C27740Aue.LJII(activity);
            LTT.LJ(activity);
        }
    }
}
