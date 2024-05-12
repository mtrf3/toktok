package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.assetpacks.r2;
import com.google.gson.internal.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1XO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XO implements InterfaceC24390xX {
    public final C18860oc LJLIL;
    public InterfaceC20310qx LJLILLLLZI;
    public InterfaceC18630oF LJLJI;
    public final C1XM LJLJJI = new InterfaceC273215k() { // from class: X.1XM
        @Override // X.InterfaceC273215k
        public final int LIZ(AbstractC538029g abstractC538029g, List list, int i) {
            o.LJIIIZ(abstractC538029g, "<this>");
            C1XO.this.LJLIL.LIZ.LIZIZ(abstractC538029g.LJLJL.LJLZ);
            C1NB c1nb = C1XO.this.LJLIL.LIZ.LJIIIIZZ;
            if (c1nb != null) {
                return C77119UOl.LIZIZ(c1nb.LIZ());
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }

        @Override // X.InterfaceC273215k
        public final int LIZIZ(AbstractC538029g abstractC538029g, List list, int i) {
            o.LJIIIZ(abstractC538029g, "<this>");
            C1XO.this.LJLIL.LIZ.LIZIZ(abstractC538029g.LJLJL.LJLZ);
            C1NB c1nb = C1XO.this.LJLIL.LIZ.LJIIIIZZ;
            if (c1nb != null) {
                return C77119UOl.LIZIZ(c1nb.LIZJ());
            }
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }

        @Override // X.InterfaceC273215k
        public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
            InterfaceC20310qx interfaceC20310qx;
            o.LJIIIZ(measure, "$this$measure");
            o.LJIIIZ(measurables, "measurables");
            C18860oc c18860oc = C1XO.this.LJLIL;
            C0VG c0vg = c18860oc.LJFF;
            C0VG LIZ = c18860oc.LIZ.LIZ(j, measure.getLayoutDirection(), c0vg);
            if (!o.LJ(c0vg, LIZ)) {
                C1XO.this.LJLIL.LIZJ.invoke(LIZ);
                if (c0vg != null) {
                    C1XO c1xo = C1XO.this;
                    if (!o.LJ(c0vg.LIZ.LIZ, LIZ.LIZ.LIZ) && (interfaceC20310qx = c1xo.LJLILLLLZI) != null) {
                        interfaceC20310qx.LIZLLL();
                    }
                }
            }
            C18860oc c18860oc2 = C1XO.this.LJLIL;
            c18860oc2.getClass();
            c18860oc2.LJII.setValue(C76800UCe.LIZ);
            c18860oc2.LJFF = LIZ;
            if (measurables.size() >= LIZ.LJFF.size()) {
                List<C10390ax> list = LIZ.LJFF;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C10390ax c10390ax = (C10390ax) ListProtector.get(list, i);
                    if (c10390ax != null) {
                        arrayList.add(new OSZ(((InterfaceC39071g7) ListProtector.get(measurables, i)).LJJJIL(C78555UsJ.LJ((int) Math.floor(c10390ax.LIZJ - c10390ax.LIZ), (int) Math.floor(c10390ax.LIZLLL - c10390ax.LIZIZ), 5)), new C23450w1(C78939UyV.LIZ(O6R.LJJIIZ(c10390ax.LIZ), O6R.LJJIIZ(c10390ax.LIZIZ)))));
                    }
                }
                long j2 = LIZ.LIZJ;
                return measure.LJJLIL((int) (j2 >> 32), C23490w5.LIZIZ(j2), C113554cx.LJJL(new OSZ(C272615e.LIZ, Integer.valueOf(O6R.LJJIIZ(LIZ.LIZLLL))), new OSZ(C272615e.LIZIZ, Integer.valueOf(O6R.LJJIIZ(LIZ.LJ)))), new IDqS416S0100000((List) arrayList, (List<? extends AbstractC39201gK>) 259));
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }

        @Override // X.InterfaceC273215k
        public final int LIZLLL(AbstractC538029g abstractC538029g, List list, int i) {
            o.LJIIIZ(abstractC538029g, "<this>");
            return C23490w5.LIZIZ(C1XO.this.LJLIL.LIZ.LIZ(C78555UsJ.LIZJ(0, i, 0, Integer.MAX_VALUE), abstractC538029g.LJLJL.LJLZ, null).LIZJ);
        }

        @Override // X.InterfaceC273215k
        public final int LJ(AbstractC538029g abstractC538029g, List list, int i) {
            o.LJIIIZ(abstractC538029g, "<this>");
            return C23490w5.LIZIZ(C1XO.this.LJLIL.LIZ.LIZ(C78555UsJ.LIZJ(0, i, 0, Integer.MAX_VALUE), abstractC538029g.LJLJL.LJLZ, null).LIZJ);
        }
    };
    public final InterfaceC07790Sh LJLJJL;
    public InterfaceC07790Sh LJLJJLL;
    public InterfaceC07790Sh LJLJL;

    @Override // X.InterfaceC24390xX
    public final void LIZIZ() {
        InterfaceC20310qx interfaceC20310qx;
        if (this.LJLIL.LIZLLL != null && (interfaceC20310qx = this.LJLILLLLZI) != null) {
            interfaceC20310qx.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC24390xX
    public final void LIZJ() {
        InterfaceC20310qx interfaceC20310qx = this.LJLILLLLZI;
        if (interfaceC20310qx != null) {
            C18860oc c18860oc = this.LJLIL;
            new IDqS420S0100000(this, 141);
            new IDqS420S0100000(this, 142);
            c18860oc.LIZLLL = interfaceC20310qx.LIZ();
        }
    }

    @Override // X.InterfaceC24390xX
    public final void LIZLLL() {
        InterfaceC20310qx interfaceC20310qx;
        if (this.LJLIL.LIZLLL != null && (interfaceC20310qx = this.LJLILLLLZI) != null) {
            interfaceC20310qx.LJIIIIZZ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1XM] */
    public C1XO(C18860oc c18860oc) {
        this.LJLIL = c18860oc;
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        this.LJLJJL = V0N.LJJIIJZLJL(r2.LJI(C78847Ux1.LJJIIZI(c1m1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535), new IDqS416S0100000(this, 263)), new IDqS416S0100000(this, 258));
        this.LJLJJLL = b.LJJII(c1m1, false, new IDqS172S0200000(c18860oc.LIZ.LIZ, this, 67));
        this.LJLJL = c1m1;
    }

    public final void LJ(C18590oB c18590oB) {
        C18860oc c18860oc = this.LJLIL;
        if (c18860oc.LIZ == c18590oB) {
            return;
        }
        c18860oc.LIZ = c18590oB;
        this.LJLJJLL = b.LJJII(InterfaceC07790Sh.LJJJI, false, new IDqS172S0200000(c18590oB.LIZ, this, 67));
    }

    public final void LJFF(final InterfaceC20310qx interfaceC20310qx) {
        InterfaceC07790Sh interfaceC07790Sh;
        this.LJLILLLLZI = interfaceC20310qx;
        if (interfaceC20310qx != null) {
            InterfaceC18630oF interfaceC18630oF = new InterfaceC18630oF() { // from class: X.1XN
                public long LIZ;
                public long LIZIZ;

                @Override // X.InterfaceC18630oF
                public final void LIZ() {
                }

                @Override // X.InterfaceC18630oF
                public final void LIZJ() {
                }

                @Override // X.InterfaceC18630oF
                public final void onCancel() {
                    if (C20320qy.LIZ(interfaceC20310qx, C1XO.this.LJLIL.LIZIZ)) {
                        interfaceC20310qx.LIZIZ();
                    }
                }

                @Override // X.InterfaceC18630oF
                public final void onStop() {
                    if (C20320qy.LIZ(interfaceC20310qx, C1XO.this.LJLIL.LIZIZ)) {
                        interfaceC20310qx.LIZIZ();
                    }
                }

                @Override // X.InterfaceC18630oF
                public final void LIZIZ(long j) {
                    C1XO c1xo = C1XO.this;
                    InterfaceC274415w interfaceC274415w = c1xo.LJLIL.LJ;
                    if (interfaceC274415w != null) {
                        InterfaceC20310qx interfaceC20310qx2 = interfaceC20310qx;
                        if (!interfaceC274415w.LIZLLL()) {
                            return;
                        }
                        if (C1XO.LIZ(c1xo, j, j)) {
                            interfaceC20310qx2.LJFF();
                        } else {
                            InterfaceC20270qt.LIZ.getClass();
                            interfaceC20310qx2.LJI();
                        }
                        this.LIZ = j;
                    }
                    if (!C20320qy.LIZ(interfaceC20310qx, C1XO.this.LJLIL.LIZIZ)) {
                        return;
                    }
                    this.LIZIZ = C10370av.LIZIZ;
                }

                @Override // X.InterfaceC18630oF
                public final void LIZLLL(long j) {
                    C1XO c1xo = C1XO.this;
                    InterfaceC274415w interfaceC274415w = c1xo.LJLIL.LJ;
                    if (interfaceC274415w != null) {
                        InterfaceC20310qx interfaceC20310qx2 = interfaceC20310qx;
                        if (!interfaceC274415w.LIZLLL() || !C20320qy.LIZ(interfaceC20310qx2, c1xo.LJLIL.LIZIZ)) {
                            return;
                        }
                        long LJI = C10370av.LJI(this.LIZIZ, j);
                        this.LIZIZ = LJI;
                        long LJI2 = C10370av.LJI(this.LIZ, LJI);
                        if (!C1XO.LIZ(c1xo, this.LIZ, LJI2)) {
                            InterfaceC20270qt.LIZ.getClass();
                            if (interfaceC20310qx2.LJIIIZ()) {
                                this.LIZ = LJI2;
                                this.LIZIZ = C10370av.LIZIZ;
                            }
                        }
                    }
                }

                {
                    long j = C10370av.LIZIZ;
                    this.LIZ = j;
                    this.LIZIZ = j;
                }
            };
            this.LJLJI = interfaceC18630oF;
            interfaceC07790Sh = C11F.LIZIZ(InterfaceC07790Sh.LJJJI, interfaceC18630oF, new C2FI(this, null));
        } else {
            interfaceC07790Sh = InterfaceC07790Sh.LJJJI;
        }
        this.LJLJL = interfaceC07790Sh;
    }

    public static final boolean LIZ(C1XO c1xo, long j, long j2) {
        C0VG c0vg = c1xo.LJLIL.LJFF;
        if (c0vg != null) {
            int length = c0vg.LIZ.LIZ.LJLIL.length();
            int LJIIL = c0vg.LJIIL(j);
            int LJIIL2 = c0vg.LJIIL(j2);
            int i = length - 1;
            if (LJIIL >= i && LJIIL2 >= i) {
                return true;
            }
            if (LJIIL < 0 && LJIIL2 < 0) {
                return true;
            }
        }
        return false;
    }
}
