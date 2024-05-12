package X;

/* renamed from: X.L5e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53686L5e<T> implements InterfaceC04760Gq {
    public final /* synthetic */ C29701Eo LIZ;
    public final /* synthetic */ InterfaceC73573Su9<String> LIZIZ;

    public C53686L5e(C29701Eo c29701Eo, C73433Srt c73433Srt) {
        this.LIZ = c29701Eo;
        this.LIZIZ = c73433Srt;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        this.LIZ.setComposition((C0GY) obj);
        if (!this.LIZIZ.isDisposed()) {
            this.LIZIZ.onNext("1");
        }
    }
}
