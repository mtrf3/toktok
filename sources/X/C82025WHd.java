package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WHd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82025WHd extends WI1 {
    public int LJIIIZ;
    public WI0 LJIIJ;
    public final C6MP LJIIJJI;

    @Override // X.WI1
    public final int LJII() {
        return R.string.r2r;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final int LJI() {
        return this.LJIIIZ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJJI;
    }

    public C82025WHd(Activity activity) {
        int i;
        o.LJIIIZ(activity, "activity");
        if (C82127WLb.LIZ(activity)) {
            i = R.drawable.b78;
        } else {
            i = R.drawable.b77;
        }
        this.LJIIIZ = i;
        VLL vll = VLL.SLIDE;
        WJV.LIZ().LIZJ();
        this.LJIIJ = new WI0(vll, 130, false);
        this.LJIIJJI = C6MP.SHAKE_FREE;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJ = wi0;
    }
}
