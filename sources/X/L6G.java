package X;

import com.bytedance.router.SmartRoute;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L6G extends AbstractC65781Prl implements InterfaceC88471Ynr<SmartRoute, String, C76800UCe> {
    public static final L6G LJLIL = new L6G();

    public L6G() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SmartRoute smartRoute, String str) {
        SmartRoute route = smartRoute;
        String uid = str;
        o.LJIIIZ(route, "route");
        o.LJIIIZ(uid, "uid");
        route.withParam("id", uid);
        return C76800UCe.LIZ;
    }
}
