package X;

/* loaded from: classes12.dex */
public final class PWW extends AbstractRunnableC64621PXt {
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ PWE LJLJJI;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        this.LJLJJI.LJLL.getClass();
        synchronized (this.LJLJJI) {
            this.LJLJJI.LLF.remove(Integer.valueOf(this.LJLJI));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWW(PWE pwe, Object[] objArr, int i, PWT pwt) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.LJLJJI = pwe;
        this.LJLJI = i;
    }
}
