package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Zlb, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class BinderC90879Zlb extends AbstractBinderC90822Zkg {
    public final /* synthetic */ C90880Zlc LJLIL;

    @Override // X.InterfaceC90473Zf3
    public final void LLZLI() {
        C90880Zlc.LJJIJ.getClass();
    }

    public BinderC90879Zlb(C90880Zlc c90880Zlc) {
        this.LJLIL = c90880Zlc;
    }

    @Override // X.InterfaceC90473Zf3
    public final void C(byte[] bArr) {
        C90880Zlc.LJJIJ.getClass();
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIILL(int i) {
        C90880Zlc.LJFF(this.LJLIL, i);
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIJI(final int i) {
        C90880Zlc.LJFF(this.LJLIL, i);
        C90880Zlc c90880Zlc = this.LJLIL;
        if (c90880Zlc.LJJIIJZLJL != null) {
            C90880Zlc.LJIILJJIL(c90880Zlc).post(new Runnable() { // from class: X.ZX2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        BinderC90879Zlb binderC90879Zlb = BinderC90879Zlb.this;
                        binderC90879Zlb.LJLIL.LJJIIJZLJL.LIZIZ(i);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIJJ(int i) {
        C90880Zlc.LJFF(this.LJLIL, i);
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJIJJLI(int i) {
        this.LJLIL.LJIIIZ(i);
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJJIIJ(final int i) {
        C90880Zlc.LJIILJJIL(this.LJLIL).post(new Runnable() { // from class: X.ZWR
            public final void LIZ() {
                BinderC90879Zlb binderC90879Zlb = BinderC90879Zlb.this;
                int i2 = i;
                C90880Zlc c90880Zlc = binderC90879Zlb.LJLIL;
                c90880Zlc.LJJ = -1;
                c90880Zlc.LJJI = -1;
                c90880Zlc.LJIJI = null;
                c90880Zlc.LJIJJ = null;
                c90880Zlc.LJIJJLI = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                c90880Zlc.LJIILIIL();
                c90880Zlc.LJIL = false;
                c90880Zlc.LJJIFFI = null;
                C90880Zlc c90880Zlc2 = binderC90879Zlb.LJLIL;
                c90880Zlc2.LJJIIZI = 1;
                synchronized (c90880Zlc2.LJJIIZ) {
                    Iterator<ZX1> it = binderC90879Zlb.LJLIL.LJJIIZ.iterator();
                    while (it.hasNext()) {
                        it.next().LIZLLL(i2);
                    }
                }
                binderC90879Zlb.LJLIL.LJIIIIZZ();
                C90880Zlc c90880Zlc3 = binderC90879Zlb.LJLIL;
                c90880Zlc3.LJI(c90880Zlc3.LJIIJ);
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
        });
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJLIIIL(final int i) {
        C90880Zlc.LJIILJJIL(this.LJLIL).post(new Runnable() { // from class: X.ZX4
            public final void LIZ() {
                BinderC90879Zlb binderC90879Zlb = BinderC90879Zlb.this;
                int i2 = i;
                if (i2 == 0) {
                    C90880Zlc c90880Zlc = binderC90879Zlb.LJLIL;
                    c90880Zlc.LJJIIZI = 2;
                    c90880Zlc.LJIIL = true;
                    c90880Zlc.LJIILIIL = true;
                    synchronized (c90880Zlc.LJJIIZ) {
                        Iterator<ZX1> it = binderC90879Zlb.LJLIL.LJJIIZ.iterator();
                        while (it.hasNext()) {
                            it.next().LIZ();
                        }
                    }
                    return;
                }
                C90880Zlc c90880Zlc2 = binderC90879Zlb.LJLIL;
                c90880Zlc2.LJJIIZI = 1;
                synchronized (c90880Zlc2.LJJIIZ) {
                    Iterator<ZX1> it2 = binderC90879Zlb.LJLIL.LJJIIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(i2);
                    }
                }
                binderC90879Zlb.LJLIL.LJIIIIZZ();
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
        });
    }

    @Override // X.InterfaceC90473Zf3
    public final void LJLLI(long j) {
        C90880Zlc.LJ(this.LJLIL, j, 0);
    }

    @Override // X.InterfaceC90473Zf3
    public final void LLFZ(final int i) {
        C90880Zlc.LJIILJJIL(this.LJLIL).post(new Runnable() { // from class: X.ZWT
            public final void LIZ() {
                BinderC90879Zlb binderC90879Zlb = BinderC90879Zlb.this;
                int i2 = i;
                C90880Zlc c90880Zlc = binderC90879Zlb.LJLIL;
                c90880Zlc.LJJIIZI = 3;
                synchronized (c90880Zlc.LJJIIZ) {
                    Iterator<ZX1> it = binderC90879Zlb.LJLIL.LJJIIZ.iterator();
                    while (it.hasNext()) {
                        it.next().LIZJ(i2);
                    }
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
        });
    }

    @Override // X.InterfaceC90473Zf3
    public final void LLILLJJLI(final zzy zzyVar) {
        C90880Zlc.LJIILJJIL(this.LJLIL).post(new Runnable() { // from class: X.ZWX
            public final void LIZ() {
                boolean z;
                boolean z2;
                BinderC90879Zlb binderC90879Zlb = BinderC90879Zlb.this;
                zzy zzyVar2 = zzyVar;
                C90880Zlc c90880Zlc = binderC90879Zlb.LJLIL;
                ApplicationMetadata applicationMetadata = zzyVar2.zzd;
                if (!C90468Zey.LJFF(applicationMetadata, c90880Zlc.LJIJI)) {
                    c90880Zlc.LJIJI = applicationMetadata;
                    c90880Zlc.LJJIIJZLJL.LIZJ(applicationMetadata);
                }
                double d = zzyVar2.zza;
                boolean z3 = true;
                if (!Double.isNaN(d) && Math.abs(d - c90880Zlc.LJIJJLI) > 1.0E-7d) {
                    c90880Zlc.LJIJJLI = d;
                    z = true;
                } else {
                    z = false;
                }
                boolean z4 = zzyVar2.zzb;
                if (z4 != c90880Zlc.LJIL) {
                    c90880Zlc.LJIL = z4;
                    z = true;
                }
                C90880Zlc.LJJIJ.getClass();
                C90218Zaw c90218Zaw = c90880Zlc.LJJIIJZLJL;
                if (c90218Zaw != null && (z || c90880Zlc.LJIIL)) {
                    c90218Zaw.LJFF();
                }
                Double.isNaN(zzyVar2.zzg);
                int i = zzyVar2.zzc;
                if (i != c90880Zlc.LJJ) {
                    c90880Zlc.LJJ = i;
                    z2 = true;
                } else {
                    z2 = false;
                }
                C90218Zaw c90218Zaw2 = c90880Zlc.LJJIIJZLJL;
                if (c90218Zaw2 != null && (z2 || c90880Zlc.LJIIL)) {
                    c90218Zaw2.LIZ(c90880Zlc.LJJ);
                }
                int i2 = zzyVar2.zze;
                if (i2 != c90880Zlc.LJJI) {
                    c90880Zlc.LJJI = i2;
                } else {
                    z3 = false;
                }
                C90218Zaw c90218Zaw3 = c90880Zlc.LJJIIJZLJL;
                if (c90218Zaw3 != null && (z3 || c90880Zlc.LJIIL)) {
                    c90218Zaw3.LJ(c90880Zlc.LJJI);
                }
                if (!C90468Zey.LJFF(c90880Zlc.LJJIFFI, zzyVar2.zzf)) {
                    c90880Zlc.LJJIFFI = zzyVar2.zzf;
                }
                c90880Zlc.LJIIL = false;
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
        });
    }

    @Override // X.InterfaceC90473Zf3
    public final void m0(final zza zzaVar) {
        C90880Zlc.LJIILJJIL(this.LJLIL).post(new Runnable() { // from class: X.ZWV
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                boolean z;
                try {
                    BinderC90879Zlb binderC90879Zlb = BinderC90879Zlb.this;
                    zza zzaVar2 = zzaVar;
                    C90880Zlc c90880Zlc = binderC90879Zlb.LJLIL;
                    String str = zzaVar2.zza;
                    if (!C90468Zey.LJFF(str, c90880Zlc.LJIJJ)) {
                        c90880Zlc.LJIJJ = str;
                        z = true;
                    } else {
                        z = false;
                    }
                    C90880Zlc.LJJIJ.getClass();
                    C90218Zaw c90218Zaw = c90880Zlc.LJJIIJZLJL;
                    if (c90218Zaw != null && (z || c90880Zlc.LJIILIIL)) {
                        c90218Zaw.LIZLLL();
                    }
                    c90880Zlc.LJIILIIL = false;
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC90473Zf3
    public final void LLJJIJIL(final String str, final String str2) {
        C90880Zlc.LJJIJ.getClass();
        C90880Zlc.LJIILJJIL(this.LJLIL).post(new Runnable() { // from class: X.ZWZ
            public final void LIZ() {
                InterfaceC90219Zax interfaceC90219Zax;
                BinderC90879Zlb binderC90879Zlb = BinderC90879Zlb.this;
                String str3 = str;
                String str4 = str2;
                synchronized (binderC90879Zlb.LJLIL.LJJIIJ) {
                    interfaceC90219Zax = (InterfaceC90219Zax) ((HashMap) binderC90879Zlb.LJLIL.LJJIIJ).get(str3);
                }
                if (interfaceC90219Zax != null) {
                    interfaceC90219Zax.LIZ(str4);
                } else {
                    C90880Zlc.LJJIJ.getClass();
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
        });
    }

    @Override // X.InterfaceC90473Zf3
    public final void n(int i, long j) {
        C90880Zlc.LJ(this.LJLIL, j, i);
    }

    @Override // X.InterfaceC90473Zf3
    public final void i0(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        C90880Zlc c90880Zlc = this.LJLIL;
        c90880Zlc.LJIJI = applicationMetadata;
        c90880Zlc.LJIJJ = str;
        C90907Zm3 c90907Zm3 = new C90907Zm3(new Status(0, null, null), applicationMetadata, str, str2, z);
        synchronized (c90880Zlc.LJIIZILJ) {
            C67649Qgn<InterfaceC90654Zhy> c67649Qgn = c90880Zlc.LJIILJJIL;
            if (c67649Qgn != null) {
                c67649Qgn.LIZIZ(c90907Zm3);
            }
            c90880Zlc.LJIILJJIL = null;
        }
    }
}
