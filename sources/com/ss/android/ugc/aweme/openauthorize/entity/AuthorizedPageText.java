package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AuthorizedPageText implements Serializable {

    @InterfaceC65349Pkn("text_content")
    public final String textContent;

    @InterfaceC65349Pkn("text_key")
    public final String textKey;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizedPageText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthorizedPageText copy$default(AuthorizedPageText authorizedPageText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizedPageText.textKey;
        }
        if ((i & 2) != 0) {
            str2 = authorizedPageText.textContent;
        }
        return authorizedPageText.copy(str, str2);
    }

    public final AuthorizedPageText copy(String str, String str2) {
        return new AuthorizedPageText(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedPageText)) {
            return false;
        }
        AuthorizedPageText authorizedPageText = (AuthorizedPageText) obj;
        return o.LJ(this.textKey, authorizedPageText.textKey) && o.LJ(this.textContent, authorizedPageText.textContent);
    }

    public int hashCode() {
        String str = this.textKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.textContent;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizedPageText(textKey=");
        LIZ.append(this.textKey);
        LIZ.append(", textContent=");
        return q.LIZIZ(LIZ, this.textContent, ')', LIZ);
    }

    public final String getTextContent() {
        return this.textContent;
    }

    public final String getTextKey() {
        return this.textKey;
    }

    public AuthorizedPageText(String str, String str2) {
        this.textKey = str;
        this.textContent = str2;
    }

    public /* synthetic */ AuthorizedPageText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
