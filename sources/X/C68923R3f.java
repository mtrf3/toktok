package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeFrequencyControlConfig;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.R3f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68923R3f implements InterfaceC68924R3g {
    @Override // X.InterfaceC68924R3g
    public final void LIZ(BaseNotice notice, NoticeFrequencyControlConfig noticeFrequencyControlConfig) {
        o.LJIIIZ(notice, "notice");
        C68926R3i c68926R3i = (C68926R3i) C68925R3h.LIZLLL().get(Integer.valueOf(noticeFrequencyControlConfig.behavior.action));
        if (c68926R3i != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NoticeFrequencyManager(");
            String LIZIZ = q.LIZIZ(LIZ, c68926R3i.LIZJ, ')', LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("executeNoticeBehavior + ");
            LIZ2.append(notice.nid);
            C221018lt.LIZ(LIZIZ, X1D.LIZIZ(LIZ2));
            c68926R3i.LIZIZ.add(new OSZ<>(notice, noticeFrequencyControlConfig));
            c68926R3i.LIZ(false);
        }
    }
}
