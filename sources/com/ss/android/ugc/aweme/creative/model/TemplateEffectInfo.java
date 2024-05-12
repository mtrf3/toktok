package com.ss.android.ugc.aweme.creative.model;

import X.C36434ERq;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TemplateEffectInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<TemplateEffectInfo> CREATOR = new C36434ERq();

    @InterfaceC65349Pkn("templateEffectId")
    public final String templateEffectId;

    @InterfaceC65349Pkn("templateResourceId")
    public final String templateResourceId;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateEffectInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.templateResourceId, this.templateEffectId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.templateResourceId);
        out.writeString(this.templateEffectId);
    }

    public TemplateEffectInfo(String templateResourceId, String templateEffectId) {
        o.LJIIIZ(templateResourceId, "templateResourceId");
        o.LJIIIZ(templateEffectId, "templateEffectId");
        this.templateResourceId = templateResourceId;
        this.templateEffectId = templateEffectId;
    }

    public /* synthetic */ TemplateEffectInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
