package com.ss.android.ugc.aweme.notification.service;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.ENN;
import X.EnumC54302LSw;
import X.LVG;
import X.LVL;
import X.LVQ;
import android.os.Message;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeCountServiceImpl implements INoticeCountService {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(LVQ.LJLIL);

    public final LVL LJIIL() {
        return (LVL) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZLLL() {
        return LJIIL().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final Map<Integer, Integer> LJ() {
        return LJIIL().LJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJFF() {
        return LJIIL().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILJJIL() {
        LJIIL().LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJ() {
        return LJIIL().LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJI() {
        return LJIIL().LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final AbstractC73672Svk LIZ(NoticeList noticeList) {
        LJIIL().getClass();
        return AbstractC73672Svk.LJIIJ(new ENN(noticeList));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJI(Message message) {
        LJIIL().LJI(message);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final NoticeGroupAttrs LJIIJ(int i) {
        return LJIIL().LJIIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIILIIL(String uid) {
        o.LJIIIZ(uid, "uid");
        return LJIIL().LJIILIIL(uid);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJJ(int i) {
        return LJIIL().LJIJJ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LIZIZ(int i, int i2) {
        LJIIL().LIZIZ(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZJ(int i, EnumC54302LSw showType) {
        o.LJIIIZ(showType, "showType");
        return LJIIL().LIZJ(i, showType);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJII(String str, List list) {
        LJIIL().LJII(str, list);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILLIIL(int i, boolean z) {
        LJIIL().LJIILLIIL(i, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIZILJ(boolean z, int[] groupTypeArray) {
        o.LJIIIZ(groupTypeArray, "groupTypeArray");
        return LJIIL().LJIIZILJ(z, groupTypeArray);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIL(LVG lvg, int[] iArr) {
        LJIIL().LJIL(lvg, iArr);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIIIZZ(int i, EnumC54302LSw showType, boolean z) {
        o.LJIIIZ(showType, "showType");
        return LJIIL().LJIIIIZZ(i, showType, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIIZ(int i, LVG lvg, boolean z) {
        LJIIL().LJIIIZ(i, lvg, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIJJI(LVG lvg, boolean z, int[] iArr) {
        LJIIL().LJIIJJI(lvg, z, iArr);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final boolean LJIILL(LVG lvg, boolean z, int[] iArr) {
        return LJIIL().LJIILL(lvg, z, iArr);
    }
}
