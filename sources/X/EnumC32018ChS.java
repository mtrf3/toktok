package X;

/* renamed from: X.ChS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC32018ChS {
    CPU(1, C0NR.CPU_FREQ_MIN),
    CPU_CORE(2, C0NR.CPU_CORE_MIN),
    GPU(4, C0NR.GPU_FREQ_MIN);

    public final int LJLIL;
    public final C0NR LJLILLLLZI;

    public static EnumC32018ChS valueOf(String str) {
        return (EnumC32018ChS) V0N.LJJJ(EnumC32018ChS.class, str);
    }

    public final C0NR getCapType() {
        return this.LJLILLLLZI;
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC32018ChS(int i, C0NR c0nr) {
        this.LJLIL = i;
        this.LJLILLLLZI = c0nr;
    }
}
