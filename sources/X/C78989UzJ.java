package X;

import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.UzJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78989UzJ implements InterfaceC78995UzP {
    public InterfaceC78995UzP LIZ;

    @Override // X.InterfaceC78995UzP
    public final void LIZ(boolean z) {
        InterfaceC78995UzP interfaceC78995UzP = this.LIZ;
        if (interfaceC78995UzP != null) {
            interfaceC78995UzP.LIZ(z);
        }
    }

    @QD3
    public void onEvent(AWX awx) {
        LIZ(BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin());
    }

    @QD3
    public void onEvent(C40393FtF c40393FtF) {
        LIZ(false);
    }
}
