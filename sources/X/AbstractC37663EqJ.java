package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EqJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37663EqJ<Input> {
    public final InterfaceC37666EqM LIZ;
    public final Input LIZIZ;

    public abstract EnumC37844EtE LIZ();

    public abstract InterfaceC37669EqP<Input> LIZIZ();

    public abstract Input LIZLLL(int i, String str);

    public final void LIZJ(InterfaceC37673EqT interfaceC37673EqT) {
        try {
            java.util.Map<String, ? extends Object> LIZ = LIZIZ().LIZ(this.LIZ.getClass(), this.LIZIZ);
            if (LIZ == null) {
                Input LIZLLL = LIZLLL(-2000, "processor.transformPlatformDataToMap failed");
                if (LIZLLL != null) {
                    interfaceC37673EqT.LIZ(LIZLLL);
                    return;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            this.LIZ.LIZIZ(LIZ, new C37665EqL(this, interfaceC37673EqT), LIZ());
        } catch (EGN e) {
            Input LIZLLL2 = LIZLLL(-5, e.toString());
            if (LIZLLL2 != null) {
                interfaceC37673EqT.LIZ(LIZLLL2);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } catch (EGP e2) {
            Input LIZLLL3 = LIZLLL(-2001, e2.toString());
            if (LIZLLL3 != null) {
                interfaceC37673EqT.LIZ(LIZLLL3);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } catch (EGQ e3) {
            Input LIZLLL4 = LIZLLL(-3, e3.toString());
            if (LIZLLL4 != null) {
                interfaceC37673EqT.LIZ(LIZLLL4);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } catch (Throwable th) {
            Input LIZLLL5 = LIZLLL(-1000, th.toString());
            if (LIZLLL5 != null) {
                interfaceC37673EqT.LIZ(LIZLLL5);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }

    public AbstractC37663EqJ(InterfaceC37666EqM bridge, Input input) {
        o.LJIIJ(bridge, "bridge");
        this.LIZ = bridge;
        this.LIZIZ = input;
    }
}
