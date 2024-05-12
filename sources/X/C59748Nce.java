package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.live.assem.FollowWidgetAssem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.internal.o;

/* renamed from: X.Nce, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59748Nce implements InterfaceC60850NuQ {
    public final /* synthetic */ FollowWidgetAssem LJLIL;

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC60850NuQ
    public final Context attachPreBaseContext(Context context) {
        return context;
    }

    @Override // X.InterfaceC60850NuQ
    public final void finish() {
    }

    @Override // X.InterfaceC60850NuQ
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.M2J
    public final void release() {
    }

    public C59748Nce(FollowWidgetAssem followWidgetAssem) {
        this.LJLIL = followWidgetAssem;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJFF(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJII(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJI(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIFFI(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final boolean LJJIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
        return false;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJL(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJLIJ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIZ(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIJ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIIZZ(SparkActivity sparkActivity, Configuration configuration) {
        C40088FoK.LIZJ(sparkActivity, configuration);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIZ(SparkActivity activity, boolean z) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILLIIL(SparkActivity activity, Bundle bundle) {
        String str;
        boolean z;
        String str2;
        Intent intent;
        o.LJIIIZ(activity, "activity");
        SparkContext sparkContext = activity.LJLIL;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        if (o.LJ(C75252xN.LIZJ(str).get("enter_from_page"), "publish_highlight")) {
            FollowWidgetAssem followWidgetAssem = this.LJLIL;
            followWidgetAssem.getClass();
            IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
            int LIZIZ = C7MY.LIZIZ(12);
            int LIZIZ2 = C7MY.LIZIZ(102);
            if (publishService.globalProgressExpValue() >= 1) {
                z = true;
            } else {
                z = false;
            }
            publishService.addPublishProgressToActivity(activity, false, LIZIZ, LIZIZ2, z, null, false);
            ActivityC45651qj LIZ = C212428Vi.LIZ(followWidgetAssem);
            if (LIZ != null && (intent = LIZ.getIntent()) != null) {
                str2 = C16880lQ.LLJJIJIIJIL(intent, "multi_publish_id");
            } else {
                str2 = null;
            }
            publishService.addPublishCallback(new GWD(), str2);
        }
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJZLJL(SparkActivity activity, Bundle bundle) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZ(SparkActivity sparkActivity, Bundle bundle) {
        C40088FoK.LIZIZ(sparkActivity, bundle);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIIJIL(SparkActivity sparkActivity, Bundle bundle) {
        C40088FoK.LIZ(sparkActivity, bundle);
    }

    @Override // X.InterfaceC60850NuQ
    public final void attachBaseContext(Context context, Activity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIL(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
        C40088FoK.LIZLLL(sparkActivity, strArr, iArr);
    }
}
