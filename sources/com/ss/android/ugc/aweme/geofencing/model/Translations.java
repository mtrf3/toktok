package com.ss.android.ugc.aweme.geofencing.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Translations extends F9E {

    @InterfaceC65349Pkn("translations")
    public final List<TranslatedRegion> translations;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.translations};
    }

    public Translations(List<TranslatedRegion> translations) {
        o.LJIIIZ(translations, "translations");
        this.translations = translations;
    }
}
