package com.bytedance.android.live.liveinteract.multiguestv3.main.guest;

import X.BYM;
import X.BYO;
import X.BYP;
import X.C15380j0;
import X.C30868C9o;
import X.C74749TVh;
import X.C74766TVy;
import X.C74969TbZ;
import X.InterfaceC74596TPk;
import X.InterfaceC74834TYo;
import X.TXK;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowContent;

/* loaded from: classes14.dex */
public abstract class BaseMultiGuestV3GuestWidget extends LinkMicGuestWidget implements InterfaceC74596TPk {
    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void becomeGuest() {
    }

    @Override // X.InterfaceC74596TPk
    public void becomeNormalAudience() {
    }

    @Override // X.InterfaceC74596TPk
    public void dismissApplyDialogIfNeed() {
    }

    public void dismissKickOutDialog() {
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void forceDismissApplyDialog() {
    }

    @Override // X.InterfaceC74596TPk
    public boolean isApplyDialogShowing() {
        return false;
    }

    @Override // X.InterfaceC74596TPk
    public boolean isInPipMode() {
        return false;
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void loadLiveShowAudienceWidget() {
    }

    @Override // X.InterfaceC74596TPk
    public void onCheckPermissionFailed(TXK errInfo) {
        o.LJIIIZ(errInfo, "errInfo");
    }

    @Override // X.InterfaceC74596TPk
    public void onInteractFailed() {
    }

    @Override // X.InterfaceC74596TPk
    public void onJoinChannelFailed(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC74596TPk
    public void onPlayerListChange(List<? extends LinkPlayerInfo> players) {
        o.LJIIIZ(players, "players");
    }

    @Override // com.bytedance.android.live.liveinteract.api.LinkMicGuestWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void onTalkVoiceUpdated(int i) {
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void setLiveShowContentForCharacterChange(ShowContent showContent) {
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void showApplyDialog(boolean z, List list, String str, long j) {
    }

    @Override // X.InterfaceC74596TPk
    public void showBeautySettingDialog(long j, int i) {
    }

    @Override // X.InterfaceC74596TPk
    public void showKickOutDialog() {
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void showLiveShowDialog() {
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void showPreviewDialogWhenAnchorOrModeratorPermit(C74749TVh c74749TVh) {
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void showReservationDialog(long j) {
    }

    @Override // X.InterfaceC74596TPk
    public /* synthetic */ void tryToShowGoLivePreviewDialogWhenAccepted(boolean z, List list, String str, long j, int i) {
    }

    @Override // X.InterfaceC31336CRo
    public String getLogTag() {
        return getClass().getName();
    }

    @Override // X.InterfaceC74596TPk
    public void onCheckPermissionFailedV3(C74766TVy permissionErrInfo) {
        Integer num;
        o.LJIIIZ(permissionErrInfo, "permissionErrInfo");
        Long l = permissionErrInfo.LIZ;
        InterfaceC74834TYo interfaceC74834TYo = null;
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 20048) {
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            BYM.LIZLLL(context, this.dataChannel);
            return;
        }
        if (num.intValue() == 31002) {
            return;
        }
        if (num.intValue() == 31011) {
            BYM.LIZ(this, this.dataChannel);
            return;
        }
        if (num.intValue() == 4003037) {
            Context context2 = this.context;
            BYP byp = BYP.BAN_FOR_BROADCASTING;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                interfaceC74834TYo = (InterfaceC74834TYo) dataChannel.kv0(C74969TbZ.class);
            }
            BYO.LIZIZ(context2, this, byp, interfaceC74834TYo);
            return;
        }
        if (num.intValue() == 4003036) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.moi));
            return;
        }
        if (num.intValue() == 4003088) {
            int i = permissionErrInfo.LIZJ;
            Context context3 = this.context;
            o.LJIIIIZZ(context3, "context");
            BYM.LIZJ(context3, this.dataChannel, i);
            return;
        }
        if (num.intValue() != 4003089) {
            return;
        }
        int i2 = permissionErrInfo.LIZJ;
        Context context4 = this.context;
        o.LJIIIIZZ(context4, "context");
        BYM.LIZIZ(context4, this.dataChannel, i2);
    }
}
