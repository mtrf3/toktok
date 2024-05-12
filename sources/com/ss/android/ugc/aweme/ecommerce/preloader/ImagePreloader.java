package com.ss.android.ugc.aweme.ecommerce.preloader;

import X.C10K;
import X.C16880lQ;
import X.C47261Igj;
import X.C71104RvQ;
import X.C71105RvR;
import X.C71106RvS;
import X.C78983UzD;
import X.InterfaceC70568Rmm;
import Y.ACallableS115S0100000_12;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImagePreloader {
    public static long LIZ;
    public static int LIZIZ = 4;
    public static final LinkedList<Queue> LIZJ = new LinkedList<>();
    public static final C71106RvS LIZLLL = new C71106RvS();

    /* loaded from: classes13.dex */
    public static final class Queue extends PriorityQueue<C71104RvQ> implements InterfaceC70568Rmm {
        public boolean LJLIL;
        public final WeakReference<Lifecycle> LJLILLLLZI;

        @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
        public final /* bridge */ int size() {
            return super.size();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Queue(Lifecycle lifecycle) {
            super(16, C71105RvR.LJLIL);
            o.LJIIIZ(lifecycle, "lifecycle");
            this.LJLILLLLZI = new WeakReference<>(lifecycle);
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloader.Queue.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        resume();
                    } else if (event == Lifecycle.Event.ON_PAUSE) {
                        pause();
                    } else if (event == Lifecycle.Event.ON_DESTROY) {
                        destroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void destroy() {
                    Queue.this.clear();
                    ImagePreloader.LIZJ.remove(Queue.this);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public final void pause() {
                    Queue.this.LJLIL = false;
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void resume() {
                    Queue queue = Queue.this;
                    queue.LJLIL = true;
                    if (queue.size() > 0) {
                        ImagePreloader.LIZ();
                    }
                }
            });
        }

        @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof C71104RvQ)) {
                return super.contains(obj);
            }
            return false;
        }

        @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null || (obj instanceof C71104RvQ)) {
                return super.remove(obj);
            }
            return false;
        }

        @Override // X.InterfaceC70568Rmm
        public final void LIZJ(int i, Collection collection) {
            if (ImagePreloader.LIZIZ()) {
                Iterator it = ((ArrayList) collection).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        add(new C71104RvQ(i2 + i, next));
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                ImagePreloader.LIZ();
            }
        }
    }

    public static void LIZ() {
        if (!LIZIZ() || LIZIZ <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        LinkedList<Queue> linkedList = LIZJ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<Queue> it = linkedList.iterator();
        while (it.hasNext()) {
            Queue next = it.next();
            if (next.LJLIL) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (true ^ ((AbstractCollection) next2).isEmpty()) {
                arrayList3.add(next2);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            AbstractQueue abstractQueue = (AbstractQueue) it3.next();
            while (arrayList.size() < LIZIZ && (!abstractQueue.isEmpty())) {
                arrayList.add(((C71104RvQ) abstractQueue.remove()).LIZIZ);
            }
            if (arrayList.size() >= LIZIZ) {
                break;
            }
        }
        LIZIZ -= arrayList.size();
        C10K.LIZ(new ACallableS115S0100000_12(arrayList, 0));
    }

    public static boolean LIZIZ() {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - LIZ >= LivePlayEnforceIntervalSetting.DEFAULT) {
            C78983UzD.LJIIZILJ(new Throwable("Called not in main thread!"));
            LIZ = uptimeMillis;
        }
        return false;
    }
}
