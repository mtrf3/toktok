package X;

import Y.IDRunnableS0S0201000;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* renamed from: X.Ivu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48202Ivu implements InterfaceC48201Ivt {
    public NetworkInfo LIZ;
    public EnumC48190Ivi LIZIZ = EnumC48190Ivi.NONE;
    public EnumC111394Yt LIZJ = EnumC111394Yt.UNKNOWN;
    public final ArrayList<InterfaceC69602oG> LIZLLL = new ArrayList<>();

    public final boolean LIZIZ() {
        boolean z;
        synchronized (C48202Ivu.class) {
            NetworkInfo networkInfo = this.LIZ;
            if (networkInfo != null && networkInfo.isAvailable()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean LIZJ() {
        boolean z;
        synchronized (C48202Ivu.class) {
            NetworkInfo networkInfo = this.LIZ;
            z = false;
            if (networkInfo != null && networkInfo.isAvailable() && 1 == this.LIZ.getType()) {
                z = true;
            }
        }
        return z;
    }

    public C48202Ivu() {
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(EF7.LIZIZ(), "connectivity"));
            this.LIZ = LJJLI;
            LJFF(LJJLI);
            C48189Ivh.LIZ = this;
        } catch (Exception unused) {
        }
    }

    public final void LIZ(InterfaceC69602oG interfaceC69602oG) {
        this.LIZLLL.add(interfaceC69602oG);
    }

    public final void LIZLLL(InterfaceC69602oG interfaceC69602oG) {
        this.LIZLLL.remove(interfaceC69602oG);
    }

    public final void LJ(EnumC111394Yt enumC111394Yt) {
        C82544WaS.LIZJ(new IDRunnableS0S0201000(1, this, enumC111394Yt, 8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r2 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.net.NetworkInfo r21) {
        /*
            r20 = this;
            r0 = r20
            if (r21 == 0) goto La
            boolean r1 = r21.isAvailable()
            if (r1 != 0) goto Lf
        La:
            X.Ivi r1 = X.EnumC48190Ivi.NONE
            r0.LIZIZ = r1
            return
        Lf:
            int r1 = r21.getType()
            r4 = 1
            if (r4 != r1) goto L1b
            X.Ivi r1 = X.EnumC48190Ivi.WIFI
            r0.LIZIZ = r1
        L1a:
            return
        L1b:
            if (r1 != 0) goto Lac
            android.content.Context r2 = X.EF7.LIZIZ()
            java.lang.String r1 = "phone"
            java.lang.Object r10 = X.C16880lQ.LLILL(r2, r1)
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r3 = 0
            if (r2 < r1) goto L53
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C48001Isf.LIZ
            boolean r1 = r1.getAndSet(r4)
            if (r1 != 0) goto L3f
            X.Isc r1 = X.C48001Isf.LIZ()
            r1.LIZIZ()
        L3f:
            X.Isc r1 = X.C48001Isf.LIZ()
            int r2 = r1.LIZ()
            boolean r1 = X.C48001Isf.LIZJ
            if (r1 != 0) goto L8e
            r1 = -1
            if (r2 != r1) goto L8e
        L4e:
            X.Ivi r1 = X.EnumC48190Ivi.MOBILE
            r0.LIZIZ = r1
            goto L1a
        L53:
            X.0Dg r4 = new X.0Dg
            r1 = 2
            r4.<init>(r1)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            X.Pk0 r11 = new X.Pk0
            java.lang.String r2 = "()I"
            java.lang.String r1 = "2394579708470390357"
            r11.<init>(r3, r2, r1)
            r5 = 102013(0x18e7d, float:1.4295E-40)
            java.lang.String r14 = "android/telephony/TelephonyManager"
            java.lang.String r15 = "getNetworkType"
            java.lang.String r18 = "int"
            r12 = r4
            r13 = r5
            r16 = r10
            r17 = r9
            r19 = r11
            X.Ff9 r2 = r12.LIZJ(r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r2.LIZ
            if (r1 == 0) goto L92
            r8 = 0
            java.lang.String r6 = "android/telephony/TelephonyManager"
            java.lang.String r7 = "getNetworkType"
            r12 = 0
            r4.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r2.LIZIZ
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
        L8e:
            switch(r2) {
                case 3: goto La3;
                case 4: goto L4e;
                case 5: goto La3;
                case 6: goto La3;
                case 7: goto L4e;
                case 8: goto La3;
                case 9: goto La3;
                case 10: goto La3;
                case 11: goto L4e;
                case 12: goto La3;
                case 13: goto La7;
                case 14: goto La3;
                case 15: goto La3;
                default: goto L91;
            }
        L91:
            goto L4e
        L92:
            int r2 = r10.getNetworkType()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "android/telephony/TelephonyManager"
            java.lang.String r7 = "getNetworkType"
            r12 = 1
            r4.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L8e
        La3:
            X.Ivi r1 = X.EnumC48190Ivi.MOBILE_3G
            r0.LIZIZ = r1
        La7:
            X.Ivi r1 = X.EnumC48190Ivi.MOBILE_4G
            r0.LIZIZ = r1
            goto L4e
        Lac:
            X.Ivi r1 = X.EnumC48190Ivi.MOBILE
            r0.LIZIZ = r1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48202Ivu.LJFF(android.net.NetworkInfo):void");
    }
}
