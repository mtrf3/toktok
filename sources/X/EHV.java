package X;

import android.os.SystemClock;
import defpackage.i0;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EHV implements C8V8 {
    public long LIZ;

    @Override // X.C8V8
    public final void LIZIZ(String str) {
        if (o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL()) && C56672Kh.LIZ().LJIIL()) {
            C36093EEn.LIZ.getClass();
            if (!EEZ.LIZIZ()) {
                this.LIZ = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // X.C8V8
    public final void end(String str, String str2) {
        if (o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL()) && C56672Kh.LIZ().LJIIL()) {
            C36093EEn.LIZ.getClass();
            if (!EEZ.LIZIZ()) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.LIZ;
                if (str != null) {
                    String name = i0.LJFF(str2, str);
                    if (uptimeMillis > 2) {
                        FAK LIZ = C56672Kh.LIZ();
                        LIZ.getClass();
                        o.LJIIIZ(name, "name");
                        if (((ConcurrentHashMap) LIZ.LJIIJJI).containsKey(name)) {
                            return;
                        }
                        ((ConcurrentHashMap) LIZ.LJIIJJI).put(name, Long.valueOf(uptimeMillis));
                    }
                }
            }
        }
    }
}
