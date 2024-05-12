package X;

import android.content.Context;
import com.ss.android.ugc.aweme.fe.method.LaunchChatMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* renamed from: X.JyQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50906JyQ implements JJ4 {
    public final /* synthetic */ LaunchChatMethod LIZ;
    public final /* synthetic */ IMUser LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ InterfaceC36488ETs LIZLLL;

    public C50906JyQ(LaunchChatMethod launchChatMethod, IMUser iMUser, int i, InterfaceC36488ETs interfaceC36488ETs) {
        this.LIZ = launchChatMethod;
        this.LIZIZ = iMUser;
        this.LIZJ = i;
        this.LIZLLL = interfaceC36488ETs;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        Context actContext = this.LIZ.getActContext();
        IMUser iMUser = this.LIZIZ;
        int i = this.LIZJ;
        if (actContext == null) {
            InterfaceC36488ETs interfaceC36488ETs = this.LIZLLL;
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "open chat fail");
                return;
            }
            return;
        }
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        C98593tv c98593tv = new C98593tv(actContext, iMUser);
        c98593tv.setEnterFrom(i);
        imChatService.LJFF(c98593tv);
        InterfaceC36488ETs interfaceC36488ETs2 = this.LIZLLL;
        if (interfaceC36488ETs2 == null) {
            return;
        }
        interfaceC36488ETs2.onSuccess(1);
    }
}
