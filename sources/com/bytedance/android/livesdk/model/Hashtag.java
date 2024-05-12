package com.bytedance.android.livesdk.model;

import X.BIE;
import X.BIF;
import X.C05040Hs;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Hashtag extends F9E implements Parcelable {

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("namespace")
    public int namespace;

    @InterfaceC65349Pkn("title")
    public String title;
    public static final BIF Companion = new BIF();
    public static final Parcelable.Creator<Hashtag> CREATOR = new BIE();

    /* JADX WARN: Multi-variable type inference failed */
    public Hashtag() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, this.title, this.image};
    }

    public final boolean isHotGaming() {
        if (this.namespace == 1) {
            return true;
        }
        return false;
    }

    public final boolean isUseGameTagAsHashTag() {
        Long l = this.id;
        if ((l != null && l.longValue() == 5) || this.namespace == 1) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        Long l = this.id;
        if (l != null) {
            C05040Hs.LIZLLL(parcel, 1, l);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.title);
        parcel.writeParcelable(this.image, i);
        parcel.writeInt(this.namespace);
    }

    public Hashtag(Long l, String str, ImageModel imageModel, int i) {
        this.id = l;
        this.title = str;
        this.image = imageModel;
        this.namespace = i;
    }

    public /* synthetic */ Hashtag(Long l, String str, ImageModel imageModel, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : l, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : imageModel, (i2 & 8) != 0 ? 0 : i);
    }
}
