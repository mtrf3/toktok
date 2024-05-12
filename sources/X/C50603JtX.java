package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.SearchLaunchChatMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.JtX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50603JtX implements JJ4 {
    public final /* synthetic */ SearchLaunchChatMethod LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ IMUser LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ InterfaceC37146Ehy LJFF;

    public C50603JtX(SearchLaunchChatMethod searchLaunchChatMethod, Context context, IMUser iMUser, String str, String str2, InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LIZ = searchLaunchChatMethod;
        this.LIZIZ = context;
        this.LIZJ = iMUser;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = interfaceC37146Ehy;
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.JJ4
    public final void LIZ() {
        SearchLaunchChatMethod searchLaunchChatMethod = this.LIZ;
        Context context = this.LIZIZ;
        IMUser iMUser = this.LIZJ;
        String enterFrom = this.LIZLLL;
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = this.LJ;
        o.LJIIIIZZ(enterMethod, "enterMethod");
        searchLaunchChatMethod.getClass();
        if (SearchLaunchChatMethod.LIZJ(context, iMUser, enterFrom, enterMethod)) {
            this.LJFF.onSuccess(1);
        } else {
            this.LJFF.LIZ(0, "open chat fail");
        }
    }
}
