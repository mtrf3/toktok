package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.0Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC08850Wj implements Runnable {
    public DataChannel LJLIL;
    public LiveEffect LJLILLLLZI;
    public String LJLJI = "";
    public int LJLJJI;
    public C08840Wi LJLJJL;

    public final void LIZ() {
        LiveEffect liveEffect = this.LJLILLLLZI;
        if (liveEffect != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_guest_connection_sticker_effective_use");
            LIZ.LJIILLIIL(this.LJLIL);
            C32031Nn.LJIIL(LIZ, liveEffect);
            LIZ.LJIJI(false);
            C32031Nn.LJIIJJI(LIZ, liveEffect, this.LJLJJL);
            LIZ.LJII(C50361yK.LJLIL);
            LIZ.LJIJJ(Integer.valueOf(this.LJLJJI), "is_connection_default");
            LIZ.LJIJJ(this.LJLJI, "event_page");
            LIZ.LJJIIZI();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
