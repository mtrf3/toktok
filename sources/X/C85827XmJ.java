package X;

import Y.ACListenerS32S0101000_15;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XmJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85827XmJ {
    public final Activity LIZ;
    public C47061t0 LIZIZ;
    public View LIZJ;
    public View LJI;
    public CVT LJII;
    public boolean LIZLLL = true;
    public boolean LJFF = true;
    public boolean LJ = true;

    public final void LIZ() {
        long j;
        if (!this.LJFF && !this.LIZLLL && !this.LJ) {
            if (this.LJI.getVisibility() == 0) {
                EnterRoomConfig.TimeStamp timeStamp = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
                if (timeStamp != null && timeStamp.enterRoomStarTimeReal > 0) {
                    j = System.currentTimeMillis() - timeStamp.enterRoomStarTimeReal;
                } else {
                    j = -1;
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_toplives_loading_quit");
                LIZ.LJIJJ(Long.valueOf(j), "duration");
                LIZ.LJIJJ("success", "quit_type");
                LIZ.LJJIIJZLJL();
            }
            KL2.LJIILLIIL(8, this.LJI);
        }
    }

    public C85827XmJ(Activity activity) {
        ViewStub viewStub;
        this.LIZ = activity;
        if (activity != null && (viewStub = (ViewStub) activity.findViewById(R.id.g8a)) != null) {
            View inflate = viewStub.inflate();
            this.LJI = inflate;
            if (inflate != null) {
                this.LIZIZ = (C47061t0) inflate.findViewById(R.id.fv6);
                this.LJII = (CVT) this.LJI.findViewById(R.id.fxs);
                View findViewById = this.LJI.findViewById(R.id.fvo);
                this.LIZJ = findViewById;
                C16880lQ.LJIIJ(new ACListenerS32S0101000_15(3, this, 18), findViewById);
            }
        }
    }
}
