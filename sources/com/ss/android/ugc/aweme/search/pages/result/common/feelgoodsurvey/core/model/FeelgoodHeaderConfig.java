package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeelgoodHeaderConfig implements Serializable {

    @InterfaceC65349Pkn("title")
    public final String title;

    public static /* synthetic */ FeelgoodHeaderConfig copy$default(FeelgoodHeaderConfig feelgoodHeaderConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feelgoodHeaderConfig.title;
        }
        return feelgoodHeaderConfig.copy(str);
    }

    public final FeelgoodHeaderConfig copy(String str) {
        return new FeelgoodHeaderConfig(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeelgoodHeaderConfig) && o.LJ(this.title, ((FeelgoodHeaderConfig) obj).title);
    }

    public int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeelgoodHeaderConfig(title=");
        return q.LIZIZ(LIZ, this.title, ')', LIZ);
    }

    public final String getTitle() {
        return this.title;
    }

    public FeelgoodHeaderConfig(String str) {
        this.title = str;
    }
}
