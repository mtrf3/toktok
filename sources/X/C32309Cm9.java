package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cm9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32309Cm9 extends AbstractC32415Cnr {
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.AbstractC32415Cnr
    public final void LIZ(C32399Cnb c32399Cnb) {
        List<String> list;
        Long l;
        if (c32399Cnb != null && (list = c32399Cnb.LJIILJJIL) != null && (!((ArrayList) list).isEmpty())) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LIZIZ;
            List<String> list2 = null;
            if (c32399Cnb != null) {
                list2 = c32399Cnb.LJIILJJIL;
                l = Long.valueOf(c32399Cnb.LJIILIIL);
            } else {
                l = null;
            }
            BNG.LIZ(list2, l, null, null, null, elapsedRealtime, this.LIZJ, 0, "");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32309Cm9(long j, String str) {
        super(null);
        this.LIZIZ = j;
        this.LIZJ = str;
    }
}
