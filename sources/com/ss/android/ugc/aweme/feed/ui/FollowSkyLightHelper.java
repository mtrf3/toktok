package com.ss.android.ugc.aweme.feed.ui;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.AnonymousClass391;
import X.C00F;
import X.C110544Vm;
import X.C16880lQ;
import X.C184077Kh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221018lt;
import X.C2304492q;
import X.C32151Nz;
import X.C33808DOq;
import X.C35971E9v;
import X.C47959Irz;
import X.C54444LYi;
import X.C54446LYk;
import X.C54449LYn;
import X.C54689LdF;
import X.C55723Ltv;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C73343SqR;
import X.C73345SqT;
import X.C73353Sqb;
import X.C73615Sup;
import X.C73969T1h;
import X.C76732zl;
import X.C76800UCe;
import X.C78926UyI;
import X.C78966Uyw;
import X.C78999UzT;
import X.C7MY;
import X.EnumC54603Lbr;
import X.HG3;
import X.InterfaceC88472Yns;
import X.L7K;
import X.LWP;
import X.LWR;
import X.LY1;
import X.LY2;
import X.LY3;
import X.LY4;
import X.LY5;
import X.LY6;
import X.LY7;
import X.LY8;
import X.LY9;
import X.LYB;
import X.LYE;
import X.LYM;
import X.LYU;
import X.O6R;
import X.ORZ;
import X.RBX;
import X.T16;
import Y.ALAdapterS7S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.AfS61S0100000_9;
import Y.IDhS102S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class FollowSkyLightHelper {
    public static final List<FollowingInterestUser> LJIJJLI = new ArrayList();
    public LYB LIZ;
    public LWR LIZIZ;
    public C54444LYi LIZJ;
    public LY3 LJFF;
    public boolean LJI;
    public WeakReference<ActivityC45651qj> LJII;
    public float LJIIIIZZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public FeedFollowFragment LJIIL;
    public ObjectAnimator LJIILJJIL;
    public boolean LJIJ;
    public boolean LJIJI;
    public List<FollowingInterestUser> LIZLLL = new ArrayList();
    public List<Aweme> LJ = new ArrayList();
    public boolean LJIIIZ = true;
    public final HashSet<InterfaceC88472Yns<Boolean, C76800UCe>> LJIILIIL = new HashSet<>();
    public final LY2 LJIILL = new LY2(this);
    public final LY1 LJIILLIIL = new LY1(this);
    public final FollowSkyLightHelper$liveIconAnimationObserver$1 LJIIZILJ = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper$liveIconAnimationObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
            } else if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = FollowSkyLightHelper.this.LJIILIIL.iterator();
            while (it.hasNext()) {
                it.next().invoke(Boolean.FALSE);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            FollowSkyLightHelper followSkyLightHelper = FollowSkyLightHelper.this;
            FeedFollowFragment feedFollowFragment = followSkyLightHelper.LJIIL;
            if (feedFollowFragment != null && !feedFollowFragment.LJZL) {
                return;
            }
            Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = followSkyLightHelper.LJIILIIL.iterator();
            while (it.hasNext()) {
                it.next().invoke(Boolean.TRUE);
            }
        }
    };
    public final AnimatorSet LJIJJ = new AnimatorSet();

    public final int LIZJ() {
        AqS60S0110000_3 LJJ;
        FeedFollowFragment feedFollowFragment = this.LJIIL;
        if (feedFollowFragment != null) {
            try {
                LY8 ly8 = LY8.LJLIL;
                C65776Prg LIZ = C65352Pkq.LIZ(FollowStorySkylightVM.class);
                LY6 ly6 = LY6.INSTANCE;
                if (C214368bA.LJIIIIZZ) {
                    LJJ = C78926UyI.LJJ(feedFollowFragment, false);
                } else {
                    LJJ = C78926UyI.LJJ(feedFollowFragment, true);
                }
                return ((FollowStorySkylightVM) new C214378bB(LIZ, ly8, C214528bQ.LJLIL, C78926UyI.LJJII(feedFollowFragment, false), C184077Kh.LJLIL, ly6, LJJ, C78926UyI.LJIILLIIL(feedFollowFragment, true)).getValue()).hv0();
            } catch (Throwable th) {
                Throwable LJFF = AnonymousClass028.LJFF(th);
                if (LJFF != null) {
                    String TAG = feedFollowFragment.LJLIL;
                    o.LJIIIIZZ(TAG, "TAG");
                    C221018lt.LIZLLL(TAG, LJFF);
                }
            }
        }
        return 0;
    }

    public final void LJ() {
        C54444LYi c54444LYi = this.LIZJ;
        if (c54444LYi != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(c54444LYi.getContext(), "sslocal://live/follow");
            buildRoute.withParam("enterType", "slide");
            buildRoute.withAnimation(R.anim.fv, R.anim.g0);
            buildRoute.open();
            if (L7K.LIZIZ) {
                C54444LYi c54444LYi2 = this.LIZJ;
                if (c54444LYi2 != null) {
                    c54444LYi2.getFollowLiveSkyLightRelatedVM().setState(C54449LYn.LJLIL);
                    return;
                } else {
                    o.LJIJI("mListView");
                    throw null;
                }
            }
            C54444LYi c54444LYi3 = this.LIZJ;
            if (c54444LYi3 != null) {
                ViewWrapper viewWrapper = c54444LYi3.getAdapter().LJLJI;
                if (viewWrapper == null) {
                    return;
                }
                ObjectAnimator.ofFloat(viewWrapper.getView(), "alpha", viewWrapper.getView().getAlpha(), 0.0f).setDuration(300L).start();
                return;
            }
            o.LJIJI("mListView");
            throw null;
        }
        o.LJIJI("mListView");
        throw null;
    }

    public final void LJFF() {
        ActivityC45651qj activityC45651qj;
        ActivityC45651qj activityC45651qj2;
        if (this.LJIJ) {
            this.LJIJ = false;
            WeakReference<ActivityC45651qj> weakReference = this.LJII;
            if (weakReference != null && (activityC45651qj2 = weakReference.get()) != null) {
                C54444LYi c54444LYi = this.LIZJ;
                if (c54444LYi != null) {
                    c54444LYi.postDelayed(new ARunnableS28S0200000_9(this, activityC45651qj2, 80), 0L);
                    return;
                } else {
                    o.LJIJI("mListView");
                    throw null;
                }
            }
            return;
        }
        WeakReference<ActivityC45651qj> weakReference2 = this.LJII;
        if (weakReference2 == null || (activityC45651qj = weakReference2.get()) == null) {
            return;
        }
        C54444LYi c54444LYi2 = this.LIZJ;
        if (c54444LYi2 != null) {
            c54444LYi2.postDelayed(new ARunnableS28S0200000_9(this, activityC45651qj, 81), 0L);
        } else {
            o.LJIJI("mListView");
            throw null;
        }
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZLLL.size() != 0 || L7K.LJI) {
            return false;
        }
        LY3 ly3 = this.LJFF;
        if (ly3 != null && LYM.LIZIZ(ly3) > 0 && L7K.LJII) {
            return false;
        }
        if (this.LJFF != null && LIZJ() != 0) {
            return false;
        }
        return true;
    }

    public final int LIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        int size = this.LIZLLL.size();
        List<FollowingInterestUser> list = this.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (FollowingInterestUser followingInterestUser : list) {
            String uid2 = followingInterestUser.getUser().getUid();
            if (uid2 == null || (true ^ TextUtils.equals(uid2, uid))) {
                arrayList.add(followingInterestUser);
            }
        }
        List<FollowingInterestUser> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        this.LIZLLL = LLJILJILJ;
        if (((ArrayList) LLJILJILJ).size() != size) {
            LIZIZ(new LY3(this.LIZLLL, this.LJ, 124));
        }
        return this.LJ.size() + this.LIZLLL.size();
    }

    public final void LIZIZ(LY3 ly3) {
        if (ly3 == null) {
            return;
        }
        int intValue = ((Number) C2304492q.LIZIZ.getValue()).intValue();
        if (intValue > 0 && this.LIZLLL.size() > intValue) {
            List<FollowingInterestUser> list = LJIJJLI;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            int intValue2 = ((Number) C2304492q.LIZ.getValue()).intValue();
            if (intValue2 != 1) {
                if (intValue2 == 2 && list != null) {
                    List<FollowingInterestUser> list2 = this.LIZLLL;
                    ((ArrayList) list).addAll(list2.subList(intValue, list2.size()));
                    ((ArrayList) list).addAll(this.LIZLLL.subList(0, intValue));
                }
            } else if (list != null) {
                ((ArrayList) list).addAll(this.LIZLLL);
            }
            List LLILLL = ORZ.LLILLL(this.LIZLLL, intValue);
            o.LJII(LLILLL, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.feed.module.FollowingInterestUser>");
            this.LIZLLL = C65777Prh.LIZIZ(LLILLL);
            this.LJIIJJI = true;
        } else {
            List<FollowingInterestUser> list3 = LJIJJLI;
            if (list3 != null) {
                ((ArrayList) list3).clear();
            }
            this.LJIIJJI = false;
        }
        if (L7K.LIZIZ) {
            C54444LYi c54444LYi = this.LIZJ;
            if (c54444LYi != null) {
                c54444LYi.LIZLLL(ly3, this.LJIIJJI);
                return;
            } else {
                o.LJIJI("mListView");
                throw null;
            }
        }
        C54444LYi c54444LYi2 = this.LIZJ;
        if (c54444LYi2 != null) {
            List<FollowingInterestUser> users = this.LIZLLL;
            boolean z = this.LJIIJJI;
            o.LJIIIZ(users, "users");
            C54689LdF adapter = c54444LYi2.getAdapter();
            Context context = c54444LYi2.getContext();
            if (context != null) {
                LYU.LJIILIIL(context, users);
                if (z) {
                    FollowingInterestUser followingInterestUser = new FollowingInterestUser(new User(), false, null, 0, 8, null);
                    followingInterestUser.setSeeAll(true);
                    users.add(followingInterestUser);
                }
                adapter.setData(users);
                C54446LYk c54446LYk = c54444LYi2.LJLIL;
                if (c54446LYk == null) {
                    return;
                }
                c54446LYk.LJLI(0);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        o.LJIJI("mListView");
        throw null;
    }

    public final void LJII(LY3 ly3) {
        List<FollowingInterestUser> arrayList;
        List<Aweme> arrayList2;
        boolean z;
        List<Aweme> list;
        List<FollowingInterestUser> list2;
        if (ly3 != null && (list2 = ly3.LIZ) != null) {
            arrayList = ORZ.LLJILJILJ(list2);
        } else {
            arrayList = new ArrayList<>();
        }
        this.LIZLLL = arrayList;
        if (ly3 != null && (list = ly3.LIZIZ) != null) {
            arrayList2 = ORZ.LLJILJILJ(list);
        } else {
            arrayList2 = new ArrayList<>();
        }
        this.LJ = arrayList2;
        this.LJFF = ly3;
        if (ly3 != null && !ly3.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
        String valueOf = String.valueOf(this.LIZLLL.size());
        LIZIZ(ly3);
        C73353Sqb.LJFF().LJIIIIZZ();
        C73345SqT LJFF = C73353Sqb.LJFF();
        if (!LJFF.LIZLLL) {
            HashMap hashMap = new HashMap();
            List<FollowingInterestUser> list3 = this.LIZLLL;
            if (!list3.isEmpty()) {
                hashMap.put("room_cnt", valueOf);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (FollowingInterestUser followingInterestUser : list3) {
                    if (!followingInterestUser.getSeeAll() && followingInterestUser.getUser().getUid() != null && followingInterestUser.getUser().isLive()) {
                        arrayList3.add(String.valueOf(followingInterestUser.getUser().roomId));
                        String uid = followingInterestUser.getUser().getUid();
                        o.LJIIIIZZ(uid, "item.user.uid");
                        arrayList4.add(uid);
                    }
                }
                hashMap.put("room_id_list", arrayList3.toString());
                hashMap.put("anchor_id_list", arrayList4.toString());
            }
            C73343SqR.LJFF(LJFF, hashMap, 7);
        }
        C54444LYi c54444LYi = this.LIZJ;
        if (c54444LYi != null) {
            c54444LYi.post(new ARunnableS45S0100000_9(this, 38));
        } else {
            o.LJIJI("mListView");
            throw null;
        }
    }

    public final void LIZLLL(View view, boolean z) {
        o.LJIIIZ(view, "view");
        this.LJIJJ.cancel();
        C16880lQ.LJLJJL(this.LJIJJ);
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
            this.LJIJJ.setDuration(300L);
            this.LJIJJ.setInterpolator(new DecelerateInterpolator());
            this.LJIJJ.addListener(new ALAdapterS7S0100000_9(view, 1));
            this.LJIJJ.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.LJIJJ.start();
            return;
        }
        view.setVisibility(8);
    }

    public final void LJI(String str, String str2) {
        String str3;
        int i;
        AbstractC73672Svk<FollowingInterestUsersResponse> interestUsers;
        AbstractC73672Svk LJJIJIL;
        if (C00F.LIZ(31744, 0, "i18n_following_live_skylight_type", true) != 0) {
            LWR lwr = this.LIZIZ;
            if (lwr != null) {
                if (o.LJ(str2, "homepage_refresh")) {
                    str3 = "home_tab";
                } else if (o.LJ(str2, "pull_refresh")) {
                    str3 = "pull";
                } else {
                    str3 = "auto";
                }
                if (!((RBX) HG3.LJIILL()).isLogin()) {
                    return;
                }
                C76732zl c76732zl = new C76732zl();
                if (o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE) && C35971E9v.LIZ()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c76732zl.element = i;
                C73353Sqb.LJFF().LJIIJ();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                AtomicBoolean atomicBoolean = LWR.LJ;
                if (!atomicBoolean.get() && o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && C33808DOq.LIZ()) {
                    interestUsers = AbstractC73672Svk.LJJIJIL(1).LJJIII(new IDhS102S0100000_9(c76732zl, 14), false);
                } else {
                    FollowFeedApi.LIZ.getClass();
                    interestUsers = LY5.LIZ().getInterestUsers(2, 0L, 2, c76732zl.element);
                    atomicBoolean.set(true);
                }
                C73615Sup LJJJIL = interestUsers.LJIJJLI(new LWP(lwr, elapsedRealtime, str)).LJJJIL(AbstractC73672Svk.LJJIJIL(new FollowingInterestUsersResponse(0, null, 0, 0L, null, 31, null)));
                if (L7K.LIZIZ) {
                    LJJIJIL = LYE.LIZ(C55723Ltv.LIZIZ.LIZ(), null, EnumC54603Lbr.FOLLOW_TAB, 4);
                } else {
                    LJJIJIL = AbstractC73672Svk.LJJIJIL(new StoryGetFeedByPageResponse(null, false, 0L, 0L, null));
                }
                C78999UzT.LJFF(AbstractC73672Svk.LJJLL(LJJJIL, LJJIJIL.LJJJIL(AbstractC73672Svk.LJJIJIL(new StoryGetFeedByPageResponse(null, false, 0L, 0L, null))), C78966Uyw.LJLJI).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(lwr, str3, 51), new AfS61S0100000_9(lwr, 52)), lwr.LIZIZ);
                return;
            }
            o.LJIJI("mPresenter");
            throw null;
        }
    }

    public final void LJIIIZ(C110544Vm container, float f, float f2, boolean z) {
        boolean z2;
        int LIZIZ;
        AqS60S0110000_3 LJJ;
        ObjectAnimator objectAnimator;
        o.LJIIIZ(container, "container");
        ObjectAnimator objectAnimator2 = this.LJIILJJIL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJIILJJIL) != null) {
            objectAnimator.end();
        }
        if (f == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedFollowFragment feedFollowFragment = this.LJIIL;
        if (feedFollowFragment != null) {
            LY9 ly9 = LY9.LJLIL;
            C65776Prg LIZ = C65352Pkq.LIZ(FollowStorySkylightVM.class);
            LY7 ly7 = LY7.INSTANCE;
            if (C214368bA.LJIIIIZZ) {
                LJJ = C78926UyI.LJJ(feedFollowFragment, false);
            } else {
                LJJ = C78926UyI.LJJ(feedFollowFragment, true);
            }
            ((FollowStorySkylightVM) new C214378bB(LIZ, ly9, C214528bQ.LJLIL, C78926UyI.LJJII(feedFollowFragment, false), C184077Kh.LJLIL, ly7, LJJ, C78926UyI.LJIILLIIL(feedFollowFragment, true)).getValue()).LJLIL = z2;
        }
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        if (z2) {
            LIZIZ = C47959Irz.LIZJ(16, AnonymousClass391.LIZ(180.0d));
        } else {
            LIZIZ = C7MY.LIZIZ(58);
        }
        Context context = container.getContext();
        o.LJIIIIZZ(context, "container.context");
        publishService.moveProgress(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), C63081OpJ.LJJJJLI(context) + LIZIZ);
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(container, "translationY", f, f2);
            this.LJIILJJIL = ofFloat;
            if (ofFloat != null) {
                ofFloat.setInterpolator(new DecelerateInterpolator());
            }
            ObjectAnimator objectAnimator3 = this.LJIILJJIL;
            if (objectAnimator3 != null) {
                objectAnimator3.setDuration(300L);
            }
            ObjectAnimator objectAnimator4 = this.LJIILJJIL;
            if (objectAnimator4 != null) {
                objectAnimator4.addListener(new LY4(f, f2, this, container));
            }
            ObjectAnimator objectAnimator5 = this.LJIILJJIL;
            if (objectAnimator5 != null) {
                objectAnimator5.start();
                return;
            }
            return;
        }
        container.setTranslationY(f2);
    }
}
