package com.ss.android.ugc.aweme.mvtheme;

import X.ELZ;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MvSourceItemInfo implements Serializable {
    public static final ELZ Companion = new ELZ();

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("mvItemCrop")
    public MvItemCrop mvItemCrop;

    @InterfaceC65349Pkn("origin_file_path")
    public String originFilePath;

    @InterfaceC65349Pkn("photo_path")
    public final String photoPath;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("sourceStartTime")
    public long sourceStartTime;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("width")
    public int width;

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final MvItemCrop getMvItemCrop() {
        return this.mvItemCrop;
    }

    public final String getOriginFilePath() {
        return this.originFilePath;
    }

    public final String getPhotoPath() {
        return this.photoPath;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getSourceStartTime() {
        return this.sourceStartTime;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public MvSourceItemInfo(String photoPath) {
        o.LJIIIZ(photoPath, "photoPath");
        this.photoPath = photoPath;
        this.source = "";
        this.originFilePath = "";
        this.type = "";
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMvItemCrop(MvItemCrop mvItemCrop) {
        this.mvItemCrop = mvItemCrop;
    }

    public final void setOriginFilePath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.originFilePath = str;
    }

    public final void setSource(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.source = str;
    }

    public final void setSourceStartTime(long j) {
        this.sourceStartTime = j;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.type = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
