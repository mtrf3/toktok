package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.PaintingContext;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.VEj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC79405VEj implements Runnable {
    public final /* synthetic */ Future LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ReadableMap LJLJJI;
    public final /* synthetic */ ReadableArray LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ PaintingContext LJLJL;

    public final void LIZ() {
        PaintingContext paintingContext = this.LJLJL;
        Future future = this.LJLIL;
        int i = this.LJLILLLLZI;
        String str = this.LJLJI;
        ReadableMap readableMap = this.LJLJJI;
        ReadableArray readableArray = this.LJLJJL;
        boolean z = this.LJLJJLL;
        paintingContext.getClass();
        if (!future.isDone()) {
            future.cancel(true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createViewAsync not done, will create on ui thread, tagName:");
            LIZ.append(str);
            LLog.LIZLLL(2, "lynx_PaintingContext", X1D.LIZIZ(LIZ));
        } else {
            try {
                Runnable runnable = (Runnable) future.get();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
            } catch (InterruptedException | ExecutionException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("createViewAsync failed, tagName:");
                LIZ2.append(str);
                LIZ2.append(", error:");
                LIZ2.append(e);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                LLog.LIZLLL(4, "lynx_PaintingContext", LIZIZ);
                paintingContext.LIZ.LIZJ.handleException(new Exception(LIZIZ));
            }
        }
        paintingContext.LIZ(i, str, readableMap, readableArray, z);
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

    public RunnableC79405VEj(PaintingContext paintingContext, Future future, int i, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        this.LJLJL = paintingContext;
        this.LJLIL = future;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = readableMap;
        this.LJLJJL = readableArray;
        this.LJLJJLL = z;
    }
}
