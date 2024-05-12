package X;

import android.text.Spannable;
import kotlin.jvm.internal.o;

/* renamed from: X.7J0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7J0 implements C33Q {
    public final C43I<OSZ<String, Spannable>> LJLIL;

    public C7J0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7J0) && o.LJ(this.LJLIL, ((C7J0) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<OSZ<String, Spannable>> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RepostEventState(onRepostInputDismiss=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7J0(C43I<? extends OSZ<String, ? extends Spannable>> c43i) {
        this.LJLIL = c43i;
    }
}
