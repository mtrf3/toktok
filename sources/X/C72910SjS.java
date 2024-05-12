package X;

import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SjS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72910SjS extends AbstractC65781Prl implements InterfaceC88472Yns<FollowingRelationState, Boolean> {
    public static final C72910SjS LJLIL = new C72910SjS();

    public C72910SjS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FollowingRelationState followingRelationState) {
        List<Object> LIZ;
        FollowingRelationState it = followingRelationState;
        o.LJIIIZ(it, "it");
        List<Object> LIZ2 = it.getListState().getRefresh().LIZ();
        boolean z = true;
        if ((LIZ2 != null && !LIZ2.isEmpty()) || ((LIZ = it.getListState().getLoadMore().LIZ()) != null && !LIZ.isEmpty())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
