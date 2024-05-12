package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: X.1Xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC34621Xm<T, VH extends RecyclerView.ViewHolder> extends AbstractC029409q<VH> {
    public final C18960om<T> LJLIL;

    @Override // X.AbstractC029409q
    public int getItemCount() {
        C18960om<T> c18960om = this.LJLIL;
        AbstractC19190p9<T> abstractC19190p9 = c18960om.LJFF;
        if (abstractC19190p9 != null) {
            return abstractC19190p9.size();
        }
        AbstractC19190p9<T> abstractC19190p92 = c18960om.LJI;
        if (abstractC19190p92 == null) {
            return 0;
        }
        return abstractC19190p92.size();
    }

    public AbstractC34621Xm(AbstractC03160Am<T> abstractC03160Am) {
        C19200pA c19200pA = new C19200pA(this);
        C18960om<T> c18960om = new C18960om<>(this, abstractC03160Am);
        this.LJLIL = c18960om;
        c18960om.LIZLLL = c19200pA;
    }

    public final void LJLLLLLL(final AbstractC19190p9<T> abstractC19190p9) {
        AbstractC19190p9<T> abstractC19190p92;
        int size;
        C18960om<T> c18960om = this.LJLIL;
        if (abstractC19190p9 != null) {
            if (c18960om.LJFF == null && c18960om.LJI == null) {
                c18960om.LJ = abstractC19190p9.LJIILLIIL();
            } else if (abstractC19190p9.LJIILLIIL() != c18960om.LJ) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i = c18960om.LJII + 1;
        c18960om.LJII = i;
        AbstractC19190p9<T> abstractC19190p93 = c18960om.LJFF;
        if (abstractC19190p9 == abstractC19190p93) {
            return;
        }
        if (abstractC19190p9 == null) {
            if (abstractC19190p93 != null) {
                size = abstractC19190p93.size();
            } else {
                AbstractC19190p9<T> abstractC19190p94 = c18960om.LJI;
                if (abstractC19190p94 == null) {
                    size = 0;
                } else {
                    size = abstractC19190p94.size();
                }
            }
            AbstractC19190p9<T> abstractC19190p95 = c18960om.LJFF;
            if (abstractC19190p95 != null) {
                abstractC19190p95.LJJIFFI(c18960om.LJIIIIZZ);
                c18960om.LJFF = null;
            } else if (c18960om.LJI != null) {
                c18960om.LJI = null;
            }
            c18960om.LIZ.LJJIJLIJ(0, size);
            C19200pA c19200pA = c18960om.LIZLLL;
            if (c19200pA == null) {
                return;
            }
            c19200pA.LIZ.getClass();
            return;
        }
        if (abstractC19190p93 == null) {
            if (c18960om.LJI == null) {
                c18960om.LJFF = abstractC19190p9;
                abstractC19190p9.LIZJ(null, c18960om.LJIIIIZZ);
                c18960om.LIZ.LJLIIIL(0, abstractC19190p9.size());
                C19200pA c19200pA2 = c18960om.LIZLLL;
                if (c19200pA2 == null) {
                    return;
                }
                c19200pA2.LIZ.getClass();
                return;
            }
        } else {
            abstractC19190p93.LJJIFFI(c18960om.LJIIIIZZ);
            final AbstractC19190p9<T> abstractC19190p96 = c18960om.LJFF;
            if (!abstractC19190p96.LJIJ()) {
                abstractC19190p96 = new AbstractC19190p9<T>(abstractC19190p96) { // from class: X.1Xs
                    public final boolean LJLLLL;
                    public final Object LJLLLLLL;
                    public final AbstractC19010or<?, T> LJLZ;

                    @Override // X.AbstractC19190p9
                    public final void LJIIIZ(AbstractC19190p9 abstractC19190p97, C34521Xc c34521Xc) {
                    }

                    @Override // X.AbstractC19190p9
                    public final boolean LJIIZILJ() {
                        return true;
                    }

                    @Override // X.AbstractC19190p9
                    public final boolean LJIJ() {
                        return true;
                    }

                    @Override // X.AbstractC19190p9
                    public final void LJIJJLI(int i2) {
                    }

                    @Override // X.AbstractC19190p9
                    public final AbstractC19010or<?, T> LJIIJ() {
                        return this.LJLZ;
                    }

                    @Override // X.AbstractC19190p9
                    public final Object LJIILJJIL() {
                        return this.LJLLLLLL;
                    }

                    @Override // X.AbstractC19190p9
                    public final boolean LJIILLIIL() {
                        return this.LJLLLL;
                    }

                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        /*
                            r7 = this;
                            X.0pB<T> r0 = r8.LJLJJL
                            r0.getClass()
                            X.0pB r2 = new X.0pB
                            r2.<init>(r0)
                            java.util.concurrent.Executor r3 = r8.LJLIL
                            java.util.concurrent.Executor r4 = r8.LJLILLLLZI
                            r5 = 0
                            X.0p8 r6 = r8.LJLJJI
                            r1 = r7
                            r1.<init>(r2, r3, r4, r5, r6)
                            X.0or r0 = r8.LJIIJ()
                            r1.LJLZ = r0
                            boolean r0 = r8.LJIILLIIL()
                            r1.LJLLLL = r0
                            int r0 = r8.LJLJJLL
                            r1.LJLJJLL = r0
                            java.lang.Object r0 = r8.LJIILJJIL()
                            r1.LJLLLLLL = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C34681Xs.<init>(X.0p9):void");
                    }
                };
            }
            c18960om.LJI = abstractC19190p96;
            c18960om.LJFF = null;
        }
        AbstractC19190p9<T> abstractC19190p97 = c18960om.LJI;
        if (abstractC19190p97 != null && c18960om.LJFF == null) {
            if (abstractC19190p9.LJIJ()) {
                abstractC19190p92 = abstractC19190p9;
            } else {
                abstractC19190p92 = new AbstractC19190p9<T>
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a4: CONSTRUCTOR (r7v0 'abstractC19190p92' X.0p9<T>) = (r11v0 'abstractC19190p9' X.0p9<T> A[DONT_INLINE]) A[GenericInfoAttr{[T], explicit=false}, MD:(X.0p9<T>):void (m)] (LINE:16777380) call: X.1Xs.<init>(X.0p9):void type: CONSTRUCTOR in method: X.1Xm.LJLLLLLL(X.0p9<T>):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:810)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 37 more
                    */
                /*
                    this = this;
                    X.0om<T> r5 = r10.LJLIL
                    r9 = r11
                    if (r9 == 0) goto L13
                    X.0p9<T> r0 = r5.LJFF
                    if (r0 != 0) goto Laf
                    X.0p9<T> r0 = r5.LJI
                    if (r0 != 0) goto Laf
                    boolean r0 = r9.LJIILLIIL()
                    r5.LJ = r0
                L13:
                    int r0 = r5.LJII
                    int r8 = r0 + 1
                    r5.LJII = r8
                    X.0p9<T> r1 = r5.LJFF
                    if (r9 != r1) goto L1e
                L1d:
                    return
                L1e:
                    r4 = 0
                    r3 = 0
                    if (r9 != 0) goto L54
                    if (r1 == 0) goto L49
                    int r2 = r1.size()
                L28:
                    X.0p9<T> r1 = r5.LJFF
                    if (r1 == 0) goto L42
                    X.1Xc r0 = r5.LJIIIIZZ
                    r1.LJJIFFI(r0)
                    r5.LJFF = r3
                L33:
                    X.1Bd r0 = r5.LIZ
                    r0.LJJIJLIJ(r4, r2)
                    X.0pA r0 = r5.LIZLLL
                    if (r0 == 0) goto L1d
                    X.1Xm r0 = r0.LIZ
                    r0.getClass()
                    goto L1d
                L42:
                    X.0p9<T> r0 = r5.LJI
                    if (r0 == 0) goto L33
                    r5.LJI = r3
                    goto L33
                L49:
                    X.0p9<T> r0 = r5.LJI
                    if (r0 != 0) goto L4f
                    r2 = 0
                    goto L28
                L4f:
                    int r2 = r0.size()
                    goto L28
                L54:
                    if (r1 != 0) goto L74
                    X.0p9<T> r0 = r5.LJI
                    if (r0 != 0) goto L85
                    r5.LJFF = r9
                    X.1Xc r0 = r5.LJIIIIZZ
                    r9.LIZJ(r3, r0)
                    X.1Bd r1 = r5.LIZ
                    int r0 = r9.size()
                    r1.LJLIIIL(r4, r0)
                    X.0pA r0 = r5.LIZLLL
                    if (r0 == 0) goto L1d
                    X.1Xm r0 = r0.LIZ
                    r0.getClass()
                    goto L1d
                L74:
                    X.1Xc r0 = r5.LJIIIIZZ
                    r1.LJJIFFI(r0)
                    X.0p9<T> r1 = r5.LJFF
                    boolean r0 = r1.LJIJ()
                    if (r0 == 0) goto La8
                L81:
                    r5.LJI = r1
                    r5.LJFF = r3
                L85:
                    X.0p9<T> r6 = r5.LJI
                    if (r6 == 0) goto Lb9
                    X.0p9<T> r0 = r5.LJFF
                    if (r0 != 0) goto Lb9
                    boolean r0 = r9.LJIJ()
                    if (r0 == 0) goto La2
                    r7 = r9
                L94:
                    X.0AL<T> r0 = r5.LIZIZ
                    java.util.concurrent.Executor r0 = r0.LIZ
                    X.0on r4 = new X.0on
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.execute(r4)
                    goto L1d
                La2:
                    X.1Xs r7 = new X.1Xs
                    r7.<init>(r9)
                    goto L94
                La8:
                    X.1Xs r0 = new X.1Xs
                    r0.<init>(r1)
                    r1 = r0
                    goto L81
                Laf:
                    boolean r1 = r9.LJIILLIIL()
                    boolean r0 = r5.LJ
                    if (r1 != r0) goto Lc1
                    goto L13
                Lb9:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "must be in snapshot state to diff"
                    r1.<init>(r0)
                    throw r1
                Lc1:
                    java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists."
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34621Xm.LJLLLLLL(X.0p9):void");
            }
        }
