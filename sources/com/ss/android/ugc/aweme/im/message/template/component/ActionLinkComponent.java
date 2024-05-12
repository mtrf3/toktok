package com.ss.android.ugc.aweme.im.message.template.component;

import X.C221108m2;
import X.C5H3;
import X.C62838OlO;
import X.C62839OlP;
import X.C63685Oz3;
import X.C63713OzV;
import X.C63714OzW;
import X.C63715OzX;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ActionLinkComponent extends F9E implements BaseComponent {
    public final List<String> data;
    public final String displayName;
    public final ActionLinkType linkType;
    public static final C63715OzX Companion = new C63715OzX();
    public static final Parcelable.Creator<ActionLinkComponent> CREATOR = new C62839OlP();
    public static final C5H3<ActionLinkComponent> INVALID_ACTION_LINK$delegate = C221108m2.LIZIZ(C62838OlO.LJLIL);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.data, this.linkType, this.displayName};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.data);
        this.linkType.writeToParcel(out, i);
        out.writeString(this.displayName);
    }

    public final C63714OzW M() {
        C63713OzV c63713OzV = new C63713OzV();
        List<String> list = this.data;
        C63685Oz3.LIZ(list);
        c63713OzV.LIZLLL = list;
        c63713OzV.LJ = this.linkType.m129toProto();
        c63713OzV.LJFF = this.displayName;
        return c63713OzV.build();
    }

    public /* synthetic */ ActionLinkComponent(List list, ActionLinkType actionLinkType) {
        this(list, actionLinkType, "");
    }

    public static ActionLinkComponent L(ActionLinkComponent actionLinkComponent, ActionLinkType linkType) {
        List<String> data = actionLinkComponent.data;
        String displayName = actionLinkComponent.displayName;
        actionLinkComponent.getClass();
        o.LJIIIZ(data, "data");
        o.LJIIIZ(linkType, "linkType");
        o.LJIIIZ(displayName, "displayName");
        return new ActionLinkComponent(data, linkType, displayName);
    }

    public ActionLinkComponent(List<String> data, ActionLinkType linkType, String displayName) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(linkType, "linkType");
        o.LJIIIZ(displayName, "displayName");
        this.data = data;
        this.linkType = linkType;
        this.displayName = displayName;
    }
}
