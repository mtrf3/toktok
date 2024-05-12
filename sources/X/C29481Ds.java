package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.api.TipMessageChannel;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoalGift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29481Ds implements C0EA<LiveStreamGoalServerMessage> {
    public DataChannel LIZIZ;
    public final C73318Sq2 LIZ = new C73318Sq2();
    public final C1DF LIZJ = new C1DF();

    @Override // X.C0EA
    public final int LIZ() {
        return EnumC31509CYf.STREAM_GOAL_SERVER_MESSAGE.getIntType();
    }

    @Override // X.C0EA
    public final void onRelease() {
        this.LIZ.dispose();
    }

    public C29481Ds() {
        C221108m2.LIZIZ(C46171rZ.LJLIL);
    }

    @Override // X.C0EA
    public final void LIZIZ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZIZ = dataChannel;
    }

    public final void LIZJ(int i) {
        String str;
        if (i == 80) {
            str = "sub_goal_80%";
        } else {
            str = "sub_goal_50%";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        String boldStr = C15380j0.LJIILL(R.string.mv3, X1D.LIZIZ(LIZ));
        String contentStr = C15380j0.LJIILL(R.string.mwx, boldStr);
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            o.LJIIIIZZ(contentStr, "contentStr");
            o.LJIIIIZZ(boldStr, "boldStr");
            dataChannel.rv0(TipMessageChannel.class, new CWR(C0E7.LIZ(contentStr, boldStr), true, EnumC264412a.LIVE_TIP_GAMING_SUB_GOAL.ordinal(), null, new C31977Cgn(str, null, null, 6), 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0EA
    public final void onMessage(IMessage message) {
        boolean z;
        LiveStreamSubGoal liveStreamSubGoal;
        List<LiveStreamSubGoal> list;
        LiveStreamSubGoal liveStreamSubGoal2;
        LiveStreamSubGoalGift liveStreamSubGoalGift;
        List<LiveStreamSubGoal> list2;
        LiveStreamSubGoal liveStreamSubGoal3;
        o.LJIIIZ(message, "message");
        if (message instanceof LiveStreamGoalServerMessage) {
            LiveStreamGoalServerMessage liveStreamGoalServerMessage = (LiveStreamGoalServerMessage) message;
            LiveStreamGoal liveStreamGoal = liveStreamGoalServerMessage.goal;
            boolean z2 = true;
            if (liveStreamGoal != null) {
                if (liveStreamGoal.type == 2) {
                    z = true;
                } else {
                    z = false;
                }
                T t = 0;
                t = 0;
                t = 0;
                t = 0;
                if (z) {
                    if (liveStreamGoal != null && (list2 = liveStreamGoal.subGoals) != null && (liveStreamSubGoal3 = (LiveStreamSubGoal) ORZ.LJLLLLLL(0, list2)) != null) {
                        long j = liveStreamSubGoal3.target;
                        if (j <= 0) {
                            return;
                        }
                        if (liveStreamSubGoal3.progress != j) {
                            z2 = false;
                        }
                        final long ceil = (long) Math.ceil(j * 0.8d);
                        final long ceil2 = (long) Math.ceil(liveStreamSubGoal3.target * 0.5d);
                        final boolean z3 = z2;
                        this.LIZ.LIZ(AbstractC73672Svk.LJJIJIL(Long.valueOf(liveStreamSubGoal3.progress)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1Do
                            @Override // X.InterfaceC64592gB
                            public final void accept(Object obj) {
                                Long l = (Long) obj;
                                if (z3) {
                                    C29481Ds c29481Ds = this;
                                    c29481Ds.getClass();
                                    String boldStr = C15380j0.LJIILJJIL(R.string.mv4);
                                    String contentStr = C15380j0.LJIILL(R.string.mwy, boldStr);
                                    DataChannel dataChannel = c29481Ds.LIZIZ;
                                    if (dataChannel != null) {
                                        o.LJIIIIZZ(contentStr, "contentStr");
                                        o.LJIIIIZZ(boldStr, "boldStr");
                                        dataChannel.rv0(TipMessageChannel.class, new CWR(C0E7.LIZ(contentStr, boldStr), true, EnumC264412a.LIVE_TIP_GAMING_SUB_GOAL.ordinal(), null, new C31977Cgn("sub_goal_completed", null, -15686971, 2), 8));
                                        return;
                                    }
                                    return;
                                }
                                long j2 = ceil;
                                if (l == null || l.longValue() != j2) {
                                    long j3 = ceil2;
                                    if (l == null || l.longValue() != j3) {
                                        return;
                                    }
                                    this.LIZJ(50);
                                    return;
                                }
                                this.LIZJ(80);
                            }
                        }, new InterfaceC64592gB() { // from class: X.1Dp
                            @Override // X.InterfaceC64592gB
                            public final void accept(Object obj) {
                                C0NB.LJ("GameSubGoalNotice", android.util.Log.getStackTraceString((Throwable) obj));
                            }
                        }));
                        return;
                    }
                    return;
                }
                if (liveStreamGoal != null && liveStreamGoal.type == 1 && (liveStreamSubGoal = liveStreamGoalServerMessage.contributeSubgoal) != null) {
                    long j2 = liveStreamSubGoal.target;
                    if (j2 <= 0) {
                        return;
                    }
                    if (liveStreamSubGoal.progress != j2) {
                        z2 = false;
                    }
                    final C68322mC c68322mC = new C68322mC();
                    LiveStreamGoal liveStreamGoal2 = liveStreamGoalServerMessage.goal;
                    if (liveStreamGoal2 != null && (list = liveStreamGoal2.subGoals) != null && (liveStreamSubGoal2 = (LiveStreamSubGoal) ORZ.LJLLLLLL(0, list)) != null && (liveStreamSubGoalGift = liveStreamSubGoal2.gift) != null) {
                        t = liveStreamSubGoalGift.icon;
                    }
                    c68322mC.element = t;
                    final long ceil3 = (long) Math.ceil(liveStreamSubGoal.target * 0.8d);
                    final long ceil4 = (long) Math.ceil(liveStreamSubGoal.target * 0.5d);
                    final boolean z4 = z2;
                    this.LIZ.LIZ(AbstractC73672Svk.LJJIJIL(Long.valueOf(liveStreamSubGoal.progress)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1Dq
                        @Override // X.InterfaceC64592gB
                        public final void accept(Object obj) {
                            Long l = (Long) obj;
                            if (z4) {
                                C29481Ds c29481Ds = this;
                                C1DF c1df = c29481Ds.LIZJ;
                                DataChannel dataChannel = c29481Ds.LIZIZ;
                                ImageModel imageModel = c68322mC.element;
                                c1df.getClass();
                                String boldStr = C15380j0.LJIILJJIL(R.string.mv1);
                                String totalStr = C15380j0.LJIILL(R.string.muz, boldStr);
                                if (dataChannel != null) {
                                    o.LJIIIIZZ(totalStr, "totalStr");
                                    o.LJIIIIZZ(boldStr, "boldStr");
                                    dataChannel.rv0(TipMessageChannel.class, new CWR(C0E7.LIZ(totalStr, boldStr), true, EnumC264412a.LIVE_TIP_GAMING_LIVE_GOAL.ordinal(), null, new C31977Cgn("live_goal_completed", imageModel, -15686971), 8));
                                    return;
                                }
                                return;
                            }
                            long j3 = ceil3;
                            if (l == null || l.longValue() != j3) {
                                long j4 = ceil4;
                                if (l == null || l.longValue() != j4) {
                                    return;
                                }
                                C29481Ds c29481Ds2 = this;
                                C1DF c1df2 = c29481Ds2.LIZJ;
                                DataChannel dataChannel2 = c29481Ds2.LIZIZ;
                                ImageModel imageModel2 = c68322mC.element;
                                c1df2.getClass();
                                C1DF.LJJIJIIJIL(dataChannel2, 50, imageModel2);
                                return;
                            }
                            C29481Ds c29481Ds3 = this;
                            C1DF c1df3 = c29481Ds3.LIZJ;
                            DataChannel dataChannel3 = c29481Ds3.LIZIZ;
                            ImageModel imageModel3 = c68322mC.element;
                            c1df3.getClass();
                            C1DF.LJJIJIIJIL(dataChannel3, 80, imageModel3);
                        }
                    }, new InterfaceC64592gB() { // from class: X.1Dr
                        @Override // X.InterfaceC64592gB
                        public final void accept(Object obj) {
                            C0NB.LJ("GameSubGoalNotice", android.util.Log.getStackTraceString((Throwable) obj));
                        }
                    }));
                }
            }
        }
    }
}
