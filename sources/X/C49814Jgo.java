package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jgo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49814Jgo extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public C49814Jgo() {
        this((String) null, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C49814Jgo(String keyword, String correctWord) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(correctWord, "correctWord");
        this.LJLIL = keyword;
        this.LJLILLLLZI = correctWord;
    }

    public /* synthetic */ C49814Jgo(String str, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? null : "");
    }
}
