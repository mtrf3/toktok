package X;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.callback.BDLocationCallback;
import com.bytedance.bdlocation.exception.BDLocationException;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.ZoM, reason: case insensitive filesystem */
/* loaded from: classes24.dex */
public final class C91050ZoM implements BDLocationCallback {
    public final /* synthetic */ BDLocation[] LIZ;
    public final /* synthetic */ CountDownLatch LIZIZ;
    public final /* synthetic */ BDLocationException[] LIZJ;

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onError(BDLocationException bDLocationException) {
        this.LIZJ[0] = bDLocationException;
        this.LIZIZ.countDown();
    }

    @Override // com.bytedance.bdlocation.callback.BDLocationCallback
    public final void onLocationChanged(BDLocation bDLocation) {
        this.LIZ[0] = bDLocation;
        this.LIZIZ.countDown();
    }

    public C91050ZoM(BDLocation[] bDLocationArr, CountDownLatch countDownLatch, BDLocationException[] bDLocationExceptionArr) {
        this.LIZ = bDLocationArr;
        this.LIZIZ = countDownLatch;
        this.LIZJ = bDLocationExceptionArr;
    }
}
