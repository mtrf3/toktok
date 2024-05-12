package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MfV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57377MfV extends AbstractC57378MfW {
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    public final boolean getFromNewMaf() {
        return this.LJLJJI;
    }

    public final int getIterateCnt() {
        return this.LJLJI;
    }

    public final String getUid() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57377MfV(String uid, int i, boolean z) {
        super("RelatedApi", null);
        o.LJIIIZ(uid, "uid");
        this.LJLILLLLZI = uid;
        this.LJLJI = i;
        this.LJLJJI = z;
    }
}
