package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SLr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71951SLr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String accountType, boolean z) {
        String str;
        o.LJIIIZ(accountType, "accountType");
        C72028SOq LIZ2 = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("account_type", accountType);
        if (z) {
            str = "ok";
        } else {
            str = "cancel";
        }
        c71969SMj.LIZIZ("result", str);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "newBuilder()\n           …               .builder()", LIZ2, "account_auth_pop_up_confirm", map);
    }
}
