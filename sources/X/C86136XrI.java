package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XrI, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86136XrI extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC86124Xr6, ActivityC86117Xqz, C76800UCe, C76800UCe> {
    public static final C86136XrI LJLIL = new C86136XrI();

    public C86136XrI() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC86124Xr6 interfaceC86124Xr6, ActivityC86117Xqz activityC86117Xqz, C76800UCe c76800UCe) {
        InterfaceC86124Xr6 checkAndExecute = interfaceC86124Xr6;
        ActivityC86117Xqz baseActivity = activityC86117Xqz;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onSupportContentChanged(baseActivity);
        return C76800UCe.LIZ;
    }
}
