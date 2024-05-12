package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class BitrateMetaStruct implements Serializable {

    @InterfaceC65349Pkn("bitrate")
    public long bitrate;

    @InterfaceC65349Pkn("codec_type")
    public String codecType;

    @InterfaceC65349Pkn("definition")
    public String definition;

    @InterfaceC65349Pkn("encoded_type")
    public String encodedType;

    @InterfaceC65349Pkn("file_hash")
    public String fileHash;

    @InterfaceC65349Pkn("file_id")
    public String fileId;

    @InterfaceC65349Pkn("format")
    public String format;

    @InterfaceC65349Pkn("fps")
    public long fps;

    @InterfaceC65349Pkn("height")
    public long height;

    @InterfaceC65349Pkn("logo_type")
    public String logoType;

    @InterfaceC65349Pkn("media_type")
    public String mediaType;

    @InterfaceC65349Pkn("quality")
    public String quality;

    @InterfaceC65349Pkn("quality_desc")
    public String qualityDesc;

    @InterfaceC65349Pkn("size")
    public long size;

    @InterfaceC65349Pkn("sub_info")
    public String subInfo;

    @InterfaceC65349Pkn("url_list")
    public BitrateUrlStruct urlList;

    @InterfaceC65349Pkn("width")
    public long width;

    public final long getBitrate() {
        return this.bitrate;
    }

    public final String getCodecType() {
        return this.codecType;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final String getEncodedType() {
        return this.encodedType;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFormat() {
        return this.format;
    }

    public final long getFps() {
        return this.fps;
    }

    public final long getHeight() {
        return this.height;
    }

    public final String getLogoType() {
        return this.logoType;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getQualityDesc() {
        return this.qualityDesc;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getSubInfo() {
        return this.subInfo;
    }

    public final BitrateUrlStruct getUrlList() {
        return this.urlList;
    }

    public final long getWidth() {
        return this.width;
    }

    public final void setBitrate(long j) {
        this.bitrate = j;
    }

    public final void setCodecType(String str) {
        this.codecType = str;
    }

    public final void setDefinition(String str) {
        this.definition = str;
    }

    public final void setEncodedType(String str) {
        this.encodedType = str;
    }

    public final void setFileHash(String str) {
        this.fileHash = str;
    }

    public final void setFileId(String str) {
        this.fileId = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setFps(long j) {
        this.fps = j;
    }

    public final void setHeight(long j) {
        this.height = j;
    }

    public final void setLogoType(String str) {
        this.logoType = str;
    }

    public final void setMediaType(String str) {
        this.mediaType = str;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setQualityDesc(String str) {
        this.qualityDesc = str;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setSubInfo(String str) {
        this.subInfo = str;
    }

    public final void setUrlList(BitrateUrlStruct bitrateUrlStruct) {
        this.urlList = bitrateUrlStruct;
    }

    public final void setWidth(long j) {
        this.width = j;
    }
}
