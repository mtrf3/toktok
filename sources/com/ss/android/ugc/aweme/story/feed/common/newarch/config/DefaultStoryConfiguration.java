package com.ss.android.ugc.aweme.story.feed.common.newarch.config;

import X.C3C8;
import X.C8O4;
import X.C8VR;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DefaultStoryConfiguration extends CommonFeedCollectionConfig {
    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.config.FeedCollectionConfigProtocol
    public final boolean LJIILL(C8O4 cellCtx) {
        o.LJIIIZ(cellCtx, "cellCtx");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.config.CommonFeedCollectionConfig
    public final void LIZ(BaseCellContentComponent<? extends C3C8> component, C8O4 cellCtx) {
        o.LJIIIZ(component, "component");
        o.LJIIIZ(cellCtx, "cellCtx");
        C8VR.LIZ(component, new AqS134S0200000_3(component, cellCtx, 200));
    }
}
