package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessWordlistResponse extends F9E {

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("wordlist")
    public final List<DrawGuessWord> wordList;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawGuessWordlistResponse() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.wordList, Long.valueOf(this.duration)};
    }

    public DrawGuessWordlistResponse(List<DrawGuessWord> wordList, long j) {
        o.LJIIIZ(wordList, "wordList");
        this.wordList = wordList;
        this.duration = j;
    }

    public /* synthetic */ DrawGuessWordlistResponse(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? 0L : j);
    }
}
