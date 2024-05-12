package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ClickJumpModule implements Serializable {

    @InterfaceC65349Pkn("open_url")
    public final String openUrl;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickJumpModule() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ClickJumpModule copy$default(ClickJumpModule clickJumpModule, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clickJumpModule.text;
        }
        if ((i & 2) != 0) {
            str2 = clickJumpModule.openUrl;
        }
        if ((i & 4) != 0) {
            str3 = clickJumpModule.webUrl;
        }
        return clickJumpModule.copy(str, str2, str3);
    }

    public final ClickJumpModule copy(String str, String str2, String str3) {
        return new ClickJumpModule(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickJumpModule)) {
            return false;
        }
        ClickJumpModule clickJumpModule = (ClickJumpModule) obj;
        return o.LJ(this.text, clickJumpModule.text) && o.LJ(this.openUrl, clickJumpModule.openUrl) && o.LJ(this.webUrl, clickJumpModule.webUrl);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.openUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.webUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClickJumpModule(text=");
        LIZ.append(this.text);
        LIZ.append(", openUrl=");
        LIZ.append(this.openUrl);
        LIZ.append(", webUrl=");
        return q.LIZIZ(LIZ, this.webUrl, ')', LIZ);
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public ClickJumpModule(String str, String str2, String str3) {
        this.text = str;
        this.openUrl = str2;
        this.webUrl = str3;
    }

    public /* synthetic */ ClickJumpModule(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
