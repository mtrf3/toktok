package X;

import com.ss.android.ugc.aweme.dot.BaseRedDotImpl;

/* renamed from: X.LHq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54010LHq extends AbstractC65781Prl implements InterfaceC65784Pro<C53994LHa> {
    public static final C54010LHq LJLIL = new C54010LHq();

    public C54010LHq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C53994LHa invoke() {
        BaseRedDotImpl c54003LHj;
        if (C53295Kvr.LIZ()) {
            c54003LHj = new C54015LHv(C53295Kvr.LIZJ());
        } else if (C54029LIj.LIZIZ.LJJIJL()) {
            c54003LHj = new C54002LHi();
        } else {
            c54003LHj = new C54003LHj();
        }
        return new C53994LHa(c54003LHj);
    }
}
