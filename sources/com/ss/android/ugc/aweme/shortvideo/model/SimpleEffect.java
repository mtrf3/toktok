package com.ss.android.ugc.aweme.shortvideo.model;

import X.C05040Hs;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SimpleEffect extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<SimpleEffect> CREATOR = new Creator();

    @InterfaceC65349Pkn(alternate = {"designer_uid"}, value = "designerUid")
    public final String designerUid;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn(alternate = {"icon_url"}, value = "iconUrl")
    public final UrlModel iconUrl;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("publishTime")
    public final Long publishTime;

    @InterfaceC65349Pkn(alternate = {"resource_id"}, value = "resourceId")
    public final String resourceId;

    @InterfaceC65349Pkn("types")
    public final List<String> types;

    /* loaded from: classes8.dex */
    public static class Creator implements Parcelable.Creator<SimpleEffect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleEffect createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new SimpleEffect((UrlModel) in.readSerializable(), in.readString(), in.readString(), in.readString(), in.createStringArrayList(), in.readString(), in.readInt() != 0 ? Long.valueOf(in.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleEffect[] newArray(int i) {
            return new SimpleEffect[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleEffect copy$default(SimpleEffect simpleEffect, UrlModel urlModel, String str, String str2, String str3, List list, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = simpleEffect.iconUrl;
        }
        if ((i & 2) != 0) {
            str = simpleEffect.name;
        }
        if ((i & 4) != 0) {
            str2 = simpleEffect.extra;
        }
        if ((i & 8) != 0) {
            str3 = simpleEffect.designerUid;
        }
        if ((i & 16) != 0) {
            list = simpleEffect.types;
        }
        if ((i & 32) != 0) {
            str4 = simpleEffect.resourceId;
        }
        if ((i & 64) != 0) {
            l = simpleEffect.publishTime;
        }
        return simpleEffect.copy(urlModel, str, str2, str3, list, str4, l);
    }

    public final SimpleEffect copy(UrlModel iconUrl, String name, String str, String str2, List<String> list, String str3, Long l) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(name, "name");
        return new SimpleEffect(iconUrl, name, str, str2, list, str3, l);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.iconUrl, this.name, this.extra, this.designerUid, this.types, this.resourceId, this.publishTime};
    }

    public final String getDesignerUid() {
        return this.designerUid;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getPublishTime() {
        return this.publishTime;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeSerializable(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.extra);
        parcel.writeString(this.designerUid);
        parcel.writeStringList(this.types);
        parcel.writeString(this.resourceId);
        Long l = this.publishTime;
        if (l != null) {
            C05040Hs.LIZLLL(parcel, 1, l);
        } else {
            parcel.writeInt(0);
        }
    }

    public SimpleEffect(UrlModel iconUrl, String name, String str, String str2, List<String> list, String str3, Long l) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(name, "name");
        this.iconUrl = iconUrl;
        this.name = name;
        this.extra = str;
        this.designerUid = str2;
        this.types = list;
        this.resourceId = str3;
        this.publishTime = l;
    }

    public /* synthetic */ SimpleEffect(UrlModel urlModel, String str, String str2, String str3, List list, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(urlModel, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? l : null);
    }
}
