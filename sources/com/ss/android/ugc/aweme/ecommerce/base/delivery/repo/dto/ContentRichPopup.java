package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27481AqT;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentRichPopup implements Parcelable {
    public static final Parcelable.Creator<ContentRichPopup> CREATOR = new C27481AqT();

    @InterfaceC65349Pkn("buttons")
    public final ArrayList<ContentPopupButton> buttons;

    @InterfaceC65349Pkn("contents")
    public final List<ContentPlaceholderRichText> contents;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentRichPopup() {
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
        if (!(obj instanceof ContentRichPopup)) {
            return false;
        }
        ContentRichPopup contentRichPopup = (ContentRichPopup) obj;
        return o.LJ(this.title, contentRichPopup.title) && o.LJ(this.contents, contentRichPopup.contents) && o.LJ(this.buttons, contentRichPopup.buttons);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ContentPlaceholderRichText> list = this.contents;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ArrayList<ContentPopupButton> arrayList = this.buttons;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentRichPopup(title=");
        LIZ.append(this.title);
        LIZ.append(", contents=");
        LIZ.append(this.contents);
        LIZ.append(", buttons=");
        LIZ.append(this.buttons);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        List<ContentPlaceholderRichText> list = this.contents;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ContentPlaceholderRichText) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        ArrayList<ContentPopupButton> arrayList = this.buttons;
        if (arrayList == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(arrayList.size());
        Iterator<ContentPopupButton> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
    }

    public ContentRichPopup(String str, List<ContentPlaceholderRichText> list, ArrayList<ContentPopupButton> arrayList) {
        this.title = str;
        this.contents = list;
        this.buttons = arrayList;
    }

    public /* synthetic */ ContentRichPopup(String str, List list, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : arrayList);
    }
}
