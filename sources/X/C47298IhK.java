package X;

import com.ss.android.ugc.aweme.video.experiment.DynamicOptionConfig;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IhK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47298IhK extends AbstractC65781Prl implements InterfaceC65784Pro<List<C46898Ias>> {
    public static final C47298IhK LJLIL = new C47298IhK();

    public C47298IhK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<C46898Ias> invoke() {
        boolean z;
        C47300IhM.LIZ.getClass();
        DynamicOptionConfig dynamicOptionConfig = (DynamicOptionConfig) C47300IhM.LIZIZ.getValue();
        ArrayList arrayList = null;
        if (dynamicOptionConfig != null && dynamicOptionConfig.dynamicOptionModelList != null && !dynamicOptionConfig.dynamicOptionModelList.isEmpty()) {
            if (C38686FGg.LJ && FH5.LIZIZ().LIZ != null) {
                z = true;
            } else {
                z = false;
            }
            boolean booleanValue = ((Boolean) C47305IhR.LIZ.getValue()).booleanValue();
            if (z || booleanValue) {
                arrayList = new ArrayList();
                for (DynamicOptionModel dynamicOptionModel : dynamicOptionConfig.dynamicOptionModelList) {
                    if (dynamicOptionModel.scene == 1 && (dynamicOptionModel.enableReversal != 1 || !C35127DqV.LIZ())) {
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
        return arrayList;
    }
}
