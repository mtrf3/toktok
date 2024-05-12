package com.google.android.play.core.assetpacks;

import X.C64075PCt;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class AssetPackState {
    public static d0 LIZIZ(String str, int i, int i2, long j, long j2, double d, int i3) {
        return new d0(str, j, j2, i, i2, (int) Math.rint(100.0d * d), i3);
    }

    public abstract int LIZ();

    public abstract long LIZJ();

    public abstract int LJ();

    public abstract String LJFF();

    public abstract int LJI();

    public abstract long LJII();

    public abstract int LJIIIIZZ();

    public static d0 LIZLLL(Bundle bundle, String str, q0 q0Var, v vVar) {
        double doubleValue;
        int i;
        int i2 = bundle.getInt(C64075PCt.LIZ("status", str));
        vVar.a(i2);
        int i3 = bundle.getInt(C64075PCt.LIZ("error_code", str));
        long j = bundle.getLong(C64075PCt.LIZ("bytes_downloaded", str));
        long j2 = bundle.getLong(C64075PCt.LIZ("total_bytes_to_download", str));
        synchronized (q0Var) {
            Double d = (Double) ((HashMap) q0Var.LIZ).get(str);
            if (d != null) {
                doubleValue = d.doubleValue();
            } else {
                doubleValue = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
        }
        long j3 = bundle.getLong(C64075PCt.LIZ("pack_version", str));
        long j4 = bundle.getLong(C64075PCt.LIZ("pack_base_version", str));
        if (i2 == 4 && j4 != 0 && j4 != j3) {
            i = 2;
        } else {
            i = 1;
        }
        return LIZIZ(str, i2, i3, j, j2, doubleValue, i);
    }
}
