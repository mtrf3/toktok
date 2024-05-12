package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U8a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76692U8a implements InterfaceC76768UAy<JoinRtcChannelResult> {
    public final /* synthetic */ U8H LJLIL;

    public C76692U8a(U8H u8h) {
        this.LJLIL = u8h;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(JoinRtcChannelResult value) {
        o.LJIIIZ(value, "value");
        this.LJLIL.getClass();
        String LJJJ = U8H.LJJJ(1204);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.LJJIJ());
        LIZ.append(":forceJoinRtcChannel onSucceeded try to invalidate sei");
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        if (this.LJLIL.LIZ.LJFF.LJJJ()) {
            U8H u8h = this.LJLIL;
            U8H.LJJLL(u8h, u8h.LJIILLIIL, u8h.LIZ.LJFF.LJJIJIIJIL(), true, 2);
        }
        this.LJLIL.LJJIJIL();
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        this.LJLIL.getClass();
        String LJJJ = U8H.LJJJ(1204);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.LJJIJ());
        LIZ.append(":forceJoinRtcChannel onFailed error = ");
        LIZ.append(error);
        C32014ChO.LIZJ(LJJJ, X1D.LIZIZ(LIZ), null);
    }
}
