package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xr7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86125Xr7 extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC86124Xr6, ActivityC86117Xqz, C76800UCe, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86125Xr7(boolean z) {
        super(3);
        this.LJLIL = z;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC86124Xr6 interfaceC86124Xr6, ActivityC86117Xqz activityC86117Xqz, C76800UCe c76800UCe) {
        InterfaceC86124Xr6 checkAndExecute = interfaceC86124Xr6;
        ActivityC86117Xqz baseActivity = activityC86117Xqz;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseActivity, "baseActivity");
        checkAndExecute.onWindowFocusChanged(baseActivity, this.LJLIL);
        return C76800UCe.LIZ;
    }
}
