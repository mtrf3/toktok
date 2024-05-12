package com.ss.android.ugc.aweme.image.model;

import X.C0MT;
import X.C151735xR;
import X.C16880lQ;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.image.model.EditImageInfo;
import java.io.File;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditImageInfo implements Parcelable, Serializable {

    @InterfaceC65349Pkn("bitmap_height")
    public int bitmapHeight;

    @InterfaceC65349Pkn("bitmap_width")
    public int bitmapWidth;

    @InterfaceC65349Pkn("initialize_scale_value")
    public Float initializeScaleValue;

    @InterfaceC65349Pkn("is_full_screen")
    public boolean isFullScreen;

    @InterfaceC65349Pkn("is_local_image_with_enhance")
    public boolean isLocalImageWithEnhance;

    @InterfaceC65349Pkn("need_compile_local_image")
    public boolean needCompileLocalImage;

    @InterfaceC65349Pkn("offset_x")
    public Float offsetX;

    @InterfaceC65349Pkn("offset_y")
    public Float offsetY;

    @InterfaceC65349Pkn("ratio")
    public float ratio;

    @InterfaceC65349Pkn("ratio_mode")
    public int ratioMode;

    @InterfaceC65349Pkn("scale_after_crop")
    public Float scaleAfterCrop;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("temp_synthesis_path")
    public String tempSynthesisPath;
    public static final C151735xR Companion = new Object() { // from class: X.5xR
    };
    public static final Parcelable.Creator<EditImageInfo> CREATOR = new Parcelable.Creator<EditImageInfo>() { // from class: X.5x8
        @Override // android.os.Parcelable.Creator
        public final EditImageInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Float valueOf;
            Float valueOf2;
            Float valueOf3;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
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
            int readInt3 = parcel.readInt();
            float readFloat = parcel.readFloat();
            Float f = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                f = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new EditImageInfo(readString, readInt, readInt2, z, z2, readInt3, readFloat, valueOf, valueOf2, valueOf3, f, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final EditImageInfo[] newArray(int i) {
            return new EditImageInfo[i];
        }
    };

    public EditImageInfo() {
        this(null, 0, 0, false, false, 0, 0.0f, null, null, null, null, false, 4095, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getBitmapHeight() {
        return this.bitmapHeight;
    }

    public final int getBitmapWidth() {
        return this.bitmapWidth;
    }

    public final Float getInitializeScaleValue() {
        return this.initializeScaleValue;
    }

    public final boolean getNeedCompileLocalImage() {
        return this.needCompileLocalImage;
    }

    public final Float getOffsetX() {
        return this.offsetX;
    }

    public final Float getOffsetY() {
        return this.offsetY;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getRatioMode() {
        return this.ratioMode;
    }

    public final Float getScaleAfterCrop() {
        return this.scaleAfterCrop;
    }

    public final String getTempSynthesisPath() {
        return this.tempSynthesisPath;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public final boolean isLocalImageWithEnhance() {
        return this.isLocalImageWithEnhance;
    }

    public final void setBitmapHeight(int i) {
        this.bitmapHeight = i;
    }

    public final void setBitmapWidth(int i) {
        this.bitmapWidth = i;
    }

    public final void setFullScreen(boolean z) {
        this.isFullScreen = z;
    }

    public final void setInitializeScaleValue(Float f) {
        this.initializeScaleValue = f;
    }

    public final void setLocalImageWithEnhance(boolean z) {
        this.isLocalImageWithEnhance = z;
    }

    public final void setNeedCompileLocalImage(boolean z) {
        this.needCompileLocalImage = z;
    }

    public final void setOffsetX(Float f) {
        this.offsetX = f;
    }

    public final void setOffsetY(Float f) {
        this.offsetY = f;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setRatioMode(int i) {
        this.ratioMode = i;
    }

    public final void setScaleAfterCrop(Float f) {
        this.scaleAfterCrop = f;
    }

    public final void setTempSynthesisPath(String str) {
        this.tempSynthesisPath = str;
    }

    public final void setTempSynthesisPath(String path, boolean z) {
        o.LJIIIZ(path, "path");
        if (z && !o.LJ(path, this.tempSynthesisPath)) {
            String str = this.tempSynthesisPath;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if ("mounted".equals(C16880lQ.LLLLLLLZIL())) {
                        File file = new File(str);
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.tempSynthesisPath = path;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.tempSynthesisPath);
        out.writeInt(this.bitmapWidth);
        out.writeInt(this.bitmapHeight);
        out.writeInt(this.isLocalImageWithEnhance ? 1 : 0);
        out.writeInt(this.needCompileLocalImage ? 1 : 0);
        out.writeInt(this.ratioMode);
        out.writeFloat(this.ratio);
        Float f = this.initializeScaleValue;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        Float f2 = this.scaleAfterCrop;
        if (f2 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f2);
        }
        Float f3 = this.offsetX;
        if (f3 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f3);
        }
        Float f4 = this.offsetY;
        if (f4 == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f4);
        }
        out.writeInt(this.isFullScreen ? 1 : 0);
    }

    public static /* synthetic */ void setTempSynthesisPath$default(EditImageInfo editImageInfo, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        editImageInfo.setTempSynthesisPath(str, z);
    }

    public EditImageInfo(String str, int i, int i2, boolean z, boolean z2, int i3, float f, Float f2, Float f3, Float f4, Float f5, boolean z3) {
        this.tempSynthesisPath = str;
        this.bitmapWidth = i;
        this.bitmapHeight = i2;
        this.isLocalImageWithEnhance = z;
        this.needCompileLocalImage = z2;
        this.ratioMode = i3;
        this.ratio = f;
        this.initializeScaleValue = f2;
        this.scaleAfterCrop = f3;
        this.offsetX = f4;
        this.offsetY = f5;
        this.isFullScreen = z3;
    }

    public /* synthetic */ EditImageInfo(String str, int i, int i2, boolean z, boolean z2, int i3, float f, Float f2, Float f3, Float f4, Float f5, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? -1 : i3, (i4 & 64) != 0 ? -1.0f : f, (i4 & 128) != 0 ? null : f2, (i4 & 256) != 0 ? null : f3, (i4 & 512) != 0 ? null : f4, (i4 & 1024) == 0 ? f5 : null, (i4 & 2048) == 0 ? z3 : false);
    }
}
