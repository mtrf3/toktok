package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;

/* renamed from: X.Y8m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC86896Y8m implements View.OnClickListener {
    public final /* synthetic */ InterfaceC86908Y8y LJLIL;
    public final /* synthetic */ ViewPager LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ LBF LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ C86904Y8u LJLJJLL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        if (!this.LJLJJLL.LJLJL) {
            return;
        }
        InterfaceC86908Y8y interfaceC86908Y8y = this.LJLIL;
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(0);
        }
        this.LJLILLLLZI.setCurrentItem(this.LJLJI);
        if (C86907Y8x.LIZIZ() || C00F.LIZ(31744, 0, "profile_video_sort_style", true) != 0) {
            C86904Y8u c86904Y8u = this.LJLJJLL;
            if (c86904Y8u.LJLLLLLL) {
                AwemePagerVM awemePagerVM = c86904Y8u.LJLJLLL;
                if (!awemePagerVM.LJLJJLL) {
                    LBF lbf = this.LJLJJI;
                    User user = c86904Y8u.LJLL;
                    Aweme aweme = c86904Y8u.LJLLI;
                    View view2 = this.LJLJJL;
                    if (c86904Y8u.LJLLJ || c86904Y8u.LJLLL) {
                        if (c86904Y8u.LJLJJL) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        c86904Y8u.LJLZ = new Y4A(awemePagerVM, lbf, c86904Y8u.getContext(), str, user, aweme);
                        if (C86907Y8x.LIZ() == 1 || C86907Y8x.LIZ() == 3 || C00F.LIZ(31744, 0, "profile_video_sort_style", true) == 1) {
                            c86904Y8u.LJLZ.LIZ();
                        } else {
                            c86904Y8u.LJLZ.LIZIZ(view2);
                        }
                        ((Y4F) lbf).setSupportIconState(Y4H.TOGGLED);
                        String str3 = "";
                        if (user == null || user.getUid() == null) {
                            str2 = "";
                        } else {
                            str2 = user.getUid();
                        }
                        if (aweme != null && aweme.getAid() != null) {
                            str3 = aweme.getAid();
                        }
                        C26335AVf.LJIIL(str, str2, str3, "output_tab_vv_ranking");
                    }
                }
            }
        }
        this.LJLJJLL.LJLLJ = true;
    }

    public ViewOnClickListenerC86896Y8m(C86904Y8u c86904Y8u, InterfaceC86908Y8y interfaceC86908Y8y, VW9 vw9, int i, LBF lbf, View view) {
        this.LJLJJLL = c86904Y8u;
        this.LJLIL = interfaceC86908Y8y;
        this.LJLILLLLZI = vw9;
        this.LJLJI = i;
        this.LJLJJI = lbf;
        this.LJLJJL = view;
    }
}
