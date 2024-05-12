package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;

/* renamed from: X.MNg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56704MNg extends AbstractC65781Prl implements InterfaceC65784Pro<MultiApiManager.API> {
    public static final C56704MNg LJLIL = new C56704MNg();

    public C56704MNg() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.inbox.api.MultiApiManager$API, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MultiApiManager.API invoke() {
        return RetrofitFactory.LIZLLL().create(C56705MNh.LIZ).create(MultiApiManager.API.class);
    }
}
