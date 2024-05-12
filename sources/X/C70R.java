package X;

import kotlin.jvm.internal.o;

/* renamed from: X.70R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C70R extends F9E {
    public final boolean LJLIL;
    public final C70I LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C70R(C70I mentionMentionSearchType) {
        o.LJIIIZ(mentionMentionSearchType, "mentionMentionSearchType");
        this.LJLIL = false;
        this.LJLILLLLZI = mentionMentionSearchType;
    }
}
