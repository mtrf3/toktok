package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InteractionPermission implements Serializable {

    @InterfaceC65349Pkn("interaction_text")
    public String interactionText;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("disable_toast")
    public String toast;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionPermission() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InteractionPermission copy$default(InteractionPermission interactionPermission, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = interactionPermission.status;
        }
        if ((i2 & 2) != 0) {
            str = interactionPermission.toast;
        }
        if ((i2 & 4) != 0) {
            str2 = interactionPermission.interactionText;
        }
        return interactionPermission.copy(i, str, str2);
    }

    public final InteractionPermission copy(int i, String str, String str2) {
        return new InteractionPermission(i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionPermission)) {
            return false;
        }
        InteractionPermission interactionPermission = (InteractionPermission) obj;
        return this.status == interactionPermission.status && o.LJ(this.toast, interactionPermission.toast) && o.LJ(this.interactionText, interactionPermission.interactionText);
    }

    public int hashCode() {
        int i = this.status * 31;
        String str = this.toast;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interactionText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionPermission(status=");
        LIZ.append(this.status);
        LIZ.append(", toast=");
        LIZ.append(this.toast);
        LIZ.append(", interactionText=");
        return q.LIZIZ(LIZ, this.interactionText, ')', LIZ);
    }

    public final String getInteractionText() {
        return this.interactionText;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getToast() {
        return this.toast;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public InteractionPermission(int i, String str, String str2) {
        this.status = i;
        this.toast = str;
        this.interactionText = str2;
    }

    public /* synthetic */ InteractionPermission(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }
}
