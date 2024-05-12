package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.C0NB;
import X.C113554cx;
import X.C1DH;
import X.C221108m2;
import X.C28268B7o;
import X.C32I;
import X.C44729Hgz;
import X.C51029K0z;
import X.C62822Ol8;
import X.C74630TQs;
import X.C74751TVj;
import X.C74776TWi;
import X.C74838TYs;
import X.C75395TiR;
import X.C79004UzY;
import X.C8E;
import X.InterfaceC55235Lm3;
import X.InterfaceC74605TPt;
import X.InterfaceC74612TQa;
import X.InterfaceC75441TjB;
import X.InterfaceC75973Trl;
import X.OSZ;
import X.TYK;
import X.TYL;
import X.U4M;
import X.UC0;
import X.X1D;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatGuestWidget extends AbsVoiceChatWidget implements InterfaceC74612TQa {
    public final InterfaceC74605TPt LJLILLLLZI;
    public boolean LJLJI;
    public VoiceChatGuestPresenter LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(TYK.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 161));

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean LJLZ() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void LJZ(boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean interceptCloseRoom(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o) {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return VoiceChatGuestWidget.class.getName();
    }

    @Override // X.InterfaceC74612TQa
    public final InterfaceC55235Lm3 linkScope() {
        View view = getView();
        if (!(view instanceof FrameLayout) || view == null) {
            return null;
        }
        return UC0.LJJIJL(view);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        InterfaceC75973Trl LLIIJI;
        TYL tyl;
        super.onCreate();
        InterfaceC55235Lm3 LJIILL = C44729Hgz.LJIILL(this);
        if (LJIILL != null) {
            C44729Hgz.LIZ(LJIILL, true);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (tyl = (TYL) C79004UzY.LJIL(dataChannel, TYL.class)) != null) {
            tyl.D5();
        }
        VoiceChatGuestPresenter voiceChatGuestPresenter = new VoiceChatGuestPresenter(this, this.LJLILLLLZI);
        voiceChatGuestPresenter.attachView((InterfaceC74612TQa) this);
        this.LJLJJI = voiceChatGuestPresenter;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null) {
            LLIIJI.LJJIJL((U4M) this.LJLJJLL.getValue());
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            getLifecycle().addObserver(new AudioOccupiedMonitor(dataChannel2, this.LJLILLLLZI));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        TYL tyl;
        InterfaceC75973Trl LLIIJI;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null) {
            LLIIJI.LJJIL((U4M) this.LJLJJLL.getValue());
        }
        Room LJIILL = C1DH.LJIILL(this.dataChannel);
        MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
        if (C74776TWi.LJIILL(LJI) && (!C74776TWi.LJIILIIL(LJI) || C74776TWi.LJIIJJI(LJIILL))) {
            C74751TVj.LIZJ();
        }
        if (C74838TYs.LJ().LJJ > 0) {
            C74751TVj.LIZLLL(null, null, C1DH.LJIILL(this.dataChannel), 3);
        }
        VoiceChatGuestPresenter voiceChatGuestPresenter = this.LJLJJI;
        if (voiceChatGuestPresenter != null) {
            voiceChatGuestPresenter.detachView();
        }
        ((C75395TiR) this.LJLJJL.getValue()).LIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (tyl = (TYL) C79004UzY.LJIL(dataChannel, TYL.class)) != null) {
            tyl.k8();
        }
        InterfaceC55235Lm3 LJIILL2 = C44729Hgz.LJIILL(this);
        if (LJIILL2 != null) {
            C44729Hgz.LIZ(LJIILL2, false);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy this:");
        LIZ.append(this);
        C0NB.LIZIZ("VoiceChatGuestWidget", X1D.LIZIZ(LIZ));
        super.onDestroy();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        VoiceChatGuestPresenter voiceChatGuestPresenter = this.LJLJJI;
        if (voiceChatGuestPresenter != null) {
            voiceChatGuestPresenter.onEnterBackground();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        VoiceChatGuestPresenter voiceChatGuestPresenter = this.LJLJJI;
        if (voiceChatGuestPresenter != null) {
            voiceChatGuestPresenter.onEnterForeground();
        }
    }

    @Override // X.InterfaceC74612TQa
    public final boolean Ub() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC74612TQa
    public final boolean isValid() {
        return this.isViewValid;
    }

    public VoiceChatGuestWidget(InterfaceC74605TPt interfaceC74605TPt) {
        this.LJLILLLLZI = interfaceC74605TPt;
    }

    @Override // X.InterfaceC74612TQa
    public final void onUserMediaStateListChanged(C74630TQs listState) {
        VoiceChatMaskAbility voiceChatMaskAbility;
        o.LJIIIZ(listState, "listState");
        List<UserState> list = listState.LJLILLLLZI;
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (UserState userState : list) {
            ((C75395TiR) this.LJLJJL.getValue()).LIZJ(userState.networkState, userState.linkMicId);
            OSZ osz = new OSZ(userState.linkMicId, Integer.valueOf(userState.networkState));
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        Map<String, Integer> LJJLIL = C113554cx.LJJLIL(linkedHashMap);
        InterfaceC55235Lm3 linkScope = linkScope();
        if (linkScope != null && (voiceChatMaskAbility = (VoiceChatMaskAbility) UC0.LJIIL(linkScope, VoiceChatMaskAbility.class, null)) != null) {
            voiceChatMaskAbility.jF(LJJLIL);
        }
    }
}
