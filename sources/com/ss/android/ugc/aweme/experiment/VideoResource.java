package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class VideoResource extends F9E {

    @InterfaceC65349Pkn("anchor_key")
    public final String anchorKey;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.anchorKey, this.name, this.uri};
    }

    public VideoResource(String str, String str2, String str3) {
        HH1.LIZ(str, "anchorKey", str2, "name", str3, "uri");
        this.anchorKey = str;
        this.name = str2;
        this.uri = str3;
    }

    public /* synthetic */ VideoResource(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
