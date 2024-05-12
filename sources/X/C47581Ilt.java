package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimerTask;

/* renamed from: X.Ilt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47581Ilt {
    public InterfaceC47100Ie8 LJ;
    public PthreadTimer LJFF;
    public C47576Ilo LJI;
    public List<Integer> LIZ = Collections.emptyList();
    public List<Integer> LIZIZ = Collections.emptyList();
    public List<String> LIZJ = Collections.emptyList();
    public java.util.Map<Long, Float> LIZLLL = Collections.emptyMap();
    public volatile int LJII = 100;
    public volatile int LJIIIIZZ = 0;
    public volatile int LJIIIZ = 120000;

    public final synchronized void LIZJ() {
        if (this.LJIIIIZZ <= 0) {
            C78253UnR.LIZLLL("NetworkPortraitData", "invalid parameter");
            return;
        }
        List<Integer> list = this.LIZ;
        List<Integer> list2 = Collections.EMPTY_LIST;
        if (list == list2) {
            this.LIZ = new ArrayList();
        }
        if (this.LIZIZ == list2) {
            this.LIZIZ = new ArrayList();
        }
        if (this.LIZJ == list2) {
            this.LIZJ = new ArrayList();
        }
        if (this.LIZLLL == Collections.EMPTY_MAP) {
            this.LIZLLL = new LinkedHashMap();
        }
        C47576Ilo c47576Ilo = this.LJI;
        if (c47576Ilo != null) {
            c47576Ilo.cancel();
        }
        if (this.LJFF == null) {
            this.LJFF = new PthreadTimer("net-portrait-data");
        }
        C47576Ilo c47576Ilo2 = new C47576Ilo(this);
        this.LJI = c47576Ilo2;
        this.LJFF.schedule(c47576Ilo2, 500L, this.LJIIIIZZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("network timer task scheduled, interval ");
        LIZ.append(this.LJIIIIZZ);
        TTVideoEngineLog.d("NetworkPortraitData", X1D.LIZIZ(LIZ));
    }

    public final List LIZ(List list) {
        if (this.LJIIIIZZ == 0) {
            return new ArrayList();
        }
        int i = this.LJIIIZ / this.LJIIIIZZ;
        if (i <= 0) {
            return new ArrayList();
        }
        if (i > list.size()) {
            return new ArrayList(list);
        }
        return list.subList(list.size() - i, list.size());
    }

    public final synchronized void LIZIZ(TimerTask timerTask, int i) {
        if (this.LJFF == null) {
            this.LJFF = new PthreadTimer("net-portrait-data");
        }
        PthreadTimer pthreadTimer = this.LJFF;
        if (i <= 0) {
            i = this.LJIIIIZZ;
        }
        pthreadTimer.schedule(timerTask, 1000L, i);
        if (this.LJI == null) {
            C47576Ilo c47576Ilo = new C47576Ilo(this);
            this.LJI = c47576Ilo;
            this.LJFF.schedule(c47576Ilo, 1000L, this.LJIIIIZZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("network timer task scheduled, interval ");
        LIZ.append(this.LJIIIIZZ);
        TTVideoEngineLog.d("NetworkPortraitData", X1D.LIZIZ(LIZ));
    }
}
