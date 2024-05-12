package X;

/* renamed from: X.Tjc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75468Tjc {
    MULTIGUEST(0),
    PK(1),
    MULTI_GUEST_SHOW(2);

    public final int LJLIL;
    public boolean LJLILLLLZI = false;

    public static EnumC75468Tjc valueOf(String str) {
        return (EnumC75468Tjc) V0N.LJJJ(EnumC75468Tjc.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    public final boolean getVisibility() {
        return this.LJLILLLLZI;
    }

    public final void setVisibility(boolean z) {
        this.LJLILLLLZI = z;
    }

    EnumC75468Tjc(int i) {
        this.LJLIL = i;
    }
}
