package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ResourceListModelTemplate extends ResourceListModel {
    public String iconUri;
    public final transient ResourceListModel kResourceModel;
    public String param;
    public List<ResourceListModel.ResourceListBean> resourceList;
    public List<String> urlPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceListModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* loaded from: classes7.dex */
    public static class ResourceListBeanTemplate extends ResourceListModel.ResourceListBean {
        public final transient ResourceListModel.ResourceListBean kResourceBean;
        public String resourceUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public ResourceListBeanTemplate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public String getResourceUrl() {
            String resource_uri;
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null && (resource_uri = kResourceBean.getResource_uri()) != null) {
                return resource_uri;
            }
            return super.getResource_uri();
        }

        public ResourceListModel.ResourceListBean getKResourceBean() {
            return this.kResourceBean;
        }

        public ResourceListBeanTemplate(ResourceListModel.ResourceListBean resourceListBean) {
            super(null, null, null, 7, null);
            this.kResourceBean = resourceListBean;
        }

        public void setResourceUrl(String str) {
            this.resourceUrl = str;
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null) {
                kResourceBean.setResource_uri(str);
            }
            super.setResource_uri(str);
        }

        public /* synthetic */ ResourceListBeanTemplate(ResourceListModel.ResourceListBean resourceListBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : resourceListBean);
        }
    }

    public String getIconUri() {
        String icon_uri;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null && (icon_uri = kResourceModel.getIcon_uri()) != null) {
            return icon_uri;
        }
        return super.getIcon_uri();
    }

    public String getParam() {
        String params;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null && (params = kResourceModel.getParams()) != null) {
            return params;
        }
        return super.getParams();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean> getResourceList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.ResourceListModel r4 = r5.getKResourceModel()
            if (r4 == 0) goto L52
            java.util.List r1 = r4.getResource_list()
            if (r1 == 0) goto L52
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4c
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean r1 = (com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean) r1
            com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean r0 = new com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean
            r0.<init>(r1)
            r3.add(r0)
            goto L2d
        L42:
            if (r4 == 0) goto L47
            r4.setResource_list(r3)
        L47:
            super.setResource_list(r3)
            r1 = r3
            goto L1d
        L4c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L52:
            java.util.List r1 = super.getResource_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.getResourceList():java.util.List");
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null && (url_prefix = kResourceModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    public com.ss.ugc.effectplatform.model.ResourceListModel getKResourceModel() {
        return this.kResourceModel;
    }

    public ResourceListModelTemplate(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel) {
        super(null, null, null, null, 15, null);
        this.kResourceModel = resourceListModel;
        this.resourceList = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    public void setIconUri(String str) {
        this.iconUri = str;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setIcon_uri(str);
        }
        super.setIcon_uri(str);
    }

    public void setParam(String str) {
        this.param = str;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setParams(str);
        }
        super.setParams(str);
    }

    public void setResourceList(List<ResourceListModel.ResourceListBean> value) {
        o.LJIIJ(value, "value");
        this.resourceList = value;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setResource_list(value);
        }
        super.setResource_list(value);
    }

    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        this.urlPrefix = value;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ ResourceListModelTemplate(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resourceListModel);
    }
}
