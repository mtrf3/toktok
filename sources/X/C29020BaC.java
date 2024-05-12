package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.BaC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29020BaC implements C44 {
    public final /* synthetic */ HandlerC29100BbU LIZ;

    public C29020BaC(HandlerC29100BbU handlerC29100BbU) {
        this.LIZ = handlerC29100BbU;
    }

    @Override // X.C44
    public final void onFailed(Throwable th) {
        this.LIZ.LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C44
    public final void LIZ(Boolean bool, C29180Bcm c29180Bcm, BUT but) {
        if (c29180Bcm != 0) {
            try {
                ((C32535Cpn) DataChannelGlobal.LJLJJI.gv0(C29053Baj.class)).LIZ = c29180Bcm;
            } catch (Throwable unused) {
                this.LIZ.LJII();
                return;
            }
        }
        if (but != 0) {
            ((C32535Cpn) DataChannelGlobal.LJLJJI.gv0(C29052Bai.class)).LIZ = but;
        }
        this.LIZ.getClass();
        if (HandlerC29100BbU.LJIIJ(c29180Bcm, but)) {
            this.LIZ.LJI(c29180Bcm, but);
        } else {
            this.LIZ.LJII();
        }
    }
}
