package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS61S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MFS extends AbstractC208618Gr<C26336AVg> {
    public final Context LJLJJLL;

    @Override // X.MFR
    public void LLZLLLL() {
    }

    public final void P() {
        HG3.LJIIL();
        if (!HG3.LJLJL.LJFF().isLogin()) {
            J9P.LIZIZ(C45804HyK.LJIJJ(this.LJLJJLL), "", "click_draft", null, null);
        } else {
            AVExternalServiceImpl.LIZ().asyncService("DraftBox", new IDLCallbackS61S0100000_9(this, 1));
        }
    }

    public MFS(View view) {
        super(view);
        this.LJLJJLL = view.getContext();
    }

    public void N(C26336AVg data, int i) {
        bind(data, i);
        o.LJIIIZ(data, "data");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c188727au.LJIIIZ("author_id", curUserId);
        c188727au.LIZLLL(data.LIZ, "draft_cnt");
        FMX.LJIIL("draft_show", c188727au.LIZ);
    }
}
