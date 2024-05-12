package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C08880Wm;
import X.C1554468e;
import X.C47959Irz;
import X.C5V7;
import X.C6YQ;
import X.C78685UuP;
import X.C79062V1e;
import X.C88517Yob;
import X.EnumC139385dW;
import X.EnumC157656Gr;
import X.InterfaceC65349Pkn;
import X.OSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerModel implements StickerModel, Parcelable {
    public static final Parcelable.Creator<TextStickerModel> CREATOR = new Parcelable.Creator<TextStickerModel>() { // from class: X.5Wy
        @Override // android.os.Parcelable.Creator
        public final TextStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            TTSModel createFromParcel;
            boolean z4;
            o.LJIIIZ(parcel, "parcel");
            BaseStickerModel createFromParcel2 = BaseStickerModel.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            float readFloat = parcel.readFloat();
            TextFontModel createFromParcel3 = TextFontModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            CaptionModel captionModel = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = TTSModel.CREATOR.createFromParcel(parcel);
            }
            TTSModel tTSModel = createFromParcel;
            TextStickerInfo textStickerInfo = (TextStickerInfo) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                captionModel = CaptionModel.CREATOR.createFromParcel(parcel);
            }
            CaptionModel captionModel2 = captionModel;
            EnumC139385dW valueOf = EnumC139385dW.valueOf(parcel.readString());
            TextMobModel createFromParcel4 = TextMobModel.CREATOR.createFromParcel(parcel);
            C5V7 valueOf2 = C5V7.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new TextStickerModel(createFromParcel2, readString, readString2, readInt, readInt2, readInt3, readFloat, createFromParcel3, z, z2, z3, tTSModel, textStickerInfo, captionModel2, valueOf, createFromParcel4, valueOf2, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerModel[] newArray(int i) {
            return new TextStickerModel[i];
        }
    };

    @InterfaceC65349Pkn("align")
    public final int align;

    @InterfaceC65349Pkn("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @InterfaceC65349Pkn("caption_model")
    public CaptionModel captionModel;

    @InterfaceC65349Pkn("clickable")
    public final boolean clickable;

    @InterfaceC65349Pkn("color")
    public final int color;

    @InterfaceC65349Pkn("editable")
    public final boolean editable;

    @InterfaceC65349Pkn("font_model")
    public final TextFontModel fontModel;

    @InterfaceC65349Pkn("guide_type")
    public EnumC139385dW guideType;

    @InterfaceC65349Pkn("is_manual_edited")
    public boolean isManualEdited;

    @InterfaceC65349Pkn("lineSpacingExtra")
    public final float lineSpacingExtra;

    @InterfaceC65349Pkn("mob_model")
    public TextMobModel mobModel;

    @InterfaceC65349Pkn("mode")
    public final int mode;

    @InterfaceC65349Pkn("source")
    public C5V7 sourceType;

    @InterfaceC65349Pkn("text_sticker_info")
    public TextStickerInfo textStickerInfo;

    @InterfaceC65349Pkn("text_str")
    public final String textStr;

    @InterfaceC65349Pkn("tts_model")
    public final TTSModel ttsModel;

    @InterfaceC65349Pkn("uuid")
    public String uuid;

    @InterfaceC65349Pkn("visible")
    public final boolean visible;

    public TextStickerModel() {
        this(null, null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262143, null);
    }

    public static /* synthetic */ TextStickerModel copy$default(TextStickerModel textStickerModel, BaseStickerModel baseStickerModel, String str, String str2, int i, int i2, int i3, float f, TextFontModel textFontModel, boolean z, boolean z2, boolean z3, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, EnumC139385dW enumC139385dW, TextMobModel textMobModel, C5V7 c5v7, boolean z4, int i4, Object obj) {
        int i5 = i;
        String str3 = str2;
        BaseStickerModel baseStickerModel2 = baseStickerModel;
        String str4 = str;
        boolean z5 = z;
        TextFontModel textFontModel2 = textFontModel;
        float f2 = f;
        int i6 = i2;
        int i7 = i3;
        CaptionModel captionModel2 = captionModel;
        TextStickerInfo textStickerInfo2 = textStickerInfo;
        TTSModel tTSModel2 = tTSModel;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        C5V7 c5v72 = c5v7;
        EnumC139385dW enumC139385dW2 = enumC139385dW;
        TextMobModel textMobModel2 = textMobModel;
        if ((i4 & 1) != 0) {
            baseStickerModel2 = textStickerModel.baseStickerModel;
        }
        if ((i4 & 2) != 0) {
            str4 = textStickerModel.uuid;
        }
        if ((i4 & 4) != 0) {
            str3 = textStickerModel.textStr;
        }
        if ((i4 & 8) != 0) {
            i5 = textStickerModel.mode;
        }
        if ((i4 & 16) != 0) {
            i6 = textStickerModel.color;
        }
        if ((i4 & 32) != 0) {
            i7 = textStickerModel.align;
        }
        if ((i4 & 64) != 0) {
            f2 = textStickerModel.lineSpacingExtra;
        }
        if ((i4 & 128) != 0) {
            textFontModel2 = textStickerModel.fontModel;
        }
        if ((i4 & 256) != 0) {
            z5 = textStickerModel.editable;
        }
        if ((i4 & 512) != 0) {
            z6 = textStickerModel.clickable;
        }
        if ((i4 & 1024) != 0) {
            z7 = textStickerModel.visible;
        }
        if ((i4 & 2048) != 0) {
            tTSModel2 = textStickerModel.ttsModel;
        }
        if ((i4 & 4096) != 0) {
            textStickerInfo2 = textStickerModel.textStickerInfo;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            captionModel2 = textStickerModel.captionModel;
        }
        if ((i4 & 16384) != 0) {
            enumC139385dW2 = textStickerModel.guideType;
        }
        if ((32768 & i4) != 0) {
            textMobModel2 = textStickerModel.mobModel;
        }
        if ((65536 & i4) != 0) {
            c5v72 = textStickerModel.sourceType;
        }
        if ((i4 & 131072) != 0) {
            z8 = textStickerModel.isManualEdited;
        }
        int i8 = i7;
        float f3 = f2;
        TextFontModel textFontModel3 = textFontModel2;
        return textStickerModel.copy(baseStickerModel2, str4, str3, i5, i6, i8, f3, textFontModel3, z5, z6, z7, tTSModel2, textStickerInfo2, captionModel2, enumC139385dW2, textMobModel2, c5v72, z8);
    }

    public final TextStickerModel copy(BaseStickerModel baseStickerModel, String str, String textStr, int i, int i2, int i3, float f, TextFontModel fontModel, boolean z, boolean z2, boolean z3, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, EnumC139385dW guideType, TextMobModel mobModel, C5V7 sourceType, boolean z4) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(textStr, "textStr");
        o.LJIIIZ(fontModel, "fontModel");
        o.LJIIIZ(guideType, "guideType");
        o.LJIIIZ(mobModel, "mobModel");
        o.LJIIIZ(sourceType, "sourceType");
        return new TextStickerModel(baseStickerModel, str, textStr, i, i2, i3, f, fontModel, z, z2, z3, tTSModel, textStickerInfo, captionModel, guideType, mobModel, sourceType, z4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerModel)) {
            return false;
        }
        TextStickerModel textStickerModel = (TextStickerModel) obj;
        return o.LJ(this.baseStickerModel, textStickerModel.baseStickerModel) && o.LJ(this.uuid, textStickerModel.uuid) && o.LJ(this.textStr, textStickerModel.textStr) && this.mode == textStickerModel.mode && this.color == textStickerModel.color && this.align == textStickerModel.align && Float.compare(this.lineSpacingExtra, textStickerModel.lineSpacingExtra) == 0 && o.LJ(this.fontModel, textStickerModel.fontModel) && this.editable == textStickerModel.editable && this.clickable == textStickerModel.clickable && this.visible == textStickerModel.visible && o.LJ(this.ttsModel, textStickerModel.ttsModel) && o.LJ(this.textStickerInfo, textStickerModel.textStickerInfo) && o.LJ(this.captionModel, textStickerModel.captionModel) && this.guideType == textStickerModel.guideType && o.LJ(this.mobModel, textStickerModel.mobModel) && this.sourceType == textStickerModel.sourceType && this.isManualEdited == textStickerModel.isManualEdited;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        int i;
        InteractStickerStruct LIZIZ = C1554468e.LIZIZ(this, true);
        if (u.LJIJ(this)) {
            i = 20;
        } else {
            i = 18;
        }
        LIZIZ.setType(i);
        LIZIZ.setIndex(getBaseSticker().getZIndex());
        HashMap hashMap = new HashMap();
        hashMap.put("text_sticker_id", String.valueOf(getBaseSticker().getId()));
        LIZIZ.setAttr(GsonProtectorUtils.toJson(C6YQ.LIZ(), hashMap));
        LIZIZ.setTextInfo(this.textStickerInfo);
        LIZIZ.setTextStruct(this.textStr);
        return LIZIZ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.baseStickerModel.writeToParcel(out, i);
        out.writeString(this.uuid);
        out.writeString(this.textStr);
        out.writeInt(this.mode);
        out.writeInt(this.color);
        out.writeInt(this.align);
        out.writeFloat(this.lineSpacingExtra);
        this.fontModel.writeToParcel(out, i);
        out.writeInt(this.editable ? 1 : 0);
        out.writeInt(this.clickable ? 1 : 0);
        out.writeInt(this.visible ? 1 : 0);
        TTSModel tTSModel = this.ttsModel;
        if (tTSModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            tTSModel.writeToParcel(out, i);
        }
        out.writeSerializable(this.textStickerInfo);
        CaptionModel captionModel = this.captionModel;
        if (captionModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            captionModel.writeToParcel(out, i);
        }
        out.writeString(this.guideType.name());
        this.mobModel.writeToParcel(out, i);
        out.writeString(this.sourceType.name());
        out.writeInt(this.isManualEdited ? 1 : 0);
    }

    public final TextStickerModel deepCopy() {
        TTSModel tTSModel;
        BaseStickerModel copy$default = BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null);
        CaptionModel captionModel = null;
        TextFontModel L = TextFontModel.L(this.fontModel, null, null, null, 0, null, null, false, false, 511);
        TTSModel tTSModel2 = this.ttsModel;
        if (tTSModel2 != null) {
            tTSModel = TTSModel.LIZ(tTSModel2);
        } else {
            tTSModel = null;
        }
        CaptionModel captionModel2 = this.captionModel;
        if (captionModel2 != null) {
            captionModel = new CaptionModel(captionModel2.isEditorProCaption);
        }
        return copy$default(this, copy$default, null, null, 0, 0, 0, 0.0f, L, false, false, false, tTSModel, null, captionModel, null, null, null, false, 251774, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC157656Gr getStickerType() {
        return this.baseStickerModel.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.baseStickerModel.hashCode() * 31;
        String str = this.uuid;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (this.fontModel.hashCode() + C47959Irz.LIZIZ(this.lineSpacingExtra, (((((C79062V1e.LJ(this.textStr, (hashCode4 + hashCode) * 31, 31) + this.mode) * 31) + this.color) * 31) + this.align) * 31, 31)) * 31;
        boolean z = this.editable;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (hashCode5 + i3) * 31;
        boolean z2 = this.clickable;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z3 = this.visible;
        int i7 = z3;
        if (z3 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        TTSModel tTSModel = this.ttsModel;
        if (tTSModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = tTSModel.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        TextStickerInfo textStickerInfo = this.textStickerInfo;
        if (textStickerInfo == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = textStickerInfo.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        CaptionModel captionModel = this.captionModel;
        if (captionModel != null) {
            i = captionModel.hashCode();
        }
        int hashCode6 = (this.sourceType.hashCode() + ((this.mobModel.hashCode() + ((this.guideType.hashCode() + ((i10 + i) * 31)) * 31)) * 31)) * 31;
        if (!this.isManualEdited) {
            i2 = 0;
        }
        return hashCode6 + i2;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        if (C78685UuP.LJJJZ(this.textStr) && (!ujb.o.LJJJJJL(this.textStr))) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextStickerModel(baseStickerModel=");
        sb.append(this.baseStickerModel);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", textStr=");
        sb.append(this.textStr);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", align=");
        sb.append(this.align);
        sb.append(", lineSpacingExtra=");
        sb.append(this.lineSpacingExtra);
        sb.append(", fontModel=");
        sb.append(this.fontModel);
        sb.append(", editable=");
        sb.append(this.editable);
        sb.append(", clickable=");
        sb.append(this.clickable);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", ttsModel=");
        sb.append(this.ttsModel);
        sb.append(", textStickerInfo=");
        sb.append(this.textStickerInfo);
        sb.append(", captionModel=");
        sb.append(this.captionModel);
        sb.append(", guideType=");
        sb.append(this.guideType);
        sb.append(", mobModel=");
        sb.append(this.mobModel);
        sb.append(", sourceType=");
        sb.append(this.sourceType);
        sb.append(", isManualEdited=");
        return C08880Wm.LIZJ(sb, this.isManualEdited, ')');
    }

    public final int getAlign() {
        return this.align;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseSticker() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final CaptionModel getCaptionModel() {
        return this.captionModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final int getColor() {
        return this.color;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final TextFontModel getFontModel() {
        return this.fontModel;
    }

    public final EnumC139385dW getGuideType() {
        return this.guideType;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final TextMobModel getMobModel() {
        return this.mobModel;
    }

    public final int getMode() {
        return this.mode;
    }

    public final C5V7 getSourceType() {
        return this.sourceType;
    }

    public final TextStickerInfo getTextStickerInfo() {
        return this.textStickerInfo;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final TTSModel getTtsModel() {
        return this.ttsModel;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isManualEdited() {
        return this.isManualEdited;
    }

    public final void setCaptionModel(CaptionModel captionModel) {
        this.captionModel = captionModel;
    }

    public final void setGuideType(EnumC139385dW enumC139385dW) {
        o.LJIIIZ(enumC139385dW, "<set-?>");
        this.guideType = enumC139385dW;
    }

    public final void setManualEdited(boolean z) {
        this.isManualEdited = z;
    }

    public final void setMobModel(TextMobModel textMobModel) {
        o.LJIIIZ(textMobModel, "<set-?>");
        this.mobModel = textMobModel;
    }

    public final void setSourceType(C5V7 c5v7) {
        o.LJIIIZ(c5v7, "<set-?>");
        this.sourceType = c5v7;
    }

    public final void setTextStickerInfo(TextStickerInfo textStickerInfo) {
        this.textStickerInfo = textStickerInfo;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(OSZ<Integer, Integer> newMediaSize) {
        o.LJIIIZ(newMediaSize, "newMediaSize");
        return copy$default(this, BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, newMediaSize.getFirst().intValue(), newMediaSize.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -24577, null), null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262142, null);
    }

    public TextStickerModel(BaseStickerModel baseStickerModel, String str, String textStr, int i, int i2, int i3, float f, TextFontModel fontModel, boolean z, boolean z2, boolean z3, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, EnumC139385dW guideType, TextMobModel mobModel, C5V7 sourceType, boolean z4) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(textStr, "textStr");
        o.LJIIIZ(fontModel, "fontModel");
        o.LJIIIZ(guideType, "guideType");
        o.LJIIIZ(mobModel, "mobModel");
        o.LJIIIZ(sourceType, "sourceType");
        this.baseStickerModel = baseStickerModel;
        this.uuid = str;
        this.textStr = textStr;
        this.mode = i;
        this.color = i2;
        this.align = i3;
        this.lineSpacingExtra = f;
        this.fontModel = fontModel;
        this.editable = z;
        this.clickable = z2;
        this.visible = z3;
        this.ttsModel = tTSModel;
        this.textStickerInfo = textStickerInfo;
        this.captionModel = captionModel;
        this.guideType = guideType;
        this.mobModel = mobModel;
        this.sourceType = sourceType;
        this.isManualEdited = z4;
    }

    public /* synthetic */ TextStickerModel(BaseStickerModel baseStickerModel, String str, String str2, int i, int i2, int i3, float f, TextFontModel textFontModel, boolean z, boolean z2, boolean z3, TTSModel tTSModel, TextStickerInfo textStickerInfo, CaptionModel captionModel, EnumC139385dW enumC139385dW, TextMobModel textMobModel, C5V7 c5v7, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null) : baseStickerModel, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 1 : i, (i4 & 16) != 0 ? -1 : i2, (i4 & 32) != 0 ? 2 : i3, (i4 & 64) != 0 ? C88517Yob.LIZ() : f, (i4 & 128) != 0 ? new TextFontModel(null, null, null, null, 0, null, null, false, false, 511, null) : textFontModel, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? false : z2, (i4 & 1024) == 0 ? z3 : true, (i4 & 2048) != 0 ? null : tTSModel, (i4 & 4096) != 0 ? null : textStickerInfo, (i4 & FileUtils.BUFFER_SIZE) != 0 ? null : captionModel, (i4 & 16384) != 0 ? EnumC139385dW.NONE : enumC139385dW, (32768 & i4) != 0 ? new TextMobModel(null, null, null, null, null, null, null, 127, null) : textMobModel, (65536 & i4) != 0 ? C5V7.EDIT : c5v7, (i4 & 131072) != 0 ? false : z4);
    }
}
