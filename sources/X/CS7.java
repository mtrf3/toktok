package X;

import android.util.LongSparseArray;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class CS7 {
    public static final CS7 LIZ = new CS7();
    public static final LongSparseArray<List<CSK>> LIZIZ = new LongSparseArray<>();
    public static final List<InterfaceC31355CSh> LIZJ = new ArrayList();
    public static final LongSparseArray<DataChannel> LIZLLL = new LongSparseArray<>();

    static {
        Iterator<CRX> it = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).jh0().iterator();
        while (it.hasNext()) {
            it.next().LJFF(LIZ);
        }
    }

    public static InterfaceC31355CSh LIZ(InterfaceC006400u interfaceC006400u) {
        Iterator it = ((ArrayList) LIZJ).iterator();
        while (it.hasNext()) {
            InterfaceC31355CSh interfaceC31355CSh = (InterfaceC31355CSh) it.next();
            if (interfaceC006400u.LIZJ(interfaceC31355CSh)) {
                return interfaceC31355CSh;
            }
        }
        return null;
    }

    public final void LIZIZ(C28962BYg c28962BYg) {
        ((ArrayList) LIZJ).add(c28962BYg);
    }
}
