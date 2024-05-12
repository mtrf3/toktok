package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import android.text.Spannable;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatNoticeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog;
import com.bytedance.android.livesdk.wishlistv2.network.IStreamGoalApi;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BpA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29948BpA implements OnMessageListener {
    public final GiftWidget LJLIL;
    public final DataChannel LJLILLLLZI;
    public final FragmentManager LJLJI;
    public final C73318Sq2 LJLJJI;
    public final IMessageManager LJLJJL;
    public final LiveStreamGoalMessageDialog LJLJJLL;
    public final HashMap<String, Double> LJLJL;
    public final ArrayList<C29946Bp8> LJLJLJ;
    public boolean LJLJLLL;
    public final HashSet<Integer> LJLL;

    public final boolean LIZ() {
        if (!C29306Beo.LJIIJ(this.LJLILLLLZI) ? LIZLLL() || LIZJ() : LIZLLL() || LIZJ()) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        LiveMode liveMode;
        Room room;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.LIVE_STUDIO || C29137Bc5.LIZJ(liveMode)) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        LiveMode liveMode;
        Room room;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        return C29137Bc5.LJ(liveMode);
    }

    public final void LJFF() {
        long j;
        Long l;
        if (!LIZ() || this.LJLL.contains(100)) {
            return;
        }
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lqy);
        if (LJIILJJIL == null) {
            LJIILJJIL = "";
        }
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        RoomMessage LJIJ = C31309CQn.LJIJ(j, LJIILJJIL);
        StringBuffer stringBuffer = new StringBuffer("101");
        stringBuffer.append(C30725C4b.LIZ());
        stringBuffer.append(new Random(C30725C4b.LIZ()).nextInt(100));
        if (!GameFloatNoticeSetting.INSTANCE.isExperimentGroup()) {
            LJIJ.baseMessage.describe = "LiveGoal";
        }
        CommonMessageData commonMessageData = LJIJ.baseMessage;
        if (commonMessageData != null) {
            String stringBuffer2 = stringBuffer.toString();
            o.LJIIIIZZ(stringBuffer2, "messageIdBuilder.toString()");
            commonMessageData.messageId = CastLongProtector.parseLong(stringBuffer2);
        }
        IMessageManager iMessageManager = this.LJLJJL;
        if (iMessageManager != null) {
            iMessageManager.insertMessage(LJIJ);
        }
        this.LJLL.add(100);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.Long r25) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29948BpA.LJ(java.lang.Long):void");
    }

    public final void LJI(int i) {
        long j;
        Long l;
        if (!LIZ() || this.LJLL.contains(Integer.valueOf(i))) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        String LJIILL = C15380j0.LJIILL(R.string.lqo, X1D.LIZIZ(LIZ));
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(BCN.class)) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        RoomMessage LJIJ = C31309CQn.LJIJ(j, LJIILL);
        StringBuffer stringBuffer = new StringBuffer("101");
        stringBuffer.append(C30725C4b.LIZ());
        stringBuffer.append(new Random(C30725C4b.LIZ()).nextInt(100));
        if (!GameFloatNoticeSetting.INSTANCE.isExperimentGroup()) {
            LJIJ.baseMessage.describe = "LiveGoal";
        }
        CommonMessageData commonMessageData = LJIJ.baseMessage;
        if (commonMessageData != null) {
            String stringBuffer2 = stringBuffer.toString();
            o.LJIIIIZZ(stringBuffer2, "messageIdBuilder.toString()");
            commonMessageData.messageId = CastLongProtector.parseLong(stringBuffer2);
        }
        IMessageManager iMessageManager = this.LJLJJL;
        if (iMessageManager != null) {
            iMessageManager.insertMessage(LJIJ);
        }
        this.LJLL.add(Integer.valueOf(i));
    }

    public final void LJII(Long l) {
        LiveStreamGoalMessageDialog liveStreamGoalMessageDialog = this.LJLJJLL;
        ArrayList<C29946Bp8> models = this.LJLJLJ;
        InterfaceC05190Ih currentUser = B83.LIZ().LIZIZ().getCurrentUser();
        liveStreamGoalMessageDialog.getClass();
        o.LJIIIZ(models, "models");
        liveStreamGoalMessageDialog.LJLIL.clear();
        liveStreamGoalMessageDialog.LJLIL.addAll(models);
        liveStreamGoalMessageDialog.LJLILLLLZI = currentUser;
        liveStreamGoalMessageDialog.LJLJJI = l;
        FragmentManager fragmentManager = this.LJLJI;
        if (fragmentManager != null) {
            this.LJLJJLL.show(fragmentManager, "LiveStreamGoalMessageDialog");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        List<LiveStreamSubGoal> list;
        LiveStreamSubGoal liveStreamSubGoal;
        LiveStreamSubGoal liveStreamSubGoal2;
        Long l;
        double d;
        boolean z;
        long j;
        long j2;
        Long l2;
        Text text;
        long j3;
        Long l3;
        if (iMessage instanceof LiveStreamGoalServerMessage) {
            LiveStreamGoalServerMessage liveStreamGoalServerMessage = (LiveStreamGoalServerMessage) iMessage;
            CommonMessageData commonMessageData = liveStreamGoalServerMessage.baseMessage;
            String str = "";
            if (commonMessageData != null && (text = commonMessageData.displayText) != null) {
                Spannable content = CXJ.LJFF(text, "");
                o.LJIIIIZZ(content, "content");
                if (LIZ()) {
                    DataChannel dataChannel = this.LJLILLLLZI;
                    if (dataChannel != null && (l3 = (Long) dataChannel.kv0(BCN.class)) != null) {
                        j3 = l3.longValue();
                    } else {
                        j3 = 0;
                    }
                    RoomMessage LJIJ = C31309CQn.LJIJ(j3, content.toString());
                    StringBuffer stringBuffer = new StringBuffer("101");
                    stringBuffer.append(C30725C4b.LIZ());
                    stringBuffer.append(new Random(C30725C4b.LIZ()).nextInt(100));
                    CommonMessageData commonMessageData2 = LJIJ.baseMessage;
                    if (commonMessageData2 != null) {
                        String stringBuffer2 = stringBuffer.toString();
                        o.LJIIIIZZ(stringBuffer2, "messageIdBuilder.toString()");
                        commonMessageData2.messageId = CastLongProtector.parseLong(stringBuffer2);
                    }
                    LJIJ.baseMessage.describe = "LiveGoal";
                    IMessageManager iMessageManager = this.LJLJJL;
                    if (iMessageManager != null) {
                        iMessageManager.insertMessage(LJIJ);
                    }
                }
            } else {
                C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(new JSONObject(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, liveStreamGoalServerMessage))), "live_stream_goal_indicator_message"));
            }
            LiveStreamGoal liveStreamGoal = liveStreamGoalServerMessage.goal;
            if (liveStreamGoal != null && liveStreamGoal.type == 1 && (liveStreamSubGoal2 = liveStreamGoalServerMessage.contributeSubgoal) != null && liveStreamSubGoal2.target > 0) {
                o.LJII(liveStreamSubGoal2, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal");
                StringBuilder LIZ = X1D.LIZ();
                LiveStreamGoal liveStreamGoal2 = liveStreamGoalServerMessage.goal;
                Long l4 = null;
                if (liveStreamGoal2 != null) {
                    l = Long.valueOf(liveStreamGoal2.id);
                } else {
                    l = null;
                }
                LIZ.append(l);
                LIZ.append(liveStreamSubGoal2.id);
                String LIZIZ = X1D.LIZIZ(LIZ);
                Double d2 = this.LJLJL.get(LIZIZ);
                double d3 = liveStreamSubGoal2.progress / liveStreamSubGoal2.target;
                this.LJLJL.put(LIZIZ, Double.valueOf(d3));
                if (d2 != null) {
                    d = d2.doubleValue();
                } else {
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                if (liveStreamSubGoal2.target == liveStreamSubGoal2.progress) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && d < 0.999d) {
                    if (C29306Beo.LJIIJ(this.LJLILLLLZI)) {
                        if (LIZLLL()) {
                            LiveStreamGoal liveStreamGoal3 = liveStreamGoalServerMessage.goal;
                            if (liveStreamGoal3 != null) {
                                l4 = Long.valueOf(liveStreamGoal3.id);
                            }
                            LJ(l4);
                        } else {
                            LJFF();
                        }
                    } else if (LIZLLL() || (LIZJ() && this.LJLJLLL)) {
                        LiveStreamGoal liveStreamGoal4 = liveStreamGoalServerMessage.goal;
                        if (liveStreamGoal4 != null) {
                            l4 = Long.valueOf(liveStreamGoal4.id);
                        }
                        LJ(l4);
                    } else {
                        LJFF();
                    }
                } else if (d < 0.7999d && d3 >= 0.7999d) {
                    if (C29306Beo.LJIIJ(this.LJLILLLLZI) && LIZLLL()) {
                        C73318Sq2 c73318Sq2 = this.LJLJJI;
                        IStreamGoalApi iStreamGoalApi = (IStreamGoalApi) Q7L.LIZIZ(IStreamGoalApi.class);
                        String LIZJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZJ(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                        if (LIZJ != null) {
                            str = LIZJ;
                        }
                        DataChannel dataChannel2 = this.LJLILLLLZI;
                        if (dataChannel2 != null && (l2 = (Long) dataChannel2.kv0(BCN.class)) != null) {
                            j = l2.longValue();
                        } else {
                            j = 0;
                        }
                        LiveStreamGoal liveStreamGoal5 = liveStreamGoalServerMessage.goal;
                        if (liveStreamGoal5 != null) {
                            j2 = liveStreamGoal5.id;
                        } else {
                            j2 = 0;
                        }
                        c73318Sq2.LIZ(iStreamGoalApi.getContributors(str, j, 0L, 1, 10L, j2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(this, iMessage, 45), new AfS57S0100000_5(this, 232)));
                    } else {
                        LJI(80);
                    }
                } else if (d < 0.4999d && d3 >= 0.4999d) {
                    LJI(50);
                }
            }
            if (LiveGiftGoalBannerEnabledSetting.INSTANCE.getValue()) {
                LiveStreamGoal liveStreamGoal6 = liveStreamGoalServerMessage.goal;
                if (liveStreamGoal6 != null && (list = liveStreamGoal6.subGoals) != null && (liveStreamSubGoal = (LiveStreamSubGoal) ORZ.LJLLLL(list)) != null) {
                    C32502CpG.LIZJ(liveStreamSubGoal.id, liveStreamSubGoal.progress, liveStreamSubGoal.target);
                }
                LiveStreamGoal liveStreamGoal7 = liveStreamGoalServerMessage.goal;
                if (liveStreamGoal7 != null && liveStreamGoal7.status == BII.DELETED.getCode()) {
                    C32502CpG.LIZ();
                }
            }
        }
    }

    public C29948BpA(GiftWidget giftWidget, DataChannel dataChannel, FragmentManager fragmentManager) {
        IMessageManager iMessageManager;
        o.LJIIIZ(giftWidget, "giftWidget");
        this.LJLIL = giftWidget;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = fragmentManager;
        this.LJLJJI = new C73318Sq2();
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        } else {
            iMessageManager = null;
        }
        this.LJLJJL = iMessageManager;
        this.LJLJJLL = new LiveStreamGoalMessageDialog();
        this.LJLJL = new HashMap<>();
        this.LJLJLJ = new ArrayList<>();
        this.LJLJLLL = true;
        this.LJLL = new HashSet<>();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.STREAM_GOAL_SERVER_MESSAGE.getIntType(), this);
        }
        if (dataChannel != null) {
            dataChannel.ov0(giftWidget, VideoOrientationChangeChannel.class, new AqS171S0100000_5(this, 655));
        }
    }

    public final CapsuleMessage LIZIZ(String str, String str2, String str3, String str4, String str5) {
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        capsuleMessage.isLocalInsertMsg = true;
        capsuleMessage.capsuleType = 2;
        capsuleMessage.schema = null;
        Text text = new Text();
        text.key = null;
        text.defaultPattern = str2;
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.key = null;
        text2.defaultPattern = str4;
        capsuleMessage.buttonText = text2;
        return capsuleMessage;
    }
}
