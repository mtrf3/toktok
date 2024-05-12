package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZB implements InterfaceC75414Tik<KickOutResult> {
    public final /* synthetic */ C74843TYx LJLIL;
    public final /* synthetic */ LinkPlayerInfo LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(KickOutResult value) {
        o.LJIIIZ(value, "value");
        TYQ.LIZJ("LinkIn_kickOut_Success");
        C74843TYx c74843TYx = this.LJLIL;
        c74843TYx.getClass();
        this.LJLILLLLZI.LIZLLL = true;
        TZK tzk = c74843TYx.LJLJL;
        if (tzk != null) {
            tzk.LJIILL(this.LJLJI);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th != null) {
            this.LJLIL.logThrowable(th);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("throwable:");
        LIZ.append(th);
        TYQ.LIZLLL("LinkIn_kickOut_Failed", X1D.LIZIZ(LIZ));
        C74843TYx c74843TYx = this.LJLIL;
        c74843TYx.getClass();
        TZK tzk = c74843TYx.LJLJL;
        if (tzk != null) {
            tzk.LJJI(th);
        }
    }

    public TZB(C74843TYx c74843TYx, LinkPlayerInfo linkPlayerInfo, long j) {
        this.LJLIL = c74843TYx;
        this.LJLILLLLZI = linkPlayerInfo;
        this.LJLJI = j;
    }
}
