package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class Z8B implements InterfaceC60850NuQ {
    public final /* synthetic */ Z8C LJLIL;

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZI() {
    }

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60850NuQ
    public final void finish() {
        this.LJLIL.finish();
    }

    public Z8B(Z8C z8c) {
        this.LJLIL = z8c;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJFF(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPreStopped(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJII(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPostPaused(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPostDestroyed(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIL(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPostStopped(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILL(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPreDestroyed(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJI(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPostStarted(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIFFI(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPrePaused(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPostResumed(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final boolean LJJIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LIZLLL(activity);
        return false;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJL(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPreResumed(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJLIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LJFF(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIZ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.onActivityPreStarted(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final Context attachPreBaseContext(Context context) {
        this.LJLIL.attachPreBaseContext(context);
        return context;
    }

    @Override // X.InterfaceC60850NuQ
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        this.LJLIL.onRestoreInstanceState(savedInstanceState);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIIZZ(SparkActivity activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        this.LJLIL.onConfigurationChanged(activity, newConfig);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIIZ(SparkActivity activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LJ(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIILLIIL(SparkActivity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LIZJ(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIJZLJL(SparkActivity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LIZ(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZ(SparkActivity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        this.LJLIL.onActivityPreSaveInstanceState(activity, outState);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIIJIL(SparkActivity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
        this.LJLIL.onActivityPostSaveInstanceState(activity, outState);
    }

    @Override // X.InterfaceC60850NuQ
    public final void attachBaseContext(Context context, Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.LIZIZ(activity);
    }

    @Override // X.InterfaceC60850NuQ
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.LJLIL.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIL(SparkActivity activity, int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        this.LJLIL.LJI(activity, i, strArr, grantResults);
    }
}
