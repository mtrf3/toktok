package X;

import com.byted.cast.common.Logger;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.network.NetworkBehaviorData;

/* renamed from: X.Zl3, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90845Zl3 implements IInitListener {
    public final /* synthetic */ C90846Zl4 LIZ;

    @Override // com.byted.cast.common.config.IInitListener
    public final void onSuccess() {
        Logger.i("ByteCastSinkImpl", "onInitial success:  true");
        this.LIZ.LIZ.LJIIJJI();
        NetworkBehaviorData networkBehaviorData = this.LIZ.LIZ.LJJIJ;
        if (networkBehaviorData != null && networkBehaviorData.getListener() != null) {
            this.LIZ.LIZ.LJJIJ.getListener().onSuccess();
        }
    }

    public C90845Zl3(C90846Zl4 c90846Zl4) {
        this.LIZ = c90846Zl4;
    }

    @Override // com.byted.cast.common.config.IInitListener
    public final void onFail(int i, String str, Exception exc) {
        Logger.i("ByteCastSinkImpl", "onInitial success:  false");
        NetworkBehaviorData networkBehaviorData = this.LIZ.LIZ.LJJIJ;
        if (networkBehaviorData != null && networkBehaviorData.getListener() != null) {
            this.LIZ.LIZ.LJJIJ.getListener().onFail(i, str, exc);
        }
    }
}
