package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionConfig;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ih6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47284Ih6 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends C46898Ias>> {
    public static final C47284Ih6 LJLIL = new C47284Ih6();

    public C47284Ih6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List<? extends X.Ias>] */
    @Override // X.InterfaceC65784Pro
    public final List<? extends C46898Ias> invoke() {
        ArrayList arrayList;
        DynamicOptionConfig dynamicOptionConfig;
        List<DynamicOptionModel> list;
        try {
            arrayList = new ArrayList();
            String LJ = C47281Ih3.LJ(EF7.LIZIZ(), "player/dynamic_option_keys.json");
            if (LJ != null) {
                dynamicOptionConfig = (DynamicOptionConfig) new Gson().LJI(LJ, DynamicOptionConfig.class);
            } else {
                dynamicOptionConfig = null;
            }
            if (dynamicOptionConfig != null) {
                list = dynamicOptionConfig.dynamicOptionModelList;
            } else {
                list = null;
            }
        } catch (Throwable unused) {
        }
        if (list == null) {
            return null;
        }
        List<DynamicOptionModel> list2 = dynamicOptionConfig.dynamicOptionModelList;
        o.LJI(list2);
        if (list2.isEmpty()) {
            return null;
        }
        List<DynamicOptionModel> list3 = dynamicOptionConfig.dynamicOptionModelList;
        o.LJI(list3);
        for (DynamicOptionModel dynamicOptionModel : list3) {
            int i = dynamicOptionModel.scene;
            if (i == 2 || i == 3) {
                C46898Ias LIZ = dynamicOptionModel.LIZ();
                C47300IhM c47300IhM = C47300IhM.LIZ;
                String str = dynamicOptionModel.libraKey;
                c47300IhM.getClass();
                if (LIZ.LIZ(C47300IhM.LIZIZ(str, true))) {
                    arrayList.add(LIZ);
                }
            }
        }
        C47300IhM.LIZ.getClass();
        return C47300IhM.LJI.getValue();
    }
}
