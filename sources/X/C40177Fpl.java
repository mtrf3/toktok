package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Fpl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40177Fpl {
    public final SparkContext LIZ;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ;

    public C40177Fpl() {
        this((AdSparkHybridContext) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40177Fpl)) {
            return false;
        }
        C40177Fpl c40177Fpl = (C40177Fpl) obj;
        return o.LJ(this.LIZ, c40177Fpl.LIZ) && o.LJ(this.LIZIZ, c40177Fpl.LIZIZ);
    }

    public final int hashCode() {
        SparkContext sparkContext = this.LIZ;
        int hashCode = (sparkContext == null ? 0 : sparkContext.hashCode()) * 31;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZIZ;
        return hashCode + (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null ? sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SparkMixture(sparkContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", sparkView=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C40177Fpl(AdSparkHybridContext adSparkHybridContext, int i) {
        this((i & 1) != 0 ? null : adSparkHybridContext, (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) null);
    }

    public C40177Fpl(SparkContext sparkContext, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LIZ = sparkContext;
        this.LIZIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }
}
