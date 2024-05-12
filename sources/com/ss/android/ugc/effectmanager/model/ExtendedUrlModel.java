package com.ss.android.ugc.effectmanager.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ExtendedUrlModel extends ExtendedUrlModelTemplate {
    public final transient com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedUrlModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public String getUri() {
        String uri;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null && (uri = kUrlModel.getUri()) != null) {
            return uri;
        }
        return super.getUri();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public List<String> getUrlList() {
        return super.getUrlList();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public List<String> getUrl_list() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null && (url_list = kUrlModel.getUrl_list()) != null) {
            return url_list;
        }
        return super.getUrl_list();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public List<String> getZipUrlList() {
        return super.getZipUrlList();
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public List<String> getZip_url_list() {
        List<String> zip_url_list;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null && (zip_url_list = kUrlModel.getZip_url_list()) != null) {
            return zip_url_list;
        }
        return super.getZip_url_list();
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    public ExtendedUrlModel(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel) {
        super(extendedUrlModel);
        this.kUrlModel = extendedUrlModel;
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null) {
            String uri = kUrlModel.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = kUrlModel.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
            List<String> zip_url_list = kUrlModel.getZip_url_list();
            if (zip_url_list != null) {
                super.setZip_url_list(zip_url_list);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public void setUri(String str) {
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null) {
            kUrlModel.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public void setUrlList(List<String> value) {
        o.LJIIJ(value, "value");
        super.setUrlList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public void setUrl_list(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null) {
            kUrlModel.setUrl_list(value);
        }
        super.setUrl_list(value);
    }

    @Override // com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public void setZipUrlList(List<String> value) {
        o.LJIIJ(value, "value");
        super.setZipUrlList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public void setZip_url_list(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel = getKUrlModel();
        if (kUrlModel != null) {
            kUrlModel.setZip_url_list(value);
        }
        super.setZip_url_list(value);
    }

    public /* synthetic */ ExtendedUrlModel(com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extendedUrlModel);
    }
}
