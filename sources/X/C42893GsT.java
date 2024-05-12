package X;

import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;

/* renamed from: X.GsT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42893GsT implements InterfaceC42587GnX {
    public final /* synthetic */ IAVPublishExtension.Callback LIZ;

    public C42893GsT(IAVPublishExtension.Callback callback) {
        this.LIZ = callback;
    }

    @Override // X.InterfaceC42587GnX
    public final void LIZ(int i, int i2) {
        if (i != 1) {
            if (i == 2) {
                this.LIZ.onECUpdateBC(false);
            }
        } else {
            this.LIZ.onECUpdateBC(true);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            this.LIZ.onECUpdateBO(false);
            return;
        }
        this.LIZ.onECUpdateBO(true);
    }
}
