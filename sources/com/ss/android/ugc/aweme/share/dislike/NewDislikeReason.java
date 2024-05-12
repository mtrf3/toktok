package com.ss.android.ugc.aweme.share.dislike;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewDislikeReason {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public NewDislikeReason() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NewDislikeReason copy$default(NewDislikeReason newDislikeReason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newDislikeReason.id;
        }
        if ((i & 2) != 0) {
            str2 = newDislikeReason.text;
        }
        return newDislikeReason.copy(str, str2);
    }

    public final NewDislikeReason copy(String str, String str2) {
        return new NewDislikeReason(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewDislikeReason)) {
            return false;
        }
        NewDislikeReason newDislikeReason = (NewDislikeReason) obj;
        return o.LJ(this.id, newDislikeReason.id) && o.LJ(this.text, newDislikeReason.text);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewDislikeReason(id=");
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

    public NewDislikeReason(String str, String str2) {
        this.id = str;
        this.text = str2;
    }

    public /* synthetic */ NewDislikeReason(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
