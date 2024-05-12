package X;

/* renamed from: X.Vrf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81063Vrf {
    Half(0),
    Full(1);

    public static final C81064Vrg Companion = new C81064Vrg();
    public int LJLIL;

    public static EnumC81063Vrf valueOf(String str) {
        return (EnumC81063Vrf) V0N.LJJJ(EnumC81063Vrf.class, str);
    }

    public final int getMStep() {
        return this.LJLIL;
    }

    public final void setMStep(int i) {
        this.LJLIL = i;
    }

    EnumC81063Vrf(int i) {
        this.LJLIL = i;
    }
}
