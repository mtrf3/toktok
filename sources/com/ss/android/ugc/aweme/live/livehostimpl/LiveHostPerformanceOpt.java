package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C16880lQ;
import X.C16950lX;
import X.C35810E3q;
import X.C38619FDr;
import X.C39050FUg;
import X.C77121UOn;
import X.PD2;
import X.PD6;
import X.PE3;
import X.PS4;
import X.PS9;
import X.PSA;
import X.PSD;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveApmInhibitionSettings;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.ss.android.ugc.aweme.commercialize.live.promote.service.PromoteUtilImpl;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LiveHostPerformanceOpt implements IHostPerformanceOpt {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void zk0() {
        C35810E3q.LJFF(1500L);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void Gl0() {
        PromoteUtilImpl.LJIIIZ().LJ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void yF() {
        ((ConcurrentHashMap) C77121UOn.LIZIZ().LIZ).clear();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void k4(long j) {
        C35810E3q.LJIIJJI(j);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void lr0(boolean z) {
        PSA.LIZ = z;
        LiveApmInhibitionSettings liveApmInhibitionSettings = LiveApmInhibitionSettings.INSTANCE;
        if (liveApmInhibitionSettings.isThreadPriorityEnable() || liveApmInhibitionSettings.isInhibitionEnabled()) {
            PE3 pe3 = PD2.LIZ;
            try {
                Field[] fields = pe3.getClass().getDeclaredFields();
                o.LJIIIIZZ(fields, "fields");
                for (Field field : fields) {
                    boolean isAccessible = field.isAccessible();
                    if (!isAccessible) {
                        field.setAccessible(true);
                    }
                    try {
                        Object obj = field.get(pe3);
                        if (pe3.LIZIZ == null) {
                            synchronized (PE3.LJFF) {
                                if (pe3.LIZIZ == null) {
                                    pe3.LJFF();
                                }
                            }
                        }
                        C39050FUg pool = pe3.LIZIZ;
                        if (o.LJ(obj, pool)) {
                            o.LJIIIIZZ(pool, "pool");
                            PSA.LIZ(pe3, z, pool, field);
                        }
                        C39050FUg pool2 = pe3.LIZLLL();
                        if (o.LJ(obj, pool2)) {
                            o.LJIIIIZZ(pool2, "pool");
                            PSA.LIZ(pe3, z, pool2, field);
                        }
                        C39050FUg pool3 = pe3.LIZJ();
                        if (o.LJ(obj, pool3)) {
                            o.LJIIIIZZ(pool3, "pool");
                            PSA.LIZ(pe3, z, pool3, field);
                        }
                        if (!isAccessible) {
                            field.setAccessible(isAccessible);
                        }
                    } catch (Throwable th) {
                        if (!isAccessible) {
                            field.setAccessible(isAccessible);
                        }
                        throw th;
                    }
                }
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (IllegalArgumentException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            PS9.LIZ = z;
            PS9.LIZ(z, PD6.CPU);
            PS9.LIZ(z, PD6.IO);
            PS9.LIZ(z, PD6.TIME_SENSITIVE);
            PS9.LIZ(z, PD6.LIGHT_WEIGHT);
        }
        if (z) {
            LiveApmInhibitionSettings liveApmInhibitionSettings2 = LiveApmInhibitionSettings.INSTANCE;
            if (liveApmInhibitionSettings2.isInhibitionEnabled()) {
                PS4.LIZ = liveApmInhibitionSettings2.getSleepTime();
                PS4.LIZIZ = liveApmInhibitionSettings2.getBlockDuration();
                PS4.LIZJ = liveApmInhibitionSettings2.getNonBlockDuration();
                if (PS4.LJ != null || PS4.LIZIZ <= 0) {
                    return;
                }
                PSD psd = new PSD();
                PS4.LJ = psd;
                psd.start();
                PSD psd2 = PS4.LJ;
                if (psd2 == null) {
                    return;
                }
                PS4.LJFF = new Handler(psd2.getLooper());
                PS4.LIZ();
                return;
            }
            return;
        }
        PS4.LIZLLL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final void mM(int i, Context context) {
        C38619FDr.LIZLLL(i, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final View SO(int i, Context context, ViewGroup viewGroup, boolean z) {
        o.LJIIIZ(context, "context");
        return C38619FDr.LIZIZ(i, context, viewGroup, z);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceOpt
    public final View ib0(int i, Context context, ViewGroup viewGroup, boolean z) {
        if (viewGroup != null) {
            return C16950lX.LIZIZ(context, i, viewGroup, z, -1, true);
        }
        return C16950lX.LIZIZ(context, i, new FrameLayout(context), false, -1, true);
    }
}
