package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressSAConfig extends F9E {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("template_min_version")
    public String minVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressSAConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), this.minVersion};
    }

    public AddressSAConfig(boolean z, String minVersion) {
        o.LJIIIZ(minVersion, "minVersion");
        this.enable = z;
        this.minVersion = minVersion;
    }

    public /* synthetic */ AddressSAConfig(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CardStruct.IStatusCode.DEFAULT : str);
    }
}
