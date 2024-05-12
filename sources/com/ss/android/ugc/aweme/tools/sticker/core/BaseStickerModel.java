package com.ss.android.ugc.aweme.tools.sticker.core;

import X.C65232Piu;
import X.C6D8;
import X.EnumC157656Gr;
import X.F9E;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class BaseStickerModel extends F9E implements Cloneable, Parcelable, Serializable {
    public static final Parcelable.Creator<BaseStickerModel> CREATOR = new Parcelable.Creator<BaseStickerModel>() { // from class: X.6A3
        @Override // android.os.Parcelable.Creator
        public final BaseStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            EnumC157656Gr valueOf = EnumC157656Gr.valueOf(parcel.readString());
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            int readInt8 = parcel.readInt();
            int readInt9 = parcel.readInt();
            int readInt10 = parcel.readInt();
            int readInt11 = parcel.readInt();
            int readInt12 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString = parcel.readString();
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            float readFloat5 = parcel.readFloat();
            float readFloat6 = parcel.readFloat();
            float readFloat7 = parcel.readFloat();
            float readFloat8 = parcel.readFloat();
            float readFloat9 = parcel.readFloat();
            float readFloat10 = parcel.readFloat();
            float readFloat11 = parcel.readFloat();
            float readFloat12 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            float readFloat13 = parcel.readFloat();
            float readFloat14 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new BaseStickerModel(readInt, readInt2, valueOf, readInt3, readInt4, readFloat, readFloat2, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, z, readString, readFloat3, readFloat4, readFloat5, readFloat6, readFloat7, readFloat8, readFloat9, readFloat10, readFloat11, readFloat12, z2, readFloat13, readFloat14, z3, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseStickerModel[] newArray(int i) {
            return new BaseStickerModel[i];
        }
    };

    @InterfaceC65349Pkn("alpha")
    public final float alpha;

    @InterfaceC65349Pkn("center_x")
    public final float centerX;

    @InterfaceC65349Pkn("center_x_in_video")
    public final float centerXInVideo;

    @InterfaceC65349Pkn("center_y")
    public final float centerY;

    @InterfaceC65349Pkn("center_y_in_video")
    public final float centerYInVideo;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("compile_path")
    public String compilePath;

    @InterfaceC65349Pkn("container_height")
    public final int containerHeight;

    @InterfaceC65349Pkn("container_left")
    public final int containerLeft;

    @InterfaceC65349Pkn("container_top")
    public final int containerTop;

    @InterfaceC65349Pkn("container_width")
    public final int containerWidth;

    @InterfaceC65349Pkn("end_time")
    public float endTime;

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("height_in_video")
    public final float heightInVideo;

    @InterfaceC65349Pkn("id")
    public final int id;

    @InterfaceC65349Pkn("is_embed")
    public final boolean isEmbed;

    @InterfaceC65349Pkn("is_manually_clipped")
    public final boolean isManuallyClipped;

    @InterfaceC65349Pkn("left")
    public final int left;

    @InterfaceC65349Pkn("media_height")
    public final int mediaHeight;

    @InterfaceC65349Pkn("media_width")
    public final int mediaWidth;

    @InterfaceC65349Pkn("rotation")
    public final float rotation;

    @InterfaceC65349Pkn("scale")
    public final float scale;

    @InterfaceC65349Pkn("start_time")
    public float startTime;

    @InterfaceC65349Pkn("top")
    public final int top;

    @InterfaceC65349Pkn("translate_x")
    public final float translateX;

    @InterfaceC65349Pkn("translate_y")
    public final float translateY;

    @InterfaceC65349Pkn("type")
    public final EnumC157656Gr type;

    @InterfaceC65349Pkn("ui_end_time")
    public float uiEndTime;

    @InterfaceC65349Pkn("ui_start_time")
    public float uiStartTime;

    @InterfaceC65349Pkn("visible")
    public final boolean visible;

    @InterfaceC65349Pkn("width")
    public final int width;

    @InterfaceC65349Pkn("width_in_video")
    public final float widthInVideo;

    @InterfaceC65349Pkn("z_index")
    public final int zIndex;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseStickerModel() {
        /*
            r35 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r33 = -1
            r0 = r35
            r2 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r3
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r27 = r6
            r28 = r1
            r29 = r6
            r30 = r6
            r31 = r1
            r32 = r6
            r34 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel.<init>():void");
    }

    public static /* synthetic */ BaseStickerModel copy$default(BaseStickerModel baseStickerModel, int i, int i2, EnumC157656Gr enumC157656Gr, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15, int i13, Object obj) {
        int i14 = i10;
        int i15 = i9;
        int i16 = i11;
        int i17 = i8;
        int i18 = i7;
        int i19 = i6;
        int i20 = i5;
        float f16 = f2;
        int i21 = i2;
        int i22 = i;
        EnumC157656Gr enumC157656Gr2 = enumC157656Gr;
        int i23 = i3;
        int i24 = i4;
        float f17 = f;
        float f18 = f5;
        float f19 = f4;
        float f20 = f3;
        String str2 = str;
        int i25 = i12;
        float f21 = f15;
        boolean z4 = z;
        float f22 = f6;
        float f23 = f7;
        float f24 = f8;
        float f25 = f9;
        boolean z5 = z3;
        float f26 = f10;
        float f27 = f11;
        float f28 = f12;
        boolean z6 = z2;
        float f29 = f13;
        float f30 = f14;
        if ((i13 & 1) != 0) {
            i22 = baseStickerModel.id;
        }
        if ((i13 & 2) != 0) {
            i21 = baseStickerModel.zIndex;
        }
        if ((i13 & 4) != 0) {
            enumC157656Gr2 = baseStickerModel.type;
        }
        if ((i13 & 8) != 0) {
            i23 = baseStickerModel.left;
        }
        if ((i13 & 16) != 0) {
            i24 = baseStickerModel.top;
        }
        if ((i13 & 32) != 0) {
            f17 = baseStickerModel.centerX;
        }
        if ((i13 & 64) != 0) {
            f16 = baseStickerModel.centerY;
        }
        if ((i13 & 128) != 0) {
            i20 = baseStickerModel.width;
        }
        if ((i13 & 256) != 0) {
            i19 = baseStickerModel.height;
        }
        if ((i13 & 512) != 0) {
            i18 = baseStickerModel.containerLeft;
        }
        if ((i13 & 1024) != 0) {
            i17 = baseStickerModel.containerTop;
        }
        if ((i13 & 2048) != 0) {
            i15 = baseStickerModel.containerWidth;
        }
        if ((i13 & 4096) != 0) {
            i14 = baseStickerModel.containerHeight;
        }
        if ((i13 & FileUtils.BUFFER_SIZE) != 0) {
            i16 = baseStickerModel.mediaWidth;
        }
        if ((i13 & 16384) != 0) {
            i25 = baseStickerModel.mediaHeight;
        }
        if ((32768 & i13) != 0) {
            z4 = baseStickerModel.isEmbed;
        }
        if ((65536 & i13) != 0) {
            str2 = baseStickerModel.compilePath;
        }
        if ((131072 & i13) != 0) {
            f20 = baseStickerModel.centerXInVideo;
        }
        if ((262144 & i13) != 0) {
            f19 = baseStickerModel.centerYInVideo;
        }
        if ((524288 & i13) != 0) {
            f18 = baseStickerModel.widthInVideo;
        }
        if ((1048576 & i13) != 0) {
            f22 = baseStickerModel.heightInVideo;
        }
        if ((2097152 & i13) != 0) {
            f23 = baseStickerModel.translateX;
        }
        if ((4194304 & i13) != 0) {
            f24 = baseStickerModel.translateY;
        }
        if ((8388608 & i13) != 0) {
            f25 = baseStickerModel.scale;
        }
        if ((16777216 & i13) != 0) {
            f26 = baseStickerModel.rotation;
        }
        if ((33554432 & i13) != 0) {
            f27 = baseStickerModel.startTime;
        }
        if ((67108864 & i13) != 0) {
            f28 = baseStickerModel.endTime;
        }
        if ((134217728 & i13) != 0) {
            z6 = baseStickerModel.isManuallyClipped;
        }
        if ((268435456 & i13) != 0) {
            f29 = baseStickerModel.uiStartTime;
        }
        if ((536870912 & i13) != 0) {
            f30 = baseStickerModel.uiEndTime;
        }
        if ((1073741824 & i13) != 0) {
            z5 = baseStickerModel.visible;
        }
        if ((i13 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            f21 = baseStickerModel.alpha;
        }
        return baseStickerModel.copy(i22, i21, enumC157656Gr2, i23, i24, f17, f16, i20, i19, i18, i17, i15, i14, i16, i25, z4, str2, f20, f19, f18, f22, f23, f24, f25, f26, f27, f28, z6, f29, f30, z5, f21);
    }

    public final BaseStickerModel copy(int i, int i2, EnumC157656Gr type, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String compilePath, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(compilePath, "compilePath");
        return new BaseStickerModel(i, i2, type, i3, i4, f, f2, i5, i6, i7, i8, i9, i10, i11, i12, z, compilePath, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, z2, f13, f14, z3, f15);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.id), Integer.valueOf(this.zIndex), this.type, Integer.valueOf(this.left), Integer.valueOf(this.top), Float.valueOf(this.centerX), Float.valueOf(this.centerY), Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.containerLeft), Integer.valueOf(this.containerTop), Integer.valueOf(this.containerWidth), Integer.valueOf(this.containerHeight), Integer.valueOf(this.mediaWidth), Integer.valueOf(this.mediaHeight), Boolean.valueOf(this.isEmbed), this.compilePath, Float.valueOf(this.centerXInVideo), Float.valueOf(this.centerYInVideo), Float.valueOf(this.widthInVideo), Float.valueOf(this.heightInVideo), Float.valueOf(this.translateX), Float.valueOf(this.translateY), Float.valueOf(this.scale), Float.valueOf(this.rotation), Float.valueOf(this.startTime), Float.valueOf(this.endTime), Boolean.valueOf(this.isManuallyClipped), Float.valueOf(this.uiStartTime), Float.valueOf(this.uiEndTime), Boolean.valueOf(this.visible), Float.valueOf(this.alpha)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.id);
        out.writeInt(this.zIndex);
        out.writeString(this.type.name());
        out.writeInt(this.left);
        out.writeInt(this.top);
        out.writeFloat(this.centerX);
        out.writeFloat(this.centerY);
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeInt(this.containerLeft);
        out.writeInt(this.containerTop);
        out.writeInt(this.containerWidth);
        out.writeInt(this.containerHeight);
        out.writeInt(this.mediaWidth);
        out.writeInt(this.mediaHeight);
        out.writeInt(this.isEmbed ? 1 : 0);
        out.writeString(this.compilePath);
        out.writeFloat(this.centerXInVideo);
        out.writeFloat(this.centerYInVideo);
        out.writeFloat(this.widthInVideo);
        out.writeFloat(this.heightInVideo);
        out.writeFloat(this.translateX);
        out.writeFloat(this.translateY);
        out.writeFloat(this.scale);
        out.writeFloat(this.rotation);
        out.writeFloat(this.startTime);
        out.writeFloat(this.endTime);
        out.writeInt(this.isManuallyClipped ? 1 : 0);
        out.writeFloat(this.uiStartTime);
        out.writeFloat(this.uiEndTime);
        out.writeInt(this.visible ? 1 : 0);
        out.writeFloat(this.alpha);
    }

    public final RectF getViewRect() {
        int i = this.left;
        int i2 = this.containerLeft;
        int i3 = i + i2;
        int i4 = i + i2 + this.width;
        int i5 = this.top;
        int i6 = this.containerTop;
        return new RectF(i3, i5 + i6, i4, i5 + i6 + this.height);
    }

    public final RectF getVisibleRectWithoutRotation() {
        if (!this.visible) {
            return new RectF();
        }
        float f = this.centerX;
        float f2 = this.translateX;
        int i = this.width;
        float f3 = this.scale;
        float f4 = 2;
        int i2 = this.containerLeft;
        float f5 = ((f + f2) - ((i * f3) / f4)) + i2;
        float LIZ = C6D8.LIZ(i, f3, f4, f + f2) + i2;
        float f6 = this.centerY;
        float f7 = this.translateY;
        int i3 = this.height;
        float LIZIZ = C65232Piu.LIZIZ(i3, f3, f4, f6 + f7);
        int i4 = this.containerTop;
        return new RectF(f5, LIZIZ + i4, LIZ, C6D8.LIZ(i3, f3, f4, f6 + f7) + i4);
    }

    public final RectF getVisibleRectWithoutRotationInContainer() {
        float f = this.centerX;
        float f2 = this.translateX;
        int i = this.width;
        float f3 = this.scale;
        float f4 = 2;
        float f5 = (f + f2) - ((i * f3) / f4);
        float LIZ = C6D8.LIZ(i, f3, f4, f + f2);
        float f6 = this.centerY;
        float f7 = this.translateY;
        int i2 = this.height;
        return new RectF(f5, C65232Piu.LIZIZ(i2, f3, f4, f6 + f7), LIZ, C6D8.LIZ(i2, f3, f4, f6 + f7));
    }

    public Object clone() {
        return super.clone();
    }

    public final RectF getStickerBoundingRect() {
        RectF visibleRectWithoutRotationInContainer = getVisibleRectWithoutRotationInContainer();
        Matrix matrix = new Matrix();
        matrix.postRotate(this.rotation, visibleRectWithoutRotationInContainer.centerX(), visibleRectWithoutRotationInContainer.centerY());
        matrix.mapRect(visibleRectWithoutRotationInContainer);
        return visibleRectWithoutRotationInContainer;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterXInVideo() {
        return this.centerXInVideo;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final float getCenterYInVideo() {
        return this.centerYInVideo;
    }

    public final String getCompilePath() {
        return this.compilePath;
    }

    public final int getContainerHeight() {
        return this.containerHeight;
    }

    public final int getContainerLeft() {
        return this.containerLeft;
    }

    public final int getContainerTop() {
        return this.containerTop;
    }

    public final int getContainerWidth() {
        return this.containerWidth;
    }

    public final float getEndTime() {
        return this.endTime;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getHeightInVideo() {
        return this.heightInVideo;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMediaHeight() {
        return this.mediaHeight;
    }

    public final int getMediaWidth() {
        return this.mediaWidth;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getStartTime() {
        return this.startTime;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslateX() {
        return this.translateX;
    }

    public final float getTranslateY() {
        return this.translateY;
    }

    public final EnumC157656Gr getType() {
        return this.type;
    }

    public final float getUiEndTime() {
        return this.uiEndTime;
    }

    public final float getUiStartTime() {
        return this.uiStartTime;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getWidthInVideo() {
        return this.widthInVideo;
    }

    public final int getZIndex() {
        return this.zIndex;
    }

    public final boolean isEmbed() {
        return this.isEmbed;
    }

    public final boolean isManuallyClipped() {
        return this.isManuallyClipped;
    }

    public final void setCompilePath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.compilePath = str;
    }

    public final void setEndTime(float f) {
        this.endTime = f;
    }

    public final void setStartTime(float f) {
        this.startTime = f;
    }

    public final void setUiEndTime(float f) {
        this.uiEndTime = f;
    }

    public final void setUiStartTime(float f) {
        this.uiStartTime = f;
    }

    public BaseStickerModel(int i, int i2, EnumC157656Gr type, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String compilePath, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(compilePath, "compilePath");
        this.id = i;
        this.zIndex = i2;
        this.type = type;
        this.left = i3;
        this.top = i4;
        this.centerX = f;
        this.centerY = f2;
        this.width = i5;
        this.height = i6;
        this.containerLeft = i7;
        this.containerTop = i8;
        this.containerWidth = i9;
        this.containerHeight = i10;
        this.mediaWidth = i11;
        this.mediaHeight = i12;
        this.isEmbed = z;
        this.compilePath = compilePath;
        this.centerXInVideo = f3;
        this.centerYInVideo = f4;
        this.widthInVideo = f5;
        this.heightInVideo = f6;
        this.translateX = f7;
        this.translateY = f8;
        this.scale = f9;
        this.rotation = f10;
        this.startTime = f11;
        this.endTime = f12;
        this.isManuallyClipped = z2;
        this.uiStartTime = f13;
        this.uiEndTime = f14;
        this.visible = z3;
        this.alpha = f15;
    }

    public /* synthetic */ BaseStickerModel(int i, int i2, EnumC157656Gr enumC157656Gr, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z2, float f13, float f14, boolean z3, float f15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, (i13 & 2) != 0 ? 0 : i2, (i13 & 4) != 0 ? EnumC157656Gr.NONE : enumC157656Gr, (i13 & 8) != 0 ? 0 : i3, (i13 & 16) != 0 ? 0 : i4, (i13 & 32) != 0 ? 0.0f : f, (i13 & 64) != 0 ? 0.0f : f2, (i13 & 128) != 0 ? 0 : i5, (i13 & 256) != 0 ? 0 : i6, (i13 & 512) != 0 ? 0 : i7, (i13 & 1024) != 0 ? 0 : i8, (i13 & 2048) != 0 ? 0 : i9, (i13 & 4096) != 0 ? 0 : i10, (i13 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i11, (i13 & 16384) != 0 ? 0 : i12, (32768 & i13) != 0 ? false : z, (65536 & i13) != 0 ? "" : str, (131072 & i13) != 0 ? 0.0f : f3, (262144 & i13) != 0 ? 0.0f : f4, (524288 & i13) != 0 ? 0.0f : f5, (1048576 & i13) != 0 ? 0.0f : f6, (2097152 & i13) != 0 ? 0.0f : f7, (4194304 & i13) != 0 ? 0.0f : f8, (8388608 & i13) != 0 ? 1.0f : f9, (16777216 & i13) != 0 ? 0.0f : f10, (33554432 & i13) != 0 ? 0.0f : f11, (67108864 & i13) != 0 ? 0.0f : f12, (134217728 & i13) != 0 ? false : z2, (268435456 & i13) != 0 ? 0.0f : f13, (536870912 & i13) != 0 ? 0.0f : f14, (1073741824 & i13) != 0 ? true : z3, (i13 & LiveLayoutPreloadThreadPriority.DEFAULT) == 0 ? f15 : 1.0f);
    }
}
