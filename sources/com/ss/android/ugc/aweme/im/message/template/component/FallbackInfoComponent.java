package com.ss.android.ugc.aweme.im.message.template.component;

import X.C221108m2;
import X.C5H3;
import X.C79096V2m;
import X.C79097V2n;
import X.V2Y;
import X.V4Q;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class FallbackInfoComponent implements BaseComponent<V4Q> {
    public final ImageComponent imageComponent;
    public final ActionLinkComponent linkComponent;
    public final TextComponent textComponent;
    public static final C79097V2n Companion = new C79097V2n();
    public static final Parcelable.Creator<FallbackInfoComponent> CREATOR = new V2Y();
    public static final C5H3<BaseRequestComponent> EMPTY_BASE_REQUEST$delegate = C221108m2.LIZIZ(C79096V2m.LJLIL);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FallbackInfoComponent)) {
            return false;
        }
        FallbackInfoComponent fallbackInfoComponent = (FallbackInfoComponent) obj;
        return o.LJ(this.textComponent, fallbackInfoComponent.textComponent) && o.LJ(this.linkComponent, fallbackInfoComponent.linkComponent) && o.LJ(this.imageComponent, fallbackInfoComponent.imageComponent);
    }

    public final int hashCode() {
        TextComponent textComponent = this.textComponent;
        int hashCode = (textComponent == null ? 0 : textComponent.hashCode()) * 31;
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        int hashCode2 = (hashCode + (actionLinkComponent == null ? 0 : actionLinkComponent.hashCode())) * 31;
        ImageComponent imageComponent = this.imageComponent;
        return hashCode2 + (imageComponent != null ? imageComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FallbackInfoComponent(textComponent=");
        LIZ.append(this.textComponent);
        LIZ.append(", linkComponent=");
        LIZ.append(this.linkComponent);
        LIZ.append(", imageComponent=");
        LIZ.append(this.imageComponent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        TextComponent textComponent = this.textComponent;
        if (textComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent.writeToParcel(out, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        if (actionLinkComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            actionLinkComponent.writeToParcel(out, i);
        }
        ImageComponent imageComponent = this.imageComponent;
        if (imageComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageComponent.writeToParcel(out, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FallbackInfoComponent() {
        /*
            r3 = this;
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r2 = X.C79109V2z.LIZ()
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r1 = X.C63715OzX.LIZ()
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = X.C79095V2l.LIZ()
            r3.<init>(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent.<init>():void");
    }

    public FallbackInfoComponent(ActionLinkComponent actionLinkComponent, ImageComponent imageComponent, TextComponent textComponent) {
        this.textComponent = textComponent;
        this.linkComponent = actionLinkComponent;
        this.imageComponent = imageComponent;
    }
}
