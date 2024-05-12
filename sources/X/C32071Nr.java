package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.1Nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32071Nr implements InterfaceC30594Bza {
    public static C08890Wn LIZIZ;
    public static C08890Wn LIZJ;
    public static Handler LIZLLL;
    public static HandlerThread LJ;
    public static RunnableScheduledFuture<?> LJI;
    public static Long LJII;
    public static final C32071Nr LIZ = new C32071Nr();
    public static final RunnableC08900Wo LJFF = new RunnableC08900Wo();

    @Override // X.InterfaceC30594Bza
    public final void LIZLLL(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "liveEffect");
    }

    @Override // X.InterfaceC30594Bza
    public final void LIZIZ() {
        long j;
        C08890Wn c08890Wn = LIZIZ;
        if (c08890Wn != null && !o.LJ(c08890Wn, LIZJ)) {
            C32101Nu.LIZLLL(LIZIZ, true);
            long LIZ2 = C30725C4b.LIZ();
            BZI LIZ3 = C28787BRn.LIZ("livesdk_live_background_use_time");
            LJII(LIZ3, LIZIZ);
            C08890Wn c08890Wn2 = LIZIZ;
            if (c08890Wn2 != null) {
                j = c08890Wn2.LJI;
            } else {
                j = LIZ2;
            }
            LIZ3.LJIJJ(Long.valueOf((LIZ2 - j) / 1000), "use_time");
            LIZ3.LJJIIJZLJL();
        }
        C32101Nu.LJIIL(8L);
        C32101Nu.LIZ(8L);
        LIZIZ = LIZJ;
        LIZJ = null;
    }

    @Override // X.InterfaceC30594Bza
    public final void release() {
        if (!HandlerThreadOptSetting.INSTANCE.enable()) {
            HandlerThread handlerThread = LJ;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            LJ = null;
            LIZLLL = null;
        }
        LJII = null;
    }

    public static C08890Wn LJIIIIZZ(LiveEffect liveEffect) {
        Integer num;
        long j;
        long j2 = liveEffect.effectId;
        String resourceId = liveEffect.getResourceId();
        String name = liveEffect.getName();
        String broadcastScene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
        Integer num2 = liveEffect.parentImpressionPos;
        if (num2 != null) {
            num = C77339UWx.LIZIZ(num2, 1);
        } else {
            num = null;
        }
        String valueOf = String.valueOf(num);
        if (liveEffect.isGreenScreen) {
            j = 1;
        } else {
            j = 0;
        }
        return new C08890Wn(j2, resourceId, name, broadcastScene, valueOf, j);
    }

    @Override // X.InterfaceC30594Bza
    public final void LIZJ(LiveEffect liveEffect) {
        if (LIZIZ == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_background_close");
        LJII(LIZ2, LIZIZ);
        LIZ2.LJJIIJZLJL();
    }

    @Override // X.InterfaceC30594Bza
    public final void LJ(LiveEffect liveEffect) {
        C08890Wn c08890Wn;
        Long l = null;
        if (liveEffect != null) {
            c08890Wn = LJIIIIZZ(liveEffect);
        } else {
            c08890Wn = null;
        }
        LIZJ = c08890Wn;
        if (c08890Wn != null) {
            l = Long.valueOf(c08890Wn.LJI);
        }
        LJII = l;
        C08890Wn c08890Wn2 = LIZJ;
        if (c08890Wn2 == null || o.LJ(LIZIZ, c08890Wn2)) {
            return;
        }
        C32101Nu.LIZLLL(LIZJ, false);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_background_select");
        LJII(LIZ2, LIZJ);
        LIZ2.LJJIIJZLJL();
    }

    @Override // X.InterfaceC30594Bza
    public final void LJFF(int i) {
        UFE.LIZIZ(i, C28787BRn.LIZ("livesdk_live_background_panel_duration"), "use_time");
    }

    @Override // X.InterfaceC30594Bza
    public final void LJI(LiveEffect liveEffect) {
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor;
        C08890Wn c08890Wn = null;
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            RunnableScheduledFuture<?> runnableScheduledFuture = LJI;
            if (runnableScheduledFuture != null && (pThreadScheduledThreadPoolExecutor = C39202Fa2.LJFF) != null) {
                pThreadScheduledThreadPoolExecutor.remove(runnableScheduledFuture);
            }
            RunnableC08900Wo runnableC08900Wo = LJFF;
            if (liveEffect != null) {
                c08890Wn = LJIIIIZZ(liveEffect);
            }
            runnableC08900Wo.LJLIL = c08890Wn;
            if (liveEffect != null) {
                TimeUnit unit = TimeUnit.MILLISECONDS;
                o.LJIIIZ(unit, "unit");
                ScheduledFuture<?> schedule = C39202Fa2.LIZJ().schedule(runnableC08900Wo, 30000L, unit);
                o.LJII(schedule, "null cannot be cast to non-null type java.util.concurrent.RunnableScheduledFuture<*>");
                LJI = (RunnableScheduledFuture) schedule;
                return;
            }
            return;
        }
        Handler handler = LIZLLL;
        if (handler == null) {
            synchronized (this) {
                HandlerThread handlerThread = LJ;
                if (handlerThread == null) {
                    handlerThread = new HandlerThread("bg-effect-log-thread");
                    LJ = handlerThread;
                    handlerThread.start();
                }
                handler = new Handler(handlerThread.getLooper());
                LIZLLL = handler;
            }
        }
        RunnableC08900Wo runnableC08900Wo2 = LJFF;
        handler.removeCallbacks(runnableC08900Wo2);
        if (liveEffect != null) {
            c08890Wn = LJIIIIZZ(liveEffect);
        }
        runnableC08900Wo2.LJLIL = c08890Wn;
        if (liveEffect == null) {
            return;
        }
        handler.postDelayed(runnableC08900Wo2, 30000L);
    }

    public static void LJII(BZI bzi, C08890Wn c08890Wn) {
        String str;
        String str2;
        Long l;
        String str3 = null;
        if (c08890Wn != null) {
            str = c08890Wn.LJ;
        } else {
            str = null;
        }
        bzi.LJIJJ(str, "impr_position");
        if (c08890Wn != null) {
            str2 = c08890Wn.LIZIZ;
        } else {
            str2 = null;
        }
        bzi.LJIJJ(str2, "resource_id");
        if (c08890Wn != null) {
            l = Long.valueOf(c08890Wn.LIZ);
        } else {
            l = null;
        }
        bzi.LJIJJ(l, "sticker_id");
        if (c08890Wn != null) {
            str3 = c08890Wn.LIZJ;
        }
        bzi.LJIJJ(str3, "sticker_name");
    }

    @Override // X.InterfaceC30594Bza
    public final void LIZ(TreeMap<Integer, C75295Tgp> visibleItems, List<? extends LiveEffect> stickerList) {
        long j;
        String str;
        o.LJIIIZ(visibleItems, "visibleItems");
        o.LJIIIZ(stickerList, "stickerList");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<Integer, C75295Tgp> entry : visibleItems.entrySet()) {
            arrayList.add(Integer.valueOf(entry.getValue().LIZ + 1));
            LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLLLL(entry.getValue().LIZ, stickerList);
            if (liveEffect != null) {
                j = liveEffect.effectId;
            } else {
                j = 0;
            }
            arrayList2.add(Long.valueOf(j));
            LiveEffect liveEffect2 = (LiveEffect) ORZ.LJLLLLLL(entry.getValue().LIZ, stickerList);
            if (liveEffect2 == null || (str = liveEffect2.getResourceId()) == null) {
                str = "";
            }
            arrayList3.add(str);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_background_show");
        LIZ2.LJIJJ(arrayList.toString(), "sticker_position");
        LIZ2.LJIJJ(arrayList2.toString(), "sticker_id_set");
        LIZ2.LJIJJ(arrayList3.toString(), "resource_id_set");
        LIZ2.LJJIIJZLJL();
    }
}
