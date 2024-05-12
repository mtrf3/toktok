package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.ss.android.ugc.aweme.network.INetwork;

/* renamed from: X.Pcb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64841Pcb {
    public static final INetwork LIZ() {
        try {
            INetwork LJI = NetworkService.LJI();
            if (LJI != null) {
                return LJI;
            }
        } catch (Exception unused) {
        }
        throw new IllegalStateException("SPI have not got the INetwork instance");
    }
}
