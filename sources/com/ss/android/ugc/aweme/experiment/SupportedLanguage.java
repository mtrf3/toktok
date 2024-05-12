package com.ss.android.ugc.aweme.experiment;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SupportedLanguage extends F9E {

    @InterfaceC65349Pkn("translation")
    public List<String> translationLanguage;

    public SupportedLanguage() {
        this(null, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.translationLanguage};
    }

    public SupportedLanguage(List<String> translationLanguage) {
        o.LJIIIZ(translationLanguage, "translationLanguage");
        this.translationLanguage = translationLanguage;
    }

    public SupportedLanguage(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
