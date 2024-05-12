package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Eua, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37928Eua {
    public final Context LIZ;
    public final View LIZIZ;
    public final String LIZJ;
    public final InterfaceC31922Cfu LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37928Eua)) {
            return false;
        }
        C37928Eua c37928Eua = (C37928Eua) obj;
        return o.LJ(this.LIZ, c37928Eua.LIZ) && o.LJ(this.LIZIZ, c37928Eua.LIZIZ) && o.LJ(this.LIZJ, c37928Eua.LIZJ) && o.LJ(this.LIZLLL, c37928Eua.LIZLLL);
    }

    public final int hashCode() {
        Context context = this.LIZ;
        int hashCode = (context == null ? 0 : context.hashCode()) * 31;
        View view = this.LIZIZ;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC31922Cfu interfaceC31922Cfu = this.LIZLLL;
        return hashCode3 + (interfaceC31922Cfu != null ? interfaceC31922Cfu.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokBDXBridgeContext(context=");
        LIZ.append(this.LIZ);
        LIZ.append(", view=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", containerID=");
        LIZ.append(this.LIZJ);
        LIZ.append(", jsEventDelegate=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C37928Eua(Context context, View view, String str, InterfaceC31922Cfu interfaceC31922Cfu) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = str;
        this.LIZLLL = interfaceC31922Cfu;
    }
}
