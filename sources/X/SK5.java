package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SK5 extends SLJ {
    public Aweme LJLL;
    public final Fragment LJLLI;
    public final String LJLLILLLL;
    public DialogC25756A8y LJLLJ;

    @Override // X.SLJ
    public final boolean LL() {
        InteractPermission interactPermission;
        InteractionPermission allowStorySwitchToPost;
        Aweme aweme = this.LJLL;
        if (aweme == null || (interactPermission = aweme.getInteractPermission()) == null || (allowStorySwitchToPost = interactPermission.getAllowStorySwitchToPost()) == null || allowStorySwitchToPost.getStatus() != 0 || C2304092m.LIZ()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SK5(Fragment fragment, Aweme aweme, String str) {
        super(new C25600zU(fragment.getContext(), R.style.kp));
        o.LJIIIZ(fragment, "fragment");
        this.LJLL = aweme;
        this.LJLLI = fragment;
        this.LJLLILLLL = str;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        SK6 sk6 = new SK6();
        sk6.LJIILIIL = Integer.valueOf(R.raw.icon_arrow_left_right);
        String string = mo49getActivity.getString(R.string.ryu);
        o.LJIIIIZZ(string, "ctx.getString(R.string.s…ettingsPanel_description)");
        AbstractC71913SKf.LIZLLL(sk6, string);
        sk6.LJIIIIZZ = new SK7(this);
        sk6.LJIIJJI = true;
        LJLLLLLL(new SKA(sk6));
        LJLLLLLL(new SKQ(C7MY.LIZIZ(16)));
    }
}
