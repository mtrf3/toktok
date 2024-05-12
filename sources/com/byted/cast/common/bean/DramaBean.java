package com.byted.cast.common.bean;

import X.X1D;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes29.dex */
public class DramaBean {
    public String dramaId;
    public int headDuration;
    public MediaAssetBean mediaAssetBean;
    public int tailDuration;
    public UrlBean urlBean;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.dramaId, this.urlBean, Integer.valueOf(this.headDuration), Integer.valueOf(this.tailDuration), this.mediaAssetBean});
    }

    /* loaded from: classes29.dex */
    public static class MediaAssetBean {
        public String album;
        public String albumArtURI;
        public String artist;
        public int commentCount;
        public String coverURL;
        public String creator;
        public String danmakuURL;
        public String desc;
        public int diggCount;
        public long duration;
        public boolean isLike;
        public String lyrics;
        public int mimeType;
        public String title;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MediaAssetBean{title='");
            LIZ.append(this.title);
            LIZ.append('\'');
            LIZ.append(", desc='");
            LIZ.append(this.desc);
            LIZ.append('\'');
            LIZ.append(", coverURL='");
            LIZ.append(this.coverURL);
            LIZ.append('\'');
            LIZ.append(", danmakuURL='");
            LIZ.append(this.danmakuURL);
            LIZ.append('\'');
            LIZ.append(", duration=");
            LIZ.append(this.duration);
            LIZ.append(", isLike=");
            LIZ.append(this.isLike);
            LIZ.append(", diggCount=");
            LIZ.append(this.diggCount);
            LIZ.append(", commentCount=");
            LIZ.append(this.commentCount);
            LIZ.append(", creator='");
            LIZ.append(this.creator);
            LIZ.append('\'');
            LIZ.append(", artist='");
            LIZ.append(this.artist);
            LIZ.append('\'');
            LIZ.append(", album='");
            LIZ.append(this.album);
            LIZ.append('\'');
            LIZ.append(", albumArtURI='");
            LIZ.append(this.albumArtURI);
            LIZ.append('\'');
            LIZ.append(", lyrics='");
            LIZ.append(this.lyrics);
            LIZ.append('\'');
            LIZ.append(", mimeType=");
            LIZ.append(this.mimeType);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public String getAlbum() {
            return this.album;
        }

        public String getAlbumArtURI() {
            return this.albumArtURI;
        }

        public String getArtist() {
            return this.artist;
        }

        public int getCommentCount() {
            return this.commentCount;
        }

        public String getCoverURL() {
            return this.coverURL;
        }

        public String getCreator() {
            return this.creator;
        }

        public String getDanmakuURL() {
            return this.danmakuURL;
        }

        public String getDesc() {
            return this.desc;
        }

        public int getDiggCount() {
            return this.diggCount;
        }

        public long getDuration() {
            return this.duration;
        }

        public boolean getIsLike() {
            return this.isLike;
        }

        public String getLyrics() {
            return this.lyrics;
        }

        public int getMimeType() {
            return this.mimeType;
        }

        public String getTitle() {
            return this.title;
        }

        public void setAlbum(String str) {
            this.album = str;
        }

        public void setAlbumArtURI(String str) {
            this.albumArtURI = str;
        }

        public void setArtist(String str) {
            this.artist = str;
        }

        public void setCommentCount(int i) {
            this.commentCount = i;
        }

        public void setCoverURL(String str) {
            this.coverURL = str;
        }

        public void setCreator(String str) {
            this.creator = str;
        }

        public void setDanmakuURL(String str) {
            this.danmakuURL = str;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setDiggCount(int i) {
            this.diggCount = i;
        }

        public void setDuration(long j) {
            this.duration = j;
        }

        public void setIsLike(boolean z) {
            this.isLike = z;
        }

        public void setLyrics(String str) {
            this.lyrics = str;
        }

        public void setMimeType(int i) {
            this.mimeType = i;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    /* loaded from: classes29.dex */
    public static class UrlBean {
        public int bitrate;
        public String category;
        public String[] categoryList;
        public String dramaId;
        public String extra;
        public int height;
        public String url;
        public String[] urlList;
        public int width;

        public int hashCode() {
            return (((Arrays.hashCode(new Object[]{this.url, this.dramaId, Integer.valueOf(this.bitrate), Integer.valueOf(this.width), Integer.valueOf(this.height), this.category, this.extra}) * 31) + Arrays.hashCode(this.urlList)) * 31) + Arrays.hashCode(this.categoryList);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UrlBean{url='");
            LIZ.append(this.url);
            LIZ.append('\'');
            LIZ.append(", urlList=");
            LIZ.append(Arrays.toString(this.urlList));
            LIZ.append(", dramaId='");
            LIZ.append(this.dramaId);
            LIZ.append('\'');
            LIZ.append(", bitrate=");
            LIZ.append(this.bitrate);
            LIZ.append(", width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(", category='");
            LIZ.append(this.category);
            LIZ.append('\'');
            LIZ.append(", categoryList=");
            LIZ.append(Arrays.toString(this.categoryList));
            LIZ.append(", extra='");
            LIZ.append(this.extra);
            LIZ.append('\'');
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public int getBitrate() {
            return this.bitrate;
        }

        public String getCategory() {
            return this.category;
        }

        public String[] getCategoryList() {
            return this.categoryList;
        }

        public String getDramaId() {
            return this.dramaId;
        }

        public String getExtra() {
            return this.extra;
        }

        public int getHeight() {
            return this.height;
        }

        public String getUrl() {
            return this.url;
        }

        public String[] getUrlList() {
            return this.urlList;
        }

        public int getWidth() {
            return this.width;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UrlBean urlBean = (UrlBean) obj;
            if (this.bitrate == urlBean.bitrate && this.width == urlBean.width && this.height == urlBean.height && DramaBean.equals(this.url, urlBean.url) && Arrays.equals(this.urlList, urlBean.urlList) && DramaBean.equals(this.dramaId, urlBean.dramaId) && DramaBean.equals(this.category, urlBean.category) && Arrays.equals(this.categoryList, urlBean.categoryList) && DramaBean.equals(this.extra, urlBean.extra)) {
                return true;
            }
            return false;
        }

        public void setBitrate(int i) {
            this.bitrate = i;
        }

        public void setCategory(String str) {
            this.category = str;
        }

        public void setCategoryList(String[] strArr) {
            this.categoryList = strArr;
        }

        public void setDramaId(String str) {
            this.dramaId = str;
        }

        public void setExtra(String str) {
            this.extra = str;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(String[] strArr) {
            this.urlList = strArr;
        }

        public void setWidth(int i) {
            this.width = i;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DramaBean{dramaId='");
        LIZ.append(this.dramaId);
        LIZ.append('\'');
        LIZ.append(", urlBean=");
        LIZ.append(this.urlBean);
        LIZ.append(", headDuration=");
        LIZ.append(this.headDuration);
        LIZ.append(", tailDuration=");
        LIZ.append(this.tailDuration);
        LIZ.append(", mediaAssetBean=");
        LIZ.append(this.mediaAssetBean);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getDramaId() {
        return this.dramaId;
    }

    public int getHeadDuration() {
        return this.headDuration;
    }

    public MediaAssetBean getMediaAssetBean() {
        return this.mediaAssetBean;
    }

    public int getTailDuration() {
        return this.tailDuration;
    }

    public UrlBean getUrlBean() {
        return this.urlBean;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DramaBean) || getClass() != obj.getClass()) {
            return false;
        }
        DramaBean dramaBean = (DramaBean) obj;
        if (this.headDuration == dramaBean.headDuration && this.tailDuration == dramaBean.tailDuration && TextUtils.equals(this.dramaId, dramaBean.dramaId) && equals(this.urlBean, dramaBean.urlBean) && equals(this.mediaAssetBean, dramaBean.mediaAssetBean)) {
            return true;
        }
        return false;
    }

    public void setDramaId(String str) {
        this.dramaId = str;
    }

    public void setHeadDuration(int i) {
        this.headDuration = i;
    }

    public void setMediaAssetBean(MediaAssetBean mediaAssetBean) {
        this.mediaAssetBean = mediaAssetBean;
    }

    public void setTailDuration(int i) {
        this.tailDuration = i;
    }

    public void setUrlBean(UrlBean urlBean) {
        this.urlBean = urlBean;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
