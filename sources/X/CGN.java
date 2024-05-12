package X;

import android.os.SystemClock;
import android.util.ArrayMap;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CGN extends SimpleEventListener implements CGV, CGL {
    public final ArrayMap<Class<? extends IMessage>, java.util.Set<InterfaceC88472Yns<Float, C76800UCe>>> LIZ = new ArrayMap<>();
    public final java.util.Set<InterfaceC88472Yns<Float, C76800UCe>> LIZIZ = new LinkedHashSet();
    public final CGO LIZJ = new CGO(this);
    public final ArrayMap<Class<? extends IMessage>, CGO> LIZLLL = new ArrayMap<>();
    public boolean LJ;
    public volatile long LJFF;
    public volatile int LJI;

    @Override // X.CGL
    public final synchronized void LJFF() {
        if (this.LIZIZ.isEmpty() && this.LIZ.isEmpty()) {
            return;
        }
        float LIZ = this.LIZJ.LIZ(5);
        Iterator<InterfaceC88472Yns<Float, C76800UCe>> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().invoke(Float.valueOf(LIZ));
        }
        for (Map.Entry<Class<? extends IMessage>, java.util.Set<InterfaceC88472Yns<Float, C76800UCe>>> entry : this.LIZ.entrySet()) {
            CGO cgo = this.LIZLLL.get(entry.getKey());
            if (cgo != null) {
                float LIZ2 = cgo.LIZ(5);
                java.util.Set<InterfaceC88472Yns<Float, C76800UCe>> value = entry.getValue();
                o.LJIIIIZZ(value, "it.value");
                Iterator<T> it2 = value.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC88472Yns) it2.next()).invoke(Float.valueOf(LIZ2));
                }
            }
        }
    }

    @Override // X.CGL
    public final synchronized void destroy() {
        this.LJ = false;
        this.LIZIZ.clear();
        Iterator<Map.Entry<Class<? extends IMessage>, java.util.Set<InterfaceC88472Yns<Float, C76800UCe>>>> it = this.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Set<InterfaceC88472Yns<Float, C76800UCe>> value = it.next().getValue();
            if (value != null) {
                value.clear();
            }
        }
        this.LIZLLL.clear();
    }

    @Override // X.CGL
    public final void start() {
        this.LJ = true;
    }

    @Override // X.CGL
    public final void stop() {
        this.LJ = false;
    }

    public final float LIZJ() {
        return this.LIZJ.LIZ(5);
    }

    public final OSZ<Float, Float> LIZLLL() {
        if (this.LJFF == 0) {
            return new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        return new OSZ<>(Float.valueOf(this.LJI / ((float) ((SystemClock.elapsedRealtime() - this.LJFF) / 1000))), Float.valueOf(this.LIZJ.LIZLLL));
    }

    @Override // X.CGV
    public final OSZ<Float, Float> LIZ(int i) {
        return LIZIZ(i);
    }

    public final OSZ LIZIZ(int i) {
        CGO cgo = this.LIZJ;
        cgo.getClass();
        long elapsedRealtime = (SystemClock.elapsedRealtime() / 1000) - 1;
        if (60 < i) {
            i = 60;
        }
        int i2 = 0;
        float f = 0.0f;
        for (CGP cgp : cgo.LIZ) {
            if (cgp.LIZ >= elapsedRealtime - i && cgp.LIZ <= elapsedRealtime) {
                f += cgp.LIZIZ;
                if (cgp.LIZIZ > i2) {
                    i2 = cgp.LIZIZ;
                }
            }
        }
        return new OSZ(Float.valueOf(f / i), Float.valueOf(i2));
    }

    public final void LJ(CGD notifyFilter) {
        o.LJIIIZ(notifyFilter, "notifyFilter");
        LJI(null, notifyFilter);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final synchronized void onPreDispatchMessages(List<IMessage> list) {
        if (list == null) {
            return;
        }
        if (!this.LJ) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.LIZLLL.isEmpty()) {
            Iterator<IMessage> it = list.iterator();
            while (it.hasNext()) {
                CGO cgo = this.LIZLLL.get(it.next().getClass());
                if (cgo != null) {
                    cgo.LIZIZ(elapsedRealtime);
                }
            }
        }
        this.LIZJ.LIZJ(list.size(), elapsedRealtime);
        if (this.LJFF == 0) {
            this.LJFF = elapsedRealtime;
        }
        this.LJI += list.size();
    }

    public final synchronized <T extends IMessage> void LJI(Class<T> cls, InterfaceC88472Yns<? super Float, C76800UCe> notifyFilter) {
        o.LJIIIZ(notifyFilter, "notifyFilter");
        if (cls == null) {
            this.LIZIZ.add(notifyFilter);
        } else {
            java.util.Set<InterfaceC88472Yns<Float, C76800UCe>> set = this.LIZ.get(cls);
            if (set == null) {
                set = new LinkedHashSet<>();
            }
            set.add(notifyFilter);
            if (this.LIZ.get(cls) == null) {
                this.LIZ.put(cls, set);
                this.LIZLLL.put(cls, new CGO(this));
            }
        }
    }
}
