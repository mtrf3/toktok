package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.gift.TravelMaskFetchTimeoutSetting;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Ckv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC32233Ckv<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ImageModel LJLILLLLZI;

    public CallableC32233Ckv(String str, ImageModel imageModel) {
        this.LJLIL = str;
        this.LJLILLLLZI = imageModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C32235Ckx c32235Ckx = new C32235Ckx();
        c32235Ckx.LIZIZ = this.LJLIL;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int value = TravelMaskFetchTimeoutSetting.INSTANCE.getValue();
        if (value <= 0 || this.LJLILLLLZI != null) {
            Object LIZ = C32260ClM.LIZ(InterfaceC32230Cks.class);
            o.LJI(LIZ);
            ((InterfaceC32230Cks) LIZ).LIZ(this.LJLILLLLZI, new C32234Ckw(c32235Ckx, countDownLatch));
            if (value > 0) {
                countDownLatch.await(value, TimeUnit.SECONDS);
            } else {
                countDownLatch.await();
            }
        }
        return c32235Ckx;
    }
}
