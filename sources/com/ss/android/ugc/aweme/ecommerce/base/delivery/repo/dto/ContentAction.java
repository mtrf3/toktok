package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C1FJ;
import X.C27482AqU;
import X.C27483AqV;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentAction implements Parcelable {

    @InterfaceC65349Pkn("richPopup")
    public final ContentRichPopup richPopup;

    @InterfaceC65349Pkn("type")
    public final Integer type;
    public static final C27483AqV Companion = new C27483AqV();
    public static final Parcelable.Creator<ContentAction> CREATOR = new C27482AqU();

    /* JADX WARN: Multi-variable type inference failed */
    public ContentAction() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentAction)) {
            return false;
        }
        ContentAction contentAction = (ContentAction) obj;
        return o.LJ(this.type, contentAction.type) && o.LJ(this.richPopup, contentAction.richPopup);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ContentRichPopup contentRichPopup = this.richPopup;
        return hashCode + (contentRichPopup != null ? contentRichPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentAction(type=");
        LIZ.append(this.type);
        LIZ.append(", richPopup=");
        LIZ.append(this.richPopup);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ContentAction(Integer num, ContentRichPopup contentRichPopup) {
        this.type = num;
        this.richPopup = contentRichPopup;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        ContentRichPopup contentRichPopup = this.richPopup;
        if (contentRichPopup == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            contentRichPopup.writeToParcel(out, i);
        }
    }

    public /* synthetic */ ContentAction(Integer num, ContentRichPopup contentRichPopup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : contentRichPopup);
    }
}
