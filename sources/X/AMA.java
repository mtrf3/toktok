package X;

import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AMA extends AbstractC65781Prl implements InterfaceC88473Ynt<FollowListAdapter.FollowItemViewHolder, C26070ALa, Integer, C76800UCe> {
    public static final AMA LJLIL = new AMA();

    public AMA() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(FollowListAdapter.FollowItemViewHolder followItemViewHolder, C26070ALa c26070ALa, Integer num) {
        FollowListAdapter.FollowItemViewHolder selectSubscribe = followItemViewHolder;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.withState(selectSubscribe.M(), new AqS94S0101000_4(c26070ALa, intValue, 10));
        return C76800UCe.LIZ;
    }
}
