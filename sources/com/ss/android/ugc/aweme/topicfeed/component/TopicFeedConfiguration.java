package com.ss.android.ugc.aweme.topicfeed.component;

import X.C8VV;
import X.KRA;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedConfiguration extends CommonPanelConfiguration {
    @Override // com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration
    public final void LIZ(BasePanelUIComponent basePanelUIComponent) {
        o.LJIIIZ(basePanelUIComponent, "<this>");
        C8VV.LIZJ(basePanelUIComponent, new AqS175S0100000_9(basePanelUIComponent, BuildConfig.VERSION_CODE));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "Topic");
    }
}
