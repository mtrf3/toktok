package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import kotlin.jvm.internal.o;

/* renamed from: X.SjD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72895SjD extends AbstractC65781Prl implements InterfaceC88471Ynr<FollowerRelationState, ListState, FollowerRelationState> {
    public static final C72895SjD LJLIL = new C72895SjD();

    public C72895SjD() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final FollowerRelationState invoke(FollowerRelationState followerRelationState, ListState listState) {
        FollowerRelationState inject = followerRelationState;
        ListState it = listState;
        o.LJIIIZ(inject, "$this$inject");
        o.LJIIIZ(it, "it");
        return FollowerRelationState.copy$default(inject, null, null, false, it, null, null, 55, null);
    }
}
