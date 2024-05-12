package X;

import com.ss.android.ugc.aweme.video.experiment.DynamicOptionConfig;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IhJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47297IhJ extends AbstractC65781Prl implements InterfaceC65784Pro<List<C46898Ias>> {
    public static final C47297IhJ LJLIL = new C47297IhJ();

    public C47297IhJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<C46898Ias> invoke() {
        boolean z;
        FFL.LJIIIZ().getClass();
        ArrayList arrayList = null;
        DynamicOptionConfig dynamicOptionConfig = (DynamicOptionConfig) FFL.LJIJ(true, "player_dynamic_option_config", 31744, DynamicOptionConfig.class, null);
        if (dynamicOptionConfig != null && dynamicOptionConfig.dynamicOptionModelList != null && !dynamicOptionConfig.dynamicOptionModelList.isEmpty()) {
            if (C38686FGg.LJ && FH5.LIZIZ().LIZ != null) {
                z = true;
            } else {
                z = false;
            }
            boolean booleanValue = ((Boolean) C47305IhR.LIZ.getValue()).booleanValue();
            if (z && booleanValue) {
                arrayList = new ArrayList();
                for (DynamicOptionModel dynamicOptionModel : dynamicOptionConfig.dynamicOptionModelList) {
                    int i = dynamicOptionModel.scene;
                    if (i == 2 || i == 3) {
                        if (dynamicOptionModel.enableReversal != 1 || !C35127DqV.LIZ()) {
                            C46898Ias LIZ = dynamicOptionModel.LIZ();
                            C47300IhM c47300IhM = C47300IhM.LIZ;
                            String str = dynamicOptionModel.libraKey;
                            c47300IhM.getClass();
                            if (LIZ.LIZ(C47300IhM.LIZIZ(str, true))) {
                                arrayList.add(LIZ);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
