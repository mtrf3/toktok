package com.ss.android.ugc.aweme.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DislikeReason {

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("text")
    public String text;

    /* JADX WARN: Multi-variable type inference failed */
    public DislikeReason() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DislikeReason copy$default(DislikeReason dislikeReason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dislikeReason.id;
        }
        if ((i & 2) != 0) {
            str2 = dislikeReason.text;
        }
        return dislikeReason.copy(str, str2);
    }

    public final DislikeReason copy(String str, String str2) {
        return new DislikeReason(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DislikeReason)) {
            return false;
        }
        DislikeReason dislikeReason = (DislikeReason) obj;
        return o.LJ(this.id, dislikeReason.id) && o.LJ(this.text, dislikeReason.text);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DislikeReason(id=");
        LIZ.append(this.id);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public DislikeReason(String str, String str2) {
        this.id = str;
        this.text = str2;
    }

    public /* synthetic */ DislikeReason(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
