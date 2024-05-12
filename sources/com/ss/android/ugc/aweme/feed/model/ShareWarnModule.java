package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ShareWarnModule implements Serializable {
    public boolean hasShown;

    @InterfaceC65349Pkn("module_type")
    public final int moduleType;

    @InterfaceC65349Pkn("pop_window")
    public final ShareWarnPopWindow popWindow;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareWarnModule() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareWarnModule copy$default(ShareWarnModule shareWarnModule, int i, ShareWarnPopWindow shareWarnPopWindow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shareWarnModule.moduleType;
        }
        if ((i2 & 2) != 0) {
            shareWarnPopWindow = shareWarnModule.popWindow;
        }
        return shareWarnModule.copy(i, shareWarnPopWindow);
    }

    public final ShareWarnModule copy(int i, ShareWarnPopWindow shareWarnPopWindow) {
        return new ShareWarnModule(i, shareWarnPopWindow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareWarnModule)) {
            return false;
        }
        ShareWarnModule shareWarnModule = (ShareWarnModule) obj;
        return this.moduleType == shareWarnModule.moduleType && o.LJ(this.popWindow, shareWarnModule.popWindow);
    }

    public int hashCode() {
        int i = this.moduleType * 31;
        ShareWarnPopWindow shareWarnPopWindow = this.popWindow;
        return i + (shareWarnPopWindow == null ? 0 : shareWarnPopWindow.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareWarnModule(moduleType=");
        LIZ.append(this.moduleType);
        LIZ.append(", popWindow=");
        LIZ.append(this.popWindow);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean getHasShown() {
        return this.hasShown;
    }

    public final int getModuleType() {
        return this.moduleType;
    }

    public final ShareWarnPopWindow getPopWindow() {
        return this.popWindow;
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public ShareWarnModule(int i, ShareWarnPopWindow shareWarnPopWindow) {
        this.moduleType = i;
        this.popWindow = shareWarnPopWindow;
    }

    public /* synthetic */ ShareWarnModule(int i, ShareWarnPopWindow shareWarnPopWindow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : shareWarnPopWindow);
    }
}
