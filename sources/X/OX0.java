package X;

import java.io.Serializable;

/* loaded from: classes11.dex */
public final class OX0 extends F9E implements Serializable {
    public static final C62053OWz Companion = new C62053OWz();
    public static final OX0 NONE = new OX0(false, 0, false);
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    public static /* synthetic */ OX0 copy$default(OX0 ox0, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ox0.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i = ox0.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z2 = ox0.LJLJI;
        }
        return ox0.copy(z, i, z2);
    }

    public final OX0 copy(boolean z, int i, boolean z2) {
        return new OX0(z, i, z2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public final boolean getDisableCollect() {
        return this.LJLJI;
    }

    public final int getOriginSoundExp() {
        return this.LJLILLLLZI;
    }

    public final boolean isPgc() {
        return this.LJLIL;
    }

    public OX0(boolean z, int i, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = z2;
    }
}
