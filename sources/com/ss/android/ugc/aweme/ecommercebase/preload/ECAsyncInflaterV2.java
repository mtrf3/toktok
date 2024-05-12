package com.ss.android.ugc.aweme.ecommercebase.preload;

import X.L9O;
import X.L9R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ECAsyncInflaterV2 implements LifecycleEventObserver {
    public static final ConcurrentHashMap<Context, ECAsyncInflaterV2> LJLJJLL = new ConcurrentHashMap<>();
    public final Activity LJLIL;
    public final ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> LJLILLLLZI;
    public final ConcurrentHashMap<Integer, Integer> LJLJI;
    public boolean LJLJJI;
    public L9R LJLJJL;

    public ECAsyncInflaterV2(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = new ConcurrentHashMap<>();
        this.LJLJI = new ConcurrentHashMap<>();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Activity activity = this.LJLIL;
            o.LJIIIZ(activity, "activity");
            L9O.LIZIZ();
            ECAsyncInflaterV2 remove = LJLJJLL.remove(activity);
            if (remove == null) {
                return;
            }
            remove.LJLJJI = true;
            ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> concurrentHashMap = remove.LJLILLLLZI;
            if (concurrentHashMap == null) {
                return;
            }
            concurrentHashMap.clear();
        }
    }
}
