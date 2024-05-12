package com.ss.android.ugc.aweme.creatorcenter;

import X.AL3;
import X.AL4;
import X.AL7;
import X.ALE;
import X.C244809jA;
import X.C58096Mr6;
import X.C58310MuY;
import X.C60827Nu3;
import X.C67032k7;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.CreatorCenterURLSetting;
import com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreatorCenterPreloadServiceImpl implements ICreatorCenterPreloadService {
    public final CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel LIZ = (CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("creator_center_inapp_url", CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel.class, null);

    public static ICreatorCenterPreloadService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ICreatorCenterPreloadService.class, false);
        if (LIZ != null) {
            return (ICreatorCenterPreloadService) LIZ;
        }
        if (C58096Mr6.f84n == null) {
            synchronized (ICreatorCenterPreloadService.class) {
                if (C58096Mr6.f84n == null) {
                    C58096Mr6.f84n = new CreatorCenterPreloadServiceImpl();
                }
            }
        }
        return C58096Mr6.f84n;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService
    public final void LIZ() {
        CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel creatorCenterInfoStructJsonModel;
        if (C244809jA.LIZIZ() && (creatorCenterInfoStructJsonModel = this.LIZ) != null) {
            String schema = creatorCenterInfoStructJsonModel.toolsEntryURL;
            C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
            ALE ale = new ALE();
            ale.LJIIIZ = C244809jA.LIZIZ();
            ale.LIZ = "creator_center_spark_biz";
            ale.LJIIJ = 8;
            ale.LJIIJJI = 600;
            ale.LIZIZ(C67032k7.LJLIL);
            ale.LJIIL = AL3.LJLIL;
            ale.LJ = true;
            c60827Nu3.getClass();
            C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
            o.LJIIIZ(schema, "schema");
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(schema);
            sparkContext.LJJI(new AL7());
            sparkContext.LJJI(new AL4());
            C60827Nu3.LJIIIIZZ(c60827Nu3, schema, "creator_center_spark_biz", sparkContext, 8);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService
    public final void LIZIZ() {
        if (C244809jA.LIZIZ() && this.LIZ != null) {
            C58310MuY.LIZIZ.getClass();
            C60827Nu3.LJIIL("creator_center_spark_biz");
        }
    }
}
