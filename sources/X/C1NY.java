package X;

import android.os.Build;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.InitData;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ReportAckData;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ReportData;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ServerErrorData;
import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.SpeedData;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastTTPSpeedDetectionSwitcherSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.o;

/* renamed from: X.1NY, reason: invalid class name */
/* loaded from: classes.dex */
public class C1NY implements C0YB {
    public String LIZ = "";
    public final AtomicInteger LIZIZ = new AtomicInteger(2000000);
    public String LIZJ = "";
    public final AtomicInteger LIZLLL = new AtomicInteger(Integer.MAX_VALUE);
    public final AtomicLong LJ = new AtomicLong(0);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final C0W7 LJI = new C0W7(new AbstractC38911fr() { // from class: X.1l0
        @Override // X.AbstractC38911fr
        public final void LJJIJIIJI(PXH pxh, String str) {
            Integer num;
            Long l;
            Long l2;
            Long l3;
            Integer num2;
            Long l4;
            boolean z;
            int i;
            int i2;
            long j;
            long j2;
            long j3;
            long j4;
            Long l5;
            final long j5;
            final long j6;
            Long l6;
            Long l7;
            Long l8;
            Long l9;
            Long l10;
            Long l11;
            Long l12;
            ServerErrorData serverErrorData;
            SpeedData speedData;
            if (C30922CBq.LIZIZ && (((speedData = (SpeedData) C17J.LJIJJLI(SpeedData.class, str)) == null || (speedData.methodType != EnumC05580Ju.UploadAck.getValue() && speedData.methodType != EnumC05580Ju.Download.getValue())) && C30922CBq.LIZIZ)) {
                FP1.LJFF("onMessage(). text=", str, "SpeedManager_Base");
            }
            final C42111l1 c42111l1 = (C42111l1) C1NY.this;
            c42111l1.getClass();
            if (c42111l1.LIZLLL.get() > 0 && c42111l1.LIZLLL.get() != Integer.MAX_VALUE && str.length() > c42111l1.LIZLLL.get()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("handleReceiveMessage(). receive a big size message. text length=");
                LIZ.append(str.length());
                LIZ.append(", Thread=");
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                C0NB.LJ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ));
                String sessionId = c42111l1.LIZJ;
                int i3 = c42111l1.LIZLLL.get();
                int length = str.length();
                o.LJIIIZ(sessionId, "sessionId");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("session_id", sessionId);
                linkedHashMap.put("max_common_byte", Integer.valueOf(i3));
                linkedHashMap.put("text_size", Integer.valueOf(length));
                C0K2.LJII(1, O5Y.LJJLI("ttlive_speed_detection_single_message_invalid_service"), linkedHashMap);
                return;
            }
            SpeedData speedData2 = (SpeedData) C17J.LJIJJLI(SpeedData.class, str);
            if (speedData2 != null) {
                num = Integer.valueOf(speedData2.methodType);
            } else {
                num = null;
            }
            int value = EnumC05580Ju.Config.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = EnumC05580Ju.UploadAck.getValue();
                if (num != null && num.intValue() == value2) {
                    return;
                }
                int value3 = EnumC05580Ju.Report.getValue();
                if (num == null || num.intValue() != value3) {
                    int value4 = EnumC05580Ju.ServerError.getValue();
                    if (num == null || num.intValue() != value4 || (serverErrorData = speedData2.serverErrorData) == null) {
                        return;
                    }
                    if (C30922CBq.LIZIZ) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Other -> Session(");
                        LIZ2.append(c42111l1.LIZJ);
                        LIZ2.append("), receive ServerError Message. serverErrorData=");
                        LIZ2.append(serverErrorData);
                        LIZ2.append(", ");
                        LIZ2.append(c42111l1);
                        LIZ2.append(", Thread=");
                        LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                        C0NB.LJIIIZ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ2));
                    }
                    C0W0 c0w0 = C0W0.DisconnectTypeServerError;
                    int code = c0w0.getCode();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(c0w0.getMessage());
                    LIZ3.append("(ServerError code=");
                    LIZ3.append(serverErrorData.code);
                    LIZ3.append(", msg=");
                    LIZ3.append(serverErrorData.msg);
                    LIZ3.append(')');
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    c42111l1.LJFF(code, LIZIZ);
                    c42111l1.LIZLLL(code, LIZIZ);
                    return;
                }
                Object[] objArr = new Object[1];
                ReportData reportData = speedData2.reportData;
                if (reportData != null && (l12 = reportData.uploadSpeed) != null) {
                    j = l12.longValue();
                } else {
                    j = 0;
                }
                objArr[0] = Float.valueOf(C0RJ.LIZ(j));
                String LIZIZ2 = Q8U.LIZIZ(objArr, 1, "%.1f", "format(format, *args)");
                Object[] objArr2 = new Object[1];
                ReportData reportData2 = speedData2.reportData;
                if (reportData2 != null && (l11 = reportData2.uploadSpeed) != null) {
                    j2 = l11.longValue();
                } else {
                    j2 = 0;
                }
                float f = 1024;
                objArr2[0] = Float.valueOf((((float) j2) / f) / f);
                String LIZIZ3 = Q8U.LIZIZ(objArr2, 1, "%.1f", "format(format, *args)");
                Object[] objArr3 = new Object[1];
                ReportData reportData3 = speedData2.reportData;
                if (reportData3 != null && (l10 = reportData3.downloadSpeed) != null) {
                    j3 = l10.longValue();
                } else {
                    j3 = 0;
                }
                objArr3[0] = Float.valueOf(C0RJ.LIZ(j3));
                String LIZIZ4 = Q8U.LIZIZ(objArr3, 1, "%.1f", "format(format, *args)");
                Object[] objArr4 = new Object[1];
                ReportData reportData4 = speedData2.reportData;
                if (reportData4 != null && (l9 = reportData4.downloadSpeed) != null) {
                    j4 = l9.longValue();
                } else {
                    j4 = 0;
                }
                objArr4[0] = Float.valueOf((((float) j4) / f) / f);
                String LIZIZ5 = Q8U.LIZIZ(objArr4, 1, "%.1f", "format(format, *args)");
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("No.4 -> Session(");
                    LIZ4.append(c42111l1.LIZJ);
                    LIZ4.append("), receive Report Message, status=");
                    ReportData reportData5 = speedData2.reportData;
                    if (reportData5 != null) {
                        l8 = reportData5.status;
                    } else {
                        l8 = null;
                    }
                    LIZ4.append(l8);
                    LIZ4.append(". uploadSpeed=");
                    LIZ4.append(LIZIZ2);
                    LIZ4.append("mbps(");
                    YE1.LIZLLL(LIZ4, LIZIZ3, "MB/s), downloadSpeed=", LIZIZ4, "mbps(");
                    LIZ4.append(LIZIZ5);
                    LIZ4.append("MB/s), Thread=");
                    LIZ4.append(C16880lQ.LLLLIIIILLL().getName());
                    C0NB.LJIIIZ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ4));
                }
                c42111l1.LJII();
                SpeedData speedData3 = new SpeedData(c42111l1);
                speedData3.methodType = EnumC05580Ju.ReportACK.getValue();
                ReportAckData reportAckData = new ReportAckData();
                reportAckData.ackId = speedData2.seqId;
                speedData3.reportAckData = reportAckData;
                String LJJJJJL = C17J.LJJJJJL(speedData3);
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("No.5 -> Session(");
                    LIZ5.append(c42111l1.LIZJ);
                    LIZ5.append("), send ReportAck Message. reportAckSpeedData=");
                    LIZ5.append(LJJJJJL);
                    LIZ5.append(", Thread=");
                    LIZ5.append(C16880lQ.LLLLIIIILLL().getName());
                    C0NB.LJIIIZ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ5));
                }
                c42111l1.LIZJ(LJJJJJL);
                ReportData reportData6 = speedData2.reportData;
                if (reportData6 == null || (l5 = reportData6.status) == null || l5.longValue() != 1) {
                    C0W1 c0w1 = C0W1.ServerDetectionFailure;
                    c42111l1.LJFF(c0w1.getCode(), c0w1.getMessage());
                } else {
                    ReportData reportData7 = speedData2.reportData;
                    if (reportData7 != null && (l7 = reportData7.uploadSpeed) != null) {
                        j5 = l7.longValue();
                    } else {
                        j5 = 0;
                    }
                    ReportData reportData8 = speedData2.reportData;
                    if (reportData8 != null && (l6 = reportData8.downloadSpeed) != null) {
                        j6 = l6.longValue();
                    } else {
                        j6 = 0;
                    }
                    C73411SrX c73411SrX = c42111l1.LJIIIIZZ;
                    if (c73411SrX != null) {
                        c73411SrX.dispose();
                    }
                    c42111l1.LJIIIZ.post(new Runnable() { // from class: X.0W4
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Long, O] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ6;
                            try {
                                ((C32535Cpn) DataChannelGlobal.LJLJJI.gv0(C30381Bw9.class)).LIZ = Long.valueOf(j5);
                                C0W5 c0w5 = c42111l1.LJIILL;
                                if (c0w5 != null) {
                                    c0w5.LIZ(j5, j6);
                                }
                                c42111l1.LJIILL = null;
                            } finally {
                                if (LIZ6) {
                                }
                            }
                        }
                    });
                }
                XKQ xkq = c42111l1.LJIILIIL;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                c42111l1.LJIILIIL = XKX.LIZLLL(c42111l1.LJIIZILJ, null, null, new C2DP(c42111l1, null), 3);
                return;
            }
            XKQ xkq2 = c42111l1.LJIIJJI;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            ConfigData configData = speedData2.configData;
            if (configData != null) {
                long j7 = configData.maxPackage;
                if (j7 >= 1 && configData.sendDuration >= 1 && configData.waitDuration >= 1 && (i = configData.sendByte) >= 1 && (i2 = configData.maxCommonByte) >= 1 && i <= 512000 && j7 * i * 10 <= 31457280) {
                    String sessionId2 = configData.sessionId;
                    long j8 = configData.closeWait;
                    o.LJIIIZ(sessionId2, "sessionId");
                    c42111l1.LIZJ = sessionId2;
                    c42111l1.LIZLLL.set(i2);
                    c42111l1.LJ.set(j8);
                    if (C30922CBq.LIZIZ) {
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("No.2 -> Session(");
                        LIZ6.append(c42111l1.LIZJ);
                        LIZ6.append("), receive Config Message. configData=");
                        LIZ6.append(configData);
                        LIZ6.append(", Thread=");
                        LIZ6.append(C16880lQ.LLLLIIIILLL().getName());
                        C0NB.LJIIIZ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ6));
                    }
                    XKQ xkq3 = c42111l1.LJIIL;
                    if (xkq3 != null) {
                        xkq3.LIZIZ(null);
                    }
                    c42111l1.LJIIL = XKX.LIZLLL(c42111l1.LJIIZILJ, null, null, new C2DN(c42111l1, configData, null), 3);
                    c42111l1.LJIIJJI = XKX.LIZLLL(c42111l1.LJIIZILJ, null, null, new C2DO(c42111l1, configData, null), 3);
                    return;
                }
            }
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("interrupt upload task because illegal parameters. maxPackage=");
            if (configData != null) {
                l = Long.valueOf(configData.maxPackage);
            } else {
                l = null;
            }
            LIZ7.append(l);
            LIZ7.append(", sendDuration=");
            if (configData != null) {
                l2 = Long.valueOf(configData.sendDuration);
            } else {
                l2 = null;
            }
            LIZ7.append(l2);
            LIZ7.append(", waitDuration=");
            if (configData != null) {
                l3 = Long.valueOf(configData.waitDuration);
            } else {
                l3 = null;
            }
            LIZ7.append(l3);
            LIZ7.append(", sendByte=");
            if (configData != null) {
                num2 = Integer.valueOf(configData.sendByte);
            } else {
                num2 = null;
            }
            LIZ7.append(num2);
            LIZ7.append(", maxPackage=");
            if (configData != null) {
                l4 = Long.valueOf(configData.maxPackage);
            } else {
                l4 = null;
            }
            LIZ7.append(l4);
            LIZ7.append(", Thread=");
            LIZ7.append(C16880lQ.LLLLIIIILLL().getName());
            C0NB.LJ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ7));
            C0W0 c0w02 = C0W0.DisconnectTypeDetectionWithIllegalParameters;
            c42111l1.LJFF(c0w02.getCode(), c0w02.getMessage());
            c42111l1.LIZLLL(c0w02.getCode(), c0w02.getMessage());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (configData == null) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMap2.put("config_data_null", Boolean.valueOf(z));
            if (configData != null) {
                linkedHashMap2.put("session_id", configData.sessionId);
                linkedHashMap2.put("max_package", Long.valueOf(configData.maxPackage));
                linkedHashMap2.put("send_duration", Long.valueOf(configData.sendDuration));
                linkedHashMap2.put("wait_duration", Long.valueOf(configData.waitDuration));
                linkedHashMap2.put("send_byte", Integer.valueOf(configData.sendByte));
                linkedHashMap2.put("max_common_byte", Integer.valueOf(configData.maxCommonByte));
                linkedHashMap2.put("total_send_byte", Long.valueOf(configData.maxPackage * configData.sendByte * 10));
            }
            C0K2.LJII(1, O5Y.LJJLI("ttlive_speed_detection_config_param_invalid_service"), linkedHashMap2);
        }

        @Override // X.AbstractC38911fr
        public final void LJJIJIIJIL(PXH pxh, C64537PUn c64537PUn) {
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onMessage(). bytes=");
                LIZ.append(c64537PUn);
                LIZ.append(", Thread=");
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                C0NB.LJIIIZ("SpeedManager_Base", X1D.LIZIZ(LIZ));
            }
            C1NY.this.getClass();
        }

        @Override // X.AbstractC38911fr
        public final void LJJIJIL(PXH webSocket, C64598PWw response) {
            String RELEASE;
            o.LJIIIZ(webSocket, "webSocket");
            o.LJIIIZ(response, "response");
            C1NY.this.LJFF.set(true);
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onOpen(). ");
                LIZ.append(C1NY.this);
                C0NB.LJIIIZ("SpeedManager_Base", X1D.LIZIZ(LIZ));
            }
            C1NY c1ny = C1NY.this;
            c1ny.getClass();
            SpeedData speedData = new SpeedData(c1ny);
            speedData.methodType = EnumC05580Ju.Init.getValue();
            InitData initData = new InitData();
            String str = c1ny.LIZ;
            o.LJIIIZ(str, "<set-?>");
            initData.scene = str;
            if (GameLiveBroadcastTTPSpeedDetectionSwitcherSetting.INSTANCE.isEnable()) {
                initData.userId = "us_ttp_null";
                initData.deviceId = "us_ttp_null";
                initData.network = "us_ttp_null";
                initData.osVersion = "us_ttp_null";
                initData.deviceType = "us_ttp_null";
            } else {
                String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                o.LJIIIZ(valueOf, "<set-?>");
                initData.userId = valueOf;
                String deviceId = DeviceRegisterManager.getDeviceId();
                o.LJIIIIZZ(deviceId, "getDeviceId()");
                initData.deviceId = deviceId;
                String LLJILJILJ = C16880lQ.LLJILJILJ(C15380j0.LIZLLL());
                o.LJIIIIZZ(LLJILJILJ, "getNetworkAccessType(ResUtil.getContext())");
                initData.network = LLJILJILJ;
                try {
                    RELEASE = Build.VERSION.RELEASE;
                    o.LJIIIIZZ(RELEASE, "RELEASE");
                    if (RELEASE.length() > 10) {
                        RELEASE = RELEASE.substring(0, 10);
                        o.LJIIIIZZ(RELEASE, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                } catch (Exception unused) {
                    RELEASE = "";
                }
                initData.osVersion = RELEASE;
                String MODEL = Build.MODEL;
                o.LJIIIIZZ(MODEL, "MODEL");
                initData.deviceType = MODEL;
            }
            long j = speedData.timeStamp;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(initData.scene);
            LIZ2.append(initData.userId);
            C0MT.LIZLLL(LIZ2, initData.deviceId, j, "ec795247408ff4c66b509f36e7a71ae7");
            String mD5String = MD5Utils.getMD5String(X1D.LIZIZ(LIZ2));
            o.LJIIIIZZ(mD5String, "getMD5String(originStr)");
            initData.sign = mD5String;
            speedData.initData = initData;
            String LJJJJJL = C17J.LJJJJJL(speedData);
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("No.1 -> Session(");
                LIZ3.append(c1ny.LIZJ);
                LIZ3.append("), send Init Message. initSpeedData=");
                LIZ3.append(LJJJJJL);
                LIZ3.append(", Thread=");
                LIZ3.append(C16880lQ.LLLLIIIILLL().getName());
                C0NB.LJIIIZ("NetworkSpeedDetectorManager", X1D.LIZIZ(LIZ3));
            }
            c1ny.LIZJ(LJJJJJL);
        }

        @Override // X.AbstractC38911fr
        public final void LJJ(PXH webSocket, int i, String reason) {
            o.LJIIIZ(webSocket, "webSocket");
            o.LJIIIZ(reason, "reason");
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = C06830Op.LIZ("onClosed(). code=", i, ", reason=", reason, ", Thread=");
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                C0NB.LJIIIZ("SpeedManager_Base", X1D.LIZIZ(LIZ));
            }
            C42111l1 c42111l1 = (C42111l1) C1NY.this;
            c42111l1.getClass();
            if (i != C0W0.DisconnectTypeNormalExit.getCode()) {
                c42111l1.LJFF(i, reason);
            }
            C1NY.this.LIZIZ();
        }

        @Override // X.AbstractC38911fr
        public final void LJJI(PXH webSocket, int i, String str) {
            o.LJIIIZ(webSocket, "webSocket");
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = C06830Op.LIZ("onClosing(). code=", i, ", reason=", str, ", Thread=");
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                C0NB.LJIIIZ("SpeedManager_Base", X1D.LIZIZ(LIZ));
            }
            C1NY.this.getClass();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
        
            if (r0 == null) goto L12;
         */
        @Override // X.AbstractC38911fr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJJIJ(X.PXX r6, java.lang.Throwable r7, X.C64598PWw r8) {
            /*
                r5 = this;
                java.lang.String r0 = "webSocket"
                kotlin.jvm.internal.o.LJIIIZ(r6, r0)
                java.lang.String r0 = "t"
                kotlin.jvm.internal.o.LJIIIZ(r7, r0)
                boolean r0 = X.C30922CBq.LIZIZ
                if (r0 == 0) goto L3b
                java.lang.StringBuilder r1 = X.X1D.LIZ()
                java.lang.String r0 = "onFailure(). response="
                r1.append(r0)
                r1.append(r8)
                java.lang.String r0 = ", throwable="
                r1.append(r0)
                r1.append(r7)
                java.lang.String r0 = ", Thread="
                r1.append(r0)
                java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
                java.lang.String r0 = r0.getName()
                r1.append(r0)
                java.lang.String r1 = X.X1D.LIZIZ(r1)
                java.lang.String r0 = "SpeedManager_Base"
                X.C0NB.LJIIIZ(r0, r1)
            L3b:
                X.1NY r3 = X.C1NY.this
                X.1l1 r3 = (X.C42111l1) r3
                r3.getClass()
                java.lang.String r4 = r3.LIZJ
                java.lang.String r1 = r7.getMessage()
                java.lang.String r0 = "sessionId"
                kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.lang.String r0 = "session_id"
                r2.put(r0, r4)
                if (r1 != 0) goto L5b
                java.lang.String r1 = ""
            L5b:
                java.lang.String r0 = "throwable_message"
                r2.put(r0, r1)
                java.lang.String r0 = "ttlive_speed_detection_socket_failure_service"
                java.lang.String r1 = X.O5Y.LJJLI(r0)
                r0 = 1
                X.C0K2.LJII(r0, r1, r2)
                if (r8 == 0) goto L81
                int r1 = r8.LJLJI
                java.lang.String r0 = r8.LJLJJI
                if (r0 != 0) goto L78
            L72:
                X.0W1 r0 = X.C0W1.SocketOnFailureCallbackFailure
                java.lang.String r0 = r0.getMessage()
            L78:
                r3.LJFF(r1, r0)
                X.1NY r0 = X.C1NY.this
                r0.LIZIZ()
                return
            L81:
                X.0W1 r0 = X.C0W1.SocketOnFailureCallbackFailure
                int r1 = r0.getCode()
                goto L72
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C42101l0.LJJIJ(X.PXX, java.lang.Throwable, X.PWw):void");
        }
    });

    public void LIZIZ() {
        throw null;
    }

    @Override // X.C0YB
    public final int LIZ() {
        return this.LIZIZ.getAndAdd(1);
    }

    public final String toString() {
        String valueOf = String.valueOf(hashCode());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("obj:");
        String substring = valueOf.substring(valueOf.length() - 4, valueOf.length());
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ.append(substring);
        LIZ.append('.');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZJ(String str) {
        C0W7 c0w7 = this.LJI;
        c0w7.getClass();
        PXH pxh = c0w7.LIZJ;
        if (pxh != null) {
            pxh.LIZIZ(str);
        }
    }

    public final void LIZLLL(int i, String reason) {
        boolean z;
        o.LJIIIZ(reason, "reason");
        if (!this.LJFF.get()) {
            return;
        }
        LIZIZ();
        C0W7 c0w7 = this.LJI;
        c0w7.getClass();
        PXH pxh = c0w7.LIZJ;
        if (pxh != null) {
            z = pxh.LIZ(i, reason);
        } else {
            z = false;
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = C06830Op.LIZ("stop connection. code=", i, ", reason=", reason, ", close result=");
            LIZ.append(z);
            LIZ.append(", Thread=");
            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
            C0NB.LJIIIZ("SpeedManager_Base", X1D.LIZIZ(LIZ));
        }
    }
}
