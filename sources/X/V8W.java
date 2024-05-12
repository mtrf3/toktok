package X;

/* loaded from: classes14.dex */
public final class V8W implements W98 {
    public final boolean LIZ;
    public final int LIZIZ;

    @Override // X.W98
    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    @Override // X.W98
    public final boolean canTranscode(C81828W9o c81828W9o) {
        if (c81828W9o == C81796W8i.LJIIJ || c81828W9o == C81796W8i.LIZ) {
            return true;
        }
        return false;
    }

    public V8W(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }

    @Override // X.W98
    public final boolean canResize(W8X w8x, V85 v85, C79238V7y c79238V7y) {
        if (v85 == null) {
            v85 = V85.LIZJ;
        }
        if (this.LIZ && C79234V7u.LJII(v85, c79238V7y, w8x, this.LIZIZ) > 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        if (r14 != null) goto L35;
     */
    @Override // X.W98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.V8V transcode(X.W8X r17, java.io.OutputStream r18, X.V85 r19, X.C79238V7y r20, X.C81828W9o r21, java.lang.Integer r22) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V8W.transcode(X.W8X, java.io.OutputStream, X.V85, X.V7y, X.W9o, java.lang.Integer):X.V8V");
    }
}
