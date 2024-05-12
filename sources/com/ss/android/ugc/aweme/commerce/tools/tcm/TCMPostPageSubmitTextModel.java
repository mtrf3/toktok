package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.GGL;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TCMPostPageSubmitTextModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TCMPostPageSubmitTextModel> CREATOR = new GGL();

    @InterfaceC65349Pkn("submit_button")
    public String submitButtonText;

    @InterfaceC65349Pkn("submit_title")
    public String submitTitleText;

    /* JADX WARN: Multi-variable type inference failed */
    public TCMPostPageSubmitTextModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TCMPostPageSubmitTextModel(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.submitTitleText);
        out.writeString(this.submitButtonText);
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getSubmitTitleText() {
        return this.submitTitleText;
    }

    public final void setSubmitButtonText(String str) {
        this.submitButtonText = str;
    }

    public final void setSubmitTitleText(String str) {
        this.submitTitleText = str;
    }

    public TCMPostPageSubmitTextModel(String str, String str2) {
        this.submitTitleText = str;
        this.submitButtonText = str2;
    }

    public /* synthetic */ TCMPostPageSubmitTextModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
