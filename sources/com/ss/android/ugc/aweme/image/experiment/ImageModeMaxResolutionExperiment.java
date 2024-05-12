package com.ss.android.ugc.aweme.image.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.b0;

/* loaded from: classes13.dex */
public final class ImageModeMaxResolutionExperiment {
    public static final ImageModeMaxResolution LIZ;

    /* loaded from: classes13.dex */
    public static final class ImageModeMaxResolution {

        @InterfaceC65349Pkn("height")
        public final int height;

        @InterfaceC65349Pkn("width")
        public final int width;

        public static /* synthetic */ ImageModeMaxResolution copy$default(ImageModeMaxResolution imageModeMaxResolution, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = imageModeMaxResolution.width;
            }
            if ((i3 & 2) != 0) {
                i2 = imageModeMaxResolution.height;
            }
            return imageModeMaxResolution.copy(i, i2);
        }

        public final ImageModeMaxResolution copy(int i, int i2) {
            return new ImageModeMaxResolution(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageModeMaxResolution)) {
                return false;
            }
            ImageModeMaxResolution imageModeMaxResolution = (ImageModeMaxResolution) obj;
            return this.width == imageModeMaxResolution.width && this.height == imageModeMaxResolution.height;
        }

        public int hashCode() {
            return (this.width * 31) + this.height;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImageModeMaxResolution(width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            return b0.LIZJ(LIZ, this.height, ')', LIZ);
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public ImageModeMaxResolution(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    static {
        new ImageModeMaxResolution(1280, 1280);
        LIZ = new ImageModeMaxResolution(1920, 1920);
    }

    public static ImageModeMaxResolution LIZ() {
        ImageModeMaxResolution imageModeMaxResolution;
        try {
            imageModeMaxResolution = (ImageModeMaxResolution) SettingsManager.LIZLLL().LJIIIIZZ("image_album_resolution_for_creation", ImageModeMaxResolution.class, LIZ);
        } catch (Throwable unused) {
            imageModeMaxResolution = LIZ;
        }
        if (imageModeMaxResolution == null) {
            return LIZ;
        }
        return imageModeMaxResolution;
    }
}
