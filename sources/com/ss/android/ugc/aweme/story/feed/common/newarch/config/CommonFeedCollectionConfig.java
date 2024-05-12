package com.ss.android.ugc.aweme.story.feed.common.newarch.config;

import X.C3C8;
import X.C8O4;
import X.C8VR;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class CommonFeedCollectionConfig implements IFeedCollectionConfigProtocol {
    public abstract void LIZ(BaseCellContentComponent<? extends C3C8> baseCellContentComponent, C8O4 c8o4);

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.config.FeedCollectionConfigProtocol
    public final void LJJLIIIJ(BaseCellContentComponent<? extends C3C8> component, C8O4 cellCtx) {
        o.LJIIIZ(component, "component");
        o.LJIIIZ(cellCtx, "cellCtx");
        C8VR.LIZ(component, new AqS169S0100000_3((BaseCellContentComponent) component, (BaseCellContentComponent<? extends C3C8>) 699));
        LIZ(component, cellCtx);
    }
}
