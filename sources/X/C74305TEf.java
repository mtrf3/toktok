package X;

import Y.AObserverS75S0200000_12;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS145S0200000_14;

/* renamed from: X.TEf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74305TEf implements InterfaceC74306TEg {
    public final TEZ LIZ;
    public final LifecycleOwner LIZIZ;

    @Override // X.InterfaceC74306TEg
    public final void LIZ(AqS145S0200000_14 aqS145S0200000_14) {
        TEZ tez = this.LIZ;
        if (tez != null) {
            TJV LIZ = tez.LJJJJLL().LIZ();
            C74310TEk.LIZIZ(LIZ, false, 15).observe(this.LIZIZ, new AObserverS75S0200000_12(aqS145S0200000_14, LIZ, 13));
        } else {
            aqS145S0200000_14.invoke(null);
        }
    }

    public C74305TEf(C82410WVy c82410WVy, TEZ tez) {
        this.LIZ = tez;
        this.LIZIZ = c82410WVy;
    }
}
