package Y;

import X.C91041ZoD;
import X.C91044ZoG;
import X.C91048ZoK;
import X.C91049ZoL;
import X.C91055ZoR;
import X.X1D;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.api.ILocate;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.LocationOption;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.service.BDLocationExtrasService;
import com.bytedance.bdlocation.thread.AppExecutors;

/* loaded from: classes24.dex */
public class IDRunnableS3S0300000_28 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        Logger.d("NetworkStatusCollectManagers wifi notifyWifiChanged");
        C91048ZoK c91048ZoK = (C91048ZoK) this.l2;
        Network network = (Network) this.l0;
        NetworkCapabilities networkCapabilities = (NetworkCapabilities) this.l1;
        if (c91048ZoK.LJFF == null || network == null || networkCapabilities == null) {
            return;
        }
        if (networkCapabilities.hasTransport(1)) {
            i = 102;
        } else if (networkCapabilities.hasTransport(0)) {
            i = 101;
        } else if (networkCapabilities.hasTransport(2)) {
            i = 103;
        } else if (networkCapabilities.hasTransport(3)) {
            i = 104;
        } else if (networkCapabilities.hasTransport(4)) {
            i = 105;
        } else if (networkCapabilities.hasTransport(5)) {
            i = 106;
        } else if (networkCapabilities.hasTransport(6)) {
            i = 107;
        } else {
            i = 100;
        }
        c91048ZoK.LIZLLL(i, true);
    }

    public final void LIZ$1() {
        LocationOption locationOption;
        ILocate locate;
        synchronized (C91041ZoD.LJIIIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startLocation is DownGradeLocation:");
            LIZ.append(((LocationOption) this.l0).isDownGradeLocation());
            Logger.i(X1D.LIZIZ(LIZ));
            if (((LocationOption) this.l0).isDownGradeLocation()) {
                locationOption = new LocationOption((LocationOption) this.l0);
            } else {
                locationOption = new LocationOption(((C91041ZoD) this.l2).LIZJ((BDLocationCallback) this.l1, (LocationOption) this.l0));
            }
            if (!BDLocationConfig.isOverSeas()) {
                locationOption.setUploadInterval(C91049ZoL.LIZ().LIZIZ() / 1000);
                locationOption.setNetworkStatusList(C91048ZoK.LIZIZ().LIZ);
            }
            BDLocation LJIIJ = ((C91041ZoD) this.l2).LJIIJ(locationOption);
            C91041ZoD c91041ZoD = (C91041ZoD) this.l2;
            c91041ZoD.getClass();
            boolean z = true;
            if (LJIIJ == null && !locationOption.isDownGradeLocation() && locationOption.isOnceLocation() && c91041ZoD.LJIIIIZZ.LIZLLL(locationOption)) {
                ((C91041ZoD) this.l2).LJIIIIZZ.LIZ((BDLocationCallback) this.l1);
                if (!((C91041ZoD) this.l2).LJIIIIZZ.LIZJ()) {
                    ((C91041ZoD) this.l2).LJIIIIZZ.onLocateStart("");
                    ((C91041ZoD) this.l2).LJIIIIZZ.LIZIZ = locationOption;
                } else {
                    return;
                }
            }
            BDLocationCallback bDLocationCallback = (BDLocationCallback) this.l1;
            C91041ZoD c91041ZoD2 = (C91041ZoD) this.l2;
            C91055ZoR c91055ZoR = new C91055ZoR(bDLocationCallback, locationOption, c91041ZoD2.LJIIIIZZ, c91041ZoD2.LIZLLL);
            ((C91041ZoD) this.l2).getClass();
            if (!C91041ZoD.LIZ(c91055ZoR)) {
                Logger.i("RestrictedMode|background|LocationServer|permission unable");
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("BDLocationUPTest getSuitableCache locationcache:");
            if (LJIIJ == null) {
                z = false;
            }
            LIZ2.append(z);
            Logger.d(X1D.LIZIZ(LIZ2));
            if (LJIIJ == null) {
                int locateType = locationOption.getLocateType();
                if (locateType == -1) {
                    locateType = BDLocationConfig.getLocateType();
                }
                C91041ZoD c91041ZoD3 = (C91041ZoD) this.l2;
                C91044ZoG c91044ZoG = c91041ZoD3.LIZIZ;
                c91044ZoG.getClass();
                if (BDLocationConfig.isMockEnable()) {
                    locate = BDLocationExtrasService.getLocate(BDLocationConfig.getContext(), 4);
                } else if (BDLocationConfig.isOverSeas()) {
                    locate = BDLocationExtrasService.getLocate(BDLocationConfig.getContext(), 0);
                } else if (locateType != 3 || (locate = c91044ZoG.LIZ) == null) {
                    locate = BDLocationExtrasService.getLocate(BDLocationConfig.getContext(), locateType);
                }
                c91041ZoD3.LJFF = locate;
                C91041ZoD c91041ZoD4 = (C91041ZoD) this.l2;
                ILocate iLocate = c91041ZoD4.LJFF;
                if (iLocate != null) {
                    iLocate.startLocation(c91055ZoR, locationOption, c91041ZoD4.LJ);
                } else {
                    BDLocationException bDLocationException = new BDLocationException("unable to locate kernel exception", BDLocationConfig.getSdkVersion(), "60");
                    ((C91041ZoD) this.l2).getClass();
                    C91041ZoD.LJIIJJI(c91055ZoR, bDLocationException);
                }
            } else {
                ((C91041ZoD) this.l2).getClass();
                AppExecutors.getInstance().mainThread().execute(new IDRunnableS31S0200000_28(c91055ZoR, LJIIJ, 2));
            }
            Logger.d("startLocation :");
        }
    }

    public static final void run$0(IDRunnableS3S0300000_28 iDRunnableS3S0300000_28) {
        boolean LIZ;
        try {
            iDRunnableS3S0300000_28.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS3S0300000_28 iDRunnableS3S0300000_28) {
        boolean LIZ;
        try {
            iDRunnableS3S0300000_28.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS3S0300000_28(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
    }
}
