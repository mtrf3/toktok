package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.HRj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44071HRj {
    public final Context LIZ;
    public final int LIZIZ;
    public final EnumC44076HRo LIZJ;
    public final InterfaceC44082HRu LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44071HRj)) {
            return false;
        }
        C44071HRj c44071HRj = (C44071HRj) obj;
        return o.LJ(this.LIZ, c44071HRj.LIZ) && this.LIZIZ == c44071HRj.LIZIZ && this.LIZJ == c44071HRj.LIZJ && o.LJ(this.LIZLLL, c44071HRj.LIZLLL) && o.LJ(this.LJ, c44071HRj.LJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31)) * 31;
        InterfaceC44082HRu interfaceC44082HRu = this.LIZLLL;
        int hashCode2 = (hashCode + (interfaceC44082HRu == null ? 0 : interfaceC44082HRu.hashCode())) * 31;
        String str = this.LJ;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DoubleBallDialogParams(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", theme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cancelType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cancelListener=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C44071HRj(Context context, EnumC44076HRo cancelType, InterfaceC44082HRu interfaceC44082HRu, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(cancelType, "cancelType");
        this.LIZ = context;
        this.LIZIZ = R.style.a5l;
        this.LIZJ = cancelType;
        this.LIZLLL = interfaceC44082HRu;
        this.LJ = str;
    }
}
