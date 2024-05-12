package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import kotlin.jvm.internal.o;

/* renamed from: X.SjE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72896SjE extends AbstractC65781Prl implements InterfaceC88471Ynr<FollowingRelationState, ListState, FollowingRelationState> {
    public static final C72896SjE LJLIL = new C72896SjE();

    public C72896SjE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final FollowingRelationState invoke(FollowingRelationState followingRelationState, ListState listState) {
        FollowingRelationState inject = followingRelationState;
        ListState it = listState;
        o.LJIIIZ(inject, "$this$inject");
        o.LJIIIZ(it, "it");
        return FollowingRelationState.copy$default(inject, null, null, false, null, it, false, 0, null, null, null, null, null, 0, 8175, null);
    }
}
