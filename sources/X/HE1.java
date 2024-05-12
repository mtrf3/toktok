package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.share.ShareRespSendServiceImpl;

/* loaded from: classes8.dex */
public final class HE1 implements HJR {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ C43722HDy LIZIZ;

    @Override // X.HJR
    public final void LIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_from", this.LIZIZ.mClientKey);
        c188727au.LJFF(Boolean.TRUE, "is_draft");
        FMX.LJIIL("stay_in_tt", c188727au.LIZ);
        Intent intent = new Intent();
        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
        this.LIZ.sendBroadcast(intent);
    }

    @Override // X.HJR
    public final void LIZIZ() {
        ShareRespSendServiceImpl.LJ().LIZJ(this.LIZ, this.LIZIZ, C45828Hyi.LJIILL);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_from", this.LIZIZ.mClientKey);
        c188727au.LJFF(Boolean.TRUE, "is_draft");
        FMX.LJIIL("return_to_origin_app", c188727au.LIZ);
    }

    public HE1(ActivityC45651qj activityC45651qj, C43722HDy c43722HDy) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = c43722HDy;
    }
}
