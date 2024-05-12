package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.FWm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39108FWm implements InterfaceC39773FjF {
    public long LIZ;
    public long LIZIZ;

    @Override // X.InterfaceC39773FjF
    public final void LIZ() {
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.LIZIZ;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LIZ;
        String scene = C56672Kh.LIZ().LJJIJIIJI.getValue();
        if (!o.LJ(C39110FWo.LJI, scene)) {
            C39110FWo.LIZIZ = 0L;
            C39110FWo.LIZJ = 0L;
        }
        C39110FWo.LJI = scene;
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        o.LJIIIZ(scene, "scene");
        if (LIZ.LJJIJIIJIL.contains(scene)) {
            long j = C39110FWo.LIZIZ + currentThreadTimeMillis;
            C39110FWo.LIZIZ = j;
            C39110FWo.LIZJ += uptimeMillis;
            C39110FWo.LJ.put(C39110FWo.LJI, Long.valueOf(j));
            C39110FWo.LJFF.put(C39110FWo.LJI, Long.valueOf(C39110FWo.LIZJ));
        }
    }

    @Override // X.InterfaceC39773FjF
    public final void LIZIZ() {
        this.LIZ = SystemClock.uptimeMillis();
        this.LIZIZ = SystemClock.currentThreadTimeMillis();
    }
}
