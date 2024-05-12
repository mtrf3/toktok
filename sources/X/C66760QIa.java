package X;

import com.bytedance.applog.AppLog;

/* renamed from: X.QIa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66760QIa implements InterfaceC66837QKz {
    public volatile QIE LIZ = new QIE();
    public volatile QIF LIZIZ;
    public QIP LIZJ;
    public final QI3 LIZLLL;
    public volatile C66765QIf LJ;

    public final InterfaceC66835QKx LIZ() {
        if (this.LJ == null) {
            synchronized (this) {
                if (this.LJ == null) {
                    if (AppLog.LIZ == this.LIZLLL) {
                        this.LJ = C66795QJj.LIZIZ;
                    } else {
                        this.LJ = new C66765QIf();
                    }
                }
            }
        }
        return this.LJ;
    }

    public C66760QIa(QI3 qi3) {
        this.LIZLLL = qi3;
    }
}
