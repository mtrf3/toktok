package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PlayAddress implements Serializable {

    @InterfaceC65349Pkn("data_size")
    public Long dataSize;

    @InterfaceC65349Pkn("file_cs")
    public String fileCS;

    @InterfaceC65349Pkn("file_hash")
    public String fileHash;

    @InterfaceC65349Pkn("height")
    public Integer height;

    @InterfaceC65349Pkn("player_access_key")
    public String playerAccessKey;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_key")
    public String urlKey;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @InterfaceC65349Pkn("width")
    public Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayAddress() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayAddress copy$default(PlayAddress playAddress, String str, List list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playAddress.uri;
        }
        if ((i & 2) != 0) {
            list = playAddress.urlList;
        }
        if ((i & 4) != 0) {
            num = playAddress.width;
        }
        if ((i & 8) != 0) {
            num2 = playAddress.height;
        }
        if ((i & 16) != 0) {
            str2 = playAddress.urlKey;
        }
        if ((i & 32) != 0) {
            l = playAddress.dataSize;
        }
        if ((i & 64) != 0) {
            str3 = playAddress.fileHash;
        }
        if ((i & 128) != 0) {
            str4 = playAddress.fileCS;
        }
        if ((i & 256) != 0) {
            str5 = playAddress.playerAccessKey;
        }
        return playAddress.copy(str, list, num, num2, str2, l, str3, str4, str5);
    }

    public final PlayAddress copy(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5) {
        return new PlayAddress(str, list, num, num2, str2, l, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayAddress)) {
            return false;
        }
        PlayAddress playAddress = (PlayAddress) obj;
        return o.LJ(this.uri, playAddress.uri) && o.LJ(this.urlList, playAddress.urlList) && o.LJ(this.width, playAddress.width) && o.LJ(this.height, playAddress.height) && o.LJ(this.urlKey, playAddress.urlKey) && o.LJ(this.dataSize, playAddress.dataSize) && o.LJ(this.fileHash, playAddress.fileHash) && o.LJ(this.fileCS, playAddress.fileCS) && o.LJ(this.playerAccessKey, playAddress.playerAccessKey);
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.urlKey;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.dataSize;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.fileHash;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileCS;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.playerAccessKey;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayAddress(uri=");
        LIZ.append(this.uri);
        LIZ.append(", urlList=");
        LIZ.append(this.urlList);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", urlKey=");
        LIZ.append(this.urlKey);
        LIZ.append(", dataSize=");
        LIZ.append(this.dataSize);
        LIZ.append(", fileHash=");
        LIZ.append(this.fileHash);
        LIZ.append(", fileCS=");
        LIZ.append(this.fileCS);
        LIZ.append(", playerAccessKey=");
        return q.LIZIZ(LIZ, this.playerAccessKey, ')', LIZ);
    }

    public final Long getDataSize() {
        return this.dataSize;
    }

    public final String getFileCS() {
        return this.fileCS;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getPlayerAccessKey() {
        return this.playerAccessKey;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrlKey() {
        return this.urlKey;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public PlayAddress(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
        this.urlKey = str2;
        this.dataSize = l;
        this.fileHash = str3;
        this.fileCS = str4;
        this.playerAccessKey = str5;
    }

    public /* synthetic */ PlayAddress(String str, List list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
