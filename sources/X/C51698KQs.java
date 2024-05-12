package X;

import X.InterfaceC51691KQl;
import Y.ACListenerS43S0200000_8;
import Y.AObjectS124S0200000_8;
import Y.AObjectS41S0201000_8;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KQs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51698KQs implements Observer<FollowStatus> {
    public final InterfaceC51700KQu LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final InterfaceC51701KQv LJLJI;
    public User LJLJJI;
    public C49412JaK LJLJJL;
    public InterfaceC51702KQw LJLJJLL;
    public InterfaceC51703KQx LJLJL;
    public C49411JaJ LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public LifecycleOwner LJLLI;

    public static final void LIZIZ(Activity activity) {
        C36821Ecj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = privacyAccountFollowCount.LIZ().intValue();
        if (intValue == 0) {
            C62905OmT c62905OmT = new C62905OmT(activity);
            c62905OmT.LIZ(R.string.pan);
            c62905OmT.LJIIJJI(R.string.h3a, null, false);
            C279017q.LIZLLL(c62905OmT);
        } else if (intValue >= 1 && intValue < 4) {
            AnonymousClass114.LIZ(activity, R.string.pao);
        }
        privacyAccountFollowCount.LIZLLL(Integer.valueOf(intValue + 1));
    }

    public final void LIZ(User user) {
        if (this.LJLJJI != null) {
            UserService.LIZ().LJFF().removeObserver(this);
        }
        this.LJLJJI = user;
        int followStatus = user.getFollowStatus();
        int i = 1;
        if (TextUtils.equals(user.getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
            InterfaceC51700KQu interfaceC51700KQu = this.LJLIL;
            if (this.LJLJJI.getFollowerStatus() != 1) {
                i = 0;
            }
            interfaceC51700KQu.LJJI(3, i);
            return;
        }
        if (C3U6.LIZ && followStatus == 2 && IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJII(user.getUid())) {
            IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJ(this.LJLJJI.getFollowerStatus(), this.LJLJJI.getUid(), true);
        }
        InterfaceC51700KQu interfaceC51700KQu2 = this.LJLIL;
        if (this.LJLJJI.getFollowerStatus() != 1) {
            i = 0;
        }
        interfaceC51700KQu2.LJI(followStatus, i, this.LJLJJI.getUid());
        UserService.LIZ().LJFF().observe(this.LJLLI, this);
        this.LJLIL.setOnClickListener(new ACListenerS43S0200000_8(this, user, 1));
    }

    public final void LIZLLL(User user) {
        int i;
        String str;
        if (user == null) {
            i = -1;
        } else {
            int followStatus = user.getFollowStatus();
            boolean LJIILIIL = AV1.LJIILIIL(followStatus);
            if (followStatus == 4 || LJIILIIL) {
                i = 0;
            } else {
                i = 1;
            }
        }
        InterfaceC51701KQv interfaceC51701KQv = this.LJLJI;
        if (interfaceC51701KQv != null) {
            interfaceC51701KQv.LIZIZ(user, i);
        }
        if (user.getAvatarThumb() != null && user.getAvatarThumb().getUrlList() != null && !user.getAvatarThumb().getUrlList().isEmpty()) {
            str = (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
        } else {
            str = null;
        }
        LIZJ(user.isAccuratePrivateAccount(), user.getUid(), i, user.getSecUid(), user.getAccurateRecType(), user.getFollowStatus(), user.getFollowerStatus(), str);
    }

    public final void LJ(User user) {
        int i;
        if (user.getFollowStatus() != 0) {
            i = 0;
        } else if (user.isSecret()) {
            i = 4;
        } else if (user.getFollowerStatus() == 1) {
            i = 2;
        } else {
            i = 1;
        }
        if (user.getFollowStatus() == 2 && (!user.isEnableDirectMessage()) && this.LJLJLJ != null) {
            ARI ari = new ARI(this.LJLILLLLZI);
            ari.LJI(R.string.tix, new AObjectS124S0200000_8(i, this, user, 0));
            ari.LJIIIIZZ(R.string.gkb, new AObjectS124S0200000_8(this, user, 1));
            C26227ARb LIZIZ = C77413UZt.LIZIZ(this.LJLILLLLZI);
            LIZIZ.LJII = false;
            LIZIZ.LIZ(R.string.tcl);
            LIZIZ.LJIIL = ari;
            LIZIZ.LJI().LIZLLL();
            C49411JaJ c49411JaJ = this.LJLJLJ;
            user.getFollowStatus();
            c49411JaJ.LIZ.o0();
            return;
        }
        if (user.getFollowStatus() == 0 && user.getBlockStatus() == 1 && this.LJLJLLL) {
            ARI ari2 = new ARI(this.LJLILLLLZI);
            ari2.LJI(R.string.dsg, new AObjectS41S0201000_8(i, this, user, 0));
            ari2.LJIIIIZZ(R.string.gkb, null);
            C26227ARb LIZIZ2 = C77413UZt.LIZIZ(this.LJLILLLLZI);
            LIZIZ2.LJII = false;
            LIZIZ2.LIZ(R.string.td_);
            LIZIZ2.LJIIL = ari2;
            LIZIZ2.LJI().LIZLLL();
            return;
        }
        if (user.getFollowStatus() == 4 && this.LJLJLJ != null) {
            if (this.LJLL) {
                return;
            }
            ARI ari3 = new ARI(this.LJLILLLLZI);
            ari3.LJI(R.string.gka, new AObjectS124S0200000_8(i, this, user, 2));
            ari3.LJIIIIZZ(R.string.qes, new AObjectS41S0201000_8(1, this, user, 1));
            C26227ARb LIZIZ3 = C77413UZt.LIZIZ(this.LJLILLLLZI);
            LIZIZ3.LJII = false;
            LIZIZ3.LIZ(R.string.gkc);
            LIZIZ3.LJIIL = ari3;
            LIZIZ3.LJI().LIZLLL();
            C49411JaJ c49411JaJ2 = this.LJLJLJ;
            user.getFollowStatus();
            c49411JaJ2.LIZ.o0();
            this.LJLL = true;
            return;
        }
        if (i == 4) {
            LIZIZ(this.LJLILLLLZI);
            LIZLLL(user);
            if (!C3U6.LIZ) {
                return;
            }
            IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJ(user.getFollowerStatus(), user.getUid(), false);
            return;
        }
        LIZLLL(user);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(FollowStatus followStatus) {
        User user;
        User user2;
        FollowStatus followStatus2 = followStatus;
        if (followStatus2 != null) {
            String uid = this.LJLJJI.getUid();
            o.LJIIIZ(uid, "uid");
            if (!o.LJ(followStatus2.userId, uid)) {
                return;
            }
            this.LJLJJI.setFollowStatus(followStatus2.followStatus);
            C49412JaK c49412JaK = this.LJLJJL;
            int i = 1;
            if (c49412JaK != null && followStatus2.followStatus != 0 && (user = c49412JaK.LIZ.LLFF) != null && user.getBlockStatus() == 1 && (user2 = c49412JaK.LIZ.LLFF) != null) {
                user2.setBlockStatus(0);
            }
            InterfaceC51702KQw interfaceC51702KQw = this.LJLJJLL;
            if (interfaceC51702KQw != null) {
                interfaceC51702KQw.onFollowSuccess(followStatus2);
            }
            InterfaceC51700KQu interfaceC51700KQu = this.LJLIL;
            int i2 = followStatus2.followStatus;
            if (this.LJLJJI.getFollowerStatus() != 1) {
                i = 0;
            }
            interfaceC51700KQu.LJI(i2, i, this.LJLJJI.getUid());
        }
    }

    public C51698KQs(InterfaceC51700KQu interfaceC51700KQu, InterfaceC51701KQv interfaceC51701KQv) {
        this.LJLIL = interfaceC51700KQu;
        this.LJLILLLLZI = (ActivityC45651qj) C27740Aue.LIZ(interfaceC51700KQu.getContext());
        this.LJLJI = interfaceC51701KQv;
        this.LJLLI = interfaceC51700KQu.getLifeCycleOwner();
    }

    public final void LIZJ(boolean z, String str, int i, String str2, String str3, int i2, int i3, String str4) {
        String enterFrom;
        int LIZ;
        final InterfaceC51691KQl followPresenter = C77266UUc.LIZIZ.getFollowPresenter();
        followPresenter.LJIIIIZZ(new C51704KQy(this, str4));
        ALX alx = new ALX();
        alx.LIZJ(str);
        alx.LIZIZ(str2);
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LJIIL = z;
        c57285Me1.LIZJ = i;
        InterfaceC51701KQv interfaceC51701KQv = this.LJLJI;
        if (interfaceC51701KQv == null) {
            enterFrom = "";
        } else {
            enterFrom = interfaceC51701KQv.getEnterFrom();
        }
        alx.LIZ.LJFF = enterFrom;
        InterfaceC51701KQv interfaceC51701KQv2 = this.LJLJI;
        if (interfaceC51701KQv2 == null) {
            LIZ = 0;
        } else {
            LIZ = interfaceC51701KQv2.LIZ();
        }
        C57285Me1 c57285Me12 = alx.LIZ;
        c57285Me12.LIZLLL = LIZ;
        c57285Me12.LJIIJ = i3;
        c57285Me12.LJIIIZ = i2;
        c57285Me12.LJIILL = str3;
        followPresenter.LJIJJ(alx.LIZ());
        this.LJLLI.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.follow.widet.FollowUserBlock$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                InterfaceC51691KQl.this.LIZIZ();
            }
        });
    }
}
