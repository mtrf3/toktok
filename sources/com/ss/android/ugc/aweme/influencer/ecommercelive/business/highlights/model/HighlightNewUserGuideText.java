package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightNewUserGuideText implements Serializable {

    @InterfaceC65349Pkn("common_text")
    public final String commonText;

    @InterfaceC65349Pkn("mark_text")
    public final String markText;

    public static /* synthetic */ HighlightNewUserGuideText copy$default(HighlightNewUserGuideText highlightNewUserGuideText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightNewUserGuideText.markText;
        }
        if ((i & 2) != 0) {
            str2 = highlightNewUserGuideText.commonText;
        }
        return highlightNewUserGuideText.copy(str, str2);
    }

    public final HighlightNewUserGuideText copy(String str, String str2) {
        return new HighlightNewUserGuideText(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightNewUserGuideText)) {
            return false;
        }
        HighlightNewUserGuideText highlightNewUserGuideText = (HighlightNewUserGuideText) obj;
        return o.LJ(this.markText, highlightNewUserGuideText.markText) && o.LJ(this.commonText, highlightNewUserGuideText.commonText);
    }

    public int hashCode() {
        String str = this.markText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.commonText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightNewUserGuideText(markText=");
        LIZ.append(this.markText);
        LIZ.append(", commonText=");
        return q.LIZIZ(LIZ, this.commonText, ')', LIZ);
    }

    public final String getCommonText() {
        return this.commonText;
    }

    public final String getMarkText() {
        return this.markText;
    }

    public HighlightNewUserGuideText(String str, String str2) {
        this.markText = str;
        this.commonText = str2;
    }
}
