package X;

import android.content.Context;
import com.bytedance.immersionbar.ImmersionBar;

/* renamed from: X.OJx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61713OJx {
    public static final /* synthetic */ int LIZJ = 0;
    public final Context LIZ;
    public final ImmersionBar LIZIZ;

    public final void LIZJ() {
        this.LIZIZ.LJ();
    }

    public final void LJIIIZ() {
        C61714OJy c61714OJy = this.LIZIZ.LJFF;
        c61714OJy.LJLIL = 0;
        c61714OJy.LJLILLLLZI = 0;
        c61714OJy.LJLJJL = true;
    }

    public final void LIZ(boolean z) {
        C61714OJy c61714OJy = this.LIZIZ.LJFF;
        c61714OJy.LJLJLLL = z;
        c61714OJy.LJLLI = 0.2f;
        c61714OJy.LJLL = z;
        c61714OJy.LJLLILLLL = 0.2f;
    }

    public final void LIZLLL(int i) {
        ImmersionBar immersionBar = this.LIZIZ;
        immersionBar.LJFF.LJLILLLLZI = C04330Ez.LIZIZ(immersionBar.LIZ, i);
    }

    public final void LJ(int i) {
        Integer LJI;
        Context context = this.LIZ;
        if (context != null && (LJI = C79045V0n.LJI(i, context)) != null) {
            this.LIZIZ.LJFF.LJLILLLLZI = LJI.intValue();
        }
    }

    public final void LJFF(int i) {
        this.LIZIZ.LJFF.LJLILLLLZI = i;
    }

    public final void LJI(int i) {
        ImmersionBar immersionBar = this.LIZIZ;
        immersionBar.LJFF.LJLIL = C04330Ez.LIZIZ(immersionBar.LIZ, i);
    }

    public final void LJII(int i) {
        Integer LJI;
        Context context = this.LIZ;
        if (context != null && (LJI = C79045V0n.LJI(i, context)) != null) {
            this.LIZIZ.LJFF.LJLIL = LJI.intValue();
        }
    }

    public final void LJIIIIZZ(int i) {
        this.LIZIZ.LJFF.LJLIL = i;
    }

    public C61713OJx(Context context, ImmersionBar immersionBar) {
        this.LIZ = context;
        this.LIZIZ = immersionBar;
    }

    public final void LIZIZ(boolean z, boolean z2) {
        OK0 ok0;
        if (z) {
            if (z2) {
                ok0 = OK0.FLAG_HIDE_BAR;
            } else {
                ok0 = OK0.FLAG_HIDE_NAVIGATION_BAR;
            }
        } else if (z2) {
            ok0 = OK0.FLAG_HIDE_STATUS_BAR;
        } else {
            ok0 = OK0.FLAG_SHOW_BAR;
        }
        this.LIZIZ.LIZLLL(ok0);
    }
}
