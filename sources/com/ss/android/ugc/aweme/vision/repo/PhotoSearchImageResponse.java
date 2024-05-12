package com.ss.android.ugc.aweme.vision.repo;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class PhotoSearchImageResponse implements Serializable {

    @InterfaceC65349Pkn("box_detection")
    public List<String> boxDetection;

    @InterfaceC65349Pkn("detection")
    public String detection;

    @InterfaceC65349Pkn("image_uri")
    public String imageUri;

    public final List<String> getBoxDetection() {
        return this.boxDetection;
    }

    public final String getDetection() {
        return this.detection;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final void setBoxDetection(List<String> list) {
        this.boxDetection = list;
    }

    public final void setDetection(String str) {
        this.detection = str;
    }

    public final void setImageUri(String str) {
        this.imageUri = str;
    }
}
