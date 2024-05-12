package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.InterfaceC65349Pkn;
import X.S4Z;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SaveTemplateResponse implements Parcelable {
    public static final Parcelable.Creator<SaveTemplateResponse> CREATOR = new S4Z();

    @InterfaceC65349Pkn("review_msg")
    public final String reviewMsg;

    @InterfaceC65349Pkn("review_status")
    public final int reviewStatus;

    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveTemplateResponse)) {
            return false;
        }
        SaveTemplateResponse saveTemplateResponse = (SaveTemplateResponse) obj;
        return o.LJ(this.templateId, saveTemplateResponse.templateId) && this.reviewStatus == saveTemplateResponse.reviewStatus && o.LJ(this.reviewMsg, saveTemplateResponse.reviewMsg);
    }

    public final int hashCode() {
        String str = this.templateId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reviewStatus) * 31;
        String str2 = this.reviewMsg;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.templateId);
        out.writeInt(this.reviewStatus);
        out.writeString(this.reviewMsg);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveTemplateResponse(templateId=");
        LIZ.append(this.templateId);
        LIZ.append(", reviewStatus=");
        LIZ.append(this.reviewStatus);
        LIZ.append(", reviewMsg=");
        return q.LIZIZ(LIZ, this.reviewMsg, ')', LIZ);
    }

    public SaveTemplateResponse(String str, int i, String str2) {
        this.templateId = str;
        this.reviewStatus = i;
        this.reviewMsg = str2;
    }
}
