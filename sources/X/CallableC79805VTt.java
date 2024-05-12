package X;

import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.VTt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC79805VTt<V> implements Callable<C0GQ<String>> {
    public final /* synthetic */ LynxBytedLottieView LJLIL;
    public final /* synthetic */ ReadableMap LJLILLLLZI;
    public final /* synthetic */ C0GV LJLJI;
    public final /* synthetic */ C0GY LJLJJI;

    public CallableC79805VTt(LynxBytedLottieView lynxBytedLottieView, ReadableMap readableMap, C79803VTr c79803VTr, C0GY c0gy) {
        this.LJLIL = lynxBytedLottieView;
        this.LJLILLLLZI = readableMap;
        this.LJLJI = c79803VTr;
        this.LJLJJI = c0gy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    @Override // java.util.concurrent.Callable
    public final C0GQ<String> call() {
        ReadableMapKeySetIterator keySetIterator = this.LJLILLLLZI.keySetIterator();
        HashMap hashMap = new HashMap();
        if (this.LJLILLLLZI.size() == 0) {
            this.LJLJI.onSuccess("");
            return new C0GQ<>("");
        }
        AtomicInteger atomicInteger = new AtomicInteger(this.LJLILLLLZI.size());
        while (keySetIterator.hasNextKey()) {
            String key = keySetIterator.nextKey();
            String string = this.LJLILLLLZI.getString(key);
            C04750Gp c04750Gp = this.LJLJJI.LIZLLL.get(key);
            if (c04750Gp != null) {
                C68322mC c68322mC = new C68322mC();
                StringBuilder LIZ = X1D.LIZ();
                ?? LJFF = JBR.LJFF(LIZ, c04750Gp.LJ, string, LIZ);
                c68322mC.element = LJFF;
                LynxBytedLottieView lynxBytedLottieView = this.LJLIL;
                String LJJIIJ = lynxBytedLottieView.LJJIIJ(LJFF);
                o.LJFF(key, "key");
                lynxBytedLottieView.LJJIIJZLJL(LJJIIJ, key, c04750Gp, new C79807VTv(c68322mC, this, hashMap, atomicInteger));
            }
        }
        return new C0GQ<>("");
    }
}
