package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Xr5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86123Xr5 extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC86124Xr6, ActivityC86117Xqz, C76800UCe, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Intent LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86123Xr5(int i, int i2, Intent intent) {
        super(3);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = intent;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC86124Xr6 interfaceC86124Xr6, ActivityC86117Xqz activityC86117Xqz, C76800UCe c76800UCe) {
        InterfaceC86124Xr6 checkAndExecute = interfaceC86124Xr6;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(activityC86117Xqz, "<anonymous parameter 0>");
        checkAndExecute.onActivityResult(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
