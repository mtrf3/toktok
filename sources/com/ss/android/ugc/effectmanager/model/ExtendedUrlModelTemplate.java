package com.ss.android.ugc.effectmanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ExtendedUrlModelTemplate extends com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel;
    public List<String> urlList;
    public List<String> zipUrlList;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedUrlModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public List<String> getUrlList() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null && (url_list = kUrlModel.getUrl_list()) != null) {
            return url_list;
        }
        return super.getUrl_list();
    }

    public List<String> getZipUrlList() {
        List<String> zip_url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null && (zip_url_list = kUrlModel.getZip_url_list()) != null) {
            return zip_url_list;
        }
        return super.getZip_url_list();
    }

    public com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    public ExtendedUrlModelTemplate(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel) {
        super(null, null, null, 7, null);
        this.kUrlModel = extendedUrlModel;
        this.zipUrlList = new ArrayList();
        this.urlList = new ArrayList();
    }

    public void setUrlList(List<String> value) {
        o.LJIIJ(value, "value");
        this.urlList = value;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null) {
            kUrlModel.setUrl_list(value);
        }
        super.setUrl_list(value);
    }

    public void setZipUrlList(List<String> value) {
        o.LJIIJ(value, "value");
        this.zipUrlList = value;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null) {
            kUrlModel.setZip_url_list(value);
        }
        super.setZip_url_list(value);
    }

    public /* synthetic */ ExtendedUrlModelTemplate(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extendedUrlModel);
    }
}
