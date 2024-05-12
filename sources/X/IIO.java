package X;

/* loaded from: classes9.dex */
public final class IIO extends F9E implements InterfaceC66068PwO {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Long.valueOf(this.LJLJJI)};
    }

    @Override // X.InterfaceC66068PwO
    public final String getTag() {
        return "JsbEvent";
    }

    public IIO() {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL = "";
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJI = currentTimeMillis;
    }
}
