package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.Ya0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87612Ya0 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C87613Ya1 LIZ;
    public C87627YaF LIZIZ;
    public volatile AbstractC43456H3s LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public AbstractC87605YZt LJFF;
    public final C87607YZv LJI;
    public final Object LJII;
    public final InterfaceC65784Pro<AbstractC43456H3s> LJIIIIZZ;

    public final AbstractC87590YZe LIZJ() {
        T t = this.LJI.LIZJ.LIZ;
        if (t != 0) {
            return (AbstractC87590YZe) t;
        }
        o.LJIJI("invoker");
        throw null;
    }

    public final void LIZLLL() {
        java.util.Set<C87612Ya0> set = this.LIZ.LIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<C87612Ya0> it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next().LIZJ() instanceof C87595YZj)) {
                    return;
                }
            }
        }
        this.LJI.start();
    }

    public final void LIZ(C87612Ya0... c87612Ya0Arr) {
        LIZIZ(false, (C87612Ya0[]) Arrays.copyOf(c87612Ya0Arr, c87612Ya0Arr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C87612Ya0(Object tag, InterfaceC65784Pro<? extends AbstractC43456H3s> gen2) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(gen2, "gen");
        this.LJII = tag;
        this.LJIIIIZZ = gen2;
        this.LIZ = new C87613Ya1(this);
        this.LIZIZ = C87627YaF.LIZ;
        this.LJI = new C87607YZv(tag, C87602YZq.LJLIL, new C87611YZz(this));
    }

    public final boolean LIZIZ(boolean z, C87612Ya0... nodes) {
        o.LJIIIZ(nodes, "nodes");
        C87613Ya1 c87613Ya1 = this.LIZ;
        C87612Ya0[] nodes2 = (C87612Ya0[]) Arrays.copyOf(nodes, nodes.length);
        c87613Ya1.getClass();
        o.LJIIIZ(nodes2, "nodes");
        C87614Ya2 c87614Ya2 = c87613Ya1.LIZJ;
        if (c87614Ya2 != null && c87614Ya2.LIZJ().LIZIZ && !z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c87613Ya1.LIZLLL.LJII);
            LIZ.append(" add depend failed cause net is started");
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            InterfaceC41817Gb7 interfaceC41817Gb7 = C41816Gb6.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("WaveKey: ");
            LIZ2.append(msg);
            interfaceC41817Gb7.log(X1D.LIZIZ(LIZ2));
            return false;
        }
        for (C87612Ya0 c87612Ya0 : nodes2) {
            c87613Ya1.LIZ.add(c87612Ya0);
            c87612Ya0.LIZ.LIZIZ.add(c87613Ya1.LIZLLL);
        }
        return true;
    }

    public final void LJ(String str, InterfaceC88472Yns<? super C41875Gc3, C76800UCe> interfaceC88472Yns) {
        Executor executor;
        C87613Ya1 c87613Ya1 = this.LIZ;
        C87616Ya4 c87616Ya4 = new C87616Ya4(this, interfaceC88472Yns, str);
        c87613Ya1.getClass();
        C87627YaF c87627YaF = c87613Ya1.LIZLLL.LIZIZ;
        if (o.LJ(c87627YaF, C87627YaF.LIZ)) {
            C87614Ya2 c87614Ya2 = c87613Ya1.LIZJ;
            if (c87614Ya2 != null) {
                executor = c87614Ya2.LIZJ;
            } else {
                o.LJIJI("net");
                throw null;
            }
        } else {
            if (!o.LJ(c87627YaF, C87628YaG.LIZ)) {
                if (c87627YaF instanceof C87630YaI) {
                    c87627YaF.getClass();
                } else {
                    throw new C162476Zf();
                }
            }
            executor = null;
        }
        if (c87613Ya1.LIZJ != null) {
            C87614Ya2.LJFF(executor, c87616Ya4);
        } else {
            o.LJIJI("net");
            throw null;
        }
    }
}
