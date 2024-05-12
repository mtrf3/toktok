package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.google.gson.g;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class E79 extends AbstractC65781Prl implements InterfaceC65784Pro<SettingsModel> {
    public static final E79 LJLIL = new E79();

    public E79() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SettingsModel invoke() {
        ArrayList arrayList;
        SettingsModel LIZ = C65928Pu8.LIZIZ.LIZ();
        if (!FCD.LJI(StrategyImpl.LIZIZ().getApplicationContext())) {
            arrayList = new ArrayList();
        } else {
            try {
                FFL.LJIIIZ().getClass();
                arrayList = (ArrayList) GsonHolder.LIZLLL().LIZ().LIZJ((g) FFL.LJIJ(true, "pumbaa_white_list", 31744, g.class, null), ArrayList.class);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            } catch (Exception unused) {
                arrayList = new ArrayList();
            }
        }
        LIZ.getClass();
        LIZ.apiWhiteList = arrayList;
        return LIZ;
    }
}
