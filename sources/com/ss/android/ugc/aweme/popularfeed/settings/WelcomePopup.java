package com.ss.android.ugc.aweme.popularfeed.settings;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class WelcomePopup extends F9E {

    @InterfaceC65349Pkn("button")
    public String button;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomePopup() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.title, this.desc, this.button};
    }

    public WelcomePopup(String str, String str2, String str3) {
        HH1.LIZ(str, "title", str2, "desc", str3, "button");
        this.title = str;
        this.desc = str2;
        this.button = str3;
    }

    public /* synthetic */ WelcomePopup(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
