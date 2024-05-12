package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AGSWarning implements Serializable {

    @InterfaceC65349Pkn("popup_window")
    public final AGSWarningPopupWindow agsWarningPopupWindow;

    /* JADX WARN: Multi-variable type inference failed */
    public AGSWarning() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AGSWarning copy$default(AGSWarning aGSWarning, AGSWarningPopupWindow aGSWarningPopupWindow, int i, Object obj) {
        if ((i & 1) != 0) {
            aGSWarningPopupWindow = aGSWarning.agsWarningPopupWindow;
        }
        return aGSWarning.copy(aGSWarningPopupWindow);
    }

    public final AGSWarning copy(AGSWarningPopupWindow aGSWarningPopupWindow) {
        return new AGSWarning(aGSWarningPopupWindow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AGSWarning) && o.LJ(this.agsWarningPopupWindow, ((AGSWarning) obj).agsWarningPopupWindow);
    }

    public int hashCode() {
        AGSWarningPopupWindow aGSWarningPopupWindow = this.agsWarningPopupWindow;
        if (aGSWarningPopupWindow == null) {
            return 0;
        }
        return aGSWarningPopupWindow.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AGSWarning(agsWarningPopupWindow=");
        LIZ.append(this.agsWarningPopupWindow);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AGSWarningPopupWindow getAgsWarningPopupWindow() {
        return this.agsWarningPopupWindow;
    }

    public AGSWarning(AGSWarningPopupWindow aGSWarningPopupWindow) {
        this.agsWarningPopupWindow = aGSWarningPopupWindow;
    }

    public /* synthetic */ AGSWarning(AGSWarningPopupWindow aGSWarningPopupWindow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aGSWarningPopupWindow);
    }
}
