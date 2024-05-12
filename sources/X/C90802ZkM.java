package X;

import Y.IDRunnableS86S0100000_24;
import com.byted.cast.common.config.IConfigListener;
import com.byted.cast.common.config.IInitListener;

/* renamed from: X.ZkM, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90802ZkM implements IConfigListener {
    public final /* synthetic */ IInitListener LIZ;
    public final /* synthetic */ C90801ZkL LIZIZ;

    @Override // com.byted.cast.common.config.IConfigListener
    public final void onFetchResult() {
        this.LIZIZ.LJIJJ.execute(new IDRunnableS86S0100000_24(this, 18));
    }

    public C90802ZkM(C90801ZkL c90801ZkL, IInitListener iInitListener) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = iInitListener;
    }
}
