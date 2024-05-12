package X;

import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;

/* loaded from: classes6.dex */
public final class C7H extends AbstractC65781Prl implements InterfaceC65784Pro<LiveSubscribeLynxMap> {
    public static final C7H LJLIL = new C7H();

    public C7H() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LiveSubscribeLynxMap invoke() {
        return LiveSubscribeLynxUrl.INSTANCE.getValue();
    }
}
