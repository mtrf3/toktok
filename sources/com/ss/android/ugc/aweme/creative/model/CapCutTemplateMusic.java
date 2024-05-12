package com.ss.android.ugc.aweme.creative.model;

import X.C43677HCf;
import X.F9E;
import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CapCutTemplateMusic extends F9E implements Parcelable {
    public static final Parcelable.Creator<CapCutTemplateMusic> CREATOR = new C43677HCf();

    @GPV
    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    /* JADX WARN: Multi-variable type inference failed */
    public CapCutTemplateMusic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.templateId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.templateId);
    }

    public CapCutTemplateMusic(String templateId) {
        o.LJIIIZ(templateId, "templateId");
        this.templateId = templateId;
    }

    public /* synthetic */ CapCutTemplateMusic(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
