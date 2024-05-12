package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9R implements Runnable {
    public final WeakReference<Context> LJLIL;
    public final WeakReference<java.util.Map<Context, ECAsyncInflaterV2>> LJLILLLLZI;
    public final WeakReference<L90> LJLJI;
    public final WeakReference<ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>>> LJLJJI;

    public final void LIZ() {
        java.util.Map<Context, ECAsyncInflaterV2> map = this.LJLILLLLZI.get();
        Context context = this.LJLIL.get();
        L90 l90 = this.LJLJI.get();
        ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> concurrentHashMap = this.LJLJJI.get();
        if (context != null && map != null) {
            map.remove(context);
        }
        if (l90 != null && concurrentHashMap != null) {
            l90.LIZ(new AqS191S0100000_9(concurrentHashMap, (ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>>) 68));
        }
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

    public L9R(L90 target, Context context, java.util.Map<Context, ECAsyncInflaterV2> contextMap, ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> viewCaches) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(contextMap, "contextMap");
        o.LJIIIZ(viewCaches, "viewCaches");
        this.LJLIL = new WeakReference<>(context);
        this.LJLILLLLZI = new WeakReference<>(contextMap);
        this.LJLJI = new WeakReference<>(target);
        this.LJLJJI = new WeakReference<>(viewCaches);
    }
}
