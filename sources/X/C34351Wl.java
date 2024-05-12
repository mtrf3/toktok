package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34351Wl extends AbstractC16010k1 {
    public final ParcelableSnapshotMutableState LJLJJLL = C78966Uyw.LJJJIL(new C10430b1(C10430b1.LIZIZ));
    public final ParcelableSnapshotMutableState LJLJL = C78966Uyw.LJJJIL(Boolean.FALSE);
    public final C34311Wh LJLJLJ;
    public InterfaceC24790yB LJLJLLL;
    public final ParcelableSnapshotMutableState LJLL;
    public float LJLLI;
    public C11890dN LJLLILLLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC16010k1
    public final long LJI() {
        return ((C10430b1) this.LJLJJLL.getValue()).LIZ;
    }

    public C34351Wl() {
        C34311Wh c34311Wh = new C34311Wh();
        c34311Wh.LJ = new IDqS420S0100000(this, 135);
        this.LJLJLJ = c34311Wh;
        this.LJLL = C78966Uyw.LJJJIL(Boolean.TRUE);
        this.LJLLI = 1.0f;
    }

    @Override // X.AbstractC16010k1
    public final boolean LIZ(float f) {
        this.LJLLI = f;
        return true;
    }

    @Override // X.AbstractC16010k1
    public final boolean LJ(C11890dN c11890dN) {
        this.LJLLILLLL = c11890dN;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC16010k1
    public final void LJII(InterfaceC33691Tx interfaceC33691Tx) {
        o.LJIIIZ(interfaceC33691Tx, "<this>");
        C34311Wh c34311Wh = this.LJLJLJ;
        C11890dN c11890dN = this.LJLLILLLL;
        if (c11890dN == null) {
            c11890dN = (C11890dN) c34311Wh.LJFF.getValue();
        }
        if (((Boolean) this.LJLJL.getValue()).booleanValue() && interfaceC33691Tx.getLayoutDirection() == EnumC23500w6.Rtl) {
            long LJJL = interfaceC33691Tx.LJJL();
            C33681Tw LJJIII = interfaceC33691Tx.LJJIII();
            long LIZIZ = LJJIII.LIZIZ();
            LJJIII.LIZ().LJIIL();
            LJJIII.LIZ.LJ(LJJL);
            c34311Wh.LJ(interfaceC33691Tx, this.LJLLI, c11890dN);
            LJJIII.LIZ().LJIIJ();
            LJJIII.LIZJ(LIZIZ);
        } else {
            c34311Wh.LJ(interfaceC33691Tx, this.LJLLI, c11890dN);
        }
        if (((Boolean) this.LJLL.getValue()).booleanValue()) {
            this.LJLL.setValue(Boolean.FALSE);
        }
    }

    public final void LJIIIIZZ(String name, float f, float f2, InterfaceC88474Ynu<? super Float, ? super Float, ? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1264894527);
        C34311Wh c34311Wh = this.LJLJLJ;
        c34311Wh.getClass();
        C1W5 c1w5 = c34311Wh.LIZIZ;
        c1w5.getClass();
        c1w5.LJIIIIZZ = name;
        c1w5.LIZJ();
        if (c34311Wh.LJI != f) {
            c34311Wh.LJI = f;
            c34311Wh.LIZJ = true;
            c34311Wh.LJ.invoke();
        }
        if (c34311Wh.LJII != f2) {
            c34311Wh.LJII = f2;
            c34311Wh.LIZJ = true;
            c34311Wh.LJ.invoke();
        }
        AbstractC24810yD LJJ = C78929UyL.LJJ(LJIL);
        InterfaceC24790yB interfaceC24790yB = this.LJLJLLL;
        if (interfaceC24790yB == null || interfaceC24790yB.isDisposed()) {
            final C1W5 c1w52 = this.LJLJLJ.LIZIZ;
            interfaceC24790yB = C24330xR.LIZ(new AbstractC35801aq<AbstractC17600ma>(c1w52) { // from class: X.1n7
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC35801aq
                public final void LJIIIZ() {
                    C1W5 LJIIJ = LJIIJ((AbstractC17600ma) this.LIZ);
                    LJIIJ.LJ(0, ((ArrayList) LJIIJ.LIZJ).size());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(c1w52);
                    o.LJIIIZ(c1w52, "root");
                }

                public static C1W5 LJIIJ(AbstractC17600ma abstractC17600ma) {
                    if (abstractC17600ma instanceof C1W5) {
                        return (C1W5) abstractC17600ma;
                    }
                    "Cannot only insert VNode into Group".toString();
                    throw new IllegalStateException("Cannot only insert VNode into Group");
                }

                @Override // X.InterfaceC24420xa
                public final void LIZJ(int i2, Object instance) {
                    o.LJIIIZ(instance, "instance");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC24420xa
                public final void LJ(int i2, int i3) {
                    LJIIJ((AbstractC17600ma) this.LIZJ).LJ(i2, i3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC24420xa
                public final void LJII(int i2, Object obj) {
                    AbstractC17600ma instance = (AbstractC17600ma) obj;
                    o.LJIIIZ(instance, "instance");
                    C1W5 LJIIJ = LJIIJ((AbstractC17600ma) this.LIZJ);
                    LJIIJ.getClass();
                    if (i2 < ((ArrayList) LJIIJ.LIZJ).size()) {
                        ListProtector.set(LJIIJ.LIZJ, i2, instance);
                    } else {
                        ((ArrayList) LJIIJ.LIZJ).add(instance);
                    }
                    instance.LIZLLL(LJIIJ.LJII);
                    LJIIJ.LIZJ();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC24420xa
                public final void LJI(int i2, int i3, int i4) {
                    C1W5 LJIIJ = LJIIJ((AbstractC17600ma) this.LIZJ);
                    LJIIJ.getClass();
                    int i5 = 0;
                    if (i2 > i3) {
                        while (i5 < i4) {
                            Object obj = ListProtector.get(LJIIJ.LIZJ, i2);
                            ListProtector.remove(LJIIJ.LIZJ, i2);
                            ListProtector.add(LJIIJ.LIZJ, i3, obj);
                            i3++;
                            i5++;
                        }
                    } else {
                        while (i5 < i4) {
                            Object obj2 = ListProtector.get(LJIIJ.LIZJ, i2);
                            ListProtector.remove(LJIIJ.LIZJ, i2);
                            ListProtector.add(LJIIJ.LIZJ, i3 - 1, obj2);
                            i5++;
                        }
                    }
                    LJIIJ.LIZJ();
                }
            }, LJJ);
        }
        this.LJLJLLL = interfaceC24790yB;
        interfaceC24790yB.LJIILJJIL(C1DJ.LJFF(new IDqS189S0200000((InterfaceC88474Ynu) content, (InterfaceC88474Ynu<? super Float, ? super Float, ? super InterfaceC24520xk, ? super Integer, C76800UCe>) this, (C34351Wl) 8), -1916507005, true));
        C24610xt.LIZIZ(interfaceC24790yB, new IDqS416S0100000(interfaceC24790yB, 255), LJIL);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new AnonymousClass230(this, name, f, f2, content, i);
    }
}
