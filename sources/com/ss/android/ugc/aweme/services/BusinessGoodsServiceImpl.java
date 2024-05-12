package com.ss.android.ugc.aweme.services;

import X.C235779Nd;
import X.C40222FqU;
import X.C58096Mr6;
import X.C86580XyS;
import X.F3T;
import X.InterfaceC38186Eyk;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BusinessGoodsServiceImpl implements IBusinessGoodsService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public void clearCache() {
        C86580XyS.LIZ = null;
    }

    public static IBusinessGoodsService createIBusinessGoodsServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IBusinessGoodsService.class, z);
        if (LIZ != null) {
            return (IBusinessGoodsService) LIZ;
        }
        if (C58096Mr6.D5 == null) {
            synchronized (IBusinessGoodsService.class) {
                if (C58096Mr6.D5 == null) {
                    C58096Mr6.D5 = new BusinessGoodsServiceImpl();
                }
            }
        }
        return C58096Mr6.D5;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public List<InterfaceC38186Eyk> createBridges(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return C40222FqU.LIZ(providerFactory);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public BusinessGoodsPublishModel getCurBusinessDraftModel(String videoPath) {
        o.LJIIIZ(videoPath, "videoPath");
        BusinessGoodsPublishModel businessGoodsPublishModel = null;
        if (C86580XyS.LIZ() != null) {
            Iterator<BusinessGoodsPublishModel> it = C86580XyS.LIZ.getGoodsPublishModels().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BusinessGoodsPublishModel next = it.next();
                if (next != null && TextUtils.equals(videoPath, next.videoPath)) {
                    businessGoodsPublishModel = next;
                    break;
                }
            }
        }
        o.LJIIIIZZ(businessGoodsPublishModel, "getCurBusinessDraftModel(videoPath)");
        return businessGoodsPublishModel;
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public void removeUserSetting(String videoPath) {
        o.LJIIIZ(videoPath, "videoPath");
        C86580XyS.LIZJ(videoPath);
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessGoodsService
    public void saveBusinessGoodsInfo(BusinessGoodsPublishModel model) {
        o.LJIIIZ(model, "model");
        BusinessGoodsPublishSetting LIZ = C86580XyS.LIZ();
        if (LIZ == null) {
            LIZ = new BusinessGoodsPublishSetting();
            LIZ.setUserId(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        }
        List<BusinessGoodsPublishModel> goodsPublishModels = LIZ.getGoodsPublishModels();
        if (goodsPublishModels == null) {
            goodsPublishModels = new ArrayList<>();
        } else {
            goodsPublishModels.remove(model);
        }
        goodsPublishModels.add(model);
        LIZ.setGoodsPublishModels(goodsPublishModels);
        List<BusinessGoodsPublishSetting> LIZIZ = C86580XyS.LIZIZ();
        LIZIZ.remove(LIZ);
        LIZIZ.add(LIZ);
        C235779Nd.LIZ.LJ().LIZLLL(GsonProtectorUtils.toJson(new Gson(), LIZIZ));
        C86580XyS.LIZ = LIZ;
    }
}
