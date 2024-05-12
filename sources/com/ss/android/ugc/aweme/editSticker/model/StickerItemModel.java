package com.ss.android.ugc.aweme.editSticker.model;

import X.C16880lQ;
import X.C74221TAz;
import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import Y.IDCreatorS47S0000000_2;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class StickerItemModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<StickerItemModel> CREATOR = new IDCreatorS47S0000000_2(1);

    @InterfaceC65349Pkn("is_editorpro_adjust_text_color")
    public String adjustTextColorInEditorPro;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_font")
    public String adjustTextFontInEditorPro;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_paragraph")
    public String adjustTextParagraph;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_position")
    public String adjustTextPositionInEditorPro;

    @InterfaceC65349Pkn("is_editorpro_adjust_text_style")
    public String adjustTextStyleInEditorPro;

    @InterfaceC65349Pkn("challenge_id_loki")
    public String challengeIdLoki;

    @InterfaceC65349Pkn("current_offsetX")
    public float currentOffsetX;

    @InterfaceC65349Pkn("current_offsetY")
    public float currentOffsetY;

    @InterfaceC65349Pkn("cutout")
    public boolean cutout;

    @InterfaceC65349Pkn("deletable")
    public boolean deletable;
    public DrawRect drawRect;

    @InterfaceC65349Pkn("editorpro_tts_tone_id")
    public String editorProTTSID;

    @InterfaceC65349Pkn("enable_pan")
    public boolean enablePan;

    @InterfaceC65349Pkn("enable_rotate")
    public boolean enableRotate;

    @InterfaceC65349Pkn("enable_scale")
    public boolean enableScale;

    @InterfaceC65349Pkn("end_time")
    public int endTime;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("extra2")
    public String extra2;

    @InterfaceC65349Pkn("extra3")
    public String extra3;
    public transient boolean fromSearch;

    @InterfaceC65349Pkn("h")
    public float h;
    public int id;

    @InterfaceC65349Pkn("in_duration")
    public int inDuration;

    @InterfaceC65349Pkn("in_path")
    public String inPath;

    @InterfaceC65349Pkn("in_sticker_id")
    public String inStickerId;

    @InterfaceC65349Pkn("init_height")
    public float initHeight;

    @InterfaceC65349Pkn("init_width")
    public float initWidth;

    @InterfaceC65349Pkn("is_add_veeditor_success")
    public boolean isAddVEEditorSuccess;

    @InterfaceC65349Pkn("isAnimate")
    public boolean isAnimate;

    @InterfaceC65349Pkn("is_animation_loop")
    public boolean isAnimationLoop;

    @InterfaceC65349Pkn("is_dynamic")
    public boolean isDynamicSticker;

    @InterfaceC65349Pkn("is_editorpro_caption")
    public String isEditorProCaption;

    @InterfaceC65349Pkn("is_editorpro_copy_text")
    public String isEditorProCopyText;

    @InterfaceC65349Pkn("is_editorpro_tts")
    public String isEditorProTTS;

    @InterfaceC65349Pkn("is_editorpro_text")
    public String isEditorProText;

    @InterfaceC65349Pkn("is_editorpro_trim_text_length")
    public String isEditorProTrimLength;

    @InterfaceC65349Pkn("is_enable_interaction")
    public boolean isEnableInteraction;
    public boolean isImageStickerLayer;

    @InterfaceC65349Pkn("is_pin")
    public boolean isPin;

    @InterfaceC65349Pkn("layer_weight")
    public int layerWeight;
    public transient String lyricSrtPath;

    @InterfaceC65349Pkn("lyric_color")
    public int mLyricColor;

    @InterfaceC65349Pkn("lyric_fontId")
    public String mLyricFontId;

    @InterfaceC65349Pkn("lyric_fontPath")
    public String mLyricFontPath;

    @InterfaceC65349Pkn("lyric_in_point")
    public int mLyricInPoint;

    @InterfaceC65349Pkn("lyric_info")
    public String mLyricInfo;

    @InterfaceC65349Pkn("lyric_music_loop")
    public boolean mLyricMusicLoop;

    @InterfaceC65349Pkn("lyric_out_point")
    public int mLyricOutPoint;

    @InterfaceC65349Pkn("lyric_start_time")
    public int mLyricStartTime;

    @InterfaceC65349Pkn("max_scale")
    public float maxScale;

    @InterfaceC65349Pkn("min_scale")
    public float minScale;

    @InterfaceC65349Pkn("normalized_height")
    public float normalizedHeight;

    @InterfaceC65349Pkn("normalized_width")
    public float normalizedWidth;
    public int originalEndTime;
    public int originalStartTime;

    @InterfaceC65349Pkn("out_duration")
    public int outDuration;

    @InterfaceC65349Pkn("out_path")
    public String outPath;

    @InterfaceC36436ERs
    @InterfaceC43620HAa
    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("pin_algorithm_file")
    public String pinAlgorithmFile;

    @InterfaceC65349Pkn("provider_effect")
    public String providerEffect;

    @InterfaceC65349Pkn("ratio")
    public float ratio;

    @InterfaceC65349Pkn("angle")
    public float rotateAngle;

    @InterfaceC65349Pkn("scale")
    public float scale;

    @InterfaceC65349Pkn("start_time")
    public int startTime;

    @InterfaceC65349Pkn("stickerDrawScale")
    public float stickerDrawScale;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    @InterfaceC65349Pkn("mob_params")
    public StickerMobParams stickerMobParams;

    @InterfaceC65349Pkn("tab_id")
    public String tabId;
    public int type;

    @InterfaceC65349Pkn("ui_end_time")
    public int uiEndTime;

    @InterfaceC65349Pkn("ui_start_time")
    public int uiStartTime;

    @InterfaceC65349Pkn("uuid")
    public String uuid;
    public transient int viewHash;

    @InterfaceC65349Pkn("w")
    public float w;

    @InterfaceC65349Pkn("x")
    public float x;

    @InterfaceC65349Pkn("y")
    public float y;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StickerItemModel dumpClonedData() {
        StickerItemModel stickerItemModel = new StickerItemModel(this.stickerId, this.path, this.extra, this.layerWeight, this.isAnimate, this.startTime, this.endTime, this.type);
        stickerItemModel.id = this.id;
        stickerItemModel.scale = this.scale;
        stickerItemModel.maxScale = this.maxScale;
        stickerItemModel.minScale = this.minScale;
        stickerItemModel.rotateAngle = this.rotateAngle;
        stickerItemModel.initHeight = this.initHeight;
        stickerItemModel.initWidth = this.initWidth;
        stickerItemModel.currentOffsetX = this.currentOffsetX;
        stickerItemModel.currentOffsetY = this.currentOffsetY;
        stickerItemModel.isAnimate = this.isAnimate;
        stickerItemModel.isImageStickerLayer = this.isImageStickerLayer;
        stickerItemModel.pinAlgorithmFile = this.pinAlgorithmFile;
        stickerItemModel.isPin = this.isPin;
        stickerItemModel.x = this.x;
        stickerItemModel.y = this.y;
        stickerItemModel.w = this.w;
        stickerItemModel.h = this.h;
        stickerItemModel.isAnimationLoop = this.isAnimationLoop;
        stickerItemModel.inStickerId = this.inStickerId;
        stickerItemModel.inPath = this.inPath;
        stickerItemModel.inDuration = this.inDuration;
        stickerItemModel.outPath = this.outPath;
        stickerItemModel.outDuration = this.outDuration;
        stickerItemModel.ratio = this.ratio;
        stickerItemModel.stickerMobParams = this.stickerMobParams;
        stickerItemModel.adjustTextStyleInEditorPro = this.adjustTextStyleInEditorPro;
        stickerItemModel.adjustTextParagraph = this.adjustTextParagraph;
        stickerItemModel.adjustTextFontInEditorPro = this.adjustTextFontInEditorPro;
        stickerItemModel.adjustTextColorInEditorPro = this.adjustTextColorInEditorPro;
        stickerItemModel.adjustTextPositionInEditorPro = this.adjustTextPositionInEditorPro;
        stickerItemModel.isEditorProTrimLength = this.isEditorProTrimLength;
        stickerItemModel.isEditorProText = this.isEditorProText;
        stickerItemModel.isEditorProCopyText = this.isEditorProCopyText;
        stickerItemModel.isEditorProTTS = this.isEditorProTTS;
        stickerItemModel.editorProTTSID = this.editorProTTSID;
        stickerItemModel.isEditorProCaption = this.isEditorProCaption;
        stickerItemModel.isDynamicSticker = this.isDynamicSticker;
        stickerItemModel.drawRect = this.drawRect;
        stickerItemModel.providerEffect = this.providerEffect;
        return stickerItemModel;
    }

    public RectF getDrawRect() {
        DrawRect toRectF = this.drawRect;
        if (toRectF == null) {
            return null;
        }
        DrawRect.Companion.getClass();
        o.LJIIIZ(toRectF, "$this$toRectF");
        return new RectF(toRectF.getLeft(), toRectF.getTop(), toRectF.getRight(), toRectF.getBottom());
    }

    public boolean isAnimTimestampSticker() {
        if (this.type == 14) {
            return true;
        }
        return false;
    }

    public boolean isImageSticker() {
        int i = this.type;
        if (i == 11 || i == 25) {
            return true;
        }
        return false;
    }

    public boolean isLocalHashTagSticker() {
        if (this.type == 13) {
            return true;
        }
        return false;
    }

    public boolean isLyric() {
        int i = this.type;
        if (i == 3 || i == 17) {
            return true;
        }
        return false;
    }

    public boolean isMagnifier() {
        return "MagnifierSticker".equals(this.extra);
    }

    public boolean isMusicShareToStorySticker() {
        if (this.type == 27) {
            return true;
        }
        return false;
    }

    public boolean isNormalInfoSticker() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public boolean isNormalTextSticker() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isNowSmallWindowSticker() {
        if (this.type == 25) {
            return true;
        }
        return false;
    }

    public boolean isSubtitle() {
        if ("subtitle".equals(this.extra) || this.type == 5) {
            return true;
        }
        return false;
    }

    public boolean isSubtitleRule() {
        return "subtitle_rule".equals(this.extra);
    }

    public boolean isTextSticker() {
        int i = this.type;
        if (i == 2 || i == 20) {
            return true;
        }
        return false;
    }

    public boolean isTextTemplateSticker() {
        if (this.type == 23) {
            return true;
        }
        return false;
    }

    public StickerItemModel() {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.w = 1.0f;
        this.h = 1.0f;
        this.ratio = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextPositionInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTrimLength = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProCopyText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTTS = CardStruct.IStatusCode.DEFAULT;
        this.editorProTTSID = "";
        this.isEditorProCaption = CardStruct.IStatusCode.DEFAULT;
        this.providerEffect = "";
        this.enableRotate = true;
        this.enableScale = true;
        this.enablePan = true;
        this.drawRect = new DrawRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final StickerItemModel clone() {
        try {
            return (StickerItemModel) super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int id = getId() * 31;
        String str = this.stickerId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (id + i) * 31;
        String str2 = this.path;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.extra;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerItemModel{id=");
        LIZ.append(getId());
        LIZ.append(", stickerId='");
        Q89.LIZIZ(LIZ, this.stickerId, '\'', ", path='");
        Q89.LIZIZ(LIZ, this.path, '\'', ", extra='");
        Q89.LIZIZ(LIZ, this.extra, '\'', ", scale=");
        LIZ.append(this.scale);
        LIZ.append(", rotateAngle=");
        LIZ.append(this.rotateAngle);
        LIZ.append(", layerWeight=");
        LIZ.append(this.layerWeight);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", initWidth=");
        LIZ.append(this.initWidth);
        LIZ.append(", initHeight=");
        LIZ.append(this.initHeight);
        LIZ.append(", currentOffsetX=");
        LIZ.append(this.currentOffsetX);
        LIZ.append(", currentOffsetY=");
        LIZ.append(this.currentOffsetY);
        LIZ.append(", normalizedWidth=");
        LIZ.append(this.normalizedWidth);
        LIZ.append(", normalizedHeight=");
        return C74221TAz.LIZLLL(LIZ, this.normalizedHeight, '}', LIZ);
    }

    public int getId() {
        return this.id;
    }

    public int getOriginalEndTime() {
        return this.originalEndTime;
    }

    public int getOriginalStartTime() {
        return this.originalStartTime;
    }

    public String getPinAlgorithmFile() {
        return this.pinAlgorithmFile;
    }

    public String getText() {
        return this.path;
    }

    public boolean isFromSearch() {
        return this.fromSearch;
    }

    public boolean isPin() {
        return this.isPin;
    }

    public StickerItemModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.w = 1.0f;
        this.h = 1.0f;
        this.ratio = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextPositionInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTrimLength = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProCopyText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTTS = CardStruct.IStatusCode.DEFAULT;
        this.editorProTTSID = "";
        this.isEditorProCaption = CardStruct.IStatusCode.DEFAULT;
        this.providerEffect = "";
        this.enableRotate = true;
        this.enableScale = true;
        this.enablePan = true;
        this.drawRect = new DrawRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.stickerId = parcel.readString();
        this.path = parcel.readString();
        this.extra = parcel.readString();
        this.extra2 = parcel.readString();
        this.extra3 = parcel.readString();
        this.scale = parcel.readFloat();
        this.stickerDrawScale = parcel.readFloat();
        this.rotateAngle = parcel.readFloat();
        this.layerWeight = parcel.readInt();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.uiStartTime = parcel.readInt();
        this.uiEndTime = parcel.readInt();
        this.initWidth = parcel.readFloat();
        this.initHeight = parcel.readFloat();
        this.currentOffsetX = parcel.readFloat();
        this.currentOffsetY = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimate = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isImageStickerLayer = z2;
        this.type = parcel.readInt();
        this.pinAlgorithmFile = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isPin = z3;
        this.mLyricInfo = parcel.readString();
        this.mLyricFontPath = parcel.readString();
        this.mLyricFontId = parcel.readString();
        this.mLyricColor = parcel.readInt();
        this.mLyricInPoint = parcel.readInt();
        this.mLyricStartTime = parcel.readInt();
        this.mLyricOutPoint = parcel.readInt();
        this.tabId = parcel.readString();
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.w = parcel.readFloat();
        this.h = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.cutout = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.deletable = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isEnableInteraction = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mLyricMusicLoop = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isAnimationLoop = z8;
        this.inStickerId = parcel.readString();
        this.inPath = parcel.readString();
        this.inDuration = parcel.readInt();
        this.outPath = parcel.readString();
        this.outDuration = parcel.readInt();
        this.normalizedWidth = parcel.readFloat();
        this.normalizedHeight = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.isAddVEEditorSuccess = z9;
        this.uuid = parcel.readString();
        this.maxScale = parcel.readFloat();
        this.minScale = parcel.readFloat();
        this.ratio = parcel.readFloat();
        this.stickerMobParams = (StickerMobParams) parcel.readParcelable(getClass().getClassLoader());
        this.adjustTextStyleInEditorPro = parcel.readString();
        this.adjustTextParagraph = parcel.readString();
        this.adjustTextFontInEditorPro = parcel.readString();
        this.adjustTextColorInEditorPro = parcel.readString();
        this.adjustTextPositionInEditorPro = parcel.readString();
        this.isEditorProTrimLength = parcel.readString();
        this.isEditorProText = parcel.readString();
        this.isEditorProCopyText = parcel.readString();
        this.isEditorProTTS = parcel.readString();
        this.editorProTTSID = parcel.readString();
        this.isEditorProCaption = parcel.readString();
        this.isDynamicSticker = parcel.readByte() != 0;
        this.drawRect = (DrawRect) parcel.readParcelable(DrawRect.class.getClassLoader());
        this.providerEffect = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemModel)) {
            return false;
        }
        StickerItemModel stickerItemModel = (StickerItemModel) obj;
        if (!TextUtils.isEmpty(this.uuid) && getId() != 0) {
            if (!TextUtils.equals(this.uuid, stickerItemModel.uuid)) {
                return false;
            }
        } else if (getId() != stickerItemModel.getId()) {
            return false;
        }
        String str = this.path;
        if (str != null && !str.equals(stickerItemModel.path)) {
            return false;
        }
        String str2 = this.stickerId;
        if (str2 != null && !str2.equals(stickerItemModel.stickerId)) {
            return false;
        }
        String str3 = this.extra;
        String str4 = stickerItemModel.extra;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public void setDrawRect(RectF toDrawRect) {
        DrawRect.Companion.getClass();
        o.LJIIIZ(toDrawRect, "$this$toDrawRect");
        this.drawRect = new DrawRect(toDrawRect.left, toDrawRect.bottom, toDrawRect.right, toDrawRect.top);
    }

    public void setFromSearch(boolean z) {
        this.fromSearch = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setOriginalEndTime(int i) {
        this.originalEndTime = i;
    }

    public void setOriginalStartTime(int i) {
        this.originalStartTime = i;
    }

    public void setPin(boolean z) {
        this.isPin = z;
    }

    public void setPinAlgorithmFile(String str) {
        this.pinAlgorithmFile = str;
    }

    public void updateLayerWeight(int i) {
        this.layerWeight = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeString(this.extra);
        parcel.writeString(this.extra2);
        parcel.writeString(this.extra3);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.stickerDrawScale);
        parcel.writeFloat(this.rotateAngle);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        parcel.writeFloat(this.initWidth);
        parcel.writeFloat(this.initHeight);
        parcel.writeFloat(this.currentOffsetX);
        parcel.writeFloat(this.currentOffsetY);
        parcel.writeByte(this.isAnimate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isImageStickerLayer ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.type);
        parcel.writeString(this.pinAlgorithmFile);
        parcel.writeByte(this.isPin ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mLyricInfo);
        parcel.writeString(this.mLyricFontPath);
        parcel.writeString(this.mLyricFontId);
        parcel.writeInt(this.mLyricColor);
        parcel.writeInt(this.mLyricInPoint);
        parcel.writeInt(this.mLyricStartTime);
        parcel.writeInt(this.mLyricOutPoint);
        parcel.writeString(this.tabId);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.w);
        parcel.writeFloat(this.h);
        parcel.writeByte(this.cutout ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deletable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEnableInteraction ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mLyricMusicLoop ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAnimationLoop ? (byte) 1 : (byte) 0);
        parcel.writeString(this.inStickerId);
        parcel.writeString(this.inPath);
        parcel.writeInt(this.inDuration);
        parcel.writeString(this.outPath);
        parcel.writeInt(this.outDuration);
        parcel.writeFloat(this.normalizedWidth);
        parcel.writeFloat(this.normalizedHeight);
        parcel.writeByte(this.isAddVEEditorSuccess ? (byte) 1 : (byte) 0);
        parcel.writeString(this.uuid);
        parcel.writeFloat(this.maxScale);
        parcel.writeFloat(this.minScale);
        parcel.writeFloat(this.ratio);
        parcel.writeParcelable(this.stickerMobParams, i);
        parcel.writeString(this.adjustTextStyleInEditorPro);
        parcel.writeString(this.adjustTextParagraph);
        parcel.writeString(this.adjustTextFontInEditorPro);
        parcel.writeString(this.adjustTextColorInEditorPro);
        parcel.writeString(this.adjustTextPositionInEditorPro);
        parcel.writeString(this.isEditorProTrimLength);
        parcel.writeString(this.isEditorProText);
        parcel.writeString(this.isEditorProCopyText);
        parcel.writeString(this.isEditorProTTS);
        parcel.writeString(this.editorProTTSID);
        parcel.writeString(this.isEditorProCaption);
        parcel.writeByte(this.isDynamicSticker ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.drawRect, i);
        parcel.writeString(this.providerEffect);
    }

    public StickerItemModel(String str, String str2, String str3, int i, boolean z, int i2, int i3, int i4) {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.w = 1.0f;
        this.h = 1.0f;
        this.ratio = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.adjustTextStyleInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextParagraph = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextFontInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextColorInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.adjustTextPositionInEditorPro = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTrimLength = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProCopyText = CardStruct.IStatusCode.DEFAULT;
        this.isEditorProTTS = CardStruct.IStatusCode.DEFAULT;
        this.editorProTTSID = "";
        this.isEditorProCaption = CardStruct.IStatusCode.DEFAULT;
        this.providerEffect = "";
        this.enableRotate = true;
        this.enableScale = true;
        this.enablePan = true;
        this.drawRect = new DrawRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.stickerId = str;
        this.path = str2;
        this.extra = str3;
        this.layerWeight = i;
        this.isAnimate = z;
        this.startTime = i2;
        this.endTime = i3;
        this.type = i4;
    }
}
