package com.ss.android.ugc.aweme.feed.model;

import X.C113554cx;
import X.C69432nz;
import X.InterfaceC65349Pkn;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import ujb.o;

/* loaded from: classes4.dex */
public final class PhotoModeImageInfo implements Serializable {

    @InterfaceC65349Pkn("images")
    public List<PhotoModeImageUrlModel> imageList;

    @InterfaceC65349Pkn("image_post_cover")
    public PhotoModeImageUrlModel imagePostCover;
    public transient float minAspectRatio = Float.MAX_VALUE;

    @InterfaceC65349Pkn("music_volume")
    public Float musicVolume;
    public transient List<PhotoModeImage> photoModeImageList;

    @InterfaceC65349Pkn("post_extra")
    public String postExtra;

    @InterfaceC65349Pkn("photomode_image_quality_info")
    public String qualityMap;

    @InterfaceC65349Pkn("title")
    public String title;
    public transient String truncatedTitle;

    public final boolean hasTitle() {
        if (this.title == null || !(!o.LJJJJJL(r0))) {
            return false;
        }
        return true;
    }

    public final boolean isTitleTruncated() {
        String str = this.truncatedTitle;
        if (str == null || str.length() == 0 || kotlin.jvm.internal.o.LJ(this.title, this.truncatedTitle)) {
            return false;
        }
        return true;
    }

    public final Map<String, Object> getPostExtraMap() {
        try {
            Gson LIZ = C69432nz.LIZ();
            String str = this.postExtra;
            if (str == null) {
                str = "";
            }
            Object LJII = LIZ.LJII(str, new TypeToken<Map<String, ? extends Object>>() { // from class: com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo$getPostExtraMap$1
            }.getType());
            kotlin.jvm.internal.o.LJIIIIZZ(LJII, "{\n           GsonUtil.ge…Any>>() {}.type)\n       }");
            return (Map) LJII;
        } catch (Exception unused) {
            return C113554cx.LJJJLIIL();
        }
    }

    public final List<PhotoModeImageUrlModel> getImageList() {
        return this.imageList;
    }

    public final PhotoModeImageUrlModel getImagePostCover() {
        return this.imagePostCover;
    }

    public final float getMinAspectRatio() {
        return this.minAspectRatio;
    }

    public final Float getMusicVolume() {
        return this.musicVolume;
    }

    public final List<PhotoModeImage> getPhotoModeImageList() {
        return this.photoModeImageList;
    }

    public final String getPostExtra() {
        return this.postExtra;
    }

    public final String getQualityMap() {
        return this.qualityMap;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTruncatedTitle() {
        return this.truncatedTitle;
    }

    public final void setImageList(List<PhotoModeImageUrlModel> list) {
        this.imageList = list;
    }

    public final void setImagePostCover(PhotoModeImageUrlModel photoModeImageUrlModel) {
        this.imagePostCover = photoModeImageUrlModel;
    }

    public final void setMinAspectRatio(float f) {
        this.minAspectRatio = f;
    }

    public final void setMusicVolume(Float f) {
        this.musicVolume = f;
    }

    public final void setPhotoModeImageList(List<PhotoModeImage> list) {
        this.photoModeImageList = list;
    }

    public final void setPostExtra(String str) {
        this.postExtra = str;
    }

    public final void setQualityMap(String str) {
        this.qualityMap = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTruncatedTitle(String str) {
        this.truncatedTitle = str;
    }
}
