package com.ss.ugc.effectplatform.model.net;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class ResourceUrl {
    public String backup_url;
    public String main_url;
    public String oid;
    public Long url_expire;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceUrl() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public String getBackup_url() {
        return this.backup_url;
    }

    public String getMain_url() {
        return this.main_url;
    }

    public String getOid() {
        return this.oid;
    }

    public Long getUrl_expire() {
        return this.url_expire;
    }

    public void setBackup_url(String str) {
        this.backup_url = str;
    }

    public void setMain_url(String str) {
        this.main_url = str;
    }

    public void setOid(String str) {
        this.oid = str;
    }

    public void setUrl_expire(Long l) {
        this.url_expire = l;
    }

    public ResourceUrl(String str, String str2, String str3, Long l) {
        this.oid = str;
        this.main_url = str2;
        this.backup_url = str3;
        this.url_expire = l;
    }

    public /* synthetic */ ResourceUrl(String str, String str2, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }
}
