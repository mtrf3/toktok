package X;

import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;

/* renamed from: X.Utp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78649Utp {
    public final String LIZ;
    public final EnumC41264GHk LIZIZ;

    public AbstractC78649Utp(String str) {
        EnumC41264GHk networkStatus = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getNetworkStatus();
        this.LIZ = str;
        this.LIZIZ = networkStatus;
    }
}
