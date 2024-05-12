package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.component;

import X.C101043xs;
import X.C119624mk;
import X.C32151Nz;
import X.C96943rG;
import X.C96963rI;
import X.C97343ru;
import X.C97353rv;
import X.C99263v0;
import X.InterfaceC101063xu;
import X.InterfaceC99183us;
import X.O6R;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.component.TakoTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoTitleBarComponent implements GenericLifecycleObserver, InterfaceC99183us, LifecycleOwner {
    public final BaseFragment LJLIL;
    public final C101043xs LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.getLifecycle();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate$im_base_release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate$im_base_release() {
        C101043xs c101043xs = this.LJLILLLLZI;
        c101043xs.setLeftTitleVisible(false);
        View rightView = c101043xs.getRightView();
        if (rightView != null) {
            rightView.setVisibility(4);
        }
        C96963rI.LJII().getClass();
        c101043xs.setTitle(C97353rv.LIZJ());
        C119624mk centerAvatar = this.LJLILLLLZI.getCenterAvatar();
        if (centerAvatar != null) {
            centerAvatar.setVisibility(0);
            C97343ru.LIZIZ(centerAvatar, C99263v0.LJLIL);
            C96943rG LJFF = C96963rI.LJFF();
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
            LJFF.getClass();
            C96943rG.LIZ(LJJIIZ, centerAvatar);
        }
        this.LJLILLLLZI.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3v1
            @Override // X.InterfaceC101063xu
            public final void LIZ() {
            }

            @Override // X.InterfaceC101063xu
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC101063xu
            public final void LIZJ(int i) {
            }

            @Override // X.InterfaceC101063xu
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC101063xu
            public final void LJ() {
                BaseChatRoomFragment baseChatRoomFragment;
                BaseFragment baseFragment = TakoTitleBarComponent.this.LJLIL;
                if ((baseFragment instanceof BaseChatRoomFragment) && (baseChatRoomFragment = (BaseChatRoomFragment) baseFragment) != null) {
                    baseChatRoomFragment.handleOnBackPressed();
                }
                TakoTitleBarComponent.this.LJLIL.requireActivity().onBackPressed();
            }
        });
    }

    public TakoTitleBarComponent(BaseFragment fragment, C101043xs c101043xs) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = c101043xs;
    }
}
