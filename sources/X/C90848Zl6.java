package X;

import Y.IDRunnableS86S0100000_24;
import com.byted.cast.common.config.IConfigListener;
import com.byted.cast.common.config.IInitListener;

/* renamed from: X.Zl6, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90848Zl6 implements IConfigListener {
    public final /* synthetic */ IInitListener LIZ;
    public final /* synthetic */ C90547ZgF LIZIZ;

    @Override // com.byted.cast.common.config.IConfigListener
    public final void onFetchResult() {
        this.LIZIZ.LJIIL.execute(new IDRunnableS86S0100000_24(this, 40));
    }

    public C90848Zl6(C90547ZgF c90547ZgF, IInitListener iInitListener) {
        this.LIZIZ = c90547ZgF;
        this.LIZ = iInitListener;
    }
}
