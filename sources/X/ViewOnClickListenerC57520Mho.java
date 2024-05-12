package X;

import Y.AObjectS42S0101000_5;
import Y.IDgS349S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Mho, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC57520Mho extends RecyclerView.ViewHolder implements View.OnClickListener, InterfaceC57288Me4 {
    public static final /* synthetic */ int LJZ = 0;
    public final View LJLIL;
    public final AP9 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public User LJLJJLL;
    public int LJLJL;
    public InterfaceC57532Mi0 LJLJLJ;
    public InterfaceC57533Mi1 LJLJLLL;
    public final Context LJLL;
    public final InterfaceC51691KQl LJLLI;
    public InterfaceC57527Mhv LJLLILLLL;
    public final View LJLLJ;
    public String LJLLL;
    public final int LJLLLL;
    public final View LJLLLLLL;
    public final Object LJLZ;

    @Override // X.InterfaceC57288Me4
    public final void onResponseSuccess(FollowStatus followStatus) {
    }

    public final void M() {
        Activity activity;
        int i;
        InterfaceC57533Mi1 interfaceC57533Mi1;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(C84763XOl.LJIIIIZZ(), "homepage_follow", "click_follow_tab", null, new IDgS349S0100000_9(this, 0));
            return;
        }
        if (this.LJLJJLL.getFollowStatus() == 0 && (interfaceC57533Mi1 = this.LJLJLLL) != null) {
            C57528Mhw c57528Mhw = (C57528Mhw) interfaceC57533Mi1;
            RecyclerView recyclerView = c57528Mhw.LIZIZ.LJLLI;
            if (recyclerView != null) {
                recyclerView.LJLIIIL((int) KL2.LIZJ(c57528Mhw.LIZ, 130.0f), 0);
            }
        }
        Context context = this.LJLL;
        if (context != null && (context instanceof Activity)) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if (this.LJLJJLL.getFollowStatus() != 0) {
            i = 0;
        } else if (this.LJLJJLL.isSecret()) {
            i = 4;
        } else if (this.LJLJJLL.getFollowerStatus() == 1) {
            i = 2;
        } else {
            i = 1;
        }
        if (this.LJLJJLL.getFollowStatus() == 4) {
            if (activity != null) {
                N(i);
                return;
            }
            return;
        }
        if (i == 4) {
            if (activity == null) {
                return;
            }
            C36821Ecj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
            int intValue = privacyAccountFollowCount.LIZ().intValue();
            if (intValue == 0) {
                C62905OmT c62905OmT = new C62905OmT(activity);
                c62905OmT.LIZ(R.string.pan);
                c62905OmT.LJIIJJI(R.string.h3a, null, false);
                C279017q.LIZLLL(c62905OmT);
            } else if (intValue >= 1 && intValue < 4) {
                C5S1 c5s1 = new C5S1(activity);
                c5s1.LIZJ(R.string.pao);
                c5s1.LJ();
            }
            privacyAccountFollowCount.LIZLLL(Integer.valueOf(intValue + 1));
            N(i);
            return;
        }
        N(i);
    }

    public final void L(User user) {
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.LJLJI.setText(this.LJLJJLL.getNickname());
            this.LJLIL.setContentDescription(this.LJLJJLL.getNickname());
            this.LJLILLLLZI.setContentDescription(this.LJLJJLL.getNickname());
        } else {
            this.LJLJI.setText(this.LJLJJLL.getRemarkName());
            this.LJLIL.setContentDescription(this.LJLJJLL.getRemarkName());
            this.LJLILLLLZI.setContentDescription(this.LJLJJLL.getNickname());
        }
    }

    public final void N(int i) {
        String str;
        C67852lR c67852lR = new C67852lR(C27740Aue.LIZIZ(this.itemView));
        c67852lR.LIZJ = this.LJLZ;
        c67852lR.LIZIZ = this.LJLJJLL;
        int i2 = 0;
        InterfaceC84043Ro familiarService = IMService.createIIMServicebyMonsterPlugin(false).getFamiliarService();
        if (familiarService != null) {
            familiarService.LIZJ(c67852lR);
        }
        P(i, this.LJLJJLL.getFollowerStatus());
        if (this.LJLJJLL.getFollowStatus() == 0) {
            i2 = 1;
        }
        InterfaceC51691KQl interfaceC51691KQl = this.LJLLI;
        ALX alx = new ALX();
        alx.LIZJ(this.LJLJJLL.getUid());
        alx.LIZIZ(this.LJLJJLL.getSecUid());
        boolean isAccuratePrivateAccount = this.LJLJJLL.isAccuratePrivateAccount();
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LJIIL = isAccuratePrivateAccount;
        c57285Me1.LIZJ = i2;
        if (this.LJLLLL == 1) {
            str = "homepage_follow";
        } else {
            str = "others_homepage";
        }
        c57285Me1.LJFF = str;
        c57285Me1.LIZLLL = 12;
        alx.LIZ.LJIIJ = this.LJLJJLL.getFollowerStatus();
        alx.LIZ.LJIILL = this.LJLJJLL.getAccurateRecType();
        interfaceC51691KQl.LJIJJ(alx.LIZ());
    }

    public final void Q(int i) {
        this.LJLJJL.setPadding(0, 0, 0, 0);
        this.LJLJJL.setGravity(17);
        this.LJLJJL.setCompoundDrawables(null, null, null, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int id = view.getId();
        if (id == R.id.bf7) {
            InterfaceC57532Mi0 interfaceC57532Mi0 = this.LJLJLJ;
            if (interfaceC57532Mi0 != null) {
                ((C57524Mhs) interfaceC57532Mi0).LIZ(this.LJLJJLL, this.LJLJL);
                return;
            }
            return;
        }
        if (id == R.id.abh) {
            InterfaceC57527Mhv interfaceC57527Mhv = this.LJLLILLLL;
            if (interfaceC57527Mhv != null) {
                interfaceC57527Mhv.LIZ(this.LJLJJLL);
            }
            if (this.LJLJJLL == null) {
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLL, "//user/profile");
            buildRoute.withParam("uid", this.LJLJJLL.getUid());
            buildRoute.withParam("from_recommend_card", 1);
            buildRoute.withParam("sec_user_id", this.LJLJJLL.getSecUid());
            if (this.LJLLLL == 1) {
                str = "homepage_follow";
            } else {
                str = "others_homepage";
            }
            buildRoute.withParam("enter_from", str);
            buildRoute.withParam("enter_from_request_id", this.LJLLL);
            buildRoute.withParam("extra_previous_page_position", "card_head");
            buildRoute.withParam("need_track_compare_recommend_reason", 1);
            buildRoute.withParam("previous_recommend_reason", this.LJLJJLL.getRecommendReason());
            buildRoute.withParam("recommend_from_type", "card");
            buildRoute.open();
            return;
        }
        if (id != R.id.djm) {
            return;
        }
        InterfaceC57527Mhv interfaceC57527Mhv2 = this.LJLLILLLL;
        if (interfaceC57527Mhv2 != null) {
            interfaceC57527Mhv2.LIZLLL(this.LJLJJLL);
        }
        M();
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowFail(Exception exc) {
        C57293Me9.LIZ(C27740Aue.LIZ(this.LJLL), exc);
        P(this.LJLJJLL.getFollowStatus(), this.LJLJJLL.getFollowerStatus());
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        if (!TextUtils.equals(followStatus.userId, this.LJLJJLL.getUid())) {
            return;
        }
        this.LJLJJLL.setFollowStatus(followStatus.followStatus);
        C2U8.LIZ(new C31633CbF(followStatus.followStatus, this.LJLJJLL));
        P(followStatus.followStatus, followStatus.followerStatus);
        Object obj = this.LJLL;
        if ((!(obj instanceof LifecycleOwner) || ((LifecycleOwner) obj).getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) && followStatus.followStatus == 0 && !TextUtils.isEmpty(this.LJLJJLL.getRemarkName())) {
            this.LJLJJLL.setRemarkName("");
            L(this.LJLJJLL);
        }
    }

    public final void P(int i, int i2) {
        int i3;
        this.LJLJJL.setVisibility(0);
        Resources resources = this.LJLL.getResources();
        if (i == 0) {
            this.LJLJJL.setText(resources.getText(R.string.git));
            this.LJLJJL.setBackgroundResource(R.drawable.yh);
            TextView textView = this.LJLJJL;
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, textView.getContext()));
            Q(-1);
        } else if (i == 1 || i == 2) {
            Q(-1);
            if (i == 2) {
                i3 = R.string.exk;
            } else {
                i3 = R.string.gkd;
            }
            this.LJLJJL.setText(i3);
            TextView textView2 = this.LJLJJL;
            textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, textView2.getContext()));
            this.LJLJJL.setBackgroundResource(R.drawable.c0_);
        } else if (i == 4) {
            TextView textView3 = this.LJLJJL;
            textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, textView3.getContext()));
            this.LJLJJL.setBackgroundResource(R.drawable.c0_);
            this.LJLJJL.setText(this.LJLL.getString(R.string.gk4));
        }
        new C67852lR(C27740Aue.LIZIZ(this.itemView));
        new AObjectS42S0101000_5(1, this, 24).invoke(new CIL());
    }

    public ViewOnClickListenerC57520Mho(int i, View view, Object obj) {
        super(view);
        this.LJLL = view.getContext();
        View findViewById = view.findViewById(R.id.mz2);
        this.LJLIL = findViewById;
        C16300kU.LJIJ(findViewById, 1);
        AP9 ap9 = (AP9) view.findViewById(R.id.abh);
        this.LJLILLLLZI = ap9;
        ap9.setRequestImgSize(J7H.LIZ(101));
        this.LJLLJ = view.findViewById(R.id.j71);
        this.LJLJI = (TextView) view.findViewById(R.id.mzt);
        this.LJLJJI = (TextView) view.findViewById(R.id.iqn);
        TextView textView = (TextView) view.findViewById(R.id.djm);
        this.LJLJJL = textView;
        this.LJLLLLLL = view.findViewById(R.id.f2_);
        C16880lQ.LJIILLIIL((ImageView) view.findViewById(R.id.bf7), this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJJ(ap9, this);
        C16880lQ.LJIJI(textView, this);
        if (this.LJLLI == null) {
            InterfaceC51691KQl followPresenter = FriendsServiceImpl.LJJJJ().getFollowPresenter();
            this.LJLLI = followPresenter;
            followPresenter.LJIIIIZZ(this);
        }
        this.LJLLLL = i;
        this.LJLZ = obj;
    }
}
