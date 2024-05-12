package com.ss.android.ugc.aweme.compliance.api.phl.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PrivacyHighlightsForTeensDescription extends F9E {

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_name")
    public final String linkName;

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyHighlightsForTeensDescription() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.name, this.linkName, this.link};
    }

    public PrivacyHighlightsForTeensDescription(String str, String str2, String str3) {
        HH1.LIZ(str, "name", str2, "linkName", str3, "link");
        this.name = str;
        this.linkName = str2;
        this.link = str3;
    }

    public /* synthetic */ PrivacyHighlightsForTeensDescription(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
