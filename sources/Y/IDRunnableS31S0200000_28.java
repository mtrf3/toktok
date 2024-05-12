package Y;

import X.C91048ZoK;
import X.C91051ZoN;
import X.C91055ZoR;
import android.net.NetworkInfo;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.callback.LocationNotification;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes24.dex */
public class IDRunnableS31S0200000_28 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        List<BDLocationCallback> list;
        if (((C91055ZoR) this.l1).LIZJ.isOnceLocation()) {
            C91055ZoR c91055ZoR = (C91055ZoR) this.l1;
            if (c91055ZoR.LIZIZ.LIZLLL(c91055ZoR.LIZJ)) {
                Logger.i("LocationCallbackServer mergeLocation onError");
                ((C91055ZoR) this.l1).LIZIZ.onLocateStop("");
                C91051ZoN c91051ZoN = ((C91055ZoR) this.l1).LIZIZ;
                synchronized (c91051ZoN) {
                    list = c91051ZoN.LIZJ;
                }
                if (list != null) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.size() > 0) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            BDLocationCallback bDLocationCallback = (BDLocationCallback) ListProtector.get(list, i);
                            if (bDLocationCallback != null) {
                                bDLocationCallback.onError((BDLocationException) this.l0);
                            }
                        }
                        ((C91055ZoR) this.l1).LIZIZ.LIZIZ();
                        ((C91055ZoR) this.l1).LJFF((BDLocationException) this.l0);
                        return;
                    }
                }
                ((C91055ZoR) this.l1).LIZ.onError((BDLocationException) this.l0);
                ((C91055ZoR) this.l1).LJFF((BDLocationException) this.l0);
                return;
            }
        }
        ((C91055ZoR) this.l1).LIZ.onError((BDLocationException) this.l0);
        ((C91055ZoR) this.l1).LJFF((BDLocationException) this.l0);
    }

    public static final void run$0(IDRunnableS31S0200000_28 iDRunnableS31S0200000_28) {
        boolean LIZ;
        try {
            C91048ZoK c91048ZoK = (C91048ZoK) iDRunnableS31S0200000_28.l1;
            NetworkInfo networkInfo = (NetworkInfo) iDRunnableS31S0200000_28.l0;
            c91048ZoK.getClass();
            ((C91048ZoK) iDRunnableS31S0200000_28.l1).LIZLLL(C91048ZoK.LIZJ(networkInfo), true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS31S0200000_28 iDRunnableS31S0200000_28) {
        boolean LIZ;
        try {
            ((BDLocationCallback) iDRunnableS31S0200000_28.l0).onError((BDLocationException) iDRunnableS31S0200000_28.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS31S0200000_28 iDRunnableS31S0200000_28) {
        boolean LIZ;
        try {
            ((BDLocationCallback) iDRunnableS31S0200000_28.l0).onLocationChanged((BDLocation) iDRunnableS31S0200000_28.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS31S0200000_28 iDRunnableS31S0200000_28) {
        boolean LIZ;
        try {
            BDLocationConfig.addNotification((LocationNotification) iDRunnableS31S0200000_28.l0, iDRunnableS31S0200000_28.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS31S0200000_28 iDRunnableS31S0200000_28) {
        boolean LIZ;
        try {
            iDRunnableS31S0200000_28.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS31S0200000_28(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
