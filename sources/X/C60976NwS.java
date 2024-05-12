package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NwS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60976NwS implements InterfaceC60850NuQ {
    public long LJLIL = -1;
    public boolean LJLILLLLZI;

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
        this.LJLILLLLZI = false;
        C60977NwT.LJI(this.LJLIL);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        if (this.LJLILLLLZI) {
            C60977NwT.LJI(this.LJLIL);
        }
        C188727au c188727au = new C188727au();
        C188727au c188727au2 = C60977NwT.LIZ;
        c188727au.LJIIIIZZ(c188727au2.LIZ);
        c188727au.LJI("is_edge_case", C60977NwT.LIZJ());
        LinkedHashMap linkedHashMap = (LinkedHashMap) C60977NwT.LIZIZ;
        String str = (String) linkedHashMap.get("business_event_keys_close");
        if (C78685UuP.LJJJZ(str)) {
            FMX.LJIIL(str, c188727au.LIZ);
        } else {
            FMX.LJIIL("search_webpage_close", c188727au.LIZ);
        }
        C60983NwZ.LIZ = "safe";
        C60131Nip.LIZ.clearQuery();
        ((HashMap) c188727au2.LIZ).clear();
        linkedHashMap.clear();
        C35975E9z.LIZLLL = false;
        C60986Nwc.LIZ = false;
        C60986Nwc.LIZIZ = -1;
        C60986Nwc.LJ = false;
        C60986Nwc.LJFF = 0;
        C60986Nwc.LJI = null;
        C60986Nwc.LJII = false;
        C60986Nwc.LIZJ = 0;
        C60986Nwc.LIZLLL = false;
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
        this.LJLIL = System.currentTimeMillis();
        this.LJLILLLLZI = true;
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
        C60980NwW c60980NwW;
        o.LJIIIZ(activity, "activity");
        this.LJLIL = System.currentTimeMillis();
        SparkContext sparkContext = activity.LJLIL;
        C60983NwZ.LJ = activity;
        C60983NwZ.LIZIZ = sparkContext;
        C60983NwZ.LJI = (SearchLandingPageViewModel) ViewModelProviders.of(activity).get(SearchLandingPageViewModel.class);
        SparkActivity sparkActivity = C60983NwZ.LJ;
        if (sparkActivity != null) {
            c60980NwW = new C60980NwW(sparkActivity);
        } else {
            c60980NwW = null;
        }
        C60983NwZ.LJFF = c60980NwW;
        if (o.LJ(C60983NwZ.LIZ, "no_internet") || o.LJ(C60983NwZ.LIZ, "broken")) {
            C60983NwZ.LIZ = "safe";
            SearchLandingPageViewModel searchLandingPageViewModel = C60983NwZ.LJI;
            if (searchLandingPageViewModel != null) {
                searchLandingPageViewModel.gv0("safe");
                C60983NwZ.LIZLLL = true;
            } else {
                o.LJIJI("pageViewModel");
                throw null;
            }
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
