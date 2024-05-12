package com.ss.android.ugc.aweme.notification.service;

import X.C54229LQb;
import X.C55888Lwa;
import X.C58096Mr6;
import X.LR0;
import X.LR4;
import X.LVL;
import android.os.SystemClock;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeCountTabBadgePresentServiceImpl implements INoticeCountTabBadgePresentService {
    public LR0 LIZ;
    public boolean LIZIZ;
    public boolean LIZJ = true;

    public static INoticeCountTabBadgePresentService LJI() {
        Object LIZ = C58096Mr6.LIZ(INoticeCountTabBadgePresentService.class, false);
        if (LIZ != null) {
            return (INoticeCountTabBadgePresentService) LIZ;
        }
        if (C58096Mr6.s3 == null) {
            synchronized (INoticeCountTabBadgePresentService.class) {
                if (C58096Mr6.s3 == null) {
                    C58096Mr6.s3 = new NoticeCountTabBadgePresentServiceImpl();
                }
            }
        }
        return C58096Mr6.s3;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZ() {
        LR0 lr0 = this.LIZ;
        if (lr0 == null) {
            return;
        }
        lr0.LJIJJLI = false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZIZ() {
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            lr0.LJIL(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZLLL() {
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            lr0.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LJFF() {
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            lr0.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final boolean isShowing() {
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            return lr0.LJIIZILJ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void onDestroy() {
        if (this.LIZIZ) {
            this.LIZIZ = false;
            return;
        }
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            lr0.LJIILLIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void onReset() {
        LVL.LJLIL.LJIILJJIL();
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            lr0.LJIJJLI(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void onResume() {
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            lr0.LJIJJLI(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LJ(boolean z) {
        LR0 lr0 = this.LIZ;
        if (lr0 == null) {
            return;
        }
        lr0.LJIJI = z;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService
    public final void LIZJ(AbsFragment fragment, ScrollSwitchStateManager scrollSwitchStateManager, C54229LQb c54229LQb) {
        o.LJIIIZ(fragment, "fragment");
        LR4.LIZ = SystemClock.uptimeMillis();
        C55888Lwa.LIZIZ.LJIJJ();
        LR0 lr0 = this.LIZ;
        if (lr0 != null) {
            this.LIZIZ = true;
            lr0.LJIILLIIL();
        }
        this.LIZ = new LR0(fragment, scrollSwitchStateManager, c54229LQb, this.LIZJ);
        this.LIZJ = false;
    }
}
