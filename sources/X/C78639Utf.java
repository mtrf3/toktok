package X;

import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Utf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78639Utf extends AbstractC78640Utg {
    public final String LJ;
    public final EnumC41264GHk LJFF;

    public C78639Utf() {
        this(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78639Utf(int i) {
        super(0, "prepare");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        EnumC41264GHk netStatus = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getNetworkStatus();
        o.LJIIIZ(netStatus, "netStatus");
        this.LJ = curUserId;
        this.LJFF = netStatus;
    }
}
