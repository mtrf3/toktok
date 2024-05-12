package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.CTm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31386CTm extends AbstractC31385CTl {
    public long LJJIZ;
    public long LJJJ;
    public long LJJJI;

    @Override // X.AbstractC31385CTl, X.InterfaceC31335CRn
    public void LIZ() {
        super.LIZ();
        this.LJJIZ = System.currentTimeMillis();
    }

    @Override // X.CRC, X.CR8
    public void LJIIZILJ(long j, CRD model) {
        o.LJIIIZ(model, "model");
        if (j == 0) {
            this.LJJJ = System.currentTimeMillis();
        }
    }

    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public void LJIJJ(long j, CRD model) {
        o.LJIIIZ(model, "model");
        super.LJIJJ(j, model);
        if (j == 0) {
            this.LJJJI = System.currentTimeMillis();
        }
    }

    @Override // X.CRC, X.CR8
    public void LJJII(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, long j, boolean z, User user) {
        o.LJIIIZ(message, "message");
        if (j == 0) {
            this.LJJJ = System.currentTimeMillis();
        }
    }
}
