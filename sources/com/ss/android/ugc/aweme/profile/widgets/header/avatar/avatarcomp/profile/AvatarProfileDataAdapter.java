package com.ss.android.ugc.aweme.profile.widgets.header.avatar.avatarcomp.profile;

import X.AU9;
import X.AUR;
import X.AV1;
import X.C09G;
import X.C255199zv;
import X.C53715L6h;
import X.EnumC53663L4h;
import X.InterfaceC53586L1i;
import X.InterfaceC53591L1n;
import X.L4O;
import X.L5U;
import X.L69;
import X.X1D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AvatarProfileDataAdapter implements GenericLifecycleObserver, InterfaceC53591L1n, InterfaceC53586L1i, DefaultLifecycleObserver {
    public final AUR LJLIL;
    public String LJLILLLLZI;
    public L5U LJLJI;
    public AU9 LJLJJI;
    public final Integer LJLJJL;
    public final IProfileBadgeService LJLJJLL;
    public final C53715L6h LJLJL;

    public AvatarProfileDataAdapter() {
        this(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public AvatarProfileDataAdapter(AUR aur) {
        Integer num;
        this.LJLIL = aur;
        if (aur != null) {
            num = aur.LIZJ;
        } else {
            num = null;
        }
        this.LJLJJL = num;
        this.LJLJJLL = ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false);
        this.LJLJL = new C53715L6h(this);
    }

    @Override // X.InterfaceC53586L1i
    public final L4O LIZ(Object data) {
        o.LJIIIZ(data, "data");
        String str = null;
        if (!(data instanceof User) || data == null) {
            return null;
        }
        User user = (User) data;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("profileBadge = ");
        LIZ.append(LJ(user));
        X1D.LIZIZ(LIZ);
        ProfileBadgeStruct profileBadge = user.getProfileBadge();
        boolean z = false;
        if (profileBadge != null && profileBadge.getShouldShow() && !AV1.LJIIJJI()) {
            z = true;
        }
        boolean LJ = LJ(user);
        ProfileBadgeStruct profileBadge2 = user.getProfileBadge();
        if (profileBadge2 != null) {
            str = profileBadge2.getUrl();
        }
        AU9 au9 = new AU9(z, LJ, str);
        this.LJLJJI = au9;
        return au9;
    }

    @Override // X.InterfaceC53591L1n
    public final L4O LIZIZ(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof ProfileBadgeStruct;
        }
        AU9 au9 = null;
        String str = null;
        au9 = null;
        if (z) {
            ProfileBadgeStruct profileBadgeStruct = (ProfileBadgeStruct) obj;
            AU9 au92 = this.LJLJJI;
            if (au92 != null) {
                if (profileBadgeStruct == null || !profileBadgeStruct.getShouldShow() || AV1.LJIIJJI()) {
                    z2 = false;
                }
                if (profileBadgeStruct != null) {
                    str = profileBadgeStruct.getUrl();
                }
                au9 = new AU9(z2, au92.LJLILLLLZI, str);
            }
            this.LJLJJI = au9;
        }
        return au9;
    }

    public final boolean LJ(User user) {
        AUR aur = this.LJLIL;
        if (aur == null || !aur.LIZ || C255199zv.LJIIJ(user, "photo", "video")) {
            return false;
        }
        return true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZ(this, owner);
        C53715L6h c53715L6h = this.LJLJL;
        if (c53715L6h != null) {
            this.LJLJJLL.subscribe(c53715L6h);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZIZ(this, owner);
        C53715L6h c53715L6h = this.LJLJL;
        if (c53715L6h != null) {
            this.LJLJJLL.unsubscribe(c53715L6h);
        }
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZLLL(L69 l69, LifecycleOwner lifecycleOwner) {
        l69.LJI(EnumC53663L4h.PROFILE, new AqS135S0200000_4(l69, this, 91));
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZJ(String uid, WeakReference weakReference, L5U observer, Object obj) {
        Lifecycle lifecycle;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(observer, "observer");
        this.LJLJI = observer;
        this.LJLILLLLZI = uid;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) weakReference.get();
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
