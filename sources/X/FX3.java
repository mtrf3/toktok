package X;

/* loaded from: classes7.dex */
public final class FX3 implements QND {
    public final /* synthetic */ InterfaceC65784Pro<String> LIZ;

    @Override // X.QND
    public final String getLanguage() {
        return this.LIZ.invoke();
    }

    @Override // X.QND
    public final String getSessionId() {
        try {
            return FX1.LIZIZ.getSessionId();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // X.QND
    public final String getUserId() {
        return HG3.LJIILL().getCurUserId();
    }

    public FX3(FZG fzg) {
        this.LIZ = fzg;
    }
}
