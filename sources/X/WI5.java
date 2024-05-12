package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WI5 extends WI1 {
    public final IVideoRecordPreferences LJIIIZ;
    public final C6MP LJIIJ;
    public WI0 LJIIJJI;

    @Override // X.WI1
    public final int LJII() {
        return R.string.dwt;
    }

    @Override // X.WI1
    public final int LJ() {
        if (this.LJIIIIZZ) {
            return R.raw.icon_camera_timer_fill;
        }
        return R.raw.icon_camera_counter;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJ;
    }

    public WI5(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJIIIZ = (IVideoRecordPreferences) new C44350Has(0).LIZ(activity, IVideoRecordPreferences.class);
        this.LJIIJ = C6MP.COUNT_DOWN;
        this.LJIIJJI = new WI0(VLL.SLIDE, WJV.LIZ().LJIILIIL(), false);
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJJI = wi0;
    }
}
