package com.ss.android.ugc.aweme.poi;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NearbyTag implements Serializable {

    @InterfaceC65349Pkn("text")
    public String text;

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyTag() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NearbyTag copy$default(NearbyTag nearbyTag, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nearbyTag.text;
        }
        return nearbyTag.copy(str);
    }

    public final NearbyTag copy(String str) {
        return new NearbyTag(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NearbyTag) && o.LJ(this.text, ((NearbyTag) obj).text);
    }

    public int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyTag(text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public final String getText() {
        return this.text;
    }

    public NearbyTag(String str) {
        this.text = str;
    }

    public /* synthetic */ NearbyTag(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
