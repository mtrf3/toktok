package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C10K;
import X.C16880lQ;
import X.C1AU;
import X.C221108m2;
import X.C29S;
import X.C45730Hx8;
import X.C62822Ol8;
import X.C74275TDb;
import X.C84386X9y;
import X.InterfaceC45734HxC;
import X.KMP;
import X.RunnableC42351Gjj;
import X.WF6;
import Y.ACallableS110S0100000_7;
import Y.ACallableS34S1100000_7;
import Y.ARunnableS2S2201000_7;
import Y.ARunnableS8S1100000_7;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.vesdk.VEMediaParser;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public final class VEMediaParserFrameProviderImpl implements GenericLifecycleObserver, WF6 {
    public boolean LJLIL;
    public final Map<String, VEMediaParser> LJLILLLLZI;
    public final ExecutorService LJLJI;
    public int LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Context LJLJJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            releaseFrames();
        }
    }

    @Override // X.WF6
    public final void LIZLLL() {
        this.LJLJI.submit(new RunnableC42351Gjj(this));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void releaseFrames() {
        C10K.LIZJ(new ACallableS110S0100000_7(this, 10));
    }

    public VEMediaParserFrameProviderImpl(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJLL = context;
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJI = C16880lQ.LLLLZLLIL();
        this.LJLJJI = (int) C74275TDb.LIZIZ(context, 60.0f);
        this.LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 200));
        if (context instanceof C29S) {
            ((C1AU) context).getLifecycle().addObserver(this);
        }
    }

    @Override // X.WF6
    public final void LIZIZ(int i) {
        this.LJLJJI = i;
    }

    @Override // X.WF6
    public final void LIZJ(String path) {
        o.LJIIIZ(path, "path");
        this.LJLJI.submit(new ARunnableS8S1100000_7(this, path, 2));
    }

    @Override // X.WF6
    public final void LIZ(int i, String path, int i2, InterfaceC45734HxC interfaceC45734HxC) {
        o.LJIIIZ(path, "path");
        LJ(i, path, i2, interfaceC45734HxC, true);
    }

    public final void LJ(int i, String str, int i2, InterfaceC45734HxC interfaceC45734HxC, boolean z) {
        C10K c10k;
        String str2 = str;
        int i3 = i2;
        String LJ = KMP.LJ(str2, i3);
        VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl = this;
        if (((C84386X9y) vEMediaParserFrameProviderImpl.LJLJJL.getValue()).LIZLLL(LJ)) {
            c10k = C10K.LIZJ(new ACallableS34S1100000_7(vEMediaParserFrameProviderImpl, LJ, 3));
            o.LJIIIIZZ(c10k, "Task.callInBackground {\n…cacheKey)?.data\n        }");
        } else {
            n nVar = new n();
            ExecutorService executorService = vEMediaParserFrameProviderImpl.LJLJI;
            vEMediaParserFrameProviderImpl = vEMediaParserFrameProviderImpl;
            str2 = str2;
            i3 = i3;
            executorService.execute(new ARunnableS2S2201000_7(vEMediaParserFrameProviderImpl, LJ, nVar, str2, i3, 0));
            c10k = nVar.LIZ;
            o.LJIIIIZZ(c10k, "tcs.task");
        }
        c10k.LJ(new C45730Hx8(vEMediaParserFrameProviderImpl, z, i, str2, i3, interfaceC45734HxC), C10K.LJIIIIZZ, null);
    }
}
