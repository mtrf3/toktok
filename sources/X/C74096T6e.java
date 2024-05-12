package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import kotlin.jvm.internal.o;

/* renamed from: X.T6e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74096T6e extends AbstractC65781Prl implements InterfaceC88471Ynr<SocialRecRequestState, Bundle, SocialRecRequestState> {
    public static final C74096T6e INSTANCE = new C74096T6e();

    public C74096T6e() {
        super(2);
    }

    public final SocialRecRequestState invoke(SocialRecRequestState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState, Bundle bundle) {
        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
        invoke(socialRecRequestState2, bundle);
        return socialRecRequestState2;
    }
}
