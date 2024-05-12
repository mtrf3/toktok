package com.ss.android.ugc.aweme.notice;

import X.AV1;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C36922EeM;
import X.C53405Kxd;
import X.C54251LQx;
import X.C54362LVe;
import X.C55825LvZ;
import X.C55826Lva;
import X.C55827Lvb;
import X.C55828Lvc;
import X.C55829Lvd;
import X.C55830Lve;
import X.C58096Mr6;
import X.C62822Ol8;
import X.FMX;
import X.HG3;
import X.RBX;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import android.os.Handler;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DmNoticeProxyImpl implements DmNoticeProxy {
    public boolean LJ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C55826Lva.LJLIL);
    public String LIZIZ = "";
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C55829Lvd.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C55828Lvc.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C55830Lve.LJLIL);

    public final void LJIIJ() {
        this.LJ = true;
        for (TuxAlertBadgeLayout tuxAlertBadgeLayout : LJIIIIZZ().values()) {
            tuxAlertBadgeLayout.setVariant(0);
            tuxAlertBadgeLayout.LIZJ();
        }
    }

    public static DmNoticeProxy LJI() {
        Object LIZ = C58096Mr6.LIZ(DmNoticeProxy.class, false);
        if (LIZ != null) {
            return (DmNoticeProxy) LIZ;
        }
        if (C58096Mr6.f86o3 == null) {
            synchronized (DmNoticeProxy.class) {
                if (C58096Mr6.f86o3 == null) {
                    C58096Mr6.f86o3 = new DmNoticeProxyImpl();
                }
            }
        }
        return C58096Mr6.f86o3;
    }

    public final C55825LvZ LJII() {
        return (C55825LvZ) this.LIZLLL.getValue();
    }

    public final Map<String, TuxAlertBadgeLayout> LJIIIIZZ() {
        return (Map) this.LIZ.getValue();
    }

    public final C55825LvZ LJIIIZ() {
        return (C55825LvZ) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final boolean LIZIZ() {
        if (!((RBX) HG3.LJIILL()).isLogin() || AV1.LJIIJJI() || C54362LVe.LJI().LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final int LIZJ() {
        return LJIIIZ().LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final String LLIIJI() {
        if (LJIIIZ().LJLIL) {
            return "dot";
        }
        if (LJIIIZ().LJLILLLLZI > 0) {
            return "number";
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void LIZLLL(String str) {
        LJIIIIZZ().remove(str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void LJ(String visibleFragment) {
        o.LJIIIZ(visibleFragment, "visibleFragment");
        if (LJIIIIZZ().isEmpty()) {
            return;
        }
        if (visibleFragment.length() != 0) {
            if (LJIIIIZZ().isEmpty()) {
                visibleFragment = "";
            } else {
                visibleFragment = "notification_page";
            }
        }
        this.LIZIZ = visibleFragment;
        if (LIZIZ()) {
            Iterator<TuxAlertBadgeLayout> it = LJIIIIZZ().values().iterator();
            while (it.hasNext()) {
                it.next().setVisibility(8);
            }
            return;
        }
        int LJIILJJIL = C54362LVe.LJIILJJIL(99);
        if (LJIILJJIL > 0) {
            if (((C55827Lvb) this.LJFF.getValue()).LJLIL) {
                LJIIJ();
            } else {
                this.LJ = false;
                for (TuxAlertBadgeLayout tuxAlertBadgeLayout : LJIIIIZZ().values()) {
                    tuxAlertBadgeLayout.setVariant(1);
                    tuxAlertBadgeLayout.setMaxCount(2);
                    tuxAlertBadgeLayout.LIZJ();
                    tuxAlertBadgeLayout.setCount(LJIILJJIL);
                }
                if (((C55827Lvb) this.LJFF.getValue()).LJLILLLLZI) {
                    ((C55827Lvb) this.LJFF.getValue()).LJLILLLLZI = false;
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS45S0100000_9(this, 134), 3000L);
                }
            }
        } else if (C54362LVe.LJIIZILJ(101, 11)) {
            LJIIJ();
        } else {
            this.LJ = false;
            Iterator<TuxAlertBadgeLayout> it2 = LJIIIIZZ().values().iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DmNotice needShowDot ");
        LIZ.append(C54362LVe.LJIIZILJ(101, 11));
        C36922EeM.LIZLLL(2, "UnreadCount", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DmNotice unread count ");
        LIZ2.append(LJIILJJIL);
        C36922EeM.LIZLLL(2, "UnreadCount", X1D.LIZIZ(LIZ2));
        boolean z = this.LJ;
        if (z || LJIILJJIL < 0) {
            LJIILJJIL = 0;
        }
        if (z != LJIIIZ().LJLIL || LJIILJJIL != LJIIIZ().LJLILLLLZI) {
            LJIIIZ().LJLIL = z;
            LJIIIZ().LJLILLLLZI = LJIILJJIL;
        }
        if (this.LIZIZ.length() == 0) {
            return;
        }
        if (LJII().LJLIL == LJIIIZ().LJLIL && LJII().LJLILLLLZI == LJIIIZ().LJLILLLLZI) {
            return;
        }
        LJII().LJLIL = LJIIIZ().LJLIL;
        LJII().LJLILLLLZI = LJIIIZ().LJLILLLLZI;
        String str = this.LIZIZ;
        String LLIIJI = LLIIJI();
        int i = LJII().LJLILLLLZI;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("notice_type", LLIIJI);
        c188727au.LIZLLL(i, "num");
        FMX.LJIIL("chat_notice_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void LIZ(C54251LQx c54251LQx, String str) {
        int i = c54251LQx.LJLIL;
        if (i != 11 && i != 99 && i != 101) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnReadCountMonitor MusNewNotification receive IM ");
        LIZ.append(c54251LQx.LJLIL);
        LIZ.append(": ");
        LIZ.append(c54251LQx.LJLILLLLZI);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        C54362LVe.LJIJJLI(c54251LQx.LJLIL, c54251LQx.LJLILLLLZI);
        LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void LJFF(TuxAlertBadgeLayout tuxAlertBadgeLayout, String position) {
        o.LJIIIZ(position, "position");
        if (C53405Kxd.LIZJ()) {
            tuxAlertBadgeLayout.LIZIZ();
        } else {
            LJIIIIZZ().put(position, tuxAlertBadgeLayout);
            LJ(position);
        }
    }
}
