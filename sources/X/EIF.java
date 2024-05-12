package X;

import com.ss.android.ugc.aweme.notification.service.NoticeCountTabBadgePresentServiceImpl;

/* loaded from: classes7.dex */
public final class EIF<T> implements InterfaceC64592gB {
    public static final EIF<T> LJLIL = new EIF<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("delayUnreadCountAllProcess start process ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C221018lt.LJFF("NoticeCountFetcher", X1D.LIZIZ(LIZ));
        LQS.LIZ(1, false);
        NoticeCountTabBadgePresentServiceImpl.LJI().LIZIZ();
    }
}
