package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AwemeActivityButton implements Serializable {

    @InterfaceC65349Pkn("color")
    public String color;

    @InterfaceC65349Pkn("label")
    public String label;

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeActivityButton() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AwemeActivityButton copy$default(AwemeActivityButton awemeActivityButton, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeActivityButton.label;
        }
        if ((i & 2) != 0) {
            str2 = awemeActivityButton.color;
        }
        return awemeActivityButton.copy(str, str2);
    }

    public final AwemeActivityButton copy(String str, String str2) {
        return new AwemeActivityButton(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivityButton)) {
            return false;
        }
        AwemeActivityButton awemeActivityButton = (AwemeActivityButton) obj;
        return o.LJ(this.label, awemeActivityButton.label) && o.LJ(this.color, awemeActivityButton.color);
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeActivityButton(label=");
        LIZ.append(this.label);
        LIZ.append(", color=");
        return q.LIZIZ(LIZ, this.color, ')', LIZ);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public AwemeActivityButton(String str, String str2) {
        this.label = str;
        this.color = str2;
    }

    public /* synthetic */ AwemeActivityButton(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
