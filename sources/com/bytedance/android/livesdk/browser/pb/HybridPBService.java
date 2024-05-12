package com.bytedance.android.livesdk.browser.pb;

import X.C39902FlK;
import X.C60905NvJ;
import X.InterfaceC61488OBg;
import com.bytedance.android.live.browser.IHybridPBService;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveDynamicPbDefinitionSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LivePBDynamicPreloadConfigSetting;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.AqS176S0100000_10;

/* loaded from: classes11.dex */
public class HybridPBService implements IHybridPBService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.browser.IHybridPBService
    public final void ss() {
        C39902FlK c39902FlK;
        LiveDynamicPbDefinitionSetting.PbDefinitionItem[] value;
        if (LivePBDynamicPreloadConfigSetting.INSTANCE.getValue() != 1) {
            return;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.bid = "live";
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(sparkContext, Boolean.TRUE);
        if ((LIZIZ instanceof C39902FlK) && (c39902FlK = (C39902FlK) LIZIZ) != null && (value = LiveDynamicPbDefinitionSetting.getValue()) != null) {
            for (LiveDynamicPbDefinitionSetting.PbDefinitionItem pbDefinitionItem : value) {
                c39902FlK.LIZLLL(pbDefinitionItem.url, new RequestParams(null, 1, null), new AqS176S0100000_10(pbDefinitionItem, 19));
            }
        }
    }
}
