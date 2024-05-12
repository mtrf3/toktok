package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XrF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86133XrF extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC86124Xr6, ActivityC86117Xqz, C76800UCe, C76800UCe> {
    public static final C86133XrF LJLIL = new C86133XrF();

    public C86133XrF() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC86124Xr6 interfaceC86124Xr6, ActivityC86117Xqz activityC86117Xqz, C76800UCe c76800UCe) {
        InterfaceC86124Xr6 checkAndExecute = interfaceC86124Xr6;
        ActivityC86117Xqz baseActivity = activityC86117Xqz;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onActivityPreResumed(baseActivity);
        return C76800UCe.LIZ;
    }
}
