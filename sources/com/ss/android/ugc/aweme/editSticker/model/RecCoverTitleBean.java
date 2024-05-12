package com.ss.android.ugc.aweme.editSticker.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.RecCoverTitleBean;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class RecCoverTitleBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecCoverTitleBean> CREATOR = new Parcelable.Creator<RecCoverTitleBean>() { // from class: X.6Y1
        @Override // android.os.Parcelable.Creator
        public final RecCoverTitleBean createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return new RecCoverTitleBean(in.readLong(), in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecCoverTitleBean[] newArray(int i) {
            return new RecCoverTitleBean[i];
        }
    };

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("id")
    public long id;

    /* JADX WARN: Multi-variable type inference failed */
    public RecCoverTitleBean() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    public final void setContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.content = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public RecCoverTitleBean(long j, String content) {
        o.LJIIIZ(content, "content");
        this.id = j;
        this.content = content;
    }

    public /* synthetic */ RecCoverTitleBean(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
