package X;

import com.bytedance.helios.api.consumer.ApmEvent;

/* renamed from: X.PPd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64397PPd {
    public final long LIZ = System.nanoTime();
    public final String LIZIZ;
    public final /* synthetic */ ApmEvent LIZJ;

    public final void LIZ() {
        long nanoTime = System.nanoTime();
        this.LIZJ.LIZJ(Long.valueOf(nanoTime - this.LIZ), this.LIZIZ);
    }

    public C64397PPd(ApmEvent apmEvent, String str) {
        this.LIZJ = apmEvent;
        this.LIZIZ = str;
    }
}
