package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import kotlin.jvm.internal.o;

/* renamed from: X.SjJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72901SjJ extends AbstractC65781Prl implements InterfaceC88472Yns<FollowingRelationState, FollowingRelationState> {
    public static final C72901SjJ LJLIL = new C72901SjJ();

    public C72901SjJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final FollowingRelationState invoke(FollowingRelationState followingRelationState) {
        FollowingRelationState setState = followingRelationState;
        o.LJIIIZ(setState, "$this$setState");
        ListState listState = setState.getListState();
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        return FollowingRelationState.copy$default(setState, null, null, false, null, ListState.copy$default(listState, null, null, new C173936s9(c61878OQg), new C173936s9(c61878OQg), null, 19, null), false, 0, null, null, null, null, null, 0, 8175, null);
    }
}
