package Y;

import X.AbstractC64084PDc;
import X.AbstractC66673QEr;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C09970aH;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C32287Cln;
import X.C32420Cnw;
import X.C32425Co1;
import X.C36616EYq;
import X.C36922EeM;
import X.C36929EeT;
import X.C38354F3m;
import X.C39171FYx;
import X.C39223FaN;
import X.C3C4;
import X.C3C5;
import X.C40700FyC;
import X.C43001GuD;
import X.C48852JFg;
import X.C61447O9r;
import X.C62848OlY;
import X.C63937P7l;
import X.C64009PAf;
import X.C64010PAg;
import X.C64013PAj;
import X.C64014PAk;
import X.C64021PAr;
import X.C64028PAy;
import X.C64071PCp;
import X.C64074PCs;
import X.C64089PDh;
import X.C64241PJd;
import X.C64246PJi;
import X.C64537PUn;
import X.C64653PYz;
import X.C64797Pbt;
import X.C64862Pcw;
import X.C64863Pcx;
import X.C64866Pd0;
import X.C64868Pd2;
import X.C64869Pd3;
import X.C65073PgL;
import X.C65080PgS;
import X.C65102Pgo;
import X.C65465Pmf;
import X.C65472Pmm;
import X.C65825PsT;
import X.C66037Pvt;
import X.C66059PwF;
import X.C66119PxD;
import X.C66120PxE;
import X.C66455Q6h;
import X.C66509Q8j;
import X.C66629QCz;
import X.C66658QEc;
import X.C66668QEm;
import X.C66750QHq;
import X.C66758QHy;
import X.C66787QJb;
import X.C66790QJe;
import X.C66792QJg;
import X.C66793QJh;
import X.C66799QJn;
import X.C66810QJy;
import X.C66811QJz;
import X.C67022QSc;
import X.C67025QSf;
import X.C67032QSm;
import X.C67058QTm;
import X.C67060QTo;
import X.C67061QTp;
import X.C67098QVa;
import X.C67101QVd;
import X.C67201QYz;
import X.C69023R7b;
import X.C6Y7;
import X.C78555UsJ;
import X.C78866UxK;
import X.C78939UyV;
import X.C78946Uyc;
import X.C7WD;
import X.EnumC67117QVt;
import X.HandlerC66060PwG;
import X.IIO;
import X.InterfaceC63938P7m;
import X.InterfaceC64090PDi;
import X.InterfaceC64518PTu;
import X.InterfaceC65104Pgq;
import X.InterfaceC66068PwO;
import X.InterfaceC66818QKg;
import X.InterfaceC66984QQq;
import X.InterfaceC67066QTu;
import X.InterfaceC67352kd;
import X.JFZ;
import X.JGC;
import X.ORZ;
import X.PBB;
import X.PBD;
import X.PBE;
import X.PD2;
import X.PD6;
import X.PE4;
import X.PE8;
import X.PEF;
import X.PH4;
import X.PH6;
import X.PH9;
import X.PKU;
import X.PSG;
import X.PSL;
import X.PT6;
import X.PU0;
import X.PU1;
import X.PU2;
import X.PXW;
import X.Q3U;
import X.Q3W;
import X.Q3X;
import X.Q3Y;
import X.Q6Y;
import X.QA1;
import X.QAT;
import X.QBX;
import X.QE2;
import X.QET;
import X.QF3;
import X.QI3;
import X.QIK;
import X.QIQ;
import X.QIX;
import X.QJ1;
import X.QJJ;
import X.QJT;
import X.QKU;
import X.QKW;
import X.QMH;
import X.QMI;
import X.QML;
import X.QMV;
import X.QP6;
import X.QPG;
import X.QR4;
import X.QRG;
import X.QRM;
import X.QRN;
import X.QRO;
import X.QRQ;
import X.QTC;
import X.QTP;
import X.QTX;
import X.QU3;
import X.QU6;
import X.QVC;
import X.QVF;
import X.QVG;
import X.QVK;
import X.QVL;
import X.QVM;
import X.QVR;
import X.QVX;
import X.QVZ;
import X.QW3;
import X.R40;
import X.R41;
import X.RBW;
import X.RC4;
import X.RunnableC39007FSp;
import X.ThreadFactoryC64063PCh;
import X.ThreadFactoryC64344PNc;
import X.WM7;
import X.X1D;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.ServiceParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.crash.Npth;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.jsb.JsbEventFetcherImpl;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.sync.SyncSDK;
import com.bytedance.sync.model.SubscribeResponse;
import com.bytedance.sync.model.Topic;
import com.bytedance.sync.settings.SettingsV2;
import com.bytedance.sync.v2.compensate.CompensatorImpl;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.ALog;
import com.ss.android.newmedia.message.MessageReceiverService;
import com.ss.android.newmedia.redbadge.RedbadgeHandler;
import com.ss.android.ug.bus.UgCallbackCenter;
import com.ss.android.ugc.aweme.legoImp.task.CleanModel;
import com.ss.android.ugc.aweme.legoImp.task.LogCleanTask;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.edit.YoutubePresenter;
import com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.ttm.player.AJMediaCodec;
import com.ss.ttm.player.AJVoice;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS30S0200000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0171 A[Catch: all -> 0x024c, TryCatch #0 {all -> 0x024c, blocks: (B:3:0x0017, B:4:0x002e, B:6:0x0034, B:9:0x004c, B:10:0x0050, B:12:0x0056, B:17:0x0068, B:21:0x007b, B:24:0x0098, B:27:0x0149, B:29:0x0171, B:30:0x0177, B:32:0x0184, B:34:0x0188, B:36:0x01c0, B:39:0x01cd, B:42:0x01de, B:44:0x01e4, B:47:0x022f, B:49:0x0243, B:51:0x0247, B:58:0x01e8, B:60:0x01ee, B:62:0x01fc, B:64:0x0224, B:66:0x0228, B:67:0x01d9, B:70:0x00a3, B:72:0x00c5, B:73:0x00cb, B:75:0x00d4, B:76:0x00d6, B:78:0x00fa, B:81:0x0106, B:83:0x0116, B:85:0x011c, B:86:0x0120, B:88:0x0126, B:90:0x013a, B:92:0x013e, B:94:0x0142, B:99:0x0070), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022f A[Catch: all -> 0x024c, TryCatch #0 {all -> 0x024c, blocks: (B:3:0x0017, B:4:0x002e, B:6:0x0034, B:9:0x004c, B:10:0x0050, B:12:0x0056, B:17:0x0068, B:21:0x007b, B:24:0x0098, B:27:0x0149, B:29:0x0171, B:30:0x0177, B:32:0x0184, B:34:0x0188, B:36:0x01c0, B:39:0x01cd, B:42:0x01de, B:44:0x01e4, B:47:0x022f, B:49:0x0243, B:51:0x0247, B:58:0x01e8, B:60:0x01ee, B:62:0x01fc, B:64:0x0224, B:66:0x0228, B:67:0x01d9, B:70:0x00a3, B:72:0x00c5, B:73:0x00cb, B:75:0x00d4, B:76:0x00d6, B:78:0x00fa, B:81:0x0106, B:83:0x0116, B:85:0x011c, B:86:0x0120, B:88:0x0126, B:90:0x013a, B:92:0x013e, B:94:0x0142, B:99:0x0070), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9 A[Catch: all -> 0x024c, TryCatch #0 {all -> 0x024c, blocks: (B:3:0x0017, B:4:0x002e, B:6:0x0034, B:9:0x004c, B:10:0x0050, B:12:0x0056, B:17:0x0068, B:21:0x007b, B:24:0x0098, B:27:0x0149, B:29:0x0171, B:30:0x0177, B:32:0x0184, B:34:0x0188, B:36:0x01c0, B:39:0x01cd, B:42:0x01de, B:44:0x01e4, B:47:0x022f, B:49:0x0243, B:51:0x0247, B:58:0x01e8, B:60:0x01ee, B:62:0x01fc, B:64:0x0224, B:66:0x0228, B:67:0x01d9, B:70:0x00a3, B:72:0x00c5, B:73:0x00cb, B:75:0x00d4, B:76:0x00d6, B:78:0x00fa, B:81:0x0106, B:83:0x0116, B:85:0x011c, B:86:0x0120, B:88:0x0126, B:90:0x013a, B:92:0x013e, B:94:0x0142, B:99:0x0070), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5 A[Catch: all -> 0x024c, TryCatch #0 {all -> 0x024c, blocks: (B:3:0x0017, B:4:0x002e, B:6:0x0034, B:9:0x004c, B:10:0x0050, B:12:0x0056, B:17:0x0068, B:21:0x007b, B:24:0x0098, B:27:0x0149, B:29:0x0171, B:30:0x0177, B:32:0x0184, B:34:0x0188, B:36:0x01c0, B:39:0x01cd, B:42:0x01de, B:44:0x01e4, B:47:0x022f, B:49:0x0243, B:51:0x0247, B:58:0x01e8, B:60:0x01ee, B:62:0x01fc, B:64:0x0224, B:66:0x0228, B:67:0x01d9, B:70:0x00a3, B:72:0x00c5, B:73:0x00cb, B:75:0x00d4, B:76:0x00d6, B:78:0x00fa, B:81:0x0106, B:83:0x0116, B:85:0x011c, B:86:0x0120, B:88:0x0126, B:90:0x013a, B:92:0x013e, B:94:0x0142, B:99:0x0070), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4 A[Catch: all -> 0x024c, TryCatch #0 {all -> 0x024c, blocks: (B:3:0x0017, B:4:0x002e, B:6:0x0034, B:9:0x004c, B:10:0x0050, B:12:0x0056, B:17:0x0068, B:21:0x007b, B:24:0x0098, B:27:0x0149, B:29:0x0171, B:30:0x0177, B:32:0x0184, B:34:0x0188, B:36:0x01c0, B:39:0x01cd, B:42:0x01de, B:44:0x01e4, B:47:0x022f, B:49:0x0243, B:51:0x0247, B:58:0x01e8, B:60:0x01ee, B:62:0x01fc, B:64:0x0224, B:66:0x0228, B:67:0x01d9, B:70:0x00a3, B:72:0x00c5, B:73:0x00cb, B:75:0x00d4, B:76:0x00d6, B:78:0x00fa, B:81:0x0106, B:83:0x0116, B:85:0x011c, B:86:0x0120, B:88:0x0126, B:90:0x013a, B:92:0x013e, B:94:0x0142, B:99:0x0070), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126 A[Catch: all -> 0x024c, LOOP:2: B:86:0x0120->B:88:0x0126, LOOP_END, TryCatch #0 {all -> 0x024c, blocks: (B:3:0x0017, B:4:0x002e, B:6:0x0034, B:9:0x004c, B:10:0x0050, B:12:0x0056, B:17:0x0068, B:21:0x007b, B:24:0x0098, B:27:0x0149, B:29:0x0171, B:30:0x0177, B:32:0x0184, B:34:0x0188, B:36:0x01c0, B:39:0x01cd, B:42:0x01de, B:44:0x01e4, B:47:0x022f, B:49:0x0243, B:51:0x0247, B:58:0x01e8, B:60:0x01ee, B:62:0x01fc, B:64:0x0224, B:66:0x0228, B:67:0x01d9, B:70:0x00a3, B:72:0x00c5, B:73:0x00cb, B:75:0x00d4, B:76:0x00d6, B:78:0x00fa, B:81:0x0106, B:83:0x0116, B:85:0x011c, B:86:0x0120, B:88:0x0126, B:90:0x013a, B:92:0x013e, B:94:0x0142, B:99:0x0070), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0200000_11.LIZ$0():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                run$47(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                run$48(this);
                return;
            case C61447O9r.LJIIJ:
                run$49(this);
                return;
            case 50:
                run$50(this);
                return;
            case 51:
                run$51(this);
                return;
            case 52:
                run$52(this);
                return;
            case 53:
                run$53(this);
                return;
            case 54:
                run$54(this);
                return;
            case 55:
                run$55(this);
                return;
            case 56:
                run$56(this);
                return;
            case 57:
                run$57(this);
                return;
            case 58:
                run$58(this);
                return;
            case 59:
                run$59(this);
                return;
            case 60:
                run$60(this);
                return;
            case 61:
                run$61(this);
                return;
            case BaseNotice.CREATOR /* 62 */:
                run$62(this);
                return;
            case 63:
                run$63(this);
                return;
            case 64:
                run$64(this);
                return;
            case 65:
                run$65(this);
                return;
            case 66:
                run$66(this);
                return;
            case 67:
                run$67(this);
                return;
            case 68:
                run$68(this);
                return;
            case 69:
                run$69(this);
                return;
            case 70:
                run$70(this);
                return;
            case 71:
                run$71(this);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                run$72(this);
                return;
            case 73:
                run$73(this);
                return;
            case 74:
                run$74(this);
                return;
            case 75:
                run$75(this);
                return;
            case 76:
                run$76(this);
                return;
            case 77:
                run$77(this);
                return;
            case 78:
                run$78(this);
                return;
            case 79:
                run$79(this);
                return;
            case 80:
                run$80(this);
                return;
            case 81:
                run$81(this);
                return;
            case 82:
                run$82(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        WsChannelService wsChannelService = (WsChannelService) this.l1;
        Intent intent = (Intent) this.l0;
        wsChannelService.getClass();
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.bytedance.article.wschannel.appstate".equals(action)) {
            int intExtra = intent.getIntExtra("app_state", -1);
            Message message = new Message();
            message.what = 2;
            message.arg1 = intExtra;
            wsChannelService.handleMsg(message);
            return;
        }
        if ("com.bytedance.article.wschannel.networkstate".equals(action)) {
            int intExtra2 = intent.getIntExtra("network_state", -1);
            Message message2 = new Message();
            message2.what = 3;
            message2.arg1 = intExtra2;
            wsChannelService.handleMsg(message2);
            return;
        }
        if (!"com.bytedance.article.wschannel.mem_trim".equals(action)) {
            return;
        }
        intent.getIntExtra("mem_trim", -1);
    }

    public final void LIZ$10() {
        if (((C66793QJh) this.l1).LJ.get()) {
            C66792QJg c66792QJg = ((C66793QJh) this.l1).LIZIZ;
            C48852JFg c48852JFg = (C48852JFg) this.l0;
            c66792QJg.LIZIZ(c48852JFg);
            c66792QJg.LJLJI.removeMessages(1235);
            if (c66792QJg.LJLJI.hasMessages(1234)) {
                c66792QJg.LJLJI.removeMessages(1234);
                Handler handler = c66792QJg.LJLJI;
                handler.sendMessage(handler.obtainMessage(1234, Boolean.TRUE));
                return;
            }
            C66790QJe c66790QJe = new C66790QJe(c48852JFg, c66792QJg.LJLIL, c66792QJg.LJLJJI, c66792QJg.LJLILLLLZI);
            c66792QJg.LJ(c66790QJe, false);
            c66792QJg.LJLJL = c66790QJe;
            if (!c66792QJg.LJLIL.LJIILL || !c66792QJg.LJLJJLL.get()) {
                return;
            }
            c66792QJg.LIZ(new C66787QJb(c66792QJg.LJLIL, c48852JFg));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("not start yet,start it ");
        LIZ.append((C48852JFg) this.l0);
        X1D.LIZIZ(LIZ);
        ((C66793QJh) this.l1).LIZIZ.LIZIZ((C48852JFg) this.l0);
        ((C66793QJh) this.l1).LJIIJJI(true);
        ((C66793QJh) this.l1).LJIIL();
    }

    public final void LIZ$11() {
        List<String> list;
        int i = 0;
        ((QI3) this.l0).LJJIZ.LJIIIZ(0, C39171FYx.LIZ, "Start to do migrate stay duration data task...", new Object[0]);
        SQLiteDatabase writableDatabase = new QJ1(((QI3) this.l0).LJIIJ).getWritableDatabase();
        int i2 = 2;
        HashMap hashMap = new HashMap(2);
        Cursor cursor = null;
        try {
            try {
                writableDatabase.beginTransaction();
                cursor = writableDatabase.rawQuery("select p.name, p.duration, s.value, s.timestamp from page p left join session as s on p.session_id  = s._id where s.value is not null and s.timestamp is not null", null);
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(i);
                        long j = cursor.getLong(1);
                        String string2 = cursor.getString(i2);
                        long j2 = cursor.getLong(3);
                        JSONObject jSONObject = (JSONObject) hashMap.get(string2);
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        jSONObject.put("duration", jSONObject.optLong("duration", 0L) + j);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
                        jSONObject.put("datetime", simpleDateFormat.format(new Date(j2)));
                        jSONObject.put("session_id", string2);
                        jSONObject.put("local_time_ms", j2);
                        if (!TextUtils.isEmpty(((QI3) this.l0).LIZIZ())) {
                            jSONObject.put("ab_sdk_version", ((QI3) this.l0).LIZIZ());
                        }
                        if (!TextUtils.isEmpty(((QI3) this.l0).LJI())) {
                            jSONObject.put("user_unique_id", ((QI3) this.l0).LJI());
                        }
                        jSONObject.put("tea_event_index", 0);
                        JSONArray optJSONArray = jSONObject.optJSONArray("activites");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                        }
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(0, string);
                        jSONArray.put(1, j);
                        optJSONArray.put(jSONArray);
                        jSONObject.put("activites", optJSONArray);
                        hashMap.put(string2, jSONObject);
                        i = 0;
                        i2 = 2;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            ((QI3) this.l0).LJJIZ.LJIILL(C39171FYx.LIZ, "Cannot migrate old applog sd data", th, new Object[0]);
                            ((QI3) this.l0).LIZLLL.LJ(QIQ.migrate_old, QIK.f_migrate_old_sd_failed);
                            if (writableDatabase.inTransaction()) {
                                writableDatabase.endTransaction();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            try {
                                writableDatabase.close();
                            } catch (Throwable unused) {
                                return;
                            }
                        } finally {
                        }
                    }
                }
                QIX qix = ((QI3) this.l0).LJJIZ;
                list = C39171FYx.LIZ;
                qix.LJIIIZ(0, list, "Total {} terminate found.", Integer.valueOf(hashMap.size()));
            } catch (Throwable unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (hashMap.isEmpty()) {
            ((QI3) this.l0).LJJIZ.LJIIIZ(0, list, "No terminate found.", new Object[0]);
            writableDatabase.setTransactionSuccessful();
            if (writableDatabase.inTransaction()) {
                writableDatabase.endTransaction();
            }
            try {
                cursor.close();
            } catch (Throwable unused3) {
            }
            try {
                writableDatabase.close();
                return;
            } catch (Throwable unused4) {
                return;
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            jSONArray2.put((JSONObject) it.next());
            ((QI3) this.l0).LIZLLL.LJ(QIQ.terminate, QIK.init);
        }
        QI3 qi3 = (QI3) this.l0;
        String str = qi3.LJIIIZ;
        JSONObject LIZLLL = qi3.LIZLLL();
        C66750QHq c66750QHq = new C66750QHq();
        c66750QHq.LJIIL(0L);
        c66750QHq.LJLLJ = str;
        c66750QHq.LLIIIILZ = LIZLLL;
        c66750QHq.LLILLJJLI = 11;
        c66750QHq.LLIIII = jSONArray2;
        ((C66758QHy) this.l1).LJ(c66750QHq, true, null, null);
        QIX qix2 = ((QI3) this.l0).LJJIZ;
        List<String> list2 = C39171FYx.LIZ;
        qix2.LJIIIZ(0, list2, "Pack saved.", new Object[0]);
        ((QI3) this.l0).LJJIZ.LJIIIZ(0, list2, "Old {} pages deleted.", Integer.valueOf(writableDatabase.delete("page", null, null)));
        writableDatabase.setTransactionSuccessful();
        if (writableDatabase.inTransaction()) {
            writableDatabase.endTransaction();
        }
        cursor.close();
        writableDatabase.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0238 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0245 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0252 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0264 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135 A[Catch: all -> 0x02ad, TRY_ENTER, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0389 A[Catch: all -> 0x038c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x038c, blocks: (B:131:0x0389, B:189:0x0355), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0397 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227 A[Catch: all -> 0x02ad, TryCatch #4 {all -> 0x02ad, blocks: (B:11:0x006d, B:16:0x007e, B:18:0x0085, B:19:0x0089, B:21:0x0090, B:22:0x0099, B:24:0x00a0, B:25:0x00a4, B:28:0x00b6, B:30:0x00c0, B:31:0x00c5, B:33:0x00d2, B:34:0x00d6, B:35:0x00e0, B:37:0x00ee, B:38:0x00f5, B:40:0x00fd, B:41:0x0101, B:43:0x0109, B:44:0x010d, B:46:0x0113, B:47:0x0117, B:51:0x0139, B:53:0x0149, B:55:0x0153, B:57:0x015e, B:58:0x0165, B:60:0x016b, B:61:0x0172, B:63:0x01a3, B:64:0x01a7, B:66:0x01b0, B:67:0x01b4, B:69:0x01bf, B:70:0x01c3, B:72:0x01cc, B:73:0x01d0, B:76:0x0274, B:77:0x0278, B:79:0x0286, B:80:0x0290, B:81:0x0295, B:83:0x01db, B:85:0x01fb, B:88:0x0203, B:91:0x020b, B:92:0x020f, B:94:0x021a, B:95:0x021e, B:97:0x0227, B:98:0x022b, B:100:0x0238, B:101:0x023c, B:103:0x0245, B:104:0x0249, B:106:0x0252, B:107:0x0256, B:109:0x0264, B:110:0x026e, B:111:0x0135, B:117:0x00b0), top: B:10:0x006d, outer: #11 }] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.QHy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$12() {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0200000_11.LIZ$12():void");
    }

    public final void LIZ$13() {
        int i = Q3X.LIZ[((Q3Y) this.l0).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        synchronized (Q3U.LJ) {
                        }
                    }
                } else {
                    Q3U.LIZLLL.LLLLZIL();
                }
            } else {
                Q3U.LIZJ.LLLLZIL();
            }
        } else {
            Q3U.LIZIZ.LLLLZIL();
        }
        Q3W q3w = (Q3W) this.l1;
        if (q3w != null) {
            q3w.onSuccess();
        }
    }

    public final void LIZ$14() {
        int i;
        IWsChannelClient iWsChannelClient;
        boolean sendMessage;
        boolean z = true;
        if (((Message) this.l0).what != 1 && !((QMH) this.l1).LJLJLJ.isEnable()) {
            return;
        }
        QMH qmh = (QMH) this.l1;
        Message message = (Message) this.l0;
        qmh.getClass();
        try {
            if (message.what == 0) {
                C78946Uyc.LJJIFFI("5->doHandleMsg msg right");
            }
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        try {
            i = message.what;
        } catch (Throwable unused) {
        }
        if (i == 0) {
            message.getData().setClassLoader(SsWsApp.class.getClassLoader());
            Parcelable parcelable = message.getData().getParcelable("ws_app");
            if (parcelable instanceof IWsApp) {
                qmh.LIZIZ((IWsApp) parcelable);
                return;
            }
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 9) {
                                if (i != 10) {
                                    if (i != 12) {
                                        if (i != 13) {
                                            return;
                                        }
                                        message.getData().setClassLoader(ServiceParcelable.class.getClassLoader());
                                        Parcelable parcelable2 = message.getData().getParcelable("ws_app");
                                        if (!(parcelable2 instanceof ServiceParcelable)) {
                                            return;
                                        }
                                        int i2 = ((ServiceParcelable) parcelable2).mChannelId;
                                        int i3 = ((ServiceParcelable) parcelable2).mServiceId;
                                        IWsChannelClient iWsChannelClient2 = (IWsChannelClient) ((Map) qmh.LJLJJLL.LIZIZ).get(Integer.valueOf(i2));
                                        if (iWsChannelClient2 == null) {
                                            return;
                                        }
                                        Logger.debug();
                                        iWsChannelClient2.unregisterService(i3);
                                        return;
                                    }
                                    message.getData().setClassLoader(ServiceParcelable.class.getClassLoader());
                                    Parcelable parcelable3 = message.getData().getParcelable("ws_app");
                                    if (!(parcelable3 instanceof ServiceParcelable)) {
                                        return;
                                    }
                                    int i4 = ((ServiceParcelable) parcelable3).mChannelId;
                                    int i5 = ((ServiceParcelable) parcelable3).mServiceId;
                                    IWsChannelClient iWsChannelClient3 = (IWsChannelClient) ((Map) qmh.LJLJJLL.LIZIZ).get(Integer.valueOf(i4));
                                    if (iWsChannelClient3 == null) {
                                        return;
                                    }
                                    Logger.debug();
                                    iWsChannelClient3.registerService(i5);
                                    return;
                                }
                            } else {
                                qmh.LJLJJL.LJFF();
                                return;
                            }
                        } else {
                            z = false;
                        }
                        message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
                        Parcelable parcelable4 = message.getData().getParcelable("payload");
                        if (!(parcelable4 instanceof WsChannelMsg)) {
                            return;
                        }
                        WsChannelMsg wsChannelMsg = (WsChannelMsg) parcelable4;
                        if (wsChannelMsg.seqId <= 0) {
                            wsChannelMsg.seqId = qmh.LJLJL.incrementAndGet();
                        }
                        IWsChannelClient iWsChannelClient4 = (IWsChannelClient) ((Map) qmh.LJLJJLL.LIZIZ).get(Integer.valueOf(wsChannelMsg.channelId));
                        if (iWsChannelClient4 != null) {
                            if (i != 10 && (iWsChannelClient4 instanceof QMI) && (((QMI) iWsChannelClient4).LJLJJI instanceof C64868Pd2)) {
                                QMH.LJI(wsChannelMsg);
                            }
                            if (iWsChannelClient4.privateProtocolEnabled()) {
                                sendMessage = iWsChannelClient4.sendMessage(wsChannelMsg);
                            } else {
                                sendMessage = iWsChannelClient4.sendMessage(C66509Q8j.LIZIZ(wsChannelMsg));
                            }
                            long LIZJ = C66455Q6h.LIZIZ(qmh.LJLILLLLZI).LIZ.LIZJ("key_retry_send_msg_delay", 0L);
                            if (!sendMessage) {
                                if (!z && LIZJ > 0) {
                                    Message obtain = Message.obtain(message);
                                    obtain.what = 10;
                                    qmh.LJLIL.sendMessageDelayed(obtain, LIZJ);
                                }
                                if (LIZJ > 0) {
                                    if (z) {
                                    }
                                }
                            }
                            qmh.LJLJJL.LIZJ(wsChannelMsg, sendMessage);
                        } else {
                            qmh.LJLJJL.LIZJ(wsChannelMsg, false);
                        }
                        Logger.debug();
                        return;
                    }
                    message.getData().setClassLoader(SsWsApp.class.getClassLoader());
                    Parcelable parcelable5 = message.getData().getParcelable("ws_app");
                    if (!(parcelable5 instanceof IWsApp)) {
                        return;
                    }
                    qmh.LIZ((IWsApp) parcelable5);
                    return;
                }
                int i6 = message.arg1;
                Logger.debug();
                qmh.LJLJJL.LIZ();
                if (!qmh.LJLJLJ.isEnable()) {
                    return;
                }
                for (IWsChannelClient iWsChannelClient5 : ((Map) qmh.LJLJJLL.LIZIZ).values()) {
                    if (iWsChannelClient5 != null) {
                        iWsChannelClient5.onNetworkStateChanged(i6);
                    }
                }
                return;
            }
            int i7 = message.arg1;
            Logger.debug();
            if (i7 != 1) {
                z = false;
            }
            qmh.LJLJLLL = z;
            qmh.LJLJJL.LIZ();
            if (!qmh.LJLJLJ.isEnable()) {
                return;
            }
            Collection values = ((Map) qmh.LJLJJLL.LIZIZ).values();
            if (C66455Q6h.LIZIZ(qmh.LJLILLLLZI).LIZ.LIZIZ("enableAppStateChangeReport", false)) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    try {
                        qmh.LJFF((IWsChannelClient) it.next());
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
            }
            for (IWsChannelClient iWsChannelClient6 : ((Map) qmh.LJLJJLL.LIZIZ).values()) {
                if (iWsChannelClient6 != null) {
                    iWsChannelClient6.onAppStateChanged(i7);
                }
            }
            return;
        }
        message.getData().setClassLoader(SsWsApp.class.getClassLoader());
        Parcelable parcelable6 = message.getData().getParcelable("ws_app");
        if (!(parcelable6 instanceof IntegerParcelable)) {
            return;
        }
        int i8 = ((IntegerParcelable) parcelable6).mData;
        synchronized (WsChannelService.class) {
            ((Map) qmh.LJLJJLL.LIZ).remove(Integer.valueOf(i8));
            qmh.LJLJJI.LIZ((Map) qmh.LJLJJLL.LIZ);
        }
        synchronized (qmh.LJLJI) {
            iWsChannelClient = (IWsChannelClient) ((Map) qmh.LJLJJLL.LIZIZ).remove(Integer.valueOf(i8));
        }
        if (iWsChannelClient != null) {
            Logger.debug();
            iWsChannelClient.destroy();
        }
        ((Map) qmh.LJLJJLL.LIZJ).remove(Integer.valueOf(i8));
        qmh.LJLIL.sendMessageDelayed(qmh.LJLIL.obtainMessage(8, iWsChannelClient), 1000L);
    }

    public final void LIZ$16() {
        Context context = (Context) this.l0;
        if (C36929EeT.LJFF(context)) {
            QP6.LJ(context);
        }
        ((QRQ) this.l1).getClass();
        try {
            QRG.LIZIZ().getClass();
            String LJJIJIL = QRG.LIZJ().LJJIJIL();
            if (!C38354F3m.LJ(LJJIJIL)) {
                QR4 LJIIIIZZ = QRM.LJIIIIZZ();
                new JSONObject(LJJIJIL);
                LJIIIIZZ.getClass();
                QRG.LIZIZ().getClass();
                QRG.LIZJ().LJIILJJIL();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$17() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0200000_11.LIZ$17():void");
    }

    public final void LIZ$18() {
        Process.setThreadPriority(10);
        PE8 pe8 = ((PE4) this.l1).LJLILLLLZI;
        if (pe8 != null) {
            pe8.LIZ(C16880lQ.LLLLIIIILLL().getId());
        }
        try {
            Runnable runnable = (Runnable) this.l0;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            PD2.LIZ.LIZ("APM_INNER_ERROR_async_task", th);
            ((PE4) this.l1).getClass();
        }
    }

    public final void LIZ$19() {
        SubscribeResponse subscribeResponse = (SubscribeResponse) this.l1;
        if (subscribeResponse == null) {
            InterfaceC67066QTu interfaceC67066QTu = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
            if (interfaceC67066QTu != null) {
                ((C67058QTm) interfaceC67066QTu).LIZIZ(new QVK(1, "unknown error"));
                return;
            }
            return;
        }
        if (subscribeResponse.statusCode != 0) {
            InterfaceC67066QTu interfaceC67066QTu2 = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
            if (interfaceC67066QTu2 != null) {
                SubscribeResponse subscribeResponse2 = (SubscribeResponse) this.l1;
                ((C67058QTm) interfaceC67066QTu2).LIZIZ(new QVK(subscribeResponse2.statusCode, subscribeResponse2.msg));
                return;
            }
            return;
        }
        InterfaceC67066QTu interfaceC67066QTu3 = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
        if (interfaceC67066QTu3 != null) {
            ((C67058QTm) interfaceC67066QTu3).LIZJ();
        }
    }

    public final void LIZ$2() {
        if (((C65073PgL) this.l1).LJLILLLLZI.LJLILLLLZI.isCanceled()) {
            C65073PgL c65073PgL = (C65073PgL) this.l1;
            c65073PgL.LJLIL.LIZJ(c65073PgL.LJLILLLLZI, new IOException("Canceled"));
        } else {
            C65073PgL c65073PgL2 = (C65073PgL) this.l1;
            c65073PgL2.LJLIL.LJII(c65073PgL2.LJLILLLLZI, (C64797Pbt) this.l0);
        }
    }

    public final void LIZ$20() {
        if (((Exception) this.l1) instanceof C36616EYq) {
            InterfaceC67066QTu interfaceC67066QTu = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
            if (interfaceC67066QTu != null) {
                ((C67058QTm) interfaceC67066QTu).LIZIZ(new QVL(((C36616EYq) ((Exception) this.l1)).getResponseCode(), ((Exception) this.l1).getMessage(), (Exception) this.l1));
                return;
            }
            return;
        }
        InterfaceC67066QTu interfaceC67066QTu2 = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
        if (interfaceC67066QTu2 == null) {
            return;
        }
        ((C67058QTm) interfaceC67066QTu2).LIZIZ(new QVL(1, ((Exception) this.l1).getMessage(), (Exception) this.l1));
    }

    public final void LIZ$21() {
        try {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS30S0200000_11(((QVM) QPG.LIZ(QVM.class)).LJJIII((Topic) this.l0), this, 57));
        } catch (Exception e) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS30S0200000_11(e, this, 58));
        }
    }

    public final void LIZ$22() {
        SubscribeResponse subscribeResponse = (SubscribeResponse) this.l1;
        if (subscribeResponse == null) {
            InterfaceC67066QTu interfaceC67066QTu = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
            if (interfaceC67066QTu != null) {
                ((C67058QTm) interfaceC67066QTu).LIZIZ(new QVK(1, "unknown error"));
                return;
            }
            return;
        }
        if (subscribeResponse.statusCode != 0) {
            InterfaceC67066QTu interfaceC67066QTu2 = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
            if (interfaceC67066QTu2 != null) {
                SubscribeResponse subscribeResponse2 = (SubscribeResponse) this.l1;
                ((C67058QTm) interfaceC67066QTu2).LIZIZ(new QVK(subscribeResponse2.statusCode, subscribeResponse2.msg));
                return;
            }
            return;
        }
        InterfaceC67066QTu interfaceC67066QTu3 = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
        if (interfaceC67066QTu3 != null) {
            ((C67058QTm) interfaceC67066QTu3).LIZJ();
        }
    }

    public final void LIZ$23() {
        if (((Exception) this.l1) instanceof C36616EYq) {
            InterfaceC67066QTu interfaceC67066QTu = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
            if (interfaceC67066QTu != null) {
                ((C67058QTm) interfaceC67066QTu).LIZIZ(new QVL(((C36616EYq) ((Exception) this.l1)).getResponseCode(), ((Exception) this.l1).getMessage(), (Exception) this.l1));
                return;
            }
            return;
        }
        InterfaceC67066QTu interfaceC67066QTu2 = (InterfaceC67066QTu) ((ARunnableS30S0200000_11) this.l0).l1;
        if (interfaceC67066QTu2 == null) {
            return;
        }
        ((C67058QTm) interfaceC67066QTu2).LIZIZ(new QVL(1, ((Exception) this.l1).getMessage(), (Exception) this.l1));
    }

    public final void LIZ$24() {
        try {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS30S0200000_11(((QVM) QPG.LIZ(QVM.class)).LJJJIL((Topic) this.l0), this, 60));
        } catch (Exception e) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS30S0200000_11(e, this, 61));
        }
    }

    public final void LIZ$25() {
        QMV qmv = ((QU6) this.l1).LIZLLL;
        WsChannelMsg wsChannelMsg = (WsChannelMsg) this.l0;
        qmv.getClass();
        C67101QVd c67101QVd = null;
        if (wsChannelMsg != null && wsChannelMsg.service == 20032 && wsChannelMsg.method == 1) {
            byte[] LIZ = wsChannelMsg.LIZ();
            if (LIZ != null && TextUtils.equals(wsChannelMsg.payloadEncoding, C67060QTo.LIZIZ)) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(LIZ));
                try {
                    LIZ = C62848OlY.LJFF(gZIPInputStream);
                    AnonymousClass636.LJFF(gZIPInputStream, null);
                } finally {
                }
            }
            try {
                c67101QVd = C67101QVd.ADAPTER.decode(LIZ);
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        ((QU6) this.l1).LIZJ.LIZ(c67101QVd);
        ((QU3) QPG.LIZ(QU3.class)).LIZ(c67101QVd);
    }

    public final void LIZ$26() {
        PXW pxw = (PXW) this.l0;
        C64862Pcw c64862Pcw = ((C64863Pcx) this.l1).LJLIL;
        if (pxw != c64862Pcw.LJLLILLLL) {
            return;
        }
        if (c64862Pcw.LJLLLL.LIZIZ.get()) {
            C64866Pd0 c64866Pd0 = ((C64863Pcx) this.l1).LJLIL.LJLLLL;
            c64866Pd0.LIZIZ.set(false);
            c64866Pd0.LJ.removeCallbacks(c64866Pd0.LJFF);
            return;
        }
        ((C64863Pcx) this.l1).LJLIL.LJLLL.LJFF();
    }

    public final void LIZ$27() {
        ((C66120PxE) this.l0).LIZLLL((Throwable) this.l1);
        C66037Pvt.LIZIZ.LIZ(1, (C66120PxE) this.l0);
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        if (o.LJ(heliosEnvImpl.LJIIJ.engineType, "decision_engine")) {
            C66120PxE event = (C66120PxE) this.l0;
            o.LJIIIZ(event, "event");
            C66059PwF.LIZIZ.getClass();
            HandlerC66060PwG.LIZIZ(event);
            return;
        }
        C66059PwF.LIZIZ((C66120PxE) this.l0);
    }

    public final void LIZ$28() {
        int i;
        C7WD c7wd = (C7WD) ((HashMap) PU1.LIZIZ).get(((C32420Cnw) this.l0).LIZ);
        if (c7wd != null) {
            C32420Cnw c32420Cnw = (C32420Cnw) this.l0;
            int length = c32420Cnw.LIZJ.length;
            C32287Cln c32287Cln = PU1.LJII;
            int i2 = 0;
            if (c32287Cln != null && length < (i = c32287Cln.LIZJ)) {
                length = i;
            }
            if (c32420Cnw.LJII < length - 1) {
                Handler handler = PU1.LJ;
                ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(c32420Cnw, 159);
                C32287Cln c32287Cln2 = PU1.LJII;
                if (c32287Cln2 != null) {
                    i2 = c32287Cln2.LIZLLL * 1000;
                }
                handler.postDelayed(aRunnableS47S0100000_11, i2);
                return;
            }
            Iterator it = ((CopyOnWriteArrayList) c7wd.LIZIZ).iterator();
            while (it.hasNext()) {
                ((PU2) it.next()).LIZIZ((C32425Co1) this.l1);
            }
        }
        ((HashMap) PU1.LIZIZ).remove(((C32420Cnw) this.l0).LIZ);
        Iterator it2 = ((ArrayList) PU1.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC64518PTu) it2.next()).LIZIZ((C32425Co1) this.l1);
        }
        PU1.LJFF--;
        PU1.LJI++;
        PU1.LIZ.LJFF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x02fe, code lost:
    
        if (r2 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$29() {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0200000_11.LIZ$29():void");
    }

    public final void LIZ$3() {
        CleanModel cleanModel = ((LogCleanTask) this.l0).LJLIL;
        if (cleanModel != null) {
            if (cleanModel.cleanApm) {
                long currentTimeMillis = System.currentTimeMillis();
                PBE pbe = PBB.LIZ;
                pbe.getClass();
                C64071PCp.LIZ(PD6.IO).LIZJ(new PBD(pbe));
                LogCleanTask logCleanTask = (LogCleanTask) this.l0;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                logCleanTask.getClass();
                LogCleanTask.LIZLLL(currentTimeMillis2, "clean_apm");
            }
            CleanModel cleanModel2 = ((LogCleanTask) this.l0).LJLIL;
            if (cleanModel2 != null) {
                if (cleanModel2.cleanALog && ((Context) this.l1) != null) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    ALog.flush();
                    ALog.removeObsoleteInstance("default", (Context) this.l1, true);
                    LogCleanTask logCleanTask2 = (LogCleanTask) this.l0;
                    long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                    logCleanTask2.getClass();
                    LogCleanTask.LIZLLL(currentTimeMillis4, "clean_alog");
                }
                CleanModel cleanModel3 = ((LogCleanTask) this.l0).LJLIL;
                if (cleanModel3 != null) {
                    if (cleanModel3.cleanNpth) {
                        long currentTimeMillis5 = System.currentTimeMillis();
                        Npth.clean();
                        LogCleanTask logCleanTask3 = (LogCleanTask) this.l0;
                        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                        logCleanTask3.getClass();
                        LogCleanTask.LIZLLL(currentTimeMillis6, "clean_npth");
                        return;
                    }
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
            o.LJIJI("config");
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }

    public final void LIZ$30() {
        Bitmap bitmap = (Bitmap) this.l0;
        if (bitmap != null && !bitmap.isRecycled()) {
            InterfaceC63938P7m interfaceC63938P7m = (InterfaceC63938P7m) ((ARunnableS22S0300000_11) this.l1).l1;
            C63937P7l c63937P7l = (C63937P7l) interfaceC63938P7m;
            c63937P7l.LIZLLL.LIZLLL(c63937P7l.LIZ, c63937P7l.LIZIZ, c63937P7l.LIZJ, (Bitmap) this.l0);
            return;
        }
        C63937P7l c63937P7l2 = (C63937P7l) ((InterfaceC63938P7m) ((ARunnableS22S0300000_11) this.l1).l1);
        c63937P7l2.LIZLLL.LIZLLL(c63937P7l2.LIZ, c63937P7l2.LIZIZ, c63937P7l2.LIZJ, null);
    }

    public final void LIZ$4() {
        try {
            QAT qat = ((YoutubePresenter) this.l0).credential;
            if (qat != null) {
                ((ReentrantLock) qat.LJLIL).lock();
                ((ReentrantLock) qat.LJLIL).unlock();
            }
            QAT qat2 = ((YoutubePresenter) this.l0).credential;
            if (qat2 != null) {
                qat2.LIZIZ(((QA1) this.l1).LIZJ);
            }
            QAT qat3 = ((YoutubePresenter) this.l0).credential;
            if (qat3 != null) {
                qat3.LIZJ(((QA1) this.l1).LJ);
            }
            YoutubePresenter youtubePresenter = (YoutubePresenter) this.l0;
            C65472Pmm c65472Pmm = new C65472Pmm(youtubePresenter.httpTransport, youtubePresenter.jsonFactory, youtubePresenter.credential);
            c65472Pmm.LJFF = ((YoutubePresenter) this.l0).getActivity().getString(R.string.h2z);
            C65465Pmf c65465Pmf = new C65465Pmf(c65472Pmm);
            YoutubePresenter youtubePresenter2 = (YoutubePresenter) this.l0;
            QA1 tokenResponse = (QA1) this.l1;
            o.LJIIIIZZ(tokenResponse, "tokenResponse");
            youtubePresenter2.requestLinkYouTube(c65465Pmf, tokenResponse);
        } catch (Exception e) {
            YoutubePresenter.onError$default((YoutubePresenter) this.l0, e, null, "send_token_to_sever", null, 10, null);
        }
    }

    public final void LIZ$5() {
        LinkedList linkedList;
        LinkedList linkedList2;
        LinkedList linkedList3;
        try {
            synchronized (((C64010PAg) this.l1).LIZ) {
                linkedList = new LinkedList(((C64010PAg) this.l1).LIZ);
                ((C64010PAg) this.l1).LIZ.clear();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C64014PAk c64014PAk = (C64014PAk) it.next();
                C64010PAg c64010PAg = (C64010PAg) this.l1;
                C64009PAf c64009PAf = (C64009PAf) this.l0;
                c64010PAg.getClass();
                if (c64014PAk != null && !TextUtils.isEmpty(c64014PAk.LIZ)) {
                    c64009PAf.LJIIL(c64014PAk.LIZ, c64014PAk.LIZIZ, c64014PAk.LIZJ, c64014PAk.LIZLLL, c64014PAk.LJ, c64014PAk.LJFF, c64014PAk.LJI);
                }
            }
            synchronized (((C64010PAg) this.l1).LIZIZ) {
                linkedList2 = new LinkedList(((C64010PAg) this.l1).LIZIZ);
                ((C64010PAg) this.l1).LIZIZ.clear();
            }
            Iterator it2 = linkedList2.iterator();
            while (it2.hasNext()) {
                C64021PAr c64021PAr = (C64021PAr) it2.next();
                C64010PAg c64010PAg2 = (C64010PAg) this.l1;
                C64009PAf c64009PAf2 = (C64009PAf) this.l0;
                c64010PAg2.getClass();
                if (c64021PAr != null) {
                    c64009PAf2.getClass();
                    try {
                        throw null;
                        break;
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
            synchronized (((C64010PAg) this.l1).LIZJ) {
                linkedList3 = new LinkedList(((C64010PAg) this.l1).LIZJ);
                ((C64010PAg) this.l1).LIZJ.clear();
            }
            Iterator it3 = linkedList3.iterator();
            while (it3.hasNext()) {
                C64013PAj c64013PAj = (C64013PAj) it3.next();
                C64010PAg c64010PAg3 = (C64010PAg) this.l1;
                C64009PAf c64009PAf3 = (C64009PAf) this.l0;
                c64010PAg3.getClass();
                C64010PAg.LIZ(c64009PAf3, c64013PAj);
            }
        } catch (Throwable unused2) {
        }
    }

    public final void LIZ$6() {
        try {
            if (C17N.LJJIIZI((List) this.l0)) {
                return;
            }
            float f = PH9.LIZ;
            int i = PH9.LIZIZ;
            int i2 = i - 1;
            int[] iArr = new int[i2 + 1];
            int i3 = 0;
            for (Integer num : (List) this.l0) {
                int i4 = (int) (100.0f * f);
                int max = Math.max(Math.min((((i4 - 1) + num.intValue()) / i4) - 1, i2), 0);
                iArr[max] = iArr[max] + 1;
                i3 += num.intValue() / 100;
            }
            JSONObject jSONObject = new JSONObject();
            for (int i5 = 0; i5 <= i2; i5++) {
                if (iArr[i5] > 0) {
                    jSONObject.put(String.valueOf(i5), iArr[i5]);
                }
            }
            PH6 ph6 = ((PH4) this.l1).LIZLLL;
            if (ph6 != null) {
                ph6.LIZJ(C43001GuD.LJI(jSONObject));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(WM7.SCENE_SERVICE, ((PH4) this.l1).LIZ);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("total_scroll_time", i3);
            StringBuilder LIZ = X1D.LIZ();
            ((PH4) this.l1).getClass();
            LIZ.append(0.0f);
            LIZ.append(",");
            ((PH4) this.l1).getClass();
            LIZ.append(0.0f);
            jSONObject3.put("velocity", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            ((PH4) this.l1).getClass();
            LIZ2.append(0.0f);
            LIZ2.append(",");
            ((PH4) this.l1).getClass();
            LIZ2.append(0.0f);
            jSONObject3.put("distance", X1D.LIZIZ(LIZ2));
            JSONObject jSONObject4 = ((PH4) this.l1).LJIIIZ;
            if (jSONObject4 != null) {
                jSONObject3.put("extra", jSONObject4);
            }
            jSONObject3.put("drop_time_rate", 1.0f - ((((List) this.l0).size() * 1.0f) / ((int) (i3 / f))));
            PEF pef = new PEF("fps_drop", ((PH4) this.l1).LIZ, jSONObject, jSONObject2, jSONObject3);
            C78866UxK.LJLI(pef, true);
            pef.LJFF.put("refresh_rate", i);
            C64089PDh.LJIIJ().LIZLLL(pef);
        } catch (Exception e) {
            if (C09970aH.LJII()) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LIZ$7() {
        if (((C65080PgS) this.l1).LIZIZ.LJLILLLLZI.isCanceled()) {
            C65080PgS c65080PgS = (C65080PgS) this.l1;
            c65080PgS.LIZ.onFailure(c65080PgS.LIZIZ, new IOException("Canceled"));
        } else {
            C65080PgS c65080PgS2 = (C65080PgS) this.l1;
            c65080PgS2.LIZ.onResponse(c65080PgS2.LIZIZ, (C64653PYz) this.l0);
        }
    }

    public final void LIZ$8() {
        ((C66793QJh) this.l1).LIZIZ.LIZIZ((C48852JFg) this.l0);
        QKW qkw = ((C66793QJh) this.l1).LIZJ;
        qkw.getClass();
        QKU qku = (QKU) JFZ.LIZ(QKU.class, String.valueOf(qkw.LJFF.LIZ));
        if (qku != null) {
            qku.clearAll();
        }
        JGC.LIZ(qkw.LJ, qkw.LJFF);
        QJJ.LIZ = new C64074PCs();
        QKW qkw2 = ((C66793QJh) this.l1).LIZJ;
        qkw2.LJ();
        C66811QJz c66811QJz = qkw2.LJIIL;
        if (c66811QJz != null) {
            c66811QJz.LIZ(new QJT(qkw2.LJIIIIZZ));
        }
        qkw2.LJI();
    }

    public final void LIZ$9() {
        if (((C66793QJh) this.l1).LIZ != null) {
            ((C66793QJh) this.l1).LIZ.LJIL = (Account) this.l0;
        }
        QKU qku = (QKU) JFZ.LIZ(QKU.class, String.valueOf(((C66793QJh) this.l1).LIZ.LIZ));
        if (qku != null) {
            qku.LIZ((Account) this.l0);
        }
    }

    public final void LIZ$15() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((QVC) this.l0).LIZ);
        LIZ.append("receive package -> ");
        LIZ.append((C67101QVd) this.l1);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        C67101QVd c67101QVd = (C67101QVd) this.l1;
        if (c67101QVd == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(((QVC) this.l0).LIZ);
            LIZ2.append("protocol is null");
            C66629QCz.LIZJ(X1D.LIZIZ(LIZ2));
            return;
        }
        List<QVZ> list = c67101QVd.topics;
        if (list == null || list.isEmpty()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(((QVC) this.l0).LIZ);
            LIZ3.append("topics is null");
            C66629QCz.LIZJ(X1D.LIZIZ(LIZ3));
            return;
        }
        C67098QVa c67098QVa = ((C67101QVd) this.l1).header;
        if (c67098QVa == null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(((QVC) this.l0).LIZ);
            LIZ4.append("header is null");
            C66629QCz.LIZIZ(X1D.LIZIZ(LIZ4));
            return;
        }
        if (c67098QVa.version.compareTo(EnumC67117QVt.V2) < 0) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(((QVC) this.l0).LIZ);
            LIZ5.append("version is ");
            LIZ5.append(((C67101QVd) this.l1).header.version);
            LIZ5.append(",ignore");
            C66629QCz.LIZIZ(X1D.LIZIZ(LIZ5));
            return;
        }
        C67101QVd c67101QVd2 = (C67101QVd) this.l1;
        QVF qvf = c67101QVd2.header.ctrl;
        if (qvf != null && qvf != QVF.Default) {
            for (QVG qvg : (List) ((QVC) this.l0).LIZJ.getValue()) {
                QVF qvf2 = c67101QVd2.header.ctrl;
                o.LJFF(qvf2, "protocol.header.ctrl");
                if (qvg.LIZIZ(qvf2)) {
                    C67098QVa c67098QVa2 = c67101QVd2.header;
                    o.LJFF(c67098QVa2, "protocol.header");
                    List<QVZ> list2 = c67101QVd2.topics;
                    o.LJFF(list2, "protocol.topics");
                    qvg.LIZ(c67098QVa2, list2);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        QVC qvc = (QVC) this.l0;
        qvc.getClass();
        List<QVZ> list3 = c67101QVd2.topics;
        o.LJFF(list3, "protocol.topics");
        QVX qvx = ((QVZ) ORZ.LJLLJ(list3)).flag;
        ArrayList arrayList = new ArrayList();
        List<QVZ> list4 = c67101QVd2.topics;
        o.LJFF(list4, "protocol.topics");
        for (QVZ qvz : list4) {
            if (qvz.flag == qvx) {
                arrayList.add(qvz);
            } else {
                if (qvx != null && !arrayList.isEmpty()) {
                    C67098QVa c67098QVa3 = c67101QVd2.header;
                    o.LJFF(c67098QVa3, "protocol.header");
                    qvc.LIZIZ(qvx, c67098QVa3, arrayList);
                }
                arrayList = new ArrayList();
                arrayList.add(qvz);
                qvx = qvz.flag;
            }
        }
        if (!arrayList.isEmpty()) {
            if (qvx != null) {
                C67098QVa c67098QVa4 = c67101QVd2.header;
                o.LJFF(c67098QVa4, "protocol.header");
                qvc.LIZIZ(qvx, c67098QVa4, arrayList);
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (X.C67013QRt.LIZ.LIZJ(((com.bytedance.push.settings.LocalFrequencySettings) X.PT6.LIZ(r2, com.bytedance.push.settings.LocalFrequencySettings.class)).LJJIIZI(), r2) != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$31() {
        /*
            r10 = this;
            X.QRG r0 = X.QRG.LIZIZ()
            r0.getClass()
            boolean r8 = X.QRG.LJ()
            java.lang.Object r1 = r10.l0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.bytedance.push.settings.LocalFrequencySettings> r0 = com.bytedance.push.settings.LocalFrequencySettings.class
            java.lang.Object r9 = X.PT6.LIZ(r1, r0)
            com.bytedance.push.settings.LocalFrequencySettings r9 = (com.bytedance.push.settings.LocalFrequencySettings) r9
            java.lang.Object r1 = r10.l0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.bytedance.push.settings.PushOnlineSettings> r0 = com.bytedance.push.settings.PushOnlineSettings.class
            java.lang.Object r6 = X.PT6.LIZ(r1, r0)
            com.bytedance.push.settings.PushOnlineSettings r6 = (com.bytedance.push.settings.PushOnlineSettings) r6
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJIIJ()
            long r2 = r2 - r0
            long r4 = java.lang.Math.abs(r2)
            long r1 = r6.LJIILJJIL()
            r7 = 1
            r3 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4e
        L3a:
            java.lang.Object r5 = r10.l1
            X.QRN r5 = (X.QRN) r5
            java.lang.Object r4 = r10.l0
            android.content.Context r4 = (android.content.Context) r4
            r5.getClass()
            java.lang.Class<com.bytedance.push.settings.LocalFrequencySettings> r0 = com.bytedance.push.settings.LocalFrequencySettings.class
            java.lang.Object r1 = X.PT6.LIZ(r4, r0)
            com.bytedance.push.settings.LocalFrequencySettings r1 = (com.bytedance.push.settings.LocalFrequencySettings) r1
            goto L74
        L4e:
            boolean r0 = r9.LJII()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r10.l1
            X.QRN r0 = (X.QRN) r0
            java.lang.Object r2 = r10.l0
            android.content.Context r2 = (android.content.Context) r2
            r0.getClass()
            java.lang.Class<com.bytedance.push.settings.LocalFrequencySettings> r0 = com.bytedance.push.settings.LocalFrequencySettings.class
            java.lang.Object r0 = X.PT6.LIZ(r2, r0)
            com.bytedance.push.settings.LocalFrequencySettings r0 = (com.bytedance.push.settings.LocalFrequencySettings) r0
            int r1 = r0.LJJIIZI()
            X.QRd r0 = X.C67013QRt.LIZ
            boolean r0 = r0.LIZJ(r1, r2)
            if (r0 == 0) goto L99
            goto L3a
        L74:
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L96
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L96
            if (r0 != 0) goto L7d
            goto L96
        L7d:
            X.QRY r2 = new X.QRY
            X.QQq r0 = r5.LIZ
            r2.<init>(r4, r0, r8)
            android.os.Looper r1 = X.C16880lQ.LLJJJJ()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 != r0) goto L92
            X.RunnableC39007FSp.LIZIZ(r2)
            goto L99
        L92:
            r2.run()
            goto L99
        L96:
            r1.LJIIL(r3)
        L99:
            java.lang.Object r6 = r10.l1
            X.QRN r6 = (X.QRN) r6
            java.lang.Object r5 = r10.l0
            android.content.Context r5 = (android.content.Context) r5
            r6.getClass()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r1 = "in_status"
            java.lang.String r3 = "open"
            java.lang.String r2 = "close"
            if (r8 == 0) goto Lb3
            r0 = r3
            goto Lb4
        Lb3:
            r0 = r2
        Lb4:
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r1 = "out_status"
            int r0 = X.C36929EeT.LIZJ(r5)     // Catch: java.lang.Throwable -> Lc5
            if (r7 != r0) goto Lc3
        Lbf:
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> Lc5
            goto Lc5
        Lc3:
            r3 = r2
            goto Lbf
        Lc5:
            X.QQq r0 = r6.LIZ
            X.QRM r0 = (X.QRM) r0
            X.QRR r0 = r0.LIZIZ
            X.R39 r0 = r0.LJIIJJI
            r0.getClass()
            java.lang.String r0 = "ttpush_push_notification_status"
            X.R39.LIZJ(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0200000_11.LIZ$31():void");
    }

    public static final void run$0(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((C66119PxD) aRunnableS30S0200000_11.l0).LIZJ((C66120PxE) ((InterfaceC66068PwO) aRunnableS30S0200000_11.l1));
            ((C66120PxE) ((InterfaceC66068PwO) aRunnableS30S0200000_11.l1)).LJLLLL.put("delay", Boolean.TRUE);
            ((C66119PxD) aRunnableS30S0200000_11.l0).LIZLLL((C66120PxE) ((InterfaceC66068PwO) aRunnableS30S0200000_11.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((QVR) aRunnableS30S0200000_11.l1).LJLIL.LJJL((QW3) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((CompensatorImpl) aRunnableS30S0200000_11.l1).LIZIZ((SettingsV2) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((MessageReceiverService) aRunnableS30S0200000_11.l1).onHandleIntent((Intent) aRunnableS30S0200000_11.l0);
            ((MessageReceiverService) aRunnableS30S0200000_11.l1).stopSelf();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((RedbadgeHandler) aRunnableS30S0200000_11.l1).onHandleIntent((Intent) aRunnableS30S0200000_11.l0);
            ((RedbadgeHandler) aRunnableS30S0200000_11.l1).stopSelf();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((RedbadgeHandler) aRunnableS30S0200000_11.l1).onHandleIntent((Intent) aRunnableS30S0200000_11.l0);
            ((RedbadgeHandler) aRunnableS30S0200000_11.l1).stopSelf();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            UgCallbackCenter.LIZIZ((LifecycleOwner) aRunnableS30S0200000_11.l0, (QTC) aRunnableS30S0200000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            YoutubeRefreshTask youtubeRefreshTask = (YoutubeRefreshTask) aRunnableS30S0200000_11.l0;
            User curUser = (User) aRunnableS30S0200000_11.l1;
            o.LJIIIIZZ(curUser, "curUser");
            youtubeRefreshTask.LIZLLL(curUser);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((AJMediaCodec) aRunnableS30S0200000_11.l1).LJI((MediaCodec) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((AJVoice) aRunnableS30S0200000_11.l1).LJFF((AudioTrack) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void run$21(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            try {
                ((AudioTrack) aRunnableS30S0200000_11.l0).flush();
                ((AudioTrack) aRunnableS30S0200000_11.l0).release();
                ConditionVariable conditionVariable = ((AJVoice) aRunnableS30S0200000_11.l1).LJJII;
                if (conditionVariable != null) {
                    conditionVariable.open();
                }
            } catch (Throwable th) {
                ConditionVariable conditionVariable2 = ((AJVoice) aRunnableS30S0200000_11.l1).LJJII;
                if (conditionVariable2 != null) {
                    conditionVariable2.open();
                }
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((CronetUrlRequest) aRunnableS30S0200000_11.l1).LJIL.onRequestFinished((QE2) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            try {
                CronetUrlRequest cronetUrlRequest = (CronetUrlRequest) aRunnableS30S0200000_11.l1;
                cronetUrlRequest.LJIIIZ.LIZIZ(cronetUrlRequest, cronetUrlRequest.LJJII, (AbstractC66673QEr) aRunnableS30S0200000_11.l0);
                ((CronetUrlRequest) aRunnableS30S0200000_11.l1).LJJII();
            } catch (Exception e) {
                C78939UyV.LJII("Exception in onFailed method", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            try {
                CronetUrlRequest cronetUrlRequest = (CronetUrlRequest) aRunnableS30S0200000_11.l1;
                cronetUrlRequest.LJIIIZ.LIZJ(cronetUrlRequest, (QE2) aRunnableS30S0200000_11.l0);
            } catch (Exception e) {
                C78939UyV.LJII("Exception in onMetricsCollected method", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((QF3) aRunnableS30S0200000_11.l0).run();
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static final void run$26(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((C66668QEm) aRunnableS30S0200000_11.l0).onRequestFinished((QE2) aRunnableS30S0200000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((QF3) aRunnableS30S0200000_11.l0).run();
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static final void run$28(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        try {
            QET qet = (QET) aRunnableS30S0200000_11.l1;
            qet.getClass();
            new ARunnableS30S0200000_11(qet, new C66658QEc(aRunnableS30S0200000_11), 25);
            throw null;
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$29(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((PKU) aRunnableS30S0200000_11.l1).save((Map) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            Process.setThreadPriority(10);
            try {
                ((Runnable) aRunnableS30S0200000_11.l0).run();
            } catch (Throwable th) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SingleThreadFactory error when running in thread ");
                LIZ2.append(((ThreadFactoryC64063PCh) aRunnableS30S0200000_11.l1).LJLIL);
                C64028PAy.LIZJ("APM-AsyncTask", X1D.LIZIZ(LIZ2), th);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            C64241PJd.LIZJ((C64246PJi) aRunnableS30S0200000_11.l1, aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            C65080PgS c65080PgS = (C65080PgS) aRunnableS30S0200000_11.l1;
            c65080PgS.LIZ.onFailure(c65080PgS.LIZIZ, (Throwable) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            InterfaceC67352kd LJJII = C78555UsJ.LJJII((InterfaceC67352kd) aRunnableS30S0200000_11.l0);
            C3C4 LIZ2 = C141335gf.LIZ((Exception) aRunnableS30S0200000_11.l1);
            C3C5.m7constructorimpl(LIZ2);
            LJJII.resumeWith(LIZ2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((AliveOnlineSettings) PT6.LIZ((Context) aRunnableS30S0200000_11.l0, AliveOnlineSettings.class)).updateSettings((Context) aRunnableS30S0200000_11.l0, (JSONObject) aRunnableS30S0200000_11.l1);
            ((PushOnlineSettings) PT6.LIZ((Context) aRunnableS30S0200000_11.l0, PushOnlineSettings.class)).updateSettings((Context) aRunnableS30S0200000_11.l0, (JSONObject) aRunnableS30S0200000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((PKU) aRunnableS30S0200000_11.l1).save((Map) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((RBW) aRunnableS30S0200000_11.l0).LJIIL((User) aRunnableS30S0200000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$44(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((C66811QJz) aRunnableS30S0200000_11.l1).LIZ(aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((QML) aRunnableS30S0200000_11.l0).B6();
            QMH qmh = (QMH) aRunnableS30S0200000_11.l1;
            qmh.LJII(qmh.LJLJJI.LIZIZ());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$46(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$47(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((QMH) aRunnableS30S0200000_11.l1).LJFF((IWsChannelClient) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$48(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            if (!C40700FyC.LIZ(aRunnableS30S0200000_11)) {
                try {
                    Q6Y q6y = (Q6Y) ((ARunnableS12S1100000_11) aRunnableS30S0200000_11.l1).l1;
                    C65825PsT c65825PsT = (C65825PsT) aRunnableS30S0200000_11.l0;
                    q6y.getClass();
                    if (!C40700FyC.LIZ(q6y) && c65825PsT != null && c65825PsT.LIZIZ && q6y.getVisibility() == 0) {
                        q6y.LJFF(c65825PsT.LIZ);
                    }
                } catch (Throwable unused) {
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$49(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((PKU) aRunnableS30S0200000_11.l1).save((Map) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$50(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            QRO LIZJ = ((QRM) ((InterfaceC66984QQq) aRunnableS30S0200000_11.l0)).LIZJ();
            Context context = (Context) aRunnableS30S0200000_11.l1;
            QRN qrn = (QRN) LIZJ;
            qrn.getClass();
            QRG.LIZIZ();
            RunnableC39007FSp.LIZIZ(new ARunnableS30S0200000_11(qrn, context, 81));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$51(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$52(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((QTP) aRunnableS30S0200000_11.l1).LIZIZ(aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$53(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$54(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        PU0 pu0 = (PU0) aRunnableS30S0200000_11.l0;
        C32420Cnw c32420Cnw = (C32420Cnw) aRunnableS30S0200000_11.l1;
        pu0.getClass();
        String str = c32420Cnw.LIZ;
        String LJ = pu0.LJ(c32420Cnw);
        C7WD c7wd = (C7WD) ((HashMap) pu0.LIZ).get(str);
        if (c7wd != null) {
            Iterator it = ((CopyOnWriteArrayList) c7wd.LIZIZ).iterator();
            while (it.hasNext()) {
                ((PU2) it.next()).LIZLLL(c32420Cnw.LIZIZ, LJ);
            }
        }
        ((HashMap) pu0.LIZ).remove(str);
        Iterator it2 = ((CopyOnWriteArrayList) pu0.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC64518PTu) it2.next()).LJ(c32420Cnw.LIZIZ, c32420Cnw);
        }
        pu0.LJI--;
        pu0.LJII = 0;
        pu0.LJIIIIZZ();
    }

    public static final void run$55(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            Context context = ((C67025QSf) aRunnableS30S0200000_11.l1).LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(((C67025QSf) aRunnableS30S0200000_11.l1).LIZJ);
            LIZ2.append(" ");
            LIZ2.append(((C67022QSc) aRunnableS30S0200000_11.l0).LJ);
            C16880lQ.LLZILL(Toast.makeText(context, X1D.LIZIZ(LIZ2), 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$56(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$57(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$19();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$58(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$20();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$59(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$21();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((JsbEventFetcherImpl) aRunnableS30S0200000_11.l0).removeTimeOutEvents();
            ((JsbEventFetcherImpl) aRunnableS30S0200000_11.l0).mJsbEventList.add((IIO) aRunnableS30S0200000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$60(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$22();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$61(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$23();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$62(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$24();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$63(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            Process.setThreadPriority(((ThreadFactoryC64344PNc) aRunnableS30S0200000_11.l1).LJLIL);
        } catch (Throwable unused) {
        }
        try {
            ((Runnable) aRunnableS30S0200000_11.l0).run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$64(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((PSG) aRunnableS30S0200000_11.l1).LIZIZ((PSL) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$65(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            InterfaceC66818QKg interfaceC66818QKg = ((C66810QJy) aRunnableS30S0200000_11.l1).LIZIZ;
            if (interfaceC66818QKg != null) {
                interfaceC66818QKg.LIZIZ((C66799QJn) aRunnableS30S0200000_11.l0);
                ((C66810QJy) aRunnableS30S0200000_11.l1).LIZ();
            }
            ((C66810QJy) aRunnableS30S0200000_11.l1).LIZIZ = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$66(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        C67201QYz c67201QYz = (C67201QYz) aRunnableS30S0200000_11.l0;
        C6Y7 c6y7 = (C6Y7) aRunnableS30S0200000_11.l1;
        synchronized (c67201QYz) {
            if (c67201QYz.LIZIZ == null) {
                c67201QYz.LIZ.add(c6y7);
            } else {
                c67201QYz.LIZIZ.add(c6y7.get());
            }
        }
    }

    public static final void run$67(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            Iterator it = ((ArrayList) ((C65102Pgo) aRunnableS30S0200000_11.l0).LJLJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC65104Pgq) it.next()).onException((Throwable) aRunnableS30S0200000_11.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$68(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            Iterator it = ((ArrayList) ((C65102Pgo) aRunnableS30S0200000_11.l0).LJLJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC65104Pgq) it.next()).LIZJ((Request) aRunnableS30S0200000_11.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$69(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            Iterator it = ((ArrayList) ((C65102Pgo) aRunnableS30S0200000_11.l0).LJLJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC65104Pgq) it.next()).LJII((Request) aRunnableS30S0200000_11.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        QBX qbx = (QBX) aRunnableS30S0200000_11.l0;
        qbx.LIZJ.iv0((ActivityC45651qj) aRunnableS30S0200000_11.l1);
    }

    public static final void run$70(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            Iterator it = ((ArrayList) ((C65102Pgo) aRunnableS30S0200000_11.l0).LJLJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC65104Pgq) it.next()).LJFF((C64797Pbt) aRunnableS30S0200000_11.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$71(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            if (((C67061QTp) aRunnableS30S0200000_11.l0).LIZ) {
                ((C67061QTp) aRunnableS30S0200000_11.l0).LIZIZ = SyncSDK.registerBusiness((C67032QSm) aRunnableS30S0200000_11.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$72(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$25();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$73(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((C64863Pcx) aRunnableS30S0200000_11.l1).LJLIL.LJIIIZ(((C64537PUn) aRunnableS30S0200000_11.l0).toByteArray());
        } catch (Throwable unused) {
        }
        try {
            C64869Pd3 c64869Pd3 = ((C64863Pcx) aRunnableS30S0200000_11.l1).LJLIL.LJLLI;
            if (c64869Pd3 != null) {
                C64537PUn c64537PUn = (C64537PUn) aRunnableS30S0200000_11.l0;
                IWsChannelClient iWsChannelClient = c64869Pd3.LIZ;
                if (iWsChannelClient != null) {
                    iWsChannelClient.onMessage(c64537PUn.toByteArray());
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$74(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$26();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$75(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$27();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$76(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$28();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$77(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((PaymentOnlineSettings) PT6.LIZ((Context) aRunnableS30S0200000_11.l0, PaymentOnlineSettings.class)).updateSettings((Context) aRunnableS30S0200000_11.l0, (JSONObject) aRunnableS30S0200000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$78(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            ((AbstractC64084PDc) aRunnableS30S0200000_11.l1).LJI((InterfaceC64090PDi) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$79(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$29();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$80(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$30();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$81(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            aRunnableS30S0200000_11.LIZ$31();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$82(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        QTX qtx;
        C69023R7b c69023R7b;
        try {
            R40 r40 = (R40) aRunnableS30S0200000_11.l0;
            if (r40 != null && (c69023R7b = (C69023R7b) r40.LJIIIZ) != null) {
                qtx = c69023R7b.LJFF;
            } else {
                qtx = null;
            }
            R41.LJIILIIL(qtx);
            ((RC4) aRunnableS30S0200000_11.l1).LIZ.sj();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS30S0200000_11 aRunnableS30S0200000_11) {
        boolean LIZ;
        try {
            C65073PgL c65073PgL = (C65073PgL) aRunnableS30S0200000_11.l1;
            c65073PgL.LJLIL.LIZJ(c65073PgL.LJLILLLLZI, (Throwable) aRunnableS30S0200000_11.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS30S0200000_11(android.content.Context r2, org.json.JSONObject r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 39: goto Le;
                case 77: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0200000_11.<init>(android.content.Context, org.json.JSONObject, int):void");
    }

    public ARunnableS30S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public ARunnableS30S0200000_11(QBX qbx, ActivityC45651qj activityC45651qj, Bundle bundle, int i) {
        this.$t = i;
        this.l0 = qbx;
        this.l1 = activityC45651qj;
    }
}
