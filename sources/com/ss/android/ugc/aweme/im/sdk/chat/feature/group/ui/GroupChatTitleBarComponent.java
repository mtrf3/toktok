package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui;

import X.ActivityC45651qj;
import X.C100093wL;
import X.C100103wM;
import X.C101043xs;
import X.C221108m2;
import X.C62822Ol8;
import X.C7MY;
import X.InterfaceC101063xu;
import X.InterfaceC99183us;
import Y.AObserverS69S0100000_1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatTitleBarComponent implements GenericLifecycleObserver, InterfaceC99183us, LifecycleOwner {
    public final GroupChatViewModel LJLIL;
    public final BaseFragment LJLILLLLZI;
    public final C101043xs LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public String LJLJJLL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLILLLLZI.getLifecycle();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            setup();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void setup() {
        this.LJLIL.LJLJI.observe(this.LJLILLLLZI.getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 24));
        this.LJLIL.LJLJJL.observe(this.LJLILLLLZI.getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 25));
        this.LJLIL.LJLJL.observe(this.LJLILLLLZI.getViewLifecycleOwner(), new AObserverS69S0100000_1(this, 26));
        this.LJLJI.setLeftTitleVisible(true);
        this.LJLJI.getLayoutParams().height = C7MY.LIZIZ(56);
        this.LJLJI.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3wJ
            @Override // X.InterfaceC101063xu
            public final void LIZ() {
                GroupChatTitleBarComponent.this.LIZ("name");
            }

            @Override // X.InterfaceC101063xu
            public final void LIZIZ() {
                GroupChatTitleBarComponent.this.LIZ("name");
            }

            @Override // X.InterfaceC101063xu
            public final void LIZLLL() {
                GroupChatTitleBarComponent.this.LIZ("name");
            }

            @Override // X.InterfaceC101063xu
            public final void LJ() {
                BaseFragment baseFragment = GroupChatTitleBarComponent.this.LJLILLLLZI;
                if (baseFragment instanceof NewChatRoomFragment) {
                    ((NewChatRoomFragment) baseFragment).onExitChatRoom();
                }
            }

            @Override // X.InterfaceC101063xu
            public final void LIZJ(int i) {
                if (i == R.raw.icon_flag) {
                    C91433iN c91433iN = new C91433iN(GroupChatTitleBarComponent.this.LJLIL.LJLIL.getConversationId(), null, 6);
                    ActivityC45651qj requireActivity = GroupChatTitleBarComponent.this.LJLILLLLZI.requireActivity();
                    o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                    C98793uF.LIZLLL(c91433iN, requireActivity, "7", null, 24);
                    C80723Eu.LIZIZ(null);
                    return;
                }
                GroupChatTitleBarComponent.this.LIZ("button");
            }
        });
    }

    public final void LIZ(String str) {
        GroupChatViewModel groupChatViewModel = this.LJLIL;
        ActivityC45651qj requireActivity = this.LJLILLLLZI.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        groupChatViewModel.gv0(requireActivity, str);
    }

    public GroupChatTitleBarComponent(GroupChatViewModel groupChatViewModel, BaseFragment fragment, C101043xs c101043xs) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = groupChatViewModel;
        this.LJLILLLLZI = fragment;
        this.LJLJI = c101043xs;
        this.LJLJJI = C221108m2.LIZIZ(C100103wM.LJLIL);
        this.LJLJJL = C221108m2.LIZIZ(C100093wL.LJLIL);
    }
}
