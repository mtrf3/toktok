package com.ttnet.org.chromium.net;

import X.AbstractC88147Yid;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.C88141YiX;
import X.C88145Yib;
import X.C88148Yie;
import X.C88149Yif;
import X.C88150Yig;
import X.C88151Yih;
import X.C88152Yii;
import X.InterfaceC88142YiY;
import X.O6T;
import Y.ARunnableS18S0201000_15;
import Y.ARunnableS52S0100000_16;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.base.ApplicationStatus;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes17.dex */
public final class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    public final Looper LIZ;
    public final Handler LIZIZ;
    public final NetworkConnectivityIntentFilter LIZJ;
    public final InterfaceC88142YiY LIZLLL;
    public final AbstractC88147Yid LJ;
    public ConnectivityManager.NetworkCallback LJFF;
    public final C88148Yie LJI;
    public final C88152Yii LJII;
    public C88145Yib LJIIIIZZ;
    public final NetworkRequest LJIIIZ;
    public boolean LJIIJ;
    public C88150Yig LJIIJJI;
    public boolean LJIIL;
    public final boolean LJIILIIL;
    public boolean LJIILJJIL;

    public static int LIZIZ(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return 5;
            default:
                return 0;
        }
    }

    public final C88150Yig LIZLLL() {
        NetworkInfo LJJLI;
        Network network;
        boolean z;
        C88148Yie c88148Yie = this.LJI;
        C88152Yii c88152Yii = this.LJII;
        c88148Yie.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            network = c88148Yie.LIZIZ();
            LJJLI = c88148Yie.LIZLLL(network);
            if (LJJLI != null) {
                if (LJJLI.getType() == 17) {
                    LJJLI = C16880lQ.LJJLI(c88148Yie.LIZ);
                }
            }
            return new C88150Yig(false, -1, -1, false, null, null, false, "");
        }
        LJJLI = C16880lQ.LJJLI(c88148Yie.LIZ);
        network = null;
        if (LJJLI != null && (LJJLI.isConnected() || (LJJLI.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1))) {
            if (network != null) {
                NetworkCapabilities LIZJ = c88148Yie.LIZJ(network);
                if (LIZJ != null && !LIZJ.hasCapability(11)) {
                    z = true;
                } else {
                    z = false;
                }
                DnsStatus LIZLLL = AndroidNetworkLibrary.LIZLLL(network);
                if (LIZLLL == null) {
                    return new C88150Yig(true, LJJLI.getType(), LJJLI.getSubtype(), z, String.valueOf(LJ(network)), null, false, "");
                }
                ArrayList arrayList = new ArrayList();
                try {
                    for (byte[] bArr : LIZLLL.getDnsServers()) {
                        arrayList.add(InetAddress.getByAddress(bArr));
                    }
                } catch (UnknownHostException unused) {
                }
                return new C88150Yig(true, LJJLI.getType(), LJJLI.getSubtype(), z, String.valueOf(LJ(network)), arrayList, LIZLLL.getPrivateDnsActive(), LIZLLL.getPrivateDnsServerName());
            }
            if (LJJLI.getType() == 1) {
                if (LJJLI.getExtraInfo() != null && !"".equals(LJJLI.getExtraInfo())) {
                    return new C88150Yig(true, LJJLI.getType(), LJJLI.getSubtype(), false, LJJLI.getExtraInfo(), null, false, "");
                }
                int type = LJJLI.getType();
                int subtype = LJJLI.getSubtype();
                c88152Yii.getClass();
                return new C88150Yig(true, type, subtype, false, "", null, false, "");
            }
            return new C88150Yig(true, LJJLI.getType(), LJJLI.getSubtype(), false, null, null, false, "");
        }
        return new C88150Yig(false, -1, -1, false, null, null, false, "");
    }

    /* loaded from: classes16.dex */
    public static class NetworkConnectivityIntentFilter extends IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    static {
        C16880lQ.LJLLJ(NetworkChangeNotifierAutoDetect.class);
    }

    public final void LJI() {
        if (!this.LJIIJ) {
            return;
        }
        this.LJIIJ = false;
        C88145Yib c88145Yib = this.LJIIIIZZ;
        if (c88145Yib != null) {
            C88148Yie c88148Yie = this.LJI;
            c88148Yie.getClass();
            try {
                c88148Yie.LIZ.unregisterNetworkCallback(c88145Yib);
            } catch (Throwable unused) {
            }
        }
        ConnectivityManager.NetworkCallback networkCallback = this.LJFF;
        if (networkCallback != null) {
            C88148Yie c88148Yie2 = this.LJI;
            c88148Yie2.getClass();
            try {
                c88148Yie2.LIZ.unregisterNetworkCallback(networkCallback);
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        C16880lQ.LJJLIIIJL(O6T.LIZ, this);
    }

    public static long LJ(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return CastIntegerProtector.parseInt(network.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5.LJII.equals(r2.LJII) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C88150Yig r5) {
        /*
            r4 = this;
            int r1 = r5.LIZIZ()
            X.Yig r0 = r4.LJIIJJI
            int r0 = r0.LIZIZ()
            if (r1 != r0) goto L36
            java.lang.String r1 = r5.LJ
            X.Yig r0 = r4.LJIIJJI
            java.lang.String r0 = r0.LJ
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            java.util.List<java.net.InetAddress> r1 = r5.LJFF
            X.Yig r0 = r4.LJIIJJI
            java.util.List<java.net.InetAddress> r0 = r0.LJFF
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            boolean r1 = r5.LJI
            X.Yig r2 = r4.LJIIJJI
            boolean r0 = r2.LJI
            if (r1 != r0) goto L36
            java.lang.String r1 = r5.LJII
            java.lang.String r0 = r2.LJII
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
        L36:
            X.YiY r0 = r4.LIZLLL
            int r3 = r5.LIZIZ()
            X.YiX r0 = (X.C88141YiX) r0
            com.ttnet.org.chromium.net.NetworkChangeNotifier r2 = r0.LIZ
            r2.LIZLLL = r3
            long r0 = r2.getCurrentDefaultNetId()
            r2.LIZJ(r3, r0)
        L49:
            int r1 = r5.LIZIZ()
            X.Yig r0 = r4.LJIIJJI
            int r0 = r0.LIZIZ()
            if (r1 != r0) goto L61
            int r1 = r5.LIZ()
            X.Yig r0 = r4.LJIIJJI
            int r0 = r0.LIZ()
            if (r1 == r0) goto L6e
        L61:
            X.YiY r0 = r4.LIZLLL
            int r1 = r5.LIZ()
            X.YiX r0 = (X.C88141YiX) r0
            com.ttnet.org.chromium.net.NetworkChangeNotifier r0 = r0.LIZ
            r0.LIZIZ(r1)
        L6e:
            boolean r3 = r5.LIZLLL
            r2 = 2
            if (r3 == 0) goto L8f
            r1 = 2
        L74:
            X.Yig r0 = r4.LJIIJJI
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L8d
            r0 = 2
        L7b:
            if (r1 == r0) goto L88
            X.YiY r0 = r4.LIZLLL
            if (r3 == 0) goto L8b
        L81:
            X.YiX r0 = (X.C88141YiX) r0
            com.ttnet.org.chromium.net.NetworkChangeNotifier r0 = r0.LIZ
            r0.LIZ(r2)
        L88:
            r4.LJIIJJI = r5
            return
        L8b:
            r2 = 1
            goto L81
        L8d:
            r0 = 1
            goto L7b
        L8f:
            r1 = 1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.LIZ(X.Yig):void");
    }

    public final void LJFF(Runnable runnable) {
        if (this.LIZ == Looper.myLooper()) {
            runnable.run();
        } else {
            this.LIZIZ.post(new ARunnableS18S0201000_15(1, this, runnable, 5));
        }
    }

    public NetworkChangeNotifierAutoDetect(C88141YiX c88141YiX, AbstractC88147Yid abstractC88147Yid) {
        C88151Yih c88151Yih;
        Looper myLooper = Looper.myLooper();
        this.LIZ = myLooper;
        this.LIZIZ = new Handler(myLooper);
        this.LIZLLL = c88141YiX;
        this.LJI = new C88148Yie(O6T.LIZ);
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            this.LJII = new C88152Yii();
        }
        this.LJIIIIZZ = new C88145Yib(this);
        this.LJIIIZ = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i >= 30) {
            this.LJFF = new C88149Yif(this);
        } else {
            if (i >= 28) {
                c88151Yih = new C88151Yih(this);
            } else {
                c88151Yih = null;
            }
            this.LJFF = c88151Yih;
        }
        this.LJIIJJI = LIZLLL();
        this.LIZJ = new NetworkConnectivityIntentFilter();
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJ = abstractC88147Yid;
        abstractC88147Yid.LIZIZ(this);
        this.LJIILIIL = true;
    }

    public static Network[] LIZJ(C88148Yie c88148Yie, Network network) {
        Network[] networkArr;
        NetworkCapabilities LIZJ;
        c88148Yie.getClass();
        try {
            networkArr = c88148Yie.LIZ.getAllNetworks();
        } catch (Throwable unused) {
            networkArr = null;
        }
        if (networkArr == null) {
            networkArr = new Network[0];
        }
        int i = 0;
        for (Network network2 : networkArr) {
            if (network2 != null && !network2.equals(network) && (LIZJ = c88148Yie.LIZJ(network2)) != null && LIZJ.hasCapability(12)) {
                if (LIZJ.hasTransport(4)) {
                    if (C88148Yie.LJFF(network2)) {
                        return new Network[]{network2};
                    }
                } else {
                    networkArr[i] = network2;
                    i++;
                }
            }
        }
        return (Network[]) Arrays.copyOf(networkArr, i);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LJFF(new ARunnableS52S0100000_16(this, 1));
        } else {
            C38523F9z.LIZ();
            LJFF(new ARunnableS52S0100000_16(this, 1));
        }
    }
}
