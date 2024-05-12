package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y8l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86895Y8l extends C86898Y8o {
    public final C86894Y8k LIZIZ;
    public final View LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // X.C86898Y8o
    public final void LIZLLL() {
        this.LIZLLL = false;
        C86894Y8k c86894Y8k = this.LIZIZ;
        boolean z = true;
        if (c86894Y8k == null || c86894Y8k.getLandingTabType() != 0 || !this.LJ) {
            z = false;
        }
        this.LJFF = z;
        this.LJ = false;
    }

    @Override // X.C86898Y8o
    public final void LIZ(C79236V7w profileTabData, View view) {
        String str;
        Resources resources;
        o.LJIIIZ(profileTabData, "profileTabData");
        C8VB c8vb = null;
        if (view != null) {
            Context context = view.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getString(R.string.a6f);
            } else {
                str = null;
            }
            view.setContentDescription(str);
        }
        Integer num = this.LIZ.LJLJJI;
        if (num != null && num.intValue() == 1) {
            C8VC.LJIIL(this.LIZ, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.98b
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C234999Kd) obj).LIZIZ;
                }
            }, new AqS119S0300000_15(view, this, profileTabData, 3));
        }
        AwemePagerVM awemePagerVM = this.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(InterfaceC235069Kk.class);
        o.LJIIIZ(awemePagerVM, "<this>");
        C8VA c8va = awemePagerVM.hierarchyServiceStore;
        if (c8va != null) {
            c8vb = c8va.LIZIZ(C39557Ffl.LIZ(LIZ), null);
        }
        InterfaceC235069Kk interfaceC235069Kk = (InterfaceC235069Kk) c8vb;
        if (interfaceC235069Kk != null) {
            boolean z = this.LIZ.LJLJI;
            C9IL c9il = C9IL.TAB;
            String lowerCase = "HAS_OUTPUT_TAB_VV_RANKING".toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            interfaceC235069Kk.y6(z, c9il, lowerCase, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86895Y8l(AwemePagerVM pagerVM, C86894Y8k c86894Y8k, View view) {
        super(pagerVM);
        o.LJIIIZ(pagerVM, "pagerVM");
        this.LIZIZ = c86894Y8k;
        this.LIZJ = view;
        this.LJ = true;
    }

    @Override // X.C86898Y8o
    public final void LJ(C79236V7w profileTabData, int i, View view) {
        boolean z;
        String str;
        String uid;
        o.LJIIIZ(profileTabData, "profileTabData");
        o.LJIIIZ(view, "view");
        if (this.LIZ.LJLJJLL) {
            return;
        }
        super.LJ(profileTabData, i, view);
        AwemePagerVM awemePagerVM = this.LIZ;
        Y4F y4f = (Y4F) view;
        if (this.LIZLLL || this.LJFF) {
            if (C86907Y8x.LIZ() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || C00F.LIZ(31744, 0, "profile_video_sort_style", true) != 0) {
                Context context = y4f.getContext();
                o.LJIIIIZZ(context, "tabView.context");
                String str2 = "personal_homepage";
                if (this.LIZ.LJLJI) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                Y4A y4a = new Y4A(awemePagerVM, y4f, context, str, awemePagerVM.LJLILLLLZI, awemePagerVM.LJLJJL);
                if (C86907Y8x.LIZ() == 1 || C86907Y8x.LIZ() == 3 || C00F.LIZ(31744, 0, "profile_video_sort_style", true) == 1) {
                    y4a.LIZ();
                } else {
                    y4a.LIZIZ(this.LIZJ);
                }
                y4f.setSupportIconState(Y4H.TOGGLED);
                Aweme aweme = awemePagerVM.LJLJJL;
                String str3 = null;
                if (aweme != null) {
                    str3 = aweme.getAid();
                }
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                if (!this.LIZ.LJLJI) {
                    str2 = "others_homepage";
                }
                User user = awemePagerVM.LJLILLLLZI;
                if (user != null && (uid = user.getUid()) != null) {
                    str4 = uid;
                }
                C26335AVf.LJIIL(str2, str4, str3, "output_tab_vv_ranking");
            }
        }
        this.LIZLLL = true;
    }
}
