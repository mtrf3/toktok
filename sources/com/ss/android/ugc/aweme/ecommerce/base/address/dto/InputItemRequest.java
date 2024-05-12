package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class InputItemRequest {

    @InterfaceC65349Pkn("address_rights_type")
    public final Integer addressRightType;

    @InterfaceC65349Pkn("district")
    public final Region district;

    @InterfaceC65349Pkn("template_min_version")
    public final String templateMinVersion;

    @InterfaceC65349Pkn("template_type")
    public final Integer templateType;

    public InputItemRequest(Region region, Integer num, String str, Integer num2) {
        this.district = region;
        this.templateType = num;
        this.templateMinVersion = str;
        this.addressRightType = num2;
    }

    public /* synthetic */ InputItemRequest(Region region, Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(region, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2);
    }
}
