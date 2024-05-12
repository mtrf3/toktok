package X;

import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49521wy extends AbstractC65781Prl implements InterfaceC88472Yns<C28467BFf<GetResponse.Data>, C76800UCe> {
    public static final C49521wy LJLIL = new C49521wy();

    public C49521wy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C28467BFf<GetResponse.Data> c28467BFf) {
        LiveStreamGoal liveStreamGoal;
        C28467BFf<GetResponse.Data> response = c28467BFf;
        o.LJIIIZ(response, "response");
        C31691Mf c31691Mf = C31691Mf.LIZ;
        GetResponse.Data data = response.data;
        if (data != null) {
            liveStreamGoal = data.ongoingGoal;
        } else {
            liveStreamGoal = null;
        }
        c31691Mf.LJIL(liveStreamGoal, false);
        if (!C29306Beo.LJJI()) {
            List<Boolean> list = C31691Mf.LJII;
            Boolean bool = Boolean.FALSE;
            list.addAll(C47261Igj.LJJIJIL(bool, bool, bool));
        }
        return C76800UCe.LIZ;
    }
}
