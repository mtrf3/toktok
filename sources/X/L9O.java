package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9O {
    public static boolean LIZIZ() {
        return o.LJ(EF7.LJIILIIL, "local_test");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object, com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    public static void LIZJ(Activity activity, List list) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(list, "list");
        if (!(activity instanceof LifecycleOwner)) {
            return;
        }
        Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
        o.LJIIIIZZ(lifecycle, "activity.lifecycle");
        C68322mC c68322mC = new C68322mC();
        ConcurrentHashMap<Context, ECAsyncInflaterV2> concurrentHashMap = ECAsyncInflaterV2.LJLJJLL;
        ?? r0 = concurrentHashMap.get(activity);
        c68322mC.element = r0;
        if (r0 == 0) {
            ?? eCAsyncInflaterV2 = new ECAsyncInflaterV2(activity);
            c68322mC.element = eCAsyncInflaterV2;
            concurrentHashMap.put(activity, eCAsyncInflaterV2);
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS24S0200000_5(lifecycle, c68322mC, 33));
        }
        ECAsyncInflaterV2 eCAsyncInflaterV22 = (ECAsyncInflaterV2) c68322mC.element;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            eCAsyncInflaterV22.LJLJI.put(osz.getFirst(), osz.getSecond());
        }
        eCAsyncInflaterV22.getClass();
        L90 l90 = new L90(eCAsyncInflaterV22.LJLIL, eCAsyncInflaterV22);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            OSZ osz2 = (OSZ) it2.next();
            int intValue = ((Number) osz2.getFirst()).intValue();
            int intValue2 = ((Number) osz2.getSecond()).intValue();
            ((ArrayList) l90.LIZLLL).add(new OSZ(Integer.valueOf(intValue), Integer.valueOf(intValue2)));
        }
        ECAsyncInflaterV2 eCAsyncInflaterV23 = l90.LIZIZ;
        Object value = l90.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-layoutInflater>(...)");
        eCAsyncInflaterV23.getClass();
        C37190Eig.LIZ.post(new ARunnableS45S0100000_9((Object) new L9P(eCAsyncInflaterV23, l90, new C76732zl(), (LayoutInflater) value), 28));
    }

    public static View LIZ(int i, Context context, ViewGroup viewGroup, boolean z) {
        View layout;
        o.LJIIIZ(context, "context");
        ECAsyncInflaterV2 eCAsyncInflaterV2 = ECAsyncInflaterV2.LJLJJLL.get(context);
        if (eCAsyncInflaterV2 != null) {
            LinkedList<SoftReference<View>> linkedList = eCAsyncInflaterV2.LJLILLLLZI.get(Integer.valueOf(i));
            if (linkedList != null) {
                synchronized (linkedList) {
                    do {
                        SoftReference<View> poll = linkedList.poll();
                        if (poll != null) {
                            layout = poll.get();
                        } else {
                            layout = null;
                        }
                        LIZIZ();
                        if (!(!linkedList.isEmpty())) {
                            break;
                        }
                    } while (layout == null);
                    if (layout != null) {
                        LIZIZ();
                    } else {
                        eCAsyncInflaterV2.LJLILLLLZI.remove(Integer.valueOf(i));
                    }
                }
                if (!z && viewGroup != null) {
                    viewGroup.addView(layout);
                    return layout;
                }
            }
            Integer num = eCAsyncInflaterV2.LJLJI.get(Integer.valueOf(i));
            if (num != null && num.intValue() > 0) {
                eCAsyncInflaterV2.LJLJI.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
            }
            System.currentTimeMillis();
            layout = C16880lQ.LLLLIILL(C16880lQ.LLZIL(eCAsyncInflaterV2.LJLIL), i, new FrameLayout(eCAsyncInflaterV2.LJLIL), false);
            if (LIZIZ()) {
                eCAsyncInflaterV2.LJLIL.getResources().getResourceName(i);
            }
            o.LJIIIIZZ(layout, "layout");
            return !z ? layout : layout;
        }
        LIZIZ();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), i, viewGroup, z);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(la…, parent, attachToParent)");
        return LLLLIILL;
    }
}
