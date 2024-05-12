package com.ss.android.ugc.aweme.ecommerce.preloader;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class EcomBizSceneImageConfigModel {

    @InterfaceC65349Pkn("biz_scene")
    public final String bizScene;

    @InterfaceC65349Pkn("border_divider")
    public final Double feBorderDivider;

    @InterfaceC65349Pkn("border_factor")
    public final Double feBorderFactor;

    @InterfaceC65349Pkn("border_radius")
    public final Double feBorderRadius;

    @InterfaceC65349Pkn("height")
    public final Double feHeight;

    @InterfaceC65349Pkn("post_process")
    public final Boolean fePostProcess;

    @InterfaceC65349Pkn("scale_type")
    public final String feScaleType;

    @InterfaceC65349Pkn("width")
    public final Double feWidth;

    @InterfaceC65349Pkn("padding")
    public final String padding;

    @InterfaceC65349Pkn("rgb_565")
    public final Boolean rgb565;

    @InterfaceC65349Pkn("suffix")
    public final String suffix;

    public static /* synthetic */ EcomBizSceneImageConfigModel copy$default(EcomBizSceneImageConfigModel ecomBizSceneImageConfigModel, String str, String str2, Double d, Double d2, Boolean bool, Boolean bool2, String str3, Double d3, Double d4, Double d5, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecomBizSceneImageConfigModel.bizScene;
        }
        if ((i & 2) != 0) {
            str2 = ecomBizSceneImageConfigModel.suffix;
        }
        if ((i & 4) != 0) {
            d = ecomBizSceneImageConfigModel.feWidth;
        }
        if ((i & 8) != 0) {
            d2 = ecomBizSceneImageConfigModel.feHeight;
        }
        if ((i & 16) != 0) {
            bool = ecomBizSceneImageConfigModel.fePostProcess;
        }
        if ((i & 32) != 0) {
            bool2 = ecomBizSceneImageConfigModel.rgb565;
        }
        if ((i & 64) != 0) {
            str3 = ecomBizSceneImageConfigModel.padding;
        }
        if ((i & 128) != 0) {
            d3 = ecomBizSceneImageConfigModel.feBorderRadius;
        }
        if ((i & 256) != 0) {
            d4 = ecomBizSceneImageConfigModel.feBorderFactor;
        }
        if ((i & 512) != 0) {
            d5 = ecomBizSceneImageConfigModel.feBorderDivider;
        }
        if ((i & 1024) != 0) {
            str4 = ecomBizSceneImageConfigModel.feScaleType;
        }
        return ecomBizSceneImageConfigModel.copy(str, str2, d, d2, bool, bool2, str3, d3, d4, d5, str4);
    }

    public final EcomBizSceneImageConfigModel copy(String bizScene, String str, Double d, Double d2, Boolean bool, Boolean bool2, String str2, Double d3, Double d4, Double d5, String str3) {
        o.LJIIIZ(bizScene, "bizScene");
        return new EcomBizSceneImageConfigModel(bizScene, str, d, d2, bool, bool2, str2, d3, d4, d5, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomBizSceneImageConfigModel)) {
            return false;
        }
        EcomBizSceneImageConfigModel ecomBizSceneImageConfigModel = (EcomBizSceneImageConfigModel) obj;
        return o.LJ(this.bizScene, ecomBizSceneImageConfigModel.bizScene) && o.LJ(this.suffix, ecomBizSceneImageConfigModel.suffix) && o.LJ(this.feWidth, ecomBizSceneImageConfigModel.feWidth) && o.LJ(this.feHeight, ecomBizSceneImageConfigModel.feHeight) && o.LJ(this.fePostProcess, ecomBizSceneImageConfigModel.fePostProcess) && o.LJ(this.rgb565, ecomBizSceneImageConfigModel.rgb565) && o.LJ(this.padding, ecomBizSceneImageConfigModel.padding) && o.LJ(this.feBorderRadius, ecomBizSceneImageConfigModel.feBorderRadius) && o.LJ(this.feBorderFactor, ecomBizSceneImageConfigModel.feBorderFactor) && o.LJ(this.feBorderDivider, ecomBizSceneImageConfigModel.feBorderDivider) && o.LJ(this.feScaleType, ecomBizSceneImageConfigModel.feScaleType);
    }

    public int hashCode() {
        int hashCode = this.bizScene.hashCode() * 31;
        String str = this.suffix;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.feWidth;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.feHeight;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.fePostProcess;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.rgb565;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.padding;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.feBorderRadius;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.feBorderFactor;
        int hashCode9 = (hashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.feBorderDivider;
        int hashCode10 = (hashCode9 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str3 = this.feScaleType;
        return hashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EcomBizSceneImageConfigModel(bizScene=");
        sb.append(this.bizScene);
        sb.append(", suffix=");
        sb.append(this.suffix);
        sb.append(", feWidth=");
        sb.append(this.feWidth);
        sb.append(", feHeight=");
        sb.append(this.feHeight);
        sb.append(", fePostProcess=");
        sb.append(this.fePostProcess);
        sb.append(", rgb565=");
        sb.append(this.rgb565);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", feBorderRadius=");
        sb.append(this.feBorderRadius);
        sb.append(", feBorderFactor=");
        sb.append(this.feBorderFactor);
        sb.append(", feBorderDivider=");
        sb.append(this.feBorderDivider);
        sb.append(", feScaleType=");
        return C07670Rv.LIZIZ(sb, this.feScaleType, ')');
    }

    public final String getBizScene() {
        return this.bizScene;
    }

    public final Double getFeBorderDivider() {
        return this.feBorderDivider;
    }

    public final Double getFeBorderFactor() {
        return this.feBorderFactor;
    }

    public final Double getFeBorderRadius() {
        return this.feBorderRadius;
    }

    public final Double getFeHeight() {
        return this.feHeight;
    }

    public final Boolean getFePostProcess() {
        return this.fePostProcess;
    }

    public final String getFeScaleType() {
        return this.feScaleType;
    }

    public final Double getFeWidth() {
        return this.feWidth;
    }

    public final String getPadding() {
        return this.padding;
    }

    public final Boolean getRgb565() {
        return this.rgb565;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public EcomBizSceneImageConfigModel(String bizScene, String str, Double d, Double d2, Boolean bool, Boolean bool2, String str2, Double d3, Double d4, Double d5, String str3) {
        o.LJIIIZ(bizScene, "bizScene");
        this.bizScene = bizScene;
        this.suffix = str;
        this.feWidth = d;
        this.feHeight = d2;
        this.fePostProcess = bool;
        this.rgb565 = bool2;
        this.padding = str2;
        this.feBorderRadius = d3;
        this.feBorderFactor = d4;
        this.feBorderDivider = d5;
        this.feScaleType = str3;
    }

    public /* synthetic */ EcomBizSceneImageConfigModel(String str, String str2, Double d, Double d2, Boolean bool, Boolean bool2, String str3, Double d3, Double d4, Double d5, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, d, d2, bool, bool2, str3, d3, d4, d5, str4);
    }
}
