package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IndicatorData implements Serializable {

    @InterfaceC65349Pkn("box_url")
    public final AwemeUrl boxUrl;

    @InterfaceC65349Pkn("conversion_area")
    public final NewButtonInfo conversionArea;

    @InterfaceC65349Pkn("indicator_icon")
    public final UrlModel indicatorIcon;

    @InterfaceC65349Pkn("indicator_start_box")
    public final BoxData indicatorStartBox;

    /* JADX WARN: Multi-variable type inference failed */
    public IndicatorData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IndicatorData copy$default(IndicatorData indicatorData, UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = indicatorData.indicatorIcon;
        }
        if ((i & 2) != 0) {
            boxData = indicatorData.indicatorStartBox;
        }
        if ((i & 4) != 0) {
            awemeUrl = indicatorData.boxUrl;
        }
        if ((i & 8) != 0) {
            newButtonInfo = indicatorData.conversionArea;
        }
        return indicatorData.copy(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    public final IndicatorData copy(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        return new IndicatorData(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorData)) {
            return false;
        }
        IndicatorData indicatorData = (IndicatorData) obj;
        return o.LJ(this.indicatorIcon, indicatorData.indicatorIcon) && o.LJ(this.indicatorStartBox, indicatorData.indicatorStartBox) && o.LJ(this.boxUrl, indicatorData.boxUrl) && o.LJ(this.conversionArea, indicatorData.conversionArea);
    }

    public int hashCode() {
        UrlModel urlModel = this.indicatorIcon;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        BoxData boxData = this.indicatorStartBox;
        int hashCode2 = (hashCode + (boxData == null ? 0 : boxData.hashCode())) * 31;
        AwemeUrl awemeUrl = this.boxUrl;
        int hashCode3 = (hashCode2 + (awemeUrl == null ? 0 : awemeUrl.hashCode())) * 31;
        NewButtonInfo newButtonInfo = this.conversionArea;
        return hashCode3 + (newButtonInfo != null ? newButtonInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IndicatorData(indicatorIcon=");
        LIZ.append(this.indicatorIcon);
        LIZ.append(", indicatorStartBox=");
        LIZ.append(this.indicatorStartBox);
        LIZ.append(", boxUrl=");
        LIZ.append(this.boxUrl);
        LIZ.append(", conversionArea=");
        LIZ.append(this.conversionArea);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AwemeUrl getBoxUrl() {
        return this.boxUrl;
    }

    public final NewButtonInfo getConversionArea() {
        return this.conversionArea;
    }

    public final UrlModel getIndicatorIcon() {
        return this.indicatorIcon;
    }

    public final BoxData getIndicatorStartBox() {
        return this.indicatorStartBox;
    }

    public IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        this.indicatorIcon = urlModel;
        this.indicatorStartBox = boxData;
        this.boxUrl = awemeUrl;
        this.conversionArea = newButtonInfo;
    }

    public /* synthetic */ IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : boxData, (i & 4) != 0 ? null : awemeUrl, (i & 8) != 0 ? null : newButtonInfo);
    }
}
