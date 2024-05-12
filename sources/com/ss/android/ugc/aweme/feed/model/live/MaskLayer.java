package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MaskLayer implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("mask_layer_type")
    public int maskLayerType;

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punish_info;

    @InterfaceC65349Pkn("sub_title")
    public Text subTitle;

    @InterfaceC65349Pkn("title")
    public Text title;

    /* JADX WARN: Multi-variable type inference failed */
    public MaskLayer() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MaskLayer copy$default(MaskLayer maskLayer, Text text, Text text2, int i, PunishEventInfo punishEventInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            text = maskLayer.title;
        }
        if ((i2 & 2) != 0) {
            text2 = maskLayer.subTitle;
        }
        if ((i2 & 4) != 0) {
            i = maskLayer.maskLayerType;
        }
        if ((i2 & 8) != 0) {
            punishEventInfo = maskLayer.punish_info;
        }
        return maskLayer.copy(text, text2, i, punishEventInfo);
    }

    public final MaskLayer copy(Text text, Text text2, int i, PunishEventInfo punishEventInfo) {
        return new MaskLayer(text, text2, i, punishEventInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskLayer)) {
            return false;
        }
        MaskLayer maskLayer = (MaskLayer) obj;
        return o.LJ(this.title, maskLayer.title) && o.LJ(this.subTitle, maskLayer.subTitle) && this.maskLayerType == maskLayer.maskLayerType && o.LJ(this.punish_info, maskLayer.punish_info);
    }

    public int hashCode() {
        Text text = this.title;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.subTitle;
        int hashCode2 = (((hashCode + (text2 == null ? 0 : text2.hashCode())) * 31) + this.maskLayerType) * 31;
        PunishEventInfo punishEventInfo = this.punish_info;
        return hashCode2 + (punishEventInfo != null ? punishEventInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaskLayer(title=");
        LIZ.append(this.title);
        LIZ.append(", subTitle=");
        LIZ.append(this.subTitle);
        LIZ.append(", maskLayerType=");
        LIZ.append(this.maskLayerType);
        LIZ.append(", punish_info=");
        LIZ.append(this.punish_info);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean isR2OrUnknownMask() {
        int i = this.maskLayerType;
        if (i == 1 || i == 0) {
            return true;
        }
        return false;
    }

    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final int getMaskLayerType() {
        return this.maskLayerType;
    }

    public final PunishEventInfo getPunish_info() {
        return this.punish_info;
    }

    public final Text getSubTitle() {
        return this.subTitle;
    }

    public final Text getTitle() {
        return this.title;
    }

    public final void setMaskLayerType(int i) {
        this.maskLayerType = i;
    }

    public final void setPunish_info(PunishEventInfo punishEventInfo) {
        this.punish_info = punishEventInfo;
    }

    public final void setSubTitle(Text text) {
        this.subTitle = text;
    }

    public final void setTitle(Text text) {
        this.title = text;
    }

    public MaskLayer(Text text, Text text2, int i, PunishEventInfo punishEventInfo) {
        this.title = text;
        this.subTitle = text2;
        this.maskLayerType = i;
        this.punish_info = punishEventInfo;
    }

    public /* synthetic */ MaskLayer(Text text, Text text2, int i, PunishEventInfo punishEventInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : text, (i2 & 2) != 0 ? null : text2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : punishEventInfo);
    }
}
