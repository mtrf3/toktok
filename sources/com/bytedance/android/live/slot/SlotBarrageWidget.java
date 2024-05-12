package com.bytedance.android.live.slot;

import X.B83;
import X.C16880lQ;
import X.C29374Bfu;
import X.C29927Bop;
import X.C80955Vpv;
import X.CF1;
import X.CF7;
import X.CF8;
import X.CF9;
import X.CFN;
import X.EnumC31509CYf;
import Y.AObjectS14S0001000_13;
import Y.AObjectS42S0101000_5;
import Y.IDHandlerS18S0100000_5;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.NormalGiftDisplayStatusEvent;
import com.bytedance.android.livesdk.api.revenue.level.event.PublicLevelUpMessageEvent;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBarrageSwitchSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.livesetting.slot.LiveBarrageViewVisibleEnableSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class SlotBarrageWidget extends LiveRecyclableWidget implements OnMessageListener, CFN {
    public static final List<Integer> LJLLJ = Arrays.asList(2);
    public IMessageManager LJLIL;
    public View LJLILLLLZI;
    public boolean LJLJJI;
    public final Handler LJLJI = new Handler();
    public CF9 LJLJJL = null;
    public CF8 LJLJJLL = null;
    public CF7 LJLJL = null;
    public C80955Vpv LJLJLJ = null;
    public boolean LJLJLLL = false;
    public final boolean LJLL = UserLevelBarrageSwitchSettings.INSTANCE.getValue();
    public final boolean LJLLI = LiveBarrageViewVisibleEnableSetting.INSTANCE.getValue();
    public final boolean LJLLILLLL = LiveMatchRequestLayoutSettings.INSTANCE.isRankListEnabled();

    public final void LJZI() {
        this.LJLJJI = false;
        this.LJLILLLLZI = null;
        CF9 cf9 = this.LJLJJL;
        if (cf9 != null) {
            cf9.LJ = null;
            cf9.LIZLLL = false;
            cf9.LIZIZ.clear();
            cf9.LIZJ.clear();
            this.LJLJJL = null;
        }
        CF8 cf8 = this.LJLJJLL;
        if (cf8 != null) {
            cf8.LJIJI();
            cf8.LJJIIZ = false;
            ConstraintLayout LJIIJJI = cf8.LJIIJJI();
            if (LJIIJJI != null) {
                LJIIJJI.setVisibility(8);
            }
            cf8.LJJIJ = null;
            IDHandlerS18S0100000_5 iDHandlerS18S0100000_5 = cf8.LJJIJIIJI;
            if (iDHandlerS18S0100000_5 != null) {
                iDHandlerS18S0100000_5.removeCallbacksAndMessages(null);
            }
            this.LJLJJLL = null;
        }
        CF7 cf7 = this.LJLJL;
        if (cf7 != null) {
            LinearLayout linearLayout = (LinearLayout) cf7.LIZLLL.getValue();
            if (linearLayout != null) {
                C16880lQ.LJIIZILJ(linearLayout, null);
            }
            this.LJLJL = null;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManager = this.LJLIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(EnumC31509CYf.BARRAGE_MESSAGE.getIntType(), this);
            this.LJLIL.removeMessageListener(EnumC31509CYf.COMMON_POPUP_MESSAGE.getIntType(), this);
        }
        this.LJLJI.removeCallbacksAndMessages(null);
        hide();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        LJZI();
    }

    public SlotBarrageWidget() {
        LJZI();
    }

    public final boolean LJLZ(BarrageMessage barrageMessage) {
        int i;
        View view = this.LJLILLLLZI;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        if (this.LJLL && barrageMessage != null && (((i = barrageMessage.msgType) == 8 || i == 10) && ((!CF1.LIZIZ || CF1.LIZ(barrageMessage)) && !CF1.LIZ(barrageMessage)))) {
            return true;
        }
        CF8 cf8 = this.LJLJJLL;
        if (cf8 != null && cf8.LJJIIZ) {
            return true;
        }
        return false;
    }

    public final boolean LJZ(BarrageMessage barrageMessage) {
        if (barrageMessage == null) {
            return true;
        }
        int i = barrageMessage.msgType;
        boolean z = false;
        if (i != 2) {
            if (i != 5) {
                if ((i == 8 || i == 10) && !barrageMessage.isLocalInsertMsg) {
                    String LJFF = CF1.LJFF(barrageMessage);
                    String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                    if (!TextUtils.isEmpty(valueOf) && TextUtils.equals(LJFF, valueOf)) {
                        return true;
                    }
                }
            } else if (this.LJLJLLL) {
                return true;
            }
            return false;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || Boolean.TRUE.equals(dataChannel.kv0(EcLiveBarrageEnable.class))) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0301, code lost:
    
        if (r8 < 2.7f) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:539:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(com.bytedance.android.livesdk.model.message.BarrageMessage r18) {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.SlotBarrageWidget.LJZL(com.bytedance.android.livesdk.model.message.BarrageMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.LJLILLLLZI = getView();
        this.LJLIL = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.LJLJLLL = ((Boolean) this.dataChannel.kv0(UserIsAnchorChannel.class)).booleanValue();
        this.dataChannel.lv0(this, NormalGiftDisplayStatusEvent.class, new AObjectS42S0101000_5(0, this, 3));
        C80955Vpv c80955Vpv = (C80955Vpv) findViewById(R.id.de2);
        this.LJLJLJ = c80955Vpv;
        if (c80955Vpv != null) {
            c80955Vpv.setEnableSizeChange(true);
            this.LJLJLJ.setEnableFixedSize(this.LJLLILLLL);
        }
        this.dataChannel.lv0(this, UserLevelEvent.class, new AObjectS42S0101000_5(0, this, 4));
        this.dataChannel.lv0(this, FansClubEvent.class, new AObjectS42S0101000_5(0, this, 6));
        this.dataChannel.lv0(this, PublicLevelUpMessageEvent.class, new AObjectS14S0001000_13(0, 0));
        hide();
        IMessageManager iMessageManager = this.LJLIL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.BARRAGE_MESSAGE.getIntType(), this);
            this.LJLIL.addMessageListener(EnumC31509CYf.COMMON_POPUP_MESSAGE.getIntType(), this);
        }
        this.LJLJJL = new CF9(this);
        this.LJLJJLL = new CF8(this.LJLILLLLZI, this);
        this.LJLJL = new CF7(this.LJLILLLLZI, this.dataChannel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (r2 != false) goto L62;
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r8) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.SlotBarrageWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
