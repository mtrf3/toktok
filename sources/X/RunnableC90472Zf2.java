package X;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzy;

/* renamed from: X.Zf2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90472Zf2 implements Runnable {
    public final /* synthetic */ C90909Zm5 LJLIL;
    public final /* synthetic */ zzy LJLILLLLZI;

    public RunnableC90472Zf2(C90909Zm5 c90909Zm5, zzy zzyVar) {
        this.LJLIL = c90909Zm5;
        this.LJLILLLLZI = zzyVar;
    }

    public final void LIZ() {
        boolean z;
        boolean z2;
        C90909Zm5 c90909Zm5 = this.LJLIL;
        zzy zzyVar = this.LJLILLLLZI;
        ApplicationMetadata applicationMetadata = zzyVar.zzd;
        if (!C90468Zey.LJFF(applicationMetadata, c90909Zm5.LLIIIL)) {
            c90909Zm5.LLIIIL = applicationMetadata;
            c90909Zm5.LLIIJI.LIZJ(applicationMetadata);
        }
        double d = zzyVar.zza;
        boolean z3 = true;
        if (!Double.isNaN(d) && Math.abs(d - c90909Zm5.LLILL) > 1.0E-7d) {
            c90909Zm5.LLILL = d;
            z = true;
        } else {
            z = false;
        }
        boolean z4 = zzyVar.zzb;
        if (z4 != c90909Zm5.LLIL) {
            c90909Zm5.LLIL = z4;
            z = true;
        }
        Double.isNaN(zzyVar.zzg);
        C90909Zm5.LLIZLLLIL.getClass();
        C90218Zaw c90218Zaw = c90909Zm5.LLIIJI;
        if (c90218Zaw != null && (z || c90909Zm5.LLILIL)) {
            c90218Zaw.LJFF();
        }
        int i = zzyVar.zzc;
        if (i != c90909Zm5.LLILLJJLI) {
            c90909Zm5.LLILLJJLI = i;
            z2 = true;
        } else {
            z2 = false;
        }
        C90218Zaw c90218Zaw2 = c90909Zm5.LLIIJI;
        if (c90218Zaw2 != null && (z2 || c90909Zm5.LLILIL)) {
            c90218Zaw2.LIZ(c90909Zm5.LLILLJJLI);
        }
        int i2 = zzyVar.zze;
        if (i2 != c90909Zm5.LLILLL) {
            c90909Zm5.LLILLL = i2;
        } else {
            z3 = false;
        }
        C90218Zaw c90218Zaw3 = c90909Zm5.LLIIJI;
        if (c90218Zaw3 != null && (z3 || c90909Zm5.LLILIL)) {
            c90218Zaw3.LJ(c90909Zm5.LLILLL);
        }
        if (!C90468Zey.LJFF(c90909Zm5.LLILLIZIL, zzyVar.zzf)) {
            c90909Zm5.LLILLIZIL = zzyVar.zzf;
        }
        c90909Zm5.LLILIL = false;
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
