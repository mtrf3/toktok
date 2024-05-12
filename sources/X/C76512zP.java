package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2zP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76512zP extends F9E {
    public final /* synthetic */ int LJLIL = 0;
    public final Object LJLILLLLZI;
    public final Object LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
            default:
                return new Object[]{this.LJLILLLLZI, this.LJLJI};
        }
    }

    public C76512zP(EnumC115234ff state, EnumC76492zN type) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(type, "type");
        this.LJLILLLLZI = state;
        this.LJLJI = type;
    }

    public C76512zP(List list, List toHideModels) {
        o.LJIIIZ(toHideModels, "toHideModels");
        this.LJLILLLLZI = list;
        this.LJLJI = toHideModels;
    }
}
