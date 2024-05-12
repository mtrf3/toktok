package com.ss.android.ugc.aweme.plugin.journey;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class JourneyContentLanguage {

    @InterfaceC65349Pkn("code")
    public final String code;

    @InterfaceC65349Pkn("en_name")
    public final String en_name;

    @InterfaceC65349Pkn("local_name")
    public final String local_name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JourneyContentLanguage)) {
            return false;
        }
        JourneyContentLanguage journeyContentLanguage = (JourneyContentLanguage) obj;
        return o.LJ(this.code, journeyContentLanguage.code) && o.LJ(this.en_name, journeyContentLanguage.en_name) && o.LJ(this.local_name, journeyContentLanguage.local_name);
    }

    public final int hashCode() {
        int hashCode = this.code.hashCode() * 31;
        String str = this.en_name;
        return this.local_name.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JourneyContentLanguage(code=");
        LIZ.append(this.code);
        LIZ.append(", en_name=");
        LIZ.append(this.en_name);
        LIZ.append(", local_name=");
        return q.LIZIZ(LIZ, this.local_name, ')', LIZ);
    }

    public JourneyContentLanguage(String code, String str, String local_name) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(local_name, "local_name");
        this.code = code;
        this.en_name = str;
        this.local_name = local_name;
    }
}
