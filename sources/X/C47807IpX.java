package X;

import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import java.lang.ref.WeakReference;

/* renamed from: X.IpX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47807IpX implements InterfaceC47844Iq8 {
    public final WeakReference<C47803IpT> LIZ;

    @Override // X.InterfaceC47844Iq8
    public final void LIZ(C47789IpF c47789IpF) {
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZIZ(String str) {
    }

    public C47807IpX(C47803IpT c47803IpT) {
        this.LIZ = new WeakReference<>(c47803IpT);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC47844Iq8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C47164IfA r10, X.C47789IpF r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onCompletion model "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", error "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r3 = "MDLFetcher"
            X.C78253UnR.LJI(r3, r0)
            java.lang.ref.WeakReference<X.IpT> r0 = r9.LIZ
            java.lang.Object r4 = r0.get()
            X.IpT r4 = (X.C47803IpT) r4
            if (r4 != 0) goto L2d
            java.lang.String r0 = "onCompletion but fetcher is null"
            X.C78253UnR.LJI(r3, r0)
            return
        L2d:
            r5 = 0
            if (r10 == 0) goto L40
            if (r11 == 0) goto L46
        L32:
            int r3 = r11.LIZ
        L34:
            com.ss.mediakit.fetcher.AVMDLURLFetcherListener r2 = r4.LJI
            if (r2 == 0) goto L3f
            java.lang.String r1 = r4.LIZJ
            java.lang.String r0 = r4.LIZLLL
            r2.onCompletion(r3, r1, r0, r5)
        L3f:
            return
        L40:
            if (r11 == 0) goto L43
            goto L32
        L43:
            r3 = -9997(0xffffffffffffd8f3, float:NaN)
            goto L34
        L46:
            java.lang.String r0 = r4.LIZLLL
            java.lang.String[] r0 = X.C47803IpT.LIZ(r0, r10)
            r4.LJ = r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onCompletion newUrls "
            r1.append(r0)
            java.lang.String[] r0 = r4.LJ
            java.lang.String r0 = java.util.Arrays.toString(r0)
            X.JBR.LJIIIZ(r1, r0, r1, r3)
            java.lang.String[] r8 = r4.LJ
            java.lang.String r7 = r4.LJIIIIZZ
            r6 = 0
            if (r8 == 0) goto L6a
            int r0 = r8.length
            if (r0 > 0) goto L7c
        L6a:
            java.lang.String r0 = "onCompletion invalid"
            X.C78253UnR.LJI(r3, r0)
            com.ss.mediakit.fetcher.AVMDLURLFetcherListener r3 = r4.LJI
            if (r3 == 0) goto L7b
            java.lang.String r2 = r4.LIZJ
            java.lang.String r1 = r4.LIZLLL
            r0 = -1
            r3.onCompletion(r0, r2, r1, r5)
        L7b:
            return
        L7c:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L95
        L82:
            java.lang.String r0 = "onCompletion success"
            X.C78253UnR.LJI(r3, r0)
            com.ss.mediakit.fetcher.AVMDLURLFetcherListener r3 = r4.LJI
            if (r3 == 0) goto L7b
            java.lang.String r2 = r4.LIZJ
            java.lang.String r1 = r4.LIZLLL
            java.lang.String[] r0 = r4.LJ
            r3.onCompletion(r6, r2, r1, r0)
            goto L7b
        L95:
            int r2 = r8.length
            r1 = 0
        L97:
            if (r1 >= r2) goto L82
            r0 = r8[r1]
            boolean r0 = android.text.TextUtils.equals(r0, r7)
            if (r0 == 0) goto La7
            java.lang.String r0 = "new urls is invalid"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)
            goto L6a
        La7:
            int r1 = r1 + 1
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47807IpX.LIZJ(X.IfA, X.IpF):void");
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZLLL(int i, String str) {
        C47803IpT c47803IpT = this.LIZ.get();
        if (c47803IpT == null) {
            C78253UnR.LJI("MDLFetcher", "onStatusException but fetcher is null");
            return;
        }
        AVMDLURLFetcherListener aVMDLURLFetcherListener = c47803IpT.LJI;
        if (aVMDLURLFetcherListener != null) {
            aVMDLURLFetcherListener.onCompletion(i, c47803IpT.LIZJ, c47803IpT.LIZLLL, null);
        }
    }
}
