package Y;

import X.B3P;
import X.B4J;
import X.B57;
import X.B5E;
import X.BNB;
import X.C08680Vs;
import X.C0K2;
import X.C0NB;
import X.C19700py;
import X.C28467BFf;
import X.C29042BaY;
import X.C29401Dk;
import X.C30868C9o;
import X.C32537Cpp;
import X.C36582EXi;
import X.C36922EeM;
import X.C73943T0h;
import X.C76271TwZ;
import X.CN1;
import X.EnumC28203B5b;
import X.InterfaceC64592gB;
import X.RunnableC23230vf;
import X.X1D;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.init.SDKServiceInitTask;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.Live;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS17S0001000_5 implements InterfaceC64592gB {
    public final int $t;
    public int i0;

    public static final void accept$11(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            case 1:
                return;
            default:
                return;
        }
    }

    public static final void accept$15(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                return;
        }
    }

    public static final void accept$16(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                return;
        }
    }

    public static final void accept$20(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                return;
        }
    }

    public static final void accept$21(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                return;
        }
    }

    public static final void accept$8(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS17S0001000_5(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        T t;
        switch (afS17S0001000_5.i0) {
            case 0:
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse == null || (t = baseResponse.data) == 0 || TextUtils.isEmpty(((ReportCommitData) t).desc)) {
                    return;
                }
                C30868C9o.LJI(((ReportCommitData) baseResponse.data).desc);
                return;
            default:
                return;
        }
    }

    public static final void accept$1(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof C29401Dk) {
                    C30868C9o.LJI(((C29401Dk) th).getErrorMsg());
                    C0NB.LJII(th);
                    return;
                }
                return;
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 == null) {
                    th2 = new IllegalStateException("unknown error");
                }
                C36922EeM.LIZLLL(2, "Live", Log.getStackTraceString(th2));
                return;
        }
    }

    public static final void accept$10(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                C0NB.LJI("Tab Request", (Throwable) obj);
                return;
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onResult:");
                LIZ.append(Log.getStackTraceString((Throwable) obj));
                C36922EeM.LIZLLL(2, "LiveStateManager", X1D.LIZIZ(LIZ));
                return;
        }
    }

    public static final void accept$12(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("NTP time update result: ");
                LIZ.append(obj);
                C0NB.LJIIIZ("LiveNtpUtil", X1D.LIZIZ(LIZ));
                return;
        }
    }

    public static final void accept$13(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                C76271TwZ.LIZ.LJLJJI("resume");
                return;
            default:
                C08680Vs.LJIILJJIL.LIZIZ = (FeedExtra) obj;
                return;
        }
    }

    public static final void accept$14(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            case 1:
                Live.lambda$refreshLoginState$1(obj);
                return;
            default:
                C36582EXi.LIZJ(new RunnableC23230vf(11, obj));
                return;
        }
    }

    public static final void accept$17(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                VideoWidget.lambda$reportStickerChange$14((C28467BFf) obj);
                return;
        }
    }

    public static final void accept$18(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof C29401Dk) {
                    String content = ((C29401Dk) th).getPrompt();
                    o.LJIIIZ(content, "content");
                    C30868C9o.LJI(content);
                    return;
                }
                return;
            case 1:
                return;
            default:
                SDKServiceInitTask.lambda$run$0((Throwable) obj);
                return;
        }
    }

    public static final void accept$19(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                B4J.LIZIZ = new ArrayList();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    public static final void accept$2(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        T t;
        switch (afS17S0001000_5.i0) {
            case 0:
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (t = baseResponse.data) != 0 && ((ShareReportResult) t).getDeltaIntimacy() > 0) {
                    C73943T0h.LIZ().LIZIZ(new BNB((ShareReportResult) baseResponse.data));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                C0NB.LIZ(String.valueOf(obj.getClass()));
                return;
            case 3:
                ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29042BaY.class)).LIZ = Long.valueOf(SystemClock.elapsedRealtime());
                return;
            default:
                return;
        }
    }

    public static final void accept$22(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        ((IGameService) CN1.LIZ(IGameService.class)).Zf0(afS17S0001000_5.i0);
    }

    public static final void accept$23(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        B3P b3p;
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            case 1:
                B5E b5e = (B5E) obj;
                if (b5e != null && (b3p = b5e.LIZ) != null) {
                    B57.LIZ.LIZ().LIZIZ(new Event("live_room_notify_widget", 1280, EnumC28203B5b.MessageReceived));
                    b3p.LJ.mRoomsData.enterLiveSource = "live_detail";
                    C73943T0h.LIZ().LIZIZ(new B3P(b3p.LIZJ, b3p.LJ));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void accept$3(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                ((AbsAudienceInteractionFragment) obj).liveWatchOneMinLog();
                return;
            case 1:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("request /webcast/room/chat_emoji_list/ : ");
                LIZ.append(((Throwable) obj).toString());
                C0NB.LJ("CommentWidget", X1D.LIZIZ(LIZ));
                return;
            default:
                B4J.LIZIZ = new ArrayList(((BaseListResponse) obj).data);
                return;
        }
    }

    public static final void accept$4(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        C19700py c19700py = C19700py.LIZ;
        int i = afS17S0001000_5.i0;
        synchronized (c19700py) {
            if (C19700py.LIZJ.get()) {
                C19700py.LJIILIIL.add(Integer.valueOf(i));
            }
        }
    }

    public static final void accept$5(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                ((IHostAction) CN1.LIZ(IHostAction.class)).notifyShowLiveIconEntrance(((Boolean) obj).booleanValue());
                return;
            default:
                RoomStatusController.lambda$refreshRoomRecommendStats$7((Throwable) obj);
                return;
        }
    }

    public static final void accept$6(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("error_msg", ((Throwable) obj).getMessage());
                C0K2.LJII(1, "ttlive_audience_task_report", hashMap);
                return;
            default:
                return;
        }
    }

    public static final void accept$7(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            case 1:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("there is error");
                LIZ.append(((Throwable) obj).toString());
                C0NB.LJIIIZ("LiveIconGeneratorLog", X1D.LIZIZ(LIZ));
                return;
            default:
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onResult:");
                LIZ2.append(Log.getStackTraceString((Throwable) obj));
                C36922EeM.LIZLLL(2, "LiveStateManager", X1D.LIZIZ(LIZ2));
                return;
        }
    }

    public static final void accept$9(AfS17S0001000_5 afS17S0001000_5, Object obj) {
        switch (afS17S0001000_5.i0) {
            case 0:
                return;
            default:
                RoomStatusController.lambda$checkRoom$9((Throwable) obj);
                return;
        }
    }
}
