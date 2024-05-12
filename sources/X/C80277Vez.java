package X;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: X.Vez, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80277Vez extends C281318n {
    public C80277Vez(Context context) {
        super(context);
    }

    @Override // X.C281318n
    public final C281618q LIZ(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            LJJI();
            C281618q LIZ = super.LIZ(i, i2, i3, charSequence);
            LIZ.LJI(true);
            LJJ();
            return LIZ;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    @Override // X.C281318n, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
