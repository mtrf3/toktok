package com.bytedance.android.livesdk.broadcast.guide;

import X.AbstractC73672Svk;
import X.BZI;
import X.C0TY;
import X.C0WD;
import X.C19690px;
import X.C28787BRn;
import X.C29284BeS;
import X.C29285BeT;
import X.C29287BeV;
import X.C29288BeW;
import X.C30320BvA;
import X.C30323BvD;
import X.C30355Bvj;
import X.C5H3;
import X.C73411SrX;
import X.C78555UsJ;
import X.C78996UzQ;
import X.CN1;
import X.CXJ;
import X.InterfaceC67352kd;
import X.ViewOnClickListenerC30321BvB;
import X.XKS;
import X.XKX;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.os.Handler;
import android.text.Spannable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.api.LinkCoHostInviteEntranceShowEvent;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.NewAnchorGuidanceInteractionDelaySetting;
import com.bytedance.android.livesdk.model.message.NewAnchorEffectParams;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideConfig;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideMsgInfo;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GuidanceViewModel extends ViewModel implements C0WD {
    public DataChannel LJLIL;
    public Room LJLILLLLZI;
    public LifecycleOwner LJLJI;
    public C30320BvA LJLJJLL;
    public NewAnchorGuideMsgInfo LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final MutableLiveData<C30320BvA> LJLJJI = new MutableLiveData<>();
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(C30323BvD.INSTANCE);
    public final MutableLiveData<Integer> LJLJL = new MutableLiveData<>(0);
    public final MutableLiveData<C19690px> LJLJLJ = new MutableLiveData<>();
    public final ARunnableS41S0100000_5 LJLLLL = new ARunnableS41S0100000_5(this, 47);

    public final void nv0() {
        String str;
        this.LJLLI = true;
        NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = this.LJLJLLL;
        if (newAnchorGuideMsgInfo != null) {
            str = newAnchorGuideMsgInfo.messageKey;
        } else {
            str = null;
        }
        if (o.LJ(str, "multi_guest_guide")) {
            mv0(this.LJLJLLL);
            hv0().removeCallbacks(this.LJLLLL);
            this.LJLJLLL = null;
        }
    }

    public final Handler hv0() {
        return (Handler) this.LJLJJL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        hv0().removeCallbacksAndMessages(null);
        hv0().removeCallbacks(this.LJLLLL);
        C30355Bvj.LIZJ().LJIILJJIL(this);
    }

    public final void iv0(int i) {
        int i2 = (~i) & this.LJLL;
        this.LJLL = i2;
        if (i2 == 0 && this.LJLJLLL != null) {
            hv0().postDelayed(this.LJLLLL, NewAnchorGuidanceInteractionDelaySetting.INSTANCE.getValue());
        }
    }

    public final void jv0(int i) {
        this.LJLL = i | this.LJLL;
        lv0(true);
        hv0().removeCallbacks(this.LJLLLL);
    }

    public final void lv0(boolean z) {
        C30320BvA c30320BvA = this.LJLJJLL;
        if (c30320BvA != null) {
            hv0().removeCallbacksAndMessages(null);
            c30320BvA.LJI = true;
            c30320BvA.LJII = z;
            this.LJLJJI.setValue(c30320BvA);
            this.LJLJJLL = null;
        }
    }

    public final void mv0(NewAnchorGuideMsgInfo newAnchorGuideMsgInfo) {
        Room room;
        if (newAnchorGuideMsgInfo != null && (room = this.LJLILLLLZI) != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C29288BeW(newAnchorGuideMsgInfo, room.getId(), this, null), 3);
        }
    }

    public static Object gv0(AbstractC73672Svk abstractC73672Svk, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        xks.LJIILIIL(new AqS171S0100000_5((C73411SrX) abstractC73672Svk.LJJJLIIL(new AfS57S0100000_5(xks, 36), new AfS57S0100000_5(xks, 37)), 128));
        return xks.LJIIJJI();
    }

    public final void kv0(NewAnchorGuideMsgInfo newAnchorGuideMsgInfo, LifecycleOwner lifecycleOwner) {
        NewAnchorGuideConfig newAnchorGuideConfig;
        String str;
        DataChannel dataChannel;
        NewAnchorEffectParams newAnchorEffectParams;
        if (newAnchorGuideMsgInfo == null || (newAnchorGuideConfig = newAnchorGuideMsgInfo.guideConfig) == null || newAnchorGuideConfig.text == null || (str = newAnchorGuideMsgInfo.messageKey) == null) {
            return;
        }
        if (o.LJ(str, "multi_guest_guide") && this.LJLLI) {
            mv0(newAnchorGuideMsgInfo);
            return;
        }
        if (o.LJ(str, "co_host_guide") && this.LJLLILLLL) {
            mv0(newAnchorGuideMsgInfo);
            return;
        }
        if (o.LJ(str, "effect_guide")) {
            if (this.LJLLJ || (newAnchorEffectParams = newAnchorGuideConfig.effectParams) == null) {
                mv0(newAnchorGuideMsgInfo);
                return;
            }
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C29284BeS(new C29285BeT(newAnchorEffectParams.effectPanel, newAnchorEffectParams.resourceId, newAnchorEffectParams.tabKey), null), 3);
        }
        if (o.LJ(str, "share_guide") && this.LJLLL) {
            mv0(newAnchorGuideMsgInfo);
            return;
        }
        DataChannel dataChannel2 = this.LJLIL;
        boolean z = false;
        if (dataChannel2 != null && o.LJ(dataChannel2.kv0(KeyboardStatusChannel.class), Boolean.TRUE)) {
            mv0(newAnchorGuideMsgInfo);
            return;
        }
        if (this.LJLL != 0) {
            this.LJLJLLL = newAnchorGuideMsgInfo;
            return;
        }
        lv0(true);
        Spannable LJFF = CXJ.LJFF(newAnchorGuideConfig.text, "");
        o.LJIIIIZZ(LJFF, "parsePatternAndGetSpannable(guideConfig.text, \"\")");
        C30320BvA c30320BvA = new C30320BvA(LJFF);
        c30320BvA.LIZIZ = newAnchorGuideConfig.icon;
        c30320BvA.LIZJ = CXJ.LJFF(newAnchorGuideConfig.title, "").toString();
        if (newAnchorGuideConfig.iconStyle == 1) {
            z = true;
        }
        c30320BvA.LJFF = z;
        c30320BvA.LIZLLL = CXJ.LJFF(newAnchorGuideConfig.button, "");
        c30320BvA.LJ = new ViewOnClickListenerC30321BvB(this, newAnchorGuideConfig, str, lifecycleOwner, newAnchorGuideMsgInfo);
        this.LJLJJLL = c30320BvA;
        this.LJLJJI.setValue(c30320BvA);
        BZI LIZ = C28787BRn.LIZ("livesdk_guidance_tip_show");
        LIZ.LJIILLIIL(this.LJLIL);
        LIZ.LJIJJ(newAnchorGuideMsgInfo.messageKey, "tip_name");
        LIZ.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()), "online_user");
        LIZ.LJJIIJZLJL();
        if (o.LJ(newAnchorGuideMsgInfo.messageKey, "co_host_guide") && (dataChannel = this.LJLIL) != null) {
            dataChannel.qv0(LinkCoHostInviteEntranceShowEvent.class, "anchor_host_notice");
        }
        Room room = this.LJLILLLLZI;
        if (room != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C29287BeV(str, room.getId(), this, null), 3);
        }
        hv0().postDelayed(new ARunnableS41S0100000_5(this, 46), newAnchorGuideConfig.displayDuration);
    }

    @Override // X.C0WD
    public final void Z00(LiveEffect liveEffect, String str, boolean z) {
        String str2;
        if (o.LJ(C0TY.LIZIZ, str)) {
            this.LJLLJ = true;
            NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = this.LJLJLLL;
            if (newAnchorGuideMsgInfo != null) {
                str2 = newAnchorGuideMsgInfo.messageKey;
            } else {
                str2 = null;
            }
            if (o.LJ(str2, "effect_guide")) {
                mv0(this.LJLJLLL);
                hv0().removeCallbacks(this.LJLLLL);
                this.LJLJLLL = null;
            }
        }
    }
}
