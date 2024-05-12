package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GqJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42759GqJ {
    public static final /* synthetic */ int LIZ = 0;

    public static QXX LIZIZ(EnumC42934Gt8 type) {
        o.LJIIIZ(type, "type");
        int i = C42760GqK.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new C42765GqP();
                }
                return new C42766GqQ();
            }
            return new C42766GqQ();
        }
        return new C42767GqR();
    }

    public static void LIZJ(EnumC42934Gt8 type) {
        o.LJIIIZ(type, "type");
    }

    public static AbstractC42751GqB LIZ(InterfaceC42726Gpm interfaceC42726Gpm, EnumC42934Gt8 type) {
        o.LJIIIZ(type, "type");
        int i = C42760GqK.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new C42761GqL(interfaceC42726Gpm);
                }
                return new C42757GqH(interfaceC42726Gpm);
            }
            return new C42758GqI(interfaceC42726Gpm);
        }
        return new C42757GqH(interfaceC42726Gpm);
    }
}
