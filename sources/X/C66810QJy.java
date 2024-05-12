package X;

import Y.ARunnableS30S0200000_11;
import android.os.Handler;

/* renamed from: X.QJy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66810QJy implements QJU {
    public final long LIZ;
    public InterfaceC66818QKg LIZIZ;
    public final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
    public final QIF LIZLLL;

    public final void LIZ() {
        QIF qif = this.LIZLLL;
        if (qif == null || qif.LJJIIZI) {
            C66795QJj.LIZIZ.LJI.LIZJ(this);
        } else {
            C66765QIf.LJFF(String.valueOf(qif.LIZ)).LJI.LIZJ(this);
        }
    }

    @Override // X.QJU
    public final void LIZIZ(C66799QJn c66799QJn) {
        this.LIZJ.post(new ARunnableS30S0200000_11(this, c66799QJn, 65));
    }

    public C66810QJy(long j, InterfaceC66818QKg interfaceC66818QKg, QIF qif) {
        this.LIZ = j;
        this.LIZIZ = interfaceC66818QKg;
        this.LIZLLL = qif;
    }
}
