package X;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Qje, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67826Qje<T> implements InterfaceC67661Qgz<T> {
    public final C67824Qjc LJLIL;
    public final int LJLILLLLZI;
    public final C67719Qhv<?> LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;

    public C67826Qje(C67824Qjc c67824Qjc, int i, C67719Qhv c67719Qhv, long j, long j2) {
        this.LJLIL = c67824Qjc;
        this.LJLILLLLZI = i;
        this.LJLJI = c67719Qhv;
        this.LJLJJI = j;
        this.LJLJJL = j2;
    }

    @Override // X.InterfaceC67661Qgz
    public final void onComplete(AbstractC67638Qgc<T> abstractC67638Qgc) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        if (!this.LJLIL.LIZJ()) {
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C67932QlM.LIZ().LIZ;
        if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.zzb) {
            C67825Qjd c67825Qjd = (C67825Qjd) ((ConcurrentHashMap) this.LJLIL.LJLL).get(this.LJLJI);
            if (c67825Qjd != null) {
                Object obj = c67825Qjd.LJLILLLLZI;
                if (!(obj instanceof AbstractC67863QkF)) {
                    return;
                }
                AbstractC67863QkF abstractC67863QkF = (AbstractC67863QkF) obj;
                boolean z2 = true;
                long j2 = 0;
                if (this.LJLJJI > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i7 = abstractC67863QkF.LLF;
                if (rootTelemetryConfiguration != null) {
                    z &= rootTelemetryConfiguration.zzc;
                    i2 = rootTelemetryConfiguration.zzd;
                    i3 = rootTelemetryConfiguration.zze;
                    i = rootTelemetryConfiguration.zza;
                    if (abstractC67863QkF.LLI != null && !abstractC67863QkF.LJIIJJI()) {
                        ConnectionTelemetryConfiguration LIZ = LIZ(c67825Qjd, abstractC67863QkF, this.LJLILLLLZI);
                        if (LIZ == null) {
                            return;
                        }
                        if (!LIZ.zzc || this.LJLJJI <= 0) {
                            z2 = false;
                        }
                        i3 = LIZ.zze;
                        z = z2;
                    }
                } else {
                    i = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                C67824Qjc c67824Qjc = this.LJLIL;
                if (abstractC67638Qgc.LJIILIIL()) {
                    i4 = 0;
                    i5 = 0;
                } else {
                    if (abstractC67638Qgc.LJIIJJI()) {
                        i4 = 100;
                    } else {
                        Exception LJIIIIZZ = abstractC67638Qgc.LJIIIIZZ();
                        if (LJIIIIZZ instanceof ETK) {
                            Status status = ((ETK) LJIIIIZZ).getStatus();
                            i4 = status.zzc;
                            ConnectionResult connectionResult = status.zzf;
                            if (connectionResult == null) {
                                i5 = -1;
                            } else {
                                i5 = connectionResult.zzb;
                            }
                        } else {
                            i4 = 101;
                        }
                    }
                    i5 = -1;
                }
                if (z) {
                    j2 = this.LJLJJI;
                    j = System.currentTimeMillis();
                    i6 = (int) (SystemClock.elapsedRealtime() - this.LJLJJL);
                } else {
                    j = 0;
                    i6 = -1;
                }
                MethodInvocation methodInvocation = new MethodInvocation(this.LJLILLLLZI, i4, i5, i7, i6, j2, j, null, null);
                long j3 = i2;
                HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
                handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(18, new C67924QlE(methodInvocation, i, j3, i3)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration LIZ(X.C67825Qjd<?> r6, X.AbstractC67863QkF<?> r7, int r8) {
        /*
            com.google.android.gms.common.internal.zzj r0 = r7.LLI
            r5 = 0
            if (r0 != 0) goto L6
        L5:
            return r5
        L6:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r4 = r0.LJLJJI
            if (r4 == 0) goto L5
            boolean r0 = r4.zzb
            if (r0 == 0) goto L5
            int[] r3 = r4.zzd
            if (r3 != 0) goto L29
            int[] r3 = r4.zzf
            if (r3 != 0) goto L1d
        L16:
            int r1 = r6.LJLLILLLL
            int r0 = r4.zze
            if (r1 >= r0) goto L5
            return r4
        L1d:
            int r2 = r3.length
            r1 = 0
        L1f:
            if (r1 >= r2) goto L16
            r0 = r3[r1]
            if (r0 != r8) goto L26
            goto L5
        L26:
            int r1 = r1 + 1
            goto L1f
        L29:
            int r2 = r3.length
            r1 = 0
        L2b:
            if (r1 >= r2) goto L5
            r0 = r3[r1]
            if (r0 != r8) goto L32
            goto L16
        L32:
            int r1 = r1 + 1
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67826Qje.LIZ(X.Qjd, X.QkF, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }
}
