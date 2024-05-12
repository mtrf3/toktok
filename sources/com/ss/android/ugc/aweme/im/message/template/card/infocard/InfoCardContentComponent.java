package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.C61878OQg;
import X.C79107V2x;
import X.C79109V2z;
import X.F9E;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InfoCardContentComponent extends F9E implements BaseComponent {
    public static final Parcelable.Creator<InfoCardContentComponent> CREATOR = new C79107V2x();
    public final List<TextComponent> contentList;
    public final TextComponent description;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.description, this.contentList};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoCardContentComponent() {
        this(C79109V2z.LIZ(), C61878OQg.INSTANCE);
        TextComponent.Companion.getClass();
    }

    public InfoCardContentComponent(TextComponent description, List<TextComponent> contentList) {
        o.LJIIIZ(description, "description");
        o.LJIIIZ(contentList, "contentList");
        this.description = description;
        this.contentList = contentList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.description.writeToParcel(out, i);
        Iterator LIZJ = UC7.LIZJ(this.contentList, out);
        while (LIZJ.hasNext()) {
            ((TextComponent) LIZJ.next()).writeToParcel(out, i);
        }
    }
}
