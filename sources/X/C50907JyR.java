package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bullet.bridge.common.LaunchChatMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* renamed from: X.JyR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50907JyR implements JJ4 {
    public final /* synthetic */ LaunchChatMethod LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ IMUser LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ InterfaceC37146Ehy LJ;

    public C50907JyR(LaunchChatMethod launchChatMethod, Context context, IMUser iMUser, int i, InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LIZ = launchChatMethod;
        this.LIZIZ = context;
        this.LIZJ = iMUser;
        this.LIZLLL = i;
        this.LJ = interfaceC37146Ehy;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        LaunchChatMethod launchChatMethod = this.LIZ;
        Context context = this.LIZIZ;
        IMUser iMUser = this.LIZJ;
        int i = this.LIZLLL;
        launchChatMethod.getClass();
        if (context == null) {
            this.LJ.LIZ(0, "open chat fail");
            return;
        }
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        C98593tv c98593tv = new C98593tv(context, iMUser);
        c98593tv.setEnterFrom(i);
        imChatService.LJFF(c98593tv);
        this.LJ.onSuccess(1);
    }
}
