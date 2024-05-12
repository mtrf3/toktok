package X;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: X.Vf0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80278Vf0 extends C281318n {
    public C80278Vf0(Context context) {
        super(context);
    }

    @Override // X.C281318n, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C281618q LIZ = LIZ(i, i2, i3, charSequence);
        C80281Vf3 c80281Vf3 = new C80281Vf3(this.LIZ, this, LIZ);
        LIZ.LJIILJJIL = c80281Vf3;
        c80281Vf3.setHeaderTitle(LIZ.LJ);
        return c80281Vf3;
    }
}
