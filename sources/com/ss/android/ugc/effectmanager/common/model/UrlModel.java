package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class UrlModel extends UrlModelTemplate {
    public final transient com.ss.ugc.effectplatform.model.UrlModel urlModel;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<UrlModel> CREATOR = new Parcelable.Creator<UrlModel>() { // from class: com.ss.android.ugc.effectmanager.common.model.UrlModel$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UrlModel createFromParcel(Parcel parcel) {
            Object obj;
            o.LJIIJ(parcel, "parcel");
            com.ss.ugc.effectplatform.model.UrlModel urlModel = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.UrlModel.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.UrlModel)) {
                    obj = null;
                }
                urlModel = (com.ss.ugc.effectplatform.model.UrlModel) obj;
            } catch (Exception e) {
                EPLog.e("createFromParcel", "get creator failed!", e);
            }
            return new UrlModel(urlModel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UrlModel[] newArray(int i) {
            return new UrlModel[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public UrlModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public String getMd5() {
        String md5;
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null && (md5 = urlModel.getMd5()) != null) {
            return md5;
        }
        return super.getMd5();
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public String getUri() {
        String uri;
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null && (uri = urlModel.getUri()) != null) {
            return uri;
        }
        return super.getUri();
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public List<String> getUrlList() {
        return super.getUrlList();
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public List<String> getUrl_list() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null && (url_list = urlModel.getUrl_list()) != null) {
            return url_list;
        }
        return super.getUrl_list();
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null && (url_prefix = urlModel.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public Integer getUrl_sub_type() {
        Integer url_sub_type;
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null && (url_sub_type = urlModel.getUrl_sub_type()) != null) {
            return url_sub_type;
        }
        return super.getUrl_sub_type();
    }

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public com.ss.ugc.effectplatform.model.UrlModel getUrlModel() {
        return this.urlModel;
    }

    public UrlModel(com.ss.ugc.effectplatform.model.UrlModel urlModel) {
        super(urlModel);
        this.urlModel = urlModel;
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            String md5 = urlModel2.getMd5();
            if (md5 != null) {
                super.setMd5(md5);
            }
            String uri = urlModel2.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = urlModel2.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
            List<String> url_prefix = urlModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            Integer url_sub_type = urlModel2.getUrl_sub_type();
            if (url_sub_type != null) {
                super.setUrl_sub_type(Integer.valueOf(url_sub_type.intValue()));
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setMd5(String str) {
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null) {
            urlModel.setMd5(str);
        }
        super.setMd5(str);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUri(String str) {
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null) {
            urlModel.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public void setUrlList(List<String> value) {
        o.LJIIJ(value, "value");
        super.setUrlList(value);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUrl_list(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null) {
            urlModel.setUrl_list(value);
        }
        super.setUrl_list(value);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUrl_prefix(List<String> list) {
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null) {
            urlModel.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public void setUrl_sub_type(Integer num) {
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null) {
            urlModel.setUrl_sub_type(num);
        }
        super.setUrl_sub_type(num);
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.UrlModelTemplate, com.ss.ugc.effectplatform.model.UrlModel, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIJ(dest, "dest");
        if (getUrlModel() != null) {
            com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
            if (urlModel != null) {
                urlModel.writeToParcel(dest, i);
                return;
            }
            return;
        }
        super.writeToParcel(dest, i);
    }

    public /* synthetic */ UrlModel(com.ss.ugc.effectplatform.model.UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel);
    }
}
