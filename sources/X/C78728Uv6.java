package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.preloader.EcomBizSceneImageConfigModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Uv6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78728Uv6 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends EcomBizSceneImageConfigModel>> {
    public static final C78728Uv6 LJLIL = new C78728Uv6();

    public C78728Uv6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends EcomBizSceneImageConfigModel> invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcomBizSceneImageConfigModel[] ecomBizSceneImageConfigModelArr = C78729Uv7.LIZIZ;
        EcomBizSceneImageConfigModel[] ecomBizSceneImageConfigModelArr2 = (EcomBizSceneImageConfigModel[]) LIZLLL.LJIIIIZZ("ecom_biz_scene_image_config", EcomBizSceneImageConfigModel[].class, ecomBizSceneImageConfigModelArr);
        if (ecomBizSceneImageConfigModelArr2 == null) {
            C78729Uv7.LIZ.getClass();
        } else {
            ecomBizSceneImageConfigModelArr = ecomBizSceneImageConfigModelArr2;
        }
        o.LJIIIIZZ(ecomBizSceneImageConfigModelArr, "SettingsManager.getInsta…a)\n            ?: DEFAULT");
        if (ecomBizSceneImageConfigModelArr.length == 0) {
            return C113554cx.LJJJLIIL();
        }
        int LJJIIZ = C51029K0z.LJJIIZ(ecomBizSceneImageConfigModelArr.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EcomBizSceneImageConfigModel ecomBizSceneImageConfigModel : ecomBizSceneImageConfigModelArr) {
            linkedHashMap.put(ecomBizSceneImageConfigModel.getBizScene(), ecomBizSceneImageConfigModel);
        }
        return linkedHashMap;
    }
}
