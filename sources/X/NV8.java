package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class NV8 implements InterfaceC60850NuQ {
    public SparkActivity LJLIL;

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
        o.LJIIIZ(activity, "activity");
        this.LJLIL = null;
        EventBus.LIZJ().LJIJ(this);
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

    @QD3
    public final void onEvent(C107794Kx c107794Kx) {
        String str;
        SparkFragment LLFZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        if (c107794Kx != null) {
            str = c107794Kx.LJLJJI;
        } else {
            str = null;
        }
        if (TextUtils.equals("web", str)) {
            InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            SparkActivity sparkActivity = this.LJLIL;
            if (sparkActivity != null && (LLFZ = sparkActivity.LLFZ()) != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LLFZ.LJLJI;
            }
            shareService.LJIIL(sparkActivity, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, c107794Kx);
        }
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
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        EventBus.LIZJ().LJIILJJIL(this);
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
