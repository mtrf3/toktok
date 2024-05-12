package com.ss.android.ugc.aweme.feed.model;

import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class EditHint implements Serializable {

    @InterfaceC65349Pkn("hint")
    public String hint;

    @InterfaceC65349Pkn("language")
    public String language;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditHint{language='");
        Q89.LIZIZ(LIZ, this.language, '\'', ", hint='");
        return C77800Ug8.LIZJ(LIZ, this.hint, '\'', '}', LIZ);
    }

    public String getHint() {
        return this.hint;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }
}
