package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class AtmosphereTagInfo {

    @InterfaceC65349Pkn("atmosphere_tags")
    public List<ProductAtmosphereTag> atmosphereTags = new ArrayList();

    @InterfaceC65349Pkn("pin_atmosphere_tags")
    public List<ProductAtmosphereTag> pinAtmosphereTags = new ArrayList();

    @InterfaceC65349Pkn("tag_type")
    public int tagType;
}
