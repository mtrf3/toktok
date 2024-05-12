package X;

import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.Dhb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34575Dhb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34575Dhb LJLIL = new C34575Dhb();

    public C34575Dhb() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            Boolean valueOf = Boolean.valueOf(E1L.LIZ.contains(StrategyImpl.LIZIZ().LJJIII()));
            C3C5.m7constructorimpl(valueOf);
            bool = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            bool = LIZ;
        }
        Boolean bool2 = Boolean.FALSE;
        if (C3C5.m12isFailureimpl(bool)) {
            return bool2;
        }
        return bool;
    }
}
