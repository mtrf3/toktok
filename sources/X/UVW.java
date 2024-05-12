package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSenderRefactorV1Setting;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS195S0100000_13;

/* loaded from: classes14.dex */
public final class UVW extends AbstractC32809CuD {
    public static final UVW LJI;

    static {
        UW1 uw1;
        UVW uvw = new UVW();
        LJI = uvw;
        LiveGiftSenderRefactorV1Setting liveGiftSenderRefactorV1Setting = LiveGiftSenderRefactorV1Setting.INSTANCE;
        if (liveGiftSenderRefactorV1Setting.enable()) {
            if (liveGiftSenderRefactorV1Setting.executorCount() == 1) {
                uw1 = new C78541Us5();
            } else {
                uw1 = new C78540Us4();
            }
        } else {
            uw1 = null;
        }
        int executorCount = liveGiftSenderRefactorV1Setting.executorCount();
        C0NB.LJIIIZ(uvw.LIZ, "init");
        uvw.LIZIZ = new UVV(new AqS179S0100000_13(uvw, 423), new AqS195S0100000_13(uvw, 55));
        uvw.LIZJ = new C77311UVv(uw1, null, new AqS179S0100000_13(uvw, 424), new AqS179S0100000_13(uvw, 425));
        uvw.LIZLLL = new C77291UVb(executorCount, new AqS163S0100000_13(uvw, 373), new AqS195S0100000_13(uvw, 56), new AqS195S0100000_13(uvw, 57));
        uvw.LJ = new UVR(new AqS195S0100000_13(uvw, 58), new AqS195S0100000_13(uvw, 59));
        uvw.LJFF = new UVO(0);
    }
}
