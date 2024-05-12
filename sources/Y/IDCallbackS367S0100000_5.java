package Y;

import X.AbstractC31385CTl;
import X.BTJ;
import X.C1EW;
import X.C61762OLu;
import X.C73969T1h;
import X.CL0;
import X.CVJ;
import X.CZR;
import X.EnumC29589BjN;
import X.InterfaceC29986Bpm;
import X.OSZ;
import X.Q7L;
import X.T16;
import X.T28;
import X.V0Q;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.model.message.FollowCardMessage;
import com.bytedance.android.livesdk.programmedlive.api.ProgrammedLiveApi;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveTitleWidget;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCallbackS367S0100000_5 implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            case 2:
                return handleMessage$2(this, message);
            case 3:
                return handleMessage$3(this, message);
            case 4:
                return handleMessage$4(this, message);
            case 5:
                return handleMessage$5(this, message);
            case 6:
                return handleMessage$6(this, message);
            case 7:
                return handleMessage$7(this, message);
            case 8:
                return handleMessage$8(this, message);
            default:
                return false;
        }
    }

    public IDCallbackS367S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == 1) {
            ((StarCommentViewModel) iDCallbackS367S0100000_5.l0).gv0();
        } else if (i == 2) {
            ((StarCommentViewModel) iDCallbackS367S0100000_5.l0).LJLILLLLZI.getValue();
            ((StarCommentViewModel) iDCallbackS367S0100000_5.l0).reset();
        }
        return true;
    }

    public static final boolean handleMessage$1(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            ((StarCommentPaymentDialog) iDCallbackS367S0100000_5.l0).Gl(false);
        }
        return true;
    }

    public static final boolean handleMessage$2(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message message) {
        if (message.what != 1) {
            return false;
        }
        LikeHelper likeHelper = (LikeHelper) iDCallbackS367S0100000_5.l0;
        likeHelper.LJLLJ = false;
        int i = likeHelper.LJLJL;
        Iterator it = ((ArrayList) likeHelper.LLILLIZIL).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view != null) {
                view.setVisibility(8);
            }
        }
        Iterator it2 = ((ArrayList) likeHelper.LJLJJL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC29986Bpm) it2.next()).t3(likeHelper, i);
        }
        return true;
    }

    public static final boolean handleMessage$3(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message msg) {
        long j;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((ProgrammedLiveFollowCardWidget) iDCallbackS367S0100000_5.l0).LJZI(EnumC29589BjN.OTHERS, true);
                    }
                } else {
                    ((ProgrammedLiveFollowCardWidget) iDCallbackS367S0100000_5.l0).LJZI(EnumC29589BjN.AUTO, true);
                }
            } else {
                ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = (ProgrammedLiveFollowCardWidget) iDCallbackS367S0100000_5.l0;
                OSZ<FollowCardMessage, Boolean> osz = programmedLiveFollowCardWidget.LJLLI;
                if (osz != null && !osz.getSecond().booleanValue()) {
                    Handler LJZL = programmedLiveFollowCardWidget.LJZL();
                    Message message = new Message();
                    message.what = 0;
                    message.obj = osz.getFirst();
                    Long l = osz.getFirst().maxRandom;
                    if (l != null) {
                        j = V0Q.Default.nextLong(l.longValue());
                    } else {
                        j = 0;
                    }
                    LJZL.sendMessageDelayed(message, j);
                }
            }
        } else {
            Object obj = msg.obj;
            if (obj instanceof FollowCardMessage) {
                ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget2 = (ProgrammedLiveFollowCardWidget) iDCallbackS367S0100000_5.l0;
                o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.FollowCardMessage");
                FollowCardMessage followCardMessage = (FollowCardMessage) obj;
                Room room = programmedLiveFollowCardWidget2.LJLL;
                if (room != null) {
                    C1EW.LIZ(((ProgrammedLiveApi) Q7L.LIZIZ(ProgrammedLiveApi.class)).getFollowCard(room.getId())).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0200000_5(followCardMessage, programmedLiveFollowCardWidget2, 44), new AfS57S0100000_5(programmedLiveFollowCardWidget2, 229));
                }
                ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget3 = (ProgrammedLiveFollowCardWidget) iDCallbackS367S0100000_5.l0;
                Object obj2 = msg.obj;
                o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.FollowCardMessage");
                programmedLiveFollowCardWidget3.LJLLI = new OSZ<>(obj2, Boolean.TRUE);
            }
        }
        return true;
    }

    public static final boolean handleMessage$4(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message it) {
        o.LJIIIZ(it, "it");
        int i = it.what;
        if (i != 0) {
            if (i == 1) {
                CL0 cl0 = ((ProgrammedLiveTitleWidget) iDCallbackS367S0100000_5.l0).LJLILLLLZI;
                if (cl0 != null) {
                    cl0.setSingleLine(false);
                    cl0.setMaxLines(2);
                    cl0.setEllipsize(TextUtils.TruncateAt.END);
                }
                LiveIconView liveIconView = ((ProgrammedLiveTitleWidget) iDCallbackS367S0100000_5.l0).LJLJI;
                if (liveIconView != null) {
                    liveIconView.setIcon(R.drawable.d_6);
                }
            }
        } else {
            CL0 cl02 = ((ProgrammedLiveTitleWidget) iDCallbackS367S0100000_5.l0).LJLILLLLZI;
            if (cl02 != null) {
                cl02.LJJIJLIJ();
            }
        }
        return true;
    }

    public static final boolean handleMessage$5(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message msg) {
        FansClubViewModel fansClubViewModel;
        DataChannel dataChannel;
        Room room;
        User owner;
        String secUid;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1 && (dataChannel = (fansClubViewModel = (FansClubViewModel) iDCallbackS367S0100000_5.l0).getDataChannel()) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            T28.LIZLLL(((FansClubApi) Q7L.LIZIZ(FansClubApi.class)).getTaskInfo(secUid)).LJJII(new AfS1S0200100_5(currentTimeMillis, fansClubViewModel, room, 19), new AfS4S0100100_5(currentTimeMillis, room, 20));
        }
        return true;
    }

    public static final boolean handleMessage$6(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message it) {
        o.LJIIIZ(it, "it");
        AbstractC31385CTl abstractC31385CTl = (AbstractC31385CTl) iDCallbackS367S0100000_5.l0;
        abstractC31385CTl.getClass();
        if (it.what == 1) {
            abstractC31385CTl.LJJIJL();
            abstractC31385CTl.LIZIZ.sendEmptyMessageDelayed(1, abstractC31385CTl.LJJIJIL);
            return true;
        }
        return false;
    }

    public static final boolean handleMessage$7(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message msg) {
        User owner;
        String secUid;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            CZR czr = (CZR) iDCallbackS367S0100000_5.l0;
            if (czr.LJLLLLLL != 0) {
                czr.LJLLLL.removeMessages(1);
                if (czr.LJLIL.isAdded()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    CVJ.LIZ++;
                    CVJ.LJ = SystemClock.elapsedRealtime();
                    StarCommentApi starCommentApi = (StarCommentApi) Q7L.LIZIZ(StarCommentApi.class);
                    Room room = czr.LJLJJL;
                    String str = null;
                    if (room != null) {
                        str = room.getIdStr();
                    }
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    Room room2 = czr.LJLJJL;
                    if (room2 != null && (owner = room2.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                        str2 = secUid;
                    }
                    C1EW.LIZ(starCommentApi.getStarCommentQueue(str, str2, czr.LJLLLLLL, czr.LJLJL, czr.LJLJLJ, "")).LJII(BTJ.LIZIZ(czr.LJLIL)).LJJLIIIJJI(5L, TimeUnit.SECONDS).LJJJLIIL(new AfS4S0100100_5(elapsedRealtime, czr, 13), new AfS4S0100100_5(elapsedRealtime, czr, 14));
                }
            }
        }
        return true;
    }

    public static final boolean handleMessage$8(IDCallbackS367S0100000_5 iDCallbackS367S0100000_5, Message it) {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        o.LJIIIZ(it, "it");
        IFrameSlot.SlotViewModel slotViewModel2 = ((C61762OLu) iDCallbackS367S0100000_5.l0).LJLJJI;
        if (slotViewModel2 == null || (mutableLiveData = slotViewModel2.LJLIL) == null || (value = mutableLiveData.getValue()) == null || !o.LJ(value.first, Boolean.TRUE) || (slotViewModel = ((C61762OLu) iDCallbackS367S0100000_5.l0).LJLJJI) == null || (mutableLiveData2 = slotViewModel.LJLIL) == null) {
            return true;
        }
        mutableLiveData2.setValue(new Pair<>(Boolean.FALSE, "business_links"));
        return true;
    }
}
