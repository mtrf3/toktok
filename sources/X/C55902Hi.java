package X;

import defpackage.a1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55902Hi implements InterfaceC536028m {
    public EnumC23500w6 LJLIL = EnumC23500w6.Rtl;
    public float LJLILLLLZI;
    public float LJLJI;
    public final /* synthetic */ AnonymousClass164 LJLJJI;

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJIJ(long j) {
        return a1.LIZIZ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ int LJJIJ(float f) {
        return a1.LIZ(f, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ float LJJIJL(long j) {
        return a1.LIZJ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJJLI(long j) {
        return a1.LIZLLL(j, this);
    }

    @Override // X.InterfaceC44861pS
    public final /* synthetic */ InterfaceC273515n LJJLIL(int i, int i2, java.util.Map map, InterfaceC88472Yns interfaceC88472Yns) {
        return C0ON.LIZ(i, i2, this, map, interfaceC88472Yns);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC39181gI
    public final EnumC23500w6 getLayoutDirection() {
        return this.LJLIL;
    }

    public C55902Hi(AnonymousClass164 anonymousClass164) {
        this.LJLJJI = anonymousClass164;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return getDensity() * f;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return i / this.LJLILLLLZI;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return f / getDensity();
    }

    @Override // X.InterfaceC536028m
    public final List<InterfaceC39071g7> LJJJJL(Object obj, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content) {
        C29321Dc c29321Dc;
        o.LJIIIZ(content, "content");
        AnonymousClass164 anonymousClass164 = this.LJLJJI;
        anonymousClass164.getClass();
        anonymousClass164.LIZIZ();
        Iterator<Object> it = anonymousClass164.LJIIL.iterator();
        while (it.hasNext()) {
            AnonymousClass161 anonymousClass161 = (AnonymousClass161) ((LinkedHashMap) anonymousClass164.LJ).get(((LinkedHashMap) anonymousClass164.LJII).get(it.next()));
            if (anonymousClass161 != null) {
                InterfaceC24790yB interfaceC24790yB = anonymousClass161.LIZJ;
                if (anonymousClass161.LJFF && interfaceC24790yB != null && interfaceC24790yB.LIZIZ()) {
                    interfaceC24790yB.LIZJ();
                    interfaceC24790yB.LJIIL(false);
                    anonymousClass161.LJFF = false;
                    anonymousClass161.LIZLLL = false;
                }
            }
        }
        anonymousClass164.LJIIL.clear();
        C0DK c0dk = anonymousClass164.LIZ.LLIFFJFJJ.LIZIZ;
        if (c0dk == C0DK.Measuring || c0dk == C0DK.LayingOut) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) anonymousClass164.LJFF;
            Object obj2 = linkedHashMap.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                C29321Dc remove = anonymousClass164.LJII.remove(obj);
                if (remove != null) {
                    int i = anonymousClass164.LJIIJ;
                    if (i > 0) {
                        anonymousClass164.LJIIJ = i - 1;
                        c29321Dc = remove;
                    } else {
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    C29321Dc LJ = anonymousClass164.LJ(obj);
                    c29321Dc = LJ;
                    if (LJ == null) {
                        int i2 = anonymousClass164.LIZLLL;
                        C29321Dc c29321Dc2 = new C29321Dc(true, 2, 0);
                        C29321Dc c29321Dc3 = anonymousClass164.LIZ;
                        c29321Dc3.LJLL = true;
                        c29321Dc3.LJJIFFI(i2, c29321Dc2);
                        c29321Dc3.LJLL = false;
                        c29321Dc = c29321Dc2;
                    }
                }
                linkedHashMap.put(obj, c29321Dc);
                obj3 = c29321Dc;
            }
            C29321Dc c29321Dc4 = (C29321Dc) obj3;
            int indexOf = anonymousClass164.LIZ.LJIJJ().indexOf(c29321Dc4);
            int i3 = anonymousClass164.LIZLLL;
            if (indexOf >= i3) {
                if (i3 != indexOf) {
                    C29321Dc c29321Dc5 = anonymousClass164.LIZ;
                    c29321Dc5.LJLL = true;
                    c29321Dc5.LJJIJIL(indexOf, i3, 1);
                    c29321Dc5.LJLL = false;
                }
                anonymousClass164.LIZLLL++;
                anonymousClass164.LIZLLL(c29321Dc4, obj, content);
                return c29321Dc4.LJIJ();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Key ");
            LIZ.append(obj);
            LIZ.append(" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        "subcompose can only be used inside the measure or layout blocks".toString();
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
    }
}
