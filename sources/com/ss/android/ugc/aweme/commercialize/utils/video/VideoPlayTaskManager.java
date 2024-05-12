package com.ss.android.ugc.aweme.commercialize.utils.video;

import X.C47135Ieh;
import X.C59324NQa;
import X.HandlerC59321NPx;
import X.IG7;
import X.InterfaceC59389NSn;
import X.NSX;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class VideoPlayTaskManager implements IVideoPlayTaskManager {
    public final ConcurrentHashMap<String, C59324NQa> LIZ;
    public final Collection<C59324NQa> LIZIZ;
    public int LIZJ;
    public final HandlerC59321NPx LIZLLL;
    public InterfaceC59389NSn LJ;
    public int LJFF;
    public long LJI;
    public long LJII;

    public final long LIZ() {
        return this.LJ.getCurrentPosition();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJJJ() {
        this.LIZJ++;
        if (this.LIZIZ.isEmpty()) {
            HandlerC59321NPx handlerC59321NPx = this.LIZLLL;
            if (handlerC59321NPx.hasMessages(1)) {
                handlerC59321NPx.removeMessages(1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLIIL() {
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LIZ, "taskMap.values");
        while (LIZLLL.hasNext()) {
            C59324NQa c59324NQa = (C59324NQa) LIZLLL.next();
            if (c59324NQa.LIZIZ) {
                c59324NQa.LJ = 0;
            }
        }
        this.LIZJ = 0;
        this.LJFF = 0;
        this.LJI = 0L;
        if (!this.LIZIZ.isEmpty()) {
            HandlerC59321NPx handlerC59321NPx = this.LIZLLL;
            if (!handlerC59321NPx.hasMessages(1)) {
                handlerC59321NPx.sendEmptyMessage(1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final int LJLJJL() {
        return this.LIZ.size();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLJJLL() {
        HandlerC59321NPx handlerC59321NPx = this.LIZLLL;
        if (!handlerC59321NPx.hasMessages(1)) {
            handlerC59321NPx.sendEmptyMessage(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLJL() {
        HandlerC59321NPx handlerC59321NPx = this.LIZLLL;
        if (handlerC59321NPx.hasMessages(1)) {
            handlerC59321NPx.removeMessages(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void reset() {
        long j;
        this.LIZ.clear();
        HandlerC59321NPx handlerC59321NPx = this.LIZLLL;
        if (handlerC59321NPx.hasMessages(1)) {
            handlerC59321NPx.removeMessages(1);
        }
        HandlerC59321NPx handlerC59321NPx2 = this.LIZLLL;
        if (NSX.LIZ() > 0) {
            j = NSX.LIZ();
        } else {
            j = 1000;
        }
        handlerC59321NPx2.LIZIZ = j;
        this.LJII = -1L;
    }

    public VideoPlayTaskManager() {
        new ArrayList();
        ConcurrentHashMap<String, C59324NQa> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = concurrentHashMap;
        Collection<C59324NQa> values = concurrentHashMap.values();
        o.LJIIIIZZ(values, "taskMap.values");
        this.LIZIZ = values;
        this.LIZLLL = new HandlerC59321NPx(this);
        this.LJ = IG7.LIZ;
        this.LJII = -1L;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLIL(InterfaceC59389NSn playTaskHelper) {
        o.LJIIIZ(playTaskHelper, "playTaskHelper");
        this.LJ = playTaskHelper;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLILLLLZI(int i) {
        this.LIZJ = i;
        this.LJFF = i;
        for (C59324NQa c59324NQa : this.LIZIZ) {
            if (c59324NQa.LIZIZ) {
                c59324NQa.LJ = i;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLJI(String str) {
        if (this.LIZ.containsKey(str)) {
            this.LIZ.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLJJI(long j) {
        if (NSX.LIZ() <= 0) {
            this.LIZLLL.LIZIZ = j;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager
    public final void LJLJLJ(C59324NQa c59324NQa) {
        if (this.LIZIZ.isEmpty()) {
            HandlerC59321NPx handlerC59321NPx = this.LIZLLL;
            if (!handlerC59321NPx.hasMessages(1)) {
                handlerC59321NPx.sendEmptyMessage(1);
            }
        }
        String str = c59324NQa.LIZLLL;
        if (this.LIZ.containsKey(str)) {
            return;
        }
        this.LIZ.put(str, c59324NQa);
    }
}
