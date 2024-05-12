package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Of5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62447Of5 extends ASB {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C62435Oet LJLJJI;

    @Override // X.ASG
    public final void LIZ(View v) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(v, "v");
        IComplianceBusinessService LJFF = a.LJFF();
        Fragment fragment = this.LJLJJI.LJLJJLL;
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        LJFF.LJJIJL(activityC45651qj, this.LJLJJI.LJLILLLLZI, "manage_feeds_pop_up");
        C116484hg.LIZ("enter_from", this.LJLJJI.LJLILLLLZI, "click_manage_feeds");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62447Of5(C62435Oet manager, AS3 as3) {
        super(manager, as3);
        o.LJIIIZ(manager, "manager");
        this.LJLJJI = manager;
    }
}
