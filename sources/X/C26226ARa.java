package X;

import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ARa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26226ARa implements InterfaceC81146Vt0 {
    public final /* synthetic */ C26231ARf LIZ;
    public final /* synthetic */ SY9 LIZIZ;

    @Override // X.InterfaceC81146Vt0
    public final void LIZ(boolean z) {
        TypedArray obtainStyledAttributes = new ContextThemeWrapper(this.LIZ.LJLILLLLZI, C45804HyK.LJJIII(this.LIZ.LJLILLLLZI, z)).obtainStyledAttributes(null, new int[]{R.attr.nc, R.attr.nd, R.attr.ne, R.attr.nf, R.attr.ng, R.attr.nh, R.attr.ni, R.attr.nj, R.attr.nk, R.attr.nl, R.attr.nm, R.attr.nn, R.attr.no, R.attr.np, R.attr.nq, R.attr.nr, R.attr.ns, R.attr.nt, R.attr.nu, R.attr.nv, R.attr.nw, R.attr.nx, R.attr.ny, R.attr.nz}, R.attr.jw, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "wrapped.obtainStyledAttr…, 0\n                    )");
        int color = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        this.LIZIZ.LJ(color);
    }

    @Override // X.InterfaceC81146Vt0
    public final void LIZIZ(int[] result) {
        o.LJIIIZ(result, "result");
    }

    public C26226ARa(C26231ARf c26231ARf, SY9 sy9) {
        this.LIZ = c26231ARf;
        this.LIZIZ = sy9;
    }
}
