package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.AqS66S1100000_13;

/* renamed from: X.0Jv */
/* loaded from: classes.dex */
public final class C05590Jv {
    public static /* synthetic */ SparkContext LJ(IHybridContainerService iHybridContainerService, Context context, String str) {
        return iHybridContainerService.Vs0(context, str, null);
    }

    public static /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ(IHybridContainerService iHybridContainerService, Context context, String str, AqS66S1100000_13 aqS66S1100000_13, int i) {
        boolean z;
        boolean z2;
        AqS66S1100000_13 aqS66S1100000_132 = aqS66S1100000_13;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            aqS66S1100000_132 = null;
        }
        return iHybridContainerService.Si0(context, str, null, z, z2, aqS66S1100000_132);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ(IHybridContainerService iHybridContainerService, Context context, String str, boolean z, InterfaceC88472Yns interfaceC88472Yns, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            interfaceC88472Yns = null;
        }
        return iHybridContainerService.cZ(context, str, z, interfaceC88472Yns);
    }
}
