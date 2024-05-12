package com.ss.android.ugc.aweme.compliance.business.filtervideo.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Keyword extends F9E {

    @InterfaceC65349Pkn("scenes")
    public final List<Integer> scenes;

    @InterfaceC65349Pkn("text")
    public final String text;

    public Keyword() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text, this.scenes};
    }

    public Keyword(String text, List<Integer> scenes) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(scenes, "scenes");
        this.text = text;
        this.scenes = scenes;
    }

    public Keyword(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
