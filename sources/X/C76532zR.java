package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.2zR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76532zR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String enterFrom) {
        boolean LJ;
        String str;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (context == null) {
            LJ = false;
        } else {
            LJ = C48203Ivv.LJ(context);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        if (LJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_success", str);
        FMX.LJIIL("relation_list_retry_refresh", c188727au.LIZ);
    }
}
