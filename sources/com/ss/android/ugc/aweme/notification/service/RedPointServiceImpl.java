package com.ss.android.ugc.aweme.notification.service;

import X.AbstractC73672Svk;
import X.LVG;
import X.LVM;
import android.os.Message;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.count.OldRedPointService;
import com.ss.android.ugc.aweme.notice.api.count.RedPointService;

/* loaded from: classes10.dex */
public class RedPointServiceImpl implements RedPointService, OldRedPointService {
    public final LVM LJLIL = LVM.LJIJ();

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJIIIZ() {
        this.LJLIL.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final AbstractC73672Svk LIZ(NoticeList noticeList) {
        return this.LJLIL.LIZ(noticeList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LIZJ(boolean z) {
        this.LJLIL.LJLL = z;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int LJ(int i) {
        return this.LJLIL.LJI(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int LJI(int i) {
        return this.LJLIL.LJI(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJII(Message message) {
        this.LJLIL.LJII(message);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final int LJIIJJI(int i) {
        return this.LJLIL.LJIIJJI(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LIZIZ(int i, boolean z) {
        this.LJLIL.LIZIZ(i, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LIZLLL(int i, LVG lvg) {
        this.LJLIL.LIZLLL(i, lvg);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJFF(int i, LVG lvg) {
        this.LJLIL.LJFF(i, lvg);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.count.OldRedPointService
    public final void LJIIIIZZ(int i, int i2) {
        this.LJLIL.LJIIIIZZ(i, i2);
    }
}
