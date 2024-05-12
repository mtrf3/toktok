package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CSS extends AbstractC31385CTl {
    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public final void LJJIIZI() {
    }

    @Override // X.AbstractC31385CTl
    public final void LJJIL() {
    }

    @Override // X.CRC, X.CR8
    public final void LJIIZILJ(long j, CRD model) {
        o.LJIIIZ(model, "model");
        model.LJJJJ();
    }

    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public final void LJIJJ(long j, CRD model) {
        o.LJIIIZ(model, "model");
        super.LJIJJ(j, model);
        if (model.LJJIFFI().LIZ == 1) {
            model.LJJJJ();
        }
    }

    @Override // X.AbstractC31385CTl, X.CR8
    public final void LJJIJ(CRD model, boolean z) {
        o.LJIIIZ(model, "model");
        super.LJJIJ(model, z);
        model.LJJJJ();
    }

    @Override // X.AbstractC31385CTl, X.CR8
    public final void LJJ(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, boolean z, User user, boolean z2) {
        o.LJIIIZ(message, "message");
        super.LJJ(message, abstractC31313CQr, z, user, z2);
        abstractC31313CQr.LJFF(LJJIJIIJIL(), message);
    }

    @Override // X.CRC, X.CR8
    public final void LJJII(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, long j, boolean z, User user) {
        o.LJIIIZ(message, "message");
        abstractC31313CQr.LJFF(LJJIJIIJIL(), message);
    }
}
