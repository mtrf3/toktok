package com.ss.android.ugc.aweme.share.dislike;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Keyword extends F9E {

    @InterfaceC65349Pkn("scenes")
    public final List<Integer> scenes;

    @InterfaceC65349Pkn("text")
    public final String text;

    public Keyword() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Keyword copy$default(Keyword keyword, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyword.text;
        }
        if ((i & 2) != 0) {
            list = keyword.scenes;
        }
        return keyword.copy(str, list);
    }

    public final Keyword copy(String text, List<Integer> scenes) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(scenes, "scenes");
        return new Keyword(text, scenes);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.text, this.scenes};
    }

    public final List<Integer> getScenes() {
        return this.scenes;
    }

    public final String getText() {
        return this.text;
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
