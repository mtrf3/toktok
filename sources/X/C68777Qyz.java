package X;

import android.util.Pair;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

/* renamed from: X.Qyz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68777Qyz {
    public float LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public final StampStyle LJ;

    public C68777Qyz(StrokeStyle strokeStyle) {
        this.LIZ = strokeStyle.zza;
        Pair LJJJJL = strokeStyle.LJJJJL();
        this.LIZIZ = ((Integer) LJJJJL.first).intValue();
        this.LIZJ = ((Integer) LJJJJL.second).intValue();
        this.LIZLLL = strokeStyle.zzd;
        this.LJ = strokeStyle.zze;
    }
}
