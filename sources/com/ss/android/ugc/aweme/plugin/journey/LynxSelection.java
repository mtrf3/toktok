package com.ss.android.ugc.aweme.plugin.journey;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LynxSelection {

    @InterfaceC65349Pkn("selectedLanguages")
    public final List<LynxContentLanguage> selectedLanguages;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LynxSelection) && o.LJ(this.selectedLanguages, ((LynxSelection) obj).selectedLanguages);
    }

    public final int hashCode() {
        List<LynxContentLanguage> list = this.selectedLanguages;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxSelection(selectedLanguages=");
        return C1NE.LIZIZ(LIZ, this.selectedLanguages, ')', LIZ);
    }

    public LynxSelection(List<LynxContentLanguage> list) {
        this.selectedLanguages = list;
    }
}
