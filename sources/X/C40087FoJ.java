package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.FoJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40087FoJ implements InterfaceC60850NuQ, InterfaceC60159NjH {
    public long LJLIL;
    public long LJLILLLLZI;
    public boolean LJLJI;
    public SparkContext LJLJJI;
    public String LJLJJL = "";

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

    @Override // X.InterfaceC60159NjH
    public final SparkContext LIZIZ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJFF(SparkActivity activity) {
        o.LJIIJ(activity, "activity");
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJII(SparkActivity activity) {
        o.LJIIIZ(activity, "activity");
        if (!this.LJLJI) {
            this.LJLJI = true;
            this.LJLILLLLZI = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJIIJ(SparkActivity activity) {
        String str;
        o.LJIIIZ(activity, "activity");
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLIL;
        String url = this.LJLJJL;
        o.LJIIIZ(url, "url");
        C188727au c188727au = new C188727au();
        c188727au.LJ(elapsedRealtime, "duration");
        if (C35918E7u.LIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("page_loaded", str);
        C35918E7u.LIZIZ(c188727au, url);
        C35918E7u.LIZ(c188727au, C35918E7u.LIZIZ);
        FMX.LJIIL("poi_webview_stay_time", c188727au.LIZ);
        this.LJLJJI = null;
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
        if (this.LJLJI) {
            this.LJLJI = false;
            this.LJLIL = (SystemClock.elapsedRealtime() - this.LJLILLLLZI) + this.LJLIL;
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
        String str;
        o.LJIIIZ(activity, "activity");
        this.LJLIL = SystemClock.elapsedRealtime();
        SparkContext sparkContext = activity.LJLIL;
        this.LJLJJI = sparkContext;
        if (sparkContext != null) {
            str = sparkContext.url;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        this.LJLJJL = str2;
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
