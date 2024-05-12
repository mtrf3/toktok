package X;

import com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestAssemV1;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUW extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SUW LJLIL = new SUW();

    public SUW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(NearbyLocationPermissionRequestAssemV1.class);
        uiSlotAssem.LJIIIZ = new NearbyLocationPermissionRequestAssemV1();
        uiSlotAssem.LJI = R.id.dhm;
        return C76800UCe.LIZ;
    }
}
