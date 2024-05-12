package X;

import com.benchmark.collection.service.ByteBenchProcessInterface;
import java.util.concurrent.Callable;

/* loaded from: classes19.dex */
public final class ZUB implements Callable<Void> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ZUU LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Void call() {
        int i;
        ZTV ztv = this.LJLILLLLZI.LIZIZ;
        String str = this.LJLIL;
        ByteBenchProcessInterface byteBenchProcessInterface = ztv.LJFF;
        if (byteBenchProcessInterface == null || str == null) {
            i = -100;
        } else {
            i = byteBenchProcessInterface.loadByteBench(str);
        }
        if (i == 0) {
            this.LJLILLLLZI.LIZ.LIZIZ(103, "load Task success");
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mProcess.loadByteBench failed: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILL("BytebenchV2");
        this.LJLILLLLZI.LIZ.LIZ(103, i, "loadBytebenchToNative failed");
        return null;
    }

    public ZUB(ZUU zuu, String str) {
        this.LJLILLLLZI = zuu;
        this.LJLIL = str;
    }
}
