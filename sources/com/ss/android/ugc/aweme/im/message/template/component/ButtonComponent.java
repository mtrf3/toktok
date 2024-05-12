package com.ss.android.ugc.aweme.im.message.template.component;

import X.C79084V2a;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ButtonComponent extends F9E implements BaseComponent {
    public static final Parcelable.Creator<ButtonComponent> CREATOR = new C79084V2a();
    public final ActionLinkComponent linkComponent;
    public final TextComponent text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text, this.linkComponent};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.text.writeToParcel(out, i);
        this.linkComponent.writeToParcel(out, i);
    }

    public ButtonComponent(TextComponent text, ActionLinkComponent linkComponent) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(linkComponent, "linkComponent");
        this.text = text;
        this.linkComponent = linkComponent;
    }
}
