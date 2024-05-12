package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NXC implements NXB {
    public final /* synthetic */ C59518NXm LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.NXB
    public final void LIZIZ() {
        Activity LJIJJ = C45804HyK.LJIJJ(this.LIZIZ);
        if (LJIJJ != null && LJIJJ.isFinishing()) {
            return;
        }
        this.LIZ.getClass();
    }

    @Override // X.NXB
    public final void LIZJ() {
        this.LIZ.LIZIZ(R.id.hxg).setVisibility(8);
        View findViewById = this.LIZ.LIZIZ(R.id.hxh).findViewById(R.id.cyv);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // X.NXB
    public final void LIZLLL() {
        this.LIZ.LIZIZ(R.id.hxg).setVisibility(0);
        View findViewById = this.LIZ.LIZIZ(R.id.hxh).findViewById(R.id.cyv);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // X.NXB
    public final void LIZ() {
    }

    @Override // X.NXB
    public final void LJ() {
    }

    public NXC(ActivityC45651qj activityC45651qj, C59518NXm c59518NXm) {
        this.LIZ = c59518NXm;
        this.LIZIZ = activityC45651qj;
    }
}
