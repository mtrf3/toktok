package com.ss.android.ugc.aweme.shortvideo.util;

import X.C42531Gmd;
import X.C81392Vwy;
import X.C81810W8w;
import X.InterfaceC42533Gmf;
import X.InterfaceC42534Gmg;
import X.RunnableC45731Hx9;
import X.V85;
import X.V91;
import X.W8E;
import X.X1D;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import defpackage.i0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoCoverCacheImpl implements GenericLifecycleObserver, InterfaceC42533Gmf {
    public final String LJLIL;
    public boolean LJLILLLLZI;
    public final PThreadPoolExecutor LJLJI;
    public final Map<Integer, InterfaceC42534Gmg> LJLJJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLILLLLZI = true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC42533Gmf
    public final void LIZ(int i, C42531Gmd c42531Gmd) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(i);
        String key = X1D.LIZIZ(LIZ);
        o.LJIIIZ(key, "key");
        C81392Vwy LJFF = W8E.LJII().LIZJ().LJFF(new V91(i0.LJFF("file://", key), null, V85.LIZJ, C81810W8w.LJIILIIL, null, null, null));
        if (LJFF != null) {
            c42531Gmd.LIZ(LJFF.clone());
            C81392Vwy.LJ(LJFF);
        } else {
            ((ConcurrentHashMap) this.LJLJJI).put(Integer.valueOf(i), c42531Gmd);
        }
    }

    public VideoCoverCacheImpl(LifecycleOwner owner, String videoPath, int i, int i2, int i3, float f) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(videoPath, "videoPath");
        this.LJLILLLLZI = true;
        this.LJLJJI = new ConcurrentHashMap();
        this.LJLIL = videoPath;
        owner.getLifecycle().addObserver(this);
        float f2 = 1000 * f;
        if (f2 > 0.0f) {
            int i4 = (int) (i3 / f2);
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                iArr[i5] = (int) (i5 * f2);
            }
            PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("VideoCoverCacheImpl"), new ThreadPoolExecutor.DiscardOldestPolicy());
            this.LJLJI = pThreadPoolExecutor;
            pThreadPoolExecutor.execute(new RunnableC45731Hx9(videoPath, iArr, i, i2, this));
        }
    }
}
