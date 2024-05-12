package X;

import Y.ACListenerS44S0200000_9;
import Y.IDCListenerS246S0100000_9;
import Y.IDCListenerS300S0100000_9;
import Y.IDgS349S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MiE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC57546MiE extends RecyclerView.ViewHolder implements InterfaceC57552MiK, View.OnClickListener, InterfaceC57288Me4 {
    public final InterfaceC57553MiL LJLIL;
    public final InterfaceC57554MiM LJLILLLLZI;
    public final InterfaceC57555MiN LJLJI;
    public final GalleryLayoutManager LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public InterfaceC57527Mhv LJLJL;
    public InterfaceC57556MiO<ViewOnClickListenerC57546MiE> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public VideoViewComponent LJLLLL;
    public boolean LJLLLLLL;
    public final C56462Jm LJLZ;
    public boolean LJZ;
    public Video LJZI;
    public UserWithAweme LJZL;
    public Integer LL;
    public final InterfaceC51691KQl LLD;
    public final C57548MiG LLF;

    public final void LLLLLLLLL() {
        this.LJZ = false;
        if (this.LJLZ.LIZ != 0) {
            Q().LJIIJJI();
            Q().LJIIIZ();
            Q().LLIIIILZ(this.LLF);
            this.LJLZ.LIZ = 0;
            P().setVisibility(0);
        }
    }

    public final TextView N() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-follow>(...)");
        return (TextView) value;
    }

    public final C62846OlW P() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-image>(...)");
        return (C62846OlW) value;
    }

    public final VideoViewComponent Q() {
        VideoViewComponent videoViewComponent = this.LJLLLL;
        if (videoViewComponent != null) {
            return videoViewComponent;
        }
        o.LJIJI("mVideoView");
        throw null;
    }

    public final void T() {
        if (!this.LJLLLLLL || P().getVisibility() != 0) {
            return;
        }
        AlphaAnimation LIZIZ = C62850Ola.LIZIZ(1.0f, 0.0f, 500L);
        LIZIZ.setAnimationListener(new AnimationAnimationListenerC57550MiI(this));
        P().startAnimation(LIZIZ);
    }

    public final void U() {
        UserWithAweme userWithAweme = this.LJZL;
        if (userWithAweme != null) {
            X(userWithAweme.getUser().getFollowStatus(), userWithAweme.getUser().getFollowerStatus());
            UserVerify userVerify = new UserVerify(userWithAweme.getUser().getAvatarThumb(), userWithAweme.getUser().getCustomVerify(), userWithAweme.getUser().getEnterpriseVerifyReason(), Integer.valueOf(userWithAweme.getUser().getVerificationType()));
            Object value = this.LJLL.getValue();
            o.LJIIIIZZ(value, "<get-avatar>(...)");
            ((AP9) value).setUserData(userVerify);
            Object value2 = this.LJLL.getValue();
            o.LJIIIIZZ(value2, "<get-avatar>(...)");
            ((AP9) value2).LIZ();
            L(userWithAweme.getUser());
        }
    }

    public final boolean Y() {
        List<String> list;
        Aweme aweme;
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        Aweme aweme2;
        Music music;
        Aweme aweme3;
        Music music2;
        UrlModel playUrl;
        UserWithAweme userWithAweme = this.LJZL;
        Integer num = null;
        if (userWithAweme != null && (aweme3 = userWithAweme.getAweme()) != null && (music2 = aweme3.getMusic()) != null && (playUrl = music2.getPlayUrl()) != null) {
            list = playUrl.getUrlList();
        } else {
            list = null;
        }
        UserWithAweme userWithAweme2 = this.LJZL;
        if (userWithAweme2 != null && (aweme2 = userWithAweme2.getAweme()) != null && (music = aweme2.getMusic()) != null) {
            num = Integer.valueOf(music.getMusicStatus());
        }
        if (list == null || list.isEmpty() || (num != null && num.intValue() == 0)) {
            return true;
        }
        UserWithAweme userWithAweme3 = this.LJZL;
        if (userWithAweme3 == null || (aweme = userWithAweme3.getAweme()) == null || (status = aweme.getStatus()) == null || (videoMuteInfo = status.getVideoMuteInfo()) == null || !videoMuteInfo.isMute()) {
            return false;
        }
        return true;
    }

    public final void LJIILLIIL() {
        if (!Q().LJLJI.d4() || this.LJZI == null) {
            this.LJZ = true;
            return;
        }
        int i = this.LJLZ.LIZ;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            T();
            Q().LJIIL(this.LJZI);
            if (Y()) {
                Q().LJI();
            }
            this.LJLZ.LIZ = 4;
            return;
        }
        Q().LIZ(this.LLF);
        VideoViewComponent Q = Q();
        Video video = this.LJZI;
        FFL.LJIIIZ().getClass();
        Q.LJII(video, FFL.LJIIJ(31744, 0, "decoder_type", true));
        if (Y()) {
            Q().LJI();
        }
        this.LJZ = false;
        this.LJLZ.LIZ = 2;
    }

    public final void M() {
        Activity activity;
        int i;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(C84763XOl.LJIIIIZZ(), "homepage_follow", "click_follow_tab", null, new IDgS349S0100000_9(this, 11));
            return;
        }
        UserWithAweme userWithAweme = this.LJZL;
        if (userWithAweme != null) {
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                this.LJLILLLLZI.LJLL(getAdapterPosition());
            }
            if (this.itemView.getContext() != null && (this.itemView.getContext() instanceof Activity)) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                activity = C45804HyK.LJIJJ(context);
                o.LJI(activity);
            } else {
                activity = null;
            }
            if (userWithAweme.getUser().getFollowStatus() != 0) {
                i = 0;
            } else if (userWithAweme.getUser().isSecret()) {
                i = 4;
            } else if (userWithAweme.getUser().getFollowerStatus() == 1) {
                i = 2;
            } else {
                i = 1;
            }
            if (userWithAweme.getUser().getFollowStatus() == 4) {
                if (activity != null) {
                    V(i);
                    return;
                }
                return;
            }
            if (i == 4) {
                if (activity == null) {
                    return;
                }
                C36821Ecj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
                Integer followCount = privacyAccountFollowCount.LIZ();
                if (followCount == null || followCount.intValue() != 0) {
                    o.LJIIIIZZ(followCount, "followCount");
                    int intValue = followCount.intValue();
                    if (1 <= intValue && intValue < 4) {
                        C5S1 c5s1 = new C5S1(activity);
                        c5s1.LIZJ(R.string.pao);
                        c5s1.LJ();
                    }
                } else {
                    C62905OmT c62905OmT = new C62905OmT(activity);
                    c62905OmT.LIZ(R.string.pan);
                    c62905OmT.LJIIJ(R.string.h3a, null);
                    C279017q.LIZLLL(c62905OmT);
                }
                privacyAccountFollowCount.LIZLLL(Integer.valueOf(followCount.intValue() + 1));
                V(i);
                return;
            }
            V(i);
        }
    }

    @Override // X.InterfaceC57552MiK
    public final void x() {
        U();
    }

    public final void L(User user) {
        o.LJIIIZ(user, "user");
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-text>(...)");
        ((TextView) value).setText(user.getNickname());
        Object value2 = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value2, "<get-realName>(...)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        LIZ.append(user.getUniqueId());
        ((TextView) value2).setText(X1D.LIZIZ(LIZ));
        Context context = this.itemView.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        Object value3 = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value3, "<get-text>(...)");
        AJ9.LJ(context, customVerify, enterpriseVerifyReason, (TextView) value3);
    }

    public final void V(int i) {
        Integer num;
        int i2;
        User user;
        X(i, -1);
        UserWithAweme userWithAweme = this.LJZL;
        if (userWithAweme != null && (user = userWithAweme.getUser()) != null) {
            num = Integer.valueOf(user.getFollowStatus());
        } else {
            num = null;
        }
        this.LL = num;
        UserWithAweme userWithAweme2 = this.LJZL;
        if (userWithAweme2 != null) {
            boolean z = false;
            if (userWithAweme2.getUser().getFollowStatus() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            InterfaceC51691KQl interfaceC51691KQl = this.LLD;
            ALX alx = new ALX();
            alx.LIZJ(userWithAweme2.getUser().getUid());
            alx.LIZIZ(userWithAweme2.getUser().getSecUid());
            if (userWithAweme2.getUser().isSecret() || userWithAweme2.getUser().isPrivateAccount()) {
                z = true;
            }
            C57285Me1 c57285Me1 = alx.LIZ;
            c57285Me1.LJIIL = z;
            c57285Me1.LIZJ = i2;
            c57285Me1.LJFF = "homepage_follow";
            c57285Me1.LIZLLL = 12;
            alx.LIZ.LJIIJ = userWithAweme2.getUser().getFollowerStatus();
            alx.LIZ.LJIILL = userWithAweme2.getUser().getAccurateRecType();
            interfaceC51691KQl.LJIJJ(alx.LIZ());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserWithAweme userWithAweme;
        o.LJIIIZ(view, "view");
        int id = view.getId();
        if (id == R.id.bf7) {
            UserWithAweme userWithAweme2 = this.LJZL;
            if (userWithAweme2 != null) {
                InterfaceC57527Mhv interfaceC57527Mhv = this.LJLJL;
                if (interfaceC57527Mhv != null) {
                    User user = userWithAweme2.getUser();
                    getAdapterPosition();
                    interfaceC57527Mhv.LIZJ(user);
                }
                this.LJLIL.LJJZZI(userWithAweme2.getUser(), getAdapterPosition());
                return;
            }
            return;
        }
        if (id != R.id.djm || C6ZT.LIZ(view) || (userWithAweme = this.LJZL) == null) {
            return;
        }
        InterfaceC57527Mhv interfaceC57527Mhv2 = this.LJLJL;
        if (interfaceC57527Mhv2 != null) {
            User user2 = userWithAweme.getUser();
            getAdapterPosition();
            interfaceC57527Mhv2.LIZLLL(user2);
        }
        M();
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowFail(Exception exc) {
        User user;
        int i;
        int followStatus;
        C57293Me9.LIZ(C27740Aue.LIZ(this.itemView.getContext()), exc);
        UserWithAweme userWithAweme = this.LJZL;
        if (userWithAweme != null) {
            Integer num = this.LL;
            if (num != null) {
                followStatus = num.intValue();
            } else {
                followStatus = userWithAweme.getUser().getFollowStatus();
            }
            X(followStatus, userWithAweme.getUser().getFollowerStatus());
        }
        UserWithAweme userWithAweme2 = this.LJZL;
        if (userWithAweme2 == null || (user = userWithAweme2.getUser()) == null) {
            return;
        }
        Integer num2 = this.LL;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        user.setFollowStatus(i);
    }

    @Override // X.InterfaceC57288Me4
    public final void onFollowSuccess(FollowStatus followStatus) {
        UserWithAweme userWithAweme = this.LJZL;
        if (userWithAweme == null || !TextUtils.equals(followStatus.userId, userWithAweme.getUser().getUid())) {
            return;
        }
        userWithAweme.getUser().setFollowStatus(followStatus.followStatus);
        int i = followStatus.followStatus;
        UserWithAweme userWithAweme2 = this.LJZL;
        o.LJI(userWithAweme2);
        C2U8.LIZ(new C31633CbF(i, userWithAweme2));
        X(followStatus.followStatus, followStatus.followerStatus);
        if (followStatus.followStatus == 0 && !TextUtils.isEmpty(userWithAweme.getUser().getRemarkName())) {
            userWithAweme.getUser().setRemarkName("");
            L(userWithAweme.getUser());
        }
    }

    @Override // X.InterfaceC57288Me4
    public final void onResponseSuccess(FollowStatus followStatus) {
        Integer num;
        if (followStatus != null) {
            num = Integer.valueOf(followStatus.followStatus);
        } else {
            num = null;
        }
        this.LL = num;
    }

    public final void X(int i, int i2) {
        int i3;
        N().setVisibility(0);
        Resources resources = this.itemView.getContext().getResources();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return;
                    }
                    TextView N = N();
                    Context context = N().getContext();
                    o.LJIIIIZZ(context, "follow.context");
                    N.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, context));
                    N().setBackgroundResource(R.drawable.a33);
                    N().setText(this.itemView.getContext().getString(R.string.gk4));
                    return;
                }
                i3 = R.string.exk;
            } else {
                i3 = R.string.gkd;
            }
            N().setText(i3);
            TextView N2 = N();
            Context context2 = N().getContext();
            o.LJIIIIZZ(context2, "follow.context");
            N2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dk, context2));
            N().setBackgroundResource(R.drawable.a33);
            return;
        }
        if (i2 == 1) {
            N().setText(resources.getText(R.string.gix));
        } else {
            N().setText(resources.getText(R.string.git));
        }
        N().setBackgroundResource(R.drawable.yh);
        TextView N3 = N();
        Context context3 = N().getContext();
        o.LJIIIIZZ(context3, "follow.context");
        N3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context3));
    }

    @Override // X.InterfaceC57552MiK
    public final void LJIIIZ(int i, View view, RecyclerView recyclerView) {
        User user;
        if (getAdapterPosition() != i) {
            LLLLLLLLL();
            return;
        }
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        InterfaceC57556MiO<ViewOnClickListenerC57546MiE> interfaceC57556MiO = this.LJLJLJ;
        if (interfaceC57556MiO != null) {
            EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) interfaceC57556MiO;
            UserWithAweme userWithAweme = this.LJZL;
            if (userWithAweme != null && (user = userWithAweme.getUser()) != null) {
                emptyGuideV2.LJJ(user);
            }
        }
        GalleryLayoutManager galleryLayoutManager = this.LJLJJI;
        WeakReference<Activity> weakReference = galleryLayoutManager.LLI;
        if (weakReference != null && weakReference.get() != null) {
            if (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isOnFollowPage(galleryLayoutManager.LLI.get())) {
                return;
            }
        }
        LJIILLIIL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC57546MiE(View view, InterfaceC57553MiL onItemCloseListener, InterfaceC57554MiM onItemFollowListener, InterfaceC57555MiN onItemLongClickListener, GalleryLayoutManager mGalleryLayoutManager) {
        super(view);
        o.LJIIIZ(onItemCloseListener, "onItemCloseListener");
        o.LJIIIZ(onItemFollowListener, "onItemFollowListener");
        o.LJIIIZ(onItemLongClickListener, "onItemLongClickListener");
        o.LJIIIZ(mGalleryLayoutManager, "mGalleryLayoutManager");
        this.LJLIL = onItemCloseListener;
        this.LJLILLLLZI = onItemFollowListener;
        this.LJLJI = onItemLongClickListener;
        this.LJLJJI = mGalleryLayoutManager;
        this.LJLJJL = (int) KL2.LIZJ(view.getContext(), 279.0f);
        this.LJLJJLL = (int) KL2.LIZJ(view.getContext(), 372.0f);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 949));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 944));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(view, 945));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(view, 946));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 950));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(view, 947));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS159S0100000_9(view, 948));
        this.LJLLL = LIZIZ2;
        this.LJLZ = new C56462Jm();
        InterfaceC51691KQl followPresenter = C77266UUc.LIZIZ.getFollowPresenter();
        this.LLD = followPresenter;
        this.LLF = new C57548MiG(this);
        view.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 8));
        this.LJLLLL = new VideoViewComponent(0);
        VideoViewComponent Q = Q();
        Object value = LIZIZ2.getValue();
        o.LJIIIIZZ(value, "<get-mSurface>(...)");
        Q.LJIILJJIL((C47689Ind) value);
        Q().LJLJI.N7(new C57551MiJ(this));
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9(view, this, 33), view);
        view.setOnLongClickListener(new IDCListenerS300S0100000_9(this, 5));
        N().setOnLongClickListener(new IDCListenerS300S0100000_9(this, 6));
        Object value2 = LIZIZ.getValue();
        o.LJIIIIZZ(value2, "<get-close>(...)");
        ((View) value2).setOnLongClickListener(new IDCListenerS300S0100000_9(this, 7));
        C16880lQ.LJIJI(N(), this);
        Object value3 = LIZIZ.getValue();
        o.LJIIIIZZ(value3, "<get-close>(...)");
        C16880lQ.LJIILLIIL((ImageView) value3, this);
        followPresenter.LJIIIIZZ(this);
        o.LJIIIIZZ(view.getContext(), "itemView.context");
        if (C53322KwI.LIZ()) {
            int LJIIJJI = (int) (KL2.LJIIJJI(r1) * 0.712f);
            this.LJLJJL = LJIIJJI;
            this.LJLJJLL = (int) (LJIIJJI * 1.34f);
        }
    }
}
