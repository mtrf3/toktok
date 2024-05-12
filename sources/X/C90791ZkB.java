package X;

import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.network.NetworkBehaviorData;

/* renamed from: X.ZkB, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90791ZkB implements IInitListener {
    public final /* synthetic */ C90792ZkC LIZ;

    @Override // com.byted.cast.common.config.IInitListener
    public final void onSuccess() {
        this.LIZ.LIZ.LIZIZ.i("ByteCastSourceImpl", "onInitial success");
        this.LIZ.LIZ.stopServer();
        NetworkBehaviorData networkBehaviorData = this.LIZ.LIZ.LJJJJI;
        if (networkBehaviorData != null && networkBehaviorData.getListener() != null) {
            this.LIZ.LIZ.LJJJJI.getListener().onSuccess();
        }
        ICastSource iCastSource = this.LIZ.LIZ.LJ;
        if (iCastSource != null) {
            iCastSource.onNetworkChangeReady();
        }
    }

    public C90791ZkB(C90792ZkC c90792ZkC) {
        this.LIZ = c90792ZkC;
    }

    @Override // com.byted.cast.common.config.IInitListener
    public final void onFail(int i, String str, Exception exc) {
        this.LIZ.LIZ.LIZIZ.i("ByteCastSourceImpl", "onInitial failed");
        NetworkBehaviorData networkBehaviorData = this.LIZ.LIZ.LJJJJI;
        if (networkBehaviorData != null && networkBehaviorData.getListener() != null) {
            this.LIZ.LIZ.LJJJJI.getListener().onFail(i, str, exc);
        }
    }
}
