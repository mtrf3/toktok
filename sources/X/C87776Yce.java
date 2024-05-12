package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Yce, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87776Yce extends C87778Ycg {
    public final String LIZIZ;

    public C87776Yce(String str) {
        super(str);
        this.LIZIZ = "search_async_prefetch";
    }

    @Override // X.JYX
    public final void LIZ(int i, String type) {
        o.LJIIIZ(type, "type");
        C10K.LIZJ(new CallableC87775Ycd(this, type, i));
    }

    @Override // X.C87777Ycf, X.JYX
    public final void LIZIZ(int i, long j, long j2, String type) {
        o.LJIIIZ(type, "type");
        super.LIZIZ(i, j, j2, type);
        C10K.LIZJ(new CallableC87774Ycc(this, type, i, j2, j));
    }

    @Override // X.JYX
    public final void LIZJ(int i, String type, long j, Exception exc) {
        o.LJIIIZ(type, "type");
        C10K.LIZJ(new CallableC87773Ycb(this, type, i, exc, j));
    }
}
