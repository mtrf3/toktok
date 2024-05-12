package X;

import android.view.View;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import defpackage.i0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: X.1RF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RF implements C57Q {
    public static final double LJII(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @Override // X.C57Q
    public void LIZLLL(View view) {
    }

    public static List LJ(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Object obj : LJ(interfaces[i])) {
                    if (!arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        return arrayList;
    }

    public static IOException LJI(NetworkExceptionImpl networkExceptionImpl) {
        IOException unknownHostException;
        switch (networkExceptionImpl.getErrorCode()) {
            case 1:
                unknownHostException = new UnknownHostException(networkExceptionImpl.getMessage());
                break;
            case 2:
            case 3:
                unknownHostException = new ConnectException(networkExceptionImpl.getMessage());
                break;
            case 4:
                unknownHostException = new SocketTimeoutException(networkExceptionImpl.getMessage());
                break;
            case 5:
            case 7:
                unknownHostException = new ConnectException(networkExceptionImpl.getMessage());
                break;
            case 6:
                unknownHostException = new ConnectTimeoutException(networkExceptionImpl.getMessage());
                break;
            case 8:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reset by peer ");
                LIZ.append(networkExceptionImpl.getMessage());
                unknownHostException = new SocketException(X1D.LIZIZ(LIZ));
                break;
            case 9:
                unknownHostException = new NoRouteToHostException(networkExceptionImpl.getMessage());
                break;
            default:
                return networkExceptionImpl;
        }
        return unknownHostException;
    }

    @Override // X.C57Q
    public void LIZ(View view) {
        TDU tdu;
        if ((view instanceof TDV) && (tdu = (TDU) view) != null) {
            tdu.setProgress(100);
        }
    }

    @Override // X.C57Q
    public void LIZIZ(int i, View view) {
        TDU tdu;
        if ((view instanceof TDV) && (tdu = (TDU) view) != null) {
            tdu.setProgress(i);
        }
    }

    public static NetworkExceptionImpl LIZJ(int i, int i2, String str) {
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                i = 11;
                break;
            default:
                if (QE0.LIZ().loggerDebug()) {
                    QE0 LIZ = QE0.LIZ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Unknown error code: ");
                    LIZ2.append(i);
                    LIZ.loggerD("monitor", X1D.LIZIZ(LIZ2));
                    break;
                }
                break;
        }
        return new NetworkExceptionImpl(i0.LJFF("Exception in CronetUrlRequest: ", str), i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r6 == X.C24500xi.LIZIZ) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r10 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC35811ar LJFF(X.InterfaceC65784Pro r9, X.InterfaceC65784Pro r10, X.InterfaceC65784Pro r11, X.InterfaceC24520xk r12) {
        /*
            java.lang.String r0 = "firstVisibleItemIndex"
            r7 = r9
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "slidingWindowSize"
            r8 = r10
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "extraItemCount"
            r9 = r11
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r0 = 429733345(0x199d35e1, float:1.6255181E-23)
            r12.LJJIIJ(r0)
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            r12.LJJIIJ(r0)
            boolean r1 = r12.LJIJJ(r7)
            boolean r0 = r12.LJIJJ(r8)
            r1 = r1 | r0
            boolean r0 = r12.LJIJJ(r9)
            r1 = r1 | r0
            java.lang.Object r10 = r12.LJIILL()
            r4 = 0
            if (r1 != 0) goto L3c
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r10 != r0) goto L88
        L3c:
            X.0OA r6 = X.C0O8.LIZ()
            X.0OA r5 = r6.LJIIIIZZ()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r7.invoke()     // Catch: java.lang.Throwable -> L78
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L78
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r8.invoke()     // Catch: java.lang.Throwable -> L78
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L78
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r9.invoke()     // Catch: java.lang.Throwable -> L78
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L78
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L78
            int r3 = r3 / r2
            int r3 = r3 * r2
            int r0 = r3 - r1
            int r0 = java.lang.Math.max(r0, r4)     // Catch: java.lang.Throwable -> L78
            int r3 = r3 + r2
            int r3 = r3 + r1
            X.FvF r0 = X.C78842Uww.LJJ(r0, r3)     // Catch: java.lang.Throwable -> L78
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.C78966Uyw.LJJJIL(r0)     // Catch: java.lang.Throwable -> L78
            X.C0OA.LJIILJJIL(r5)     // Catch: java.lang.Throwable -> L7d
            goto L82
        L78:
            r0 = move-exception
            X.C0OA.LJIILJJIL(r5)     // Catch: java.lang.Throwable -> L7d
            throw r0     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            r6.LIZJ()
            throw r0
        L82:
            r6.LIZJ()
            r12.LJJIII(r10)
        L88:
            r12.LJJIJIIJIL()
            X.1ar r10 = (X.InterfaceC35811ar) r10
            r3 = 4
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r7
            r0 = 1
            r2[r0] = r8
            r0 = 2
            r2[r0] = r9
            r0 = 3
            r2[r0] = r10
            r0 = -568225417(0xffffffffde219177, float:-2.9105543E18)
            r12.LJJIIJ(r0)
            r1 = 0
        La2:
            r0 = r2[r4]
            boolean r0 = r12.LJIJJ(r0)
            r1 = r1 | r0
            int r4 = r4 + 1
            if (r4 >= r3) goto Lae
            goto La2
        Lae:
            java.lang.Object r6 = r12.LJIILL()
            if (r1 != 0) goto Lbd
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r6 != r0) goto Lc6
        Lbd:
            X.2E9 r6 = new X.2E9
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r12.LJJIII(r6)
        Lc6:
            r12.LJJIJIIJIL()
            X.Ynr r6 = (X.InterfaceC88471Ynr) r6
            X.C24610xt.LJ(r10, r6, r12)
            r12.LJJIJIIJIL()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1RF.LJFF(X.Pro, X.Pro, X.Pro, X.0xk):X.1ar");
    }

    public static final Object LJIIIIZZ(MBA mba, Object obj, Object obj2, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC67352kd frame) {
        Object LIZJ = XLG.LIZJ(obj2, mba);
        try {
            C65851Pst c65851Pst = new C65851Pst(frame, mba);
            if (interfaceC88471Ynr != null) {
                C65777Prh.LJ(2, interfaceC88471Ynr);
                Object invoke = interfaceC88471Ynr.invoke(obj, c65851Pst);
                XLG.LIZ(LIZJ, mba);
                if (invoke == EnumC58928NAu.COROUTINE_SUSPENDED) {
                    o.LJIIIZ(frame, "frame");
                }
                return invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            XLG.LIZ(LIZJ, mba);
            throw th;
        }
    }
}
