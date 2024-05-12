package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NfA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59904NfA implements InterfaceC60850NuQ, InterfaceC60061Nhh {
    public WeakReference<SparkActivity> LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public View LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC60850NuQ
    public final void LJJIIZI() {
    }

    @Override // X.InterfaceC60850NuQ
    public final Context attachPreBaseContext(Context context) {
        return context;
    }

    @Override // X.InterfaceC60850NuQ
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.M2J
    public final void release() {
    }

    @Override // X.InterfaceC60850NuQ
    public final void finish() {
        String str;
        WeakReference<SparkActivity> weakReference;
        if (!this.LJLJJLL && (str = this.LJLILLLLZI) != null && str.length() > 0 && (weakReference = this.LJLIL) != null && weakReference.get() != null) {
            WeakReference<SparkActivity> weakReference2 = this.LJLIL;
            if (weakReference2 != null) {
                SmartRouter.buildRoute(weakReference2.get(), str).open();
            } else {
                o.LJIJI("contextRef");
                throw null;
            }
        }
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
        EventCenter.LJ().LIZIZ("ec_hybrid_container_intercept_back", this);
        EventCenter.LJ().LIZIZ("ec_hybrid_intercept_open_url", this);
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJI(SparkActivity activity) {
        View view;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(activity, "activity");
        if (C19N.LJ("tiktokec_payment_blank_detect", false)) {
            SparkFragment LLFZ = activity.LLFZ();
            if (LLFZ != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LLFZ.LJLJI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                view = kitView.LIZJ();
            } else {
                view = null;
            }
            this.LJLJJL = view;
            if (view != null) {
                VMI vmi = VMI.LJ;
                vmi.getClass();
                C60601NqP c60601NqP = new C60601NqP();
                c60601NqP.LJFF = "ecom_payment";
                c60601NqP.LIZIZ = new String[]{String.valueOf(view.hashCode())};
                c60601NqP.LJII = new C59907NfD(this);
                vmi.LJIILJJIL(c60601NqP);
            }
        }
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
        String str2;
        o.LJIIIZ(activity, "activity");
        this.LJLIL = new WeakReference<>(activity);
        this.LJLJJLL = false;
        SparkContext sparkContext = activity.LJLIL;
        if (sparkContext != null && (str = sparkContext.url) != null) {
            this.LJLJI = str;
            android.net.Uri parse = UriProtector.parse(str);
            if (parse != null) {
                str2 = parse.getHost();
            } else {
                str2 = null;
            }
            this.LJLJJI = str2;
            this.LJLILLLLZI = UriProtector.getQueryParameter(UriProtector.parse(str), "back_open_url");
        }
        EventCenter.LJ().LIZJ("ec_hybrid_container_intercept_back", this);
        EventCenter.LJ().LIZJ("ec_hybrid_intercept_open_url", this);
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

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        try {
            WeakReference<SparkActivity> weakReference = this.LJLIL;
            if (weakReference != null && weakReference.get() != null) {
                if (o.LJ(eventName, "ec_hybrid_container_intercept_back")) {
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        WeakReference<SparkActivity> weakReference2 = this.LJLIL;
                        String str2 = null;
                        if (weakReference2 != null) {
                            SparkActivity sparkActivity = weakReference2.get();
                            o.LJII(sparkActivity, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkActivity");
                            SparkContext sparkContext = sparkActivity.LJLIL;
                            if (sparkContext != null) {
                                str2 = sparkContext.containerId;
                            }
                            if (o.LJ(str2, jSONObject.optString("react_id"))) {
                                this.LJLILLLLZI = new JSONObject(str).optString("back_open_url");
                                return;
                            }
                            return;
                        }
                        o.LJIJI("contextRef");
                        throw null;
                    }
                    return;
                }
                if (o.LJ(eventName, "ec_hybrid_intercept_open_url")) {
                    this.LJLJJLL = true;
                }
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
    }

    @Override // X.InterfaceC60850NuQ
    public final void LJJIJIL(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
        C40088FoK.LIZLLL(sparkActivity, strArr, iArr);
    }
}
