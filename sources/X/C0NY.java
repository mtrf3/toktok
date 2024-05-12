package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.router.SmartRoute;

/* renamed from: X.0NY, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0NY {
    public static LinearLayout LIZ(Context context, int i, int i2) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(i);
        linearLayout.setOrientation(i2);
        return linearLayout;
    }

    public static String LIZIZ(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }

    public static void LIZJ(SmartRoute smartRoute, String str, String str2, String str3, boolean z) {
        smartRoute.withParam(str, str2);
        smartRoute.withParam(str3, z);
        smartRoute.open();
    }
}
