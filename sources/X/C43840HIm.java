package X;

import defpackage.q;

/* renamed from: X.HIm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43840HIm extends QXX {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConcatFinishedEvent{videoPath='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ", audioPath='");
        Q89.LIZIZ(LIZ, this.LJLILLLLZI, '\'', ", statusCode=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", metadata= ");
        return q.LIZIZ(LIZ, this.LJLJI, '}', LIZ);
    }

    public C43840HIm(String str, String str2, String str3, int i) {
        super((Object) null);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJJI = i;
        this.LJLJI = str3;
    }
}
