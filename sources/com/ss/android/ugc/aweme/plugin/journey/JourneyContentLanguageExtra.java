package com.ss.android.ugc.aweme.plugin.journey;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class JourneyContentLanguageExtra {

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JourneyContentLanguageExtra)) {
            return false;
        }
        JourneyContentLanguageExtra journeyContentLanguageExtra = (JourneyContentLanguageExtra) obj;
        return o.LJ(this.title, journeyContentLanguageExtra.title) && o.LJ(this.text, journeyContentLanguageExtra.text);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JourneyContentLanguageExtra(title=");
        LIZ.append(this.title);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public JourneyContentLanguageExtra(String title, String str) {
        o.LJIIIZ(title, "title");
        this.title = title;
        this.text = str;
    }
}
