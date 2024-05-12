package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.NKv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59189NKv {
    public final Context LIZ;
    public final String LIZIZ;

    public C59189NKv(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ(String str, Bundle bundle, NM4 loadCallback, boolean z) {
        AdSparkContext LIZ;
        o.LJIIIZ(loadCallback, "loadCallback");
        IAdSparkUtils LJFF = AdSparkUtils.LJFF();
        if (LJFF != null && (LIZ = NGQ.LIZ(LJFF, this.LIZ, str, bundle, false, 24)) != null) {
            if (z) {
                String str2 = this.LIZIZ;
                if (str2 != null) {
                    LIZ.LJJIIJ("access_key", str2);
                }
                LIZ.LJJIIJZLJL("use_forest", true);
            } else {
                IAdSparkUtils LJFF2 = AdSparkUtils.LJFF();
                if (LJFF2 != null) {
                    LJFF2.LIZ(LIZ, this.LIZIZ);
                }
            }
            LIZ.LJJIL(loadCallback);
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            Context context = this.LIZ;
            c40342FsQ.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C40343FsR.LIZ(C40342FsQ.LIZ(context, LIZ));
            LIZ.LJII(C38314F1y.class, new C38314F1y(LIZ2));
            LIZ2.LJIIJJI(LIZ);
            LIZ2.LIZIZ();
            return LIZ2;
        }
        return null;
    }
}
