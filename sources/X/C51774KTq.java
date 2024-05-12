package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.KTq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51774KTq extends AbstractC65781Prl implements InterfaceC88472Yns<MusNotice, User> {
    public static final C51774KTq LJLIL = new C51774KTq();

    public C51774KTq() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final User invoke(MusNotice musNotice) {
        MusNotice musNotice2 = musNotice;
        if (musNotice2 != null) {
            return b.LJIJI(musNotice2);
        }
        return null;
    }
}
