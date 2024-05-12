package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.InterfaceC57784Mm4;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightNewUserGuide implements Serializable, InterfaceC57784Mm4 {

    @InterfaceC65349Pkn("guide_text")
    public final HighlightNewUserGuideText guideText;

    @InterfaceC65349Pkn("image_dark_url")
    public final String imageDarkUrl;

    @InterfaceC65349Pkn("image_url")
    public final String imageUrl;

    public static /* synthetic */ HighlightNewUserGuide copy$default(HighlightNewUserGuide highlightNewUserGuide, String str, String str2, HighlightNewUserGuideText highlightNewUserGuideText, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightNewUserGuide.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = highlightNewUserGuide.imageDarkUrl;
        }
        if ((i & 4) != 0) {
            highlightNewUserGuideText = highlightNewUserGuide.guideText;
        }
        return highlightNewUserGuide.copy(str, str2, highlightNewUserGuideText);
    }

    public final HighlightNewUserGuide copy(String str, String str2, HighlightNewUserGuideText highlightNewUserGuideText) {
        return new HighlightNewUserGuide(str, str2, highlightNewUserGuideText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightNewUserGuide)) {
            return false;
        }
        HighlightNewUserGuide highlightNewUserGuide = (HighlightNewUserGuide) obj;
        return o.LJ(this.imageUrl, highlightNewUserGuide.imageUrl) && o.LJ(this.imageDarkUrl, highlightNewUserGuide.imageDarkUrl) && o.LJ(this.guideText, highlightNewUserGuide.guideText);
    }

    public int hashCode() {
        String str = this.imageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageDarkUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HighlightNewUserGuideText highlightNewUserGuideText = this.guideText;
        return hashCode2 + (highlightNewUserGuideText != null ? highlightNewUserGuideText.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightNewUserGuide(imageUrl=");
        LIZ.append(this.imageUrl);
        LIZ.append(", imageDarkUrl=");
        LIZ.append(this.imageDarkUrl);
        LIZ.append(", guideText=");
        LIZ.append(this.guideText);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final HighlightNewUserGuideText getGuideText() {
        return this.guideText;
    }

    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }

    public HighlightNewUserGuide(String str, String str2, HighlightNewUserGuideText highlightNewUserGuideText) {
        this.imageUrl = str;
        this.imageDarkUrl = str2;
        this.guideText = highlightNewUserGuideText;
    }
}
