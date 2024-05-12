package X;

import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;

/* loaded from: classes11.dex */
public final class NSL extends AbstractC65781Prl implements InterfaceC65784Pro<ITcmService> {
    public static final NSL INSTANCE = new NSL();

    public NSL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ITcmService invoke() {
        return TcmServiceImpl.LJIJI();
    }
}
