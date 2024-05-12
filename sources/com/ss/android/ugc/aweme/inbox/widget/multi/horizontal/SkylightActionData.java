package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkylightActionData implements Serializable {

    @InterfaceC65349Pkn("extra_data")
    public final String extraData;

    @InterfaceC65349Pkn("scheme_url")
    public final String schemaUrl;

    @InterfaceC65349Pkn("action_type")
    public final Integer type;

    @InterfaceC65349Pkn("gesture_type")
    public final Integer user;

    /* JADX WARN: Multi-variable type inference failed */
    public SkylightActionData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SkylightActionData copy$default(SkylightActionData skylightActionData, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = skylightActionData.user;
        }
        if ((i & 2) != 0) {
            num2 = skylightActionData.type;
        }
        if ((i & 4) != 0) {
            str = skylightActionData.schemaUrl;
        }
        if ((i & 8) != 0) {
            str2 = skylightActionData.extraData;
        }
        return skylightActionData.copy(num, num2, str, str2);
    }

    public final SkylightActionData copy(Integer num, Integer num2, String str, String str2) {
        return new SkylightActionData(num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightActionData)) {
            return false;
        }
        SkylightActionData skylightActionData = (SkylightActionData) obj;
        return o.LJ(this.user, skylightActionData.user) && o.LJ(this.type, skylightActionData.type) && o.LJ(this.schemaUrl, skylightActionData.schemaUrl) && o.LJ(this.extraData, skylightActionData.extraData);
    }

    public int hashCode() {
        Integer num = this.user;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.type;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.schemaUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extraData;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightActionData(user=");
        LIZ.append(this.user);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", schemaUrl=");
        LIZ.append(this.schemaUrl);
        LIZ.append(", extraData=");
        return q.LIZIZ(LIZ, this.extraData, ')', LIZ);
    }

    public final String getExtraData() {
        return this.extraData;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final Integer getType() {
        return this.type;
    }

    public final Integer getUser() {
        return this.user;
    }

    public SkylightActionData(Integer num, Integer num2, String str, String str2) {
        this.user = num;
        this.type = num2;
        this.schemaUrl = str;
        this.extraData = str2;
    }

    public /* synthetic */ SkylightActionData(Integer num, Integer num2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
