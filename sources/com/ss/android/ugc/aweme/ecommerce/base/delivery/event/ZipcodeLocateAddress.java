package com.ss.android.ugc.aweme.ecommerce.base.delivery.event;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ZipcodeLocateAddress {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("error")
    public final String error;

    @InterfaceC65349Pkn("isCheck")
    public final Boolean isCheck;

    @InterfaceC65349Pkn("regions")
    public final List<Region> regions;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @InterfaceC65349Pkn("zipCode")
    public final String zipcode;

    /* JADX WARN: Multi-variable type inference failed */
    public ZipcodeLocateAddress() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public ZipcodeLocateAddress(Integer num, String str, List<Region> list, String str2, Boolean bool) {
        this.type = num;
        this.error = str;
        this.regions = list;
        this.zipcode = str2;
        this.isCheck = bool;
    }

    public /* synthetic */ ZipcodeLocateAddress(Integer num, String str, List list, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? bool : null);
    }
}
