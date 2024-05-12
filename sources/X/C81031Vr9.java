package X;

/* renamed from: X.Vr9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81031Vr9 extends AbstractC81030Vr8 {
    public final /* synthetic */ AbstractC81030Vr8 LIZ;
    public final /* synthetic */ android.net.Uri LIZIZ;
    public final /* synthetic */ AbstractC81029Vr7 LIZJ;

    @Override // X.AbstractC81030Vr8
    public final void LIZLLL(Throwable th) {
        AbstractC81030Vr8 abstractC81030Vr8;
        if (!this.LIZJ.mDestroyed && (abstractC81030Vr8 = this.LIZ) != null) {
            abstractC81030Vr8.LIZIZ(this.LIZIZ, th);
        }
    }

    public C81031Vr9(AbstractC81029Vr7 abstractC81029Vr7, AbstractC81030Vr8 abstractC81030Vr8, android.net.Uri uri) {
        this.LIZJ = abstractC81029Vr7;
        this.LIZ = abstractC81030Vr8;
        this.LIZIZ = uri;
    }
}
