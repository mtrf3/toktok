package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.notification.LikeListDetailFragment;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MX8 extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public DiggInfo LJLJLJ;
    public ActivityStatus LJLJLLL;
    public final String LJLL;
    public C107724Kq LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    public final C188627ak L() {
        return (C188627ak) this.LJLJJL.getValue();
    }

    public final C57446Mgc M() {
        return (C57446Mgc) this.LJLLJ.getValue();
    }

    public final void N() {
        Aweme aweme;
        User user;
        UserListActivity userListActivity;
        DiggInfo diggInfo = this.LJLJLJ;
        if (diggInfo == null || (aweme = diggInfo.aweme) == null) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "aweme://aweme/detail/");
        buildRoute.withParam("id", aweme.getAid());
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "");
        buildRoute.withParam("duo_type", "duo_detail");
        buildRoute.withParam("show_add_yours_button", 1);
        buildRoute.open();
        DiggInfo diggInfo2 = this.LJLJLJ;
        if (diggInfo2 == null || (user = diggInfo2.user) == null) {
            return;
        }
        Context context = this.itemView.getContext();
        if (!(context instanceof UserListActivity) || (userListActivity = (UserListActivity) context) == null) {
            return;
        }
        userListActivity.LLIIIZ(user, getAdapterPosition(), "click");
    }

    public MX8(View view) {
        super(view);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(view, 419));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS159S0100000_9(view, 417));
        this.LJLIL = LIZIZ2;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(view, 416));
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS159S0100000_9(view, 421));
        this.LJLJI = LIZIZ3;
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(view, 420));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 418));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 425));
        C62822Ol8 LIZIZ4 = C221108m2.LIZIZ(new AqS159S0100000_9(view, 427));
        this.LJLJL = LIZIZ4;
        this.LJLL = "notification_page";
        C221108m2.LIZIZ(new AqS159S0100000_9(view, 423));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 422));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(view, 424));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ((View) LIZIZ.getValue(), MVP.CELL, 0.0f);
            MVR.LIZ(((AP9) LIZIZ2.getValue()).getAvatarImageView(), MVP.AVATAR, 0.0f);
            MVR.LIZ((View) LIZIZ3.getValue(), MVP.USERNAME, 0.0f);
        } else {
            View mRoot = (View) LIZIZ.getValue();
            o.LJIIIIZZ(mRoot, "mRoot");
            MVR.LJ(mRoot);
        }
        C16880lQ.LJJJJJ((AP9) LIZIZ2.getValue(), this);
        C16880lQ.LJJJJI((TuxTextView) LIZIZ3.getValue(), this);
        C16880lQ.LJIL((ConstraintLayout) LIZIZ.getValue(), this);
        C16880lQ.LJJJJLI((C62354Oda) LIZIZ4.getValue(), this);
        C221108m2.LIZIZ(new AqS159S0100000_9(view, 426));
    }

    public final void P(User user) {
        UserListActivity userListActivity;
        LikeListDetailFragment likeListDetailFragment;
        MW4 mw4 = C56906MVa.Companion;
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        String secUid = user.getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        MW4.LIZ(mw4, uid, secUid, null, false, this.LJLL, null, 108);
        if (C53355Kwp.LIZ()) {
            Object context = this.itemView.getContext();
            if ((context instanceof LikeListDetailFragment) && (likeListDetailFragment = (LikeListDetailFragment) context) != null) {
                likeListDetailFragment.Il(user, getAdapterPosition(), "click");
            }
        } else {
            Context context2 = this.itemView.getContext();
            if ((context2 instanceof UserListActivity) && (userListActivity = (UserListActivity) context2) != null) {
                userListActivity.LLIIIZ(user, getAdapterPosition(), "click");
            }
        }
        if (L().getVisibility() == 0) {
            C56760MPk.LJIIL("enter_profile", "", "like_list", user, null);
        }
        C107724Kq c107724Kq = this.LJLLI;
        if (c107724Kq != null) {
            c107724Kq.LJ = "profile";
            C78946Uyc.LJJIJIIJIL(c107724Kq);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        User user;
        o.LJIIIZ(v, "v");
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            DiggInfo diggInfo = this.LJLJLJ;
            if (diggInfo != null && (user = diggInfo.user) != null) {
                int id = v.getId();
                if (id == R.id.h4v || id == R.id.h5f) {
                    P(user);
                    return;
                }
                if (id == R.id.h5p) {
                    DiggInfo diggInfo2 = this.LJLJLJ;
                    if (diggInfo2 != null && diggInfo2.aweme != null) {
                        N();
                        return;
                    } else {
                        P(user);
                        return;
                    }
                }
                if (id != R.id.n4v) {
                    return;
                }
                N();
                return;
            }
            return;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26045AKb c26045AKb = new C26045AKb(itemView);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }
}
