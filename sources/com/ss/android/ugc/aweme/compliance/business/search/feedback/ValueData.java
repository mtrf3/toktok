package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ValueData extends F9E {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("text_data")
    public final String textData;

    @InterfaceC65349Pkn("value")
    public final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public ValueData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.id, this.value, this.textData};
    }

    public ValueData(String str, String str2, String str3) {
        HH1.LIZ(str, "id", str2, "value", str3, "textData");
        this.id = str;
        this.value = str2;
        this.textData = str3;
    }

    public /* synthetic */ ValueData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
