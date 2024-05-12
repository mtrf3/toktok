package X;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* renamed from: X.Qo4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68100Qo4 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ zzq LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC68139Qoh LJLJJL;
    public final /* synthetic */ C68022Qmo LJLJJLL;

    public RunnableC68100Qo4(C68022Qmo c68022Qmo, String str, String str2, zzq zzqVar, boolean z, InterfaceC68139Qoh interfaceC68139Qoh) {
        this.LJLJJLL = c68022Qmo;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = zzqVar;
        this.LJLJJI = z;
        this.LJLJJL = interfaceC68139Qoh;
    }

    public final void LIZ() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        try {
            C68022Qmo c68022Qmo = this.LJLJJLL;
            InterfaceC68041Qn7 interfaceC68041Qn7 = c68022Qmo.LIZLLL;
            if (interfaceC68041Qn7 == null) {
                c68022Qmo.LIZ.LIZJ().LJFF.LIZJ(this.LJLIL, this.LJLILLLLZI, "Failed to get user properties; not connected to service");
                this.LJLJJLL.LIZ.LJIL().LJJIFFI(this.LJLJJL, bundle2);
                return;
            }
            QH7.LJIIIIZZ(this.LJLJI);
            List<zzlo> E = interfaceC68041Qn7.E(this.LJLIL, this.LJLILLLLZI, this.LJLJJI, this.LJLJI);
            bundle = new Bundle();
            if (E != null) {
                for (zzlo zzloVar : E) {
                    String str = zzloVar.zze;
                    if (str != null) {
                        bundle.putString(zzloVar.zzb, str);
                    } else {
                        Long l = zzloVar.zzd;
                        if (l != null) {
                            bundle.putLong(zzloVar.zzb, l.longValue());
                        } else {
                            Double d = zzloVar.zzg;
                            if (d != null) {
                                bundle.putDouble(zzloVar.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.LJLJJLL.LJIILLIIL();
                    this.LJLJJLL.LIZ.LJIL().LJJIFFI(this.LJLJJL, bundle);
                } catch (RemoteException e) {
                    e = e;
                    this.LJLJJLL.LIZ.LIZJ().LJFF.LIZJ(this.LJLIL, e, "Failed to get user properties; remote exception");
                    this.LJLJJLL.LIZ.LJIL().LJJIFFI(this.LJLJJL, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.LJLJJLL.LIZ.LJIL().LJJIFFI(this.LJLJJL, bundle2);
                throw th;
            }
        } catch (RemoteException e2) {
            e = e2;
            bundle = bundle2;
        } catch (Throwable th2) {
            th = th2;
            this.LJLJJLL.LIZ.LJIL().LJJIFFI(this.LJLJJL, bundle2);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
