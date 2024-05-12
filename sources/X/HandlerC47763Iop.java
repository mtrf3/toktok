package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Iop, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC47763Iop extends Handler {
    public final WeakReference<TTVideoEngineImpl> LIZ;
    public final /* synthetic */ C47767Iot LIZIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        java.util.Map map;
        Condition condition;
        Object obj;
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            TTVideoEngineLog.w("TTVideoEngineLooperThread", "engine is null, return.");
            return;
        }
        Object obj2 = message.obj;
        String str = null;
        if (obj2 != null) {
            map = (java.util.Map) obj2;
            if (map.containsKey("msgCond")) {
                condition = (Condition) map.get("msgCond");
            } else {
                condition = null;
            }
            if (map.containsKey("paramObj")) {
                obj = map.get("paramObj");
            } else {
                obj = null;
            }
        } else {
            map = null;
            condition = null;
            obj = null;
        }
        int i = message.what;
        if (i != 600) {
            boolean z = true;
            switch (i) {
                case LiveChatShowDelayForHotLiveSetting.DEFAULT /* 400 */:
                    tTVideoEngineImpl.LLZL.onPlaybackStateChanged(tTVideoEngineImpl.L7, message.arg1);
                    break;
                case 401:
                    int i2 = message.arg1;
                    if (message.arg2 == 1 || i2 != 3) {
                        tTVideoEngineImpl.LLZL.onLoadStateChanged(tTVideoEngineImpl.L7, i2);
                        break;
                    }
                    break;
                case 402:
                    tTVideoEngineImpl.LLZL.onVideoSizeChanged(tTVideoEngineImpl.L7, message.arg1, message.arg2);
                    break;
                case 403:
                    tTVideoEngineImpl.LLZL.onBufferingUpdate(tTVideoEngineImpl.L7, message.arg1);
                    break;
                case 404:
                    tTVideoEngineImpl.LLZL.onPrepare(tTVideoEngineImpl.L7);
                    break;
                case 405:
                    tTVideoEngineImpl.LLZL.onPrepared(tTVideoEngineImpl.L7);
                    break;
                case 406:
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str2.equals(tTVideoEngineImpl.Z4)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("MSG_NOTIFY_RENDER_START engine:");
                            LIZ.append(tTVideoEngineImpl);
                            LIZ.append(", traceId not same, should be:");
                            LIZ.append(str2);
                            LIZ.append(", now:");
                            LIZ.append(tTVideoEngineImpl.Z4);
                            TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ));
                            break;
                        } else {
                            tTVideoEngineImpl.LLZL.onRenderStart(tTVideoEngineImpl.L7);
                            break;
                        }
                    }
                    break;
                case 407:
                    tTVideoEngineImpl.LLZL.onStreamChanged(tTVideoEngineImpl.L7, message.arg1);
                    break;
                case 408:
                    tTVideoEngineImpl.LLZL.onCompletion(tTVideoEngineImpl.L7);
                    break;
                case 409:
                    tTVideoEngineImpl.LLZL.onError((C47789IpF) obj);
                    break;
                case 410:
                    tTVideoEngineImpl.LLZL.onVideoStatusException(message.arg1);
                    break;
                case 411:
                    C47164IfA c47164IfA = (C47164IfA) obj;
                    InterfaceC46854IaA interfaceC46854IaA = tTVideoEngineImpl.LLZLLIL;
                    if (interfaceC46854IaA != null) {
                        boolean onFetchedVideoInfo = interfaceC46854IaA.onFetchedVideoInfo(c47164IfA);
                        this.LIZIZ.LJI.setDataPosition(0);
                        this.LIZIZ.LJI.writeInt(onFetchedVideoInfo ? 1 : 0);
                        break;
                    }
                    break;
                case 412:
                    InterfaceC46853Ia9 interfaceC46853Ia9 = tTVideoEngineImpl.LLZLLLL;
                    if (interfaceC46853Ia9 != null) {
                        interfaceC46853Ia9.onVideoEngineInfos((C47620ImW) obj);
                        break;
                    }
                    break;
                case 413:
                    C47789IpF c47789IpF = (C47789IpF) obj;
                    if (map != null && map.containsKey("paramObj1")) {
                        str = (String) map.get("paramObj1");
                    }
                    tTVideoEngineImpl.LLZL.onVideoURLRouteFailed(c47789IpF, str);
                    break;
                case 414:
                    if (message.arg1 != 1) {
                        z = false;
                    }
                    InterfaceC47896Iqy interfaceC47896Iqy = tTVideoEngineImpl.LJJJJLI;
                    if (interfaceC47896Iqy != null) {
                        interfaceC47896Iqy.LJJIIJZLJL(z);
                        tTVideoEngineImpl.LJJJJLI = null;
                        break;
                    }
                    break;
                case 415:
                    if (obj instanceof java.util.Map) {
                        java.util.Map map2 = (java.util.Map) obj;
                        int intValue = ((Integer) map2.get("bufferStartAction")).intValue();
                        String str3 = (String) map2.get("traceid");
                        if (str3 != tTVideoEngineImpl.Z4) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("MSG_NOTIFY_BUFFER_START engine:");
                            LIZ2.append(tTVideoEngineImpl);
                            LIZ2.append(", traceId not same, should be:");
                            LIZ2.append(str3);
                            LIZ2.append(", now:");
                            LIZ2.append(tTVideoEngineImpl.Z4);
                            TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ2));
                            break;
                        } else {
                            tTVideoEngineImpl.LLZL.onBufferStart(message.arg1, message.arg2, intValue);
                            break;
                        }
                    }
                    break;
                case 416:
                    tTVideoEngineImpl.LLZL.onBufferEnd(message.arg1);
                    break;
                case 417:
                    tTVideoEngineImpl.LLZL.onVideoStreamBitrateChanged((EnumC47176IfM) obj, message.arg1);
                    break;
                case 418:
                    tTVideoEngineImpl.LLZL.onSARChanged(message.arg1, message.arg2);
                    break;
                case 419:
                    tTVideoEngineImpl.LLZL.onReadyForDisplay(tTVideoEngineImpl.L7);
                    break;
                case 420:
                    tTVideoEngineImpl.LLZL.onAVBadInterlaced((java.util.Map) obj);
                    break;
                case 421:
                    java.util.Map map3 = (java.util.Map) obj;
                    tTVideoEngineImpl.LLZL.onFrameAboutToBeRendered(tTVideoEngineImpl.L7, ((Integer) map3.get("type")).intValue(), ((Long) map3.get("pts")).longValue(), ((Long) map3.get("wallClockTime")).longValue(), (HashMap) map3.get("frameData"));
                    break;
                case 422:
                    if (obj instanceof String) {
                        String str4 = (String) obj;
                        if (!str4.equals(tTVideoEngineImpl.Z4)) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("MSG_NOTIFY_VIDEO_SECOND_FRAME engine:");
                            LIZ3.append(tTVideoEngineImpl);
                            LIZ3.append(", traceId not same, should be:");
                            LIZ3.append(str4);
                            LIZ3.append(", now:");
                            LIZ3.append(tTVideoEngineImpl.Z4);
                            TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ3));
                            break;
                        } else {
                            tTVideoEngineImpl.LLZL.onVideoSecondFrame(tTVideoEngineImpl.L7);
                            break;
                        }
                    }
                    break;
                case 423:
                    long longValue = ((Long) obj).longValue();
                    C47751Iod c47751Iod = tTVideoEngineImpl.e.LIZIZ;
                    if (c47751Iod.LJJIIJ > 0 && c47751Iod.LJJIIJZLJL <= 0) {
                        c47751Iod.LJJIIJZLJL = longValue;
                    }
                    tTVideoEngineImpl.LLZL.onFirstAVSyncFrame(this.LIZIZ.LJIIL.L7);
                    break;
                case 424:
                    tTVideoEngineImpl.LLZL.onRefreshSurface(this.LIZIZ.LJIIL.L7);
                    break;
                case 425:
                    C47772Ioy c47772Ioy = tTVideoEngineImpl.LLZL;
                    if (c47772Ioy != null) {
                        c47772Ioy.onCurrentPlaybackTimeUpdate(this.LIZIZ.LJIIL.L7, message.arg1);
                        break;
                    }
                    break;
                default:
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("unknown message: ");
                    LIZ4.append(message.what);
                    TTVideoEngineLog.w("TTVideoEngineLooperThread", X1D.LIZIZ(LIZ4));
                    break;
            }
        } else {
            tTVideoEngineImpl.LLZL.onABRPredictBitrate(message.arg1, message.arg2);
        }
        Lock lock = this.LIZIZ.LJFF;
        if (condition != null) {
            ReentrantLock reentrantLock = (ReentrantLock) lock;
            reentrantLock.lock();
            condition.signal();
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC47763Iop(C47767Iot c47767Iot, TTVideoEngineImpl tTVideoEngineImpl, Looper looper) {
        super(looper);
        this.LIZIZ = c47767Iot;
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }
}
