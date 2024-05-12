package X;

/* renamed from: X.L5d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53685L5d<T> implements InterfaceC04760Gq {
    public final /* synthetic */ InterfaceC73573Su9<String> LIZ;

    public C53685L5d(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        if (!this.LIZ.isDisposed()) {
            this.LIZ.onError(th);
        }
    }
}
