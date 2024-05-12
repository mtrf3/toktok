package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSM extends F9E implements C33Q {
    public String LJLIL;
    public boolean LJLILLLLZI;

    public KSM() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ KSM(int i) {
        this("", false);
    }

    public KSM(String nowSelectCell, boolean z) {
        o.LJIIIZ(nowSelectCell, "nowSelectCell");
        this.LJLIL = nowSelectCell;
        this.LJLILLLLZI = z;
    }
}
