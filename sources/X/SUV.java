package X;

import com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestAssemV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUV extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SUV LJLIL = new SUV();

    public SUV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(NearbyLocationPermissionRequestAssemV2.class);
        uiSlotAssem.LJIIIZ = new NearbyLocationPermissionRequestAssemV2();
        uiSlotAssem.LJI = R.id.dhn;
        return C76800UCe.LIZ;
    }
}
