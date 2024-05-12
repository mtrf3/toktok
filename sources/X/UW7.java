package X;

import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.os.Handler;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftListOptSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes14.dex */
public final class UW7 {
    public final ConcurrentHashMap<Long, ArrayList<InterfaceC92693kP>> LIZ = new ConcurrentHashMap<>();
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(UW9.LJLIL);

    public final void LIZ(int i, long j, AbstractC32474Coo abstractC32474Coo, String str, boolean z) {
        String str2 = str;
        if (C15380j0.LIZLLL() == null) {
            return;
        }
        if (LiveGiftListOptSetting.INSTANCE.getValue()) {
            long nanoTime = System.nanoTime();
            if (abstractC32474Coo != null) {
                abstractC32474Coo.LIZLLL();
            }
            UWA uwa = UWA.LIZ;
            UWM uwm = UWA.LIZIZ;
            if (uwm != null) {
                uwm.LIZIZ = new C77286UUw();
            } else {
                synchronized (uwa) {
                    uwm = UWA.LIZIZ;
                    if (uwm == null) {
                        Context LIZLLL = C15380j0.LIZLLL();
                        o.LJIIIIZZ(LIZLLL, "getContext()");
                        UWR uwr = new UWR(new UWO(LIZLLL));
                        C77286UUw c77286UUw = new C77286UUw();
                        try {
                            ((IGiftService) CN1.LIZ(IGiftService.class)).initGiftResourceManager(C15380j0.LIZLLL());
                        } catch (Exception e) {
                            C78983UzD.LJIIZILJ(e);
                        }
                        uwm = new UWM(uwr, c77286UUw, C32312CmC.LIZ());
                        UWA.LIZIZ = uwm;
                    }
                }
            }
            UWU uwu = new UWU(i, j, nanoTime, abstractC32474Coo, z);
            UWC uwc = new UWC(i, j, nanoTime, abstractC32474Coo, z);
            C0NB.LJIIIZ("GiftListManager", "startFetchData: start");
            XKQ xkq = uwm.LIZLLL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            uwm.LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ.plus(new UW8(CoroutineExceptionHandler.LJJJJIZL, uwm, i, uwc)), null, new UWL(uwm, j, i, uwu, null), 2);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (abstractC32474Coo != null) {
            abstractC32474Coo.LIZLLL();
        }
        C0NB.LIZIZ("wangyi", C00F.LIZJ("syncGiftList source=", i, "  roomid=", j));
        C15380j0.LIZLLL();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                WeakReference weakReference = new WeakReference(abstractC32474Coo);
                long nanoTime2 = System.nanoTime();
                C65814PsI.LIZ().getClass();
                ((GiftRetrofitApi) C65814PsI.LIZIZ(GiftRetrofitApi.class)).syncGiftList(String.valueOf(j), i, str2, C31846Ceg.LIZIZ(), System.currentTimeMillis()).LJJIII(new C77282UUs(this, i), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new C32469Coj(this, j, nanoTime2, z, i, abstractC32474Coo, weakReference));
                return;
            }
        } catch (Exception unused) {
        }
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS49S0100000_13(abstractC32474Coo, UserLevelGeckoUpdateSetting.DEFAULT), 250L);
    }
}
