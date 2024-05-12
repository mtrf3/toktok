package X;

import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Pkc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65338Pkc implements InterfaceC65332PkW {
    public final InterfaceC65335PkZ LJLIL;
    public final List<C65337Pkb> LJLILLLLZI;
    public final InterfaceC65332PkW LJLJI;
    public final int LJLJJI;

    public C65338Pkc() {
        throw null;
    }

    public final int hashCode() {
        return Integer.valueOf(this.LJLJJI).hashCode() + AnonymousClass391.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZIZ(false));
        LIZ.append(" (Kotlin reflection is not available)");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC65332PkW
    public final InterfaceC65335PkZ LJ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC65332PkW
    public final List<C65337Pkb> LJI() {
        return this.LJLILLLLZI;
    }

    public final String LIZIZ(boolean z) {
        String obj;
        String LLD;
        InterfaceC65350Pko interfaceC65350Pko;
        Class LIZ;
        InterfaceC65335PkZ interfaceC65335PkZ = this.LJLIL;
        if (!(interfaceC65335PkZ instanceof InterfaceC65350Pko) || (interfaceC65350Pko = (InterfaceC65350Pko) interfaceC65335PkZ) == null || (LIZ = C39557Ffl.LIZ(interfaceC65350Pko)) == null) {
            obj = this.LJLIL.toString();
        } else if ((this.LJLJJI & 4) != 0) {
            obj = "kotlin.Nothing";
        } else if (LIZ.isArray()) {
            if (o.LJ(LIZ, boolean[].class)) {
                obj = "kotlin.BooleanArray";
            } else if (o.LJ(LIZ, char[].class)) {
                obj = "kotlin.CharArray";
            } else if (o.LJ(LIZ, byte[].class)) {
                obj = "kotlin.ByteArray";
            } else if (o.LJ(LIZ, short[].class)) {
                obj = "kotlin.ShortArray";
            } else if (o.LJ(LIZ, int[].class)) {
                obj = "kotlin.IntArray";
            } else if (o.LJ(LIZ, float[].class)) {
                obj = "kotlin.FloatArray";
            } else if (o.LJ(LIZ, long[].class)) {
                obj = "kotlin.LongArray";
            } else if (o.LJ(LIZ, double[].class)) {
                obj = "kotlin.DoubleArray";
            } else {
                obj = "kotlin.Array";
            }
        } else if (z && LIZ.isPrimitive()) {
            InterfaceC65335PkZ interfaceC65335PkZ2 = this.LJLIL;
            o.LJII(interfaceC65335PkZ2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            obj = C39557Ffl.LIZIZ((InterfaceC65350Pko) interfaceC65335PkZ2).getName();
        } else {
            obj = LIZ.getName();
        }
        String str = "";
        if (this.LJLILLLLZI.isEmpty()) {
            LLD = "";
        } else {
            LLD = ORZ.LLD(this.LJLILLLLZI, ", ", "<", ">", new AqS177S0100000_11(this, 26), 24);
        }
        if ((this.LJLJJI & 1) != 0) {
            str = "?";
        }
        String LJ = a1.LJ(obj, LLD, str);
        InterfaceC65332PkW interfaceC65332PkW = this.LJLJI;
        if (interfaceC65332PkW instanceof C65338Pkc) {
            String LIZIZ = ((C65338Pkc) interfaceC65332PkW).LIZIZ(true);
            if (o.LJ(LIZIZ, LJ)) {
                return LJ;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJ);
            LIZ2.append('?');
            if (o.LJ(LIZIZ, X1D.LIZIZ(LIZ2))) {
                return C42398GkU.LIZIZ(LJ, '!');
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append('(');
            LIZ3.append(LJ);
            LIZ3.append("..");
            LIZ3.append(LIZIZ);
            LIZ3.append(')');
            return X1D.LIZIZ(LIZ3);
        }
        return LJ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C65338Pkc) {
            C65338Pkc c65338Pkc = (C65338Pkc) obj;
            if (o.LJ(this.LJLIL, c65338Pkc.LJLIL) && o.LJ(this.LJLILLLLZI, c65338Pkc.LJLILLLLZI) && o.LJ(this.LJLJI, c65338Pkc.LJLJI) && this.LJLJJI == c65338Pkc.LJLJJI) {
                return true;
            }
        }
        return false;
    }

    public C65338Pkc(InterfaceC65335PkZ classifier, List<C65337Pkb> arguments, InterfaceC65332PkW interfaceC65332PkW, int i) {
        o.LJIIIZ(classifier, "classifier");
        o.LJIIIZ(arguments, "arguments");
        this.LJLIL = classifier;
        this.LJLILLLLZI = arguments;
        this.LJLJI = interfaceC65332PkW;
        this.LJLJJI = i;
    }
}
