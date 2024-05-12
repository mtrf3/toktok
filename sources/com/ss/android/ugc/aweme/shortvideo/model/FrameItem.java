package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.GX2;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FrameItem extends F9E implements Serializable {
    public static final Companion Companion = new Companion();
    public FrameItemCropInfo cropInfo;
    public final int index;
    public boolean isCropped;

    @GX2
    @InterfaceC65349Pkn("path")
    public final String path;
    public final Float rotate;

    @InterfaceC65349Pkn("timeStamp")
    public long timeStamp;
    public final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameItem(String str) {
        this(str, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrameItem(String str, int i) {
        this(str, i, 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 60, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrameItem(String str, int i, int i2) {
        this(str, i, i2, false, null, 0 == true ? 1 : 0, 56, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrameItem(String str, int i, int i2, boolean z) {
        this(str, i, i2, z, null, 0 == true ? 1 : 0, 48, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FrameItem(String str, int i, int i2, boolean z, FrameItemCropInfo frameItemCropInfo) {
        this(str, i, i2, z, frameItemCropInfo, null, 32, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FrameItem copy$default(FrameItem frameItem, String str, int i, int i2, boolean z, FrameItemCropInfo frameItemCropInfo, Float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = frameItem.path;
        }
        if ((i3 & 2) != 0) {
            i = frameItem.type;
        }
        if ((i3 & 4) != 0) {
            i2 = frameItem.index;
        }
        if ((i3 & 8) != 0) {
            z = frameItem.isCropped;
        }
        if ((i3 & 16) != 0) {
            frameItemCropInfo = frameItem.cropInfo;
        }
        if ((i3 & 32) != 0) {
            f = frameItem.rotate;
        }
        return frameItem.copy(str, i, i2, z, frameItemCropInfo, f);
    }

    public final FrameItem copy(String path, int i, int i2, boolean z, FrameItemCropInfo frameItemCropInfo, Float f) {
        o.LJIIIZ(path, "path");
        return new FrameItem(path, i, i2, z, frameItemCropInfo, f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.path, Integer.valueOf(this.type), Integer.valueOf(this.index), Boolean.valueOf(this.isCropped), this.cropInfo, this.rotate};
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final FrameItemCropInfo getCropInfo() {
        return this.cropInfo;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final Float getRotate() {
        return this.rotate;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isCropped() {
        return this.isCropped;
    }

    public final void setCropInfo(FrameItemCropInfo frameItemCropInfo) {
        this.cropInfo = frameItemCropInfo;
    }

    public final void setCropped(boolean z) {
        this.isCropped = z;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public FrameItem(String path, int i, int i2, boolean z, FrameItemCropInfo frameItemCropInfo, Float f) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.type = i;
        this.index = i2;
        this.isCropped = z;
        this.cropInfo = frameItemCropInfo;
        this.rotate = f;
        this.timeStamp = -1L;
    }

    public /* synthetic */ FrameItem(String str, int i, int i2, boolean z, FrameItemCropInfo frameItemCropInfo, Float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? null : frameItemCropInfo, (i3 & 32) == 0 ? f : null);
    }
}
