package X;

import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SjU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72912SjU extends AbstractC65781Prl implements InterfaceC88472Yns<FollowerRelationState, Boolean> {
    public static final C72912SjU LJLIL = new C72912SjU();

    public C72912SjU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FollowerRelationState followerRelationState) {
        List<Object> LIZ;
        FollowerRelationState it = followerRelationState;
        o.LJIIIZ(it, "it");
        List<Object> LIZ2 = it.getListState().getRefresh().LIZ();
        boolean z = true;
        if ((LIZ2 != null && !LIZ2.isEmpty()) || ((LIZ = it.getListState().getLoadMore().LIZ()) != null && !LIZ.isEmpty())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
