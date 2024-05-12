package com.ss.android.ugc.aweme.staticimage;

import X.F9E;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StaticImageVideoContext extends F9E implements Serializable {
    public final int duration;
    public final int imageHeight;
    public String imagePath;
    public final int imageWidth;
    public final boolean isFromAvatarChanging;
    public final boolean isFromBackgroundChanging;
    public final boolean isFromShoot;
    public String uploadFrameImagePath;

    public static /* synthetic */ StaticImageVideoContext copy$default(StaticImageVideoContext staticImageVideoContext, String str, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = staticImageVideoContext.imagePath;
        }
        if ((i4 & 2) != 0) {
            z = staticImageVideoContext.isFromShoot;
        }
        if ((i4 & 4) != 0) {
            i = staticImageVideoContext.duration;
        }
        if ((i4 & 8) != 0) {
            z2 = staticImageVideoContext.isFromAvatarChanging;
        }
        if ((i4 & 16) != 0) {
            z3 = staticImageVideoContext.isFromBackgroundChanging;
        }
        if ((i4 & 32) != 0) {
            i2 = staticImageVideoContext.imageWidth;
        }
        if ((i4 & 64) != 0) {
            i3 = staticImageVideoContext.imageHeight;
        }
        if ((i4 & 128) != 0) {
            str2 = staticImageVideoContext.uploadFrameImagePath;
        }
        return staticImageVideoContext.copy(str, z, i, z2, z3, i2, i3, str2);
    }

    public final StaticImageVideoContext copy(String imagePath, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str) {
        o.LJIIIZ(imagePath, "imagePath");
        return new StaticImageVideoContext(imagePath, z, i, z2, z3, i2, i3, str);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.imagePath, Boolean.valueOf(this.isFromShoot), Integer.valueOf(this.duration), Boolean.valueOf(this.isFromAvatarChanging), Boolean.valueOf(this.isFromBackgroundChanging), Integer.valueOf(this.imageWidth), Integer.valueOf(this.imageHeight), this.uploadFrameImagePath};
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getUploadFrameImagePath() {
        return this.uploadFrameImagePath;
    }

    public final boolean isFromAvatarChanging() {
        return this.isFromAvatarChanging;
    }

    public final boolean isFromBackgroundChanging() {
        return this.isFromBackgroundChanging;
    }

    public final boolean isFromShoot() {
        return this.isFromShoot;
    }

    public final void setImagePath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.imagePath = str;
    }

    public final void setUploadFrameImagePath(String str) {
        this.uploadFrameImagePath = str;
    }

    public StaticImageVideoContext(String imagePath, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str) {
        o.LJIIIZ(imagePath, "imagePath");
        this.imagePath = imagePath;
        this.isFromShoot = z;
        this.duration = i;
        this.isFromAvatarChanging = z2;
        this.isFromBackgroundChanging = z3;
        this.imageWidth = i2;
        this.imageHeight = i3;
        this.uploadFrameImagePath = str;
    }

    public /* synthetic */ StaticImageVideoContext(String str, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i4 & 4) != 0 ? 10000 : i, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? 720 : i2, (i4 & 64) != 0 ? 1080 : i3, (i4 & 128) != 0 ? null : str2);
    }
}
