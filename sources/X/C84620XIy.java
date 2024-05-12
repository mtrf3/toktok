package X;

import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.XIy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84620XIy<T> extends C84621XIz<T> {
    public int LJI;

    @Override // X.AbstractC84617XIv
    public final boolean LIZLLL() {
        return ((Boolean) C34597Dhx.LIZ.getValue()).booleanValue();
    }

    @Override // X.C84621XIz, X.AbstractC84617XIv
    public final void LIZJ() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            super.LIZJ();
            return;
        }
        Executor LIZ = C214368bA.LIZ();
        if (!(LIZ instanceof C38018Ew2)) {
            return;
        }
        int i = this.LJI;
        if (i == -1 || i != ((C38018Ew2) LIZ).LJLIL) {
            this.LIZIZ = null;
        }
        this.LJI = ((C38018Ew2) LIZ).LJLIL;
    }

    public C84620XIy(C214358b9 c214358b9) {
        super(c214358b9);
        this.LJI = -1;
    }
}
