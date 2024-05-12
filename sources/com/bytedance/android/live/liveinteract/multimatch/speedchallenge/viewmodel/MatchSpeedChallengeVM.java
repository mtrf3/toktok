package com.bytedance.android.live.liveinteract.multimatch.speedchallenge.viewmodel;

import X.C09650Zl;
import X.C0NB;
import X.C16880lQ;
import X.C29044Baa;
import X.C29927Bop;
import X.C47704Ins;
import X.C55749LuL;
import X.C65232Piu;
import X.C65777Prh;
import X.C73411SrX;
import X.C74039T3z;
import X.C75832TpU;
import X.C76272Twa;
import X.C76385TyP;
import X.C76820UCy;
import X.EnumC31509CYf;
import X.ORZ;
import X.QZP;
import X.TMC;
import X.U27;
import X.U2O;
import X.UD1;
import X.UD3;
import X.UD5;
import X.X1D;
import Y.AfS26S1100000_13;
import Y.AfS65S0100000_13;
import android.os.Handler;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.livesdk.gift.event.LiveGiftSentSucceedEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleTaskMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskStart;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskUpdate;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePromptElem;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS17S0200100_13;
import kotlin.jvm.internal.AqS54S1200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchSpeedChallengeVM extends AssemViewModel<C76820UCy> implements OnMessageListener {
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public DataChannel LJLJJI;
    public IMessageManager LJLJJL;
    public C73411SrX LJLJJLL;
    public Room LJLJL;
    public boolean LJLJLJ;
    public int LJLLI;
    public long LJLLL;
    public int LJLLLL;
    public long LJLLLLLL;
    public boolean LJLZ;
    public volatile boolean LJZI;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C74039T3z.class, null), true);
    public long LJLJLLL = -1;
    public UD5 LJLL = UD5.DEFAULT;
    public final List<String> LJLLILLLL = new ArrayList();
    public final Handler LJLLJ = new Handler(C16880lQ.LLJJJJ());
    public final UD1 LJZ = new UD1(this);

    public final void lv0() {
        this.LJLILLLLZI = false;
        this.LJLJLJ = false;
        this.LJLJLLL = -1L;
        setState(UD3.LJLIL);
        this.LJLL = UD5.DEFAULT;
        this.LJLLI = 0;
        ((ArrayList) this.LJLLILLLL).clear();
        this.LJLLJ.removeCallbacksAndMessages(null);
        this.LJLLL = 0L;
        this.LJLLLL = 0;
        this.LJLLLLLL = 0L;
        this.LJLZ = false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C76820UCy defaultState() {
        return new C76820UCy(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        lv0();
        super.onCleared();
    }

    public final boolean jv0() {
        if (getState().LJLJJL == 2 || getState().LJLJJL == 4) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        IMessageManager iMessageManager;
        super.onPrepared();
        this.LJLJI = ((C74039T3z) this.LJLIL.getValue()).LJLIL;
        DataChannel dataChannel = ((C74039T3z) this.LJLIL.getValue()).LJLILLLLZI;
        this.LJLJJI = dataChannel;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJJL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_TASK.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.LJLJJL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LJZ);
        }
        this.LJLJL = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        this.LJLZ = false;
        DataChannel dataChannel2 = this.LJLJJI;
        if (dataChannel2 != null) {
            dataChannel2.mv0(BattleTimeLeftChannel.class, this, new AqS179S0100000_13(this, 218));
            dataChannel2.mv0(LiveGiftSentSucceedEvent.class, this, new AqS179S0100000_13(this, 219));
            dataChannel2.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 220));
        }
    }

    public final void hv0(String str) {
        C73411SrX c73411SrX;
        if (this.LJZI) {
            return;
        }
        C73411SrX c73411SrX2 = this.LJLJJLL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLJJLL) != null) {
            c73411SrX.dispose();
        }
        this.LJZI = true;
        C0NB.LIZIZ("BattleTask", "Critical point startToDealPoint ");
        this.LJLJJLL = (C73411SrX) TMC.LJIL(0L, 100L, TimeUnit.MILLISECONDS).LJJLIIIJ(10L).LJJJLIIL(new AfS26S1100000_13(this, str, 1), new AfS65S0100000_13(this, 57));
    }

    public final void kv0(BattlePrompt battlePrompt) {
        boolean z;
        int i;
        C76385TyP c76385TyP;
        List<BattlePromptElem> list;
        if (battlePrompt == null) {
            return;
        }
        List<BattlePromptElem> list2 = battlePrompt.promptElements;
        int i2 = 0;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z && (list = battlePrompt.promptElements) != null) {
            for (BattlePromptElem battlePromptElem : list) {
                if (o.LJ("sum", battlePromptElem.promptFieldKey)) {
                    str = battlePromptElem.promptFieldValue;
                }
            }
        }
        DataChannel dataChannel = this.LJLJJI;
        if (dataChannel != null && (c76385TyP = (C76385TyP) dataChannel.kv0(BattleLeftScoreChannel.class)) != null) {
            i = c76385TyP.LJLIL;
        } else {
            i = 0;
        }
        int i3 = i - this.LJLLI;
        if (i3 >= 0) {
            i2 = i3;
        }
        U27.LJIIJJI(this.LJLJLLL, String.valueOf(i2), str, this.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BattleBonusConfig battleBonusConfig;
        BattleTaskUpdate battleTaskUpdate;
        boolean z;
        long j;
        long j2;
        if (iMessage == 0 || this.LJLJL == null || !EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        if (iMessage instanceof BaseMessage) {
            CommonMessageData commonMessageData = ((BaseMessage) iMessage).baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            } else {
                j = 0;
            }
            long j3 = j / 1000;
            Room room = this.LJLJL;
            if (room != null) {
                j2 = room.nowTime;
            } else {
                j2 = 0;
            }
            if (j3 < j2) {
                C0NB.LJIIIZ("SpeedChallengeVM", "onMessage, return message is old");
                return;
            }
        }
        if (iMessage instanceof LinkMicBattleTaskMessage) {
            LinkMicBattleTaskMessage linkMicBattleTaskMessage = (LinkMicBattleTaskMessage) iMessage;
            C76272Twa.LJJIJIIJIL(this.LJLJI, linkMicBattleTaskMessage);
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, linkMicBattleTaskMessage);
            int i = linkMicBattleTaskMessage.battleTaskMessageType;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        UD5 ud5 = this.LJLL;
                        UD5 ud52 = UD5.SUCCEED;
                        if (ud5 != ud52 && ud5 != UD5.BOTH_SUCCEED) {
                            this.LJLL = ud52;
                        }
                        BattleRewardSettle battleRewardSettle = linkMicBattleTaskMessage.rewardSettle;
                        BattlePrompt battlePrompt = null;
                        if (battleRewardSettle != null) {
                            this.LJLLJ.removeCallbacksAndMessages(null);
                            withState(new AqS54S1200000_13(this, json, battleRewardSettle, 7));
                        }
                        BattleRewardSettle battleRewardSettle2 = linkMicBattleTaskMessage.rewardSettle;
                        if (battleRewardSettle2 != null) {
                            battlePrompt = battleRewardSettle2.rewardSettlePrompt;
                        }
                        kv0(battlePrompt);
                        return;
                    }
                    BattleTaskSettle battleTaskSettle = linkMicBattleTaskMessage.taskSettle;
                    if (battleTaskSettle == null) {
                        return;
                    }
                    int i2 = battleTaskSettle.taskResult;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                if (this.LJLL == UD5.FAILED) {
                                    return;
                                }
                                this.LJLL = UD5.BOTH_SUCCEED;
                                U27.LJIILL(1, this.LJLJLLL, getState().LJLL.LJ, getState().LJLL.LIZJ, this.LJLJI, true);
                                withState(new AqS144S0200000_13(battleTaskSettle, this, 51));
                            }
                        } else {
                            UD5 ud53 = this.LJLL;
                            if (ud53 == UD5.SUCCEED || ud53 == UD5.BOTH_SUCCEED) {
                                return;
                            } else {
                                withState(new AqS179S0100000_13(this, 503));
                            }
                        }
                    } else {
                        if (this.LJLL == UD5.FAILED) {
                            return;
                        }
                        this.LJLL = UD5.SUCCEED;
                        U27.LJIILL(0, this.LJLJLLL, getState().LJLL.LJ, getState().LJLL.LIZJ, this.LJLJI, true);
                        if (this.LJLJI && jv0() && !this.LJLZ && this.LJLLL != 0) {
                            C75832TpU.LIZ.LJIJ(getState().LJLL.LIZJ, getState().LJLL.LJ, this.LJLLLLLL, true);
                            this.LJLZ = true;
                        }
                        getState().LJLL.LJ = getState().LJLL.LIZJ;
                        withState(new AqS144S0200000_13(battleTaskSettle, this, 49));
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("im_message_eggtask_task_settle, left_time = ");
                    C65232Piu.LIZLLL(LIZ, this.LJLJLLL, " , message = ", json);
                    C0NB.LJIIIZ("SpeedChallengeVM", X1D.LIZIZ(LIZ));
                    if (!(!((ArrayList) this.LJLLILLLL).isEmpty()) || (z = this.LJLJI)) {
                        return;
                    }
                    U27.LJIIIZ(this.LJLJLLL, QZP.LIZIZ("\\s", ORZ.LLD(this.LJLLILLLL, ",", null, null, null, 62), ""), z);
                    ((ArrayList) this.LJLLILLLL).clear();
                    return;
                }
                if (this.LJLL != UD5.DEFAULT || (battleTaskUpdate = linkMicBattleTaskMessage.taskUpdate) == null) {
                    return;
                }
                if (getState().LJLL.LJ < battleTaskUpdate.taskProgress) {
                    getState().LJLL.LJ = battleTaskUpdate.taskProgress;
                }
                if (getState().LJLL.LIZJ > 0 && battleTaskUpdate.taskProgress == getState().LJLL.LIZJ) {
                    hv0("egg_task_countdown");
                }
                gv0(this.LJLJLLL, U2O.TASK_IN_PROCESS);
                String str = battleTaskUpdate.logId;
                if (str != null && str.length() != 0) {
                    if (ORZ.LJLJJI(battleTaskUpdate.logId, this.LJLLILLLL)) {
                        C65777Prh.LIZ(this.LJLLILLLL).remove(battleTaskUpdate.logId);
                    }
                }
                if (battleTaskUpdate.taskProgress < 0) {
                    U27.LJIIJ(this.LJLJLLL, this.LJLJI);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("im_message_eggtask_update, left_time = ");
                C65232Piu.LIZLLL(LIZ2, this.LJLJLLL, " , message = ", json);
                C0NB.LJIIIZ("SpeedChallengeVM", X1D.LIZIZ(LIZ2));
                return;
            }
            this.LJLL = UD5.DEFAULT;
            BattleTaskStart battleTaskStart = linkMicBattleTaskMessage.taskStart;
            if (battleTaskStart != null && (battleBonusConfig = battleTaskStart.battleBonusConfig) != null) {
                iv0(battleBonusConfig, "message");
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("im_message_eggtask_init, left_time = ");
            C65232Piu.LIZLLL(LIZ3, this.LJLJLLL, " , message = ", json);
            C0NB.LJIIIZ("SpeedChallengeVM", X1D.LIZIZ(LIZ3));
        }
    }

    public final void gv0(long j, U2O u2o) {
        if (!this.LJLILLLLZI) {
            return;
        }
        withState(new AqS17S0200100_13(u2o, this, j, 0));
    }

    public final void iv0(BattleBonusConfig battleBonusConfig, String str) {
        if (!EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        if (battleBonusConfig.previewPeriodConfig == null || battleBonusConfig.previewStartTime <= 0 || battleBonusConfig.taskPeriodConfig == null) {
            this.LJLILLLLZI = false;
        } else {
            this.LJLILLLLZI = true;
            withState(new AqS54S1200000_13(battleBonusConfig, this, str, 0));
        }
    }
}
