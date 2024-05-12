package X;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: X.Qn3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68037Qn3 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;
    public final long LJFF;
    public final zzcl LJI;
    public final boolean LJII;
    public final Long LJIIIIZZ;
    public final String LJIIIZ;

    public C68037Qn3(Context context, zzcl zzclVar, Long l) {
        this.LJII = true;
        QH7.LJIIIIZZ(context);
        Context LLLLL = C16880lQ.LLLLL(context);
        QH7.LJIIIIZZ(LLLLL);
        this.LIZ = LLLLL;
        this.LJIIIIZZ = l;
        if (zzclVar != null) {
            this.LJI = zzclVar;
            this.LIZIZ = zzclVar.zzf;
            this.LIZJ = zzclVar.zze;
            this.LIZLLL = zzclVar.zzd;
            this.LJII = zzclVar.zzc;
            this.LJFF = zzclVar.zzb;
            this.LJIIIZ = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.LJ = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
