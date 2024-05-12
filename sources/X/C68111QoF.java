package X;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: X.QoF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68111QoF {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final Bundle LIZLLL;

    public C68111QoF(long j, String str, String str2, Bundle bundle) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = bundle;
        this.LIZJ = j;
    }

    public final zzaw LIZ() {
        return new zzaw(this.LIZ, new zzau(new Bundle(this.LIZLLL)), this.LIZIZ, this.LIZJ);
    }

    public final String toString() {
        return "origin=" + this.LIZIZ + ",name=" + this.LIZ + ",params=" + this.LIZLLL.toString();
    }

    public static C68111QoF LIZIZ(zzaw zzawVar) {
        return new C68111QoF(zzawVar.zzd, zzawVar.zza, zzawVar.zzc, zzawVar.zzb.LJJJJZI());
    }
}
