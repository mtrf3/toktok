package com.bytedance.android.livesdk.sei;

import X.InterfaceC65349Pkn;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SeiCanvas {

    @InterfaceC65349Pkn("background")
    public String background;

    @InterfaceC65349Pkn("backgroundImage")
    public String backgroundImage;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("width")
    public int width;

    public final int hashCode() {
        return Objects.hash(this.background, Integer.valueOf(this.height), Integer.valueOf(this.width), this.backgroundImage);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiCanvas)) {
            return false;
        }
        SeiCanvas seiCanvas = (SeiCanvas) obj;
        if (this.height == seiCanvas.height && this.width == seiCanvas.width && Objects.equals(this.background, seiCanvas.background) && Objects.equals(this.backgroundImage, seiCanvas.backgroundImage)) {
            return true;
        }
        return false;
    }
}
