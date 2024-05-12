package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ZoH, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class RunnableC91045ZoH implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ BDLocation LJLILLLLZI;
    public final /* synthetic */ C91055ZoR LJLJI;

    public final void LIZ() {
        List<BDLocationCallback> list;
        if (this.LJLJI.LIZJ.isOnceLocation() && !this.LJLIL) {
            C91055ZoR c91055ZoR = this.LJLJI;
            if (c91055ZoR.LIZIZ.LIZLLL(c91055ZoR.LIZJ)) {
                Logger.i("LocationCallbackServer callbackLocationInfo mergeLocation");
                this.LJLJI.LIZIZ.onLocateStop("");
                C91051ZoN c91051ZoN = this.LJLJI.LIZIZ;
                synchronized (c91051ZoN) {
                    list = c91051ZoN.LIZJ;
                }
                if (list != null) {
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.size() > 0) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            BDLocationCallback bDLocationCallback = (BDLocationCallback) ListProtector.get(list, i);
                            if (bDLocationCallback != null) {
                                bDLocationCallback.onLocationChanged(this.LJLILLLLZI);
                            }
                        }
                        this.LJLJI.LIZIZ.LIZIZ();
                        this.LJLJI.LJI(this.LJLILLLLZI);
                        return;
                    }
                }
                this.LJLJI.LIZ.onLocationChanged(this.LJLILLLLZI);
                this.LJLJI.LJI(this.LJLILLLLZI);
                return;
            }
        }
        this.LJLJI.LIZ.onLocationChanged(this.LJLILLLLZI);
        this.LJLJI.LJI(this.LJLILLLLZI);
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

    public RunnableC91045ZoH(C91055ZoR c91055ZoR, boolean z, BDLocation bDLocation) {
        this.LJLJI = c91055ZoR;
        this.LJLIL = z;
        this.LJLILLLLZI = bDLocation;
    }
}
