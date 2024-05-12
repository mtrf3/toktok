package X;

import com.byted.cast.common.config.IInitListener;

/* renamed from: X.ZkF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90795ZkF implements IInitListener {
    public final /* synthetic */ C90801ZkL LIZ;

    @Override // com.byted.cast.common.config.IInitListener
    public final void onSuccess() {
        this.LIZ.LIZIZ.d("ByteCastSourceImpl", "lelink bind success");
        C90801ZkL.LJJLI = true;
    }

    public C90795ZkF(C90801ZkL c90801ZkL) {
        this.LIZ = c90801ZkL;
    }

    @Override // com.byted.cast.common.config.IInitListener
    public final void onFail(int i, String str, Exception exc) {
        this.LIZ.LIZIZ.d("ByteCastSourceImpl", "lelink bind failed");
        C90801ZkL.LJJLI = false;
    }
}
