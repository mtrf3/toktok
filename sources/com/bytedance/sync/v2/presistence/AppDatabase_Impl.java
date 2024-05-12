package com.bytedance.sync.v2.presistence;

import X.C0BG;
import X.C0BR;
import X.C1CB;
import X.C262411g;
import X.C68495QuR;
import X.C68496QuS;
import X.C68501QuX;
import X.C87528YWu;
import X.InterfaceC262711j;
import X.InterfaceC68509Quf;
import X.InterfaceC68510Qug;
import X.InterfaceC68511Quh;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class AppDatabase_Impl extends AppDatabase {
    public volatile C68496QuS LJIIL;
    public volatile C68495QuR LJIILIIL;
    public volatile C68501QuX LJIILJJIL;

    @Override // X.AbstractC03300Ba
    public final C0BR LJFF() {
        return new C0BR(this, new HashMap(), Collections.emptyMap(), "t_business", "t_report_synclog", "t_sync_cursor", "t_synclog", "t_snapshot");
    }

    @Override // com.bytedance.sync.v2.presistence.AppDatabase
    public final InterfaceC68509Quf LJIJ() {
        C68496QuS c68496QuS;
        if (this.LJIIL != null) {
            return this.LJIIL;
        }
        synchronized (this) {
            if (this.LJIIL == null) {
                this.LJIIL = new C68496QuS(this);
            }
            c68496QuS = this.LJIIL;
        }
        return c68496QuS;
    }

    @Override // com.bytedance.sync.v2.presistence.AppDatabase
    public final InterfaceC68510Qug LJIJI() {
        C68495QuR c68495QuR;
        if (this.LJIILIIL != null) {
            return this.LJIILIIL;
        }
        synchronized (this) {
            if (this.LJIILIIL == null) {
                this.LJIILIIL = new C68495QuR(this);
            }
            c68495QuR = this.LJIILIIL;
        }
        return c68495QuR;
    }

    @Override // com.bytedance.sync.v2.presistence.AppDatabase
    public final InterfaceC68511Quh LJIJJ() {
        C68501QuX c68501QuX;
        if (this.LJIILJJIL != null) {
            return this.LJIILJJIL;
        }
        synchronized (this) {
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = new C68501QuX(this);
            }
            c68501QuX = this.LJIILJJIL;
        }
        return c68501QuX;
    }

    @Override // X.AbstractC03300Ba
    public final InterfaceC262711j LJI(C0BG c0bg) {
        C1CB c1cb = new C1CB(c0bg, new C87528YWu(this), "176b0459a5a82eb6a61d248ab647643b", "10d31738071062c01fb018398dd98f36");
        C262411g c262411g = new C262411g(c0bg.LIZIZ);
        c262411g.LIZIZ = c0bg.LIZJ;
        c262411g.LIZJ = c1cb;
        return c0bg.LIZ.LIZ(c262411g.LIZ());
    }
}
