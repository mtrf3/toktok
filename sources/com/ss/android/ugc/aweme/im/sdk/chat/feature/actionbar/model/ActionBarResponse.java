package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.simkit.model.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionBarResponse extends BaseResponse {

    @InterfaceC65349Pkn("action_bar")
    public final ActionBarConf actionBarConf;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ActionBarResponse copy$default(ActionBarResponse actionBarResponse, ActionBarConf actionBarConf, int i, Object obj) {
        if ((i & 1) != 0) {
            actionBarConf = actionBarResponse.actionBarConf;
        }
        return actionBarResponse.copy(actionBarConf);
    }

    public final ActionBarResponse copy(ActionBarConf actionBarConf) {
        return new ActionBarResponse(actionBarConf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionBarResponse) && o.LJ(this.actionBarConf, ((ActionBarResponse) obj).actionBarConf);
    }

    public int hashCode() {
        ActionBarConf actionBarConf = this.actionBarConf;
        if (actionBarConf == null) {
            return 0;
        }
        return actionBarConf.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.simkit.model.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionBarResponse(actionBarConf=");
        LIZ.append(this.actionBarConf);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ActionBarConf getActionBarConf() {
        return this.actionBarConf;
    }

    public ActionBarResponse(ActionBarConf actionBarConf) {
        this.actionBarConf = actionBarConf;
    }

    public /* synthetic */ ActionBarResponse(ActionBarConf actionBarConf, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : actionBarConf);
    }
}
