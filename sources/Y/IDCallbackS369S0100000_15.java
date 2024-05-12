package Y;

import X.C30176Bsq;
import X.C32087CiZ;
import X.C45283Hpv;
import X.C66426Q5e;
import X.C76732zl;
import X.C86824Y5s;
import X.C86831Y5z;
import X.C87380YRc;
import X.C87381YRd;
import X.C87383YRf;
import X.C87385YRh;
import X.C87390YRm;
import X.InterfaceC133835Nb;
import X.ORS;
import X.PVC;
import X.RunnableC39007FSp;
import X.V0Q;
import X.X1D;
import X.Y5K;
import X.Y5W;
import X.Y5Z;
import X.Y61;
import X.Y64;
import X.Y6A;
import X.YO7;
import X.YRF;
import X.YRL;
import X.YRN;
import X.YRS;
import X.YRW;
import X.YRX;
import X.YRY;
import X.YRZ;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.vesdk.VEEditor;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageID;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDCallbackS369S0100000_15 implements Handler.Callback {
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
            case 9:
                return handleMessage$9(this, message);
            case 10:
                return handleMessage$10(this, message);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return handleMessage$11(this, message);
            case 12:
                return handleMessage$12(this, message);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return handleMessage$13(this, message);
            case 14:
                return handleMessage$14(this, message);
            case 15:
                return handleMessage$15(this, message);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return handleMessage$16(this, message);
            default:
                return false;
        }
    }

    public IDCallbackS369S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message message) {
        if (message.what != 0) {
            return false;
        }
        I18nUpdateManager i18nUpdateManager = (I18nUpdateManager) iDCallbackS369S0100000_15.l0;
        i18nUpdateManager.LIZIZ(i18nUpdateManager.LJI);
        return true;
    }

    public static final boolean handleMessage$1(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message message) {
        Y6A y6a;
        int i = message.what;
        if (i == R.id.nl6) {
            Y61 y61 = (Y61) iDCallbackS369S0100000_15.l0;
            Y64 y64 = (Y64) message.obj;
            y61.LJLLL = y64;
            Y64 y642 = y61.LJLLJ;
            if (y642 != null) {
                if (y64 != null && (y6a = y61.LJLLI) != null) {
                    int i2 = y64.LJLIL;
                    int i3 = y64.LJLILLLLZI;
                    int i4 = y642.LJLIL;
                    int i5 = y642.LJLILLLLZI;
                    y61.LJLLLL = y6a.LIZJ.LIZIZ(y64, y6a.LIZ);
                    Rect rect = new Rect(0, 0, i4, i5);
                    Rect rect2 = y61.LJLLLL;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (y61.LJZI != null) {
                        rect3.inset(Math.max(0, (rect3.width() - y61.LJZI.LJLIL) / 2), Math.max(0, (rect3.height() - y61.LJZI.LJLILLLLZI) / 2));
                    } else {
                        int min = (int) Math.min(rect3.width() * y61.LJZL, rect3.height() * y61.LJZL);
                        rect3.inset(min, min);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    y61.LJLZ = rect3;
                    Rect rect4 = new Rect(y61.LJLZ);
                    Rect rect5 = y61.LJLLLL;
                    rect4.offset(-rect5.left, -rect5.top);
                    Rect rect6 = new Rect((rect4.left * i2) / y61.LJLLLL.width(), (rect4.top * i3) / y61.LJLLLL.height(), (rect4.right * i2) / y61.LJLLLL.width(), (rect4.bottom * i3) / y61.LJLLLL.height());
                    y61.LJZ = rect6;
                    if (rect6.width() <= 0 || y61.LJZ.height() <= 0) {
                        y61.LJZ = null;
                        y61.LJLZ = null;
                    } else {
                        y61.LLFFF.LIZ();
                    }
                    y61.requestLayout();
                    y61.LJFF();
                } else {
                    y61.LJZ = null;
                    y61.LJLZ = null;
                    y61.LJLLLL = null;
                    throw new IllegalStateException("containerSize or previewSize is not set yet");
                }
            }
            return true;
        }
        if (i == R.id.nl0) {
            Exception exc = (Exception) message.obj;
            Y61 y612 = (Y61) iDCallbackS369S0100000_15.l0;
            if (y612.LJLIL != null) {
                y612.LIZ();
                ((Y61) iDCallbackS369S0100000_15.l0).LLFFF.LJ(exc);
            }
        } else if (i == R.id.nkz) {
            ((Y61) iDCallbackS369S0100000_15.l0).LLFFF.LIZLLL();
        }
        return false;
    }

    public static final boolean handleMessage$10(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        o.LJIIIZ(p0, "p0");
        C87385YRh c87385YRh = (C87385YRh) iDCallbackS369S0100000_15.l0;
        c87385YRh.getClass();
        if (p0.what == 231) {
            Object obj = p0.obj;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.ugc.live.sdk.message.data.IMessage>");
            List<IMessage> list = (List) obj;
            MessageMonitor LIZJ = c87385YRh.LIZ.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("main thread receive message list, size is ");
            LIZ.append(list.size());
            LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
            for (IMessage iMessage : list) {
                if (!c87385YRh.LIZIZ.LJIILJJIL.onMessage(iMessage)) {
                    c87385YRh.LIZIZ.LJIIL(iMessage, false);
                }
            }
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$11(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        int i;
        Handler handler;
        Handler handler2;
        o.LJIIIZ(p0, "p0");
        YRY yry = (YRY) iDCallbackS369S0100000_15.l0;
        yry.getClass();
        int i2 = p0.what;
        if (i2 != 212) {
            if (i2 == 213) {
                ((CopyOnWriteArrayList) yry.LJFF).clear();
                yry.LIZIZ.LJIILJJIL.LIZIZ();
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MessageMonitor LIZJ = yry.LIZ.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("before dispatch, message queue size is ");
            LIZ.append(((CopyOnWriteArrayList) yry.LJFF).size());
            LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
            try {
                i = yry.LJIIIZ();
            } catch (Exception e) {
                MessageMonitor LIZJ2 = yry.LIZ.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("dynamicDispatch error:");
                LIZ2.append(e);
                LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
                i = 0;
            }
            yry.LIZ.LIZJ().log("MessagePortal", "after dispatch, message queue size is " + ((CopyOnWriteArrayList) yry.LJFF).size());
            if (((CopyOnWriteArrayList) yry.LJFF).size() > 0 && (((handler = yry.LJ) == null || !handler.hasMessages(212)) && (handler2 = yry.LJ) != null)) {
                handler2.sendEmptyMessageDelayed(212, yry.LIZJ);
            }
            yry.LIZ.LIZJ().monitorMsgDispatchListDelay(SystemClock.elapsedRealtime() - elapsedRealtime, i, ((CopyOnWriteArrayList) yry.LJFF).size(), 7);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0019, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean handleMessage$12(Y.IDCallbackS369S0100000_15 r16, android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCallbackS369S0100000_15.handleMessage$12(Y.IDCallbackS369S0100000_15, android.os.Message):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0016. Please report as an issue. */
    public static final boolean handleMessage$13(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        List<IMessage> list;
        o.LJIIIZ(p0, "p0");
        C87380YRc c87380YRc = (C87380YRc) iDCallbackS369S0100000_15.l0;
        c87380YRc.getClass();
        int i = p0.what;
        if (i != 232) {
            switch (i) {
                case 211:
                    Object obj = p0.obj;
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.ugc.live.sdk.message.data.IMessage>");
                    List<IMessage> list2 = (List) obj;
                    MessageMonitor LIZJ = c87380YRc.LIZ.LIZJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("main thread receive message list, size is ");
                    LIZ.append(list2.size());
                    LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
                    for (IMessage iMessage : list2) {
                        if (!c87380YRc.LIZIZ.LJIILJJIL.onMessage(iMessage)) {
                            if (c87380YRc.LIZIZ.LJIIJJI(iMessage)) {
                                c87380YRc.LIZIZ.LJIIL(iMessage, false);
                                c87380YRc.LIZ.LIZJ().monitorMsgP2pDispatchDirectly(list2.size(), iMessage.getMethodName(), SystemClock.elapsedRealtime() - iMessage.getLocalTimestamp(), iMessage.getMessageFrom(), false, c87380YRc.LIZIZ.LJJ, 1, iMessage.getExtraParams());
                            } else {
                                ((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).add(iMessage);
                            }
                        }
                    }
                    c87380YRc.LJIIIZ();
                    c87380YRc.LJIIJ(false);
                    break;
                case 212:
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    MessageMonitor LIZJ2 = c87380YRc.LIZ.LIZJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("before dispatch, message queue size is ");
                    LIZ2.append(((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).size());
                    LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
                    int size = ((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).size();
                    int i2 = c87380YRc.LJFF;
                    if (size < i2) {
                        i2 = ((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).size();
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        synchronized (c87380YRc.LJIIIZ) {
                            arrayList.addAll(((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).subList(0, i2));
                        }
                        YRW yrw = c87380YRc.LIZIZ;
                        int min = Math.min(yrw.LJIIIIZZ.LIZ(arrayList, yrw, false), arrayList.size());
                        synchronized (c87380YRc.LJIIIZ) {
                            List<IMessage> list3 = c87380YRc.LJIIIIZZ;
                            List<? extends IMessage> subList = ((CopyOnWriteArrayList) list3).subList(0, Math.min(min, ((CopyOnWriteArrayList) list3).size()));
                            c87380YRc.LIZ.LJI().LJIIIZ(c87380YRc.LJIIIIZZ, subList);
                            subList.clear();
                        }
                    } catch (Exception e) {
                        MessageMonitor LIZJ3 = c87380YRc.LIZ.LIZJ();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("messageList clear error:");
                        LIZ3.append(e);
                        LIZJ3.log("MessagePortal", X1D.LIZIZ(LIZ3));
                    }
                    MessageMonitor LIZJ4 = c87380YRc.LIZ.LIZJ();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("after dispatch, message queue size is ");
                    LIZ4.append(((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).size());
                    LIZJ4.log("MessagePortal", X1D.LIZIZ(LIZ4));
                    if (((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).size() > 0) {
                        c87380YRc.LJIIJ(true);
                    }
                    c87380YRc.LIZ.LIZJ().monitorMsgDispatchListDelay(SystemClock.elapsedRealtime() - elapsedRealtime, i2, ((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).size(), 1);
                    break;
                case 213:
                    ((CopyOnWriteArrayList) c87380YRc.LJIIIIZZ).clear();
                    c87380YRc.LIZIZ.LJIILJJIL.LIZIZ();
                    break;
            }
        } else {
            Object obj2 = p0.obj;
            if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                for (IMessage iMessage2 : list) {
                    c87380YRc.LIZIZ.LJIIL(iMessage2, false);
                    c87380YRc.LIZ.LIZJ().monitorMsgP2pDispatchDirectly(list.size(), iMessage2.getMethodName(), SystemClock.elapsedRealtime() - iMessage2.getLocalTimestamp(), iMessage2.getMessageFrom(), false, c87380YRc.LIZIZ.LJJ, 1, iMessage2.getExtraParams());
                }
            }
            c87380YRc.LJIIIZ();
            c87380YRc.LJIIJ(false);
        }
        return true;
    }

    public static final boolean handleMessage$14(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        Message obtainMessage;
        boolean z;
        boolean z2;
        boolean z3;
        Message obtainMessage2;
        Handler handler;
        o.LJIIIZ(p0, "p0");
        YRF yrf = (YRF) iDCallbackS369S0100000_15.l0;
        MessageMonitor LIZJ = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleWorkMessage start what: ");
        LIZ.append(p0.what);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        switch (p0.what) {
            case 101:
                MessageMonitor LIZJ2 = yrf.LIZ.LIZ.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("start message, hasStartFetchMessage: ");
                LIZ2.append(yrf.LJJIJ);
                LIZJ2.log("MessagePortalReuse", X1D.LIZIZ(LIZ2));
                if (!yrf.LIZIZ.LJLJLJ.LJLIL || !yrf.LJJIJ) {
                    int i = YRN.LIZ[yrf.LIZJ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                yrf.LJIL(YRL.WS_CONNECTING);
                                Handler handler2 = yrf.LJIJ;
                                if (handler2 != null) {
                                    handler2.sendEmptyMessage(105);
                                }
                                Handler handler3 = yrf.LJIJI;
                                if (handler3 != null) {
                                    handler3.sendEmptyMessage(113);
                                }
                            } else {
                                yrf.LJJIIZ++;
                                yrf.LJIJJLI();
                                Handler handler4 = yrf.LJIJI;
                                if (handler4 != null) {
                                    handler4.sendEmptyMessageDelayed(113, 1000L);
                                }
                            }
                        } else {
                            Handler handler5 = yrf.LJIJI;
                            if (handler5 != null) {
                                handler5.sendEmptyMessage(113);
                            }
                            Handler handler6 = yrf.LJIJ;
                            if (handler6 != null && !handler6.hasMessages(106)) {
                                yrf.LJIIZILJ(yrf.LIZIZ.LJLILLLLZI);
                            }
                        }
                    } else {
                        yrf.LJIL(YRL.WS_CONNECTING);
                        Handler handler7 = yrf.LJIJ;
                        if (handler7 != null) {
                            handler7.sendEmptyMessage(105);
                        }
                        Handler handler8 = yrf.LJIJI;
                        if (handler8 != null) {
                            handler8.sendEmptyMessage(113);
                        }
                    }
                } else {
                    Handler handler9 = yrf.LJIJ;
                    if (handler9 != null && (obtainMessage = handler9.obtainMessage(122)) != null) {
                        obtainMessage.sendToTarget();
                    }
                }
                yrf.LIZLLL.onStartMessage();
                yrf.LIZ.LIZ.LJFF().LJJIIJ.put("preload_enable", Boolean.valueOf(yrf.LIZIZ.LJLJLJ.LJLIL));
                yrf.LIZ.LIZ.LJFF().LJJIIJ.put("message_size_before_dispatch", Integer.valueOf(((CopyOnWriteArrayList) yrf.LJJIJIIJI).size()));
                yrf.LIZ.LIZ.LJFF().LJJIIJ.put("not_decode_size_before_dispatch", Integer.valueOf(((CopyOnWriteArrayList) yrf.LJJIJIIJIL).size()));
                yrf.LJJ = true;
                break;
            case 102:
                Object obj = p0.obj;
                o.LJII(obj, "null cannot be cast to non-null type com.ss.ugc.live.imsdk.message.config.StopMessageConfig");
                C30176Bsq c30176Bsq = (C30176Bsq) obj;
                yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "stop message manager");
                yrf.LJIIIZ();
                yrf.LJIIL();
                Handler handler10 = yrf.LJIJI;
                if (handler10 != null) {
                    handler10.removeMessages(109);
                }
                yrf.LIZLLL.onStopMessage(c30176Bsq.LJLIL);
                if (c30176Bsq.LJLIL) {
                    yrf.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
                    yrf.LJIL = false;
                    yrf.LJIJJLI = 0L;
                }
                if (c30176Bsq.LJLILLLLZI) {
                    yrf.LJIJI(c30176Bsq.LJLJI);
                    break;
                }
                break;
            case 105:
                yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "connectToWebSocketReuse");
                yrf.LJJIIJZLJL++;
                yrf.LIZLLL.connectToWebSocketReuse();
                yrf.LJIIZILJ(yrf.LIZIZ.LJLILLLLZI);
                YRS LJI = yrf.LIZ.LIZ.LJI();
                int andIncrement = yrf.LJIIZILJ.getAndIncrement();
                Iterator it = ((CopyOnWriteArrayList) LJI.LIZ).iterator();
                while (it.hasNext()) {
                    ((EventListener) it.next()).onConnectingWebSocket(andIncrement);
                }
                break;
            case 106:
                Object obj2 = p0.obj;
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                yrf.LJJ((String) obj2);
                break;
            case 107:
                Object obj3 = p0.obj;
                o.LJII(obj3, "null cannot be cast to non-null type com.ss.ugc.live.sdk.message.data.PayloadItem");
                PayloadItem payloadItem = (PayloadItem) obj3;
                C32087CiZ c32087CiZ = yrf.LIZIZ.LJLJLJ;
                if (!c32087CiZ.LJLIL || yrf.LJJ || c32087CiZ.LJLILLLLZI) {
                    z = true;
                } else {
                    z = false;
                }
                yrf.LIZLLL.decodeWebSocketPayload(payloadItem, z);
                break;
            case 108:
                Object obj4 = p0.obj;
                o.LJII(obj4, "null cannot be cast to non-null type com.ss.ugc.live.sdk.message.data.ProtoApiResult");
                ProtoApiResult protoApiResult = (ProtoApiResult) obj4;
                String str = protoApiResult.internalExt;
                if (str != null) {
                    IMessageWsClient iMessageWsClient = yrf.LIZLLL;
                    byte[] bytes = str.getBytes(PVC.LIZ);
                    o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
                    long j = protoApiResult.logId;
                    iMessageWsClient.sendWebSocketMessage(LiveGiftNewGifterBadgeSetting.DEFAULT, "ack", bytes, j, j);
                    break;
                }
                break;
            case 110:
                long incrementAndGet = yrf.LJIILJJIL.incrementAndGet();
                yrf.LJIILLIIL = String.valueOf(incrementAndGet);
                yrf.LJIILL = System.currentTimeMillis();
                if (yrf.LJIJJLI != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                MessageMonitor LIZJ3 = yrf.LIZ.LIZ.LIZJ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("send heartbeat packet: seqId is ");
                LIZ3.append(yrf.LJIILLIIL);
                LIZ3.append(", needDimensionInfo: ");
                LIZ3.append(z2);
                LIZJ3.log("MessagePortalReuse", X1D.LIZIZ(LIZ3));
                yrf.LIZLLL.sendHeartBeatMsg(incrementAndGet, incrementAndGet, incrementAndGet, z2);
                yrf.LJIJ();
                break;
            case 111:
                Object obj5 = p0.obj;
                o.LJII(obj5, "null cannot be cast to non-null type com.ss.ugc.live.sdk.message.data.PayloadItem");
                PayloadItem payloadItem2 = (PayloadItem) obj5;
                C32087CiZ c32087CiZ2 = yrf.LIZIZ.LJLJLJ;
                if (!c32087CiZ2.LJLIL || yrf.LJJ || c32087CiZ2.LJLILLLLZI) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                yrf.LIZLLL.decodeHostWebSocketPayload(payloadItem2, z3);
                break;
            case 114:
                MessageMonitor LIZJ4 = yrf.LIZ.LIZ.LIZJ();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("start im enter room, cursor: ");
                LIZ4.append(yrf.LJIIIZ);
                LIZJ4.log("MessagePortalReuse", X1D.LIZIZ(LIZ4));
                long nextLong = V0Q.Default.nextLong(1L, Long.MAX_VALUE);
                yrf.LJIJJLI = nextLong;
                yrf.LJJI = System.currentTimeMillis();
                yrf.LIZLLL.sendImEnterRoomMsg(yrf.LJIIIZ, nextLong, nextLong, nextLong);
                long j2 = yrf.LIZIZ.LJLJI;
                yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "trigger in enter room timer");
                yrf.LJIIL();
                Handler handler11 = yrf.LJIJ;
                if (handler11 != null && (obtainMessage2 = handler11.obtainMessage(115)) != null && (handler = yrf.LJIJ) != null) {
                    handler.sendMessageDelayed(obtainMessage2, j2);
                    break;
                }
                break;
            case 115:
                yrf.LJJ("im_enter_room_timeout");
                yrf.LJJII++;
                yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "im enter room timeout");
                break;
            case 116:
                MessageMonitor LIZJ5 = yrf.LIZ.LIZ.LIZJ();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("MSG_WHAT_WS_CONNECTED, isStarted: ");
                LIZ5.append(yrf.LJJ);
                LIZJ5.log("MessagePortalReuse", X1D.LIZIZ(LIZ5));
                if (yrf.LJJ) {
                    yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onWebSocketConnected, isStarted = true, sendInRoomEnterMessage");
                    yrf.LJIJJLI();
                    Handler handler12 = yrf.LJIJI;
                    if (handler12 != null) {
                        handler12.sendEmptyMessageDelayed(113, 1000L);
                    }
                    yrf.LJJIIZ = 1;
                    break;
                } else if (yrf.LJJIIZI && yrf.LIZIZ.LJLJLJ.LJLIL) {
                    yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onWebSocketConnected, enable preload, isRoomReady = true, sendInRoomEnterMessage");
                    yrf.LJIJJLI();
                    Handler handler13 = yrf.LJIJI;
                    if (handler13 != null) {
                        handler13.sendEmptyMessageDelayed(113, 1000L);
                    }
                    yrf.LJJIIZ = 1;
                    yrf.LJJIJ = true;
                    break;
                }
                break;
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                yrf.LJIL(YRL.HTTP);
                yrf.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "release delay disconnect");
                yrf.LJIIJJI();
                yrf.LJIIJ();
                yrf.LJIIIZ();
                yrf.LJIIL();
                yrf.LIZLLL.disconnectFromWebSocket("release_too_long");
                break;
            case 121:
                MessageMonitor LIZJ6 = yrf.LIZ.LIZ.LIZJ();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("preload message, preload enable: ");
                LIZ6.append(yrf.LIZIZ.LJLJLJ.LJLIL);
                LIZ6.append(", preloadAfterWSConnected: ");
                LIZ6.append(yrf.LIZIZ.LJLJLJ.LJLJI);
                LIZ6.append(", isStarted: ");
                LIZ6.append(yrf.LJJ);
                LIZJ6.log("MessagePortalReuse", X1D.LIZIZ(LIZ6));
                if (!yrf.LJJ) {
                    C32087CiZ c32087CiZ3 = yrf.LIZIZ.LJLJLJ;
                    if (c32087CiZ3.LJLIL) {
                        if (c32087CiZ3.LJLJI) {
                            if (yrf.LIZJ == YRL.WS_CONNECTED) {
                                yrf.LJJIIZ++;
                                yrf.LJIJJLI();
                                Handler handler14 = yrf.LJIJI;
                                if (handler14 != null) {
                                    handler14.sendEmptyMessageDelayed(113, 1000L);
                                }
                                yrf.LJJIJ = true;
                            }
                        } else {
                            int i2 = YRN.LIZ[yrf.LIZJ.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        yrf.LJIL(YRL.WS_CONNECTING);
                                        Handler handler15 = yrf.LJIJ;
                                        if (handler15 != null) {
                                            handler15.sendEmptyMessage(105);
                                        }
                                        Handler handler16 = yrf.LJIJI;
                                        if (handler16 != null) {
                                            handler16.sendEmptyMessage(113);
                                        }
                                    } else {
                                        yrf.LJJIIZ++;
                                        yrf.LJIJJLI();
                                        Handler handler17 = yrf.LJIJI;
                                        if (handler17 != null) {
                                            handler17.sendEmptyMessageDelayed(113, 1000L);
                                        }
                                    }
                                } else {
                                    Handler handler18 = yrf.LJIJI;
                                    if (handler18 != null) {
                                        handler18.sendEmptyMessage(113);
                                    }
                                    Handler handler19 = yrf.LJIJ;
                                    if (handler19 != null && !handler19.hasMessages(106)) {
                                        yrf.LJIIZILJ(yrf.LIZIZ.LJLILLLLZI);
                                    }
                                }
                            } else {
                                yrf.LJIL(YRL.WS_CONNECTING);
                                Handler handler20 = yrf.LJIJ;
                                if (handler20 != null) {
                                    handler20.sendEmptyMessage(105);
                                }
                                Handler handler21 = yrf.LJIJI;
                                if (handler21 != null) {
                                    handler21.sendEmptyMessage(113);
                                }
                            }
                            yrf.LJJIJ = true;
                        }
                    }
                }
                yrf.LJJIIZI = true;
                break;
            case 122:
                MessageMonitor LIZJ7 = yrf.LIZ.LIZ.LIZJ();
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("handle preload data, apiResultList: ");
                LIZ7.append(((CopyOnWriteArrayList) yrf.LJJIJIIJIL).size());
                LIZ7.append(", messageList: ");
                LIZ7.append(yrf.LJJIJIIJI);
                LIZJ7.log("MessagePortalReuse", X1D.LIZIZ(LIZ7));
                Iterator it2 = ((CopyOnWriteArrayList) yrf.LJJIJIIJIL).iterator();
                while (it2.hasNext()) {
                    ProtoApiResult protoApiResult2 = (ProtoApiResult) it2.next();
                    yrf.LIZLLL.decodeProtoApiResult(protoApiResult2);
                    YRW LJFF = yrf.LIZ.LIZ.LJFF();
                    List<IMessage> list = protoApiResult2.messages;
                    o.LJIIIIZZ(list, "apiResult.messages");
                    LJFF.LJI(protoApiResult2.delayTimeBeforeDispatch, list);
                }
                ((CopyOnWriteArrayList) yrf.LJJIJIIJIL).clear();
                if (!((CopyOnWriteArrayList) yrf.LJJIJIIJI).isEmpty()) {
                    yrf.LIZ.LIZ.LJFF().LJI(0L, yrf.LJJIJIIJI);
                }
                ((CopyOnWriteArrayList) yrf.LJJIJIIJI).clear();
                break;
        }
        MessageMonitor LIZJ8 = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("handleWorkMessage end what: ");
        LIZ8.append(p0.what);
        LIZJ8.log("MessagePortalReuse", X1D.LIZIZ(LIZ8));
        return true;
    }

    public static final boolean handleMessage$15(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        o.LJIIIZ(p0, "p0");
        YRF yrf = (YRF) iDCallbackS369S0100000_15.l0;
        MessageMonitor LIZJ = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleMessageRequest start what: ");
        LIZ.append(p0.what);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        int i = p0.what;
        if (i != 109) {
            if (i == 113) {
                yrf.LJIILLIIL(MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE);
            }
        } else {
            yrf.LJIILLIIL(MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE);
        }
        MessageMonitor LIZJ2 = yrf.LIZ.LIZ.LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleMessageRequest end what: ");
        LIZ2.append(p0.what);
        LIZJ2.log("MessagePortalReuse", X1D.LIZIZ(LIZ2));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean handleMessage$16(Y.IDCallbackS369S0100000_15 r12, android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCallbackS369S0100000_15.handleMessage$16(Y.IDCallbackS369S0100000_15, android.os.Message):boolean");
    }

    public static final boolean handleMessage$2(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message it) {
        o.LJIIIZ(it, "it");
        if (it.what != 100) {
            return true;
        }
        Iterator<InterfaceC133835Nb> it2 = ((YO7) ((AqS165S0100000_15) iDCallbackS369S0100000_15.l0).l0).LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(((YO7) ((AqS165S0100000_15) iDCallbackS369S0100000_15.l0).l0).LJ().LJIJJ());
        }
        if (((YO7) ((AqS165S0100000_15) iDCallbackS369S0100000_15.l0).l0).LJ().LJJ() != VEEditor.VEState.STARTED) {
            return true;
        }
        ((YO7) ((AqS165S0100000_15) iDCallbackS369S0100000_15.l0).l0).LJFF().sendEmptyMessageDelayed(100, 100L);
        return true;
    }

    public static final boolean handleMessage$3(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message message) {
        if (message.what == 1) {
            C86831Y5z c86831Y5z = (C86831Y5z) iDCallbackS369S0100000_15.l0;
            if (c86831Y5z.LIZJ && !c86831Y5z.LIZ && !c86831Y5z.LIZIZ) {
                try {
                    c86831Y5z.LIZLLL.autoFocus(c86831Y5z.LJFF);
                    c86831Y5z.LIZIZ = true;
                } catch (RuntimeException unused) {
                    c86831Y5z.LIZ();
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean handleMessage$4(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message message) {
        Message obtainMessage;
        Handler handler;
        byte[] bArr;
        float f;
        int i;
        int i2;
        Y5K y5k;
        o.LJIIIZ(message, "message");
        int i3 = message.what;
        if (i3 == 10001) {
            Object obj = message.obj;
            if (obj != null) {
                C86824Y5s c86824Y5s = (C86824Y5s) obj;
                Y5W y5w = (Y5W) iDCallbackS369S0100000_15.l0;
                y5w.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start of handleSingleFrame, ");
                LIZ.append(c86824Y5s.LIZJ);
                LIZ.append(", ");
                LIZ.append(c86824Y5s.LIZIZ);
                X1D.LIZIZ(LIZ);
                if (y5w.LIZIZ && y5w.LJII != null) {
                    try {
                        if (y5w.LJFF && (y5k = y5w.LJII) != null) {
                            y5k.LJLJI = System.currentTimeMillis();
                        }
                        bArr = c86824Y5s.LIZ;
                    } catch (Throwable unused) {
                    }
                    if (bArr == null) {
                        y5w.LJFF = false;
                    } else {
                        int i4 = c86824Y5s.LIZJ;
                        int i5 = c86824Y5s.LIZIZ;
                        int i6 = c86824Y5s.LIZLLL;
                        C76732zl c76732zl = new C76732zl();
                        C76732zl c76732zl2 = new C76732zl();
                        Y5K y5k2 = y5w.LJII;
                        o.LJI(y5k2);
                        Resources resources = y5k2.getResources();
                        o.LJIIIIZZ(resources, "mActivity!!.resources");
                        int i7 = resources.getConfiguration().orientation;
                        int i8 = c86824Y5s.LIZJ;
                        int i9 = c86824Y5s.LIZIZ;
                        if (i7 == 1) {
                            f = 90.0f;
                        } else {
                            f = 180.0f;
                        }
                        Bitmap LIZIZ = C45283Hpv.LIZIZ(bArr, i8, i9, f);
                        C66426Q5e c66426Q5e = y5w.LJI;
                        if (c66426Q5e != null) {
                            if (i7 == 1) {
                                i = c66426Q5e.LIZ(1, i4);
                                C66426Q5e c66426Q5e2 = y5w.LJI;
                                o.LJI(c66426Q5e2);
                                i2 = c66426Q5e2.LIZ(0, i5);
                                C66426Q5e c66426Q5e3 = y5w.LJI;
                                o.LJI(c66426Q5e3);
                                c76732zl.element = c66426Q5e3.LIZ(2, i5);
                                C66426Q5e c66426Q5e4 = y5w.LJI;
                                o.LJI(c66426Q5e4);
                                c76732zl2.element = c66426Q5e4.LIZ(3, i4);
                            } else {
                                i2 = c66426Q5e.LIZ(0, i4);
                                C66426Q5e c66426Q5e5 = y5w.LJI;
                                o.LJI(c66426Q5e5);
                                i = c66426Q5e5.LIZ(1, i5);
                                C66426Q5e c66426Q5e6 = y5w.LJI;
                                o.LJI(c66426Q5e6);
                                c76732zl.element = c66426Q5e6.LIZ(2, i4);
                                C66426Q5e c66426Q5e7 = y5w.LJI;
                                o.LJI(c66426Q5e7);
                                c76732zl2.element = c66426Q5e7.LIZ(3, i5);
                            }
                            if (c76732zl.element > i4 || c76732zl2.element > i5) {
                                c76732zl.element = i4;
                                c76732zl2.element = i5;
                            }
                        } else {
                            c76732zl.element = i4;
                            c76732zl2.element = i5;
                            i = 0;
                            i2 = 0;
                        }
                        if (i5 * i4 <= bArr.length) {
                            RunnableC39007FSp.LIZIZ(new Y5Z(y5w, LIZIZ, y5w.LJFF, i6, i4, i5, i2, i, c76732zl, c76732zl2));
                        }
                        y5w.LJFF = false;
                    }
                }
                Handler handler2 = y5w.LJ;
                if (handler2 != null && (obtainMessage = handler2.obtainMessage(10002)) != null && (handler = y5w.LJ) != null) {
                    handler.sendMessageDelayed(obtainMessage, 1000L);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.pipo.ocr.ocr.view.SourceData");
            }
        } else if (i3 == 10002) {
            ((Y5W) iDCallbackS369S0100000_15.l0).LIZIZ();
        }
        return true;
    }

    public static final boolean handleMessage$5(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        Handler handler;
        Message obtainMessage;
        o.LJIIIZ(p0, "p0");
        YRZ yrz = (YRZ) iDCallbackS369S0100000_15.l0;
        yrz.getClass();
        if (p0.what == 251) {
            Object obj = p0.obj;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.ugc.live.sdk.message.data.IMessage>");
            for (IMessage iMessage : (List) obj) {
                yrz.LIZIZ.LJIIL(iMessage, false);
                if (iMessage.consumedMessageSEI()) {
                    yrz.LIZ.LIZJ().monitorMsgStreamInteractStatus(0, iMessage.getMethodName(), null, iMessage.getDispatchTimeoutMillis(), 0L);
                }
                if (iMessage.getDependRootID() != null && (handler = yrz.LIZLLL) != null && (obtainMessage = handler.obtainMessage(153, iMessage.getDependRootID())) != null) {
                    obtainMessage.sendToTarget();
                }
            }
            return true;
        }
        return true;
    }

    public static final boolean handleMessage$6(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        Handler handler;
        Message obtainMessage;
        Handler handler2;
        Handler handler3;
        Message obtainMessage2;
        Handler handler4;
        String str;
        o.LJIIIZ(p0, "p0");
        YRZ yrz = (YRZ) iDCallbackS369S0100000_15.l0;
        yrz.getClass();
        switch (p0.what) {
            case 151:
                Object obj = p0.obj;
                o.LJII(obj, "null cannot be cast to non-null type com.ss.ugc.live.sdk.message.data.MessageSEI");
                MessageSEI messageSEI = (MessageSEI) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((CopyOnWriteArrayList) yrz.LJ).iterator();
                while (it.hasNext()) {
                    IMessage iMessage = (IMessage) it.next();
                    MessageSEI messageSEI2 = iMessage.getMessageSEI();
                    if (messageSEI2 != null) {
                        if (TextUtils.equals(messageSEI2.uniqueID.messageScene, messageSEI.uniqueID.messageScene) && TextUtils.equals(messageSEI2.uniqueID.primaryID, messageSEI.uniqueID.primaryID)) {
                            MessageMonitor LIZJ = yrz.LIZ.LIZJ();
                            long j = messageSEI.localTimestamp - messageSEI2.localTimestamp;
                            LIZJ.monitorMsgStreamInteractDelay(j, j - iMessage.getDispatchTimeoutMillis(), iMessage.getMethodName());
                            iMessage.removeMessageSEI();
                            if (iMessage.getDependID() != null) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    MessageID messageID = (MessageID) it2.next();
                                    if (TextUtils.equals(messageID.primaryID, iMessage.getDependID().primaryID) && TextUtils.equals(messageID.messageScene, iMessage.getDependID().messageScene)) {
                                        yrz.LIZ.LIZJ().log("MessagePortal", "get MessageSEI and match success, message primaryID=" + messageSEI2.uniqueID.primaryID + " messageScene=" + messageSEI2.uniqueID.messageScene + " methodName=" + iMessage.getMethodName());
                                        return true;
                                    }
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(iMessage);
                            yrz.LJIIIZ(arrayList2);
                            ((CopyOnWriteArrayList) yrz.LJ).remove(iMessage);
                            yrz.LIZ.LIZJ().log("MessagePortal", "get MessageSEI and match success, message primaryID=" + messageSEI2.uniqueID.primaryID + " messageScene=" + messageSEI2.uniqueID.messageScene + " methodName=" + iMessage.getMethodName());
                            return true;
                        }
                        if (iMessage.getDependRootID() != null) {
                            MessageID dependRootID = iMessage.getDependRootID();
                            o.LJIIIIZZ(dependRootID, "message.dependRootID");
                            arrayList.add(dependRootID);
                        }
                    }
                }
                yrz.LIZ.LIZJ().log("MessagePortal", "get MessageSEI and match fail");
                ((CopyOnWriteArrayList) yrz.LJFF).add(messageSEI);
                if (messageSEI.dispatchTimeoutMillis <= 0 || (handler = yrz.LIZLLL) == null || (obtainMessage = handler.obtainMessage(156, messageSEI)) == null || (handler2 = yrz.LIZLLL) == null) {
                    return true;
                }
                handler2.sendMessageDelayed(obtainMessage, messageSEI.dispatchTimeoutMillis);
                return true;
            case 152:
                Object obj2 = p0.obj;
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.ss.ugc.live.sdk.message.data.IMessage>");
                List<IMessage> list = (List) obj2;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = ((CopyOnWriteArrayList) yrz.LJ).iterator();
                while (it3.hasNext()) {
                    IMessage iMessage2 = (IMessage) it3.next();
                    if (iMessage2.getDependRootID() != null) {
                        MessageID dependRootID2 = iMessage2.getDependRootID();
                        o.LJIIIIZZ(dependRootID2, "message.dependRootID");
                        arrayList4.add(dependRootID2);
                    }
                }
                for (IMessage iMessage3 : list) {
                    Iterator it4 = ((CopyOnWriteArrayList) yrz.LJFF).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            MessageSEI messageSEI3 = (MessageSEI) it4.next();
                            MessageSEI messageSEI4 = iMessage3.getMessageSEI();
                            if (messageSEI4 != null && TextUtils.equals(messageSEI4.uniqueID.messageScene, messageSEI3.uniqueID.messageScene) && TextUtils.equals(messageSEI4.uniqueID.primaryID, messageSEI3.uniqueID.primaryID)) {
                                MessageMonitor LIZJ2 = yrz.LIZ.LIZJ();
                                long j2 = messageSEI3.localTimestamp - messageSEI4.localTimestamp;
                                LIZJ2.monitorMsgStreamInteractDelay(j2, j2 - iMessage3.getDispatchTimeoutMillis(), iMessage3.getMethodName());
                                iMessage3.removeMessageSEI();
                                ((CopyOnWriteArrayList) yrz.LJFF).remove(messageSEI3);
                            }
                        }
                    }
                    if (iMessage3.getDependID() != null) {
                        Iterator it5 = arrayList4.iterator();
                        boolean z = false;
                        while (it5.hasNext()) {
                            MessageID messageID2 = (MessageID) it5.next();
                            if (TextUtils.equals(messageID2.messageScene, iMessage3.getDependID().messageScene) && TextUtils.equals(messageID2.primaryID, iMessage3.getDependID().primaryID)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            iMessage3.removeDependID();
                        }
                    }
                    if (iMessage3.getMessageSEI() == null && iMessage3.getDependID() == null) {
                        arrayList3.add(iMessage3);
                    } else {
                        yrz.LIZ.LIZJ().log("MessagePortal", "onFeatureMessage match fail, message methodName=" + iMessage3.getMethodName());
                        ((CopyOnWriteArrayList) yrz.LJ).add(iMessage3);
                        if (iMessage3.getDispatchTimeoutMillis() > 0 && (handler3 = yrz.LIZLLL) != null && (obtainMessage2 = handler3.obtainMessage(154, Long.valueOf(iMessage3.getMessageId()))) != null && (handler4 = yrz.LIZLLL) != null) {
                            handler4.sendMessageDelayed(obtainMessage2, iMessage3.getDispatchTimeoutMillis());
                        }
                        if (iMessage3.getDependRootID() != null) {
                            MessageID dependRootID3 = iMessage3.getDependRootID();
                            o.LJIIIIZZ(dependRootID3, "message.dependRootID");
                            arrayList4.add(dependRootID3);
                        }
                    }
                }
                if (!(!arrayList3.isEmpty())) {
                    return true;
                }
                yrz.LJIIIZ(arrayList3);
                return true;
            case 153:
                MessageID messageID3 = (MessageID) p0.obj;
                if (messageID3 == null) {
                    return true;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = ((CopyOnWriteArrayList) yrz.LJ).iterator();
                while (it6.hasNext()) {
                    IMessage iMessage4 = (IMessage) it6.next();
                    if (iMessage4.getDependID() != null && TextUtils.equals(iMessage4.getDependID().messageScene, messageID3.messageScene) && TextUtils.equals(iMessage4.getDependID().primaryID, messageID3.primaryID)) {
                        iMessage4.removeDependID();
                        if (iMessage4.getMessageSEI() == null) {
                            arrayList5.add(iMessage4);
                            ((CopyOnWriteArrayList) yrz.LJ).remove(iMessage4);
                        }
                    }
                }
                if (!(!arrayList5.isEmpty())) {
                    return true;
                }
                yrz.LJIIIZ(arrayList5);
                return true;
            case 154:
                Object obj3 = p0.obj;
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj3).longValue();
                Iterator it7 = ((CopyOnWriteArrayList) yrz.LJ).iterator();
                while (it7.hasNext()) {
                    IMessage iMessage5 = (IMessage) it7.next();
                    if (iMessage5.getMessageSEI() != null && iMessage5.getMessageId() == longValue) {
                        yrz.LIZ.LIZJ().monitorMsgStreamInteractStatus(1, iMessage5.getMethodName(), null, iMessage5.getDispatchTimeoutMillis(), 0L);
                        MessageSEI messageSEI5 = iMessage5.getMessageSEI();
                        messageSEI5.dispatchTimeoutMillis = iMessage5.getDispatchTimeoutMillis();
                        ((CopyOnWriteArrayList) yrz.LJI).add(messageSEI5);
                        if (((CopyOnWriteArrayList) yrz.LJI).size() > 5) {
                            ListProtector.remove(yrz.LJI, 0);
                        }
                        iMessage5.removeMessageSEI();
                        if (iMessage5.getDependID() == null) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(iMessage5);
                            yrz.LJIIIZ(arrayList6);
                            ((CopyOnWriteArrayList) yrz.LJ).remove(iMessage5);
                        }
                    }
                }
                return true;
            case 155:
            default:
                return true;
            case 156:
                Object obj4 = p0.obj;
                o.LJII(obj4, "null cannot be cast to non-null type com.ss.ugc.live.sdk.message.data.MessageSEI");
                MessageSEI messageSEI6 = (MessageSEI) obj4;
                Iterator it8 = ((CopyOnWriteArrayList) yrz.LJI).iterator();
                long j3 = 0;
                long j4 = 0;
                while (it8.hasNext()) {
                    MessageSEI messageSEI7 = (MessageSEI) it8.next();
                    if (TextUtils.equals(messageSEI7.uniqueID.messageScene, messageSEI6.uniqueID.messageScene) && TextUtils.equals(messageSEI7.uniqueID.primaryID, messageSEI6.uniqueID.primaryID)) {
                        j3 = messageSEI6.localTimestamp - messageSEI7.localTimestamp;
                        j4 = j3 - messageSEI7.dispatchTimeoutMillis;
                        ((CopyOnWriteArrayList) yrz.LJI).remove(messageSEI7);
                    }
                }
                MessageMonitor LIZJ3 = yrz.LIZ.LIZJ();
                MessageID messageID4 = messageSEI6.uniqueID;
                if (messageID4 != null) {
                    str = messageID4.messageScene;
                } else {
                    str = null;
                }
                LIZJ3.monitorMsgStreamInteractStatus(2, null, str, j3, j4);
                ((CopyOnWriteArrayList) yrz.LJFF).remove(messageSEI6);
                return true;
        }
    }

    public static final boolean handleMessage$7(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        C87390YRm c87390YRm;
        o.LJIIIZ(p0, "p0");
        YRX yrx = (YRX) iDCallbackS369S0100000_15.l0;
        while (!((ArrayList) yrx.LJ).isEmpty()) {
            synchronized (yrx) {
                c87390YRm = (C87390YRm) ORS.LJJLJLI(yrx.LJ);
            }
            if (c87390YRm != null) {
                if (c87390YRm.LJLJI) {
                    if (c87390YRm.LJLJJI) {
                        yrx.LIZIZ.LJIIIZ(c87390YRm.LJLIL, true);
                    } else {
                        yrx.LIZIZ.LJIIL(c87390YRm.LJLIL, true);
                    }
                } else {
                    yrx.LIZIZ.LJIIL(c87390YRm.LJLIL, true);
                    if (c87390YRm.LJLILLLLZI) {
                        yrx.LIZ.LIZJ().monitorMsgP2pDispatchDirectly(((ArrayList) yrx.LJ).size(), c87390YRm.LJLIL.getMethodName(), SystemClock.elapsedRealtime() - c87390YRm.LJLIL.getLocalTimestamp(), c87390YRm.LJLIL.getMessageFrom(), true, yrx.LIZIZ.LJJ, 5, c87390YRm.LJLIL.getExtraParams());
                    }
                }
            }
        }
        return true;
    }

    public static final boolean handleMessage$8(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        o.LJIIIZ(p0, "p0");
        C87381YRd c87381YRd = (C87381YRd) iDCallbackS369S0100000_15.l0;
        c87381YRd.getClass();
        switch (p0.what) {
            case 211:
                Object obj = p0.obj;
                o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.ugc.live.sdk.message.data.IMessage>");
                List<IMessage> list = (List) obj;
                MessageMonitor LIZJ = c87381YRd.LIZ.LIZJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("async dispatch thread receive message list, size is ");
                LIZ.append(list.size());
                LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
                for (IMessage iMessage : list) {
                    if (!c87381YRd.LIZIZ.LJIILJJIL.onMessage(iMessage)) {
                        if (c87381YRd.LIZIZ.LJIIJJI(iMessage)) {
                            c87381YRd.LIZIZ.LJIIL(iMessage, false);
                            c87381YRd.LIZ.LIZJ().monitorMsgP2pDispatchDirectly(list.size(), iMessage.getMethodName(), SystemClock.elapsedRealtime() - iMessage.getLocalTimestamp(), iMessage.getMessageFrom(), false, c87381YRd.LIZIZ.LJJ, 6, iMessage.getExtraParams());
                        } else {
                            ((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).add(iMessage);
                        }
                    }
                }
                int i = (int) (c87381YRd.LJFF / c87381YRd.LJ);
                MessageMonitor LIZJ2 = c87381YRd.LIZ.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("expect dispatch count: ");
                LIZ2.append(i);
                LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
                int size = ((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size() / i;
                c87381YRd.LJII = size;
                int i2 = c87381YRd.LJI;
                if (size < i2) {
                    size = i2;
                }
                c87381YRd.LJII = size;
                c87381YRd.LIZ.LIZJ().monitorMsgDispatchSize(c87381YRd.LJII, ((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size(), false, c87381YRd.LJFF, c87381YRd.LJII, c87381YRd.LIZ.context().LIZIZ, c87381YRd.LIZ.context().LIZJ, 6);
                MessageMonitor LIZJ3 = c87381YRd.LIZ.LIZJ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("next time dispatch size: ");
                LIZ3.append(c87381YRd.LJII);
                LIZJ3.log("MessagePortal", X1D.LIZIZ(LIZ3));
                if (c87381YRd.LIZLLL.hasMessages(212)) {
                    return true;
                }
                c87381YRd.LIZLLL.sendEmptyMessage(212);
                return true;
            case 212:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                MessageMonitor LIZJ4 = c87381YRd.LIZ.LIZJ();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("before dispatch, message queue size is ");
                LIZ4.append(((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size());
                LIZJ4.log("MessagePortal", X1D.LIZIZ(LIZ4));
                int size2 = ((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size();
                int i3 = c87381YRd.LJII;
                if (size2 < i3) {
                    i3 = ((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size();
                }
                try {
                    List<IMessage> list2 = c87381YRd.LJIIIIZZ;
                    List<? extends IMessage> subList = ((CopyOnWriteArrayList) list2).subList(0, Math.min(i3, ((CopyOnWriteArrayList) list2).size()));
                    YRW yrw = c87381YRd.LIZIZ;
                    int min = Math.min(yrw.LJIIIIZZ.LIZ(subList, yrw, false), subList.size());
                    List<IMessage> list3 = c87381YRd.LJIIIIZZ;
                    List<? extends IMessage> subList2 = ((CopyOnWriteArrayList) list3).subList(0, Math.min(min, ((CopyOnWriteArrayList) list3).size()));
                    c87381YRd.LIZ.LJI().LJIIIZ(c87381YRd.LJIIIIZZ, subList2);
                    subList2.clear();
                } catch (Exception e) {
                    MessageMonitor LIZJ5 = c87381YRd.LIZ.LIZJ();
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("messageList clear error:");
                    LIZ5.append(e);
                    LIZJ5.log("MessagePortal", X1D.LIZIZ(LIZ5));
                }
                MessageMonitor LIZJ6 = c87381YRd.LIZ.LIZJ();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("after dispatch, message queue size is ");
                LIZ6.append(((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size());
                LIZJ6.log("MessagePortal", X1D.LIZIZ(LIZ6));
                if (((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size() > 0 && !c87381YRd.LIZLLL.hasMessages(212)) {
                    c87381YRd.LIZLLL.sendEmptyMessageDelayed(212, c87381YRd.LJ);
                }
                c87381YRd.LIZ.LIZJ().monitorMsgDispatchListDelay(SystemClock.elapsedRealtime() - elapsedRealtime, i3, ((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).size(), 6);
                return true;
            case 213:
                ((CopyOnWriteArrayList) c87381YRd.LJIIIIZZ).clear();
                c87381YRd.LIZIZ.LJIILJJIL.LIZIZ();
                return true;
            default:
                return true;
        }
    }

    public static final boolean handleMessage$9(IDCallbackS369S0100000_15 iDCallbackS369S0100000_15, Message p0) {
        int i;
        int i2;
        o.LJIIIZ(p0, "p0");
        C87383YRf c87383YRf = (C87383YRf) iDCallbackS369S0100000_15.l0;
        c87383YRf.getClass();
        int i3 = p0.what;
        if (i3 != 201) {
            if (i3 != 205) {
                if (i3 != 206) {
                    return true;
                }
                ((CopyOnWriteArrayList) c87383YRf.LIZLLL).clear();
                c87383YRf.LIZIZ.LJIILJJIL.LIZIZ();
                return true;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MessageMonitor LIZJ = c87383YRf.LIZ.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("before dispatch, message queue size is ");
            LIZ.append(((CopyOnWriteArrayList) c87383YRf.LIZLLL).size());
            LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
            if (((CopyOnWriteArrayList) c87383YRf.LIZLLL).size() < c87383YRf.LJ) {
                i2 = ((CopyOnWriteArrayList) c87383YRf.LIZLLL).size();
            } else {
                i2 = c87383YRf.LJ;
            }
            ArrayList arrayList = new ArrayList(((CopyOnWriteArrayList) c87383YRf.LIZLLL).subList(0, i2));
            YRW yrw = c87383YRf.LIZIZ;
            int min = Math.min(yrw.LJIIIIZZ.LIZ(arrayList, yrw, false), arrayList.size());
            try {
                List<IMessage> list = c87383YRf.LIZLLL;
                List<? extends IMessage> subList = ((CopyOnWriteArrayList) list).subList(0, Math.min(min, ((CopyOnWriteArrayList) list).size()));
                c87383YRf.LIZ.LJI().LJIIIZ(c87383YRf.LIZLLL, subList);
                subList.clear();
            } catch (Exception e) {
                MessageMonitor LIZJ2 = c87383YRf.LIZ.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("messageList clear error:");
                LIZ2.append(e);
                LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
            }
            MessageMonitor LIZJ3 = c87383YRf.LIZ.LIZJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("after dispatch, message queue size is ");
            LIZ3.append(((CopyOnWriteArrayList) c87383YRf.LIZLLL).size());
            LIZJ3.log("MessagePortal", X1D.LIZIZ(LIZ3));
            if (((CopyOnWriteArrayList) c87383YRf.LIZLLL).size() > 0) {
                c87383YRf.LJIIIZ(true);
            }
            c87383YRf.LIZ.LIZJ().monitorMsgDispatchListDelay(SystemClock.elapsedRealtime() - elapsedRealtime, i2, ((CopyOnWriteArrayList) c87383YRf.LIZLLL).size(), 0);
            return true;
        }
        Object obj = p0.obj;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<com.ss.ugc.live.sdk.message.data.IMessage>");
        List<IMessage> list2 = (List) obj;
        MessageMonitor LIZJ4 = c87383YRf.LIZ.LIZJ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("main thread receive message list, size is ");
        LIZ4.append(list2.size());
        LIZJ4.log("MessagePortal", X1D.LIZIZ(LIZ4));
        for (IMessage iMessage : list2) {
            if (!c87383YRf.LIZIZ.LJIILJJIL.onMessage(iMessage)) {
                if (c87383YRf.LIZIZ.LJIIJJI(iMessage)) {
                    c87383YRf.LIZIZ.LJIIL(iMessage, false);
                    c87383YRf.LIZ.LIZJ().monitorMsgP2pDispatchDirectly(list2.size(), iMessage.getMethodName(), SystemClock.elapsedRealtime() - iMessage.getLocalTimestamp(), iMessage.getMessageFrom(), false, c87383YRf.LIZIZ.LJJ, 0, iMessage.getExtraParams());
                } else {
                    ((CopyOnWriteArrayList) c87383YRf.LIZLLL).add(iMessage);
                }
            }
        }
        int size = ((CopyOnWriteArrayList) c87383YRf.LIZLLL).size();
        MessageMonitor LIZJ5 = c87383YRf.LIZ.LIZJ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("message queue size is: ");
        LIZ5.append(size);
        LIZJ5.log("MessagePortal", X1D.LIZIZ(LIZ5));
        long j = c87383YRf.LIZ.context().LIZLLL + c87383YRf.LIZ.context().LJ;
        if (j < 200) {
            j = 200;
        }
        int i4 = (int) ((100 + j) / 200);
        MessageMonitor LIZJ6 = c87383YRf.LIZ.LIZJ();
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("expect dispatch count: ");
        LIZ6.append(i4);
        LIZJ6.log("MessagePortal", X1D.LIZIZ(LIZ6));
        int i5 = size / i4;
        if (i5 >= 1) {
            i = ((i4 / 2) + size) / i4;
        } else {
            i = 1;
        }
        c87383YRf.LJ = i;
        c87383YRf.LIZ.LIZJ().monitorMsgDispatchSize(c87383YRf.LJ, size, false, j, i5, c87383YRf.LIZ.context().LIZIZ, c87383YRf.LIZ.context().LIZJ, 0);
        MessageMonitor LIZJ7 = c87383YRf.LIZ.LIZJ();
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("next time dispatch size: ");
        LIZ7.append(c87383YRf.LJ);
        LIZJ7.log("MessagePortal", X1D.LIZIZ(LIZ7));
        c87383YRf.LJIIIZ(false);
        return true;
    }
}
