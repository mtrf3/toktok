package com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel;

import X.C63X;
import X.C77119UOl;
import X.InterfaceC65349Pkn;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.SerializeRectF;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class BaseStickerModel implements Cloneable, Parcelable {
    public static final Parcelable.Creator<BaseStickerModel> CREATOR = new Parcelable.Creator<BaseStickerModel>() { // from class: X.63Y
        @Override // android.os.Parcelable.Creator
        public final BaseStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            SerializeRectF createFromParcel = SerializeRectF.CREATOR.createFromParcel(parcel);
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            float readFloat5 = parcel.readFloat();
            float readFloat6 = parcel.readFloat();
            float readFloat7 = parcel.readFloat();
            float readFloat8 = parcel.readFloat();
            float readFloat9 = parcel.readFloat();
            float readFloat10 = parcel.readFloat();
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
            return new BaseStickerModel(readInt, readInt2, readInt3, readFloat, readFloat2, createFromParcel, readFloat3, readFloat4, readFloat5, readFloat6, readFloat7, readFloat8, readFloat9, readFloat10, z, z2, z3, z4, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseStickerModel[] newArray(int i) {
            return new BaseStickerModel[i];
        }
    };

    @InterfaceC65349Pkn("center_x")
    public float centerX;

    @InterfaceC65349Pkn("center_y")
    public float centerY;

    @InterfaceC65349Pkn("compile_in_video")
    public final boolean compileInVideo;

    @InterfaceC65349Pkn("mEndTime")
    public float endTime;

    @InterfaceC65349Pkn("height")
    public float height;

    @InterfaceC65349Pkn("rotation")
    public float rotation;

    @InterfaceC65349Pkn("s")
    public float scale;

    @InterfaceC65349Pkn("mStartTime")
    public float startTime;

    @InterfaceC65349Pkn("sticker_container_height")
    public int stickerContainerHeight;

    @InterfaceC65349Pkn("sticker_container_width")
    public int stickerContainerWidth;

    @InterfaceC65349Pkn("type")
    public int stickerType;

    @InterfaceC65349Pkn("block_bottom_safe_area")
    public final boolean supportBottomBlock;

    @InterfaceC65349Pkn("block_left_safe_area")
    public final boolean supportLeftBlock;

    @InterfaceC65349Pkn("block_right_safe_area")
    public final boolean supportRightBlock;

    @InterfaceC65349Pkn("block_top_safe_area")
    public final boolean supportTopBlock;

    @InterfaceC65349Pkn("mUIEndTime")
    public float uiEndTime;

    @InterfaceC65349Pkn("mUIStartTime")
    public float uiStartTime;

    @InterfaceC65349Pkn("rectF")
    public SerializeRectF viewRectF;

    @InterfaceC65349Pkn("width")
    public float width;

    public BaseStickerModel() {
        this(0, 0, 0, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, false, false, false, false, 524287, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void syncStickerModelWithStickerRender(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.stickerContainerWidth);
        out.writeInt(this.stickerContainerHeight);
        out.writeInt(this.stickerType);
        out.writeFloat(this.centerX);
        out.writeFloat(this.centerY);
        this.viewRectF.writeToParcel(out, i);
        out.writeFloat(this.width);
        out.writeFloat(this.height);
        out.writeFloat(this.rotation);
        out.writeFloat(this.scale);
        out.writeFloat(this.startTime);
        out.writeFloat(this.endTime);
        out.writeFloat(this.uiStartTime);
        out.writeFloat(this.uiEndTime);
        out.writeInt(this.supportTopBlock ? 1 : 0);
        out.writeInt(this.supportBottomBlock ? 1 : 0);
        out.writeInt(this.supportLeftBlock ? 1 : 0);
        out.writeInt(this.supportRightBlock ? 1 : 0);
        out.writeInt(this.compileInVideo ? 1 : 0);
    }

    /* renamed from: clone */
    public BaseStickerModel m194clone() {
        try {
            Object clone = super.clone();
            o.LJII(clone, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.BaseStickerModel");
            return (BaseStickerModel) clone;
        } catch (CloneNotSupportedException unused) {
            return new BaseStickerModel(0, 0, 0, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, false, false, false, false, 524287, null);
        }
    }

    public float getCenterX() {
        return this.centerX;
    }

    public float getCenterY() {
        return this.centerY;
    }

    public boolean getCompileInVideo() {
        return this.compileInVideo;
    }

    public float getEndTime() {
        return this.endTime;
    }

    public float getHeight() {
        return this.height;
    }

    public float getRotation() {
        return this.rotation;
    }

    public float getScale() {
        return this.scale;
    }

    public float getStartTime() {
        return this.startTime;
    }

    public final int getStickerContainerHeight() {
        return this.stickerContainerHeight;
    }

    public final int getStickerContainerWidth() {
        return this.stickerContainerWidth;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public boolean getSupportBottomBlock() {
        return this.supportBottomBlock;
    }

    public boolean getSupportLeftBlock() {
        return this.supportLeftBlock;
    }

    public boolean getSupportRightBlock() {
        return this.supportRightBlock;
    }

    public boolean getSupportTopBlock() {
        return this.supportTopBlock;
    }

    public float getUiEndTime() {
        return this.uiEndTime;
    }

    public float getUiStartTime() {
        return this.uiStartTime;
    }

    public SerializeRectF getViewRectF() {
        return this.viewRectF;
    }

    public float getWidth() {
        return this.width;
    }

    public final PointF[] getFourPointsWithRotationAndScale(float f) {
        PointF[] fourPointsWithScale = getFourPointsWithScale(f);
        for (PointF pointF : fourPointsWithScale) {
            C77119UOl.LJJIII(pointF, getViewRectF().LIZ().centerX(), getViewRectF().LIZ().centerY(), (float) Math.toRadians(getRotation()));
        }
        return fourPointsWithScale;
    }

    public final PointF[] getFourPointsWithScale(float f) {
        RectF LIZ = getViewRectF().LIZ();
        C77119UOl.LJJIIZ(LIZ, getScale() * f);
        PointF pointF = new PointF();
        PointF[] pointFArr = {new PointF(), new PointF(), new PointF(), pointF};
        PointF pointF2 = pointFArr[0];
        float f2 = LIZ.left;
        pointF2.x = f2;
        float f3 = LIZ.top;
        pointF2.y = f3;
        PointF pointF3 = pointFArr[1];
        float f4 = LIZ.right;
        pointF3.x = f4;
        pointF3.y = f3;
        PointF pointF4 = pointFArr[2];
        pointF4.x = f2;
        float f5 = LIZ.bottom;
        pointF4.y = f5;
        pointF.x = f4;
        pointF.y = f5;
        return pointFArr;
    }

    public void setCenterX(float f) {
        this.centerX = f;
    }

    public void setCenterY(float f) {
        this.centerY = f;
    }

    public void setEndTime(float f) {
        this.endTime = f;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public void setStartTime(float f) {
        this.startTime = f;
    }

    public final void setStickerContainerHeight(int i) {
        this.stickerContainerHeight = i;
    }

    public final void setStickerContainerWidth(int i) {
        this.stickerContainerWidth = i;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setUiEndTime(float f) {
        this.uiEndTime = f;
    }

    public void setUiStartTime(float f) {
        this.uiStartTime = f;
    }

    public void setViewRectF(SerializeRectF serializeRectF) {
        o.LJIIIZ(serializeRectF, "<set-?>");
        this.viewRectF = serializeRectF;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public static /* synthetic */ PointF[] getFourPointsWithRotationAndScale$default(BaseStickerModel baseStickerModel, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return baseStickerModel.getFourPointsWithRotationAndScale(f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFourPointsWithRotationAndScale");
    }

    public static /* synthetic */ PointF[] getFourPointsWithScale$default(BaseStickerModel baseStickerModel, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return baseStickerModel.getFourPointsWithScale(f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFourPointsWithScale");
    }

    public BaseStickerModel(int i, int i2, int i3, float f, float f2, SerializeRectF viewRectF, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        o.LJIIIZ(viewRectF, "viewRectF");
        this.stickerContainerWidth = i;
        this.stickerContainerHeight = i2;
        this.stickerType = i3;
        this.centerX = f;
        this.centerY = f2;
        this.viewRectF = viewRectF;
        this.width = f3;
        this.height = f4;
        this.rotation = f5;
        this.scale = f6;
        this.startTime = f7;
        this.endTime = f8;
        this.uiStartTime = f9;
        this.uiEndTime = f10;
        this.supportTopBlock = z;
        this.supportBottomBlock = z2;
        this.supportLeftBlock = z3;
        this.supportRightBlock = z4;
        this.compileInVideo = z5;
    }

    public /* synthetic */ BaseStickerModel(int i, int i2, int i3, float f, float f2, SerializeRectF serializeRectF, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? C63X.NONE.getType() : i3, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? 0.0f : f2, (i4 & 32) != 0 ? new SerializeRectF(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : serializeRectF, (i4 & 64) != 0 ? 0.0f : f3, (i4 & 128) != 0 ? 0.0f : f4, (i4 & 256) != 0 ? 0.0f : f5, (i4 & 512) != 0 ? 1.0f : f6, (i4 & 1024) != 0 ? 0.0f : f7, (i4 & 2048) != 0 ? 0.0f : f8, (i4 & 4096) != 0 ? 0.0f : f9, (i4 & FileUtils.BUFFER_SIZE) == 0 ? f10 : 0.0f, (i4 & 16384) != 0 ? false : z, (32768 & i4) != 0 ? true : z2, (65536 & i4) != 0 ? true : z3, (131072 & i4) != 0 ? true : z4, (i4 & 262144) == 0 ? z5 : true);
    }
}
