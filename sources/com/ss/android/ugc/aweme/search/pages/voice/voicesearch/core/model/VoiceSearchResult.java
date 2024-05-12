package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class VoiceSearchResult extends F9E {

    @InterfaceC65349Pkn("text")
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceSearchResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.text};
    }

    public VoiceSearchResult(String text) {
        o.LJIIIZ(text, "text");
        this.text = text;
    }

    public /* synthetic */ VoiceSearchResult(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
