package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132205Gu extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    public C132205Gu(String designerId, String designerEncryptedId, int i) {
        o.LJIIIZ(designerId, "designerId");
        o.LJIIIZ(designerEncryptedId, "designerEncryptedId");
        this.LJLIL = designerId;
        this.LJLILLLLZI = designerEncryptedId;
        this.LJLJI = i;
    }
}
