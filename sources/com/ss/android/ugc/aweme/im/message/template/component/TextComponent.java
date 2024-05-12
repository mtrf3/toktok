package com.ss.android.ugc.aweme.im.message.template.component;

import X.C221108m2;
import X.C5H3;
import X.C79108V2y;
import X.C79109V2z;
import X.F9E;
import X.RUF;
import X.RUG;
import X.V30;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TextComponent extends F9E implements BaseComponent {
    public final String text;
    public static final C79109V2z Companion = new C79109V2z();
    public static final Parcelable.Creator<TextComponent> CREATOR = new C79108V2y();
    public static final C5H3<TextComponent> EMPTY_TEXT_COMPONENT$delegate = C221108m2.LIZIZ(V30.LJLIL);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
    }

    public final RUF L() {
        RUG rug = new RUG();
        rug.LIZLLL = this.text;
        return rug.build();
    }

    public TextComponent(String text) {
        o.LJIIIZ(text, "text");
        this.text = text;
    }
}
