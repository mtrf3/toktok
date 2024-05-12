package com.ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ResourceListModel extends ResourceListModelTemplate implements Serializable, Parcelable {
    public final transient com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ResourceListModel> CREATOR = new Parcelable.Creator<ResourceListModel>() { // from class: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResourceListModel createFromParcel(Parcel parcel) {
            Object obj;
            o.LJIIJ(parcel, "parcel");
            com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.ResourceListModel.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.ResourceListModel)) {
                    obj = null;
                }
                resourceListModel = (com.ss.ugc.effectplatform.model.ResourceListModel) obj;
            } catch (Exception e) {
                EPLog.e("createFromParcel", "get creator failed!", e);
            }
            return new ResourceListModel(resourceListModel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResourceListModel[] newArray(int i) {
            return new ResourceListModel[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceListModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* loaded from: classes7.dex */
    public static final class ResourceListBean extends ResourceListModelTemplate.ResourceListBeanTemplate implements Serializable, Parcelable {
        public final transient ResourceListModel.ResourceListBean kResourceBean;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<ResourceListBean> CREATOR = new Parcelable.Creator<ResourceListBean>() { // from class: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResourceListModel.ResourceListBean createFromParcel(Parcel parcel) {
                Object obj;
                o.LJIIJ(parcel, "parcel");
                ResourceListModel.ResourceListBean resourceListBean = null;
                try {
                    Object obj2 = ResourceListModel.ResourceListBean.class.getField("CREATOR").get(null);
                    if (!(obj2 instanceof Parcelable.Creator)) {
                        obj2 = null;
                    }
                    Parcelable.Creator creator = (Parcelable.Creator) obj2;
                    if (creator != null) {
                        obj = creator.createFromParcel(parcel);
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof ResourceListModel.ResourceListBean)) {
                        obj = null;
                    }
                    resourceListBean = (ResourceListModel.ResourceListBean) obj;
                } catch (Exception e) {
                    EPLog.e("createFromParcel", "get creator failed!", e);
                }
                return new ResourceListModel.ResourceListBean(resourceListBean);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ResourceListModel.ResourceListBean[] newArray(int i) {
                return new ResourceListModel.ResourceListBean[i];
            }
        };

        /* JADX WARN: Multi-variable type inference failed */
        public ResourceListBean() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public String getName() {
            String name;
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null && (name = kResourceBean.getName()) != null) {
                return name;
            }
            return super.getName();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public String getResourceUrl() {
            return super.getResourceUrl();
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public String getResource_uri() {
            String resource_uri;
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null && (resource_uri = kResourceBean.getResource_uri()) != null) {
                return resource_uri;
            }
            return super.getResource_uri();
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public String getValue() {
            String value;
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null && (value = kResourceBean.getValue()) != null) {
                return value;
            }
            return super.getValue();
        }

        /* loaded from: classes7.dex */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public ResourceListModel.ResourceListBean getKResourceBean() {
            return this.kResourceBean;
        }

        public ResourceListBean(ResourceListModel.ResourceListBean resourceListBean) {
            super(resourceListBean);
            this.kResourceBean = resourceListBean;
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null) {
                String name = kResourceBean.getName();
                if (name != null) {
                    super.setName(name);
                }
                String resource_uri = kResourceBean.getResource_uri();
                if (resource_uri != null) {
                    super.setResource_uri(resource_uri);
                }
                String value = kResourceBean.getValue();
                if (value != null) {
                    super.setValue(value);
                }
            }
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public void setName(String str) {
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null) {
                kResourceBean.setName(str);
            }
            super.setName(str);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.ResourceListBeanTemplate
        public void setResourceUrl(String str) {
            super.setResourceUrl(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public void setResource_uri(String str) {
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null) {
                kResourceBean.setResource_uri(str);
            }
            super.setResource_uri(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean
        public void setValue(String str) {
            ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
            if (kResourceBean != null) {
                kResourceBean.setValue(str);
            }
            super.setValue(str);
        }

        @Override // com.ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean, android.os.Parcelable
        public void writeToParcel(Parcel dest, int i) {
            o.LJIIJ(dest, "dest");
            if (getKResourceBean() != null) {
                ResourceListModel.ResourceListBean kResourceBean = getKResourceBean();
                if (kResourceBean != null) {
                    kResourceBean.writeToParcel(dest, i);
                    return;
                }
                return;
            }
            super.writeToParcel(dest, i);
        }

        public /* synthetic */ ResourceListBean(ResourceListModel.ResourceListBean resourceListBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : resourceListBean);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public String getIconUri() {
        return super.getIconUri();
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public String getIcon_uri() {
        String icon_uri;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null && (icon_uri = kResourceModel.getIcon_uri()) != null) {
            return icon_uri;
        }
        return super.getIcon_uri();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public String getParam() {
        return super.getParam();
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public String getParams() {
        String params;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null && (params = kResourceModel.getParams()) != null) {
            return params;
        }
        return super.getParams();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public List<ResourceListBean> getResourceList() {
        return super.getResourceList();
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public List<ResourceListModel.ResourceListBean> getResource_list() {
        List<ResourceListModel.ResourceListBean> resource_list;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null && (resource_list = kResourceModel.getResource_list()) != null) {
            return resource_list;
        }
        return super.getResource_list();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null && (url_prefix = kResourceModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public com.ss.ugc.effectplatform.model.ResourceListModel getKResourceModel() {
        return this.kResourceModel;
    }

    public ResourceListModel(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel) {
        super(resourceListModel);
        this.kResourceModel = resourceListModel;
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            String icon_uri = kResourceModel.getIcon_uri();
            if (icon_uri != null) {
                super.setIcon_uri(icon_uri);
            }
            String params = kResourceModel.getParams();
            if (params != null) {
                super.setParams(params);
            }
            List<ResourceListModel.ResourceListBean> resource_list = kResourceModel.getResource_list();
            if (resource_list != null) {
                super.setResource_list(resource_list);
            }
            List<String> url_prefix = kResourceModel.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setIconUri(String str) {
        super.setIconUri(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setIcon_uri(String str) {
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setIcon_uri(str);
        }
        super.setIcon_uri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setParam(String str) {
        super.setParam(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setParams(String str) {
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setParams(str);
        }
        super.setParams(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setResourceList(List<ResourceListBean> value) {
        o.LJIIJ(value, "value");
        super.setResourceList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setResource_list(List<? extends ResourceListModel.ResourceListBean> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setResource_list(value);
        }
        super.setResource_list(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate
    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        super.setUrlPrefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel
    public void setUrl_prefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
        if (kResourceModel != null) {
            kResourceModel.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    @Override // com.ss.ugc.effectplatform.model.ResourceListModel, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIJ(dest, "dest");
        if (getKResourceModel() != null) {
            com.ss.ugc.effectplatform.model.ResourceListModel kResourceModel = getKResourceModel();
            if (kResourceModel != null) {
                kResourceModel.writeToParcel(dest, i);
                return;
            }
            return;
        }
        super.writeToParcel(dest, i);
    }

    public /* synthetic */ ResourceListModel(com.ss.ugc.effectplatform.model.ResourceListModel resourceListModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resourceListModel);
    }
}
