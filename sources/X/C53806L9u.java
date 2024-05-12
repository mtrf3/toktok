package X;

import com.ss.android.ugc.aweme.topicfeed.ui.tab.BaseTopicTabProtocol;
import java.lang.ref.WeakReference;

/* renamed from: X.L9u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53806L9u extends LCY {
    public final /* synthetic */ BaseTopicTabProtocol LIZJ;

    public C53806L9u(BaseTopicTabProtocol baseTopicTabProtocol) {
        this.LIZJ = baseTopicTabProtocol;
    }

    @Override // X.LCY
    public final InterfaceC53908LDs LIZ(LCZ lcz, LCP lcp) {
        InterfaceC53908LDs LIZ = super.LIZ(lcz, lcp);
        this.LIZJ.LJLL = new WeakReference<>(LIZ);
        return LIZ;
    }
}
