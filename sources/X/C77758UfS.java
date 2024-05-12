package X;

import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.live.walletnew.ui.LocationList;
import kotlin.jvm.internal.o;

/* renamed from: X.UfS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77758UfS implements UHJ {
    public final /* synthetic */ LocationList LIZ;

    public C77758UfS(LocationList locationList) {
        this.LIZ = locationList;
    }

    @Override // X.UHJ
    public final void LIZIZ(LocationObject s) {
        o.LJIIIZ(s, "s");
        LocationList locationList = this.LIZ;
        LocationObject[] locationObjectArr = locationList.LJLZ;
        if (locationObjectArr != null) {
            locationObjectArr[locationList.LJLJLLL] = s;
            C2A7 c2a7 = locationList.LJLLJ;
            if (c2a7 != null) {
                if (!c2a7.isEnabled()) {
                    C2A7 c2a72 = this.LIZ.LJLLJ;
                    if (c2a72 != null) {
                        c2a72.setEnabled(true);
                        return;
                    } else {
                        o.LJIJI("confirmbtn");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("confirmbtn");
            throw null;
        }
        o.LJIJI("locationName");
        throw null;
    }

    @Override // X.UHJ
    public final void LIZ(int i, LocationObject s) {
        o.LJIIIZ(s, "s");
        LocationList locationList = this.LIZ;
        LocationObject[] locationObjectArr = locationList.LJLZ;
        if (locationObjectArr != null) {
            locationObjectArr[i] = s;
            locationList.wl(i, 1);
        } else {
            o.LJIJI("locationName");
            throw null;
        }
    }
}
