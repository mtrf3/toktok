package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GuessResponse extends F9E {

    @InterfaceC65349Pkn("correct")
    public final boolean correct;

    @InterfaceC65349Pkn("word")
    public final String word;

    /* JADX WARN: Multi-variable type inference failed */
    public GuessResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.correct), this.word};
    }

    public GuessResponse(boolean z, String word) {
        o.LJIIIZ(word, "word");
        this.correct = z;
        this.word = word;
    }

    public /* synthetic */ GuessResponse(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
