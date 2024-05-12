package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.XyS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86580XyS {
    public static BusinessGoodsPublishSetting LIZ;

    public static synchronized BusinessGoodsPublishSetting LIZ() {
        BusinessGoodsPublishSetting businessGoodsPublishSetting;
        synchronized (C86580XyS.class) {
            if (LIZ == null) {
                for (BusinessGoodsPublishSetting businessGoodsPublishSetting2 : LIZIZ()) {
                    try {
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    if (BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID().equals(businessGoodsPublishSetting2.getUserId())) {
                        LIZ = businessGoodsPublishSetting2;
                        break;
                    }
                    continue;
                }
            }
            businessGoodsPublishSetting = LIZ;
        }
        return businessGoodsPublishSetting;
    }

    public static List<BusinessGoodsPublishSetting> LIZIZ() {
        String LIZ2 = C235779Nd.LIZ.LJ().LIZ();
        if (!TextUtils.isEmpty(LIZ2)) {
            return (List) GsonProtectorUtils.fromJson(new Gson(), LIZ2, new C86579XyR().getType());
        }
        return new ArrayList();
    }

    public static void LIZJ(String str) {
        BusinessGoodsPublishSetting LIZ2;
        List<BusinessGoodsPublishModel> goodsPublishModels;
        if (TextUtils.isEmpty(str) || (LIZ2 = LIZ()) == null || (goodsPublishModels = LIZ2.getGoodsPublishModels()) == null || goodsPublishModels.size() == 0) {
            return;
        }
        Iterator<BusinessGoodsPublishModel> it = goodsPublishModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BusinessGoodsPublishModel next = it.next();
            if (next != null && TextUtils.equals(str, next.videoPath)) {
                goodsPublishModels.remove(next);
                break;
            }
        }
        LIZ2.setGoodsPublishModels(goodsPublishModels);
        List<BusinessGoodsPublishSetting> LIZIZ = LIZIZ();
        LIZIZ.remove(LIZ2);
        LIZIZ.add(LIZ2);
        C235779Nd.LIZ.LJ().LIZLLL(GsonProtectorUtils.toJson(new Gson(), LIZIZ));
    }
}
