package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import org.json.JSONObject;

/* renamed from: X.OWh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62035OWh extends QKR {
    public final Context LJ;

    public C62035OWh(Context context) {
        super(true, false);
        this.LJ = context;
    }

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        int i;
        int i2;
        DisplayMetrics displayMetrics;
        Object obj;
        String str = "mdpi";
        DisplayMetrics displayMetrics2 = this.LJ.getResources().getDisplayMetrics();
        try {
            int i3 = displayMetrics2.densityDpi;
            if (i3 == 120) {
                obj = "ldpi";
            } else if (i3 == 240) {
                obj = "hdpi";
            } else if (i3 != 320) {
                obj = "mdpi";
            } else {
                obj = "xhdpi";
            }
            jSONObject.put("density_dpi", i3);
            jSONObject.put("display_density", obj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(displayMetrics2.heightPixels);
            LIZ.append("x");
            LIZ.append(displayMetrics2.widthPixels);
            jSONObject.put("resolution", X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        int i4 = displayMetrics2.densityDpi;
        if (i4 <= 120) {
            str = "ldpi";
        } else if (i4 > 160) {
            if (i4 <= 240) {
                str = "hdpi";
            } else if (i4 <= 320) {
                str = "xhdpi";
            } else if (i4 <= 480) {
                str = "xxhdpi";
            } else if (i4 <= 640) {
                str = "xxxhdpi";
            } else {
                str = "xxxxhdpi";
            }
        }
        jSONObject.put("display_density_v2", str);
        try {
            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(this.LJ, "window");
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        } catch (Throwable unused) {
            i = 0;
        }
        try {
            i2 = displayMetrics.heightPixels;
        } catch (Throwable unused2) {
            i2 = 0;
            int[] iArr = {i, i2};
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(iArr[1]);
            LIZ2.append("x");
            LIZ2.append(iArr[0]);
            jSONObject.put("resolution_v2", X1D.LIZIZ(LIZ2));
            return true;
        }
        int[] iArr2 = {i, i2};
        StringBuilder LIZ22 = X1D.LIZ();
        LIZ22.append(iArr2[1]);
        LIZ22.append("x");
        LIZ22.append(iArr2[0]);
        jSONObject.put("resolution_v2", X1D.LIZIZ(LIZ22));
        return true;
    }
}
