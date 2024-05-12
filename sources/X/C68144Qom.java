package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* renamed from: X.Qom, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68144Qom {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final zzau LJFF;

    public final String toString() {
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String zzauVar = this.LJFF.toString();
        StringBuilder sb = new StringBuilder("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        return AnonymousClass073.LIZIZ(sb, zzauVar, "}");
    }

    public final C68144Qom LIZ(C68033Qmz c68033Qmz, long j) {
        return new C68144Qom(c68033Qmz, this.LIZJ, this.LIZ, this.LIZIZ, this.LIZLLL, j, this.LJFF);
    }

    public C68144Qom(C68033Qmz c68033Qmz, String str, String str2, String str3, long j, Bundle bundle) {
        zzau zzauVar;
        QH7.LJI(str2);
        QH7.LJI(str3);
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LIZJ = true == TextUtils.isEmpty(str) ? null : str;
        this.LIZLLL = j;
        this.LJ = 0L;
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c68033Qmz.LIZJ().LJFF.LIZ("Param name can't be null");
                    it.remove();
                } else {
                    Object LJIIIZ = c68033Qmz.LJIL().LJIIIZ(C16880lQ.LLJJIII(bundle2, next), next);
                    if (LJIIIZ == null) {
                        c68033Qmz.LIZJ().LJIIIIZZ.LIZIZ(c68033Qmz.LJIIL.LJ(next), "Param value can't be null");
                        it.remove();
                    } else {
                        c68033Qmz.LJIL().LJIL(bundle2, next, LJIIIZ);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.LJFF = zzauVar;
    }

    public C68144Qom(C68033Qmz c68033Qmz, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        QH7.LJI(str2);
        QH7.LJI(str3);
        QH7.LJIIIIZZ(zzauVar);
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LIZJ = true == TextUtils.isEmpty(str) ? null : str;
        this.LIZLLL = j;
        this.LJ = j2;
        if (j2 != 0 && j2 > j) {
            c68033Qmz.LIZJ().LJIIIIZZ.LIZJ(C67280Qaq.LJIIIZ(str2), C67280Qaq.LJIIIZ(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.LJFF = zzauVar;
    }
}
