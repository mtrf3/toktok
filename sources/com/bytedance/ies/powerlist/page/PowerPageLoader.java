package com.bytedance.ies.powerlist.page;

import X.A2G;
import X.A2H;
import X.A2I;
import X.A2V;
import X.AbstractC72278SYg;
import X.C162476Zf;
import X.C16880lQ;
import X.C221108m2;
import X.C35923E7z;
import X.C57939MoZ;
import X.C61878OQg;
import X.C62822Ol8;
import X.C72242sW;
import X.C72808Sho;
import X.C73411SrX;
import X.C79146V4k;
import X.C84673XKz;
import X.C8BG;
import X.EXZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC70422pa;
import X.MBA;
import X.OSZ;
import X.SIW;
import X.SYS;
import X.SZ0;
import X.SZK;
import X.SZL;
import X.SZM;
import X.SZN;
import X.SZO;
import X.SZP;
import X.SZS;
import X.SZY;
import X.SZZ;
import X.XIF;
import X.XKS;
import X.XKX;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerStub;
import java.util.Collection;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PowerPageLoader<T> implements C8BG<T>, InterfaceC70422pa, LifecycleEventObserver {
    public final AbstractC72278SYg<T> LJLIL;
    public final C72808Sho<InterfaceC57784Mm4> LJLILLLLZI;
    public SZ0 LJLJI;
    public final C84673XKz LJLJJI;
    public C57939MoZ LJLJJL;
    public final XIF LJLJJLL;
    public final C62822Ol8 LJLJL;
    public PowerStub LJLJLJ;
    public OSZ<? extends T, ? extends T> LJLJLLL;
    public final C62822Ol8 LJLL;
    public volatile boolean LJLLI;
    public SZZ LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public SYS LJLLL;
    public C73411SrX LJLLLL;
    public XKS LJLLLLLL;
    public XKS LJLZ;

    public final SZS LJ() {
        return (SZS) this.LJLLJ.getValue();
    }

    public final void LJII() {
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = -1L;
        XKS xks = this.LJLLLLLL;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        XKS xks2 = this.LJLZ;
        if (xks2 != null) {
            xks2.LJJIJIL(null);
        }
        SZP szp = SZP.Refresh;
        LJ().LIZ(SZY.Loading, szp, null);
        XKX.LIZLLL(this, null, null, new SZK(this, szp, c72242sW, null), 3);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return (MBA) this.LJLJL.getValue();
    }

    public final void onDestroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LJLJJI.LIZIZ(null);
        C73411SrX c73411SrX = this.LJLLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        SYS sys = this.LJLLL;
        if (sys != null && (lifecycleOwner = sys.LJLIL) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    @Override // X.C8BG
    public final void refresh() {
        LJII();
    }

    @Override // X.C8BG
    public final void LIZ(T t) {
        LJI(t);
    }

    @Override // X.C8BG
    public final void LIZIZ(T t) {
        LJFF(t);
    }

    @Override // X.C8BG
    public final void LIZJ(SZP type) {
        o.LJIIIZ(type, "type");
        int i = SZO.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LJII();
                return;
            }
            LJFF(null);
            return;
        }
        LJI(null);
    }

    public final void LJFF(T t) {
        XKS xks = this.LJLLLLLL;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        SZP szp = SZP.Prev;
        LJ().LIZ(SZY.Loading, szp, null);
        XKX.LIZLLL(this, null, null, new SZL(this, szp, t, null), 3);
    }

    public final void LJI(T t) {
        XKS xks = this.LJLZ;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        SZP szp = SZP.Next;
        LJ().LIZ(SZY.Loading, szp, null);
        XKX.LIZLLL(this, null, null, new SZM(this, szp, t, null), 3);
    }

    public PowerPageLoader(AbstractC72278SYg<T> abstractC72278SYg, C72808Sho<InterfaceC57784Mm4> state) {
        o.LJIIIZ(state, "state");
        this.LJLIL = abstractC72278SYg;
        this.LJLILLLLZI = state;
        this.LJLJJI = C79146V4k.LJIILIIL();
        this.LJLJJL = abstractC72278SYg.LIZ;
        this.LJLJJLL = EXZ.LIZ;
        this.LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 71));
        this.LJLJLLL = new OSZ<>(null, null);
        this.LJLL = C221108m2.LIZIZ(SIW.INSTANCE);
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 72));
        abstractC72278SYg.onLoad(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C8BG
    public final void LIZLLL(SZP type, A2G<T> result, boolean z) {
        OSZ<? extends T, ? extends T> copy$default;
        Collection<? extends InterfaceC57784Mm4> collection;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(result, "result");
        if (!o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL())) {
            ((Handler) this.LJLL.getValue()).post(new SZN(this, type, result, z));
            return;
        }
        if (z) {
            if (result instanceof A2V) {
                collection = ((A2V) result).LIZLLL;
            } else if (result instanceof A2H) {
                collection = ((A2H) result).LIZIZ;
            } else {
                collection = C61878OQg.INSTANCE;
            }
            int i = SZO.LIZ[type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LJLILLLLZI.LJIILLIIL(collection);
                    }
                } else {
                    this.LJLILLLLZI.LIZLLL(0, collection);
                }
            } else {
                this.LJLILLLLZI.LJ(collection);
            }
        }
        if (result instanceof A2V) {
            int i2 = SZO.LIZ[type.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        A2V a2v = (A2V) result;
                        copy$default = new OSZ<>(a2v.LIZIZ, a2v.LIZJ);
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    copy$default = OSZ.copy$default(this.LJLJLLL, ((A2V) result).LIZIZ, null, 2, null);
                }
            } else {
                copy$default = OSZ.copy$default(this.LJLJLLL, null, ((A2V) result).LIZJ, 1, null);
            }
            this.LJLJLLL = copy$default;
            A2V a2v2 = (A2V) result;
            LJ().LIZ(SZY.Loaded, type, new C35923E7z(a2v2.LIZIZ, a2v2.LIZJ));
            return;
        }
        if (result instanceof A2I) {
            LJ().LIZ(SZY.Error, type, ((A2I) result).LIZIZ);
        } else {
            if (!(result instanceof A2H)) {
                return;
            }
            LJ().LIZ(SZY.End, type, null);
        }
    }
}
