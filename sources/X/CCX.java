package X;

import Y.ACListenerS40S0200000_5;
import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.GameLiveWarnTipsShowingChannel;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.dataChannel.ForceCloseLinkEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CCX implements InterfaceC30146BsM {
    public final BaseFragment LIZ;
    public final DataChannel LIZIZ;
    public final AbstractC30130Bs6 LIZJ;
    public final View LIZLLL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJ;
    public final InterfaceC88472Yns<RemindMessage, C76800UCe> LJFF;
    public final InterfaceC65784Pro<Boolean> LJI;
    public final C5H3 LJII;
    public final C5H3 LJIIIIZZ;
    public long LJIIIZ;
    public final ORV<RemindMessage> LJIIJ;

    public final Room LIZ() {
        return (Room) this.LIZIZ.kv0(RoomChannel.class);
    }

    @Override // X.InterfaceC30146BsM
    public final void onDestroy() {
        long j;
        C30935CCd c30935CCd = (C30935CCd) this.LJII.getValue();
        Room LIZ = LIZ();
        if (LIZ != null) {
            j = LIZ.getId();
        } else {
            j = 0;
        }
        c30935CCd.getClass();
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(j);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(c30935CCd);
        }
        C1A.LIZLLL(c30935CCd);
        c30935CCd.LJLIL = null;
        CKB.INSTANCE.pollMessage = null;
        ((Handler) this.LJIIIIZZ.getValue()).removeCallbacksAndMessages(null);
        this.LJIIJ.clear();
    }

    public final void LIZIZ(RemindMessage remindMessage) {
        Spannable spannable;
        boolean z;
        Long l;
        Long l2;
        LiveMode streamType;
        Spannable spannable2 = CXJ.LIZ;
        CharSequence charSequence = "";
        if (remindMessage.supportDisplayText()) {
            spannable = CXJ.LJFF(remindMessage.baseMessage.displayText, "");
        } else {
            spannable = spannable2;
        }
        if (spannable == spannable2 && !TextUtils.isEmpty(remindMessage.content)) {
            spannable = new SpannableString(remindMessage.content);
        }
        CharSequence LJFF = CXJ.LJFF(remindMessage.title, "");
        Spannable LJFF2 = CXJ.LJFF(remindMessage.violationReason, "");
        o.LJIIIIZZ(LJFF2, "parsePatternAndGetSpanna…sage.violationReason, \"\")");
        Spannable LJFF3 = CXJ.LJFF(remindMessage.illegalText, "");
        o.LJIIIIZZ(LJFF3, "parsePatternAndGetSpanna…dMessage.illegalText, \"\")");
        Spannable LJFF4 = CXJ.LJFF(remindMessage.bottomTip, "");
        o.LJIIIIZZ(LJFF4, "parsePatternAndGetSpanna…indMessage.bottomTip, \"\")");
        if (!TextUtils.isEmpty(LJFF)) {
            if (!TextUtils.isEmpty(LJFF2) && !TextUtils.isEmpty(LJFF3)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("\n                            ");
                LIZ.append((Object) LJFF2);
                LIZ.append("\n                            ");
                LIZ.append((Object) LJFF3);
                LIZ.append("\n                            ");
                charSequence = C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ));
            } else if (!TextUtils.isEmpty(LJFF2)) {
                charSequence = LJFF2;
            } else if (!TextUtils.isEmpty(LJFF3)) {
                charSequence = LJFF3;
            }
        } else {
            charSequence = spannable;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (TextUtils.isEmpty(LJFF)) {
            LJFF = C15380j0.LJIILJJIL(R.string.mou);
        }
        if (!TextUtils.isEmpty(LJFF4) && !TextUtils.isEmpty(remindMessage.tipUrl)) {
            z = true;
        } else {
            z = false;
        }
        C77437UaH c77437UaH = new C77437UaH(this.LIZ.mo49getActivity());
        c77437UaH.LJJII = false;
        c77437UaH.LIZJ = LJFF;
        c77437UaH.LJII = charSequence;
        c77437UaH.LJ(R.string.lv7, DialogInterfaceOnClickListenerC30933CCb.LJLIL, false);
        if (z) {
            ACListenerS40S0200000_5 aCListenerS40S0200000_5 = new ACListenerS40S0200000_5(remindMessage, this, 28);
            c77437UaH.LIZLLL = LJFF4;
            c77437UaH.LJIIZILJ = aCListenerS40S0200000_5;
            c77437UaH.LJIIIZ = R.drawable.czt;
        }
        DialogC77438UaI LIZ2 = c77437UaH.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-4947402180297692226")).LIZ) {
            LIZ2.show();
        }
        this.LJIIIZ = System.currentTimeMillis();
        String str = null;
        if (LJFF != null && charSequence != null && this.LIZIZ.kv0(BCX.class) == LiveMode.SCREEN_RECORD) {
            DataChannel dataChannel = this.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append((Object) LJFF);
            LIZ3.append(':');
            LIZ3.append((Object) charSequence);
            dataChannel.rv0(GameLiveWarnTipsShowingChannel.class, new C61142ac(X1D.LIZIZ(LIZ3), "warning&no_rec", null));
        }
        C29306Beo.LJIIJ(this.LIZIZ);
        C29827BnD.LIZJ(remindMessage);
        BZI LIZ4 = C28787BRn.LIZ("livesdk_live_room_alert_show");
        Room LIZ5 = LIZ();
        if (LIZ5 != null) {
            l = Long.valueOf(LIZ5.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ4.LJIJJ(l, "anchor_id");
        Room LIZ6 = LIZ();
        if (LIZ6 != null) {
            l2 = Long.valueOf(LIZ6.getId());
        } else {
            l2 = null;
        }
        LIZ4.LJIJJ(l2, "room_id");
        Room LIZ7 = LIZ();
        if (LIZ7 != null && (streamType = LIZ7.getStreamType()) != null) {
            str = C28509BGv.LIZ(streamType);
        }
        LIZ4.LJIJJ(str, "live_type");
        LIZ4.LJIJJ(remindMessage.scene, WM7.SCENE_SERVICE);
        LIZ4.LJIILLIIL(this.LIZIZ);
        LIZ4.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CCX(BaseFragment fragment, DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6, View mLivePauseToast, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super RemindMessage, C76800UCe> interfaceC88472Yns2, InterfaceC65784Pro<Boolean> isStreamPaused) {
        long j;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(mLivePauseToast, "mLivePauseToast");
        o.LJIIIZ(isStreamPaused, "isStreamPaused");
        this.LIZ = fragment;
        this.LIZIZ = dataChannel;
        this.LIZJ = abstractC30130Bs6;
        this.LIZLLL = mLivePauseToast;
        this.LJ = interfaceC88472Yns;
        this.LJFF = interfaceC88472Yns2;
        this.LJI = isStreamPaused;
        C5H3 LJJIJIIJI = C78996UzQ.LJJIJIIJI(C30934CCc.LJLIL);
        this.LJII = LJJIJIIJI;
        this.LJIIIIZZ = C78996UzQ.LJJIJIIJI(C30932CCa.INSTANCE);
        this.LJIIJ = new ORV<>();
        C30935CCd c30935CCd = (C30935CCd) LJJIJIIJI.getValue();
        Room LIZ = LIZ();
        if (LIZ != null) {
            j = LIZ.getId();
        } else {
            j = 0;
        }
        c30935CCd.LJLIL = new InterfaceC30936CCe() { // from class: X.CCY
            @Override // X.InterfaceC30936CCe
            public final void LIZ(CR6 cr6) {
                EnumC31509CYf messageType;
                InterfaceC88472Yns<RemindMessage, C76800UCe> interfaceC88472Yns3;
                CCX ccx = CCX.this;
                if (!ccx.LIZ.isViewValid() || cr6 == null || (messageType = cr6.getMessageType()) == null) {
                    return;
                }
                int i = CCZ.LIZ[messageType.ordinal()];
                long j2 = 0;
                switch (i) {
                    case 1:
                        Room LIZ2 = ccx.LIZ();
                        if (LIZ2 != null) {
                            j2 = LIZ2.getId();
                        }
                        if (!cr6.isCurrentRoom(j2)) {
                            return;
                        }
                        ccx.LIZIZ.rv0(MemberMessageChannel.class, cr6);
                        return;
                    case 2:
                        o.LJII(cr6, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.RemindMessage");
                        RemindMessage remindMessage = (RemindMessage) cr6;
                        int i2 = remindMessage.noticeType;
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if ((i2 != 6 && i2 != 7) || (interfaceC88472Yns3 = ccx.LJFF) == null) {
                                        return;
                                    }
                                    interfaceC88472Yns3.invoke(remindMessage);
                                    return;
                                }
                                if (ccx.LJIIIZ == 0) {
                                    ccx.LIZIZ(remindMessage);
                                    return;
                                }
                                if (System.currentTimeMillis() - ccx.LJIIIZ >= 60000) {
                                    ccx.LIZIZ(remindMessage);
                                    return;
                                }
                                ccx.LJIIJ.addFirst(remindMessage);
                                long currentTimeMillis = 60000 - (System.currentTimeMillis() - ccx.LJIIIZ);
                                if (currentTimeMillis < 0) {
                                    return;
                                }
                                ((Handler) ccx.LJIIIIZZ.getValue()).postDelayed(new ARunnableS41S0100000_5(ccx, 204), currentTimeMillis);
                                return;
                            }
                            if (!ccx.LJI.invoke().booleanValue()) {
                                ccx.LIZLLL.setVisibility(8);
                            }
                            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns4 = ccx.LJ;
                            if (interfaceC88472Yns4 != null) {
                                interfaceC88472Yns4.invoke(Boolean.FALSE);
                            }
                            Room LIZ3 = ccx.LIZ();
                            if (LIZ3 != null) {
                                LIZ3.setMosaicStatus(0);
                            }
                            AbstractC30130Bs6 abstractC30130Bs62 = ccx.LIZJ;
                            if (abstractC30130Bs62 == null) {
                                return;
                            }
                            abstractC30130Bs62.LIZ(remindMessage);
                            return;
                        }
                        Object kv0 = ccx.LIZIZ.kv0(UserIsAnchorChannel.class);
                        o.LJI(kv0);
                        if (!((Boolean) kv0).booleanValue()) {
                            ccx.LIZLLL.setVisibility(0);
                        }
                        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns5 = ccx.LJ;
                        if (interfaceC88472Yns5 != null) {
                            interfaceC88472Yns5.invoke(Boolean.TRUE);
                        }
                        Room LIZ4 = ccx.LIZ();
                        if (LIZ4 != null) {
                            LIZ4.setMosaicStatus(1);
                        }
                        AbstractC30130Bs6 abstractC30130Bs63 = ccx.LIZJ;
                        if (abstractC30130Bs63 != null) {
                            abstractC30130Bs63.LIZ(remindMessage);
                        }
                        ccx.LIZIZ.qv0(ForceCloseLinkEvent.class, Boolean.TRUE);
                        return;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        Room LIZ5 = ccx.LIZ();
                        if (LIZ5 != null && LIZ5.isOfficial()) {
                            return;
                        }
                        CKB.INSTANCE.add(cr6);
                        return;
                    case 7:
                        CKB.INSTANCE.add(cr6);
                        return;
                    case 8:
                        CKB.INSTANCE.pollMessage = (PollMessage) cr6;
                        return;
                    default:
                        return;
                }
            }
        };
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(j);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.MEMBER.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.LIVE_UNAUTHORIZED_MEMBER_MESSAGE.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.ROOM_NOTIFY.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.REMIND.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.COMMON_TOAST.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.GUIDE_MESSAGE.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.COMMON_GUIDE.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.CEREMONY_MESSAGE.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.QUESTION.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), c30935CCd);
            iMessageManager.addMessageListener(EnumC31509CYf.OPERATE_TOAST_MESSAGE.getIntType(), c30935CCd);
        }
        C1A.LIZ(EnumC31509CYf.LIVE_POLL_MESSAGE.getIntType(), c30935CCd);
    }
}
