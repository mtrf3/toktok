package X;

import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* loaded from: classes16.dex */
public final class YMG implements InterfaceC73916Szg {
    public final /* synthetic */ IMessageManager LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C64972Pei LIZJ;

    @Override // X.InterfaceC73916Szg
    public final void LIZ(C73914Sze c73914Sze) {
        this.LIZ.sendRequest(this.LIZIZ, this.LIZJ, new YMD(c73914Sze));
    }

    public YMG(IMessageManager iMessageManager, long j, C64972Pei c64972Pei) {
        this.LIZ = iMessageManager;
        this.LIZIZ = j;
        this.LIZJ = c64972Pei;
    }
}
