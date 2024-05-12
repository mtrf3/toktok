package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.164, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass164 {
    public final C29321Dc LIZ;
    public AbstractC24810yD LIZIZ;
    public InterfaceC272515d LIZJ;
    public int LIZLLL;
    public final java.util.Map<C29321Dc, AnonymousClass161> LJ;
    public final java.util.Map<Object, C29321Dc> LJFF;
    public final C55902Hi LJI;
    public final java.util.Map<Object, C29321Dc> LJII;
    public final C39051g5 LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final String LJIIJJI;
    public final java.util.Set<Object> LJIIL;

    public final void LIZIZ() {
        if (this.LJ.size() == this.LIZ.LJIJJ().size()) {
            if ((this.LIZ.LJIJJ().size() - this.LJIIIZ) - this.LJIIJ >= 0) {
                if (this.LJII.size() == this.LJIIJ) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Incorrect state. Precomposed children ");
                LIZ.append(this.LJIIJ);
                LIZ.append(". Map size ");
                LIZ.append(this.LJII.size());
                String LIZIZ = X1D.LIZIZ(LIZ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Incorrect state. Total children ");
            LIZ2.append(this.LIZ.LJIJJ().size());
            LIZ2.append(". Reusable children ");
            LIZ2.append(this.LJIIIZ);
            LIZ2.append(". Precomposed children ");
            LIZ2.append(this.LJIIJ);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            LIZIZ2.toString();
            throw new IllegalArgumentException(LIZIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Inconsistency between the count of nodes tracked by the state (");
        LIZ3.append(this.LJ.size());
        LIZ3.append(") and the children count on the SubcomposeLayout (");
        LIZ3.append(this.LIZ.LJIJJ().size());
        LIZ3.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
        String LIZIZ3 = X1D.LIZIZ(LIZ3);
        LIZIZ3.toString();
        throw new IllegalArgumentException(LIZIZ3);
    }

    public final void LIZ(int i) {
        this.LJIIIZ = 0;
        int size = (this.LIZ.LJIJJ().size() - this.LJIIJ) - 1;
        if (i <= size) {
            this.LJIIIIZZ.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    C39051g5 c39051g5 = this.LJIIIIZZ;
                    Object obj = ((LinkedHashMap) this.LJ).get(ListProtector.get(this.LIZ.LJIJJ(), i2));
                    o.LJI(obj);
                    c39051g5.LJLIL.add(((AnonymousClass161) obj).LIZ);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.LIZJ.LIZ(this.LJIIIIZZ);
            while (size >= i) {
                C29321Dc c29321Dc = (C29321Dc) ListProtector.get(this.LIZ.LJIJJ(), size);
                Object obj2 = ((LinkedHashMap) this.LJ).get(c29321Dc);
                o.LJI(obj2);
                AnonymousClass161 anonymousClass161 = (AnonymousClass161) obj2;
                Object obj3 = anonymousClass161.LIZ;
                if (this.LJIIIIZZ.contains(obj3)) {
                    C0DL c0dl = C0DL.NotUsed;
                    c29321Dc.getClass();
                    o.LJIIIZ(c0dl, "<set-?>");
                    c29321Dc.LLF = c0dl;
                    this.LJIIIZ++;
                    anonymousClass161.LJ.setValue(Boolean.FALSE);
                } else {
                    C29321Dc c29321Dc2 = this.LIZ;
                    c29321Dc2.LJLL = true;
                    this.LJ.remove(c29321Dc);
                    InterfaceC24790yB interfaceC24790yB = anonymousClass161.LIZJ;
                    if (interfaceC24790yB != null) {
                        interfaceC24790yB.dispose();
                    }
                    this.LIZ.LJJIZ(size, 1);
                    c29321Dc2.LJLL = false;
                }
                this.LJFF.remove(obj3);
                size--;
            }
        }
        LIZIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r2 == (-1)) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C29321Dc LJ(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.LJIIIZ
            r3 = 0
            if (r0 != 0) goto L6
            return r3
        L6:
            X.1Dc r0 = r8.LIZ
            java.util.List r0 = r0.LJIJJ()
            int r7 = r0.size()
            int r0 = r8.LJIIJ
            int r7 = r7 - r0
            int r0 = r8.LJIIIZ
            int r5 = r7 - r0
            r4 = 1
            int r7 = r7 - r4
            r2 = r7
        L1a:
            r6 = -1
            if (r2 < r5) goto L3e
            X.1Dc r0 = r8.LIZ
            java.util.List r0 = r0.LJIJJ()
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            java.util.Map<X.1Dc, X.161> r0 = r8.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            kotlin.jvm.internal.o.LJI(r0)
            X.161 r0 = (X.AnonymousClass161) r0
            java.lang.Object r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r9)
            if (r0 == 0) goto La2
            if (r2 != r6) goto L64
        L3e:
            if (r7 < r5) goto L66
            X.1Dc r0 = r8.LIZ
            java.util.List r0 = r0.LJIJJ()
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            java.util.Map<X.1Dc, X.161> r0 = r8.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r1)
            kotlin.jvm.internal.o.LJI(r2)
            X.161 r2 = (X.AnonymousClass161) r2
            X.15d r1 = r8.LIZJ
            java.lang.Object r0 = r2.LIZ
            boolean r0 = r1.LIZIZ(r9, r0)
            if (r0 == 0) goto L9f
            r2.LIZ = r9
            r2 = r7
        L64:
            if (r2 != r6) goto L67
        L66:
            return r3
        L67:
            if (r2 == r5) goto L73
            X.1Dc r1 = r8.LIZ
            r1.LJLL = r4
            r1.LJJIJIL(r2, r5, r4)
            r0 = 0
            r1.LJLL = r0
        L73:
            int r0 = r8.LJIIIZ
            int r0 = r0 + (-1)
            r8.LJIIIZ = r0
            X.1Dc r0 = r8.LIZ
            java.util.List r0 = r0.LJIJJ()
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            X.1Dc r3 = (X.C29321Dc) r3
            java.util.Map<X.1Dc, X.161> r0 = r8.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r3)
            kotlin.jvm.internal.o.LJI(r2)
            X.161 r2 = (X.AnonymousClass161) r2
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r2.LJ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setValue(r0)
            r2.LIZLLL = r4
            X.C0O8.LIZLLL()
            goto L66
        L9f:
            int r7 = r7 + (-1)
            goto L3e
        La2:
            int r2 = r2 + (-1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass164.LJ(java.lang.Object):X.1Dc");
    }

    public AnonymousClass164(C29321Dc root, InterfaceC272515d slotReusePolicy) {
        o.LJIIIZ(root, "root");
        o.LJIIIZ(slotReusePolicy, "slotReusePolicy");
        this.LIZ = root;
        this.LIZJ = slotReusePolicy;
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
        this.LJI = new C55902Hi(this);
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = new C39051g5(0);
        this.LJIIJJI = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
        this.LJIIL = new LinkedHashSet();
    }

    public final AnonymousClass166 LIZJ(Object obj, InterfaceC88471Ynr interfaceC88471Ynr) {
        C29321Dc c29321Dc;
        LIZIZ();
        if (!this.LJFF.containsKey(obj)) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJII;
            Object obj2 = linkedHashMap.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                C29321Dc LJ = LJ(obj);
                if (LJ != null) {
                    int indexOf = this.LIZ.LJIJJ().indexOf(LJ);
                    int size = this.LIZ.LJIJJ().size();
                    C29321Dc c29321Dc2 = this.LIZ;
                    c29321Dc2.LJLL = true;
                    c29321Dc2.LJJIJIL(indexOf, size, 1);
                    c29321Dc2.LJLL = false;
                    this.LJIIJ++;
                    c29321Dc = LJ;
                } else {
                    int size2 = this.LIZ.LJIJJ().size();
                    C29321Dc c29321Dc3 = new C29321Dc(true, 2, 0);
                    C29321Dc c29321Dc4 = this.LIZ;
                    c29321Dc4.LJLL = true;
                    c29321Dc4.LJJIFFI(size2, c29321Dc3);
                    c29321Dc4.LJLL = false;
                    this.LJIIJ++;
                    c29321Dc = c29321Dc3;
                }
                linkedHashMap.put(obj, c29321Dc);
                obj3 = c29321Dc;
            }
            LIZLLL((C29321Dc) obj3, obj, interfaceC88471Ynr);
        }
        return new AnonymousClass166(this, obj);
    }

    public final void LIZLLL(C29321Dc c29321Dc, Object obj, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        boolean z;
        C76800UCe c76800UCe;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJ;
        Object obj2 = linkedHashMap.get(c29321Dc);
        if (obj2 == null) {
            obj2 = new AnonymousClass161(obj, C273315l.LIZ);
            linkedHashMap.put(c29321Dc, obj2);
        }
        AnonymousClass161 anonymousClass161 = (AnonymousClass161) obj2;
        if (this.LJIIL.contains(obj)) {
            anonymousClass161.LJFF = true;
        }
        InterfaceC24790yB interfaceC24790yB = anonymousClass161.LIZJ;
        if (interfaceC24790yB != null) {
            z = interfaceC24790yB.LJIJ();
        } else {
            z = true;
        }
        if (anonymousClass161.LIZIZ != interfaceC88471Ynr || z || anonymousClass161.LIZLLL) {
            if (anonymousClass161.LIZJ instanceof C43991o3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("printInvalidations:");
                C43991o3 c43991o3 = (C43991o3) anonymousClass161.LIZJ;
                if (c43991o3 != null) {
                    C25690zd<C35991b9, C36441bs<Object>> c25690zd = c43991o3.LJLLJ;
                    int i = c25690zd.LIZJ;
                    for (int i2 = 0; i2 < i; i2++) {
                        Object obj3 = c25690zd.LIZ[i2];
                        o.LJII(obj3, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        C36441bs c36441bs = (C36441bs) c25690zd.LIZIZ[i2];
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(obj3);
                        LIZ2.append(", value:[");
                        X1D.LIZIZ(LIZ2);
                        if (c36441bs != null) {
                            int i3 = c36441bs.LJLIL;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj4 = c36441bs.get(i4);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(obj4);
                                LIZ3.append(',');
                                X1D.LIZIZ(LIZ3);
                            }
                        }
                    }
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                LIZ.append(c76800UCe);
                LIZ.append(' ');
                X1D.LIZIZ(LIZ);
            }
            o.LJIIIZ(interfaceC88471Ynr, "<set-?>");
            anonymousClass161.LIZIZ = interfaceC88471Ynr;
            C0OA LIZ4 = C0O8.LIZ();
            try {
                C0OA LJIIIIZZ = LIZ4.LJIIIIZZ();
                try {
                    C29321Dc c29321Dc2 = this.LIZ;
                    c29321Dc2.LJLL = true;
                    InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2 = anonymousClass161.LIZIZ;
                    boolean z2 = anonymousClass161.LJFF;
                    InterfaceC24790yB interfaceC24790yB2 = anonymousClass161.LIZJ;
                    AbstractC24810yD abstractC24810yD = this.LIZIZ;
                    if (abstractC24810yD != null) {
                        C40431iJ LJFF = C1DJ.LJFF(new IDqS189S0200000(anonymousClass161, (AnonymousClass161) interfaceC88471Ynr2, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) 12), -1750409193, true);
                        if (interfaceC24790yB2 == null || interfaceC24790yB2.isDisposed()) {
                            interfaceC24790yB2 = C24330xR.LIZ(new C40471iN(c29321Dc), abstractC24810yD);
                        }
                        interfaceC24790yB2.LJIIL(z2);
                        interfaceC24790yB2.LJIILJJIL(LJFF);
                        anonymousClass161.LIZJ = interfaceC24790yB2;
                        c29321Dc2.LJLL = false;
                        C0OA.LJIILJJIL(LJIIIIZZ);
                        LIZ4.LIZJ();
                        anonymousClass161.LIZLLL = false;
                        return;
                    }
                    "parent composition reference not set".toString();
                    throw new IllegalStateException("parent composition reference not set");
                } catch (Throwable th) {
                    C0OA.LJIILJJIL(LJIIIIZZ);
                    throw th;
                }
            } catch (Throwable th2) {
                LIZ4.LIZJ();
                throw th2;
            }
        }
    }
}
