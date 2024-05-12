package X;

/* loaded from: classes9.dex */
public final class INM extends F9E {
    public String LJLIL;
    public long LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    public INM() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public INM(int i) {
        this.LJLIL = "";
        this.LJLILLLLZI = 0L;
        this.LJLJI = 0;
        this.LJLJJI = false;
    }
}
