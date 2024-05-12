package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AnoleLogInfo implements Serializable {

    @InterfaceC65349Pkn("refer")
    public final String refer;

    @InterfaceC65349Pkn("tag")
    public final String tag;

    public static /* synthetic */ AnoleLogInfo copy$default(AnoleLogInfo anoleLogInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anoleLogInfo.refer;
        }
        if ((i & 2) != 0) {
            str2 = anoleLogInfo.tag;
        }
        return anoleLogInfo.copy(str, str2);
    }

    public final AnoleLogInfo copy(String str, String str2) {
        return new AnoleLogInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleLogInfo)) {
            return false;
        }
        AnoleLogInfo anoleLogInfo = (AnoleLogInfo) obj;
        return o.LJ(this.refer, anoleLogInfo.refer) && o.LJ(this.tag, anoleLogInfo.tag);
    }

    public int hashCode() {
        String str = this.refer;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleLogInfo(refer=");
        LIZ.append(this.refer);
        LIZ.append(", tag=");
        return q.LIZIZ(LIZ, this.tag, ')', LIZ);
    }

    public final String getRefer() {
        return this.refer;
    }

    public final String getTag() {
        return this.tag;
    }

    public AnoleLogInfo(String str, String str2) {
        this.refer = str;
        this.tag = str2;
    }
}
