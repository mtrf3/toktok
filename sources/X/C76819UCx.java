package X;

import Y.ARunnableS49S0100000_13;
import Y.AfS26S1100000_13;
import Y.AfS65S0100000_13;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.LiveGiftSentSucceedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleTaskMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskStart;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskUpdate;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePromptElem;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UCx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76819UCx implements OnMessageListener {
    public final DataChannel LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public UD6 LJLJJI;
    public IMessageManager LJLJJL;
    public C73411SrX LJLJJLL;
    public Room LJLJL;
    public boolean LJLJLJ;
    public long LJLLILLLL;
    public long LJLLJ;
    public long LJZ;
    public long LJZL;
    public ImageModel LL;
    public int LLF;
    public BattlePrompt LLFF;
    public long LLFZ;
    public BattlePrompt LLIFFJFJJ;
    public BattlePrompt LLII;
    public BattlePrompt LLIIII;
    public BattlePrompt LLIIIILZ;
    public int LLIIIJ;
    public BattleTaskGiftAmountGuide LLIIJI;
    public long LLIIJLIL;
    public int LLIIL;
    public long LLIILII;
    public boolean LLIILZL;
    public volatile boolean LLIL;
    public long LJLJLLL = -1;
    public U2O LJLL = U2O.DISABLED;
    public List<PreviewPeriod> LJLLI = new ArrayList();
    public long LJLLL = -1;
    public long LJLLLL = 30;
    public int LJLLLLLL = 1;
    public long LJLZ = 10;
    public UD5 LJZI = UD5.DEFAULT;
    public String LLD = "";
    public long LLFFF = -1;
    public long LLFII = 10;
    public final long LLI = 5;
    public final List<String> LLIIIL = new ArrayList();
    public final Handler LLIIIZ = new Handler(C16880lQ.LLJJJJ());
    public final UD2 LLIIZ = new UD2(this);

    public final void LJII() {
        this.LJLILLLLZI = false;
        this.LJLJLJ = false;
        this.LJLJLLL = -1L;
        this.LJLL = U2O.DISABLED;
        this.LJLLI = new ArrayList();
        this.LJLLILLLL = 0L;
        this.LJLLJ = 0L;
        this.LJLLL = -1L;
        this.LJLLLL = 30L;
        this.LJLLLLLL = 1;
        this.LJLZ = 10L;
        this.LJZ = 0L;
        this.LJZI = UD5.DEFAULT;
        this.LJZL = 0L;
        this.LLFFF = 0L;
        this.LLFII = 10L;
        this.LLFZ = 0L;
        this.LLIFFJFJJ = null;
        this.LLII = null;
        this.LLIIII = null;
        this.LLIIIILZ = null;
        this.LLIIIJ = 0;
        this.LLF = 0;
        this.LLD = "";
        this.LL = null;
        ((ArrayList) this.LLIIIL).clear();
        this.LLIIIZ.removeCallbacksAndMessages(null);
        this.LLIIJI = null;
        this.LLIIJLIL = 0L;
        this.LLIIL = 0;
        this.LLIILII = 0L;
        this.LLIILZL = false;
    }

    public final boolean LJFF() {
        int i = this.LLF;
        if (i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ() {
        LJII();
        UD6 ud6 = this.LJLJJI;
        if (ud6 != null) {
            ud6.n0(this.LJLJLLL, this.LJLL);
        }
    }

    public C76819UCx(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    public final void LIZ(UD6 view) {
        IMessageManager iMessageManager;
        boolean z;
        LifecycleOwner lifecycleOwner;
        Boolean bool;
        o.LJIIIZ(view, "view");
        this.LJLJJI = view;
        if (!EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        DataChannel dataChannel = this.LJLIL;
        LifecycleOwner lifecycleOwner2 = null;
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
            iMessageManager2.addMessageListener(EnumC31509CYf.LINK_MIC_BATTLE_ARMIES.getIntType(), this.LLIIZ);
        }
        this.LJLJL = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        DataChannel dataChannel2 = this.LJLIL;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJI = z;
        this.LLIILZL = false;
        DataChannel dataChannel3 = this.LJLIL;
        if (dataChannel3 != null) {
            dataChannel3.lv0(dataChannel3.LJLJJI, BattleTimeLeftChannel.class, new AqS179S0100000_13(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
            DataChannel dataChannel4 = this.LJLIL;
            if (dataChannel4 != null) {
                lifecycleOwner = dataChannel4.LJLJJI;
            } else {
                lifecycleOwner = null;
            }
            dataChannel3.lv0(lifecycleOwner, LiveGiftSentSucceedEvent.class, new AqS179S0100000_13(this, 501));
            DataChannel dataChannel5 = this.LJLIL;
            if (dataChannel5 != null) {
                lifecycleOwner2 = dataChannel5.LJLJJI;
            }
            dataChannel3.lv0(lifecycleOwner2, BattleStateChannel.class, new AqS179S0100000_13(this, 502));
        }
    }

    public final void LIZJ(String str) {
        C73411SrX c73411SrX;
        if (this.LLIL) {
            return;
        }
        C73411SrX c73411SrX2 = this.LJLJJLL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLJJLL) != null) {
            c73411SrX.dispose();
        }
        this.LLIL = true;
        C0NB.LIZIZ("BattleTask", "Critical point startToDealPoint ");
        this.LJLJJLL = (C73411SrX) TMC.LJIL(0L, 100L, TimeUnit.MILLISECONDS).LJJLIIIJ(10L).LJJJLIIL(new AfS26S1100000_13(this, str, 8), new AfS65S0100000_13(this, 174));
    }

    public final void LIZLLL(long j) {
        long j2 = this.LJLLL;
        long j3 = j2 + 1;
        if (j <= this.LJLLILLLL && j3 <= j) {
            LIZIZ(j, U2O.TASK_NOTICE);
            return;
        }
        UD5 ud5 = this.LJZI;
        UD5 ud52 = UD5.DEFAULT;
        if (ud5 == ud52 && j == this.LLFFF + 1) {
            LIZJ("egg_task_complete");
            LIZIZ(j, U2O.TASK_IN_PROCESS);
            return;
        }
        if (ud5 == ud52 && j > this.LLFFF && j <= j2) {
            LIZIZ(j, U2O.TASK_IN_PROCESS);
            return;
        }
        UD5 ud53 = UD5.FAILED;
        if (ud5 == ud53) {
            long j4 = this.LJZL;
            if (j4 > 0) {
                long j5 = this.LLFFF;
                if (j5 > 0 && j < j2 && j >= j4 - 3 && j >= j5) {
                    LIZIZ(j, U2O.TASK_FAILED);
                    return;
                }
            }
        }
        if (ud5 == ud53) {
            long j6 = this.LJZL;
            if (j6 > 0) {
                long j7 = this.LLFFF;
                if (j7 > 0 && (j < j6 - 3 || j < j7)) {
                    LIZIZ(j, U2O.DISABLED);
                    return;
                }
            }
        }
        UD5 ud54 = UD5.SUCCEED;
        if ((ud5 == ud54 || ud5 == UD5.BOTH_SUCCEED) && j < j2 && j >= this.LLFFF) {
            LIZIZ(j, U2O.TASK_SUCCEED);
            return;
        }
        if (ud5 == ud54 || ud5 == UD5.BOTH_SUCCEED) {
            long j8 = this.LLFFF;
            if (j < j8 && j == (j8 - this.LLFII) + 1 && this.LJLL != U2O.BONUS_FINISHED) {
                LIZJ("egg_reward_complete");
                LIZIZ(j, U2O.BONUS_IN_PROCESS);
                return;
            }
        }
        if (ud5 == ud54 || ud5 == UD5.BOTH_SUCCEED) {
            long j9 = this.LLFFF;
            if (j <= j9 && j > j9 - this.LLFII) {
                LIZIZ(j, U2O.BONUS_IN_PROCESS);
                return;
            }
        }
        if (ud5 == ud54 || ud5 == UD5.BOTH_SUCCEED) {
            long j10 = this.LLFZ;
            if (j10 > 0) {
                long j11 = this.LLFFF;
                if (j11 > 0 && j11 > 0 && this.LLFII > 0 && j <= j10 - this.LLI) {
                    LIZIZ(j, U2O.DISABLED);
                    return;
                }
            }
        }
        long j12 = this.LLFZ;
        if (j12 > 0 && j <= j12 - this.LLI) {
            LIZIZ(j, U2O.DISABLED);
        } else {
            LIZIZ(j, this.LJLL);
        }
    }

    public final void LJI(BattlePrompt battlePrompt) {
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
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (c76385TyP = (C76385TyP) dataChannel.kv0(BattleLeftScoreChannel.class)) != null) {
            i = c76385TyP.LJLIL;
        } else {
            i = 0;
        }
        int i3 = i - this.LLIIIJ;
        if (i3 >= 0) {
            i2 = i3;
        }
        U27.LJIIJJI(this.LJLJLLL, String.valueOf(i2), str, this.LJLJI);
    }

    public final void LJIIIZ(BattleBonusStatus battleBonusStatus) {
        C76385TyP c76385TyP;
        UD5 ud5;
        int i;
        if (!EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        this.LJLJLJ = battleBonusStatus.userAssisted;
        int i2 = 0;
        switch (battleBonusStatus.bonusPeriod) {
            case 0:
                LIZIZ(this.LJLJLLL, U2O.DISABLED);
                return;
            case 1:
                this.LJZI = UD5.DEFAULT;
                if (this.LJLL.compareTo(U2O.TASK_NOTICE) > 0) {
                    return;
                }
                LIZLLL(this.LJLJLLL);
                return;
            case 2:
                this.LJZI = UD5.DEFAULT;
                if (this.LJLLLLLL == 1) {
                    long j = battleBonusStatus.taskProgress;
                    if (j >= this.LJZ) {
                        this.LJZ = j;
                        if (j < 0) {
                            U27.LJIIJ(this.LJLJLLL, this.LJLJI);
                        }
                    }
                }
                LIZIZ(this.LJLJLLL, U2O.TASK_IN_PROCESS);
                UD6 ud6 = this.LJLJJI;
                if (ud6 == null) {
                    return;
                }
                ud6.O0();
                return;
            case 3:
                ud5 = UD5.SUCCEED;
                break;
            case 4:
                ud5 = UD5.BOTH_SUCCEED;
                break;
            case 5:
                UD5 ud52 = this.LJZI;
                UD5 ud53 = UD5.FAILED;
                if (ud52 == ud53) {
                    return;
                }
                this.LJZI = ud53;
                if (this.LJZL <= 0) {
                    this.LJZL = this.LJLJLLL;
                }
                LIZLLL(this.LJLJLLL);
                if (!this.LJLJI || !LJFF() || this.LLIILZL || this.LLIIJLIL == 0) {
                    return;
                }
                C75832TpU.LIZ.LJIJ(this.LJLZ, this.LJZ, this.LLIILII, false);
                this.LLIILZL = true;
                return;
            case 6:
                this.LJZI = UD5.SUCCEED;
                long j2 = this.LJLZ;
                if (j2 > 0) {
                    this.LJZ = j2;
                }
                LIZIZ(this.LJLJLLL, U2O.BONUS_IN_PROCESS);
                DataChannel dataChannel = this.LJLIL;
                if (dataChannel != null && (c76385TyP = (C76385TyP) dataChannel.kv0(BattleLeftScoreChannel.class)) != null) {
                    i2 = c76385TyP.LJLIL;
                }
                this.LLIIIJ = i2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("currentScore = ");
                C1DD.LJFF(LIZ, this.LLIIIJ, LIZ, "BattleTask");
                return;
            case 7:
                this.LJZI = UD5.SUCCEED;
                this.LLIIIILZ = battleBonusStatus.rewardSettlePrompt;
                long j3 = this.LJLJLLL;
                if (j3 <= this.LLFFF - this.LLFII && this.LLFZ == 0) {
                    this.LLFZ = j3;
                }
                if (this.LJLL != U2O.DISABLED) {
                    LIZIZ(j3, U2O.BONUS_FINISHED);
                }
                this.LLIIIJ = 0;
                LJI(this.LLIIIILZ);
                return;
            default:
                return;
        }
        this.LJZI = ud5;
        U2O u2o = this.LJLL;
        U2O u2o2 = U2O.TASK_SUCCEED;
        if (u2o.compareTo(u2o2) > 0) {
            return;
        }
        boolean z = this.LJLJI;
        long j4 = this.LJLJLLL;
        if (battleBonusStatus.bonusPeriod == 4) {
            i = 1;
        } else {
            i = 0;
        }
        U27.LJIILL(i, j4, this.LJZ, this.LJLZ, z, false);
        if (this.LJLJI && LJFF() && !this.LLIILZL && this.LLIIJLIL != 0) {
            C75832TpU.LIZ.LJIJ(this.LJLZ, this.LJZ, this.LLIILII, true);
            this.LLIILZL = true;
        }
        this.LJZ = this.LJLZ;
        LIZIZ(this.LJLJLLL, u2o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BattleBonusConfig battleBonusConfig;
        BattleTaskUpdate battleTaskUpdate;
        boolean z;
        U2O u2o;
        long j;
        long j2;
        if (iMessage == 0 || this.LJLJJI == null || this.LJLJL == null || !EnableBattleEggSetting.INSTANCE.getValue()) {
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
                C0NB.LJIIIZ("BattleTaskPresenterTag", "onMessage, return message is old");
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
                        UD5 ud5 = this.LJZI;
                        UD5 ud52 = UD5.SUCCEED;
                        if (ud5 != ud52 && ud5 != UD5.BOTH_SUCCEED) {
                            this.LJZI = ud52;
                        }
                        BattleRewardSettle battleRewardSettle = linkMicBattleTaskMessage.rewardSettle;
                        if (battleRewardSettle != null) {
                            this.LLIIIZ.removeCallbacksAndMessages(null);
                            this.LLIIIILZ = battleRewardSettle.rewardSettlePrompt;
                            long j4 = this.LJLJLLL;
                            long j5 = this.LLFFF - this.LLFII;
                            if (j4 <= j5) {
                                if (this.LLFZ == 0) {
                                    this.LLFZ = j4;
                                }
                                U2O u2o2 = this.LJLL;
                                if (u2o2 != U2O.DISABLED && u2o2 != (u2o = U2O.BONUS_FINISHED)) {
                                    LIZIZ(j4, u2o);
                                }
                            } else {
                                this.LLIIIZ.postDelayed(new ARunnableS49S0100000_13(this, 184), j4 - j5);
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("im_message_eggtask_reward_settle, left_time = ");
                            C65232Piu.LIZLLL(LIZ, this.LJLJLLL, " , message = ", json);
                            C0NB.LJIIIZ("BattleTaskPresenterTag", X1D.LIZIZ(LIZ));
                        }
                        LJI(this.LLIIIILZ);
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
                                if (this.LJZI == UD5.FAILED) {
                                    return;
                                }
                                this.LJZI = UD5.BOTH_SUCCEED;
                                U27.LJIILL(1, this.LJLJLLL, this.LJZ, this.LJLZ, this.LJLJI, true);
                                this.LJZ = this.LJLZ;
                                long j6 = battleTaskSettle.rewardStartTime;
                                if (j6 > 0) {
                                    this.LLFFF = j6;
                                }
                                LIZIZ(this.LJLJLLL, U2O.TASK_SUCCEED);
                            }
                        } else {
                            UD5 ud53 = this.LJZI;
                            if (ud53 == UD5.SUCCEED || ud53 == UD5.BOTH_SUCCEED) {
                                return;
                            }
                            long j7 = this.LJLJLLL;
                            this.LJZL = j7;
                            this.LJZI = UD5.FAILED;
                            LIZIZ(j7, U2O.TASK_FAILED);
                            if (this.LJLJI && LJFF() && !this.LLIILZL && this.LLIIJLIL != 0) {
                                C75832TpU.LIZ.LJIJ(this.LJLZ, this.LJZ, this.LLIILII, false);
                                this.LLIILZL = true;
                            }
                        }
                    } else {
                        if (this.LJZI == UD5.FAILED) {
                            return;
                        }
                        this.LJZI = UD5.SUCCEED;
                        U27.LJIILL(0, this.LJLJLLL, this.LJZ, this.LJLZ, this.LJLJI, true);
                        if (this.LJLJI && LJFF() && !this.LLIILZL && this.LLIIJLIL != 0) {
                            C75832TpU.LIZ.LJIJ(this.LJLZ, this.LJZ, this.LLIILII, true);
                            this.LLIILZL = true;
                        }
                        this.LJZ = this.LJLZ;
                        long j8 = battleTaskSettle.rewardStartTime;
                        if (j8 > 0) {
                            this.LLFFF = j8;
                        }
                        LIZIZ(this.LJLJLLL, U2O.TASK_SUCCEED);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("im_message_eggtask_task_settle, left_time = ");
                    C65232Piu.LIZLLL(LIZ2, this.LJLJLLL, " , message = ", json);
                    C0NB.LJIIIZ("BattleTaskPresenterTag", X1D.LIZIZ(LIZ2));
                    if (!(!((ArrayList) this.LLIIIL).isEmpty()) || (z = this.LJLJI)) {
                        return;
                    }
                    U27.LJIIIZ(this.LJLJLLL, QZP.LIZIZ("\\s", ORZ.LLD(this.LLIIIL, ",", null, null, null, 62), ""), z);
                    ((ArrayList) this.LLIIIL).clear();
                    return;
                }
                if (this.LJZI != UD5.DEFAULT || (battleTaskUpdate = linkMicBattleTaskMessage.taskUpdate) == null) {
                    return;
                }
                long j9 = this.LJZ;
                long j10 = battleTaskUpdate.taskProgress;
                if (j9 < j10) {
                    this.LJZ = j10;
                }
                long j11 = this.LJLZ;
                if (j11 > 0 && j10 == j11) {
                    LIZJ("egg_task_countdown");
                }
                LIZIZ(this.LJLJLLL, U2O.TASK_IN_PROCESS);
                UD6 ud6 = this.LJLJJI;
                if (ud6 != null) {
                    ud6.O0();
                }
                String str = battleTaskUpdate.logId;
                if (str != null && str.length() != 0) {
                    if (ORZ.LJLJJI(battleTaskUpdate.logId, this.LLIIIL)) {
                        C65777Prh.LIZ(this.LLIIIL).remove(battleTaskUpdate.logId);
                    }
                }
                if (battleTaskUpdate.taskProgress < 0) {
                    U27.LJIIJ(this.LJLJLLL, this.LJLJI);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("im_message_eggtask_update, left_time = ");
                C65232Piu.LIZLLL(LIZ3, this.LJLJLLL, " , message = ", json);
                C0NB.LJIIIZ("BattleTaskPresenterTag", X1D.LIZIZ(LIZ3));
                return;
            }
            this.LJZI = UD5.DEFAULT;
            BattleTaskStart battleTaskStart = linkMicBattleTaskMessage.taskStart;
            if (battleTaskStart != null && (battleBonusConfig = battleTaskStart.battleBonusConfig) != null) {
                LJ(battleBonusConfig, "message");
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("im_message_eggtask_init, left_time = ");
            C65232Piu.LIZLLL(LIZ4, this.LJLJLLL, " , message = ", json);
            C0NB.LJIIIZ("BattleTaskPresenterTag", X1D.LIZIZ(LIZ4));
        }
    }

    public final void LIZIZ(long j, U2O u2o) {
        if (!this.LJLILLLLZI || j == -1) {
            return;
        }
        U2O u2o2 = this.LJLL;
        if (u2o2 != u2o) {
            if (u2o2.compareTo(u2o) < 0 || u2o == U2O.DISABLED) {
                this.LJLL = u2o;
                StringBuilder LIZJ = V10.LIZJ("compareState==>> timeStamp = ", j, " currentSTate = ");
                LIZJ.append(this.LJLL);
                C0NB.LIZIZ("BattleTask", X1D.LIZIZ(LIZJ));
                UD6 ud6 = this.LJLJJI;
                if (ud6 != null) {
                    ud6.n0(j, this.LJLL);
                }
                DataChannel dataChannel = this.LJLIL;
                if (dataChannel != null) {
                    dataChannel.rv0(BattleBonusTaskStateChannel.class, this.LJLL);
                }
            }
        } else if ((u2o2 == U2O.BONUS_IN_PROCESS || u2o2 == U2O.TASK_IN_PROCESS) && u2o2 != U2O.DISABLED) {
            UD6 ud62 = this.LJLJJI;
            if (ud62 != null) {
                ud62.n0(j, u2o2);
            }
            DataChannel dataChannel2 = this.LJLIL;
            if (dataChannel2 != null) {
                dataChannel2.rv0(BattleBonusTaskStateChannel.class, this.LJLL);
            }
        }
        if (this.LJLL.compareTo(U2O.TASK_IN_PROCESS) > 0) {
            C76265TwT.LIZ.LJJJZ = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76819UCx.LJ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig, java.lang.String):void");
    }
}
