package X;

import X.C19860qE;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19860qE<T extends C19860qE<T>> {
    public final Context LIZ;
    public final View LIZIZ;
    public View LIZJ;
    public int LJ;
    public int LJFF;
    public long LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC19890qH LJIIL;
    public InterfaceC19880qG LJIILIIL;
    public boolean LJIILL;
    public CharSequence LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public int LIZLLL = 48;
    public boolean LJIILJJIL = true;

    public C19860qE(View view) {
        this.LIZIZ = view;
        if (view != null) {
            Context context = view.getContext();
            this.LIZ = context;
            TypedValue LIZ = C259910h.LIZ();
            context.getTheme().resolveAttribute(R.attr.arc, LIZ, true);
            if (LIZ.type != 18 || LIZ.data == 0) {
                this.LIZ = context;
            }
            this.LJIIZILJ = C259910h.LIZIZ(R.attr.bnm, this.LIZ);
            this.LJIJ = this.LIZ.getResources().getDimensionPixelSize(R.dimen.aho);
        }
    }

    public final void LIZ(int i) {
        Context context = this.LIZ;
        if (context != null) {
            this.LJIILLIIL = context.getResources().getString(i);
        }
    }
}
