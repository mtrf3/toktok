package com.ss.android.ugc.aweme.account.profilebadge;

import X.C16880lQ;
import X.C58096Mr6;
import X.C72742Sgk;
import X.C73969T1h;
import X.C77800Ug8;
import X.EFJ;
import X.HG3;
import X.InterfaceC53724L6q;
import X.InterfaceC72740Sgi;
import X.InterfaceC72741Sgj;
import X.RBX;
import X.T16;
import Y.ARunnableS31S0200000_12;
import Y.ARunnableS48S0100000_12;
import Y.AfS64S0100000_12;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileBadgeServiceImpl implements IProfileBadgeService, WeakHandler.IHandler {
    public ProfileBadgeStruct curBadgeStruct;
    public Handler mainHandler = new Handler(C16880lQ.LLJJJJ());
    public final List<InterfaceC53724L6q> listeners = new ArrayList();
    public final List<WeakReference<InterfaceC72741Sgj>> isShowListeners = new ArrayList();
    public final List<WeakReference<InterfaceC72740Sgi>> idListeners = new ArrayList();

    private final void onIdUpdateError() {
        this.mainHandler.post(new ARunnableS48S0100000_12(this, 10));
    }

    private final void onIsShowUpdateError() {
        this.mainHandler.post(new ARunnableS48S0100000_12(this, 11));
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void refresh() {
        UserGetApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        ((UserGetApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, UserGetApi.class)).getSelf().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 16), C72742Sgk.LJLIL);
    }

    public static IProfileBadgeService createIProfileBadgeServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IProfileBadgeService.class, z);
        if (LIZ != null) {
            return (IProfileBadgeService) LIZ;
        }
        if (C58096Mr6.LJLJLLL == null) {
            synchronized (IProfileBadgeService.class) {
                if (C58096Mr6.LJLJLLL == null) {
                    C58096Mr6.LJLJLLL = new ProfileBadgeServiceImpl();
                }
            }
        }
        return C58096Mr6.LJLJLLL;
    }

    private final void updateBadgeId(Long l) {
        ProfileBadgeStruct profileBadgeStruct;
        if (l != null && (profileBadgeStruct = this.curBadgeStruct) != null) {
            profileBadgeStruct.setId(l);
        }
        AccountService.LJIJ().LJFF().updateCurProfileBadge(this.curBadgeStruct);
        this.mainHandler.post(new ARunnableS48S0100000_12(this, 12));
    }

    private final void updateBadgeShouldShow(Boolean bool) {
        ProfileBadgeStruct profileBadgeStruct;
        if (bool != null && (profileBadgeStruct = this.curBadgeStruct) != null) {
            profileBadgeStruct.setShouldShow(bool.booleanValue());
        }
        AccountService.LJIJ().LJFF().updateCurProfileBadge(this.curBadgeStruct);
        this.mainHandler.post(new ARunnableS48S0100000_12(this, 13));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message msg) {
        Boolean bool;
        Boolean bool2;
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        if (obj instanceof Exception) {
            onIsShowUpdateError();
            onIdUpdateError();
            return;
        }
        Long l = null;
        if (obj instanceof User) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            ProfileBadgeStruct profileBadge = ((User) obj).getProfileBadge();
            if (profileBadge != null) {
                bool2 = Boolean.valueOf(profileBadge.getShouldShow());
            } else {
                bool2 = null;
            }
            updateBadgeShouldShow(bool2);
            Object obj2 = msg.obj;
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            ProfileBadgeStruct profileBadge2 = ((User) obj2).getProfileBadge();
            if (profileBadge2 != null) {
                l = profileBadge2.getId();
            }
            updateBadgeId(l);
            return;
        }
        if (!(obj instanceof UserResponse)) {
            return;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
        int action = ((UserResponse) obj).getAction();
        if (action != 1) {
            if (action != 2) {
                Object obj3 = msg.obj;
                o.LJII(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                ProfileBadgeStruct profileBadge3 = ((UserResponse) obj3).getUser().getProfileBadge();
                if (profileBadge3 != null) {
                    bool = Boolean.valueOf(profileBadge3.getShouldShow());
                } else {
                    bool = null;
                }
                updateBadgeShouldShow(bool);
                Object obj4 = msg.obj;
                o.LJII(obj4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                ProfileBadgeStruct profileBadge4 = ((UserResponse) obj4).getUser().getProfileBadge();
                if (profileBadge4 != null) {
                    l = profileBadge4.getId();
                }
                updateBadgeId(l);
                return;
            }
            onIsShowUpdateError();
            onIdUpdateError();
            return;
        }
        onIsShowUpdateError();
        onIdUpdateError();
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void removeProfileBadgeIdListener(InterfaceC72740Sgi listener) {
        o.LJIIIZ(listener, "listener");
        Iterator<WeakReference<InterfaceC72740Sgi>> it = this.idListeners.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().get(), listener)) {
                it.remove();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void removeProfileBadgeIsShowListener(InterfaceC72741Sgj listener) {
        o.LJIIIZ(listener, "listener");
        Iterator<WeakReference<InterfaceC72741Sgj>> it = this.isShowListeners.iterator();
        while (it.hasNext()) {
            if (o.LJ(it.next().get(), listener)) {
                it.remove();
            }
        }
    }

    public final void safeUpdateListeners(ProfileBadgeStruct profileBadgeStruct) {
        synchronized (this.listeners) {
            Iterator<InterfaceC53724L6q> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().LIZ(profileBadgeStruct);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void subscribe(InterfaceC53724L6q onProfileBadgeUpdate) {
        o.LJIIIZ(onProfileBadgeUpdate, "onProfileBadgeUpdate");
        synchronized (this.listeners) {
            this.listeners.add(onProfileBadgeUpdate);
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void unsubscribe(InterfaceC53724L6q onProfileBadgeUpdate) {
        o.LJIIIZ(onProfileBadgeUpdate, "onProfileBadgeUpdate");
        synchronized (this.listeners) {
            this.listeners.remove(onProfileBadgeUpdate);
        }
    }

    public final void updateListeners(ProfileBadgeStruct profileBadgeStruct) {
        AccountService.LJIJ().LJFF().updateCurProfileBadge(profileBadgeStruct);
        this.mainHandler.post(new ARunnableS31S0200000_12(profileBadgeStruct, this, 4));
    }

    public final void updatePushSettings(User user) {
        boolean z;
        IVideoGiftService LJI = VideoGiftService.LJI();
        if (user.getVideoGiftStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        LJI.LJ(z);
    }

    public final synchronized void safeUpdateIdListeners(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        Iterator<WeakReference<InterfaceC72740Sgi>> it = this.idListeners.iterator();
        while (it.hasNext()) {
            InterfaceC72740Sgi interfaceC72740Sgi = it.next().get();
            if (interfaceC72740Sgi != null) {
                if (z) {
                    interfaceC72740Sgi.LIZ(profileBadgeStruct);
                } else {
                    interfaceC72740Sgi.onFail();
                }
            }
        }
    }

    public final void safeUpdateIsShowListeners(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        synchronized (this.isShowListeners) {
            Iterator<WeakReference<InterfaceC72741Sgj>> it = this.isShowListeners.iterator();
            while (it.hasNext()) {
                InterfaceC72741Sgj interfaceC72741Sgj = it.next().get();
                if (interfaceC72741Sgj != null) {
                    if (z) {
                        interfaceC72741Sgj.LIZ(profileBadgeStruct);
                    } else {
                        interfaceC72741Sgj.onFail();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void updateProfileBadgeId(long j, InterfaceC72740Sgi listener) {
        o.LJIIIZ(listener, "listener");
        this.curBadgeStruct = AccountService.LJIJ().LJFF().getCurUser().getProfileBadge();
        ((RBX) HG3.LJIILL()).updateProfileWidgetId(new WeakHandler(this), Long.valueOf(j), 0);
        this.idListeners.add(new WeakReference<>(listener));
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public void updateProfileBadgeIsShow(boolean z, InterfaceC72741Sgj listener) {
        o.LJIIIZ(listener, "listener");
        this.curBadgeStruct = AccountService.LJIJ().LJFF().getCurUser().getProfileBadge();
        ((RBX) HG3.LJIILL()).updateProfileWidgetShouldShow(new WeakHandler(this), z, 0);
        synchronized (this.isShowListeners) {
            this.isShowListeners.add(new WeakReference<>(listener));
        }
    }

    public static /* synthetic */ void safeUpdateIdListeners$default(ProfileBadgeServiceImpl profileBadgeServiceImpl, boolean z, ProfileBadgeStruct profileBadgeStruct, int i, Object obj) {
        if ((i & 2) != 0) {
            profileBadgeStruct = null;
        }
        profileBadgeServiceImpl.safeUpdateIdListeners(z, profileBadgeStruct);
    }

    public static /* synthetic */ void safeUpdateIsShowListeners$default(ProfileBadgeServiceImpl profileBadgeServiceImpl, boolean z, ProfileBadgeStruct profileBadgeStruct, int i, Object obj) {
        if ((i & 2) != 0) {
            profileBadgeStruct = null;
        }
        profileBadgeServiceImpl.safeUpdateIsShowListeners(z, profileBadgeStruct);
    }
}
