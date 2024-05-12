package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27476AqO;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentPopup implements Parcelable {
    public static final Parcelable.Creator<ContentPopup> CREATOR = new C27476AqO();

    @InterfaceC65349Pkn("button")
    public final ContentPopupButton button;

    @InterfaceC65349Pkn("contents")
    public final ArrayList<String> contents;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentPopup() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPopup)) {
            return false;
        }
        ContentPopup contentPopup = (ContentPopup) obj;
        return o.LJ(this.title, contentPopup.title) && o.LJ(this.contents, contentPopup.contents) && o.LJ(this.button, contentPopup.button);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<String> arrayList = this.contents;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ContentPopupButton contentPopupButton = this.button;
        return hashCode2 + (contentPopupButton != null ? contentPopupButton.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentPopup(title=");
        LIZ.append(this.title);
        LIZ.append(", contents=");
        LIZ.append(this.contents);
        LIZ.append(", button=");
        LIZ.append(this.button);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeStringList(this.contents);
        ContentPopupButton contentPopupButton = this.button;
        if (contentPopupButton == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            contentPopupButton.writeToParcel(out, i);
        }
    }

    public ContentPopup(String str, ArrayList<String> arrayList, ContentPopupButton contentPopupButton) {
        this.title = str;
        this.contents = arrayList;
        this.button = contentPopupButton;
    }

    public /* synthetic */ ContentPopup(String str, ArrayList arrayList, ContentPopupButton contentPopupButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : contentPopupButton);
    }
}
