package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RTI;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PopupPrompt implements Parcelable {
    public static final Parcelable.Creator<PopupPrompt> CREATOR = new RTI();

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupPrompt)) {
            return false;
        }
        PopupPrompt popupPrompt = (PopupPrompt) obj;
        return o.LJ(this.title, popupPrompt.title) && o.LJ(this.content, popupPrompt.content);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.content);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopupPrompt(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        return q.LIZIZ(LIZ, this.content, ')', LIZ);
    }

    public PopupPrompt(String str, String str2) {
        this.title = str;
        this.content = str2;
    }
}
