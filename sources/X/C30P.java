package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi;

/* renamed from: X.30P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30P extends AbstractC65781Prl implements InterfaceC65784Pro<TakoApi> {
    public static final C30P LJLIL = new C30P();

    public C30P() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi] */
    @Override // X.InterfaceC65784Pro
    public final TakoApi invoke() {
        return RetrofitFactory.LIZLLL().LIZ(C775132l.LIZJ).LJFF().LIZ.LIZ(TakoApi.class);
    }
}
