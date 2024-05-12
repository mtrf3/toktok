package com.ttnet.org.chromium.net;

import J.N;
import X.AbstractC88147Yid;
import X.C66683QFb;
import X.C66684QFc;
import X.C88141YiX;
import X.C88145Yib;
import X.C88150Yig;
import X.InterfaceC88140YiW;
import X.VI3;
import Y.ARunnableS52S0100000_16;
import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes17.dex */
public class NetworkChangeNotifier {
    public static NetworkChangeNotifier LJFF;
    public final ArrayList<Long> LIZ = new ArrayList<>();
    public final C66684QFc<InterfaceC88140YiW> LIZIZ = new C66684QFc<>();
    public NetworkChangeNotifierAutoDetect LIZJ;
    public int LIZLLL;
    public int LJ;

    public static void forceUpdateNetworkTypeInfo() {
        NetworkChangeNotifier networkChangeNotifier = LJFF;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = networkChangeNotifier.LIZJ;
        if (networkChangeNotifierAutoDetect != null) {
            C88150Yig LIZLLL = networkChangeNotifierAutoDetect.LIZLLL();
            if (networkChangeNotifier.LIZLLL != LIZLLL.LIZIZ()) {
                networkChangeNotifier.LIZLLL = LIZLLL.LIZIZ();
                networkChangeNotifier.LIZJ.LJFF(new ARunnableS52S0100000_16(networkChangeNotifier, 2));
            }
        }
    }

    public static NetworkChangeNotifier init() {
        if (LJFF == null) {
            LJFF = new NetworkChangeNotifier();
        }
        return LJFF;
    }

    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.LIZLLL().LIZ();
    }

    public long getCurrentDefaultNetId() {
        Network LIZIZ;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null || (LIZIZ = networkChangeNotifierAutoDetect.LJI.LIZIZ()) == null) {
            return -1L;
        }
        return NetworkChangeNotifierAutoDetect.LJ(LIZIZ);
    }

    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null) {
            return new long[0];
        }
        Network[] LIZJ = NetworkChangeNotifierAutoDetect.LIZJ(networkChangeNotifierAutoDetect.LJI, null);
        long[] jArr = new long[LIZJ.length * 2];
        int i = 0;
        for (Network network : LIZJ) {
            int i2 = i + 1;
            jArr[i] = NetworkChangeNotifierAutoDetect.LJ(network);
            i = i2 + 1;
            jArr[i2] = networkChangeNotifierAutoDetect.LJI.LIZ(r3);
        }
        return jArr;
    }

    public long getCurrentVpnNetId() {
        C88145Yib c88145Yib;
        Network network;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null || (c88145Yib = networkChangeNotifierAutoDetect.LJIIIIZZ) == null || (network = c88145Yib.LIZ) == null) {
            return -1L;
        }
        return NetworkChangeNotifierAutoDetect.LJ(network);
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.LJIILJJIL;
    }

    public int getCurrentConnectionCost() {
        return this.LJ;
    }

    public int getCurrentConnectionType() {
        return this.LIZLLL;
    }

    public static void fakeConnectionCostChanged(int i) {
        setAutoDetectConnectivityState(false);
        LJFF.LIZ(i);
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        LJFF.LIZIZ(i);
    }

    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        LJFF.LJ(j, false);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        LJFF.LJFF(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        LJFF.LJI(jArr);
    }

    public static void forceConnectivityState(boolean z) {
        boolean z2;
        int i = 0;
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = LJFF;
        if (networkChangeNotifier.LIZLLL != 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 6;
            }
            networkChangeNotifier.LIZLLL = i;
            networkChangeNotifier.LIZJ(i, networkChangeNotifier.getCurrentDefaultNetId());
            networkChangeNotifier.LIZIZ(!z ? 1 : 0);
        }
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        LJFF.LJII(z, new VI3());
    }

    public final void LIZ(int i) {
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            N.MZnuk2LK(it.next().longValue(), this, i);
        }
    }

    public final void LIZIZ(int i) {
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            N.MqNJnYjG(it.next().longValue(), this, i);
        }
    }

    public final void LJFF(long j) {
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            N.MssT8yD3(it.next().longValue(), this, j);
        }
    }

    public final void LJI(long[] jArr) {
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            N.Mvng38R0(it.next().longValue(), this, jArr);
        }
    }

    public void addNativeObserver(long j) {
        this.LIZ.add(Long.valueOf(j));
    }

    public void removeNativeObserver(long j) {
        this.LIZ.remove(Long.valueOf(j));
    }

    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        LJFF.LIZJ(i, j);
    }

    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        LJFF.LIZLLL(i, j, false);
    }

    public final void LIZJ(int i, long j) {
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            N.MjJzrRFH(it.next().longValue(), this, i, j);
        }
        Iterator<InterfaceC88140YiW> it2 = this.LIZIZ.iterator();
        while (true) {
            C66683QFb c66683QFb = (C66683QFb) it2;
            if (c66683QFb.hasNext()) {
                ((InterfaceC88140YiW) c66683QFb.next()).LIZ();
            } else {
                return;
            }
        }
    }

    public final void LJ(long j, boolean z) {
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            N.Ms7JLaGI(it.next().longValue(), this, z, j);
        }
    }

    public final void LJII(boolean z, AbstractC88147Yid abstractC88147Yid) {
        int i;
        if (z) {
            if (this.LIZJ == null) {
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new C88141YiX(this), abstractC88147Yid);
                this.LIZJ = networkChangeNotifierAutoDetect;
                C88150Yig LIZLLL = networkChangeNotifierAutoDetect.LIZLLL();
                int LIZIZ = LIZLLL.LIZIZ();
                this.LIZLLL = LIZIZ;
                LIZJ(LIZIZ, getCurrentDefaultNetId());
                if (LIZLLL.LIZLLL) {
                    i = 2;
                } else {
                    i = 1;
                }
                this.LJ = i;
                LIZ(i);
                LIZIZ(LIZLLL.LIZ());
                return;
            }
            return;
        }
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect2 = this.LIZJ;
        if (networkChangeNotifierAutoDetect2 == null) {
            return;
        }
        networkChangeNotifierAutoDetect2.LJ.LIZ();
        networkChangeNotifierAutoDetect2.LJI();
        this.LIZJ = null;
    }

    public final void LIZLLL(int i, long j, boolean z) {
        Iterator<Long> it = this.LIZ.iterator();
        while (it.hasNext()) {
            N.MZ5e75rQ(it.next().longValue(), this, j, z, i);
        }
    }
}
