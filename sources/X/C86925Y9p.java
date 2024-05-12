package X;

import Y.ACListenerS35S0100000_15;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Y9p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86925Y9p implements InterfaceC86931Y9v {
    public final TuxIconView LIZ;
    public final /* synthetic */ C86926Y9q LIZIZ;

    public C86925Y9p(C86926Y9q c86926Y9q) {
        TuxIconView tuxIconView;
        this.LIZIZ = c86926Y9q;
        View view = c86926Y9q.LJFF;
        if (view != null) {
            tuxIconView = (TuxIconView) view.findViewById(R.id.c7w);
        } else {
            tuxIconView = null;
        }
        this.LIZ = tuxIconView;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(c86926Y9q, 261));
        }
    }

    @Override // X.InterfaceC86931Y9v
    public final void LIZ(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || !TextUtils.equals(author.getUid(), ((RBX) HG3.LJIILL()).getCurUser().getUid())) {
            TuxIconView tuxIconView = this.LIZ;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_3pt_arrow_turn_up_right);
            }
        } else {
            TuxIconView tuxIconView2 = this.LIZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.drawable.bol);
            }
        }
        this.LIZIZ.LIZLLL().LJLJJL.setValue(null);
    }
}
