package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nic, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60118Nic implements InterfaceC60850NuQ {
    public long LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;

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
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJII(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            this.LJLJI = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        C2U8.LIZ(new C25741A8j(SystemClock.elapsedRealtime() - this.LJLIL));
        C60119Nid.LIZ = "safe";
        C60114NiY.LIZIZ = "";
        C60114NiY.LIZ.clearQuery();
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
        o.LJIIIZ(activity, "activity");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", C60114NiY.LIZIZ);
        FMX.LJIIL("tns_tiktok_3Panchor_webview_page_show", c188727au.LIZ);
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            this.LJLIL = (SystemClock.elapsedRealtime() - this.LJLJI) + this.LJLIL;
        }
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
        C60161NjJ c60161NjJ;
        o.LJIIIZ(activity, "activity");
        this.LJLIL = SystemClock.elapsedRealtime();
        SparkContext sparkContext = activity.LJLIL;
        C60119Nid.LJ = activity;
        C60119Nid.LIZIZ = sparkContext;
        C60119Nid.LJI = (MusicLandingPageViewModel) ViewModelProviders.of(activity).get(MusicLandingPageViewModel.class);
        SparkActivity sparkActivity = C60119Nid.LJ;
        if (sparkActivity != null) {
            c60161NjJ = new C60161NjJ(sparkActivity);
        } else {
            c60161NjJ = null;
        }
        C60119Nid.LJFF = c60161NjJ;
        C60119Nid.LIZ();
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
