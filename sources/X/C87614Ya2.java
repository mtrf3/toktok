package X;

import Y.ARunnableS35S0200000_16;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS147S0200000_16;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS182S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Ya2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87614Ya2 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final C36937Eeb LIZ;
    public Executor LIZIZ;
    public Executor LIZJ;
    public Executor LIZLLL;
    public final List<Object> LJ;
    public final List<Object> LJFF;
    public final C87607YZv LJI;
    public final String LJII;
    public final C87612Ya0[] LJIIIIZZ;

    public final AbstractC87589YZd LIZJ() {
        T t = this.LJI.LIZJ.LIZ;
        if (t != 0) {
            return (AbstractC87589YZd) t;
        }
        o.LJIJI("invoker");
        throw null;
    }

    public final void LJIIIIZZ() {
        LJI(new AqS182S0100000_16(this, 0));
    }

    public static void LIZLLL(C87614Ya2 c87614Ya2) {
        LJFF(c87614Ya2.LIZIZ, new AqS147S0200000_16(c87614Ya2, (Object) null, 3));
    }

    public static void LJ(C87614Ya2 c87614Ya2) {
        LJFF(c87614Ya2.LIZIZ, new AqS147S0200000_16(c87614Ya2, (Object) null, 4));
    }

    public final void LIZ(InterfaceC36938Eec observer) {
        o.LJIIIZ(observer, "observer");
        LJI(new AqS147S0200000_16(this, observer, 0));
    }

    public final void LIZIZ(Object obj) {
        LJI(new AqS147S0200000_16(this, obj, 1));
    }

    public final void LJI(InterfaceC88472Yns<? super C41875Gc3, C76800UCe> interfaceC88472Yns) {
        LJFF(this.LIZIZ, interfaceC88472Yns);
    }

    public final void LJII(AbstractC41872Gc0 abstractC41872Gc0) {
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 30);
        LJFF(this.LIZLLL, new AqS147S0200000_16(this, abstractC41872Gc0, 2));
        if (aqS173S0100000_7.LIZ$0(abstractC41872Gc0)) {
            this.LJI.LIZ(null);
        }
    }

    public C87614Ya2(String tag, C87612Ya0... startNodes) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(startNodes, "startNodes");
        this.LJII = tag;
        this.LJIIIIZZ = startNodes;
        for (C87612Ya0 c87612Ya0 : startNodes) {
            C87613Ya1 c87613Ya1 = c87612Ya0.LIZ;
            c87613Ya1.getClass();
            c87613Ya1.LIZJ = this;
        }
        this.LIZ = new C36937Eeb();
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LJI = new C87607YZv(this.LJII, C87601YZp.LJLIL, new C87615Ya3(this));
    }

    public static void LJFF(Executor executor, InterfaceC88472Yns interfaceC88472Yns) {
        C41875Gc3 c41875Gc3 = new C41875Gc3(0);
        if (executor == null) {
            interfaceC88472Yns.invoke(c41875Gc3);
        } else {
            executor.execute(new ARunnableS35S0200000_16(interfaceC88472Yns, c41875Gc3, 0));
        }
    }

    public final void LJIIIZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C87612Ya0 c87612Ya0 : this.LJIIIIZZ) {
            YNO.LJLIL.getClass();
            YNO.LIZ(c87612Ya0, linkedHashSet, z, interfaceC88472Yns);
        }
    }
}
