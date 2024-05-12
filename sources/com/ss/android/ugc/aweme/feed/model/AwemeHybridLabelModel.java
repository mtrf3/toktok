package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AwemeHybridLabelModel implements Serializable {

    @InterfaceC65349Pkn("background_color")
    public String backgroundColor;

    @InterfaceC65349Pkn("image")
    public UrlModel imageUrl;

    @InterfaceC65349Pkn("label_type")
    public int labelType;

    @InterfaceC65349Pkn("ref_url")
    public String refUrl;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("text_color")
    public String textColor;

    public AwemeHybridLabelModel() {
    }

    public static /* synthetic */ AwemeHybridLabelModel copy$default(AwemeHybridLabelModel awemeHybridLabelModel, String str, String str2, String str3, UrlModel urlModel, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeHybridLabelModel.backgroundColor;
        }
        if ((i2 & 2) != 0) {
            str2 = awemeHybridLabelModel.text;
        }
        if ((i2 & 4) != 0) {
            str3 = awemeHybridLabelModel.textColor;
        }
        if ((i2 & 8) != 0) {
            urlModel = awemeHybridLabelModel.imageUrl;
        }
        if ((i2 & 16) != 0) {
            str4 = awemeHybridLabelModel.refUrl;
        }
        if ((i2 & 32) != 0) {
            i = awemeHybridLabelModel.labelType;
        }
        return awemeHybridLabelModel.copy(str, str2, str3, urlModel, str4, i);
    }

    public final AwemeHybridLabelModel copy(String str, String str2, String str3, UrlModel urlModel, String str4, int i) {
        return new AwemeHybridLabelModel(str, str2, str3, urlModel, str4, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeHybridLabelModel)) {
            return false;
        }
        AwemeHybridLabelModel awemeHybridLabelModel = (AwemeHybridLabelModel) obj;
        return o.LJ(this.backgroundColor, awemeHybridLabelModel.backgroundColor) && o.LJ(this.text, awemeHybridLabelModel.text) && o.LJ(this.textColor, awemeHybridLabelModel.textColor) && o.LJ(this.imageUrl, awemeHybridLabelModel.imageUrl) && o.LJ(this.refUrl, awemeHybridLabelModel.refUrl) && this.labelType == awemeHybridLabelModel.labelType;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.imageUrl;
        int hashCode4 = (hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.refUrl;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.labelType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeHybridLabelModel(backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", imageUrl=");
        LIZ.append(this.imageUrl);
        LIZ.append(", refUrl=");
        LIZ.append(this.refUrl);
        LIZ.append(", labelType=");
        return b0.LIZJ(LIZ, this.labelType, ')', LIZ);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final int getLabelType() {
        return this.labelType;
    }

    public final String getRefUrl() {
        return this.refUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public final void setLabelType(int i) {
        this.labelType = i;
    }

    public final void setRefUrl(String str) {
        this.refUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public AwemeHybridLabelModel(String str, String str2, String str3, UrlModel urlModel, String str4, int i) {
        this.backgroundColor = str;
        this.text = str2;
        this.textColor = str3;
        this.imageUrl = urlModel;
        this.refUrl = str4;
        this.labelType = i;
    }

    public /* synthetic */ AwemeHybridLabelModel(String str, String str2, String str3, UrlModel urlModel, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, urlModel, str4, (i2 & 32) != 0 ? HybridLabelTagType.UNKNOWN.getValue() : i);
    }
}
