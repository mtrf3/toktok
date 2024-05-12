package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.NbN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59669NbN implements InterfaceC60850NuQ {
    public WeakReference<SparkActivity> LJLIL;

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

    @Override // X.InterfaceC60850NuQ
    public final void LJFF(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJII(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIL(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILL(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJI(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIFFI(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final boolean LJJIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        return false;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJL(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJLIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIZ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEvent(C107794Kx event) {
        SparkFragment LLFZ;
        o.LJIIIZ(event, "event");
        WeakReference<SparkActivity> weakReference = this.LJLIL;
        if (weakReference != null) {
            SparkActivity sparkActivity = weakReference.get();
            if (sparkActivity != null && (LLFZ = sparkActivity.LLFZ()) != null && o.LJ(event.LJLJJI, "point_of_interest") && LLFZ.isResumed()) {
                IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIIL(LLFZ.getContext(), LLFZ.getView(), event);
                return;
            }
            return;
        }
        o.LJIJI("activityRef");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPoiSuggestAnEditPopupEvent(C190737e9 event) {
        SparkFragment LLFZ;
        Context context;
        o.LJIIIZ(event, "event");
        WeakReference<SparkActivity> weakReference = this.LJLIL;
        if (weakReference != null) {
            SparkActivity sparkActivity = weakReference.get();
            if (sparkActivity != null && (LLFZ = sparkActivity.LLFZ()) != null && LLFZ.isResumed() && (context = LLFZ.getContext()) != null) {
                A1X.LIZ(context, event.LJLIL);
                return;
            }
            return;
        }
        o.LJIJI("activityRef");
        throw null;
    }

    @Override // X.InterfaceC60850NuQ
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIIZZ(SparkActivity activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        C40088FoK.LIZJ(activity, newConfig);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIZ(SparkActivity activity, boolean z) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILLIIL(SparkActivity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJZLJL(SparkActivity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        C42625Go9.LIZIZ(this);
        this.LJLIL = new WeakReference<>(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZ(SparkActivity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        C40088FoK.LIZIZ(activity, outState);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIIJIL(SparkActivity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        C40088FoK.LIZ(activity, outState);
    }

    @Override // X.InterfaceC60850NuQ
    public final void attachBaseContext(Context context, Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIL(SparkActivity activity, int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C40088FoK.LIZLLL(activity, strArr, grantResults);
    }
}
