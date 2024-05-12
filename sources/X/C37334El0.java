package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEMediaParser;
import kotlin.jvm.internal.o;

/* renamed from: X.El0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37334El0<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ VEMediaParser LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ long LIZJ;

    public C37334El0(VEMediaParser vEMediaParser, String str, long j) {
        this.LIZ = vEMediaParser;
        this.LIZIZ = str;
        this.LIZJ = j;
    }

    @Override // X.C10I
    public final Object then(C10K<Bitmap> task) {
        Bitmap copy;
        o.LJIIIZ(task, "task");
        if (task.LJIILIIL()) {
            try {
                Bitmap LIZ = C37335El1.LIZ(C60996Nwm.LJIIJ(C37335El1.LIZIZ()), C60996Nwm.LJFF(C37335El1.LIZIZ()), task.LJIIJJI());
                if (LIZ != null && (copy = LIZ.copy(Bitmap.Config.ARGB_8888, true)) != null) {
                    String str = this.LIZIZ;
                    long j = this.LIZJ;
                    ((C80932VpY) C37335El1.LJ.getValue()).process(copy);
                    C37336El2 c37336El2 = C37335El1.LJFF;
                    synchronized (c37336El2) {
                        c37336El2.put(str, copy);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str);
                    LIZ2.append(" cost:(");
                    LIZ2.append(System.currentTimeMillis() - j);
                    LIZ2.append(')');
                    H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ2));
                }
            } catch (Exception unused) {
            }
        }
        this.LIZ.release();
        return null;
    }
}
