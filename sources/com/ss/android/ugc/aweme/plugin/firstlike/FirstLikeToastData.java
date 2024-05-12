package com.ss.android.ugc.aweme.plugin.firstlike;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FirstLikeToastData {

    @InterfaceC65349Pkn("show_duration_ms")
    public final Long showDurationMs;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("toast_text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public FirstLikeToastData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirstLikeToastData)) {
            return false;
        }
        FirstLikeToastData firstLikeToastData = (FirstLikeToastData) obj;
        return o.LJ(this.text, firstLikeToastData.text) && o.LJ(this.style, firstLikeToastData.style) && o.LJ(this.showDurationMs, firstLikeToastData.showDurationMs);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.style;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.showDurationMs;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FirstLikeToastData(text=");
        LIZ.append(this.text);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", showDurationMs=");
        return JBR.LJ(LIZ, this.showDurationMs, ')', LIZ);
    }

    public FirstLikeToastData(String str, Integer num, Long l) {
        this.text = str;
        this.style = num;
        this.showDurationMs = l;
    }

    public /* synthetic */ FirstLikeToastData(String str, Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l);
    }
}
