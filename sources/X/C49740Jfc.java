package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jfc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49740Jfc extends F9E implements C33Q {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    public C49740Jfc() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C49740Jfc(int i) {
        this(false, "", true);
    }

    public C49740Jfc(boolean z, String entranceText, boolean z2) {
        o.LJIIIZ(entranceText, "entranceText");
        this.LJLIL = z;
        this.LJLILLLLZI = entranceText;
        this.LJLJI = z2;
    }

    public static C49740Jfc L(C49740Jfc c49740Jfc, boolean z, String entranceText, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c49740Jfc.LJLIL;
        }
        if ((i & 2) != 0) {
            entranceText = c49740Jfc.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c49740Jfc.LJLJI;
        }
        c49740Jfc.getClass();
        o.LJIIIZ(entranceText, "entranceText");
        return new C49740Jfc(z, entranceText, z2);
    }
}
