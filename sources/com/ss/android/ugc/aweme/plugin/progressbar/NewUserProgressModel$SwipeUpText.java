package com.ss.android.ugc.aweme.plugin.progressbar;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewUserProgressModel$SwipeUpText {

    @InterfaceC65349Pkn("overlay")
    public String overlay;

    @InterfaceC65349Pkn("subtitle")
    public String subTitle;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public NewUserProgressModel$SwipeUpText() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserProgressModel$SwipeUpText)) {
            return false;
        }
        NewUserProgressModel$SwipeUpText newUserProgressModel$SwipeUpText = (NewUserProgressModel$SwipeUpText) obj;
        return o.LJ(this.subTitle, newUserProgressModel$SwipeUpText.subTitle) && o.LJ(this.title, newUserProgressModel$SwipeUpText.title) && o.LJ(this.overlay, newUserProgressModel$SwipeUpText.overlay);
    }

    public final int hashCode() {
        String str = this.subTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.overlay;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SwipeUpText(subTitle=");
        LIZ.append(this.subTitle);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", overlay=");
        return q.LIZIZ(LIZ, this.overlay, ')', LIZ);
    }

    public NewUserProgressModel$SwipeUpText(String str, String str2, String str3) {
        this.subTitle = str;
        this.title = str2;
        this.overlay = str3;
    }

    public /* synthetic */ NewUserProgressModel$SwipeUpText(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
