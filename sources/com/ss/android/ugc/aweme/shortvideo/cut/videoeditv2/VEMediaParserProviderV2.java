package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import X.C10H;
import X.C10K;
import X.C16880lQ;
import X.C221108m2;
import X.C36581c6;
import X.C42345Gjd;
import X.C60903NvH;
import X.C62822Ol8;
import X.C72242sW;
import X.C84386X9y;
import X.InterfaceC42346Gje;
import X.KMP;
import X.RunnableC42349Gjh;
import X.SFS;
import Y.ACallableS110S0100000_7;
import Y.ACallableS34S1100000_7;
import Y.AgS124S0100000_7;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.vesdk.VEMediaParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public final class VEMediaParserProviderV2 implements GenericLifecycleObserver {
    public boolean LJLIL;
    public final Map<String, VEMediaParser> LJLILLLLZI;
    public final ExecutorService LJLJI;
    public final List<C10H> LJLJJI;
    public final List<C10K<Bitmap>> LJLJJL;
    public final List<Long> LJLJJLL;
    public final C62822Ol8 LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            releaseFrames();
        }
    }

    public final void LIZ() {
        Iterator<C10H> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        ((ArrayList) this.LJLJJI).clear();
        ((ArrayList) this.LJLJJL).clear();
    }

    public final void LIZLLL() {
        C10K.LJIJJLI(this.LJLJJL).LJ(new AgS124S0100000_7(this, 9), C10K.LJI, null);
        ((ArrayList) this.LJLJJL).clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void releaseFrames() {
        C10K.LIZJ(new ACallableS110S0100000_7(this, 11));
    }

    public VEMediaParserProviderV2(Context context, Lifecycle lifecycle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJI = C16880lQ.LLLLZLLIL();
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(context, 201));
        this.LJLJLJ = SFS.LJI(56.0d);
        this.LJLJLLL = SFS.LJI(56.0d);
        C60903NvH.LJIIJJI().LJIJ();
        lifecycle.addObserver(this);
    }

    public final void LIZIZ(int i, String str, int i2, InterfaceC42346Gje interfaceC42346Gje) {
        LIZJ(i, str, i2, interfaceC42346Gje, true);
    }

    public final void LIZJ(int i, String str, int i2, InterfaceC42346Gje interfaceC42346Gje, boolean z) {
        C10K c10k;
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = -1L;
        String LJ = KMP.LJ(str, i2);
        if (((C84386X9y) this.LJLJL.getValue()).LIZLLL(LJ)) {
            c10k = C10K.LIZJ(new ACallableS34S1100000_7(this, LJ, 6));
            o.LJIIIIZZ(c10k, "private fun getBitmapFro…ey)?.data\n        }\n    }");
        } else {
            c72242sW.element = System.currentTimeMillis();
            C10H c10h = new C10H();
            ((ArrayList) this.LJLJJI).add(c10h);
            C36581c6 LIZIZ = c10h.LIZIZ();
            int i3 = this.LJLJLLL;
            n nVar = new n();
            this.LJLJI.execute(new RunnableC42349Gjh(LIZIZ, nVar, str, i3, this, i2, LJ));
            c10k = nVar.LIZ;
            o.LJIIIIZZ(c10k, "tcs.task");
            ((ArrayList) this.LJLJJL).add(c10k);
        }
        c10k.LJ(new C42345Gjd(z, this, i, str, i2, interfaceC42346Gje, c72242sW), C10K.LJIIIIZZ, null);
    }
}
