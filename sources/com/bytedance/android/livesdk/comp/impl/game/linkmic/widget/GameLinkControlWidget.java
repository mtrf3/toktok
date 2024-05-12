package com.bytedance.android.livesdk.comp.impl.game.linkmic.widget;

import X.B83;
import X.C00F;
import X.C0NB;
import X.C28268B7o;
import X.C28272B7s;
import X.C29129Bbx;
import X.C29927Bop;
import X.C31978Cgo;
import X.C74746TVe;
import X.C74838TYs;
import X.C75187Tf5;
import X.C75559Tl5;
import X.EnumC74990Tbu;
import X.InterfaceC29405BgP;
import X.InterfaceC30177Bsr;
import X.TTR;
import X.TV2;
import X.TVC;
import X.TVL;
import X.TVM;
import X.TVQ;
import X.TWL;
import X.TYP;
import X.X1D;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.room.SeiCacheChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveOneTapGoliveEntranceSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class GameLinkControlWidget extends AbsGameLinkControlWidget implements TVM {
    public InterfaceC30177Bsr LJLIL;
    public TTR LJLILLLLZI;
    public GameLinkWidget LJLJI;
    public Room LJLJJI;
    public final C75187Tf5 LJLJJL = (C75187Tf5) C75187Tf5.LJLILLLLZI.getValue();
    public final TVQ LJLJJLL = new TVQ(this);
    public final TVL LJLJL = new TVL(this);
    public final TVC LJLJLJ = new TVC(this);
    public LiveDialog LJLJLLL = null;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dki;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LJLZ() {
        Room room = this.LJLJJI;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null && room != null && room.getOwnerUserId() == LIZIZ.getCurrentUserId()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C31978Cgo c31978Cgo;
        Integer num;
        C0NB.LJIIIZ("GameLinkControlWidget", "onDestroy");
        this.LJLIL = null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            C75187Tf5 c75187Tf5 = this.LJLJJL;
            c75187Tf5.getClass();
            try {
                IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener(c75187Tf5);
                }
            } catch (Exception e) {
                C0NB.LJII(e);
            }
        }
        TTR ttr = this.LJLILLLLZI;
        if (ttr != null) {
            ttr.LJIIJJI(null);
            this.LJLILLLLZI.X3(this.LJLJLJ);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.jv0(this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable() && ((c31978Cgo = (C31978Cgo) dataChannelGlobal.mv0(C29129Bbx.class)) == null || (num = c31978Cgo.LIZIZ) == null || num.intValue() != 1 || !TTliveOneTapGoliveEntranceSetting.INSTANCE.getValue())) {
            C75559Tl5.LIZIZ.LIZJ().clear();
        }
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 == null) goto L9;
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget.onCreate():void");
    }

    public GameLinkControlWidget(InterfaceC30177Bsr interfaceC30177Bsr) {
        C0NB.LJIIIZ("GameLinkControlWidget", "GameLinkControlWidget");
        this.LJLIL = interfaceC30177Bsr;
    }

    public final void LJZ(EnumC74990Tbu enumC74990Tbu) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGameLinkTurnedOn:");
        LIZ.append(enumC74990Tbu);
        TYP.LIZJ("GameLinkControlWidget", X1D.LIZIZ(LIZ));
        if (!isViewValid()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onGameLinkTurnedOn but view invalid");
            LIZ2.append(enumC74990Tbu);
            TYP.LIZJ("GameLinkControlWidget", X1D.LIZIZ(LIZ2));
            return;
        }
        if (this.LJLJJI != null) {
            InterfaceC30177Bsr interfaceC30177Bsr = this.LJLIL;
            if (interfaceC30177Bsr != null && this.LJLILLLLZI != null) {
                GameLinkWidget gameLinkWidget = new GameLinkWidget(this.LJLILLLLZI);
                interfaceC30177Bsr.LIZIZ(gameLinkWidget);
                this.LJLJI = gameLinkWidget;
                C0NB.LJIIIZ("GameLinkControlWidget", "loadGameLinkWidget");
                if (MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable()) {
                    gameLinkWidget.onSei((C28272B7s) this.dataChannel.kv0(SeiCacheChannel.class));
                }
            }
            if (!LJLZ()) {
                DataChannel dataChannel = this.dataChannel;
                MultiLiveAnchorPanelSettings LJI = TV2.LJI();
                if (LJI != null && LJI.allowViewerReq == 4 && TV2.LJIIJJI()) {
                    TV2.LJIIIIZZ(dataChannel);
                } else {
                    TV2.LIZLLL(dataChannel);
                }
            }
            C74746TVe.LIZ = SystemClock.uptimeMillis();
            if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_guest_connection_mode_view_start")) {
                Map LIZ3 = C74746TVe.LIZ(null);
                String str = C74746TVe.LIZJ;
                if (str == null) {
                    str = "others";
                }
                HashMap hashMap = (HashMap) LIZ3;
                hashMap.put("trigger", str);
                hashMap.put("permission_type", TV2.LJFF());
                TWL.LIZJ(LIZ3);
                C74746TVe.LIZJ = null;
                C74746TVe.LJI("livesdk_guest_connection_mode_view_start", LIZ3);
            }
        }
        C74838TYs.LJ().LIZIZ(Boolean.TRUE);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget
    public final void onSei(C28272B7s c28272B7s) {
        GameLinkWidget gameLinkWidget = this.LJLJI;
        if (gameLinkWidget != null) {
            gameLinkWidget.onSei(c28272B7s);
        }
    }

    @Override // X.InterfaceC30131Bs7
    public final boolean LJJLIIIJLJLI(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o) {
        StringBuilder LIZLLL = C00F.LIZLLL("interceptCloseRoom: ", z, ", showDialog=", z2, ", liveEvent=");
        LIZLLL.append(c28268B7o);
        TYP.LIZJ("GameLinkControlWidget", X1D.LIZIZ(LIZLLL));
        GameLinkWidget gameLinkWidget = this.LJLJI;
        if (gameLinkWidget != null) {
            return gameLinkWidget.interceptCloseRoom(runnable, z, z2, c28268B7o);
        }
        return false;
    }
}
