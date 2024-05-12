package X;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: X.aPS, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93350aPS {
    public static final void LIZ(C199627sU c199627sU, MarkerOptions markerOptions) {
        markerOptions.zzm = 1.0f;
        markerOptions.zzh = true;
        markerOptions.zzb = c199627sU.LIZIZ;
        float f = c199627sU.LIZLLL;
        float f2 = c199627sU.LIZJ;
        markerOptions.zze = f;
        markerOptions.zzf = f2;
        markerOptions.zzn = c199627sU.LJ;
        Bitmap bitmap = c199627sU.LIZ;
        if (bitmap != null) {
            markerOptions.zzd = C78949Uyf.LJIILJJIL(bitmap);
        }
    }
}
