package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.Cly, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32298Cly extends AbstractC32415Cnr {
    public final /* synthetic */ long LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32298Cly(long j) {
        super(null);
        this.LIZIZ = j;
    }

    @Override // X.AbstractC32415Cnr
    public final void LIZ(C32399Cnb c32399Cnb) {
        Long l;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ;
        List<String> list = null;
        if (c32399Cnb != null) {
            list = c32399Cnb.LJIILJJIL;
            l = Long.valueOf(c32399Cnb.LJIILIIL);
        } else {
            l = null;
        }
        BNG.LIZ(list, l, null, null, null, elapsedRealtime, "delete_all", 0, "");
    }
}
