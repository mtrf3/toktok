package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UniversalPopupResponse extends F9E implements Serializable {

    @InterfaceC65349Pkn("policy_notices")
    public final List<UniversalPopup> popups;

    public UniversalPopupResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalPopupResponse copy$default(UniversalPopupResponse universalPopupResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = universalPopupResponse.popups;
        }
        return universalPopupResponse.copy(list);
    }

    public final UniversalPopupResponse copy(List<UniversalPopup> popups) {
        o.LJIIIZ(popups, "popups");
        return new UniversalPopupResponse(popups);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.popups};
    }

    public final List<UniversalPopup> getPopups() {
        return this.popups;
    }

    public UniversalPopupResponse(List<UniversalPopup> popups) {
        o.LJIIIZ(popups, "popups");
        this.popups = popups;
    }

    public UniversalPopupResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
