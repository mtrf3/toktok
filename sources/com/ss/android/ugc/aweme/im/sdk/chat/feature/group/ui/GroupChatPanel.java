package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui;

import X.AbstractC1036945d;
import X.AbstractC1038245q;
import X.AnonymousClass407;
import X.C102293zt;
import X.C1023940d;
import X.C1028942b;
import X.C1036745b;
import X.C3WH;
import X.C3WL;
import X.C40A;
import X.C40C;
import X.C63120Opw;
import X.C73318Sq2;
import X.C73542Ste;
import X.C78999UzT;
import X.C81143Gk;
import X.C98563ts;
import X.C99033ud;
import X.C99043ue;
import Y.AObserverS38S0110000_1;
import Y.AObserverS69S0100000_1;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatPanel extends BaseChatPanel {
    public final C98563ts LLJJLIIIJLLLLLLLZ;
    public final GroupChatViewModel LLJL;
    public final C73318Sq2 LLJLIL;
    public boolean LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final AbstractC1038245q LJFF() {
        C99033ud c99033ud = this.LJLJJI;
        o.LJII(c99033ud, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.GroupSessionInfo");
        return new C3WH((C98563ts) c99033ud, this.LJLJI, this.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public final void onCreate() {
        super.onCreate();
        C102293zt c102293zt = (C102293zt) this.LJLLL.getValue();
        if (c102293zt != null) {
            c102293zt.LIZJ(this.LLJJLIIIJLLLLLLLZ);
        }
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(this.LLJILJILJ.LJLLLLLL, null, null, new AqS167S0100000_1(this, 61), 3), this.LLJLIL);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public final void onDestroy() {
        super.onDestroy();
        this.LLJLIL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void LJIIL(C1036745b c1036745b, final C1028942b c1028942b) {
        super.LJIIL(c1036745b, c1028942b);
        final C3WL c3wl = (C3WL) this.LJLLLL.getValue();
        if (c3wl != null) {
            final AnonymousClass407 anonymousClass407 = new AnonymousClass407(this);
            final C40A c40a = new C40A(this);
            final AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 30);
            final AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 30);
            final AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1(this, 31);
            c1036745b.LJIIJJI(new AbstractC1036945d<C1023940d>(c1028942b, c3wl, anonymousClass407, c40a, aqS167S0100000_1, aqS151S0100000_1, aqS151S0100000_12) { // from class: X.402
                public final C3WL LIZIZ;
                public final InterfaceC65784Pro<C76800UCe> LIZJ;
                public final InterfaceC65784Pro<C76800UCe> LIZLLL;
                public final InterfaceC88472Yns<C63120Opw, C76800UCe> LJ;
                public final InterfaceC65784Pro<C63120Opw> LJFF;
                public final InterfaceC65784Pro<Boolean> LJI;

                @Override // X.AbstractC1036945d
                public final void LIZIZ() {
                    C3WL c3wl2 = this.LIZIZ;
                    c3wl2.setVisibility(8);
                    c3wl2.LJJZ();
                    this.LIZLLL.invoke();
                }

                @Override // X.AbstractC1036945d
                public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
                    this.LIZIZ.LJJLL(this.LJFF.invoke(), this.LJ);
                    this.LIZIZ.setVisibility(0);
                    C84283Sm c84283Sm = C84283Sm.LIZ;
                    C63120Opw invoke = this.LJFF.invoke();
                    c84283Sm.getClass();
                    if (o.LJ(C84283Sm.LIZJ(invoke), C3NB.LIZ)) {
                        this.LIZJ.invoke();
                    } else {
                        this.LIZLLL.invoke();
                    }
                    return this.LIZIZ;
                }

                @Override // X.AbstractC1036945d
                public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
                    boolean z;
                    if (this.LIZ.isDebugMode() || o.LJ(this.LJI.invoke(), Boolean.FALSE)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }

                {
                    super(C41X.BLOCK);
                    this.LIZIZ = c3wl;
                    this.LIZJ = anonymousClass407;
                    this.LIZLLL = c40a;
                    this.LJ = aqS167S0100000_1;
                    this.LJFF = aqS151S0100000_1;
                    this.LJI = aqS151S0100000_12;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void LJIIIZ(int i, int i2, Intent intent) {
        if (i == 16 && i2 == 2097) {
            this.LLJL.LJLJLJ.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupChatPanel(LifecycleOwner parent, View view, C98563ts c98563ts, GroupChatViewModel viewModel, boolean z, C99043ue chatRoomConfig) {
        super(parent, view, c98563ts, z, chatRoomConfig);
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(chatRoomConfig, "chatRoomConfig");
        this.LLJJLIIIJLLLLLLLZ = c98563ts;
        this.LLJL = viewModel;
        this.LLJLIL = new C73318Sq2();
        this.LLJLILLLLZIIL = true;
        viewModel.LJLJLJ.observe(parent, new AObserverS38S0110000_1(this, z, 2));
        viewModel.LJLJL.observe(parent, new AObserverS69S0100000_1(this, 22));
        viewModel.LJLJJL.observe(parent, new AObserverS69S0100000_1(this, 23));
        C81143Gk.LIZJ(C81143Gk.LIZ, c98563ts.getConversationId(), null, null, 28);
        C63120Opw c63120Opw = (C63120Opw) viewModel.LJLJJL.getValue();
        C40C.LIZ(c63120Opw != null ? Long.valueOf(c63120Opw.getConversationShortId()) : null);
    }
}
