package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FDs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38620FDs extends AbstractC38618FDq {
    public final FE0 LIZLLL;
    public final FE3 LJ = null;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 97));

    public C38620FDs(FE0 fe0) {
        this.LIZLLL = fe0;
    }

    @Override // X.InterfaceC38616FDo
    public final void LIZJ(Context context) {
        o.LJIIJ(context, "context");
        ((InterfaceC38616FDo) this.LIZJ.getValue()).LIZJ(context);
    }

    @Override // X.InterfaceC38616FDo
    public final View LIZLLL(Context context, ViewGroup viewGroup, boolean z) {
        o.LJIIJ(context, "context");
        return ((InterfaceC38616FDo) this.LIZJ.getValue()).LIZLLL(context, viewGroup, z);
    }
}
