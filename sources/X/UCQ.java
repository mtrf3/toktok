package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UCQ extends AbstractC76172Tuy {
    public static final UCQ LIZ = new UCQ();

    @Override // X.AbstractC76172Tuy
    public final int LIZJ() {
        return LiveExchangeConfirmThreshold.DEFAULT;
    }

    @Override // X.AbstractC76172Tuy
    public final int LIZLLL() {
        return 59999;
    }

    @Override // X.AbstractC76172Tuy
    public final void LJI(int i, String msg, Throwable th, java.util.Map map) {
        o.LJIIIZ(msg, "msg");
        C0K2.LIZIZ(new Throwable(th), AbstractC76172Tuy.LJ(i, msg, th), map);
    }
}
