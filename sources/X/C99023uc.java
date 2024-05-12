package X;

import Y.IDHandlerS14S0100000_1;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMChatExt;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99023uc {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final IIMService LIZLLL;
    public IMUser LJ;

    public final void LIZ() {
        if (this.LJ == null) {
            return;
        }
        IMChatExt iMChatExt = new IMChatExt();
        iMChatExt.ext = this.LIZJ;
        C98593tv c98593tv = new C98593tv(this.LIZ, this.LJ);
        c98593tv.setImAdLog(c98593tv.getImAdLog());
        c98593tv.setChatExt(iMChatExt);
        if (o.LJ(this.LIZJ, "click_dm_invitation")) {
            c98593tv.setEnterFromForMob("link");
            c98593tv.setEnterMethodForMob("click_dm_invitation");
        }
        this.LIZLLL.getImChatService().LJFF(c98593tv);
    }

    public final void LIZIZ() {
        String str = this.LIZIZ;
        if (str == null || str.length() == 0) {
            return;
        }
        Z8A.LIZIZ.queryProfileWithId(new IDHandlerS14S0100000_1(this, C16880lQ.LLJJJJ(), 1), this.LIZIZ, 0);
    }

    public C99023uc(Context ctx, String str, String str2) {
        o.LJIIIZ(ctx, "ctx");
        this.LIZ = ctx;
        this.LIZIZ = str;
        this.LIZJ = str2;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        this.LIZLLL = createIIMServicebyMonsterPlugin;
    }
}
