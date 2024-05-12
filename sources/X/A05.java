package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A05 extends AbstractC65781Prl implements InterfaceC88471Ynr<FollowRelationState, Bundle, FollowRelationState> {
    public static final A05 INSTANCE = new A05();

    public A05() {
        super(2);
    }

    public final FollowRelationState invoke(FollowRelationState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState, Bundle bundle) {
        FollowRelationState followRelationState2 = followRelationState;
        invoke(followRelationState2, bundle);
        return followRelationState2;
    }
}
