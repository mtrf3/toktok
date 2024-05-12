package X;

import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;

/* renamed from: X.Pag, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64722Pag extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        try {
            C64734Pas.LJIIIZ(TTNetInit.getTTNetDepend().getContext()).LJIIJJI(this.LJLJJL);
            ClientKeyManager.LJFF().LIZ(this.LJLJJL);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64722Pag(String str) {
        super((Object) null);
        this.LJLJJL = str;
    }
}
