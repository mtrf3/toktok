package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.NKw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59190NKw implements NKV {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
    public final String LIZIZ;
    public final NM4 LIZJ;
    public Bundle LIZLLL;

    public C59190NKw(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, String str, NM4 loadCallback) {
        o.LJIIIZ(loadCallback, "loadCallback");
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LIZIZ = str;
        this.LIZJ = loadCallback;
    }

    @Override // X.NKV
    public final void LIZ(Bundle dataBundle, String str, boolean z) {
        Bundle bundle;
        IAdSparkUtils LJFF;
        o.LJIIIZ(dataBundle, "dataBundle");
        if (C52947KqF.LIZ() == 2 || C52947KqF.LIZ() == 3) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZLLL() && o.LJ(str, this.LIZ.getUrl()) && (bundle = this.LIZLLL) != null && C51760KTc.LIZ(bundle, dataBundle)) {
                this.LIZ.refresh();
                return;
            }
            this.LIZLLL = dataBundle;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (LJFF = AdSparkUtils.LJFF()) != null) {
            Context context = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getContext();
            o.LJIIIIZZ(context, "context");
            AdSparkContext LIZ = NGQ.LIZ(LJFF, context, str, dataBundle, false, 24);
            if (LIZ != null) {
                LIZ.LJII(C38314F1y.class, new C38314F1y(this.LIZ));
                if (z) {
                    LIZ.LJJIIJZLJL("use_forest", true);
                    String str2 = this.LIZIZ;
                    if (str2 != null) {
                        LIZ.LJJIIJ("access_key", str2);
                    }
                } else {
                    IAdSparkUtils LJFF2 = AdSparkUtils.LJFF();
                    if (LJFF2 != null) {
                        LJFF2.LIZ(LIZ, this.LIZIZ);
                    }
                }
                LIZ.LJJIL(this.LIZJ);
                LIZ.LJJIJLIJ(str);
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIIJJI(LIZ);
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LIZIZ();
            }
        }
    }
}
