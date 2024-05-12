package com.ss.android.ugc.aweme.now;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowButtonInfo implements Serializable {

    @InterfaceC65349Pkn("button_label")
    public String buttonLabel;

    @InterfaceC65349Pkn("redirect_uri")
    public String redirectUri;

    /* JADX WARN: Multi-variable type inference failed */
    public NowButtonInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NowButtonInfo copy$default(NowButtonInfo nowButtonInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nowButtonInfo.buttonLabel;
        }
        if ((i & 2) != 0) {
            str2 = nowButtonInfo.redirectUri;
        }
        return nowButtonInfo.copy(str, str2);
    }

    public final NowButtonInfo copy(String str, String str2) {
        return new NowButtonInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowButtonInfo)) {
            return false;
        }
        NowButtonInfo nowButtonInfo = (NowButtonInfo) obj;
        return o.LJ(this.buttonLabel, nowButtonInfo.buttonLabel) && o.LJ(this.redirectUri, nowButtonInfo.redirectUri);
    }

    public int hashCode() {
        String str = this.buttonLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectUri;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowButtonInfo(buttonLabel=");
        LIZ.append(this.buttonLabel);
        LIZ.append(", redirectUri=");
        return q.LIZIZ(LIZ, this.redirectUri, ')', LIZ);
    }

    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public NowButtonInfo(String str, String str2) {
        this.buttonLabel = str;
        this.redirectUri = str2;
    }

    public /* synthetic */ NowButtonInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
