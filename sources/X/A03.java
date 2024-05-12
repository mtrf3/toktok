package X;

import android.app.Activity;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class A03 extends AbstractC008101l {
    public final /* synthetic */ FollowRelationTabActivity LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        C73157SnR.LJIIJJI((JediViewModel) this.LIZJ.LJLILLLLZI.getValue(), new AqS170S0100000_4(this.LIZJ, 381));
        Activity LJIJJ = C45804HyK.LJIJJ(this.LIZJ);
        if (LJIJJ != null) {
            LJIJJ.finish();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A03(FollowRelationTabActivity followRelationTabActivity) {
        super(true);
        this.LIZJ = followRelationTabActivity;
    }
}
