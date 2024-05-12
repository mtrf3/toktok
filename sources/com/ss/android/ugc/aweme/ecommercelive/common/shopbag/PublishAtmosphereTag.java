package com.ss.android.ugc.aweme.ecommercelive.common.shopbag;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PublishAtmosphereTag extends F9E {

    @InterfaceC65349Pkn("atmosphere_tag_info")
    public final AtmosphereTagInfo atmosphereTagInfo;

    public static /* synthetic */ PublishAtmosphereTag copy$default(PublishAtmosphereTag publishAtmosphereTag, AtmosphereTagInfo atmosphereTagInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            atmosphereTagInfo = publishAtmosphereTag.atmosphereTagInfo;
        }
        return publishAtmosphereTag.copy(atmosphereTagInfo);
    }

    public final PublishAtmosphereTag copy(AtmosphereTagInfo atmosphereTagInfo) {
        o.LJIIIZ(atmosphereTagInfo, "atmosphereTagInfo");
        return new PublishAtmosphereTag(atmosphereTagInfo);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.atmosphereTagInfo};
    }

    public final AtmosphereTagInfo getAtmosphereTagInfo() {
        return this.atmosphereTagInfo;
    }

    public PublishAtmosphereTag(AtmosphereTagInfo atmosphereTagInfo) {
        o.LJIIIZ(atmosphereTagInfo, "atmosphereTagInfo");
        this.atmosphereTagInfo = atmosphereTagInfo;
    }
}
