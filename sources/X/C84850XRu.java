package X;

import android.view.View;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.XRu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84850XRu extends AbstractC65781Prl implements InterfaceC88471Ynr<View, String, C76800UCe> {
    public static final C84850XRu LJLIL = new C84850XRu();

    public C84850XRu() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(View view, String itemID) {
        WeakReference<InterfaceC84851XRv> weakReference;
        InterfaceC84851XRv interfaceC84851XRv;
        Integer num;
        o.LJIIIZ(itemID, "itemID");
        if ((Q7K.LIZIZ("poi_is_low_device", 0) != 1 || (num = PoiServerConfigSettings.LIZ().regionPoiDiscovery) == null || num.intValue() != 3) && (weakReference = C85049XZl.LJ) != null && (interfaceC84851XRv = weakReference.get()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryAutoPlayWhenAutoPlayAllPageContainerExposed - focusingPage: ");
            LIZ.append(interfaceC84851XRv);
            C188447aS.LIZ(X1D.LIZIZ(LIZ));
            interfaceC84851XRv.v2(null);
        }
        return C76800UCe.LIZ;
    }
}
