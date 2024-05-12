package X;

import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.1wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49481wu extends AbstractC65781Prl implements InterfaceC88472Yns<C28467BFf<GetResponse.Data>, C76800UCe> {
    public static final C49481wu LJLIL = new C49481wu();

    public C49481wu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C28467BFf<GetResponse.Data> c28467BFf) {
        LiveStreamGoal liveStreamGoal;
        C28467BFf<GetResponse.Data> response = c28467BFf;
        o.LJIIIZ(response, "response");
        GetResponse.Data data = response.data;
        if (data == null || (liveStreamGoal = data.ongoingGoal) == null || liveStreamGoal.status == BII.DELETED.getCode()) {
            C31691Mf.LIZ.LJIIJJI();
            InterfaceC30442Bx8.h2.LIZ(new m());
        }
        return C76800UCe.LIZ;
    }
}
