package com.ss.android.ugc.aweme.live.avatar;

import X.AV1;
import X.C09G;
import X.C1IZ;
import X.C53464Kya;
import X.C53714L6g;
import X.C63081OpJ;
import X.C77413UZt;
import X.EnumC53523KzX;
import X.EnumC53663L4h;
import X.InterfaceC53586L1i;
import X.InterfaceC53591L1n;
import X.L4O;
import X.L5U;
import X.L5V;
import X.L69;
import X.QD3;
import X.UC0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class AvatarLiveDataAdapter implements GenericLifecycleObserver, InterfaceC53586L1i, InterfaceC53591L1n, DefaultLifecycleObserver {
    public final C53464Kya LJLIL;
    public L5U LJLILLLLZI;
    public String LJLJI;

    public AvatarLiveDataAdapter() {
        this(null);
    }

    @Override // X.InterfaceC53591L1n
    public final /* bridge */ /* synthetic */ L4O LIZIZ(Object obj) {
        return null;
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZLLL(L69 l69, LifecycleOwner lifecycleOwner) {
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

    public AvatarLiveDataAdapter(C53464Kya c53464Kya) {
        this.LJLIL = c53464Kya;
    }

    @Override // X.InterfaceC53586L1i
    public final L4O LIZ(Object data) {
        o.LJIIIZ(data, "data");
        if (data instanceof User) {
            if (!C77413UZt.LJIIZILJ()) {
                return null;
            }
            User user = (User) data;
            if (!user.isLive()) {
                return null;
            }
            if ((user.isSecret() && !AV1.LJIILL(user)) || !user.isLive() || !UC0.LJJLI() || user.isBlock()) {
                return null;
            }
            return EnumC53523KzX.LIVE;
        }
        if (!(data instanceof Aweme) || !C63081OpJ.LLIIIJ((Aweme) data)) {
            return null;
        }
        return EnumC53523KzX.LIVE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZ(this, owner);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        C09G.LIZIZ(this, owner);
        EventBus.LIZJ().LJIJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLiveStatusEvent(C1IZ event) {
        Long l;
        String str;
        L5U l5u;
        String LJIJ;
        o.LJIIIZ(event, "event");
        L5U l5u2 = this.LJLILLLLZI;
        if (l5u2 != null && (LJIJ = l5u2.LJIJ()) != null) {
            this.LJLJI = LJIJ;
        }
        try {
            String str2 = this.LJLJI;
            if (str2 != null) {
                l = Long.valueOf(CastLongProtector.parseLong(str2));
            } else {
                l = null;
            }
        } catch (Throwable unused) {
            l = 0L;
        }
        long j = event.LJLILLLLZI;
        if (l != null && l.longValue() == j && event.LJLJI && (str = this.LJLJI) != null && (l5u = this.LJLILLLLZI) != null) {
            L5V.LIZ(l5u, str, null, EnumC53663L4h.LIVE, C53714L6g.LJLIL, 8);
        }
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZJ(String uid, WeakReference weakReference, L5U observer, Object obj) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(observer, "observer");
        this.LJLILLLLZI = observer;
        this.LJLJI = uid;
        C53464Kya c53464Kya = this.LJLIL;
        if ((c53464Kya != null && !c53464Kya.LIZIZ) || (lifecycleOwner = (LifecycleOwner) weakReference.get()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }
}
