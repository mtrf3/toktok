package com.ss.android.ugc.aweme.creative.model;

import X.C36435ERr;
import X.F9E;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UploadableMobileEffect extends F9E implements Parcelable {
    public static final Parcelable.Creator<UploadableMobileEffect> CREATOR = new C36435ERr();

    @InterfaceC65349Pkn("effectId")
    public final String effectId;

    @InterfaceC65349Pkn("effectName")
    public final String effectName;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("iconFilePath")
    public final String iconFilePath;

    @InterfaceC65349Pkn("selectedMedia")
    public final String selectedMedia;

    @InterfaceC65349Pkn("templateEffectId")
    public final String templateEffectId;

    @InterfaceC65349Pkn("templateResourceId")
    public final String templateResourceId;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("zipFilePath")
    public final String zipFilePath;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadableMobileEffect() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.effectId, this.effectName, this.iconFilePath, this.zipFilePath, this.templateResourceId, this.templateEffectId, this.selectedMedia};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.effectId);
        out.writeString(this.effectName);
        out.writeString(this.iconFilePath);
        out.writeString(this.zipFilePath);
        out.writeString(this.templateResourceId);
        out.writeString(this.templateEffectId);
        out.writeString(this.selectedMedia);
    }

    public UploadableMobileEffect(String effectId, String effectName, String iconFilePath, String zipFilePath, String templateResourceId, String templateEffectId, String selectedMedia) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(iconFilePath, "iconFilePath");
        o.LJIIIZ(zipFilePath, "zipFilePath");
        o.LJIIIZ(templateResourceId, "templateResourceId");
        o.LJIIIZ(templateEffectId, "templateEffectId");
        o.LJIIIZ(selectedMedia, "selectedMedia");
        this.effectId = effectId;
        this.effectName = effectName;
        this.iconFilePath = iconFilePath;
        this.zipFilePath = zipFilePath;
        this.templateResourceId = templateResourceId;
        this.templateEffectId = templateEffectId;
        this.selectedMedia = selectedMedia;
    }

    public /* synthetic */ UploadableMobileEffect(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "");
    }
}
