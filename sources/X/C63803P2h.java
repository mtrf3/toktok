package X;

import kotlin.jvm.internal.o;

/* renamed from: X.P2h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63803P2h {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String enterFrom, long j, AbstractC72932td requestState, int i) {
        String str;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(requestState, "requestState");
        if (requestState instanceof C33X) {
            str = "begin";
        } else if (requestState instanceof C3C1) {
            str = "fail";
        } else if (requestState instanceof C72912tb) {
            if (((Boolean) ((C72912tb) requestState).LIZ).booleanValue()) {
                str = "empty";
            } else {
                str = "success";
            }
        } else {
            str = "";
        }
        if (i > 1) {
            str = "intercept";
        }
        String valueOf = String.valueOf(System.currentTimeMillis() - j);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("status", str);
        c188727au.LJIIIZ("duration", valueOf);
        FMX.LJIIL("page_search_monitor", c188727au.LIZ);
    }
}
