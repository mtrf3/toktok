package X;

/* loaded from: classes11.dex */
public final class NT5 implements YH1 {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LIZ;
    public final /* synthetic */ InterfaceC65784Pro<String> LIZIZ;

    @Override // X.YH1
    public final String LIZ() {
        String invoke = this.LIZIZ.invoke();
        if (invoke == null) {
            return "";
        }
        return invoke;
    }

    @Override // X.YH1
    public final boolean isPlaying() {
        Boolean invoke = this.LIZ.invoke();
        if (invoke != null) {
            return invoke.booleanValue();
        }
        return false;
    }

    public NT5(C94B c94b, C59343NQt c59343NQt) {
        this.LIZ = c94b;
        this.LIZIZ = c59343NQt;
    }
}
