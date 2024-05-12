package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.16C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16C {
    public final C40061hi LIZ;
    public final C40061hi LIZLLL;
    public AnonymousClass169 LJFF;
    public final AnonymousClass168 LJI;
    public final ArrayList<C16G> LJII;
    public boolean LIZIZ = true;
    public boolean LIZJ = true;
    public final ArrayList<AbstractC39241gO> LJ = new ArrayList<>();

    /* JADX WARN: Type inference failed for: r0v31, types: [X.1pe] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.1pe] */
    public final void LIZJ() {
        ArrayList<AbstractC39241gO> arrayList = this.LJ;
        arrayList.clear();
        this.LIZLLL.horizontalRun.LJFF();
        this.LIZLLL.verticalRun.LJFF();
        arrayList.add(this.LIZLLL.horizontalRun);
        arrayList.add(this.LIZLLL.verticalRun);
        Iterator<C018205i> it = this.LIZLLL.LIZ.iterator();
        HashSet hashSet = null;
        while (true) {
            int i = 1;
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            final C018205i next = it.next();
            if (next instanceof C1AC) {
                arrayList.add(new AbstractC39241gO(next) { // from class: X.1pg
                    @Override // X.AbstractC39241gO
                    public final boolean LJIIJ() {
                        return false;
                    }

                    @Override // X.AbstractC39241gO
                    public final void LIZLLL() {
                        C018205i c018205i = this.LIZIZ;
                        C1AC c1ac = (C1AC) c018205i;
                        int i3 = c1ac.LIZIZ;
                        int i4 = c1ac.LIZJ;
                        if (c1ac.LJ == 1) {
                            if (i3 != -1) {
                                ((ArrayList) this.LJII.LJIIJJI).add(c018205i.mParent.horizontalRun.LJII);
                                ((ArrayList) this.LIZIZ.mParent.horizontalRun.LJII.LJIIJ).add(this.LJII);
                                this.LJII.LJFF = i3;
                            } else if (i4 != -1) {
                                ((ArrayList) this.LJII.LJIIJJI).add(c018205i.mParent.horizontalRun.LJIIIIZZ);
                                ((ArrayList) this.LIZIZ.mParent.horizontalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                                this.LJII.LJFF = -i4;
                            } else {
                                C39231gN c39231gN = this.LJII;
                                c39231gN.LIZIZ = true;
                                ((ArrayList) c39231gN.LJIIJJI).add(c018205i.mParent.horizontalRun.LJIIIIZZ);
                                ((ArrayList) this.LIZIZ.mParent.horizontalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                            }
                            LJIIL(this.LIZIZ.horizontalRun.LJII);
                            LJIIL(this.LIZIZ.horizontalRun.LJIIIIZZ);
                            return;
                        }
                        if (i3 != -1) {
                            ((ArrayList) this.LJII.LJIIJJI).add(c018205i.mParent.verticalRun.LJII);
                            ((ArrayList) this.LIZIZ.mParent.verticalRun.LJII.LJIIJ).add(this.LJII);
                            this.LJII.LJFF = i3;
                        } else if (i4 != -1) {
                            ((ArrayList) this.LJII.LJIIJJI).add(c018205i.mParent.verticalRun.LJIIIIZZ);
                            ((ArrayList) this.LIZIZ.mParent.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                            this.LJII.LJFF = -i4;
                        } else {
                            C39231gN c39231gN2 = this.LJII;
                            c39231gN2.LIZIZ = true;
                            ((ArrayList) c39231gN2.LJIIJJI).add(c018205i.mParent.verticalRun.LJIIIIZZ);
                            ((ArrayList) this.LIZIZ.mParent.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJII);
                        }
                        LJIIL(this.LIZIZ.verticalRun.LJII);
                        LJIIL(this.LIZIZ.verticalRun.LJIIIIZZ);
                    }

                    @Override // X.AbstractC39241gO
                    public final void LJ() {
                        C018205i c018205i = this.LIZIZ;
                        if (((C1AC) c018205i).LJ == 1) {
                            c018205i.mX = this.LJII.LJI;
                        } else {
                            c018205i.mY = this.LJII.LJI;
                        }
                    }

                    @Override // X.AbstractC39241gO
                    public final void LJFF() {
                        this.LJII.LIZJ();
                    }

                    {
                        super(next);
                        next.horizontalRun.LJFF();
                        next.verticalRun.LJFF();
                        this.LJFF = ((C1AC) next).LJ;
                    }

                    @Override // X.AbstractC39241gO, X.C16B
                    public final void LIZ(C16B c16b) {
                        C39231gN c39231gN = this.LJII;
                        if (!c39231gN.LIZJ || c39231gN.LJIIIZ) {
                            return;
                        }
                        this.LJII.LIZLLL((int) ((((C39231gN) ListProtector.get(c39231gN.LJIIJJI, 0)).LJI * ((C1AC) this.LIZIZ).LIZ) + 0.5f));
                    }

                    public final void LJIIL(C39231gN c39231gN) {
                        ((ArrayList) this.LJII.LJIIJ).add(c39231gN);
                        ((ArrayList) c39231gN.LJIIJJI).add(this.LJII);
                    }
                });
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new AbstractC39241gO(next, i2) { // from class: X.1pe
                            public final ArrayList<AbstractC39241gO> LJIIJ = new ArrayList<>();
                            public int LJIIJJI;

                            @Override // X.AbstractC39241gO
                            public final void LJ() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    ((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LJ();
                                }
                            }

                            @Override // X.AbstractC39241gO
                            public final void LJFF() {
                                this.LIZJ = null;
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LJFF();
                                }
                            }

                            public final C018205i LJIIL() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    C018205i c018205i = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LIZIZ;
                                    if (c018205i.mVisibility != 8) {
                                        return c018205i;
                                    }
                                }
                                return null;
                            }

                            @Override // X.AbstractC39241gO
                            public final void LIZLLL() {
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LIZLLL();
                                }
                                int size = this.LJIIJ.size();
                                if (size < 1) {
                                    return;
                                }
                                C018205i c018205i = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, 0)).LIZIZ;
                                C018205i c018205i2 = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, size - 1)).LIZIZ;
                                if (this.LJFF == 0) {
                                    C017905f c017905f = c018205i.mLeft;
                                    C017905f c017905f2 = c018205i2.mRight;
                                    C39231gN LJIIIIZZ = AbstractC39241gO.LJIIIIZZ(c017905f, 0);
                                    int LJ = c017905f.LJ();
                                    C018205i LJIIL = LJIIL();
                                    if (LJIIL != null) {
                                        LJ = LJIIL.mLeft.LJ();
                                    }
                                    if (LJIIIIZZ != null) {
                                        AbstractC39241gO.LIZIZ(this.LJII, LJIIIIZZ, LJ);
                                    }
                                    C39231gN LJIIIIZZ2 = AbstractC39241gO.LJIIIIZZ(c017905f2, 0);
                                    int LJ2 = c017905f2.LJ();
                                    C018205i LJIILIIL = LJIILIIL();
                                    if (LJIILIIL != null) {
                                        LJ2 = LJIILIIL.mRight.LJ();
                                    }
                                    if (LJIIIIZZ2 != null) {
                                        AbstractC39241gO.LIZIZ(this.LJIIIIZZ, LJIIIIZZ2, -LJ2);
                                    }
                                } else {
                                    C017905f c017905f3 = c018205i.mTop;
                                    C017905f c017905f4 = c018205i2.mBottom;
                                    C39231gN LJIIIIZZ3 = AbstractC39241gO.LJIIIIZZ(c017905f3, 1);
                                    int LJ3 = c017905f3.LJ();
                                    C018205i LJIIL2 = LJIIL();
                                    if (LJIIL2 != null) {
                                        LJ3 = LJIIL2.mTop.LJ();
                                    }
                                    if (LJIIIIZZ3 != null) {
                                        AbstractC39241gO.LIZIZ(this.LJII, LJIIIIZZ3, LJ3);
                                    }
                                    C39231gN LJIIIIZZ4 = AbstractC39241gO.LJIIIIZZ(c017905f4, 1);
                                    int LJ4 = c017905f4.LJ();
                                    C018205i LJIILIIL2 = LJIILIIL();
                                    if (LJIILIIL2 != null) {
                                        LJ4 = LJIILIIL2.mBottom.LJ();
                                    }
                                    if (LJIIIIZZ4 != null) {
                                        AbstractC39241gO.LIZIZ(this.LJIIIIZZ, LJIIIIZZ4, -LJ4);
                                    }
                                }
                                this.LJII.LIZ = this;
                                this.LJIIIIZZ.LIZ = this;
                            }

                            @Override // X.AbstractC39241gO
                            public final long LJIIIZ() {
                                int size = this.LJIIJ.size();
                                long j = 0;
                                for (int i3 = 0; i3 < size; i3++) {
                                    j = r5.LJIIIIZZ.LJFF + ((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LJIIIZ() + j + r5.LJII.LJFF;
                                }
                                return j;
                            }

                            @Override // X.AbstractC39241gO
                            public final boolean LJIIJ() {
                                int size = this.LJIIJ.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    if (!((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LJIIJ()) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            public final C018205i LJIILIIL() {
                                for (int size = this.LJIIJ.size() - 1; size >= 0; size--) {
                                    C018205i c018205i = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, size)).LIZIZ;
                                    if (c018205i.mVisibility != 8) {
                                        return c018205i;
                                    }
                                }
                                return null;
                            }

                            public final String toString() {
                                String str;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("ChainRun ");
                                if (this.LJFF == 0) {
                                    str = "horizontal : ";
                                } else {
                                    str = "vertical : ";
                                }
                                LIZ.append(str);
                                String LIZIZ = X1D.LIZIZ(LIZ);
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    AbstractC39241gO next2 = it2.next();
                                    String LJFF = i0.LJFF(LIZIZ, "<");
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(LJFF);
                                    LIZ2.append(next2);
                                    LIZIZ = i0.LJFF(X1D.LIZIZ(LIZ2), "> ");
                                }
                                return LIZIZ;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:103:0x0173, code lost:
                            
                                if (r0 != r14) goto L95;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:104:0x0175, code lost:
                            
                                r17 = r17 + 1;
                                r14 = r0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:105:0x0178, code lost:
                            
                                r0.LJ.LIZLLL(r14);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:115:0x01a4, code lost:
                            
                                if (r0 != r14) goto L95;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:195:0x028b, code lost:
                            
                                if (r8 != false) goto L159;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:242:0x0327, code lost:
                            
                                if (r8 != false) goto L202;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:292:0x03c7, code lost:
                            
                                if (r8 != false) goto L247;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:180:0x026b  */
                            /* JADX WARN: Removed duplicated region for block: B:185:0x027a  */
                            /* JADX WARN: Removed duplicated region for block: B:187:0x0299  */
                            /* JADX WARN: Removed duplicated region for block: B:191:0x0281  */
                            @Override // X.AbstractC39241gO, X.C16B
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(X.C16B r24) {
                                /*
                                    Method dump skipped, instructions count: 998
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C44981pe.LIZ(X.16B):void");
                            }

                            {
                                C018205i c018205i;
                                int i3;
                                this.LJFF = i2;
                                C018205i c018205i2 = this.LIZIZ;
                                C018205i previousChainMember = c018205i2.getPreviousChainMember(i2);
                                while (true) {
                                    c018205i = c018205i2;
                                    c018205i2 = previousChainMember;
                                    if (previousChainMember == null) {
                                        break;
                                    } else {
                                        previousChainMember = previousChainMember.getPreviousChainMember(this.LJFF);
                                    }
                                }
                                this.LIZIZ = c018205i;
                                this.LJIIJ.add(c018205i.getRun(this.LJFF));
                                C018205i nextChainMember = c018205i.getNextChainMember(this.LJFF);
                                while (nextChainMember != null) {
                                    this.LJIIJ.add(nextChainMember.getRun(this.LJFF));
                                    nextChainMember = nextChainMember.getNextChainMember(this.LJFF);
                                }
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    AbstractC39241gO next2 = it2.next();
                                    int i4 = this.LJFF;
                                    if (i4 == 0) {
                                        next2.LIZIZ.horizontalChainRun = this;
                                    } else if (i4 == 1) {
                                        next2.LIZIZ.verticalChainRun = this;
                                    }
                                }
                                if (this.LJFF == 0 && ((C40061hi) this.LIZIZ.mParent).LJ && this.LJIIJ.size() > 1) {
                                    ArrayList<AbstractC39241gO> arrayList2 = this.LJIIJ;
                                    this.LIZIZ = ((AbstractC39241gO) AnonymousClass028.LIZIZ(arrayList2, 1, arrayList2)).LIZIZ;
                                }
                                if (this.LJFF == 0) {
                                    i3 = this.LIZIZ.mHorizontalChainStyle;
                                } else {
                                    i3 = this.LIZIZ.mVerticalChainStyle;
                                }
                                this.LJIIJJI = i3;
                            }
                        };
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.horizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new AbstractC39241gO(next, i) { // from class: X.1pe
                            public final ArrayList<AbstractC39241gO> LJIIJ = new ArrayList<>();
                            public int LJIIJJI;

                            @Override // X.AbstractC39241gO
                            public final void LJ() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    ((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LJ();
                                }
                            }

                            @Override // X.AbstractC39241gO
                            public final void LJFF() {
                                this.LIZJ = null;
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LJFF();
                                }
                            }

                            public final C018205i LJIIL() {
                                for (int i3 = 0; i3 < this.LJIIJ.size(); i3++) {
                                    C018205i c018205i = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LIZIZ;
                                    if (c018205i.mVisibility != 8) {
                                        return c018205i;
                                    }
                                }
                                return null;
                            }

                            @Override // X.AbstractC39241gO
                            public final void LIZLLL() {
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LIZLLL();
                                }
                                int size = this.LJIIJ.size();
                                if (size < 1) {
                                    return;
                                }
                                C018205i c018205i = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, 0)).LIZIZ;
                                C018205i c018205i2 = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, size - 1)).LIZIZ;
                                if (this.LJFF == 0) {
                                    C017905f c017905f = c018205i.mLeft;
                                    C017905f c017905f2 = c018205i2.mRight;
                                    C39231gN LJIIIIZZ = AbstractC39241gO.LJIIIIZZ(c017905f, 0);
                                    int LJ = c017905f.LJ();
                                    C018205i LJIIL = LJIIL();
                                    if (LJIIL != null) {
                                        LJ = LJIIL.mLeft.LJ();
                                    }
                                    if (LJIIIIZZ != null) {
                                        AbstractC39241gO.LIZIZ(this.LJII, LJIIIIZZ, LJ);
                                    }
                                    C39231gN LJIIIIZZ2 = AbstractC39241gO.LJIIIIZZ(c017905f2, 0);
                                    int LJ2 = c017905f2.LJ();
                                    C018205i LJIILIIL = LJIILIIL();
                                    if (LJIILIIL != null) {
                                        LJ2 = LJIILIIL.mRight.LJ();
                                    }
                                    if (LJIIIIZZ2 != null) {
                                        AbstractC39241gO.LIZIZ(this.LJIIIIZZ, LJIIIIZZ2, -LJ2);
                                    }
                                } else {
                                    C017905f c017905f3 = c018205i.mTop;
                                    C017905f c017905f4 = c018205i2.mBottom;
                                    C39231gN LJIIIIZZ3 = AbstractC39241gO.LJIIIIZZ(c017905f3, 1);
                                    int LJ3 = c017905f3.LJ();
                                    C018205i LJIIL2 = LJIIL();
                                    if (LJIIL2 != null) {
                                        LJ3 = LJIIL2.mTop.LJ();
                                    }
                                    if (LJIIIIZZ3 != null) {
                                        AbstractC39241gO.LIZIZ(this.LJII, LJIIIIZZ3, LJ3);
                                    }
                                    C39231gN LJIIIIZZ4 = AbstractC39241gO.LJIIIIZZ(c017905f4, 1);
                                    int LJ4 = c017905f4.LJ();
                                    C018205i LJIILIIL2 = LJIILIIL();
                                    if (LJIILIIL2 != null) {
                                        LJ4 = LJIILIIL2.mBottom.LJ();
                                    }
                                    if (LJIIIIZZ4 != null) {
                                        AbstractC39241gO.LIZIZ(this.LJIIIIZZ, LJIIIIZZ4, -LJ4);
                                    }
                                }
                                this.LJII.LIZ = this;
                                this.LJIIIIZZ.LIZ = this;
                            }

                            @Override // X.AbstractC39241gO
                            public final long LJIIIZ() {
                                int size = this.LJIIJ.size();
                                long j = 0;
                                for (int i3 = 0; i3 < size; i3++) {
                                    j = r5.LJIIIIZZ.LJFF + ((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LJIIIZ() + j + r5.LJII.LJFF;
                                }
                                return j;
                            }

                            @Override // X.AbstractC39241gO
                            public final boolean LJIIJ() {
                                int size = this.LJIIJ.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    if (!((AbstractC39241gO) ListProtector.get(this.LJIIJ, i3)).LJIIJ()) {
                                        return false;
                                    }
                                }
                                return true;
                            }

                            public final C018205i LJIILIIL() {
                                for (int size = this.LJIIJ.size() - 1; size >= 0; size--) {
                                    C018205i c018205i = ((AbstractC39241gO) ListProtector.get(this.LJIIJ, size)).LIZIZ;
                                    if (c018205i.mVisibility != 8) {
                                        return c018205i;
                                    }
                                }
                                return null;
                            }

                            public final String toString() {
                                String str;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("ChainRun ");
                                if (this.LJFF == 0) {
                                    str = "horizontal : ";
                                } else {
                                    str = "vertical : ";
                                }
                                LIZ.append(str);
                                String LIZIZ = X1D.LIZIZ(LIZ);
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    AbstractC39241gO next2 = it2.next();
                                    String LJFF = i0.LJFF(LIZIZ, "<");
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(LJFF);
                                    LIZ2.append(next2);
                                    LIZIZ = i0.LJFF(X1D.LIZIZ(LIZ2), "> ");
                                }
                                return LIZIZ;
                            }

                            @Override // X.AbstractC39241gO, X.C16B
                            public final void LIZ(C16B c16b) {
                                /*  JADX ERROR: Method code generation error
                                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    */
                                /*
                                    Method dump skipped, instructions count: 998
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C44981pe.LIZ(X.16B):void");
                            }

                            {
                                C018205i c018205i;
                                int i3;
                                this.LJFF = i;
                                C018205i c018205i2 = this.LIZIZ;
                                C018205i previousChainMember = c018205i2.getPreviousChainMember(i);
                                while (true) {
                                    c018205i = c018205i2;
                                    c018205i2 = previousChainMember;
                                    if (previousChainMember == null) {
                                        break;
                                    } else {
                                        previousChainMember = previousChainMember.getPreviousChainMember(this.LJFF);
                                    }
                                }
                                this.LIZIZ = c018205i;
                                this.LJIIJ.add(c018205i.getRun(this.LJFF));
                                C018205i nextChainMember = c018205i.getNextChainMember(this.LJFF);
                                while (nextChainMember != null) {
                                    this.LJIIJ.add(nextChainMember.getRun(this.LJFF));
                                    nextChainMember = nextChainMember.getNextChainMember(this.LJFF);
                                }
                                Iterator<AbstractC39241gO> it2 = this.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    AbstractC39241gO next2 = it2.next();
                                    int i4 = this.LJFF;
                                    if (i4 == 0) {
                                        next2.LIZIZ.horizontalChainRun = this;
                                    } else if (i4 == 1) {
                                        next2.LIZIZ.verticalChainRun = this;
                                    }
                                }
                                if (this.LJFF == 0 && ((C40061hi) this.LIZIZ.mParent).LJ && this.LJIIJ.size() > 1) {
                                    ArrayList<AbstractC39241gO> arrayList2 = this.LJIIJ;
                                    this.LIZIZ = ((AbstractC39241gO) AnonymousClass028.LIZIZ(arrayList2, 1, arrayList2)).LIZIZ;
                                }
                                if (this.LJFF == 0) {
                                    i3 = this.LIZIZ.mHorizontalChainStyle;
                                } else {
                                    i3 = this.LIZIZ.mVerticalChainStyle;
                                }
                                this.LJIIJJI = i3;
                            }
                        };
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.verticalRun);
                }
                if (next instanceof C1AD) {
                    arrayList.add(new AbstractC39241gO(next) { // from class: X.1ph
                        @Override // X.AbstractC39241gO
                        public final void LJFF() {
                            this.LIZJ = null;
                            this.LJII.LIZJ();
                        }

                        @Override // X.AbstractC39241gO
                        public final boolean LJIIJ() {
                            return false;
                        }

                        @Override // X.AbstractC39241gO
                        public final void LIZLLL() {
                            C018205i c018205i = this.LIZIZ;
                            if (c018205i instanceof C40051hh) {
                                C39231gN c39231gN = this.LJII;
                                c39231gN.LIZIZ = true;
                                C40051hh c40051hh = (C40051hh) c018205i;
                                int i3 = c40051hh.LIZJ;
                                boolean z = c40051hh.LIZLLL;
                                int i4 = 0;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 != 3) {
                                                return;
                                            }
                                            c39231gN.LJ = C16D.BOTTOM;
                                            while (i4 < c40051hh.LIZIZ) {
                                                C018205i c018205i2 = c40051hh.LIZ[i4];
                                                if (z || c018205i2.mVisibility != 8) {
                                                    C39231gN c39231gN2 = c018205i2.verticalRun.LJIIIIZZ;
                                                    ((ArrayList) c39231gN2.LJIIJ).add(this.LJII);
                                                    ((ArrayList) this.LJII.LJIIJJI).add(c39231gN2);
                                                }
                                                i4++;
                                            }
                                            LJIIL(this.LIZIZ.verticalRun.LJII);
                                            LJIIL(this.LIZIZ.verticalRun.LJIIIIZZ);
                                            return;
                                        }
                                        c39231gN.LJ = C16D.TOP;
                                        while (i4 < c40051hh.LIZIZ) {
                                            C018205i c018205i3 = c40051hh.LIZ[i4];
                                            if (z || c018205i3.mVisibility != 8) {
                                                C39231gN c39231gN3 = c018205i3.verticalRun.LJII;
                                                ((ArrayList) c39231gN3.LJIIJ).add(this.LJII);
                                                ((ArrayList) this.LJII.LJIIJJI).add(c39231gN3);
                                            }
                                            i4++;
                                        }
                                        LJIIL(this.LIZIZ.verticalRun.LJII);
                                        LJIIL(this.LIZIZ.verticalRun.LJIIIIZZ);
                                        return;
                                    }
                                    c39231gN.LJ = C16D.RIGHT;
                                    while (i4 < c40051hh.LIZIZ) {
                                        C018205i c018205i4 = c40051hh.LIZ[i4];
                                        if (z || c018205i4.mVisibility != 8) {
                                            C39231gN c39231gN4 = c018205i4.horizontalRun.LJIIIIZZ;
                                            ((ArrayList) c39231gN4.LJIIJ).add(this.LJII);
                                            ((ArrayList) this.LJII.LJIIJJI).add(c39231gN4);
                                        }
                                        i4++;
                                    }
                                    LJIIL(this.LIZIZ.horizontalRun.LJII);
                                    LJIIL(this.LIZIZ.horizontalRun.LJIIIIZZ);
                                    return;
                                }
                                c39231gN.LJ = C16D.LEFT;
                                while (i4 < c40051hh.LIZIZ) {
                                    C018205i c018205i5 = c40051hh.LIZ[i4];
                                    if (z || c018205i5.mVisibility != 8) {
                                        C39231gN c39231gN5 = c018205i5.horizontalRun.LJII;
                                        ((ArrayList) c39231gN5.LJIIJ).add(this.LJII);
                                        ((ArrayList) this.LJII.LJIIJJI).add(c39231gN5);
                                    }
                                    i4++;
                                }
                                LJIIL(this.LIZIZ.horizontalRun.LJII);
                                LJIIL(this.LIZIZ.horizontalRun.LJIIIIZZ);
                            }
                        }

                        @Override // X.AbstractC39241gO
                        public final void LJ() {
                            C018205i c018205i = this.LIZIZ;
                            if (c018205i instanceof C40051hh) {
                                int i3 = ((C40051hh) c018205i).LIZJ;
                                if (i3 == 0 || i3 == 1) {
                                    c018205i.mX = this.LJII.LJI;
                                } else {
                                    c018205i.mY = this.LJII.LJI;
                                }
                            }
                        }

                        @Override // X.AbstractC39241gO, X.C16B
                        public final void LIZ(C16B c16b) {
                            C40051hh c40051hh = (C40051hh) this.LIZIZ;
                            int i3 = c40051hh.LIZJ;
                            Iterator it2 = ((ArrayList) this.LJII.LJIIJJI).iterator();
                            int i4 = 0;
                            int i5 = -1;
                            while (it2.hasNext()) {
                                int i6 = ((C39231gN) it2.next()).LJI;
                                if (i5 == -1 || i6 < i5) {
                                    i5 = i6;
                                }
                                if (i4 < i6) {
                                    i4 = i6;
                                }
                            }
                            if (i3 == 0 || i3 == 2) {
                                this.LJII.LIZLLL(i5 + c40051hh.LJ);
                            } else {
                                this.LJII.LIZLLL(i4 + c40051hh.LJ);
                            }
                        }

                        public final void LJIIL(C39231gN c39231gN) {
                            ((ArrayList) this.LJII.LJIIJ).add(c39231gN);
                            ((ArrayList) c39231gN.LJIIJJI).add(this.LJII);
                        }
                    });
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC39241gO> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF();
        }
        Iterator<AbstractC39241gO> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC39241gO next2 = it3.next();
            if (next2.LIZIZ != this.LIZLLL) {
                next2.LIZLLL();
            }
        }
        this.LJII.clear();
        LJ(this.LIZ.horizontalRun, 0, this.LJII);
        LJ(this.LIZ.verticalRun, 1, this.LJII);
        this.LIZIZ = false;
    }

    public final void LJI() {
        boolean z;
        AnonymousClass290 anonymousClass290;
        Iterator<C018205i> it = this.LIZ.LIZ.iterator();
        while (it.hasNext()) {
            C018205i next = it.next();
            if (!next.measured) {
                EnumC018105h[] enumC018105hArr = next.mListDimensionBehaviors;
                boolean z2 = false;
                EnumC018105h enumC018105h = enumC018105hArr[0];
                EnumC018105h enumC018105h2 = enumC018105hArr[1];
                int i = next.mMatchConstraintDefaultWidth;
                int i2 = next.mMatchConstraintDefaultHeight;
                EnumC018105h enumC018105h3 = EnumC018105h.WRAP_CONTENT;
                if (enumC018105h == enumC018105h3 || (enumC018105h == EnumC018105h.MATCH_CONSTRAINT && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (enumC018105h2 == enumC018105h3 || (enumC018105h2 == EnumC018105h.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C44991pf c44991pf = next.horizontalRun.LJ;
                boolean z3 = c44991pf.LJIIIZ;
                C44991pf c44991pf2 = next.verticalRun.LJ;
                boolean z4 = c44991pf2.LJIIIZ;
                if (z3) {
                    if (z4) {
                        EnumC018105h enumC018105h4 = EnumC018105h.FIXED;
                        LJFF(next, enumC018105h4, c44991pf.LJI, enumC018105h4, c44991pf2.LJI);
                        next.measured = true;
                    } else if (z2) {
                        LJFF(next, EnumC018105h.FIXED, c44991pf.LJI, enumC018105h3, c44991pf2.LJI);
                        if (enumC018105h2 == EnumC018105h.MATCH_CONSTRAINT) {
                            next.verticalRun.LJ.LJIIL = next.getHeight();
                        } else {
                            next.verticalRun.LJ.LIZLLL(next.getHeight());
                            next.measured = true;
                        }
                    }
                    if (next.measured && (anonymousClass290 = next.verticalRun.LJIIJJI) != null) {
                        anonymousClass290.LIZLLL(next.mBaselineDistance);
                    }
                }
                if (z4 && z) {
                    LJFF(next, enumC018105h3, c44991pf.LJI, EnumC018105h.FIXED, c44991pf2.LJI);
                    if (enumC018105h == EnumC018105h.MATCH_CONSTRAINT) {
                        next.horizontalRun.LJ.LJIIL = next.getWidth();
                    } else {
                        next.horizontalRun.LJ.LIZLLL(next.getWidth());
                        next.measured = true;
                    }
                }
                if (next.measured) {
                    anonymousClass290.LIZLLL(next.mBaselineDistance);
                }
            }
        }
    }

    public C16C(C40061hi c40061hi) {
        new ArrayList();
        this.LJFF = null;
        this.LJI = new AnonymousClass168();
        this.LJII = new ArrayList<>();
        this.LIZ = c40061hi;
        this.LIZLLL = c40061hi;
    }

    public final void LIZIZ(C40061hi c40061hi) {
        EnumC018105h[] enumC018105hArr;
        EnumC018105h enumC018105h;
        EnumC018105h enumC018105h2;
        EnumC018105h enumC018105h3;
        EnumC018105h enumC018105h4;
        Iterator<C018205i> it = c40061hi.LIZ.iterator();
        while (it.hasNext()) {
            C018205i next = it.next();
            EnumC018105h[] enumC018105hArr2 = next.mListDimensionBehaviors;
            EnumC018105h enumC018105h5 = enumC018105hArr2[0];
            EnumC018105h enumC018105h6 = enumC018105hArr2[1];
            if (next.mVisibility == 8) {
                next.measured = true;
            } else {
                float f = next.mMatchConstraintPercentWidth;
                if (f < 1.0f && enumC018105h5 == EnumC018105h.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultWidth = 2;
                }
                float f2 = next.mMatchConstraintPercentHeight;
                if (f2 < 1.0f && enumC018105h6 == EnumC018105h.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultHeight = 2;
                }
                if (next.mDimensionRatio > 0.0f) {
                    EnumC018105h enumC018105h7 = EnumC018105h.MATCH_CONSTRAINT;
                    if (enumC018105h5 == enumC018105h7 && (enumC018105h6 == EnumC018105h.WRAP_CONTENT || enumC018105h6 == EnumC018105h.FIXED)) {
                        next.mMatchConstraintDefaultWidth = 3;
                    } else if (enumC018105h6 == enumC018105h7 && (enumC018105h5 == EnumC018105h.WRAP_CONTENT || enumC018105h5 == EnumC018105h.FIXED)) {
                        next.mMatchConstraintDefaultHeight = 3;
                    } else if (enumC018105h5 == enumC018105h7 && enumC018105h6 == enumC018105h7) {
                        if (next.mMatchConstraintDefaultWidth == 0) {
                            next.mMatchConstraintDefaultWidth = 3;
                        }
                        if (next.mMatchConstraintDefaultHeight == 0) {
                            next.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                EnumC018105h enumC018105h8 = EnumC018105h.MATCH_CONSTRAINT;
                if (enumC018105h5 == enumC018105h8 && next.mMatchConstraintDefaultWidth == 1 && (next.mLeft.LJFF == null || next.mRight.LJFF == null)) {
                    enumC018105h5 = EnumC018105h.WRAP_CONTENT;
                }
                if (enumC018105h6 == enumC018105h8 && next.mMatchConstraintDefaultHeight == 1 && (next.mTop.LJFF == null || next.mBottom.LJFF == null)) {
                    enumC018105h6 = EnumC018105h.WRAP_CONTENT;
                }
                C45021pi c45021pi = next.horizontalRun;
                c45021pi.LIZLLL = enumC018105h5;
                int i = next.mMatchConstraintDefaultWidth;
                c45021pi.LIZ = i;
                C45031pj c45031pj = next.verticalRun;
                c45031pj.LIZLLL = enumC018105h6;
                int i2 = next.mMatchConstraintDefaultHeight;
                c45031pj.LIZ = i2;
                EnumC018105h enumC018105h9 = EnumC018105h.MATCH_PARENT;
                if ((enumC018105h5 == enumC018105h9 || enumC018105h5 == EnumC018105h.FIXED || enumC018105h5 == EnumC018105h.WRAP_CONTENT) && (enumC018105h6 == enumC018105h9 || enumC018105h6 == EnumC018105h.FIXED || enumC018105h6 == EnumC018105h.WRAP_CONTENT)) {
                    int width = next.getWidth();
                    if (enumC018105h5 == enumC018105h9) {
                        width = (c40061hi.getWidth() - next.mLeft.LJI) - next.mRight.LJI;
                        enumC018105h5 = EnumC018105h.FIXED;
                    }
                    int height = next.getHeight();
                    if (enumC018105h6 == enumC018105h9) {
                        height = (c40061hi.getHeight() - next.mTop.LJI) - next.mBottom.LJI;
                        enumC018105h6 = EnumC018105h.FIXED;
                    }
                    LJFF(next, enumC018105h5, width, enumC018105h6, height);
                    next.horizontalRun.LJ.LIZLLL(next.getWidth());
                    next.verticalRun.LJ.LIZLLL(next.getHeight());
                    next.measured = true;
                } else {
                    if (enumC018105h5 == enumC018105h8 && (enumC018105h6 == (enumC018105h4 = EnumC018105h.WRAP_CONTENT) || enumC018105h6 == EnumC018105h.FIXED)) {
                        if (i == 3) {
                            if (enumC018105h6 == enumC018105h4) {
                                LJFF(next, enumC018105h4, 0, enumC018105h4, 0);
                            }
                            int height2 = next.getHeight();
                            int i3 = (int) ((height2 * next.mDimensionRatio) + 0.5f);
                            EnumC018105h enumC018105h10 = EnumC018105h.FIXED;
                            LJFF(next, enumC018105h10, i3, enumC018105h10, height2);
                            next.horizontalRun.LJ.LIZLLL(next.getWidth());
                            next.verticalRun.LJ.LIZLLL(next.getHeight());
                            next.measured = true;
                        } else if (i == 1) {
                            LJFF(next, enumC018105h4, 0, enumC018105h6, 0);
                            next.horizontalRun.LJ.LJIIL = next.getWidth();
                        } else if (i == 2) {
                            EnumC018105h enumC018105h11 = c40061hi.mListDimensionBehaviors[0];
                            EnumC018105h enumC018105h12 = EnumC018105h.FIXED;
                            if (enumC018105h11 == enumC018105h12 || enumC018105h11 == enumC018105h9) {
                                LJFF(next, enumC018105h12, (int) ((f * c40061hi.getWidth()) + 0.5f), enumC018105h6, next.getHeight());
                                next.horizontalRun.LJ.LIZLLL(next.getWidth());
                                next.verticalRun.LJ.LIZLLL(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            C017905f[] c017905fArr = next.mListAnchors;
                            if (c017905fArr[0].LJFF == null || c017905fArr[1].LJFF == null) {
                                LJFF(next, enumC018105h4, 0, enumC018105h6, 0);
                                next.horizontalRun.LJ.LIZLLL(next.getWidth());
                                next.verticalRun.LJ.LIZLLL(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                    if (enumC018105h6 == enumC018105h8 && (enumC018105h5 == (enumC018105h3 = EnumC018105h.WRAP_CONTENT) || enumC018105h5 == EnumC018105h.FIXED)) {
                        if (i2 == 3) {
                            if (enumC018105h5 == enumC018105h3) {
                                LJFF(next, enumC018105h3, 0, enumC018105h3, 0);
                            }
                            int width2 = next.getWidth();
                            float f3 = next.mDimensionRatio;
                            if (next.mDimensionRatioSide == -1) {
                                f3 = 1.0f / f3;
                            }
                            EnumC018105h enumC018105h13 = EnumC018105h.FIXED;
                            LJFF(next, enumC018105h13, width2, enumC018105h13, (int) ((width2 * f3) + 0.5f));
                            next.horizontalRun.LJ.LIZLLL(next.getWidth());
                            next.verticalRun.LJ.LIZLLL(next.getHeight());
                            next.measured = true;
                        } else if (i2 == 1) {
                            LJFF(next, enumC018105h5, 0, enumC018105h3, 0);
                            next.verticalRun.LJ.LJIIL = next.getHeight();
                        } else if (i2 == 2) {
                            EnumC018105h enumC018105h14 = c40061hi.mListDimensionBehaviors[1];
                            EnumC018105h enumC018105h15 = EnumC018105h.FIXED;
                            if (enumC018105h14 == enumC018105h15 || enumC018105h14 == enumC018105h9) {
                                LJFF(next, enumC018105h5, next.getWidth(), enumC018105h15, (int) ((f2 * c40061hi.getHeight()) + 0.5f));
                                next.horizontalRun.LJ.LIZLLL(next.getWidth());
                                next.verticalRun.LJ.LIZLLL(next.getHeight());
                                next.measured = true;
                            }
                        } else {
                            C017905f[] c017905fArr2 = next.mListAnchors;
                            if (c017905fArr2[2].LJFF == null || c017905fArr2[3].LJFF == null) {
                                LJFF(next, enumC018105h3, 0, enumC018105h6, 0);
                                next.horizontalRun.LJ.LIZLLL(next.getWidth());
                                next.verticalRun.LJ.LIZLLL(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                    if (enumC018105h5 == enumC018105h8 && enumC018105h6 == enumC018105h8) {
                        if (i == 1 || i2 == 1) {
                            EnumC018105h enumC018105h16 = EnumC018105h.WRAP_CONTENT;
                            LJFF(next, enumC018105h16, 0, enumC018105h16, 0);
                            next.horizontalRun.LJ.LJIIL = next.getWidth();
                            next.verticalRun.LJ.LJIIL = next.getHeight();
                        } else if (i2 == 2 && i == 2 && ((enumC018105h = (enumC018105hArr = c40061hi.mListDimensionBehaviors)[0]) == (enumC018105h2 = EnumC018105h.FIXED) || enumC018105h == enumC018105h2)) {
                            EnumC018105h enumC018105h17 = enumC018105hArr[1];
                            if (enumC018105h17 == enumC018105h2 || enumC018105h17 == enumC018105h2) {
                                LJFF(next, enumC018105h2, (int) ((f * c40061hi.getWidth()) + 0.5f), enumC018105h2, (int) ((f2 * c40061hi.getHeight()) + 0.5f));
                                next.horizontalRun.LJ.LIZLLL(next.getWidth());
                                next.verticalRun.LJ.LIZLLL(next.getHeight());
                                next.measured = true;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r20 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(X.C40061hi r19, int r20) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16C.LIZLLL(X.1hi, int):int");
    }

    public final void LJ(AbstractC39241gO abstractC39241gO, int i, ArrayList<C16G> arrayList) {
        Iterator it = ((ArrayList) abstractC39241gO.LJII.LJIIJ).iterator();
        while (it.hasNext()) {
            C16B c16b = (C16B) it.next();
            if (c16b instanceof C39231gN) {
                LIZ((C39231gN) c16b, i, 0, arrayList, null);
            } else if (c16b instanceof AbstractC39241gO) {
                LIZ(((AbstractC39241gO) c16b).LJII, i, 0, arrayList, null);
            }
        }
        Iterator it2 = ((ArrayList) abstractC39241gO.LJIIIIZZ.LJIIJ).iterator();
        while (it2.hasNext()) {
            C16B c16b2 = (C16B) it2.next();
            if (c16b2 instanceof C39231gN) {
                LIZ((C39231gN) c16b2, i, 1, arrayList, null);
            } else if (c16b2 instanceof AbstractC39241gO) {
                LIZ(((AbstractC39241gO) c16b2).LJIIIIZZ, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((ArrayList) ((C45031pj) abstractC39241gO).LJIIJ.LJIIJ).iterator();
            while (it3.hasNext()) {
                C16B c16b3 = (C16B) it3.next();
                if (c16b3 instanceof C39231gN) {
                    LIZ((C39231gN) c16b3, 1, 2, arrayList, null);
                }
            }
        }
    }

    public final void LIZ(C39231gN c39231gN, int i, int i2, ArrayList arrayList, C16G c16g) {
        int i3;
        C16G c16g2 = c16g;
        AbstractC39241gO abstractC39241gO = c39231gN.LIZLLL;
        if (abstractC39241gO.LIZJ == null) {
            C16C c16c = this;
            C40061hi c40061hi = c16c.LIZ;
            if (abstractC39241gO == c40061hi.horizontalRun || abstractC39241gO == c40061hi.verticalRun) {
                return;
            }
            ArrayList arrayList2 = arrayList;
            if (c16g2 == null) {
                c16g2 = new C16G(abstractC39241gO);
                arrayList2.add(c16g2);
            }
            abstractC39241gO.LIZJ = c16g2;
            c16g2.LIZIZ.add(abstractC39241gO);
            Iterator it = ((ArrayList) abstractC39241gO.LJII.LJIIJ).iterator();
            while (true) {
                i3 = i;
                if (!it.hasNext()) {
                    break;
                }
                C16B c16b = (C16B) it.next();
                if (c16b instanceof C39231gN) {
                    c16c.LIZ((C39231gN) c16b, i3, 0, arrayList2, c16g2);
                }
            }
            Iterator it2 = ((ArrayList) abstractC39241gO.LJIIIIZZ.LJIIJ).iterator();
            while (it2.hasNext()) {
                C16B c16b2 = (C16B) it2.next();
                if (c16b2 instanceof C39231gN) {
                    c16c.LIZ((C39231gN) c16b2, i3, 1, arrayList2, c16g2);
                }
            }
            if (i3 == 1 && (abstractC39241gO instanceof C45031pj)) {
                Iterator it3 = ((ArrayList) ((C45031pj) abstractC39241gO).LJIIJ.LJIIJ).iterator();
                while (it3.hasNext()) {
                    C16B c16b3 = (C16B) it3.next();
                    if (c16b3 instanceof C39231gN) {
                        c16c.LIZ((C39231gN) c16b3, 1, 2, arrayList2, c16g2);
                    }
                }
            }
            Iterator it4 = ((ArrayList) abstractC39241gO.LJII.LJIIJJI).iterator();
            while (it4.hasNext()) {
                c16c.LIZ((C39231gN) it4.next(), i3, 0, arrayList2, c16g2);
            }
            Iterator it5 = ((ArrayList) abstractC39241gO.LJIIIIZZ.LJIIJJI).iterator();
            while (it5.hasNext()) {
                c16c = c16c;
                i3 = i3;
                arrayList2 = arrayList2;
                c16g2 = c16g2;
                c16c.LIZ((C39231gN) it5.next(), i3, 1, arrayList2, c16g2);
            }
            if (i3 != 1 || !(abstractC39241gO instanceof C45031pj)) {
                return;
            }
            Iterator it6 = ((ArrayList) ((C45031pj) abstractC39241gO).LJIIJ.LJIIJJI).iterator();
            while (it6.hasNext()) {
                c16c.LIZ((C39231gN) it6.next(), 1, 2, arrayList2, c16g2);
            }
        }
    }

    public final void LJFF(C018205i c018205i, EnumC018105h enumC018105h, int i, EnumC018105h enumC018105h2, int i2) {
        AnonymousClass168 anonymousClass168 = this.LJI;
        anonymousClass168.LIZ = enumC018105h;
        anonymousClass168.LIZIZ = enumC018105h2;
        anonymousClass168.LIZJ = i;
        anonymousClass168.LIZLLL = i2;
        ((C1AG) this.LJFF).LIZIZ(c018205i, anonymousClass168);
        c018205i.setWidth(this.LJI.LJ);
        c018205i.setHeight(this.LJI.LJFF);
        AnonymousClass168 anonymousClass1682 = this.LJI;
        c018205i.hasBaseline = anonymousClass1682.LJII;
        c018205i.setBaselineDistance(anonymousClass1682.LJI);
    }
}
