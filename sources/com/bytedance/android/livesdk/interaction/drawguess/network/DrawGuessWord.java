package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessWord extends F9E {

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("word")
    public final String word;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawGuessWord() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.id), this.word};
    }

    public DrawGuessWord(long j, String word) {
        o.LJIIIZ(word, "word");
        this.id = j;
        this.word = word;
    }

    public /* synthetic */ DrawGuessWord(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
