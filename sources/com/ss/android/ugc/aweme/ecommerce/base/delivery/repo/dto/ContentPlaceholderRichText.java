package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27480AqS;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentPlaceholderRichText implements Parcelable {
    public static final Parcelable.Creator<ContentPlaceholderRichText> CREATOR = new C27480AqS();

    @InterfaceC65349Pkn("action")
    public final ContentAction action;

    @InterfaceC65349Pkn("arguments")
    public final HashMap<String, ContentRichTextElem> arguments;

    @InterfaceC65349Pkn("template")
    public final String template;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentPlaceholderRichText() {
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
        if (!(obj instanceof ContentPlaceholderRichText)) {
            return false;
        }
        ContentPlaceholderRichText contentPlaceholderRichText = (ContentPlaceholderRichText) obj;
        return o.LJ(this.template, contentPlaceholderRichText.template) && o.LJ(this.arguments, contentPlaceholderRichText.arguments) && o.LJ(this.action, contentPlaceholderRichText.action);
    }

    public final int hashCode() {
        String str = this.template;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HashMap<String, ContentRichTextElem> hashMap = this.arguments;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        ContentAction contentAction = this.action;
        return hashCode2 + (contentAction != null ? contentAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentPlaceholderRichText(template=");
        LIZ.append(this.template);
        LIZ.append(", arguments=");
        LIZ.append(this.arguments);
        LIZ.append(", action=");
        LIZ.append(this.action);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.template);
        HashMap<String, ContentRichTextElem> hashMap = this.arguments;
        if (hashMap == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(hashMap.size());
            for (Map.Entry<String, ContentRichTextElem> entry : hashMap.entrySet()) {
                out.writeString(entry.getKey());
                entry.getValue().writeToParcel(out, i);
            }
        }
        ContentAction contentAction = this.action;
        if (contentAction == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            contentAction.writeToParcel(out, i);
        }
    }

    public ContentPlaceholderRichText(String str, HashMap<String, ContentRichTextElem> hashMap, ContentAction contentAction) {
        this.template = str;
        this.arguments = hashMap;
        this.action = contentAction;
    }

    public /* synthetic */ ContentPlaceholderRichText(String str, HashMap hashMap, ContentAction contentAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : hashMap, (i & 4) != 0 ? null : contentAction);
    }
}
