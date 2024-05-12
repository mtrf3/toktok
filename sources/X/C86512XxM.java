package X;

import android.view.View;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.XxM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86512XxM {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;

    public static boolean LIZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        if (message.getProtocol() == 1 && message.getVersion() <= 2 && message.getId() > 0) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(View... viewArr) {
        if (viewArr.length == 0) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public static String LIZJ(Object obj) {
        try {
            return JsonParseUtils.LIZLLL(obj);
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                C86496Xx6.LJIIIIZZ(null, "object_to_json", LJFF.getMessage());
            }
            return null;
        }
    }
}
