package X;

import Y.ARunnableS38S0100000_2;
import com.bytedance.ies.nle.editor_jni.KeyframeType;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5J2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J2 implements InterfaceC132785Ja {
    public final /* synthetic */ C5J1 LIZ;

    public C5J2(C5J1 c5j1) {
        this.LIZ = c5j1;
    }

    @Override // X.InterfaceC132785Ja
    public final void LIZ(String str, long j, String str2, KeyframeType keyframeType) {
        InterfaceC125914wt interfaceC125914wt = this.LIZ.LJIJJ;
        if (interfaceC125914wt != null) {
            interfaceC125914wt.LIZ(str, j, str2, keyframeType);
        }
    }

    @Override // X.InterfaceC132785Ja
    public final void LIZIZ(int i, int i2, float f, String str) {
        C5JL c5jl = this.LIZ.LJIIIIZZ;
        if (c5jl != null) {
            c5jl.LIZ(i, i2, f, str);
        }
    }

    @Override // X.InterfaceC132785Ja
    public final void LIZJ(int i, final int i2, final float f, String str) {
        String str2;
        if (i == 4101) {
            for (Map.Entry<Long, AnonymousClass519> entry : this.LIZ.LJIIIZ.entrySet()) {
                if (Math.abs(((float) entry.getKey().longValue()) - (1000 * f)) <= 1) {
                    this.LIZ.LJIIIZ.remove(entry.getKey());
                    this.LIZ.LIZ().post(new ARunnableS38S0100000_2(entry, 145));
                }
            }
        } else if (i == 4097) {
            InterfaceC132775Iz interfaceC132775Iz = this.LIZ.LJIIJ;
            if (interfaceC132775Iz != null) {
                interfaceC132775Iz.LIZ();
            }
        } else if (i == 4133) {
            C5J1 c5j1 = this.LIZ;
            if (c5j1.LJJII != null) {
                c5j1.LIZ().post(new Runnable() { // from class: X.5J8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            C5J0 c5j0 = C5J2.this.LIZ.LJJII;
                            if (c5j0 != null) {
                                c5j0.LIZ(i2, C78926UyI.LJJJI(f));
                            }
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        } else if (i == 4144) {
            C5JK c5jk = this.LIZ.LJIILIIL;
            if (c5jk != null) {
                c5jk.LIZ();
            }
            this.LIZ.LJIILIIL = null;
        } else if (i == 4145) {
            C5JK c5jk2 = this.LIZ.LJIILIIL;
            if (c5jk2 != null) {
                c5jk2.LIZIZ(i2);
            }
            this.LIZ.LJIILIIL = null;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LJI).iterator();
        while (it.hasNext()) {
            C5JL c5jl = (C5JL) it.next();
            if (str != null) {
                str2 = str;
            } else {
                str2 = "";
            }
            c5jl.LIZ(i, i2, f, str2);
        }
    }
}
