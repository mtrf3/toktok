package X;

import android.view.View;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JL0 implements InterfaceC87283bg {
    public final InterfaceC88472Yns<View, C76800UCe> LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JL0) && o.LJ(this.LJLIL, ((JL0) obj).LJLIL);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateCommonConfig(onClick=");
        return C249109q6.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public JL0(AqS174S0100000_8 aqS174S0100000_8) {
        this.LJLIL = aqS174S0100000_8;
    }
}
