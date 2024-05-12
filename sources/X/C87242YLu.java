package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTrackerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YLu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87242YLu implements QOA {
    public boolean LIZ;
    public final String LIZIZ;
    public final HashMap<String, String> LIZJ;
    public final /* synthetic */ C87241YLt LIZLLL;

    @Override // X.QOA
    public final void LIZ(LiveWsMessage liveWsMessage) {
        try {
            C87241YLt c87241YLt = this.LIZLLL;
            if (c87241YLt.LIZLLL != null) {
                PayloadItem LIZLLL = C87241YLt.LIZLLL(liveWsMessage);
                if (LIZLLL.getExtraParams() != null) {
                    LIZLLL.getMessageTrackTimeInfo().receiveMessageTime = C30725C4b.LIZ();
                    java.util.Map<String, Object> extraParams = LIZLLL.getExtraParams();
                    o.LJIIIIZZ(extraParams, "payloadItem.extraParams");
                    extraParams.put(MessageMonitor.getLiveMessageStageName("all_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
                }
                IMessageWsClient.Callback callback = c87241YLt.LIZLLL;
                if (callback != null) {
                    callback.onWebSocketMessage(LIZLLL);
                }
                C32079CiR.LJIIJJI(liveWsMessage);
            }
        } catch (Exception e) {
            C0NB.LJFF("LiveWs", "receive message error", e);
            C32079CiR.LJIIJ(liveWsMessage, e);
        }
    }

    @Override // X.QOA
    public final void LIZIZ(QOC connectState, JSONObject jSONObject) {
        String str;
        String str2;
        int i;
        int i2;
        boolean z;
        long j;
        long j2;
        long j3;
        o.LJIIIZ(connectState, "connectState");
        LiveMonitorSampleSetting liveMonitorSampleSetting = LiveMonitorSampleSetting.INSTANCE;
        if (liveMonitorSampleSetting.isReportDolphin("ttlive_message_web_socket_event", 0.01d) && ORY.LJJIJIIJIL("ttlive_message_web_socket_event", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
            HashMap hashMap = new HashMap(C32079CiR.LIZ);
            Integer valueOf = Integer.valueOf(connectState.getTypeValue());
            if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    str = "connection_unknown";
                } else if (valueOf.intValue() == 2) {
                    str = "connecting";
                } else if (valueOf.intValue() == 4) {
                    str = "connect_failed";
                } else if (valueOf.intValue() == 8) {
                    str = "connect_closed";
                } else if (valueOf.intValue() == 16) {
                    str = "connected";
                }
                hashMap.put("connect_state", str);
                C32079CiR.LJIIL(0, "ttlive_message_web_socket_event", hashMap);
            }
            str = String.valueOf(connectState);
            hashMap.put("connect_state", str);
            C32079CiR.LJIIL(0, "ttlive_message_web_socket_event", hashMap);
        }
        int i3 = QOB.LIZ[connectState.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                long j4 = 0;
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return;
                        }
                        C0NB.LJIIIZ("LiveWs", "CONNECTED");
                        C87241YLt c87241YLt = this.LIZLLL;
                        if (c87241YLt.LIZLLL == null) {
                            return;
                        }
                        this.LIZ = true;
                        YM4 ym4 = c87241YLt.LJIJJLI;
                        if (ym4 != null) {
                            YM1 LIZIZ = YM1.LIZIZ();
                            LIZIZ.getClass();
                            LIZIZ.LIZ = new WeakReference<>(ym4);
                        }
                        this.LIZLLL.LJJIJIIJI = SystemClock.uptimeMillis();
                        C87241YLt c87241YLt2 = this.LIZLLL;
                        long j5 = c87241YLt2.LJJIIZI;
                        if (j5 != 0) {
                            j = c87241YLt2.LJJIJIIJI - j5;
                            c87241YLt2.LJJIIZI = 0L;
                        } else {
                            j = 0;
                        }
                        C32482Cow c32482Cow = c87241YLt2.LJIJJ;
                        long j6 = c87241YLt2.LJ;
                        boolean z2 = c87241YLt2.LJJIIJZLJL;
                        boolean z3 = c87241YLt2.LJJIIZ;
                        c32482Cow.getClass();
                        String str3 = C32482Cow.LJ;
                        if (liveMonitorSampleSetting.isReportSlardar(str3)) {
                            long LIZ = c32482Cow.LIZ();
                            JSONObject jSONObject2 = new JSONObject();
                            C12800eq.LIZ(jSONObject2, "room_id", j6);
                            long j7 = 1;
                            if (c32482Cow.LIZJ) {
                                j2 = 1;
                            } else {
                                j2 = 0;
                            }
                            C12800eq.LIZ(jSONObject2, "is_anchor", j2);
                            C12800eq.LIZ(jSONObject2, "suspend_dur", j);
                            if (z2) {
                                j3 = 1;
                            } else {
                                j3 = 0;
                            }
                            C12800eq.LIZ(jSONObject2, "is_suspend", j3);
                            if (!z3) {
                                j7 = 0;
                            }
                            C12800eq.LIZ(jSONObject2, "has_interrupted", j7);
                            Integer num = (Integer) DataChannelGlobal.LJLJJI.mv0(C29027BaJ.class);
                            if (num != null) {
                                j4 = num.intValue();
                            }
                            C12800eq.LIZ(jSONObject2, "room_count", j4);
                            c32482Cow.LIZLLL.LIZIZ(jSONObject2);
                            C0K2.LJIILIIL(0, 1, LIZ, str3, jSONObject2);
                        }
                        IMessageWsClient.Callback callback = this.LIZLLL.LIZLLL;
                        if (callback != null) {
                            callback.onWebSocketConnected();
                        }
                        C0NB.LJIIIZ("LiveWs", "callback.onWebSocketConnected");
                        return;
                    }
                    if (this.LIZLLL.LIZLLL == null) {
                        return;
                    }
                    if (jSONObject != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("CONNECT_CLOSED: ");
                        LIZ2.append(jSONObject);
                        C0NB.LJIIIZ("LiveWs", X1D.LIZIZ(LIZ2));
                        int optInt = jSONObject.optInt("error_code", 0);
                        String jSONObject3 = jSONObject.toString();
                        o.LJIIIIZZ(jSONObject3, "connectJson.toString()");
                        if (optInt != 0) {
                            C87241YLt c87241YLt3 = this.LIZLLL;
                            boolean z4 = this.LIZ;
                            c87241YLt3.LJJIIJZLJL = z4;
                            if (z4) {
                                c87241YLt3.LJJIIZI = SystemClock.uptimeMillis();
                                if (!c87241YLt3.LJJIIZ) {
                                    c87241YLt3.LJJIIZ = true;
                                }
                            }
                            C87241YLt c87241YLt4 = this.LIZLLL;
                            c87241YLt4.LJIJJ.LIZJ(c87241YLt4.LJ, optInt, jSONObject3, this.LIZIZ, this.LIZJ, c87241YLt4.LJJIIJZLJL, c87241YLt4.LJJIIZ);
                        }
                    }
                    if (this.LIZ) {
                        YM4 ym42 = this.LIZLLL.LJIJJLI;
                        if (ym42 != null) {
                            ym42.LIZIZ();
                        }
                        C87241YLt c87241YLt5 = this.LIZLLL;
                        if (c87241YLt5.LJJIJIIJI != 0) {
                            long j8 = c87241YLt5.LJJIJIIJIL;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            C87241YLt c87241YLt6 = this.LIZLLL;
                            c87241YLt5.LJJIJIIJIL = (uptimeMillis - c87241YLt6.LJJIJIIJI) + j8;
                            c87241YLt6.LJJIJIIJI = 0L;
                        }
                        YM1.LIZIZ().LIZ();
                        IMessageWsClient.Callback callback2 = this.LIZLLL.LIZLLL;
                        if (callback2 != null) {
                            callback2.onWebSocketDisconnected();
                        }
                        C0NB.LJIIIZ("LiveWs", "callback.onWebSocketDisconnected");
                    }
                    this.LIZ = false;
                    return;
                }
                C87241YLt c87241YLt7 = this.LIZLLL;
                if (c87241YLt7.LIZLLL == null) {
                    return;
                }
                if (jSONObject != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("CONNECT_FAILED: ");
                    LIZ3.append(jSONObject);
                    C0NB.LJIIIZ("LiveWs", X1D.LIZIZ(LIZ3));
                    int optInt2 = jSONObject.optInt("channel_type");
                    int optInt3 = jSONObject.optInt("type", 1);
                    String optString = jSONObject.optString("error", "");
                    if (optInt2 == 1 && optInt3 == 1 && TextUtils.isEmpty(optString)) {
                        return;
                    }
                    i = jSONObject.optInt("error_code", -1);
                    str2 = jSONObject.toString();
                    o.LJIIIIZZ(str2, "connectJson.toString()");
                } else {
                    str2 = "connect failed reason unknow";
                    i = -1;
                }
                int length = str2.length() - 1;
                int i4 = 0;
                boolean z5 = false;
                while (i4 <= length) {
                    if (!z5) {
                        i2 = i4;
                    } else {
                        i2 = length;
                    }
                    if (o.LJIIJJI(str2.charAt(i2), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z5) {
                        if (!z) {
                            z5 = true;
                        } else {
                            i4++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (TextUtils.equals(str2.subSequence(i4, length + 1).toString(), "internet is down, skip...")) {
                    c87241YLt7.LJIJJ.LIZIZ(c87241YLt7.LJ, "ttnet no internet check", this.LIZIZ, c87241YLt7.LJJIIZ);
                } else {
                    boolean z6 = this.LIZ;
                    c87241YLt7.LJJIIJZLJL = z6;
                    if (z6) {
                        c87241YLt7.LJJIIZI = SystemClock.uptimeMillis();
                        if (!c87241YLt7.LJJIIZ) {
                            c87241YLt7.LJJIIZ = true;
                        }
                    }
                    c87241YLt7.LJIJJ.LIZJ(c87241YLt7.LJ, i, str2, this.LIZIZ, this.LIZJ, c87241YLt7.LJJIIJZLJL, c87241YLt7.LJJIIZ);
                }
                YM4 ym43 = c87241YLt7.LJIJJLI;
                if (ym43 != null) {
                    ym43.LIZIZ();
                }
                if (c87241YLt7.LJJIJIIJI != 0) {
                    c87241YLt7.LJJIJIIJIL = (SystemClock.uptimeMillis() - c87241YLt7.LJJIJIIJI) + c87241YLt7.LJJIJIIJIL;
                    c87241YLt7.LJJIJIIJI = 0L;
                }
                YM1.LIZIZ().LIZ();
                IMessageWsClient.Callback callback3 = c87241YLt7.LIZLLL;
                if (callback3 != null) {
                    callback3.onWebSocketDisconnected();
                }
                C0NB.LJIIIZ("LiveWs", "callback.onWebSocketDisconnected");
                this.LIZ = false;
                return;
            }
            C0NB.LJIIIZ("LiveWs", "CONNECTING");
            C32482Cow c32482Cow2 = this.LIZLLL.LJIJJ;
            if (c32482Cow2.LIZIZ) {
                return;
            }
            c32482Cow2.LIZIZ = true;
            c32482Cow2.LIZ = SystemClock.uptimeMillis();
            return;
        }
        C0NB.LJIIIZ("LiveWs", "CONNECTION_UNKNOWN");
    }

    public C87242YLu(String str, HashMap<String, String> hashMap, C87241YLt c87241YLt) {
        this.LIZLLL = c87241YLt;
        this.LIZIZ = str;
        this.LIZJ = hashMap;
    }
}
