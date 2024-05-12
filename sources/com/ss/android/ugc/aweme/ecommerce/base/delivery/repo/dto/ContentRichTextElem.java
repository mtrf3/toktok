package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C1FJ;
import X.C27478AqQ;
import X.C27479AqR;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentRichTextElem implements Parcelable {

    @InterfaceC65349Pkn("popup")
    public final ContentPopup popup;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final Integer type;
    public static final C27479AqR Companion = new C27479AqR();
    public static final Parcelable.Creator<ContentRichTextElem> CREATOR = new C27478AqQ();

    /* JADX WARN: Multi-variable type inference failed */
    public ContentRichTextElem() {
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
        if (!(obj instanceof ContentRichTextElem)) {
            return false;
        }
        ContentRichTextElem contentRichTextElem = (ContentRichTextElem) obj;
        return o.LJ(this.type, contentRichTextElem.type) && o.LJ(this.text, contentRichTextElem.text) && o.LJ(this.popup, contentRichTextElem.popup);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ContentPopup contentPopup = this.popup;
        return hashCode2 + (contentPopup != null ? contentPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentRichTextElem(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", popup=");
        LIZ.append(this.popup);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
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
        out.writeString(this.text);
        ContentPopup contentPopup = this.popup;
        if (contentPopup == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            contentPopup.writeToParcel(out, i);
        }
    }

    public ContentRichTextElem(Integer num, String str, ContentPopup contentPopup) {
        this.type = num;
        this.text = str;
        this.popup = contentPopup;
    }

    public /* synthetic */ ContentRichTextElem(Integer num, String str, ContentPopup contentPopup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : contentPopup);
    }
}
