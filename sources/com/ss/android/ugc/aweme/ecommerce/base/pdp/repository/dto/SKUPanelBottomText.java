package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.PSZ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SKUPanelBottomText implements Parcelable {
    public static final Parcelable.Creator<SKUPanelBottomText> CREATOR = new PSZ();

    @InterfaceC65349Pkn("arguments")
    public final Map<String, String> arguments;

    @InterfaceC65349Pkn("text")
    public final String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SKUPanelBottomText)) {
            return false;
        }
        SKUPanelBottomText sKUPanelBottomText = (SKUPanelBottomText) obj;
        return o.LJ(this.text, sKUPanelBottomText.text) && o.LJ(this.arguments, sKUPanelBottomText.arguments);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.arguments;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        Map<String, String> map = this.arguments;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SKUPanelBottomText(text=");
        LIZ.append(this.text);
        LIZ.append(", arguments=");
        return C15890jp.LIZ(LIZ, this.arguments, ')', LIZ);
    }

    public SKUPanelBottomText(String str, Map<String, String> map) {
        this.text = str;
        this.arguments = map;
    }
}
