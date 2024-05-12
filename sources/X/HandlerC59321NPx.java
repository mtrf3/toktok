package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NPx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class HandlerC59321NPx extends Handler {
    public final VideoPlayTaskManager LIZ;
    public long LIZIZ;

    public HandlerC59321NPx(VideoPlayTaskManager playTaskManager) {
        long j;
        o.LJIIIZ(playTaskManager, "playTaskManager");
        this.LIZ = playTaskManager;
        if (NSX.LIZ() > 0) {
            j = NSX.LIZ();
        } else {
            j = 1000;
        }
        this.LIZIZ = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            VideoPlayTaskManager videoPlayTaskManager = this.LIZ;
            long LIZ = videoPlayTaskManager.LIZ();
            if (!videoPlayTaskManager.LIZIZ.isEmpty()) {
                if (C46377IIb.LIZ) {
                    int i = videoPlayTaskManager.LIZJ;
                    if (i != videoPlayTaskManager.LJFF + 1 || LIZ < videoPlayTaskManager.LJI) {
                        videoPlayTaskManager.LJFF = i;
                        videoPlayTaskManager.LJI = LIZ;
                    }
                }
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                new ArrayList();
                for (C59324NQa c59324NQa : videoPlayTaskManager.LIZIZ) {
                    if (c59324NQa.LIZJ) {
                        if (videoPlayTaskManager.LIZJ == c59324NQa.LJ) {
                            long j = c59324NQa.LJFF;
                            if (LIZ >= j) {
                                long j2 = videoPlayTaskManager.LJII;
                                if (j2 < j && j2 >= j - videoPlayTaskManager.LIZLLL.LIZIZ) {
                                    try {
                                        Runnable runnable = c59324NQa.LIZ;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                        if (!c59324NQa.LIZIZ) {
                                            c59324NQa.LIZ = null;
                                        }
                                    } catch (Exception e) {
                                        C78983UzD.LJIIZILJ(e);
                                    }
                                    if (c59324NQa.LIZIZ) {
                                        c59324NQa.LJ++;
                                    } else {
                                        concurrentHashMap.put(c59324NQa.LIZLLL, c59324NQa);
                                    }
                                }
                            }
                        }
                    } else {
                        int i2 = videoPlayTaskManager.LIZJ;
                        int i3 = c59324NQa.LJ;
                        if ((i2 == i3 && LIZ >= c59324NQa.LJFF) || i2 > i3) {
                            try {
                                Runnable runnable2 = c59324NQa.LIZ;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                                if (!c59324NQa.LIZIZ) {
                                    c59324NQa.LIZ = null;
                                }
                            } catch (Exception e2) {
                                C78983UzD.LJIIZILJ(e2);
                            }
                            if (c59324NQa.LIZIZ) {
                                c59324NQa.LJ++;
                            } else {
                                concurrentHashMap.put(c59324NQa.LIZLLL, c59324NQa);
                            }
                        }
                    }
                }
                videoPlayTaskManager.LJII = LIZ;
                for (Object obj : concurrentHashMap.keySet()) {
                    if (!videoPlayTaskManager.LIZ.isEmpty()) {
                        videoPlayTaskManager.LIZ.remove(obj);
                    }
                }
            }
            sendEmptyMessageDelayed(1, this.LIZIZ);
        }
    }
}
