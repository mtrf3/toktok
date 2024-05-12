package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.C16880lQ;
import X.C6IH;
import X.InterfaceC137125Zs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.U26;
import X.UC7;
import X.X1D;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerCoverExtraData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerData implements Parcelable, Cloneable, InterfaceC137125Zs {
    public static final Parcelable.Creator<TextStickerData> CREATOR = new Parcelable.Creator<TextStickerData>() { // from class: X.5Zv
        @Override // android.os.Parcelable.Creator
        public final TextStickerData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
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
            int i = 0;
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
            TextStickerTextWrap createFromParcel = TextStickerTextWrap.CREATOR.createFromParcel(parcel);
            int readInt11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt11);
            while (i != readInt11) {
                i = C279117r.LIZIZ(TextStickerTextWrap.CREATOR, parcel, arrayList, i, 1);
            }
            return new TextStickerData(readString, readInt, readInt2, readInt3, readString2, point, readInt4, readInt5, readInt6, readInt7, readFloat, readFloat2, z, z2, z3, pair, readFloat3, readFloat4, z4, z5, readInt8, readString3, readString4, readString5, readString6, readInt9, readString7, createStringArrayList, readInt10, createStringArray, createFromParcel, arrayList, TextStickerCoverExtraData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
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
    public boolean autoSelect;

    @InterfaceC65349Pkn("bg_mode")
    public int bgMode;

    @InterfaceC65349Pkn("canvas_height")
    public int canvasHeight;

    @InterfaceC65349Pkn("canvas_width")
    public int canvasWidth;

    @InterfaceC65349Pkn("color")
    public int color;

    @InterfaceC65349Pkn("cover_extra_data")
    public TextStickerCoverExtraData coverExtraData;

    @InterfaceC65349Pkn("edit_center_point")
    public Point editCenterPoint;

    @InterfaceC65349Pkn("mEndTime")
    public int endTime;

    @InterfaceC65349Pkn("font_id")
    public String fontId;

    @InterfaceC65349Pkn("font_path")
    public String fontPath;
    public int fontSize;

    @InterfaceC65349Pkn("has_read_text_audio")
    public boolean hasReadTextAudio;

    @InterfaceC65349Pkn("layout_height")
    public float layoutHeight;

    @InterfaceC65349Pkn("layout_width")
    public float layoutWidth;

    @InterfaceC65349Pkn("nle_uuid")
    public String nleUuid;

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

    @InterfaceC65349Pkn("text_str")
    public String textStr;

    @InterfaceC65349Pkn("text_str_ary")
    public String[] textStrAry;

    @InterfaceC65349Pkn("text_str_wrap")
    public TextStickerTextWrap textWrap;

    @InterfaceC65349Pkn("text_str_wrap_list")
    public List<TextStickerTextWrap> textWrapList;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("mUIEndTime")
    public int uiEndTime;

    @InterfaceC65349Pkn("mUIStartTime")
    public int uiStartTime;

    @InterfaceC65349Pkn("video_width")
    public int videoWidth;
    public float x;
    public float y;

    public TextStickerData() {
        this(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1, 511, null);
    }

    public TextStickerData(String str) {
        this(str, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -2, 511, null);
    }

    public TextStickerData(String str, int i) {
        this(str, i, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -4, 511, null);
    }

    public TextStickerData(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -8, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -16, 511, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this(str, i, i2, i3, str2, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -32, 511, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint) {
        this(str, i, i2, i3, str2, editCenterPoint, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -64, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -128, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -256, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -512, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1024, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -2048, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -4096, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -8192, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -16384, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -32768, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -65536, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -131072, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -262144, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -524288, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1048576, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -2097152, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -4194304, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -8388608, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -16777216, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -33554432, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -67108864, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -134217728, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -268435456, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -536870912, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1073741824, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, LiveLayoutPreloadThreadPriority.DEFAULT, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, 0, 511, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, null, null, 0.0f, 0.0f, 0, 0, 0, null, 0, 510, null);
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
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, str7, null, 0.0f, 0.0f, 0, 0, 0, null, 0, 508, null);
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
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7, String str8) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, str7, str8, 0.0f, 0.0f, 0, 0, 0, null, 0, 504, null);
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
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7, String str8, float f5) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, str7, str8, f5, 0.0f, 0, 0, 0, null, 0, 496, null);
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
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7, String str8, float f5, float f6) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, str7, str8, f5, f6, 0, 0, 0, null, 0, 480, null);
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
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7, String str8, float f5, float f6, int i11) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, str7, str8, f5, f6, i11, 0, 0, null, 0, 448, null);
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
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7, String str8, float f5, float f6, int i11, int i12) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, str7, str8, f5, f6, i11, i12, 0, null, 0, 384, null);
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
    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7, String str8, float f5, float f6, int i11, int i12, int i13) {
        this(str, i, i2, i3, str2, editCenterPoint, i4, i5, i6, i7, f, f2, z, z2, z3, alpha, f3, f4, z4, z5, i8, nleUuid, str3, str4, str5, i9, str6, audioPathList, i10, textStrAry, textWrap, textWrapList, coverExtraData, str7, str8, f5, f6, i11, i12, i13, null, 0, 256, null);
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
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

    public final boolean isCaption() {
        return o.LJ(this.type, "type_inline_caption");
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TextStickerData m138clone() {
        try {
            Object clone = super.clone();
            o.LJII(clone, "null cannot be cast to non-null type com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData");
            return (TextStickerData) clone;
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, false, false, false, null, 0.0f, 0.0f, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, null, -1, 511, null);
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

    public final int getColor() {
        return this.color;
    }

    public final TextStickerCoverExtraData getCoverExtraData() {
        return this.coverExtraData;
    }

    public final Point getEditCenterPoint() {
        return this.editCenterPoint;
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

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getFontType() {
        return this._fontType;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final float getLayoutHeight() {
        return this.layoutHeight;
    }

    public final float getLayoutWidth() {
        return this.layoutWidth;
    }

    public final String getNleUuid() {
        return this.nleUuid;
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

    public final String getTextStr() {
        return this.textStr;
    }

    public final List<TextStickerTextWrap> getTextWrapList() {
        return this.textWrapList;
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

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
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

    public final void setAddToLayout(boolean z) {
        this.addToLayout = z;
    }

    public final void setAddToLayoutInPreviewOrCover(boolean z) {
        this.addToLayoutInPreviewOrCover = z;
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

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setCoverExtraData(TextStickerCoverExtraData textStickerCoverExtraData) {
        o.LJIIIZ(textStickerCoverExtraData, "<set-?>");
        this.coverExtraData = textStickerCoverExtraData;
    }

    public final void setEditCenterPoint(Point point) {
        o.LJIIIZ(point, "<set-?>");
        this.editCenterPoint = point;
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

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final void setFontType(String str) {
        TextFontStyleData textFontStyleData;
        this._fontType = str;
        C6IH LJ = C6IH.LJ();
        LJ.getClass();
        if (TextUtils.isEmpty(str) || (textFontStyleData = LJ.LIZ.get(str)) == null) {
            this.fontId = "";
            this.fontPath = "";
        } else {
            this.fontId = textFontStyleData.LIZJ.getEffectId();
            this.fontPath = textFontStyleData.LIZJ.getUnzipPath();
        }
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setLayoutHeight(float f) {
        this.layoutHeight = f;
    }

    public final void setLayoutWidth(float f) {
        this.layoutWidth = f;
    }

    public final void setNleUuid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.nleUuid = str;
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

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public final void setTextWrapList(List<TextStickerTextWrap> list) {
        o.LJIIIZ(list, "<set-?>");
        this.textWrapList = list;
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

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
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
        out.writeInt(this.showOnScreen ? 1 : 0);
        out.writeInt(this.addToLayout ? 1 : 0);
        out.writeInt(this.addToLayoutInPreviewOrCover ? 1 : 0);
        out.writeSerializable(this.alpha);
        out.writeFloat(this.rotation);
        out.writeFloat(this.scale);
        out.writeInt(this.autoSelect ? 1 : 0);
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
        this.coverExtraData.writeToParcel(out, i);
        out.writeString(this.fontId);
        out.writeString(this.fontPath);
        out.writeFloat(this.layoutWidth);
        out.writeFloat(this.layoutHeight);
        out.writeInt(this.canvasWidth);
        out.writeInt(this.canvasHeight);
        out.writeInt(this.videoWidth);
        out.writeString(this.type);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point editCenterPoint, int i4, int i5, int i6, int i7, float f, float f2, boolean z, boolean z2, boolean z3, Pair<Float, Boolean> alpha, float f3, float f4, boolean z4, boolean z5, int i8, String nleUuid, String str3, String str4, String str5, int i9, String str6, List<String> audioPathList, int i10, String[] textStrAry, TextStickerTextWrap textWrap, List<TextStickerTextWrap> textWrapList, TextStickerCoverExtraData coverExtraData, String str7, String str8, float f5, float f6, int i11, int i12, int i13, String type) {
        o.LJIIIZ(editCenterPoint, "editCenterPoint");
        o.LJIIIZ(alpha, "alpha");
        o.LJIIIZ(nleUuid, "nleUuid");
        o.LJIIIZ(audioPathList, "audioPathList");
        o.LJIIIZ(textStrAry, "textStrAry");
        o.LJIIIZ(textWrap, "textWrap");
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(coverExtraData, "coverExtraData");
        o.LJIIIZ(type, "type");
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
        this.showOnScreen = z;
        this.addToLayout = z2;
        this.addToLayoutInPreviewOrCover = z3;
        this.alpha = alpha;
        this.rotation = f3;
        this.scale = f4;
        this.autoSelect = z4;
        this.hasReadTextAudio = z5;
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
        this.coverExtraData = coverExtraData;
        this.fontId = str7;
        this.fontPath = str8;
        this.layoutWidth = f5;
        this.layoutHeight = f6;
        this.canvasWidth = i11;
        this.canvasHeight = i12;
        this.videoWidth = i13;
        this.type = type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextStickerData(java.lang.String r61, int r62, int r63, int r64, java.lang.String r65, android.graphics.Point r66, int r67, int r68, int r69, int r70, float r71, float r72, boolean r73, boolean r74, boolean r75, com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData.Pair r76, float r77, float r78, boolean r79, boolean r80, int r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, int r86, java.lang.String r87, java.util.List r88, int r89, java.lang.String[] r90, com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap r91, java.util.List r92, com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerCoverExtraData r93, java.lang.String r94, java.lang.String r95, float r96, float r97, int r98, int r99, int r100, java.lang.String r101, int r102, int r103, kotlin.jvm.internal.DefaultConstructorMarker r104) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData.<init>(java.lang.String, int, int, int, java.lang.String, android.graphics.Point, int, int, int, int, float, float, boolean, boolean, boolean, com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData$Pair, float, float, boolean, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.util.List, int, java.lang.String[], com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap, java.util.List, com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerCoverExtraData, java.lang.String, java.lang.String, float, float, int, int, int, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
