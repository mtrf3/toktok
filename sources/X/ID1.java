package X;

import Y.IDComparatorS34S0000000_6;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class ID1 implements InterfaceC82400WVo {
    public volatile boolean LJLIL;
    public final List<F4V> LJLILLLLZI;
    public final List<TGM> LJLJI;
    public final List<TGT> LJLJJI;
    public final CopyOnWriteArrayList<InterfaceC81397Vx3> LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public IDH LJLJLJ;
    public final SafeHandler LJLJLLL;
    public final LifecycleOwner LJLL;
    public final C5NP LJLLI;

    public final T4K LIZJ() {
        return (T4K) this.LJLJL.getValue();
    }

    public C81605W0z LIZLLL() {
        return null;
    }

    public abstract T4O ch0();

    public final void Z7() {
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseStickerModule#observerStickerSelectedStateChange1:isStickerHandlerLoaded:");
        LIZ.append(this.LJLIL);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        ID8 id8 = new ID8(this);
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BaseStickerModule#observerStickerSelectedStateChange2:listener:");
        LIZ2.append(id8);
        LIZLLL2.i(X1D.LIZIZ(LIZ2));
        LLZL().LIZIZ(id8);
    }

    @Override // X.InterfaceC82400WVo
    public final IDH LLLF() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC82400WVo
    public final SafeHandler LLLZI() {
        return this.LJLJLLL;
    }

    public final void LIZIZ(T4S t4s) {
        ArrayList arrayList = new ArrayList();
        C81605W0z LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            arrayList.add(LIZLLL);
        }
        arrayList.add(LIZJ());
        arrayList.addAll(this.LJLILLLLZI);
        arrayList.add(this.LJLJJLL.getValue());
        new ID5(ORZ.LLILII(new IDComparatorS34S0000000_6(6), arrayList), 0, this.LJLLI).LIZ(t4s);
    }

    @Override // X.InterfaceC63084OpM
    public final F4V LLLIIII(InterfaceC88472Yns<? super F4V, Boolean> predicate) {
        Object obj;
        o.LJIIIZ(predicate, "predicate");
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (predicate.invoke(obj).booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        F4V f4v = (F4V) obj;
        if (f4v != null) {
            return f4v;
        }
        return LIZJ().LLLIIII(predicate);
    }

    public ID1(LifecycleOwner lifecycleOwner, C5NP c5np) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLL = lifecycleOwner;
        this.LJLLI = c5np;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new CopyOnWriteArrayList<>();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1081));
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 503));
        this.LJLJLLL = new SafeHandler(lifecycleOwner);
    }

    public final void LIZ(F4V handler, boolean z) {
        o.LJIIIZ(handler, "handler");
        if (z) {
            if (!((ArrayList) this.LJLILLLLZI).contains(handler)) {
                ((ArrayList) this.LJLILLLLZI).add(handler);
            }
        } else {
            T4K LIZJ = LIZJ();
            LIZJ.getClass();
            if (!LIZJ.LJLIL.contains(handler)) {
                LIZJ.LJLIL.add(handler);
            }
        }
        if ((handler instanceof TGM) && !((ArrayList) this.LJLJI).contains(handler)) {
            ((ArrayList) this.LJLJI).add(handler);
        }
        if ((handler instanceof TGT) && !((ArrayList) this.LJLJJI).contains(handler)) {
            ((ArrayList) this.LJLJJI).add(handler);
        }
        if ((handler instanceof InterfaceC81397Vx3) && !this.LJLJJL.contains(handler)) {
            this.LJLJJL.add(handler);
        }
    }
}
