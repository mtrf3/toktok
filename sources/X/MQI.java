package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;

/* loaded from: classes10.dex */
public final class MQI extends AbstractC65781Prl implements InterfaceC65784Pro<MusNotice> {
    public static final MQI LJLIL = new MQI();

    public MQI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MusNotice invoke() {
        MusNotice musNotice = new MusNotice(false, 1, null);
        musNotice.type = 2008;
        return musNotice;
    }
}
