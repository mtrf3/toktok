package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public final class MQA extends AbstractC65781Prl implements InterfaceC88472Yns<MusNotice, User> {
    public static final MQA LJLIL = new MQA();

    public MQA() {
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
