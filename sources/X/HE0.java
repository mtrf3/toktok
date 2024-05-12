package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.share.ShareRespSendServiceImpl;

/* loaded from: classes8.dex */
public final class HE0 implements HJR {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ C43722HDy LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.HJR
    public final void LIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_from", this.LIZIZ.mClientKey);
        c188727au.LJIIIZ("channel", this.LIZIZ.mClientKey);
        c188727au.LJIIIZ("product", "share_sdk");
        String str = "";
        if (this.LIZIZ.getShareRequestBundle() != null && this.LIZIZ.getShareRequestBundle().getBundle("_bytedance_params_extra") != null) {
            str = this.LIZIZ.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", "");
        }
        c188727au.LJIIIZ("style_id", str);
        c188727au.LJIIIZ("sdk_name", this.LIZJ);
        c188727au.LJIIIZ("sdk_version", this.LIZLLL);
        FMX.LJIIL("stay_in_tt", c188727au.LIZ);
        Intent intent = new Intent();
        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
        this.LIZ.sendBroadcast(intent);
    }

    @Override // X.HJR
    public final void LIZIZ() {
        ShareRespSendServiceImpl.LJ().LIZ(this.LIZ, this.LIZIZ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_from", this.LIZIZ.mClientKey);
        c188727au.LJIIIZ("channel", this.LIZIZ.mClientKey);
        c188727au.LJIIIZ("product", "share_sdk");
        String str = "";
        if (this.LIZIZ.getShareRequestBundle() != null && this.LIZIZ.getShareRequestBundle().getBundle("_bytedance_params_extra") != null) {
            str = this.LIZIZ.getShareRequestBundle().getBundle("_bytedance_params_extra").getString("style_id", "");
        }
        c188727au.LJIIIZ("style_id", str);
        c188727au.LJIIIZ("sdk_name", this.LIZJ);
        c188727au.LJIIIZ("sdk_version", this.LIZLLL);
        FMX.LJIIL("return_to_origin_app", c188727au.LIZ);
    }

    public HE0(Activity activity, C43722HDy c43722HDy, String str, String str2) {
        this.LIZ = activity;
        this.LIZIZ = c43722HDy;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
