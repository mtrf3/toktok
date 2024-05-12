package X;

import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;

/* renamed from: X.QqE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC68234QqE implements Callable {
    public final /* synthetic */ zzq LJLIL;
    public final /* synthetic */ C68241QqL LJLILLLLZI;

    public CallableC68234QqE(C68241QqL c68241QqL, zzq zzqVar) {
        this.LJLILLLLZI = c68241QqL;
        this.LJLIL = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C68241QqL c68241QqL = this.LJLILLLLZI;
        String str = this.LJLIL.zza;
        QH7.LJIIIIZZ(str);
        C68090Qnu LJJIJL = c68241QqL.LJJIJL(str);
        EnumC68125QoT enumC68125QoT = EnumC68125QoT.ANALYTICS_STORAGE;
        if (!LJJIJL.LJFF(enumC68125QoT) || !C68090Qnu.LIZIZ(this.LJLIL.zzv).LJFF(enumC68125QoT)) {
            this.LJLILLLLZI.LIZJ().LJIILIIL.LIZ("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        return this.LJLILLLLZI.LJJIJIIJIL(this.LJLIL).LJJ();
    }
}
