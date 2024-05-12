package com.ss.android.ugc.aweme.im.message.template.component;

import X.C221108m2;
import X.C5H3;
import X.C63685Oz3;
import X.C79094V2k;
import X.C79095V2l;
import X.C79135V3z;
import X.C79143V4h;
import X.V2F;
import X.V32;
import X.V35;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ImageComponent implements BaseComponent<C79135V3z> {
    public final String decryptKey;
    public final String displayName;
    public final IconTypeComponent iconType;
    public final String id;
    public final ResolutionComponent resolution;
    public final List<String> urls;
    public static final C79095V2l Companion = new C79095V2l();
    public static final Parcelable.Creator<ImageComponent> CREATOR = new V2F();
    public static final C5H3<ImageComponent> GREY_PLACEHOLDER$delegate = C221108m2.LIZIZ(C79094V2k.LJLIL);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageComponent)) {
            return false;
        }
        ImageComponent imageComponent = (ImageComponent) obj;
        return o.LJ(this.urls, imageComponent.urls) && o.LJ(this.id, imageComponent.id) && o.LJ(this.displayName, imageComponent.displayName) && o.LJ(this.resolution, imageComponent.resolution) && o.LJ(this.decryptKey, imageComponent.decryptKey) && this.iconType == imageComponent.iconType;
    }

    public final int hashCode() {
        int hashCode = this.urls.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ResolutionComponent resolutionComponent = this.resolution;
        int hashCode4 = (hashCode3 + (resolutionComponent == null ? 0 : resolutionComponent.hashCode())) * 31;
        String str3 = this.decryptKey;
        return this.iconType.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageComponent(urls=");
        LIZ.append(this.urls);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", displayName=");
        LIZ.append(this.displayName);
        LIZ.append(", resolution=");
        LIZ.append(this.resolution);
        LIZ.append(", decryptKey=");
        LIZ.append(this.decryptKey);
        LIZ.append(", iconType=");
        LIZ.append(this.iconType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.urls);
        out.writeString(this.id);
        out.writeString(this.displayName);
        ResolutionComponent resolutionComponent = this.resolution;
        if (resolutionComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            resolutionComponent.writeToParcel(out, i);
        }
        out.writeString(this.decryptKey);
        this.iconType.writeToParcel(out, i);
    }

    public final C79135V3z LIZIZ() {
        C79143V4h c79143V4h;
        V32 v32 = new V32();
        List<String> list = this.urls;
        C63685Oz3.LIZ(list);
        v32.LJ = list;
        v32.LIZLLL = this.id;
        v32.LJFF = this.displayName;
        ResolutionComponent resolutionComponent = this.resolution;
        if (resolutionComponent != null) {
            V35 v35 = new V35();
            v35.LIZLLL = Integer.valueOf(resolutionComponent.width);
            v35.LJ = Integer.valueOf(resolutionComponent.height);
            c79143V4h = v35.build();
        } else {
            c79143V4h = null;
        }
        v32.LJI = c79143V4h;
        v32.LJII = this.decryptKey;
        v32.LJIIIIZZ = this.iconType.m130toProto();
        return v32.build();
    }

    public static ImageComponent LIZ(ImageComponent imageComponent, List list, IconTypeComponent iconTypeComponent, int i) {
        String str;
        String str2;
        ResolutionComponent resolutionComponent;
        IconTypeComponent iconType = iconTypeComponent;
        List urls = list;
        if ((i & 1) != 0) {
            urls = imageComponent.urls;
        }
        String str3 = null;
        if ((i & 2) != 0) {
            str = imageComponent.id;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = imageComponent.displayName;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            resolutionComponent = imageComponent.resolution;
        } else {
            resolutionComponent = null;
        }
        if ((i & 16) != 0) {
            str3 = imageComponent.decryptKey;
        }
        if ((i & 32) != 0) {
            iconType = imageComponent.iconType;
        }
        imageComponent.getClass();
        o.LJIIIZ(urls, "urls");
        o.LJIIIZ(iconType, "iconType");
        return new ImageComponent((List<String>) urls, str, str2, resolutionComponent, str3, iconType);
    }

    public /* synthetic */ ImageComponent(List list, String str, ResolutionComponent resolutionComponent, String str2, IconTypeComponent iconTypeComponent, int i) {
        this((List<String>) list, (i & 2) != 0 ? null : str, (String) null, (i & 8) != 0 ? null : resolutionComponent, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? IconTypeComponent.DEFAULT : iconTypeComponent);
    }

    public ImageComponent(List<String> urls, String str, String str2, ResolutionComponent resolutionComponent, String str3, IconTypeComponent iconType) {
        o.LJIIIZ(urls, "urls");
        o.LJIIIZ(iconType, "iconType");
        this.urls = urls;
        this.id = str;
        this.displayName = str2;
        this.resolution = resolutionComponent;
        this.decryptKey = str3;
        this.iconType = iconType;
    }
}
