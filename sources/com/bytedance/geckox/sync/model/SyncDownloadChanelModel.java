package com.bytedance.geckox.sync.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes11.dex */
public class SyncDownloadChanelModel {

    @InterfaceC65349Pkn("channel")
    public String channel;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("md5")
    public String md5;

    @InterfaceC65349Pkn("package_type")
    public int packageType;

    @InterfaceC65349Pkn("size")
    public long size;

    @InterfaceC65349Pkn("url")
    public SyncChannelUrlModel url;

    @InterfaceC65349Pkn("version")
    public long version;

    /* loaded from: classes11.dex */
    public static class SyncChannelUrlModel {

        @InterfaceC65349Pkn("domains")
        public List<String> domains;

        @InterfaceC65349Pkn("scheme")
        public String scheme;

        @InterfaceC65349Pkn("uri")
        public String uri;

        public List<String> getDomains() {
            return this.domains;
        }

        public String getScheme() {
            return this.scheme;
        }

        public String getUri() {
            return this.uri;
        }

        public void setDomains(List<String> list) {
            this.domains = list;
        }

        public void setScheme(String str) {
            this.scheme = str;
        }

        public void setUri(String str) {
            this.uri = str;
        }
    }

    public String getChannel() {
        return this.channel;
    }

    public long getId() {
        return this.id;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public long getSize() {
        return this.size;
    }

    public SyncChannelUrlModel getUrl() {
        return this.url;
    }

    public long getVersion() {
        return this.version;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPackageType(int i) {
        this.packageType = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setUrl(SyncChannelUrlModel syncChannelUrlModel) {
        this.url = syncChannelUrlModel;
    }

    public void setVersion(long j) {
        this.version = j;
    }
}
