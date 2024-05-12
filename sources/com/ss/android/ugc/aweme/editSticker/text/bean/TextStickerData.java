package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C16880lQ;
import X.C68M;
import X.InterfaceC137125Zs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.U26;
import X.UC7;
import X.X1D;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerData implements Parcelable, Cloneable, InterfaceC137125Zs {
    public static final Parcelable.Creator<TextStickerData> CREATOR = new Parcelable.Creator<TextStickerData>() { // from class: X.5YY
        @Override // android.os.Parcelable.Creator
        public final TextStickerData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            InnerEffectTextLayoutConfig createFromParcel;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            Point point = (Point) parcel.readParcelable(TextStickerData.class.getClassLoader());
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            long readLong = parcel.readLong();
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
            TextStickerData.Pair pair = (TextStickerData.Pair) parcel.readSerializable();
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int readInt8 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt9 = parcel.readInt();
            String readString7 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt10 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            TextStickerTextWrap createFromParcel2 = TextStickerTextWrap.CREATOR.createFromParcel(parcel);
            int readInt11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt11);
            int i = 0;
            while (i != readInt11) {
                i = C279117r.LIZIZ(TextStickerTextWrap.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = InnerEffectTextLayoutConfig.CREATOR.createFromParcel(parcel);
            }
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = createFromParcel;
            TextStickerCoverExtraData createFromParcel3 = TextStickerCoverExtraData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            float readFloat5 = parcel.readFloat();
            float readFloat6 = parcel.readFloat();
            int readInt12 = parcel.readInt();
            int readInt13 = parcel.readInt();
            int readInt14 = parcel.readInt();
            int readInt15 = parcel.readInt();
            float readFloat7 = parcel.readFloat();
            TTSVoiceModel tTSVoiceModel = (TTSVoiceModel) parcel.readParcelable(TextStickerData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String readString18 = parcel.readString();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            int readInt16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt16);
            int i2 = 0;
            while (i2 != readInt16) {
                i2 = C5YW.LIZ(TextStickerData.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            int readInt17 = parcel.readInt();
            int readInt18 = parcel.readInt();
            TTSAudioBean tTSAudioBean = (TTSAudioBean) parcel.readParcelable(TextStickerData.class.getClassLoader());
            int readInt19 = parcel.readInt();
            int readInt20 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt20);
            for (int i3 = 0; i3 != readInt20; i3++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new TextStickerData(readString, readInt, readInt2, readInt3, readString2, point, readInt4, readInt5, readInt6, readInt7, readFloat, readFloat2, readLong, z, z2, z3, pair, readFloat3, readFloat4, z4, z5, z6, readInt8, readString3, readString4, readString5, readString6, readInt9, readString7, createStringArrayList, readInt10, createStringArray, createFromParcel2, arrayList, innerEffectTextLayoutConfig, createFromParcel3, z7, z8, readString8, readString9, readString10, readFloat5, readFloat6, readInt12, readInt13, readInt14, readInt15, readFloat7, tTSVoiceModel, z9, readString11, readString12, readString13, readString14, readString15, readString16, readString17, z10, readString18, readLong2, readLong3, createStringArrayList2, readString19, readString20, readString21, readString22, readString23, readString24, readString25, z11, readString26, readString27, readString28, readString29, arrayList2, z12, z13, z14, z15, readInt17, readInt18, tTSAudioBean, readInt19, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerData[] newArray(int i) {
            return new TextStickerData[i];
        }
    };

    @InterfaceC65349Pkn("font_type")
    public String _fontType;
    public boolean addToLayout;
    public boolean addToLayoutInPreviewOrCover;

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

    @InterfaceC65349Pkn("align")
    public int align;
    public Pair<Float, Boolean> alpha;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audio_path_list")
    public List<String> audioPathList;

    @InterfaceC65349Pkn("old_text")
    public String audioText;

    @InterfaceC65349Pkn("audio_track_duration")
    public int audioTrackDuration;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audio_track_file_path")
    public String audioTrackFilePath;

    @InterfaceC65349Pkn("audio_track_index")
    public int audioTrackIndex;

    @InterfaceC65349Pkn("auto_add_tts_flag")
    public boolean autoAddTtsFlag;
    public boolean autoSelect;

    @InterfaceC65349Pkn("bg_mode")
    public int bgMode;

    @InterfaceC65349Pkn("canvas_height")
    public int canvasHeight;

    @InterfaceC65349Pkn("canvas_width")
    public int canvasWidth;
    public boolean captionOnlyShowDeleteBubble;

    @InterfaceC65349Pkn("color")
    public int color;

    @InterfaceC65349Pkn("cover_extra_data")
    public TextStickerCoverExtraData coverExtraData;

    @InterfaceC65349Pkn("edit_center_point")
    public Point editCenterPoint;
    public long editInEPDuration;

    @InterfaceC65349Pkn("editorpro_tts_tone_id")
    public String editorProTTSID;

    @InterfaceC65349Pkn("effect_text_layout_config")
    public InnerEffectTextLayoutConfig effectTextLayoutConfig;

    @InterfaceC65349Pkn("mEndTime")
    public int endTime;

    @InterfaceC65349Pkn("font_id")
    public String fontId;

    @InterfaceC65349Pkn("font_path")
    public String fontPath;

    @InterfaceC65349Pkn("font_res_id")
    public String fontResId;
    public int fontSize;

    @InterfaceC65349Pkn("guidance_with_default_text")
    public boolean guidanceWithDefaultText;

    @InterfaceC65349Pkn("has_changed_font_size")
    public boolean hasChangedFontSize;

    @InterfaceC65349Pkn("has_read_text_audio")
    public boolean hasReadTextAudio;

    @InterfaceC65349Pkn("id_for_new_engine")
    public int idInNewEngine;

    @InterfaceC65349Pkn("inline_text_styles")
    public List<? extends InlineRichTextStyleData> inlineTextStyles;

    @InterfaceC65349Pkn("is_actionai_text")
    public boolean isActionAIText;

    @InterfaceC65349Pkn("is_adjust_text_roll_bar")
    public boolean isAdjustTextRollbar;

    @InterfaceC65349Pkn("is_creator")
    public boolean isCreatorVoice;

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

    @InterfaceC65349Pkn("is_guidance_sticker")
    public boolean isGuidanceSticker;

    @InterfaceC65349Pkn("is_use_auto_text_size")
    public boolean isUseAutoTextSize;

    @InterfaceC65349Pkn("is_use_text_color_dropper")
    public boolean isUseColorDropper;

    @InterfaceC65349Pkn("layout_height")
    public float layoutHeight;

    @InterfaceC65349Pkn("layout_width")
    public float layoutWidth;

    @InterfaceC65349Pkn("lineSpacingExtra")
    public float lineSpacingExtra;

    @InterfaceC65349Pkn("nle_uuid")
    public String nleUuid;

    @InterfaceC65349Pkn("editor_pro_mapping_id")
    public String placeholderSlotId;

    @InterfaceC65349Pkn("r")
    public float rotation;

    @InterfaceC65349Pkn("s")
    public float scale;
    public boolean showOnScreen;

    @InterfaceC65349Pkn("speaker_id")
    public String speakerID;

    @InterfaceC65349Pkn("speaker_name")
    public String speakerName;

    @InterfaceC65349Pkn("mStartTime")
    public int startTime;

    @InterfaceC65349Pkn("editorpro_text_slot_add_order")
    public int textSlotAddOrder;

    @InterfaceC65349Pkn("editorpro_text_slot_track_order")
    public int textSlotTrackOrder;

    @InterfaceC65349Pkn("text_str")
    public String textStr;

    @InterfaceC65349Pkn("text_str_ary")
    public String[] textStrAry;

    @InterfaceC65349Pkn("text_str_wrap")
    public TextStickerTextWrap textWrap;

    @InterfaceC65349Pkn("text_str_wrap_list")
    public List<TextStickerTextWrap> textWrapList;

    @InterfaceC65349Pkn("tts_anchor_release_date")
    public long ttsAnchorReleaseDate;

    @InterfaceC65349Pkn("tts_audio_bean")
    public TTSAudioBean ttsAudioBean;

    @InterfaceC65349Pkn("tts_extra")
    public final Map<String, String> ttsExtraMap;

    @InterfaceC65349Pkn("tts_hash_tag_ids")
    public List<String> ttsHashTagIds;

    @InterfaceC65349Pkn("tts_release_date")
    public long ttsReleaseDate;

    @InterfaceC65349Pkn("tts_voice_model")
    public TTSVoiceModel ttsVoiceModel;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("mUIEndTime")
    public int uiEndTime;

    @InterfaceC65349Pkn("mUIStartTime")
    public int uiStartTime;

    @InterfaceC65349Pkn("video_height")
    public int videoHeight;

    @InterfaceC65349Pkn("video_width")
    public int videoWidth;

    @InterfaceC65349Pkn("voice_anchor_name")
    public String voiceAnchorName;

    @InterfaceC65349Pkn("creator_user_id")
    public String voiceCreatorUserId;

    @InterfaceC65349Pkn("creator_user_name")
    public String voiceCreatorUserName;

    @InterfaceC65349Pkn("voice_effect_icon_url")
    public String voiceEffectIconUrl;

    @InterfaceC65349Pkn("voice_effect_id")
    public String voiceEffectId;

    @InterfaceC65349Pkn("voice_effect_resource_id")
    public String voiceEffectResourceId;
    public float x;
    public float y;

    public TextStickerData() {
        this(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null);
    }

    public TextStickerData(String str) {
        this(str, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -2, -1, 1048575, null);
    }

    public TextStickerData(String str, int i) {
        this(str, i, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -4, -1, 1048575, null);
    }

    public TextStickerData(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -8, -1, 1048575, null);
    }

    public TextStickerData(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -16, -1, 1048575, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this(str, i, i2, i3, str2, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32, -1, 1048575, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint) {
        this(str, i, i2, i3, str2, editCenterPoint, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -64, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -128, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -256, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -512, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1024, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -2048, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -4096, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -8192, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -16384, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -32768, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -65536, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -131072, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -262144, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -524288, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1048576, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -2097152, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -4194304, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -8388608, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -16777216, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -33554432, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -67108864, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -134217728, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -268435456, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -536870912, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    public static /* synthetic */ void getTextStrAry$annotations() {
    }

    public static /* synthetic */ void getTextWrap$annotations() {
    }

    public static /* synthetic */ void get_fontType$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes16.dex */
    public static final class Pair<A, B> implements Serializable {

        @InterfaceC65349Pkn(alternate = {"LIZIZ"}, value = "first")
        public final A first;

        @InterfaceC65349Pkn(alternate = {"LIZ"}, value = "second")
        public final B second;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = pair.first;
            }
            if ((i & 2) != 0) {
                obj2 = pair.second;
            }
            return pair.copy(obj, obj2);
        }

        public final Pair<A, B> copy(A a, B b) {
            return new Pair<>(a, b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pair)) {
                return false;
            }
            Pair pair = (Pair) obj;
            return o.LJ(this.first, pair.first) && o.LJ(this.second, pair.second);
        }

        public int hashCode() {
            A a = this.first;
            int hashCode = (a == null ? 0 : a.hashCode()) * 31;
            B b = this.second;
            return hashCode + (b != null ? b.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Pair(first=");
            LIZ.append(this.first);
            LIZ.append(", second=");
            return U26.LIZJ(LIZ, this.second, ')', LIZ);
        }

        public final A getFirst() {
            return this.first;
        }

        public final B getSecond() {
            return this.second;
        }

        public Pair(A a, B b) {
            this.first = a;
            this.second = b;
        }
    }

    public final boolean hasPositionData() {
        boolean z;
        if (this.scale == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean hasTimeData() {
        if (this.endTime != 0) {
            return true;
        }
        return false;
    }

    public final boolean isAICaption() {
        return o.LJ(this.type, "type_ai_caption");
    }

    public final boolean isCaption() {
        return o.LJ(this.type, "type_inline_caption");
    }

    public final boolean isTextSticker() {
        return o.LJ(this.type, "type_text_sticker");
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextStickerData m110clone() {
        try {
            Object clone = super.clone();
            o.LJII(clone, "null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData");
            return (TextStickerData) clone;
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null);
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("textStr: ");
        LIZ.append(this.textStr);
        LIZ.append(", bgMode: ");
        LIZ.append(this.bgMode);
        LIZ.append(", color: ");
        LIZ.append(this.color);
        LIZ.append(", align: ");
        LIZ.append(this.align);
        LIZ.append(", fontType: ");
        LIZ.append(this._fontType);
        LIZ.append(", centerPoint: ");
        LIZ.append(this.editCenterPoint);
        LIZ.append(", fontSize: ");
        LIZ.append(this.fontSize);
        LIZ.append(", position: (");
        LIZ.append(this.x);
        LIZ.append(", ");
        LIZ.append(this.y);
        LIZ.append("), scale: ");
        LIZ.append(this.scale);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean getAddToLayout() {
        return this.addToLayout;
    }

    public final boolean getAddToLayoutInPreviewOrCover() {
        return this.addToLayoutInPreviewOrCover;
    }

    public final String getAdjustTextColorInEditorPro() {
        return this.adjustTextColorInEditorPro;
    }

    public final String getAdjustTextFontInEditorPro() {
        return this.adjustTextFontInEditorPro;
    }

    public final String getAdjustTextParagraph() {
        return this.adjustTextParagraph;
    }

    public final String getAdjustTextPositionInEditorPro() {
        return this.adjustTextPositionInEditorPro;
    }

    public final String getAdjustTextStyleInEditorPro() {
        return this.adjustTextStyleInEditorPro;
    }

    public final int getAlign() {
        return this.align;
    }

    public final Pair<Float, Boolean> getAlpha() {
        return this.alpha;
    }

    public final List<String> getAudioPathList() {
        return this.audioPathList;
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getAutoAddTtsFlag() {
        return this.autoAddTtsFlag;
    }

    public final boolean getAutoSelect() {
        return this.autoSelect;
    }

    public final int getBgMode() {
        return this.bgMode;
    }

    public final int getCanvasHeight() {
        return this.canvasHeight;
    }

    public final int getCanvasWidth() {
        return this.canvasWidth;
    }

    public final boolean getCaptionOnlyShowDeleteBubble() {
        return this.captionOnlyShowDeleteBubble;
    }

    public final int getColor() {
        return this.color;
    }

    public final TextStickerCoverExtraData getCoverExtraData() {
        return this.coverExtraData;
    }

    public final Point getEditCenterPoint() {
        return this.editCenterPoint;
    }

    public final long getEditInEPDuration() {
        return this.editInEPDuration;
    }

    public final String getEditorProTTSID() {
        return this.editorProTTSID;
    }

    public final InnerEffectTextLayoutConfig getEffectTextLayoutConfig() {
        return this.effectTextLayoutConfig;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getFontId() {
        return this.fontId;
    }

    public final String getFontPath() {
        return this.fontPath;
    }

    public final String getFontResId() {
        return this.fontResId;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getFontType() {
        return this._fontType;
    }

    public final boolean getGuidanceWithDefaultText() {
        return this.guidanceWithDefaultText;
    }

    public final boolean getHasChangedFontSize() {
        return this.hasChangedFontSize;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final int getIdInNewEngine() {
        return this.idInNewEngine;
    }

    public final List<InlineRichTextStyleData> getInlineTextStyles() {
        return this.inlineTextStyles;
    }

    public final float getLayoutHeight() {
        return this.layoutHeight;
    }

    public final float getLayoutWidth() {
        return this.layoutWidth;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final String getNleUuid() {
        return this.nleUuid;
    }

    public final String getPlaceholderSlotId() {
        return this.placeholderSlotId;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final boolean getShowOnScreen() {
        return this.showOnScreen;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    public final String getSpeakerName() {
        return this.speakerName;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getTextSlotAddOrder() {
        return this.textSlotAddOrder;
    }

    public final int getTextSlotTrackOrder() {
        return this.textSlotTrackOrder;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final List<TextStickerTextWrap> getTextWrapList() {
        return this.textWrapList;
    }

    public final long getTtsAnchorReleaseDate() {
        return this.ttsAnchorReleaseDate;
    }

    public final TTSAudioBean getTtsAudioBean() {
        return this.ttsAudioBean;
    }

    public final Map<String, String> getTtsExtraMap() {
        return this.ttsExtraMap;
    }

    public final List<String> getTtsHashTagIds() {
        return this.ttsHashTagIds;
    }

    public final long getTtsReleaseDate() {
        return this.ttsReleaseDate;
    }

    public final TTSVoiceModel getTtsVoiceModel() {
        return this.ttsVoiceModel;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUiEndTime() {
        return this.uiEndTime;
    }

    public final int getUiStartTime() {
        return this.uiStartTime;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final String getVoiceAnchorName() {
        return this.voiceAnchorName;
    }

    public final String getVoiceCreatorUserId() {
        return this.voiceCreatorUserId;
    }

    public final String getVoiceCreatorUserName() {
        return this.voiceCreatorUserName;
    }

    public final String getVoiceEffectIconUrl() {
        return this.voiceEffectIconUrl;
    }

    public final String getVoiceEffectId() {
        return this.voiceEffectId;
    }

    public final String getVoiceEffectResourceId() {
        return this.voiceEffectResourceId;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final boolean isActionAIText() {
        return this.isActionAIText;
    }

    public final boolean isAdjustTextRollbar() {
        return this.isAdjustTextRollbar;
    }

    public final boolean isCreatorVoice() {
        return this.isCreatorVoice;
    }

    public final String isEditorProCaption() {
        return this.isEditorProCaption;
    }

    public final String isEditorProCopyText() {
        return this.isEditorProCopyText;
    }

    public final String isEditorProTTS() {
        return this.isEditorProTTS;
    }

    public final String isEditorProText() {
        return this.isEditorProText;
    }

    public final String isEditorProTrimLength() {
        return this.isEditorProTrimLength;
    }

    public final boolean isGuidanceSticker() {
        return this.isGuidanceSticker;
    }

    public final boolean isUseAutoTextSize() {
        return this.isUseAutoTextSize;
    }

    public final boolean isUseColorDropper() {
        return this.isUseColorDropper;
    }

    public final boolean isVisibleWhen(long j) {
        if (!hasTimeData()) {
            return true;
        }
        int i = this.startTime;
        if (j <= this.endTime && i <= j) {
            return true;
        }
        return false;
    }

    public final void setActionAIText(boolean z) {
        this.isActionAIText = z;
    }

    public final void setAddToLayout(boolean z) {
        this.addToLayout = z;
    }

    public final void setAddToLayoutInPreviewOrCover(boolean z) {
        this.addToLayoutInPreviewOrCover = z;
    }

    public final void setAdjustTextColorInEditorPro(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.adjustTextColorInEditorPro = str;
    }

    public final void setAdjustTextFontInEditorPro(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.adjustTextFontInEditorPro = str;
    }

    public final void setAdjustTextParagraph(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.adjustTextParagraph = str;
    }

    public final void setAdjustTextPositionInEditorPro(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.adjustTextPositionInEditorPro = str;
    }

    public final void setAdjustTextRollbar(boolean z) {
        this.isAdjustTextRollbar = z;
    }

    public final void setAdjustTextStyleInEditorPro(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.adjustTextStyleInEditorPro = str;
    }

    public final void setAlign(int i) {
        this.align = i;
    }

    public final void setAlpha(Pair<Float, Boolean> pair) {
        o.LJIIIZ(pair, "<set-?>");
        this.alpha = pair;
    }

    public final void setAudioPathList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.audioPathList = list;
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i) {
        this.audioTrackDuration = i;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setAutoAddTtsFlag(boolean z) {
        this.autoAddTtsFlag = z;
    }

    public final void setAutoSelect(boolean z) {
        this.autoSelect = z;
    }

    public final void setBgMode(int i) {
        this.bgMode = i;
    }

    public final void setCanvasHeight(int i) {
        this.canvasHeight = i;
    }

    public final void setCanvasWidth(int i) {
        this.canvasWidth = i;
    }

    public final void setCaptionOnlyShowDeleteBubble(boolean z) {
        this.captionOnlyShowDeleteBubble = z;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setCoverExtraData(TextStickerCoverExtraData textStickerCoverExtraData) {
        o.LJIIIZ(textStickerCoverExtraData, "<set-?>");
        this.coverExtraData = textStickerCoverExtraData;
    }

    public final void setCreatorVoice(boolean z) {
        this.isCreatorVoice = z;
    }

    public final void setEditCenterPoint(Point point) {
        o.LJIIIZ(point, "<set-?>");
        this.editCenterPoint = point;
    }

    public final void setEditInEPDuration(long j) {
        this.editInEPDuration = j;
    }

    public final void setEditorProCaption(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.isEditorProCaption = str;
    }

    public final void setEditorProCopyText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.isEditorProCopyText = str;
    }

    public final void setEditorProTTS(String str) {
        this.isEditorProTTS = str;
    }

    public final void setEditorProTTSID(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.editorProTTSID = str;
    }

    public final void setEditorProText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.isEditorProText = str;
    }

    public final void setEditorProTrimLength(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.isEditorProTrimLength = str;
    }

    public final void setEffectTextLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.effectTextLayoutConfig = innerEffectTextLayoutConfig;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setFontId(String str) {
        this.fontId = str;
    }

    public final void setFontPath(String str) {
        this.fontPath = str;
    }

    public final void setFontResId(String str) {
        this.fontResId = str;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final void setFontType(String str) {
        this._fontType = str;
        TextFontStyleData LJIIIIZZ = C68M.LJIIJ().LJIIIIZZ(str);
        if (LJIIIIZZ != null) {
            this.fontId = LJIIIIZZ.LIZJ.getEffectId();
            this.fontPath = LJIIIIZZ.LIZJ.getUnzipPath();
            this.fontResId = LJIIIIZZ.LIZJ.getResource_id();
        } else {
            this.fontId = "";
            this.fontPath = "";
            this.fontResId = "";
        }
    }

    public final void setGuidanceSticker(boolean z) {
        this.isGuidanceSticker = z;
    }

    public final void setGuidanceWithDefaultText(boolean z) {
        this.guidanceWithDefaultText = z;
    }

    public final void setHasChangedFontSize(boolean z) {
        this.hasChangedFontSize = z;
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setIdInNewEngine(int i) {
        this.idInNewEngine = i;
    }

    public final void setInlineTextStyles(List<? extends InlineRichTextStyleData> list) {
        o.LJIIIZ(list, "<set-?>");
        this.inlineTextStyles = list;
    }

    public final void setLayoutHeight(float f) {
        this.layoutHeight = f;
    }

    public final void setLayoutWidth(float f) {
        this.layoutWidth = f;
    }

    public final void setLineSpacingExtra(float f) {
        this.lineSpacingExtra = f;
    }

    public final void setNleUuid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.nleUuid = str;
    }

    public final void setPlaceholderSlotId(String str) {
        this.placeholderSlotId = str;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setShowOnScreen(boolean z) {
        this.showOnScreen = z;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public final void setSpeakerName(String str) {
        this.speakerName = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setTextSlotAddOrder(int i) {
        this.textSlotAddOrder = i;
    }

    public final void setTextSlotTrackOrder(int i) {
        this.textSlotTrackOrder = i;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public final void setTextWrapList(List<TextStickerTextWrap> list) {
        o.LJIIIZ(list, "<set-?>");
        this.textWrapList = list;
    }

    public final void setTtsAnchorReleaseDate(long j) {
        this.ttsAnchorReleaseDate = j;
    }

    public final void setTtsAudioBean(TTSAudioBean tTSAudioBean) {
        o.LJIIIZ(tTSAudioBean, "<set-?>");
        this.ttsAudioBean = tTSAudioBean;
    }

    public final void setTtsHashTagIds(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.ttsHashTagIds = list;
    }

    public final void setTtsReleaseDate(long j) {
        this.ttsReleaseDate = j;
    }

    public final void setTtsVoiceModel(TTSVoiceModel tTSVoiceModel) {
        this.ttsVoiceModel = tTSVoiceModel;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.type = str;
    }

    public final void setUiEndTime(int i) {
        this.uiEndTime = i;
    }

    public final void setUiStartTime(int i) {
        this.uiStartTime = i;
    }

    public final void setUseAutoTextSize(boolean z) {
        this.isUseAutoTextSize = z;
    }

    public final void setUseColorDropper(boolean z) {
        this.isUseColorDropper = z;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public final void setVoiceAnchorName(String str) {
        this.voiceAnchorName = str;
    }

    public final void setVoiceCreatorUserId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.voiceCreatorUserId = str;
    }

    public final void setVoiceCreatorUserName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.voiceCreatorUserName = str;
    }

    public final void setVoiceEffectIconUrl(String str) {
        this.voiceEffectIconUrl = str;
    }

    public final void setVoiceEffectId(String str) {
        this.voiceEffectId = str;
    }

    public final void setVoiceEffectResourceId(String str) {
        this.voiceEffectResourceId = str;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.textStr);
        out.writeInt(this.bgMode);
        out.writeInt(this.color);
        out.writeInt(this.align);
        out.writeString(this._fontType);
        out.writeParcelable(this.editCenterPoint, i);
        out.writeInt(this.startTime);
        out.writeInt(this.endTime);
        out.writeInt(this.uiStartTime);
        out.writeInt(this.uiEndTime);
        out.writeFloat(this.x);
        out.writeFloat(this.y);
        out.writeLong(this.editInEPDuration);
        out.writeInt(this.showOnScreen ? 1 : 0);
        out.writeInt(this.addToLayout ? 1 : 0);
        out.writeInt(this.addToLayoutInPreviewOrCover ? 1 : 0);
        out.writeSerializable(this.alpha);
        out.writeFloat(this.rotation);
        out.writeFloat(this.scale);
        out.writeInt(this.autoSelect ? 1 : 0);
        out.writeInt(this.captionOnlyShowDeleteBubble ? 1 : 0);
        out.writeInt(this.hasReadTextAudio ? 1 : 0);
        out.writeInt(this.audioTrackIndex);
        out.writeString(this.nleUuid);
        out.writeString(this.audioTrackFilePath);
        out.writeString(this.speakerID);
        out.writeString(this.speakerName);
        out.writeInt(this.audioTrackDuration);
        out.writeString(this.audioText);
        out.writeStringList(this.audioPathList);
        out.writeInt(this.fontSize);
        out.writeStringArray(this.textStrAry);
        this.textWrap.writeToParcel(out, i);
        Iterator LIZJ = UC7.LIZJ(this.textWrapList, out);
        while (LIZJ.hasNext()) {
            ((TextStickerTextWrap) LIZJ.next()).writeToParcel(out, i);
        }
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = this.effectTextLayoutConfig;
        if (innerEffectTextLayoutConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            innerEffectTextLayoutConfig.writeToParcel(out, i);
        }
        this.coverExtraData.writeToParcel(out, i);
        out.writeInt(this.isGuidanceSticker ? 1 : 0);
        out.writeInt(this.guidanceWithDefaultText ? 1 : 0);
        out.writeString(this.fontId);
        out.writeString(this.fontResId);
        out.writeString(this.fontPath);
        out.writeFloat(this.layoutWidth);
        out.writeFloat(this.layoutHeight);
        out.writeInt(this.canvasWidth);
        out.writeInt(this.canvasHeight);
        out.writeInt(this.videoWidth);
        out.writeInt(this.videoHeight);
        out.writeFloat(this.lineSpacingExtra);
        out.writeParcelable(this.ttsVoiceModel, i);
        out.writeInt(this.autoAddTtsFlag ? 1 : 0);
        out.writeString(this.voiceEffectId);
        out.writeString(this.voiceEffectResourceId);
        out.writeString(this.voiceAnchorName);
        out.writeString(this.voiceEffectIconUrl);
        out.writeString(this.placeholderSlotId);
        out.writeString(this.voiceCreatorUserId);
        out.writeString(this.voiceCreatorUserName);
        out.writeInt(this.isCreatorVoice ? 1 : 0);
        out.writeString(this.type);
        out.writeLong(this.ttsAnchorReleaseDate);
        out.writeLong(this.ttsReleaseDate);
        out.writeStringList(this.ttsHashTagIds);
        out.writeString(this.adjustTextStyleInEditorPro);
        out.writeString(this.adjustTextParagraph);
        out.writeString(this.adjustTextFontInEditorPro);
        out.writeString(this.adjustTextColorInEditorPro);
        out.writeString(this.adjustTextPositionInEditorPro);
        out.writeString(this.isEditorProTrimLength);
        out.writeString(this.isEditorProText);
        out.writeInt(this.isActionAIText ? 1 : 0);
        out.writeString(this.isEditorProCopyText);
        out.writeString(this.isEditorProTTS);
        out.writeString(this.editorProTTSID);
        out.writeString(this.isEditorProCaption);
        Iterator LIZJ2 = UC7.LIZJ(this.inlineTextStyles, out);
        while (LIZJ2.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ2.next(), i);
        }
        out.writeInt(this.isUseAutoTextSize ? 1 : 0);
        out.writeInt(this.hasChangedFontSize ? 1 : 0);
        out.writeInt(this.isUseColorDropper ? 1 : 0);
        out.writeInt(this.isAdjustTextRollbar ? 1 : 0);
        out.writeInt(this.textSlotAddOrder);
        out.writeInt(this.textSlotTrackOrder);
        out.writeParcelable(this.ttsAudioBean, i);
        out.writeInt(this.idInNewEngine);
        Map<String, String> map = this.ttsExtraMap;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1073741824, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, LiveLayoutPreloadThreadPriority.DEFAULT, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -1, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -2, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -4, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -8, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -16, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -32, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -64, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -128, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -256, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -512, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -1024, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -2048, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -4096, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -8192, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -16384, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -32768, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -65536, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -131072, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -262144, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -524288, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -1048576, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -2097152, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -4194304, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -8388608, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -16777216, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -33554432, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -67108864, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -134217728, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -268435456, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -536870912, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, -1073741824, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, LiveLayoutPreloadThreadPriority.DEFAULT, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048575, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048574, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048572, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048568, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048560, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048544, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048512, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048448, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, null, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048320, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, null, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1048064, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, null, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1047552, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, false, false, false, false, 0, 0, null, 0, null, 0, 0, 1046528, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, false, false, false, 0, 0, null, 0, null, 0, 0, 1044480, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, z13, false, false, 0, 0, null, 0, null, 0, 0, 1040384, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13, boolean z14) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, z13, z14, false, 0, 0, null, 0, null, 0, 0, 1032192, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13, boolean z14, boolean z15) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, z13, z14, z15, 0, 0, null, 0, null, 0, 0, 1015808, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13, boolean z14, boolean z15, int i15) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, z13, z14, z15, i15, 0, null, 0, null, 0, 0, 983040, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, z13, z14, z15, i15, i16, null, 0, null, 0, 0, 917504, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean ttsAudioBean) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, z13, z14, z15, i15, i16, ttsAudioBean, 0, null, 0, 0, 786432, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
        o.LJIIIZ(ttsAudioBean, "ttsAudioBean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean ttsAudioBean, int i17) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, j, z, z2, z3, alpha, f3, f4, z4, z5, z6, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, innerEffectTextLayoutConfig, coverExtraData, z7, z8, str7, str8, str9, f5, f6, i11, i12, i13, i14, f7, tTSVoiceModel, z9, str10, str11, str12, str13, str14, voiceCreatorUserId, voiceCreatorUserName, z10, type, j2, j3, ttsHashTagIds, adjustTextStyleInEditorPro, adjustTextParagraph, adjustTextFontInEditorPro, adjustTextColorInEditorPro, adjustTextPositionInEditorPro, isEditorProTrimLength, isEditorProText, z11, isEditorProCopyText, str15, editorProTTSID, isEditorProCaption, inlineTextStyles, z12, z13, z14, z15, i15, i16, ttsAudioBean, i17, null, 0, 0, 524288, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
        o.LJIIIZ(ttsAudioBean, "ttsAudioBean");
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, long j, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, boolean z6, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData coverExtraData, boolean z7, boolean z8, String str7, String str8, String str9, float f5, float f6, int i11, int i12, int i13, int i14, float f7, TTSVoiceModel tTSVoiceModel, boolean z9, String str10, String str11, String str12, String str13, String str14, String voiceCreatorUserId, String voiceCreatorUserName, boolean z10, String type, long j2, long j3, List<String> ttsHashTagIds, String adjustTextStyleInEditorPro, String adjustTextParagraph, String adjustTextFontInEditorPro, String adjustTextColorInEditorPro, String adjustTextPositionInEditorPro, String isEditorProTrimLength, String isEditorProText, boolean z11, String isEditorProCopyText, String str15, String editorProTTSID, String isEditorProCaption, List<? extends InlineRichTextStyleData> inlineTextStyles, boolean z12, boolean z13, boolean z14, boolean z15, int i15, int i16, TTSAudioBean ttsAudioBean, int i17, Map<String, String> ttsExtraMap) {
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        o.LJIIIZ(type, "type");
        o.LJIIIZ(ttsHashTagIds, "ttsHashTagIds");
        o.LJIIIZ(adjustTextStyleInEditorPro, "adjustTextStyleInEditorPro");
        o.LJIIIZ(adjustTextParagraph, "adjustTextParagraph");
        o.LJIIIZ(adjustTextFontInEditorPro, "adjustTextFontInEditorPro");
        o.LJIIIZ(adjustTextColorInEditorPro, "adjustTextColorInEditorPro");
        o.LJIIIZ(adjustTextPositionInEditorPro, "adjustTextPositionInEditorPro");
        o.LJIIIZ(isEditorProTrimLength, "isEditorProTrimLength");
        o.LJIIIZ(isEditorProText, "isEditorProText");
        o.LJIIIZ(isEditorProCopyText, "isEditorProCopyText");
        o.LJIIIZ(editorProTTSID, "editorProTTSID");
        o.LJIIIZ(isEditorProCaption, "isEditorProCaption");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
        o.LJIIIZ(ttsAudioBean, "ttsAudioBean");
        o.LJIIIZ(ttsExtraMap, "ttsExtraMap");
        this.textStr = str;
        this.bgMode = i;
        this.color = i2;
        this.align = i3;
        this._fontType = str2;
        this.editCenterPoint = editCenterPoint;
        this.startTime = i4;
        this.endTime = i5;
        this.uiStartTime = i6;
        this.uiEndTime = i7;
        this.x = f;
        this.y = f2;
        this.editInEPDuration = j;
        this.showOnScreen = z;
        this.addToLayout = z2;
        this.addToLayoutInPreviewOrCover = z3;
        this.alpha = alpha;
        this.rotation = f3;
        this.scale = f4;
        this.autoSelect = z4;
        this.captionOnlyShowDeleteBubble = z5;
        this.hasReadTextAudio = z6;
        this.audioTrackIndex = i8;
        this.nleUuid = nleUuid;
        this.audioTrackFilePath = str3;
        this.speakerID = str4;
        this.speakerName = str5;
        this.audioTrackDuration = i9;
        this.audioText = str6;
        this.audioPathList = audioPathList;
        this.fontSize = i10;
        this.textStrAry = textStrAry;
        this.textWrap = textWrap;
        this.textWrapList = textWrapList;
        this.effectTextLayoutConfig = innerEffectTextLayoutConfig;
        this.coverExtraData = coverExtraData;
        this.isGuidanceSticker = z7;
        this.guidanceWithDefaultText = z8;
        this.fontId = str7;
        this.fontResId = str8;
        this.fontPath = str9;
        this.layoutWidth = f5;
        this.layoutHeight = f6;
        this.canvasWidth = i11;
        this.canvasHeight = i12;
        this.videoWidth = i13;
        this.videoHeight = i14;
        this.lineSpacingExtra = f7;
        this.ttsVoiceModel = tTSVoiceModel;
        this.autoAddTtsFlag = z9;
        this.voiceEffectId = str10;
        this.voiceEffectResourceId = str11;
        this.voiceAnchorName = str12;
        this.voiceEffectIconUrl = str13;
        this.placeholderSlotId = str14;
        this.voiceCreatorUserId = voiceCreatorUserId;
        this.voiceCreatorUserName = voiceCreatorUserName;
        this.isCreatorVoice = z10;
        this.type = type;
        this.ttsAnchorReleaseDate = j2;
        this.ttsReleaseDate = j3;
        this.ttsHashTagIds = ttsHashTagIds;
        this.adjustTextStyleInEditorPro = adjustTextStyleInEditorPro;
        this.adjustTextParagraph = adjustTextParagraph;
        this.adjustTextFontInEditorPro = adjustTextFontInEditorPro;
        this.adjustTextColorInEditorPro = adjustTextColorInEditorPro;
        this.adjustTextPositionInEditorPro = adjustTextPositionInEditorPro;
        this.isEditorProTrimLength = isEditorProTrimLength;
        this.isEditorProText = isEditorProText;
        this.isActionAIText = z11;
        this.isEditorProCopyText = isEditorProCopyText;
        this.isEditorProTTS = str15;
        this.editorProTTSID = editorProTTSID;
        this.isEditorProCaption = isEditorProCaption;
        this.inlineTextStyles = inlineTextStyles;
        this.isUseAutoTextSize = z12;
        this.hasChangedFontSize = z13;
        this.isUseColorDropper = z14;
        this.isAdjustTextRollbar = z15;
        this.textSlotAddOrder = i15;
        this.textSlotTrackOrder = i16;
        this.ttsAudioBean = ttsAudioBean;
        this.idInNewEngine = i17;
        this.ttsExtraMap = ttsExtraMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextStickerData(java.lang.String r99, int r100, int r101, int r102, java.lang.String r103, android.graphics.Point r104, int r105, int r106, int r107, int r108, float r109, float r110, long r111, boolean r113, boolean r114, boolean r115, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData.Pair r116, float r117, float r118, boolean r119, boolean r120, boolean r121, int r122, java.lang.String r123, java.lang.String r124, java.lang.String r125, java.lang.String r126, int r127, java.lang.String r128, java.util.List r129, int r130, java.lang.String[] r131, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap r132, java.util.List r133, com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig r134, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData r135, boolean r136, boolean r137, java.lang.String r138, java.lang.String r139, java.lang.String r140, float r141, float r142, int r143, int r144, int r145, int r146, float r147, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel r148, boolean r149, java.lang.String r150, java.lang.String r151, java.lang.String r152, java.lang.String r153, java.lang.String r154, java.lang.String r155, java.lang.String r156, boolean r157, java.lang.String r158, long r159, long r161, java.util.List r163, java.lang.String r164, java.lang.String r165, java.lang.String r166, java.lang.String r167, java.lang.String r168, java.lang.String r169, java.lang.String r170, boolean r171, java.lang.String r172, java.lang.String r173, java.lang.String r174, java.lang.String r175, java.util.List r176, boolean r177, boolean r178, boolean r179, boolean r180, int r181, int r182, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean r183, int r184, java.util.Map r185, int r186, int r187, int r188, kotlin.jvm.internal.DefaultConstructorMarker r189) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData.<init>(java.lang.String, int, int, int, java.lang.String, android.graphics.Point, int, int, int, int, float, float, long, boolean, boolean, boolean, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData$Pair, float, float, boolean, boolean, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.util.List, int, java.lang.String[], com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap, java.util.List, com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, float, float, int, int, int, int, float, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, long, long, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, int, int, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean, int, java.util.Map, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
