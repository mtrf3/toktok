package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.C79101V2r;
import X.C79109V2z;
import X.V4Z;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InfoCardTitleBarComponent implements BaseComponent<V4Z> {
    public static final Parcelable.Creator<InfoCardTitleBarComponent> CREATOR = new C79101V2r();
    public final ImageComponent image;
    public final TextComponent title;

    public InfoCardTitleBarComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoCardTitleBarComponent)) {
            return false;
        }
        InfoCardTitleBarComponent infoCardTitleBarComponent = (InfoCardTitleBarComponent) obj;
        return o.LJ(this.title, infoCardTitleBarComponent.title) && o.LJ(this.image, infoCardTitleBarComponent.image);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ImageComponent imageComponent = this.image;
        return hashCode + (imageComponent == null ? 0 : imageComponent.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InfoCardTitleBarComponent(title=");
        LIZ.append(this.title);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.title.writeToParcel(out, i);
        ImageComponent imageComponent = this.image;
        if (imageComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageComponent.writeToParcel(out, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoCardTitleBarComponent(int i) {
        this(C79109V2z.LIZ(), null);
        TextComponent.Companion.getClass();
    }

    public InfoCardTitleBarComponent(TextComponent title, ImageComponent imageComponent) {
        o.LJIIIZ(title, "title");
        this.title = title;
        this.image = imageComponent;
    }
}
