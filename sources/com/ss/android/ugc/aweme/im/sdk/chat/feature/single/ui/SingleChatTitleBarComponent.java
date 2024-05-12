package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui;

import X.C101043xs;
import X.C1040246k;
import X.C107454Jp;
import X.C119354mJ;
import X.C221108m2;
import X.C3EU;
import X.C53691L5j;
import X.C62822Ol8;
import X.C78949Uyf;
import X.C80533Eb;
import X.C95063oE;
import X.C98523to;
import X.EnumC112364b2;
import X.EnumC53695L5n;
import X.InterfaceC100173wT;
import X.InterfaceC100393wp;
import X.InterfaceC101063xu;
import X.InterfaceC99183us;
import Y.AObserverS65S0200000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleChatTitleBarComponent implements GenericLifecycleObserver, InterfaceC99183us, LifecycleOwner {
    public final C98523to LJLIL;
    public final BaseFragment LJLILLLLZI;
    public final C101043xs LJLJI;
    public C119354mJ LJLJJI;
    public LiveData<ActivityStatus> LJLJJL;
    public C53691L5j LJLJJLL;
    public EnumC53695L5n LJLJL;
    public InterfaceC100173wT LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLILLLLZI.getLifecycle();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final C1040246k LIZ() {
        return (C1040246k) this.LJLJLLL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        String uid;
        InboxSocPubStatusViewModelImpl inboxSocPubStatusViewModelImpl;
        if (!(this.LJLILLLLZI instanceof SelectChatMsgFragment)) {
            this.LJLJJLL = (C53691L5j) this.LJLJI.findViewById(R.id.dff);
            IMUser fromUser = this.LJLIL.getFromUser();
            if (fromUser != null && this.LJLLI.getValue() != null) {
                InboxSocPubStatusViewModelImpl.jv0((InterfaceC100393wp) this.LJLL.getValue(), fromUser);
            }
            IMUser fromUser2 = this.LJLIL.getFromUser();
            if (fromUser2 != null && (uid = fromUser2.getUid()) != null && (inboxSocPubStatusViewModelImpl = (InboxSocPubStatusViewModelImpl) this.LJLLI.getValue()) != null) {
                inboxSocPubStatusViewModelImpl.iv0(uid, true);
            }
        }
        IMUser fromUser3 = this.LJLIL.getFromUser();
        if (fromUser3 != null) {
            LIZIZ(fromUser3);
            C78949Uyf.LJJJIL(this, fromUser3, EnumC112364b2.CHAT_ROOM);
        }
        this.LJLJI.setRightIcons(new C95063oE(R.raw.icon_flag, R.string.q2_), new C95063oE(R.raw.icon_ellipsis_horizontal, R.string.i7q));
        this.LJLJI.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3wQ
            @Override // X.InterfaceC101063xu
            public final void LJ() {
                BaseFragment baseFragment = SingleChatTitleBarComponent.this.LJLILLLLZI;
                if (baseFragment instanceof NewChatRoomFragment) {
                    ((NewChatRoomFragment) baseFragment).onExitChatRoom();
                }
            }

            public final void LJFF() {
                boolean z;
                String singleChatFromUserId = SingleChatTitleBarComponent.this.LJLIL.getSingleChatFromUserId();
                IMUser fromUser4 = SingleChatTitleBarComponent.this.LJLIL.getFromUser();
                IUserProfilePreload LJIIIIZZ = UserProfilePreloadHelper.LJIIIIZZ();
                User user = IMUser.toUser(fromUser4);
                o.LJIIIIZZ(user, "toUser(imUser)");
                LJIIIIZZ.LIZJ(user);
                AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
                String enterMethod = SingleChatTitleBarComponent.this.LJLIL.getEnterMethod();
                String conversationId = SingleChatTitleBarComponent.this.LJLIL.getConversationId();
                anonymousClass325.getClass();
                AnonymousClass325.LIZIZ(singleChatFromUserId, null, enterMethod, conversationId);
                SingleChatTitleBarComponent.this.getClass();
                C84643Tw.LIZLLL(singleChatFromUserId, "chat", "click_name", null, 24);
                SingleChatTitleBarComponent singleChatTitleBarComponent = SingleChatTitleBarComponent.this;
                IMUser fromUser5 = singleChatTitleBarComponent.LJLIL.getFromUser();
                if (fromUser5 != null) {
                    EnumC112364b2 enumC112364b2 = EnumC112364b2.CHAT_ROOM;
                    String enterFromForMob = singleChatTitleBarComponent.LJLIL.getEnterFromForMob();
                    C119354mJ c119354mJ = singleChatTitleBarComponent.LJLJJI;
                    if (c119354mJ != null) {
                        z = c119354mJ.LJLJLLL;
                    } else {
                        z = false;
                    }
                    C78949Uyf.LJJIZ(singleChatTitleBarComponent, fromUser5, enumC112364b2, enterFromForMob, z, null, false, 48);
                }
            }

            @Override // X.InterfaceC101063xu
            public final void LIZ() {
                LJFF();
            }

            @Override // X.InterfaceC101063xu
            public final void LIZIZ() {
                LJFF();
            }

            @Override // X.InterfaceC101063xu
            public final void LIZLLL() {
                LJFF();
            }

            @Override // X.InterfaceC101063xu
            public final void LIZJ(int i) {
                String str;
                boolean z = false;
                if (i == R.raw.icon_flag) {
                    IMUser fromUser4 = SingleChatTitleBarComponent.this.LJLIL.getFromUser();
                    String str2 = null;
                    if (fromUser4 != null) {
                        str = fromUser4.getUid();
                    } else {
                        str = null;
                    }
                    IMUser fromUser5 = SingleChatTitleBarComponent.this.LJLIL.getFromUser();
                    if (fromUser5 != null) {
                        str2 = fromUser5.getSecUid();
                    }
                    final SingleChatTitleBarComponent singleChatTitleBarComponent = SingleChatTitleBarComponent.this;
                    C80533Eb.LJIIJJI(str, str2, false, new C3EU() { // from class: X.3wP
                        @Override // X.C3EU
                        public final void LIZ(IMUser result) {
                            o.LJIIIZ(result, "result");
                            C91463iQ c91463iQ = new C91463iQ(SingleChatTitleBarComponent.this.LJLIL, null, null, Boolean.valueOf(result.isBlock()), 6);
                            ActivityC45651qj requireActivity = SingleChatTitleBarComponent.this.LJLILLLLZI.requireActivity();
                            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                            C98793uF.LIZLLL(c91463iQ, requireActivity, "7", null, 24);
                            C80723Eu.LIZIZ(SingleChatTitleBarComponent.this.LJLIL.getFromUser());
                        }

                        @Override // X.C3EU
                        public final void LIZIZ(Throwable throwable) {
                            o.LJIIIZ(throwable, "throwable");
                        }
                    });
                    return;
                }
                IMUser fromUser6 = SingleChatTitleBarComponent.this.LJLIL.getFromUser();
                if (fromUser6 != null) {
                    SingleChatTitleBarComponent singleChatTitleBarComponent2 = SingleChatTitleBarComponent.this;
                    String conversationId = singleChatTitleBarComponent2.LJLIL.getConversationId();
                    String singleChatFromUserId = singleChatTitleBarComponent2.LJLIL.getSingleChatFromUserId();
                    if (singleChatFromUserId == null) {
                        singleChatFromUserId = "";
                    }
                    C84643Tw.LIZIZ(conversationId, singleChatFromUserId, C772831o.LIZ());
                    ActivityC45651qj requireActivity = singleChatTitleBarComponent2.LJLILLLLZI.requireActivity();
                    o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                    if (singleChatTitleBarComponent2.LJLIL.getChatType() == 1) {
                        z = true;
                    }
                    C100413wr.LIZ(requireActivity, fromUser6, z, singleChatTitleBarComponent2.LJLIL.isAuthorSupporterChat());
                }
            }
        });
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        LiveData<ActivityStatus> liveData = this.LJLJJL;
        if (liveData != null) {
            liveData.removeObservers(this.LJLILLLLZI);
        }
        final IMUser fromUser = this.LJLIL.getFromUser();
        if (fromUser != null) {
            C80533Eb.LJI(fromUser.getUid(), fromUser.getSecUid(), new C3EU() { // from class: X.3wR
                @Override // X.C3EU
                public final void LIZ(IMUser result) {
                    InterfaceC100173wT LIZIZ;
                    ViewStub viewStub;
                    C119354mJ c119354mJ;
                    o.LJIIIZ(result, "result");
                    final SingleChatTitleBarComponent singleChatTitleBarComponent = SingleChatTitleBarComponent.this;
                    IMUser iMUser = fromUser;
                    singleChatTitleBarComponent.getClass();
                    C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
                    if (activityStatusViewModel.getSettings().LJFF() && iMUser.getUid() != null && iMUser.getFollowStatus() == 2) {
                        View view = singleChatTitleBarComponent.LJLILLLLZI.getView();
                        if (view != null && (viewStub = (ViewStub) view.findViewById(R.id.pe)) != null) {
                            View inflate = viewStub.inflate();
                            if (inflate instanceof C119354mJ) {
                                c119354mJ = (C119354mJ) inflate;
                            } else {
                                c119354mJ = null;
                            }
                            singleChatTitleBarComponent.LJLJJI = c119354mJ;
                        }
                        C1040246k LIZ = singleChatTitleBarComponent.LIZ();
                        if (LIZ != null) {
                            C119354mJ c119354mJ2 = singleChatTitleBarComponent.LJLJJI;
                            C100323wi c100323wi = LIZ.LIZIZ;
                            if (c100323wi != null) {
                                c100323wi.LIZ = c119354mJ2;
                            }
                        }
                        C1040246k LIZ2 = singleChatTitleBarComponent.LIZ();
                        if (LIZ2 != null) {
                            LIZ2.LIZJ(false);
                        }
                        Context requireContext = singleChatTitleBarComponent.LJLILLLLZI.requireContext();
                        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
                        if (AV1.LJIJI(iMUser.getUid())) {
                            C1040246k LIZ3 = singleChatTitleBarComponent.LIZ();
                            if (LIZ3 != null) {
                                LIZ3.LIZJ(true);
                            }
                            C119354mJ c119354mJ3 = singleChatTitleBarComponent.LJLJJI;
                            if (c119354mJ3 != null) {
                                c119354mJ3.LIZ(C49R.LIZ.LIZLLL);
                            }
                            singleChatTitleBarComponent.LJLJI.LIZLLL(Boolean.FALSE, requireContext.getResources().getString(R.string.b7v));
                            IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZLLL(singleChatTitleBarComponent.LJLIL.getConversationId(), C4FY.ACTIVE_NOW);
                            return;
                        }
                        String uid = iMUser.getUid();
                        o.LJIIIIZZ(uid, "user.uid");
                        EnumC112364b2 enumC112364b2 = EnumC112364b2.CHAT_ROOM;
                        singleChatTitleBarComponent.LJLJJL = C3B3.LIZ(activityStatusViewModel, uid, null, enumC112364b2.getValue(), 6);
                        IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZLLL(singleChatTitleBarComponent.LJLIL.getConversationId(), C4FY.NO_STATUS);
                        LiveData<ActivityStatus> liveData2 = singleChatTitleBarComponent.LJLJJL;
                        if (liveData2 != null) {
                            liveData2.observe(singleChatTitleBarComponent.LJLILLLLZI, new AObserverS65S0200000_1(requireContext, singleChatTitleBarComponent, 12));
                        }
                        if (!C35564DxY.LIZ() || singleChatTitleBarComponent.LJLJLJ != null) {
                            return;
                        }
                        InterfaceC100183wU activityStatusAccuracyAnalysis = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis();
                        C119354mJ c119354mJ4 = singleChatTitleBarComponent.LJLJJI;
                        if (c119354mJ4 == null) {
                            return;
                        }
                        LIZIZ = activityStatusAccuracyAnalysis.LIZIZ(enumC112364b2, c119354mJ4, singleChatTitleBarComponent, requireContext, null);
                        singleChatTitleBarComponent.LJLJLJ = LIZIZ;
                        singleChatTitleBarComponent.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent$bindUserStatus$2
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                                InterfaceC100173wT interfaceC100173wT;
                                o.LJIIIZ(source, "source");
                                o.LJIIIZ(event, "event");
                                if (event == Lifecycle.Event.ON_RESUME) {
                                    InterfaceC100173wT interfaceC100173wT2 = SingleChatTitleBarComponent.this.LJLJLJ;
                                    if (interfaceC100173wT2 != null) {
                                        interfaceC100173wT2.onVisible();
                                        return;
                                    }
                                    return;
                                }
                                if (event != Lifecycle.Event.ON_PAUSE || (interfaceC100173wT = SingleChatTitleBarComponent.this.LJLJLJ) == null) {
                                    return;
                                }
                                interfaceC100173wT.onInvisible();
                            }
                        });
                        return;
                    }
                    C1040246k LIZ4 = singleChatTitleBarComponent.LIZ();
                    if (LIZ4 != null) {
                        LIZ4.LIZJ(false);
                    }
                    singleChatTitleBarComponent.LJLJI.LIZ();
                }

                @Override // X.C3EU
                public final void LIZIZ(Throwable throwable) {
                    o.LJIIIZ(throwable, "throwable");
                }
            });
        }
    }

    public final void LIZIZ(IMUser user) {
        o.LJIIIZ(user, "user");
        if (C107454Jp.LIZ()) {
            this.LJLJI.setLeftTitleVisible(true);
            C101043xs.LJ(this.LJLJI, false, user.getDisplayAvatar(), null, null, user.getUid(), null, 44);
        } else {
            this.LJLJI.setLeftTitleVisible(false);
            C101043xs.LIZJ(this.LJLJI, false, user.getDisplayAvatar(), user.getUid(), null, 8);
        }
        if (user.getDisplayName() != null) {
            C101043xs c101043xs = this.LJLJI;
            String displayName = user.getDisplayName();
            o.LJIIIIZZ(displayName, "user.displayName");
            c101043xs.setTitle(displayName);
        }
    }

    public SingleChatTitleBarComponent(C98523to c98523to, BaseFragment fragment, C101043xs c101043xs) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = c98523to;
        this.LJLILLLLZI = fragment;
        this.LJLJI = c101043xs;
        this.LJLJL = EnumC53695L5n.NONE;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 152));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 153));
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 154));
    }
}
