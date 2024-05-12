package com.ss.android.ugc.aweme.services;

import X.F3T;
import X.InterfaceC38186Eyk;
import com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import java.util.List;

/* loaded from: classes16.dex */
public interface IBusinessGoodsService {
    void clearCache();

    List<InterfaceC38186Eyk> createBridges(F3T f3t);

    BusinessGoodsPublishModel getCurBusinessDraftModel(String str);

    void removeUserSetting(String str);

    void saveBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel);
}
