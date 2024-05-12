package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C05170If;
import X.C09290Yb;
import X.C0NB;
import X.C15380j0;
import X.C29044Baa;
import X.C30926CBu;
import X.C47061t0;
import X.C70657RoD;
import X.C75633TmH;
import X.C76265TwT;
import X.C76406Tyk;
import X.C76407Tyl;
import X.C76408Tym;
import X.C76409Tyn;
import X.C76410Tyo;
import X.C76411Typ;
import X.C76800UCe;
import X.C77437UaH;
import X.C79053V0v;
import X.C79212V6y;
import X.ESM;
import X.IO8;
import X.InterfaceC07790Sh;
import X.InterfaceC24520xk;
import X.InterfaceC88473Ynt;
import X.QZY;
import X.U26;
import X.U8H;
import X.UXW;
import X.UXY;
import X.W20;
import X.X1D;
import Y.IDCListenerS164S0100000_13;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionTitleLayout;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.hotword.HotWordGiftViewModel;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes14.dex */
public class IDqS437S0100000_13 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS437S0100000_13(ESM esm, ESM<?> esm2) {
        super(3);
        this.$t = esm2;
        this.l0 = esm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS437S0100000_13(U8H u8h, int i) {
        super(3);
        this.$t = i;
        this.l0 = u8h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS437S0100000_13(W20 w20, int i) {
        super(3);
        this.$t = i;
        this.l0 = w20;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS437S0100000_13(InteractionTitleLayout interactionTitleLayout, int i) {
        super(3);
        this.$t = i;
        this.l0 = interactionTitleLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS437S0100000_13(VoiceChatWatchWidget voiceChatWatchWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = voiceChatWatchWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS437S0100000_13(HotWordGiftViewModel hotWordGiftViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = hotWordGiftViewModel;
    }

    public static final Object invoke$0(IDqS437S0100000_13 iDqS437S0100000_13, Object selectSubscribe, Object obj, Object obj2) {
        RoomLinkInfo linkMicInfo;
        RoomLinkInfo linkMicInfo2;
        BattleInfoResponse battleInfoResponse;
        BattleSetting battleSetting;
        RoomLinkInfo linkMicInfo3;
        BattleInfoResponse battleInfoResponse2;
        BattleSetting battleSetting2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("contentType = ");
        LIZ.append(obj);
        C0NB.LIZIZ("InteractionTitleLayout", X1D.LIZIZ(LIZ));
        Integer num = null;
        if (o.LJ(obj, C76409Tyn.LIZ)) {
            FrameLayout frameLayout = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLLI;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                ConstraintLayout constraintLayout = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZI;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                    C47061t0 c47061t0 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LL;
                    if (c47061t0 != null) {
                        c47061t0.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout2 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLZ;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(8);
                        LinearLayout linearLayout = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZ;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(8);
                            FrameLayout frameLayout2 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZL;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(8);
                                InteractionTitleLayout interactionTitleLayout = (InteractionTitleLayout) iDqS437S0100000_13.l0;
                                interactionTitleLayout.getClass();
                                if (!C75633TmH.LIZ.isEmpty()) {
                                    CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
                                    if (cohostTopic != null) {
                                        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("updateWithLinkCross, battleState = ");
                                        LIZ2.append(C76265TwT.LIZ.LJ());
                                        LIZ2.append(", status = ");
                                        if (room != null && (linkMicInfo3 = room.getLinkMicInfo()) != null && (battleInfoResponse2 = linkMicInfo3.battleInfo) != null && (battleSetting2 = battleInfoResponse2.setting) != null) {
                                            num = Integer.valueOf(battleSetting2.status);
                                        }
                                        QZY.LIZJ(LIZ2, num, LIZ2, "InteractionTitleLayout");
                                        if (room == null || (linkMicInfo = room.getLinkMicInfo()) == null || linkMicInfo.battleInfo == null || (room != null && (linkMicInfo2 = room.getLinkMicInfo()) != null && (battleInfoResponse = linkMicInfo2.battleInfo) != null && (battleSetting = battleInfoResponse.setting) != null && battleSetting.status == 2)) {
                                            C0NB.LIZIZ("InteractionTitleLayout", "start cohost topic bubble animation, update with link cross");
                                            interactionTitleLayout.OX(cohostTopic, 0L);
                                        }
                                    }
                                }
                            } else {
                                o.LJIJI("speedChallengeLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("battlePunishCountDownLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("battleCountDownLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("linkMicLayout");
                    throw null;
                }
            } else {
                o.LJIJI("layoutContainer");
                throw null;
            }
        } else if (!o.LJ(obj, C76411Typ.LIZ)) {
            if (o.LJ(obj, C76410Tyo.LIZ)) {
                FrameLayout frameLayout3 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLLI;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                    ConstraintLayout constraintLayout3 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZI;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setVisibility(8);
                        ConstraintLayout constraintLayout4 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLZ;
                        if (constraintLayout4 != null) {
                            constraintLayout4.setVisibility(8);
                            LinearLayout linearLayout2 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZ;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(8);
                                FrameLayout frameLayout4 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZL;
                                if (frameLayout4 != null) {
                                    frameLayout4.setVisibility(0);
                                } else {
                                    o.LJIJI("speedChallengeLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("battlePunishCountDownLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("battleCountDownLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("linkMicLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("layoutContainer");
                    throw null;
                }
            } else if (o.LJ(obj, C76407Tyl.LIZ)) {
                FrameLayout frameLayout5 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLLI;
                if (frameLayout5 != null) {
                    frameLayout5.setVisibility(0);
                    LinearLayout linearLayout3 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZ;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                        ConstraintLayout constraintLayout5 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZI;
                        if (constraintLayout5 != null) {
                            constraintLayout5.setVisibility(8);
                            FrameLayout frameLayout6 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZL;
                            if (frameLayout6 != null) {
                                frameLayout6.setVisibility(8);
                                ConstraintLayout constraintLayout6 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLZ;
                                if (constraintLayout6 != null) {
                                    constraintLayout6.setVisibility(0);
                                    if (obj2 != null) {
                                        ((InteractionTitleLayout) iDqS437S0100000_13.l0).getClass();
                                    }
                                } else {
                                    o.LJIJI("battleCountDownLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("speedChallengeLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("linkMicLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("battlePunishCountDownLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("layoutContainer");
                    throw null;
                }
            } else if (o.LJ(obj, C76408Tym.LIZ)) {
                FrameLayout frameLayout7 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLLI;
                if (frameLayout7 != null) {
                    frameLayout7.setVisibility(0);
                    ConstraintLayout constraintLayout7 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJLZ;
                    if (constraintLayout7 != null) {
                        constraintLayout7.setVisibility(8);
                        ConstraintLayout constraintLayout8 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZI;
                        if (constraintLayout8 != null) {
                            constraintLayout8.setVisibility(8);
                            FrameLayout frameLayout8 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZL;
                            if (frameLayout8 != null) {
                                frameLayout8.setVisibility(8);
                                LinearLayout linearLayout4 = ((InteractionTitleLayout) iDqS437S0100000_13.l0).LJZ;
                                if (linearLayout4 != null) {
                                    linearLayout4.setVisibility(0);
                                    if (obj2 != null) {
                                        ((InteractionTitleLayout) iDqS437S0100000_13.l0).getClass();
                                    }
                                } else {
                                    o.LJIJI("battlePunishCountDownLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("speedChallengeLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("linkMicLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("battleCountDownLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("layoutContainer");
                    throw null;
                }
            } else {
                o.LJ(obj, C76406Tyk.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS437S0100000_13 iDqS437S0100000_13, Object obj, Object obj2, Object obj3) {
        User user;
        ((Number) obj3).intValue();
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        VoiceChatWatchWidget voiceChatWatchWidget = (VoiceChatWatchWidget) iDqS437S0100000_13.l0;
        voiceChatWatchWidget.getClass();
        AqS160S0200000_13 aqS160S0200000_13 = new AqS160S0200000_13(voiceChatWatchWidget, 20);
        C77437UaH c77437UaH = new C77437UaH(voiceChatWatchWidget.getContext());
        Object[] objArr = new Object[1];
        Room room = voiceChatWatchWidget.LJLJI;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        objArr[0] = C05170If.LIZ(user);
        c77437UaH.LIZJ = C15380j0.LJIILL(R.string.kv7, objArr);
        c77437UaH.LIZIZ(R.string.m7x);
        c77437UaH.LJ(R.string.kuw, new IDCListenerS164S0100000_13(aqS160S0200000_13, 4), false);
        c77437UaH.LIZJ(R.string.kux, new IDCListenerS164S0100000_13(6), false);
        VoiceChatWatchWidget.LJZL(c77437UaH.LIZ());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS437S0100000_13 iDqS437S0100000_13, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        if (booleanValue && !booleanValue2) {
            HotWordGiftViewModel hotWordGiftViewModel = (HotWordGiftViewModel) iDqS437S0100000_13.l0;
            hotWordGiftViewModel.getClass();
            C30926CBu c30926CBu = new C30926CBu();
            DataChannel dataChannel = hotWordGiftViewModel.LJLJJL;
            if (dataChannel != null) {
                dataChannel.qv0(UserWannaSendMessageEvent.class, c30926CBu);
            } else {
                o.LJIJI("dataChannel");
                throw null;
            }
        }
        if (!booleanValue3) {
            IO8 iv0 = ((HotWordGiftViewModel) iDqS437S0100000_13.l0).iv0();
            UXY.LIZ.getClass();
            long j = UXW.LIZJ;
            iv0.removeMessages(101);
            iv0.sendEmptyMessageDelayed(101, j);
            iv0.LIZIZ = System.currentTimeMillis();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS437S0100000_13 iDqS437S0100000_13, Object selectSubscribe, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((W20) iDqS437S0100000_13.l0).LLJJ(booleanValue, booleanValue2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS437S0100000_13 iDqS437S0100000_13, Object obj, Object source, Object obj2) {
        Layout layout = (Layout) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(layout, "layout");
        o.LJIIIZ(source, "source");
        U8H.LJJLIIIJJIZ((U8H) iDqS437S0100000_13.l0, layout, booleanValue, false, null, 24);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS437S0100000_13 iDqS437S0100000_13, Object Button, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(Button, "$this$Button");
        if ((intValue & 81) != 16 || !interfaceC24520xk.LIZ()) {
            float f = 4;
            C79053V0v.LIZIZ(((ESM) iDqS437S0100000_13.l0).LIZIZ, C70657RoD.LJIL(C09290Yb.LJFF(InterfaceC07790Sh.LJJJI), f, 0.0f, f, 0.0f, 10), C79212V6y.LIZ(interfaceC24520xk).LJFF(), C79212V6y.LIZIZ(interfaceC24520xk).LJIILLIIL, 0L, null, 2, false, 1, false, null, null, null, interfaceC24520xk, 102236208, 0, 7856);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
