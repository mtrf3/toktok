package X;

import android.util.JsonReader;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATV implements C33Q {
    public final C43I<EnumC58046MqI> LJLIL;
    public final AbstractC72932td<OSZ<JsonReader, String>> LJLILLLLZI;
    public final boolean LJLJI;

    public ATV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ATV)) {
            return false;
        }
        ATV atv = (ATV) obj;
        return o.LJ(this.LJLIL, atv.LJLIL) && o.LJ(this.LJLILLLLZI, atv.LJLILLLLZI) && this.LJLJI == atv.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C43I<EnumC58046MqI> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        AbstractC72932td<OSZ<JsonReader, String>> abstractC72932td = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (abstractC72932td != null ? abstractC72932td.hashCode() : 0)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimAuthVMState(showAuthPopupEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", lottieState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isAuthFlowEnd=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ ATV(int i) {
        this(null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ATV(C43I<? extends EnumC58046MqI> c43i, AbstractC72932td<OSZ<JsonReader, String>> abstractC72932td, boolean z) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = abstractC72932td;
        this.LJLJI = z;
    }

    public static ATV LIZ(ATV atv, C43I c43i, AbstractC72932td abstractC72932td, boolean z, int i) {
        if ((i & 1) != 0) {
            c43i = atv.LJLIL;
        }
        if ((i & 2) != 0) {
            abstractC72932td = atv.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = atv.LJLJI;
        }
        atv.getClass();
        return new ATV(c43i, abstractC72932td, z);
    }
}
