package X;

import com.bytedance.router.SmartRoute;
import kotlin.jvm.internal.o;

/* renamed from: X.8U9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8U9 extends AbstractC65781Prl implements InterfaceC88471Ynr<SmartRoute, String, C76800UCe> {
    public static final C8U9 LJLIL = new C8U9();

    public C8U9() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SmartRoute smartRoute, String str) {
        SmartRoute route = smartRoute;
        String uid = str;
        o.LJIIIZ(route, "route");
        o.LJIIIZ(uid, "uid");
        route.withParam("userid", uid);
        return C76800UCe.LIZ;
    }
}
