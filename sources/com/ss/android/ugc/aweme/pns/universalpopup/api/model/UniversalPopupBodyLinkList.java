package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UniversalPopupBodyLinkList implements Serializable {

    @InterfaceC65349Pkn("action")
    public final UniversalPopupAction action;

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public UniversalPopupBodyLinkList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UniversalPopupBodyLinkList copy$default(UniversalPopupBodyLinkList universalPopupBodyLinkList, String str, UniversalPopupAction universalPopupAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = universalPopupBodyLinkList.name;
        }
        if ((i & 2) != 0) {
            universalPopupAction = universalPopupBodyLinkList.action;
        }
        return universalPopupBodyLinkList.copy(str, universalPopupAction);
    }

    public final UniversalPopupBodyLinkList copy(String str, UniversalPopupAction action) {
        o.LJIIIZ(action, "action");
        return new UniversalPopupBodyLinkList(str, action);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPopupBodyLinkList)) {
            return false;
        }
        UniversalPopupBodyLinkList universalPopupBodyLinkList = (UniversalPopupBodyLinkList) obj;
        return o.LJ(this.name, universalPopupBodyLinkList.name) && o.LJ(this.action, universalPopupBodyLinkList.action);
    }

    public int hashCode() {
        String str = this.name;
        return this.action.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UniversalPopupBodyLinkList(name=");
        LIZ.append((Object) this.name);
        LIZ.append(", action=");
        LIZ.append(this.action);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final UniversalPopupAction getAction() {
        return this.action;
    }

    public final String getName() {
        return this.name;
    }

    public UniversalPopupBodyLinkList(String str, UniversalPopupAction action) {
        o.LJIIIZ(action, "action");
        this.name = str;
        this.action = action;
    }

    public /* synthetic */ UniversalPopupBodyLinkList(String str, UniversalPopupAction universalPopupAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new UniversalPopupAction(null, null, null, null, 0, null, null, false, null, null, 1023, null) : universalPopupAction);
    }
}
