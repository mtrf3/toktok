package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar;

import X.C100113wN;
import X.C100263wc;
import X.C100273wd;
import X.C100283we;
import X.C100293wf;
import X.C100303wg;
import X.C101043xs;
import X.C1040246k;
import X.C119354mJ;
import X.C2068389v;
import X.C221108m2;
import X.C53691L5j;
import X.C62822Ol8;
import X.C99033ud;
import X.EnumC53695L5n;
import X.InterfaceC100173wT;
import X.InterfaceC101063xu;
import X.InterfaceC99183us;
import Y.AObserverS69S0100000_1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar.QuickChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuickChatTitleBarComponent implements GenericLifecycleObserver, InterfaceC99183us, LifecycleOwner {
    public final LifecycleOwner LJLIL;
    public final C101043xs LJLILLLLZI;
    public final BaseQuickChatRoomViewModel LJLJI;
    public final C99033ud LJLJJI;
    public final BaseFragment LJLJJL;
    public C119354mJ LJLJJLL;
    public LiveData<ActivityStatus> LJLJL;
    public C53691L5j LJLJLJ;
    public EnumC53695L5n LJLJLLL;
    public InterfaceC100173wT LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJJL.getLifecycle();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        }
    }

    public final C1040246k LIZ() {
        return (C1040246k) this.LJLLI.getValue();
    }

    public final void LIZIZ() {
        this.LJLILLLLZI.setLeftIcon(new C100113wN((C2068389v) this.LJLZ.getValue(), R.string.c37));
        this.LJLILLLLZI.setRightIcons(new C100113wN((C2068389v) this.LJLLLL.getValue(), R.string.q2_), new C100113wN((C2068389v) this.LJLLL.getValue(), R.string.i7q));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.LJLJI.hv0().observe(this.LJLIL, new AObserverS69S0100000_1(this, 34));
        this.LJLJI.gv0().observe(this.LJLIL, new AObserverS69S0100000_1(this, 35));
        this.LJLJI.LJLJI.observe(this.LJLIL, new AObserverS69S0100000_1(this, 36));
        this.LJLILLLLZI.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3wa
            @Override // X.InterfaceC101063xu
            public final void LIZ() {
                QuickChatTitleBarComponent.this.LJLJI.jv0();
                LJFF();
            }

            @Override // X.InterfaceC101063xu
            public final void LIZIZ() {
                QuickChatTitleBarComponent.this.LJLJI.iv0();
                LJFF();
            }

            @Override // X.InterfaceC101063xu
            public final void LJ() {
                QuickChatTitleBarComponent.this.LJLJI.kv0();
            }

            public final void LJFF() {
                C98523to c98523to;
                IMUser fromUser;
                boolean z;
                C99033ud c99033ud = QuickChatTitleBarComponent.this.LJLJJI;
                if ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && (fromUser = c98523to.getFromUser()) != null) {
                    QuickChatTitleBarComponent quickChatTitleBarComponent = QuickChatTitleBarComponent.this;
                    EnumC112364b2 enumC112364b2 = EnumC112364b2.CHAT_ROOM;
                    String enterFromForMob = quickChatTitleBarComponent.LJLJJI.getEnterFromForMob();
                    C119354mJ c119354mJ = quickChatTitleBarComponent.LJLJJLL;
                    if (c119354mJ != null) {
                        z = c119354mJ.LJLJLLL;
                    } else {
                        z = false;
                    }
                    C78949Uyf.LJJIZ(quickChatTitleBarComponent, fromUser, enumC112364b2, enterFromForMob, z, null, !o.LJ(quickChatTitleBarComponent.LJLJI.LJLJI.getValue(), Boolean.TRUE), 16);
                }
            }

            @Override // X.InterfaceC101063xu
            public final void LIZLLL() {
                LIZ();
            }

            @Override // X.InterfaceC101063xu
            public final void LIZJ(int i) {
                QuickChatTitleBarComponent.this.LJLJI.lv0(i);
            }
        });
    }

    public QuickChatTitleBarComponent(LifecycleOwner lifecycleOwner, C101043xs c101043xs, BaseQuickChatRoomViewModel viewModel, C99033ud c99033ud, BaseFragment fragment) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = c101043xs;
        this.LJLJI = viewModel;
        this.LJLJJI = c99033ud;
        this.LJLJJL = fragment;
        this.LJLJLLL = EnumC53695L5n.NONE;
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 123));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 124));
        this.LJLLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 125));
        this.LJLLL = C221108m2.LIZIZ(C100293wf.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C100303wg.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C100263wc.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C100283we.LJLIL);
        this.LJZ = C221108m2.LIZIZ(C100273wd.LJLIL);
    }
}
