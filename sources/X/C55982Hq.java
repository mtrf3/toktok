package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55982Hq extends AbstractC538029g {
    public static final C1QW LLIIIJ;
    public C1DY LLIIII;
    public InterfaceC40491iP LLIIIILZ;

    static {
        C1QW c1qw = new C1QW();
        c1qw.LIZLLL(C11850dJ.LJ);
        c1qw.LJIJJ(1.0f);
        c1qw.LJIJJLI(1);
        LLIIIJ = c1qw;
    }

    @Override // X.AbstractC538029g
    public final C1M3 LLD() {
        return this.LLIIII.LJIIIIZZ();
    }

    @Override // X.AbstractC538029g
    public final void LLIIII() {
        super.LLIIII();
        C1DY c1dy = this.LLIIII;
        if ((c1dy.LJIIIIZZ().LJLILLLLZI & 512) != 0 && (c1dy instanceof InterfaceC40491iP)) {
            InterfaceC40491iP interfaceC40491iP = (InterfaceC40491iP) c1dy;
            this.LLIIIILZ = interfaceC40491iP;
            AbstractC537929f abstractC537929f = this.LJLLLLLL;
            if (abstractC537929f != null) {
                this.LJLLLLLL = new C55962Ho(this, abstractC537929f.LJLJLJ, interfaceC40491iP);
                return;
            }
            return;
        }
        this.LLIIIILZ = null;
        AbstractC537929f abstractC537929f2 = this.LJLLLLLL;
        if (abstractC537929f2 == null) {
            return;
        }
        this.LJLLLLLL = new C55972Hp(this, abstractC537929f2.LJLJLJ);
    }

    @Override // X.InterfaceC274115t
    public final int LJJJI(int i) {
        C1DY c1dy = this.LLIIII;
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        o.LJI(abstractC538029g);
        return c1dy.LJIIJJI(this, abstractC538029g, i);
    }

    @Override // X.InterfaceC39071g7
    public final AbstractC39201gK LJJJIL(long j) {
        LJLIIL(j);
        C1DY c1dy = this.LLIIII;
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        o.LJI(abstractC538029g);
        LLIIJI(c1dy.LJIILL(this, abstractC538029g, j));
        C0DN c0dn = this.LLFF;
        if (c0dn != null) {
            c0dn.LJIIIIZZ(this.LJLJI);
        }
        LLIIIILZ();
        return this;
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJILLIZJL(int i) {
        C1DY c1dy = this.LLIIII;
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        o.LJI(abstractC538029g);
        return c1dy.LJJJI(this, abstractC538029g, i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLIIIJLLLLLLLZ(int i) {
        C1DY c1dy = this.LLIIII;
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        o.LJI(abstractC538029g);
        return c1dy.LJJJIL(this, abstractC538029g, i);
    }

    @Override // X.InterfaceC274115t
    public final int LJJLJLI(int i) {
        C1DY c1dy = this.LLIIII;
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        o.LJI(abstractC538029g);
        return c1dy.LJI(this, abstractC538029g, i);
    }

    @Override // X.AbstractC45981rG
    public final int LJLIL(AbstractC272415c alignmentLine) {
        o.LJIIIZ(alignmentLine, "alignmentLine");
        AbstractC537929f abstractC537929f = this.LJLLLLLL;
        if (abstractC537929f != null) {
            Integer num = (Integer) ((LinkedHashMap) abstractC537929f.LJLLJ).get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return C87277YNd.LIZ(this, alignmentLine);
    }

    @Override // X.AbstractC538029g
    public final AbstractC537929f LJLLL(C39061g6 scope) {
        o.LJIIIZ(scope, "scope");
        InterfaceC40491iP interfaceC40491iP = this.LLIIIILZ;
        if (interfaceC40491iP != null) {
            return new C55962Ho(this, scope, interfaceC40491iP);
        }
        return new C55972Hp(this, scope);
    }

    @Override // X.AbstractC538029g
    public final void LLIIIL(InterfaceC11750d9 canvas) {
        o.LJIIIZ(canvas, "canvas");
        AbstractC538029g abstractC538029g = this.LJLJLJ;
        o.LJI(abstractC538029g);
        abstractC538029g.LJLLLLLL(canvas);
        if (C1DF.LJJIJIIJI(this.LJLJL).getShowLayoutBounds()) {
            LJLZ(canvas, LLIIIJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55982Hq(C29321Dc layoutNode, C1DY c1dy) {
        super(layoutNode);
        InterfaceC40491iP interfaceC40491iP;
        o.LJIIIZ(layoutNode, "layoutNode");
        this.LLIIII = c1dy;
        if ((c1dy.LJIIIIZZ().LJLILLLLZI & 512) != 0 && (c1dy instanceof InterfaceC40491iP)) {
            interfaceC40491iP = (InterfaceC40491iP) c1dy;
        } else {
            interfaceC40491iP = null;
        }
        this.LLIIIILZ = interfaceC40491iP;
    }

    @Override // X.AbstractC538029g, X.AbstractC39201gK
    public final void LJL(long j, float f, InterfaceC88472Yns<? super InterfaceC32701Qc, C76800UCe> interfaceC88472Yns) {
        super.LJL(j, f, interfaceC88472Yns);
        if (this.LJLJJL) {
            return;
        }
        LLIIIJ();
        C39191gJ c39191gJ = AbstractC274515x.LIZ;
        int i = (int) (this.LJLJI >> 32);
        EnumC23500w6 enumC23500w6 = this.LJLJL.LJLZ;
        InterfaceC274415w interfaceC274415w = AbstractC274515x.LIZLLL;
        c39191gJ.getClass();
        int i2 = AbstractC274515x.LIZJ;
        EnumC23500w6 enumC23500w62 = AbstractC274515x.LIZIZ;
        AbstractC274515x.LIZJ = i;
        AbstractC274515x.LIZIZ = enumC23500w6;
        boolean LJIIL = C39191gJ.LJIIL(c39191gJ, this);
        LJLJJLL().LIZJ();
        this.LJLJJLL = LJIIL;
        AbstractC274515x.LIZJ = i2;
        AbstractC274515x.LIZIZ = enumC23500w62;
        AbstractC274515x.LIZLLL = interfaceC274415w;
    }
}
