package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class UrlModelTemplate extends com.ss.ugc.effectplatform.model.UrlModel implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new Creator();
    public List<String> urlList;
    public final transient com.ss.ugc.effectplatform.model.UrlModel urlModel;

    /* loaded from: classes7.dex */
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            o.LJIIJ(in, "in");
            return new UrlModelTemplate((com.ss.ugc.effectplatform.model.UrlModel) in.readParcelable(UrlModelTemplate.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UrlModelTemplate[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UrlModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void urlList$annotations() {
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        parcel.writeParcelable(this.urlModel, i);
    }

    public List<String> getUrlList() {
        List<String> url_list;
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null && (url_list = urlModel.getUrl_list()) != null) {
            return url_list;
        }
        return super.getUrl_list();
    }

    public final boolean isValid() {
        boolean z;
        List<String> urlList = getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.ugc.effectplatform.model.UrlModel
    public String toString() {
        String urlModel;
        com.ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null && (urlModel = urlModel2.toString()) != null) {
            return urlModel;
        }
        return super.toString();
    }

    public com.ss.ugc.effectplatform.model.UrlModel getUrlModel() {
        return this.urlModel;
    }

    public UrlModelTemplate(com.ss.ugc.effectplatform.model.UrlModel urlModel) {
        super(null, null, null, null, null, 31, null);
        this.urlModel = urlModel;
        this.urlList = new ArrayList();
    }

    public void setUrlList(List<String> value) {
        o.LJIIJ(value, "value");
        this.urlList = value;
        com.ss.ugc.effectplatform.model.UrlModel urlModel = getUrlModel();
        if (urlModel != null) {
            urlModel.setUrl_list(value);
        }
        super.setUrl_list(value);
    }

    public /* synthetic */ UrlModelTemplate(com.ss.ugc.effectplatform.model.UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel);
    }
}
