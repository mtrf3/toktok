package com.ss.ugc.effectplatform.model.algorithm;

import X.C162476Zf;
import X.XA2;
import X.XA3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ExtendedUrlModel {
    public String uri;
    public List<String> url_list;
    public List<String> zip_url_list;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedUrlModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getZip_url_list() {
        return this.zip_url_list;
    }

    public final List<String> getUrl(XA2 type) {
        o.LJIIJ(type, "type");
        int i = XA3.LIZ[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return getUrl_list();
            }
            throw new C162476Zf();
        }
        return getZip_url_list();
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_list = list;
    }

    public void setZip_url_list(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.zip_url_list = list;
    }

    public ExtendedUrlModel(List<String> url_list, String str, List<String> zip_url_list) {
        o.LJIIJ(url_list, "url_list");
        o.LJIIJ(zip_url_list, "zip_url_list");
        this.url_list = url_list;
        this.uri = str;
        this.zip_url_list = zip_url_list;
    }

    public /* synthetic */ ExtendedUrlModel(List list, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
