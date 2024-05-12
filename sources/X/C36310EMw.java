package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.api.NotificationApi;

/* renamed from: X.EMw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36310EMw<T> implements InterfaceC86003Zc {
    public final /* synthetic */ int LJLIL;

    public C36310EMw(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<NoticeList> interfaceC73573Su9) {
        try {
            interfaceC73573Su9.onNext(NotificationApi.LIZ(this.LJLIL, "", false, C53432Ky4.LJ()));
        } catch (Exception e) {
            interfaceC73573Su9.onError(e);
        }
    }
}
