package com.ss.android.ugc.aweme.badge;

import X.C35630Dyc;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EditProfileBadgeState implements InterfaceC61312at {
    public static final int $stable = 8;
    public final C35630Dyc result;

    /* JADX WARN: Multi-variable type inference failed */
    public EditProfileBadgeState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EditProfileBadgeState copy$default(EditProfileBadgeState editProfileBadgeState, C35630Dyc c35630Dyc, int i, Object obj) {
        if ((i & 1) != 0) {
            c35630Dyc = editProfileBadgeState.result;
        }
        return editProfileBadgeState.copy(c35630Dyc);
    }

    public final EditProfileBadgeState copy(C35630Dyc c35630Dyc) {
        return new EditProfileBadgeState(c35630Dyc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditProfileBadgeState) && o.LJ(this.result, ((EditProfileBadgeState) obj).result);
    }

    public int hashCode() {
        C35630Dyc c35630Dyc = this.result;
        if (c35630Dyc == null) {
            return 0;
        }
        return c35630Dyc.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditProfileBadgeState(result=");
        LIZ.append(this.result);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final C35630Dyc getResult() {
        return this.result;
    }

    public EditProfileBadgeState(C35630Dyc c35630Dyc) {
        this.result = c35630Dyc;
    }

    public /* synthetic */ EditProfileBadgeState(C35630Dyc c35630Dyc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c35630Dyc);
    }
}
