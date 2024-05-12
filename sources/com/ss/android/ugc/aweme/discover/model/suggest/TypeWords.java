package com.ss.android.ugc.aweme.discover.model.suggest;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ujb.o;

/* loaded from: classes9.dex */
public final class TypeWords {
    public static final Companion Companion = new Companion();
    public boolean fromCache;
    public String imprId = "";
    public String logId;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("params")
    public final TypeWordsParams typeWordsParams;

    @InterfaceC65349Pkn("words")
    public List<Word> words;

    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeWords)) {
            return false;
        }
        if (o.LJJJJIZL(this.source, "inbox", false)) {
            TypeWords typeWords = (TypeWords) obj;
            if (o.LJJJJIZL(typeWords.source, "inbox", false)) {
                return kotlin.jvm.internal.o.LJ(this.words, typeWords.words);
            }
        }
        return super.equals(obj);
    }

    public final void setImprId(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.imprId = str;
    }
}
