package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.4FW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FW {
    public final String LIZ;
    public final C4GZ LIZIZ;
    public final View.OnClickListener LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4FW)) {
            return false;
        }
        C4FW c4fw = (C4FW) obj;
        return o.LJ(this.LIZ, c4fw.LIZ) && this.LIZIZ == c4fw.LIZIZ && o.LJ(this.LIZJ, c4fw.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomToastData(nickName=");
        LIZ.append(this.LIZ);
        LIZ.append(", scenario=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", onClick=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C4FW(String str, C4GZ scenario, View.OnClickListener onClickListener) {
        o.LJIIIZ(scenario, "scenario");
        this.LIZ = str;
        this.LIZIZ = scenario;
        this.LIZJ = onClickListener;
    }
}
