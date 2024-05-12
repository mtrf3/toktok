package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bkz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29689Bkz extends C05630Jz {
    public static HandlerThread LIZJ;
    public static Handler LIZLLL;
    public static LiveMode LJ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static int LJIILL;
    public static final C29689Bkz LIZ = new C29689Bkz();
    public static final ConcurrentHashMap<EnumC29690Bl0, C29688Bky> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LJFF = new ConcurrentHashMap<>();
    public static EnumC29690Bl0 LJI = EnumC29690Bl0.STATE_T0;
    public static List<String> LJII = C61878OQg.INSTANCE;
    public static long LJIIIIZZ = -1;
    public static String LJIILJJIL = "";

    public static boolean LJIIIZ() {
        return ORZ.LJLJJI(LJ, C47261Igj.LJJIJIIJI(LiveMode.SCREEN_RECORD, LiveMode.THIRD_PARTY, LiveMode.LIVE_STUDIO));
    }

    public final synchronized Handler LJIIIIZZ() {
        Handler handler;
        HandlerThread handlerThread = LIZJ;
        if (handlerThread == null) {
            handlerThread = new HandlerThread("WholeLinkTrackingMonitor");
            LIZJ = handlerThread;
            handlerThread.start();
        }
        handler = new Handler(handlerThread.getLooper());
        LIZLLL = handler;
        return handler;
    }

    public static C29688Bky LJIILIIL(EnumC29690Bl0 enumC29690Bl0) {
        ConcurrentHashMap<EnumC29690Bl0, C29688Bky> concurrentHashMap = LIZIZ;
        C29688Bky c29688Bky = concurrentHashMap.get(enumC29690Bl0);
        if (c29688Bky == null) {
            C29688Bky c29688Bky2 = new C29688Bky(enumC29690Bl0);
            concurrentHashMap.put(enumC29690Bl0, c29688Bky2);
            return c29688Bky2;
        }
        return c29688Bky;
    }

    public final void LJIIJ(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        Handler handler = LIZLLL;
        if (handler == null) {
            handler = LJIIIIZZ();
        }
        handler.post(new ARunnableS41S0100000_5(liveMode, 343));
    }

    public final void LJIIJJI(LiveMode mLiveMode) {
        o.LJIIIZ(mLiveMode, "mLiveMode");
        LJ = mLiveMode;
    }

    public final void LJIIL(InterfaceC88472Yns<? super C29688Bky, C76800UCe> track) {
        o.LJIIIZ(track, "track");
        if (!LJIIIZ()) {
            return;
        }
        Handler handler = LIZLLL;
        if (handler == null) {
            handler = LJIIIIZZ();
        }
        handler.post(new ARunnableS41S0100000_5(track, 344));
    }
}
