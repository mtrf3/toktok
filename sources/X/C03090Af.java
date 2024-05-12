package X;

import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0Af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C03090Af {
    public static Boolean LIZIZ(String str, boolean z) {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ(str, z));
    }

    public static int LIZ(AbstractC72932td abstractC72932td, int i, int i2) {
        return (abstractC72932td.hashCode() + i) * i2;
    }

    public static String LIZJ(StringBuilder sb, String str, Throwable th, StringBuilder sb2) {
        sb.append(str);
        sb.append(th.getMessage());
        return X1D.LIZIZ(sb2);
    }

    public static LinkedHashMap LIZLLL(View view, String str, ECBaseFragment eCBaseFragment, String str2) {
        o.LJIIIZ(view, str);
        o.LJIIIZ(eCBaseFragment, str2);
        return new LinkedHashMap();
    }
}
