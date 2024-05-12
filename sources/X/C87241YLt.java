package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.MessageApi;
import com.bytedance.android.livesdk.MessageService;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageForceHttpSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageImCursorOptSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdk.livesetting.message.UsePbObjectJsonPassThroughSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGCOptimizeSettingV2;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMessageSEITimeoutSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.ReasonMessage;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.HeartBeat;
import com.bytedance.android.livesdkapi.message.HeartBeat_ProtoEncoder;
import com.bytedance.android.livesdkapi.message.ImEnterRoom;
import com.bytedance.android.livesdkapi.message.ImEnterRoom_ProtoEncoder;
import com.bytedance.android.livesdkapi.message.MessageJsonPassThroughModel;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.Gson;
import com.google.gson.j;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS165S0100000_15;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.o;
import webcast.im.PreviewRoom;
import webcast.im._PreviewRoom_ProtoEncoder;

/* renamed from: X.YLt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87241YLt extends YMC {
    public final C32083CiV LIZJ;
    public IMessageWsClient.Callback LIZLLL;
    public long LJ;
    public final long LJFF;
    public final boolean LJI;
    public Context LJII;
    public MessageApi LJIIIIZZ;
    public long LJIIIZ;
    public final String LJIIJ;
    public String LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public final C32482Cow LJIJJ;
    public YM4 LJIJJLI;
    public String LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public long LJJIII;
    public final MessageService LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public InterfaceC37276Ek4<Q9I> LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public boolean LJJIL;
    public final C84689XLp LJJIZ;
    public final C5H3 LJJJ;
    public final C87244YLw LJJJI;
    public final boolean LJJJIL;
    public boolean LJIILL = true;
    public boolean LJIILLIIL = true;
    public final ImEnterRoom_ProtoEncoder LJIIZILJ = new ImEnterRoom_ProtoEncoder();
    public final _PreviewRoom_ProtoEncoder LJIJ = new _PreviewRoom_ProtoEncoder();
    public final HeartBeat_ProtoEncoder LJIJI = new HeartBeat_ProtoEncoder();
    public final YM0 LJIL = new YM0();

    public final java.util.Map<String, String> LIZJ() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        C65124PhA.LIZLLL().getClass();
        HashMap hashMap = new HashMap(C65124PhA.LIZIZ());
        hashMap.put("room_id", String.valueOf(this.LJ));
        hashMap.put("rid", String.valueOf(this.LJ));
        hashMap.put("aid", String.valueOf(iHostAppContext.appId()));
        hashMap.put("identity", this.LJIIJ);
        hashMap.put("live_id", String.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId()));
        return hashMap;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void connectToWebSocketReuse() {
        if (this.LJJJIL) {
            return;
        }
        if (TextUtils.isEmpty(this.LIZJ.LIZ())) {
            IMessageWsClient.Callback callback = this.LIZLLL;
            if (callback != null) {
                callback.onWebSocketDisconnected();
                return;
            }
            return;
        }
        try {
            ((IMessageService) CN1.LIZ(IMessageService.class)).initZstdCompressResourceWhenLivePlay();
            C37819Esp ttUrlDispatch = TTNetInit.ttUrlDispatch(o.LJJJJZ(this.LIZJ.LIZ(), "wss://", "https://", false));
            if (!TextUtils.isEmpty(ttUrlDispatch.LIZ)) {
                this.LJJIJL = ttUrlDispatch.LIZ;
            }
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap(LIZJ());
        hashMap.putAll(C87243YLv.LIZJ());
        this.LJJIL = C87245YLx.LIZJ();
        C32482Cow c32482Cow = this.LJIJJ;
        if (!c32482Cow.LIZIZ) {
            c32482Cow.LIZIZ = true;
            c32482Cow.LIZ = SystemClock.uptimeMillis();
        }
        C32079CiR.LJIIIZ("", this.LIZJ.LIZ(), true);
        this.LJIL.LIZ = new C87242YLu(this.LIZJ.LIZ(), hashMap, this);
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        Context context = this.LJII;
        kotlin.jvm.internal.o.LJI(context);
        String LIZ = this.LIZJ.LIZ();
        YM0 ym0 = this.LJIL;
        LIZLLL.getClass();
        this.LJIJJLI = ((INetworkService) CN1.LIZ(INetworkService.class)).registerWsChannel(context, LIZ, hashMap, ym0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final java.util.Map<String, String> getFetchHistoryParams() {
        String str;
        String str2;
        Resources resources;
        Configuration configuration;
        Locale locale;
        HashMap hashMap = new HashMap();
        hashMap.put("resp_content_type", "protobuf");
        Context context = this.LJII;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && (locale = configuration.locale) != null) {
            str = locale.getLanguage();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("app_language", str);
        hashMap.put("live_id", String.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId()));
        hashMap.remove("fetch_time");
        hashMap.remove("ack_ids");
        hashMap.put("identity", this.LJIIJ);
        hashMap.put("last_rtt", String.valueOf(this.LJIIL));
        hashMap.put("recv_cnt", String.valueOf(this.LJIILIIL));
        hashMap.put("parse_cnt", String.valueOf(this.LJIILJJIL));
        if (!TextUtils.isEmpty(this.LJIIJJI) && (str2 = this.LJIIJJI) != null) {
            hashMap.put("internal_ext", str2);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Object mv0 = dataChannelGlobal.mv0(C29034BaQ.class);
        if (mv0 == null) {
            mv0 = "";
        }
        hashMap.put("live_region", mv0);
        Object mv02 = dataChannelGlobal.mv0(C29035BaR.class);
        if (mv02 != 0) {
            str3 = mv02;
        }
        hashMap.put("room_tag", str3);
        return hashMap;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final boolean isWsConnected() {
        YM4 ym4 = this.LJIJJLI;
        if (ym4 != null) {
            return ym4.isConnected();
        }
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onRelease() {
        long j;
        InterfaceC37276Ek4<Q9I> interfaceC37276Ek4 = this.LJJIJIL;
        if (interfaceC37276Ek4 != null) {
            interfaceC37276Ek4.cancel();
        }
        C40579FwF LIZLLL = C40579FwF.LIZLLL();
        C87244YLw c87244YLw = this.LJJJI;
        if (c87244YLw == null) {
            LIZLLL.getClass();
        } else {
            ((OJM) LIZLLL.LIZ).LJIJ(c87244YLw);
        }
        C31495CXr c31495CXr = this.LIZJ.LIZIZ;
        int i = this.LJJI;
        int i2 = this.LJJIFFI;
        c31495CXr.getClass();
        int i3 = i + i2;
        if (i3 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("api_call_success_count", Integer.valueOf(i));
            hashMap.put("api_call_error_count", Integer.valueOf(i2));
            hashMap.put("api_call_success_ration", Double.valueOf((i * 1.0d) / i3));
            c31495CXr.LIZ(hashMap);
            C0K2.LJII(0, "ttlive_fetch_message_success_ratio", hashMap);
        }
        C31495CXr c31495CXr2 = this.LIZJ.LIZIZ;
        long j2 = this.LJJIII;
        long j3 = this.LJJII;
        c31495CXr2.getClass();
        if (j3 > 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("api_call_delay_count", Long.valueOf(j3));
            hashMap2.put("api_call_delay_all", Long.valueOf(j2));
            hashMap2.put("api_delay_average", Double.valueOf((j2 * 1.0d) / j3));
            c31495CXr2.LIZ(hashMap2);
            C0K2.LJIILL(0, 1, "ttlive_fetch_message_delay_average", hashMap2);
        }
        if (this.LJJIJIIJI != 0) {
            this.LJJIJIIJIL = (SystemClock.uptimeMillis() - this.LJJIJIIJI) + this.LJJIJIIJIL;
        }
        if (this.LJJIJ != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.LJJIJ;
            C32482Cow c32482Cow = this.LJIJJ;
            long j4 = this.LJJIJIIJIL;
            c32482Cow.LIZ();
            JSONObject jSONObject = new JSONObject();
            if (c32482Cow.LIZJ) {
                j = 1;
            } else {
                j = 0;
            }
            C12800eq.LIZ(jSONObject, "is_anchor", j);
            C12800eq.LIZ(jSONObject, "ws_time", j4);
            C12800eq.LIZ(jSONObject, "all_time", uptimeMillis);
            try {
                jSONObject.put("ws_rate", j4 / uptimeMillis);
            } catch (JSONException e) {
                C0NB.LJFF("TimeCostUtil", "", e);
            }
            c32482Cow.LIZLLL.LIZIZ(jSONObject);
            InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
            if (interfaceC31203CMl != null) {
                interfaceC31203CMl.LIZJ(0, "ttlive_ws_connect_rate", jSONObject);
            }
        }
        this.LJIIIZ = 0L;
        this.LJIIJJI = null;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = true;
        this.LJIILLIIL = true;
        this.LJJI = 0;
        this.LJJIFFI = 0;
        this.LJJII = 0;
        this.LJJIII = 0L;
        this.LJJIIJZLJL = false;
        this.LJJIIZ = false;
        this.LJJIIZI = 0L;
        this.LJJIJ = 0L;
        this.LJJIJIIJI = 0L;
        this.LJJIJIIJIL = 0L;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStartMessage() {
        if (this.LJJIJ == 0) {
            this.LJJIJ = SystemClock.uptimeMillis();
        }
        if (isWsConnected()) {
            this.LJJIJIIJI = SystemClock.uptimeMillis();
        }
        C40579FwF LIZLLL = C40579FwF.LIZLLL();
        C87244YLw c87244YLw = this.LJJJI;
        if (c87244YLw == null) {
            LIZLLL.getClass();
        } else {
            ((OJM) LIZLLL.LIZ).LJIIZILJ(c87244YLw);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getCurrentTimeMillis() {
        return C30725C4b.LIZ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final String getDomain() {
        String str;
        if (isWsConnected()) {
            str = this.LJJIJL;
        } else {
            str = this.LJJIJLIJ;
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        String host = UriProtector.parse(str).getHost();
        if (host == null) {
            return str;
        }
        return host;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getRoomId() {
        return this.LJ;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getUserId() {
        return this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.ugc.live.sdk.message.data.PayloadItem LIZLLL(com.bytedance.android.livesdkapi.ws.LiveWsMessage r15) {
        /*
            java.util.List<com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader> r0 = r15.msgHeaders
            r4 = 0
            if (r0 == 0) goto L96
            java.util.Iterator r3 = r0.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r0 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = "compress_type"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L9
        L20:
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r2 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r2
            if (r2 == 0) goto L96
            java.lang.String r7 = r2.value
        L26:
            java.util.List<com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader> r0 = r15.msgHeaders
            if (r0 == 0) goto L91
            java.util.Iterator r3 = r0.iterator()
        L2e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r0 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = "server_time"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L2e
            r4 = r2
        L46:
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r4 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r4
            if (r4 == 0) goto L91
            java.lang.String r0 = r4.value
            if (r0 == 0) goto L91
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L91
            long r12 = r0.longValue()
        L58:
            com.ss.ugc.live.sdk.message.data.PayloadItem r4 = new com.ss.ugc.live.sdk.message.data.PayloadItem
            java.lang.String r5 = r15.payloadType
            byte[] r0 = r15.payload
            if (r0 != 0) goto L65
            r0 = 1
            byte[] r0 = new byte[r0]
            r15.payload = r0
        L65:
            byte[] r6 = r15.payload
            long r8 = r15.logId
            long r10 = r15.seqId
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List<com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader> r0 = r15.msgHeaders
            if (r0 == 0) goto L98
            java.util.Iterator r3 = r0.iterator()
        L78:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r3.next()
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r0 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r0
            X.YLz r2 = new X.YLz
            java.lang.String r1 = r0.key
            java.lang.String r0 = r0.value
            r2.<init>(r1, r0)
            r14.add(r2)
            goto L78
        L91:
            r12 = 0
            goto L58
        L94:
            r2 = r4
            goto L20
        L96:
            r7 = r4
            goto L26
        L98:
            r4.<init>(r5, r6, r7, r8, r10, r12, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87241YLt.LIZLLL(com.bytedance.android.livesdkapi.ws.LiveWsMessage):com.ss.ugc.live.sdk.message.data.PayloadItem");
    }

    public final void LJFF(ProtoApiResult protoApiResult) {
        byte[] bArr;
        Class<? extends CR6> messageClass;
        CR6 cr6;
        int i;
        List<ProtoApiResult.ProtoMessage> list = protoApiResult.protoMessages;
        boolean z = false;
        if (list == null || list.isEmpty()) {
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            C28176B4a.LIZIZ(c61878OQg, c61878OQg);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ProtoApiResult.ProtoMessage protoMessage : protoApiResult.protoMessages) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (TextUtils.isEmpty(protoMessage.method) || (bArr = protoMessage.payload) == null || bArr.length == 0) {
                if (TextUtils.isEmpty(protoMessage.method)) {
                    ReasonMessage from = ReasonMessage.from("", z, "Method is empty.");
                    kotlin.jvm.internal.o.LJIIIIZZ(from, "from(\"\", false, \"Method is empty.\")");
                    arrayList2.add(from);
                } else {
                    ReasonMessage from2 = ReasonMessage.from(protoMessage.method, z, "Payload is empty.");
                    kotlin.jvm.internal.o.LJIIIIZZ(from2, "from(\n                  …                        )");
                    arrayList2.add(from2);
                }
            } else {
                try {
                    messageClass = ((IMessageService) CN1.LIZ(IMessageService.class)).getMessageClass(protoMessage.method);
                } catch (Throwable th) {
                    th = th;
                }
                if (messageClass == null) {
                    String str = protoMessage.method;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("No corresponding class definition for method ");
                    LIZ.append(protoMessage.method);
                    LIZ.append('.');
                    ReasonMessage from3 = ReasonMessage.from(str, z, X1D.LIZIZ(LIZ));
                    kotlin.jvm.internal.o.LJIIIIZZ(from3, "from(\n                  …                        )");
                    arrayList2.add(from3);
                } else {
                    C65124PhA.LIZLLL().getClass();
                    InterfaceC31105CIr LJ = C65124PhA.LJ(messageClass);
                    if (LJ != null) {
                        long LIZ2 = C30725C4b.LIZ();
                        Q9H q9h = new Q9H();
                        try {
                            try {
                                q9h.LJIIL(new Q9M(protoMessage.payload));
                                cr6 = (CR6) LJ.LIZ(q9h);
                                cr6.setDecodeStartAtMillis(LIZ2);
                                cr6.setDecodeEndAtMillis(C30725C4b.LIZ());
                                if (this.LJJIIJ != null && (cr6 instanceof ChatMessage) && ((ChatMessage) cr6).userInfo != null && ((ChatMessage) cr6).userInfo.getId() == this.LJFF) {
                                    MessageService messageService = this.LJJIIJ;
                                    ChatMessage chatMessage = (ChatMessage) cr6;
                                    messageService.getClass();
                                    Iterator<InterfaceC31452CWa> it = messageService.LJLIL.iterator();
                                    while (it.hasNext()) {
                                        it.next().LIZ(chatMessage);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                C32079CiR.LJFF(th, protoMessage, protoApiResult.protoMessages, protoApiResult.messageFrom);
                                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                                StackTraceElement[] stackTrace = th.getStackTrace();
                                LJIILIIL.getClass();
                                C0NE.LJIIL(6, stackTrace);
                                this.LIZJ.LIZIZ.LJII(protoMessage.method, th);
                                ReasonMessage from4 = ReasonMessage.from(protoMessage.method, false, Arrays.toString(th.getStackTrace()));
                                kotlin.jvm.internal.o.LJIIIIZZ(from4, "from(\n                  …e),\n                    )");
                                arrayList2.add(from4);
                                z = false;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        C32079CiR.LJFF(new Throwable("Failed to decode, message decoder is null!"), protoMessage, protoApiResult.protoMessages, protoApiResult.messageFrom);
                        this.LIZJ.LIZIZ.LJII(protoMessage.method, new Throwable("Failed to decode, message decoder is null!"));
                        String str2 = protoMessage.method;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("No corresponding decoder for method ");
                        LIZ3.append(protoMessage.method);
                        LIZ3.append('.');
                        ReasonMessage from5 = ReasonMessage.from(str2, false, X1D.LIZIZ(LIZ3));
                        kotlin.jvm.internal.o.LJIIIIZZ(from5, "from(\n                  …                        )");
                        arrayList2.add(from5);
                        cr6 = null;
                    }
                    int value = UsePbObjectJsonPassThroughSetting.INSTANCE.getValue();
                    if (value > 0) {
                        String str3 = protoMessage.method;
                        kotlin.jvm.internal.o.LJIIIIZZ(str3, "protoMessage.method");
                        CR6 LIZIZ = LIZIZ(cr6, str3);
                        if (value == 2) {
                            cr6 = LIZIZ;
                        }
                    }
                    if (cr6 != null) {
                        cr6.isFirst = protoApiResult.isFirst;
                        cr6.generalMessageType = protoMessage.msgType;
                        cr6.messageFrom = protoApiResult.messageFrom;
                        cr6.timestamp = protoApiResult.now;
                        cr6.isHistoryMessage = protoMessage.isHistoryMsg;
                        cr6.receiveTime = C30725C4b.LIZ();
                        C29827BnD.LIZIZ(cr6, this.LJI);
                        InterfaceC28738BPq interfaceC28738BPq = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ;
                        if (interfaceC28738BPq != null) {
                            C31495CXr c31495CXr = this.LIZJ.LIZIZ;
                            long LJJJJLL = interfaceC28738BPq.LJJJJLL();
                            c31495CXr.getClass();
                            C31495CXr.LJI(LJJJJLL);
                            cr6.dispatchTimeoutMilis = LiveMessageSEITimeoutSetting.INSTANCE.calculateSEIDelayRegulateByConfig(interfaceC28738BPq.LJJJJLL());
                        }
                        ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
                        if (SharePrefCache.inst().isEnableMessagePb2Json().LIZ().booleanValue()) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("PB2JSON ");
                            LIZ4.append(protoMessage.method);
                            C0NB.LIZIZ(X1D.LIZIZ(LIZ4), C09650Zl.LIZIZ.LJIILL(cr6));
                        }
                        if (this.LJIILL) {
                            this.LJIILL = false;
                            C31495CXr c31495CXr2 = this.LIZJ.LIZIZ;
                            String str4 = protoMessage.method;
                            long messageId = cr6.getMessageId();
                            c31495CXr2.getClass();
                            C31495CXr.LJ(messageId, "ON_FIRST_MSG_RECEIVED", str4);
                        }
                        if (this.LJIILLIIL && (cr6 instanceof MemberMessage) && ((MemberMessage) cr6).user != null && ((MemberMessage) cr6).user.getId() == this.LJFF) {
                            this.LJIILLIIL = false;
                            C31495CXr c31495CXr3 = this.LIZJ.LIZIZ;
                            long messageId2 = ((MemberMessage) cr6).getMessageId();
                            c31495CXr3.getClass();
                            C31495CXr.LJ(messageId2, "ON_SELF_ENTER_MSG_RECEIVED", "WebcastMemberMessage");
                        }
                        C32079CiR.LJI(cr6);
                        protoApiResult.messages.add(cr6);
                        IdMessage from6 = IdMessage.from(cr6);
                        kotlin.jvm.internal.o.LJIIIIZZ(from6, "from(baseLiveMessage)");
                        arrayList.add(from6);
                        java.util.Map<String, Object> extraParams = cr6.getExtraParams();
                        kotlin.jvm.internal.o.LJIIIIZZ(extraParams, "baseLiveMessage.extraParams");
                        byte[] bArr2 = protoMessage.payload;
                        if (bArr2 != null) {
                            i = bArr2.length;
                        } else {
                            i = 0;
                        }
                        extraParams.put("extra_message_paylod_size", Integer.valueOf(i));
                        java.util.Map<String, Object> extraParams2 = cr6.getExtraParams();
                        kotlin.jvm.internal.o.LJIIIIZZ(extraParams2, "baseLiveMessage.extraParams");
                        extraParams2.put(MessageMonitor.getLiveMessageStageName("decode_self_message_time", MessageMonitor.Stage.START), Long.valueOf(elapsedRealtime2));
                        java.util.Map<String, Object> extraParams3 = cr6.getExtraParams();
                        kotlin.jvm.internal.o.LJIIIIZZ(extraParams3, "baseLiveMessage.extraParams");
                        extraParams3.put(MessageMonitor.getLiveMessageStageName("decode_self_message_time", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
                        cr6.messageTrackTimeInfo.receiveMessageTime = protoApiResult.receiveMessageTime;
                        java.util.Map<String, Object> extraParams4 = cr6.getExtraParams();
                        kotlin.jvm.internal.o.LJIIIIZZ(extraParams4, "baseLiveMessage.extraParams");
                        extraParams4.put("extra_message_imsdk_scene", Integer.valueOf(C32072CiK.LIZ(this.LIZJ.LIZ)));
                    } else {
                        C32079CiR.LJFF(new Throwable("Failed to decode, message is empty after decode!"), protoMessage, protoApiResult.protoMessages, protoApiResult.messageFrom);
                        ReasonMessage from7 = ReasonMessage.from(protoMessage.method, false, "Message is empty after parsing.");
                        kotlin.jvm.internal.o.LJIIIIZZ(from7, "from(\n                  …                        )");
                        arrayList2.add(from7);
                    }
                    z = false;
                }
            }
        }
        this.LJIILIIL = protoApiResult.protoMessages.size();
        this.LJIILJJIL = protoApiResult.messages.size();
        C28176B4a.LIZIZ(arrayList, arrayList2);
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        if (!C79004UzY.LJJIFFI(protoApiResult.messages)) {
            for (IMessage iMessage : protoApiResult.messages) {
                if (protoApiResult.extraParams != null) {
                    java.util.Map<String, Object> extraParams5 = iMessage.getExtraParams();
                    java.util.Map<String, Object> map = protoApiResult.extraParams;
                    kotlin.jvm.internal.o.LJIIIIZZ(map, "apiResult.extraParams");
                    extraParams5.putAll(map);
                }
                java.util.Map<String, Object> extraParams6 = iMessage.getExtraParams();
                kotlin.jvm.internal.o.LJIIIIZZ(extraParams6, "message.extraParams");
                extraParams6.put(MessageMonitor.getLiveMessageStageName("decode_whole_message_time", MessageMonitor.Stage.START), Long.valueOf(elapsedRealtime));
                java.util.Map<String, Object> extraParams7 = iMessage.getExtraParams();
                kotlin.jvm.internal.o.LJIIIIZZ(extraParams7, "message.extraParams");
                extraParams7.put(MessageMonitor.getLiveMessageStageName("decode_whole_message_time", MessageMonitor.Stage.END), Long.valueOf(elapsedRealtime3));
                java.util.Map<String, Object> extraParams8 = iMessage.getExtraParams();
                kotlin.jvm.internal.o.LJIIIIZZ(extraParams8, "message.extraParams");
                extraParams8.put("extra_first_batch", Boolean.valueOf(protoApiResult.isFirst));
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final ProtoApiResult decodeProtoApiResult(ProtoApiResult protoApiResult) {
        if (protoApiResult == null) {
            return null;
        }
        LJFF(protoApiResult);
        return protoApiResult;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void disconnectFromWebSocket(String reason) {
        kotlin.jvm.internal.o.LJIIIZ(reason, "reason");
        this.LJIL.LIZ = null;
        YM4 ym4 = this.LJIJJLI;
        if (ym4 != null) {
            ym4.LIZIZ();
        }
        if (TextUtils.equals(reason, "ws_connect_timeout")) {
            this.LJIJJ.LIZJ(this.LJ, -1, reason, this.LJJ, null, this.LJJIIJZLJL, this.LJJIIZ);
            return;
        }
        if (TextUtils.equals(reason, "retry_count_over")) {
            this.LJIJJ.LIZIZ(this.LJ, reason, this.LJJ, this.LJJIIZ);
        } else if (TextUtils.equals(reason, "service_close_cmd")) {
            this.LJIJJ.LIZIZ(this.LJ, reason, this.LJJ, this.LJJIIZ);
        } else {
            if (!TextUtils.equals(reason, "im_enter_room_timeout")) {
                return;
            }
            this.LJIJJ.LIZJ(this.LJ, -1, reason, this.LJJ, null, this.LJJIIJZLJL, this.LJJIIZ);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStopMessage(boolean z) {
        InterfaceC37276Ek4<Q9I> interfaceC37276Ek4;
        if (z && (interfaceC37276Ek4 = this.LJJIJIL) != null) {
            interfaceC37276Ek4.cancel();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendUplinkPacket(PayloadItem payloadItem) {
        kotlin.jvm.internal.o.LJIIIZ(payloadItem, "payloadItem");
        YM4 ym4 = this.LJIJJLI;
        if (ym4 != null && ym4.isConnected() && kotlin.jvm.internal.o.LJ("uplink_im_gateway", payloadItem.getPayloadType())) {
            QO7 qo7 = new QO7(10001);
            qo7.LIZJ = payloadItem.getLogId();
            qo7.LJIIIIZZ = payloadItem.getSeqId();
            qo7.LIZLLL = 20045;
            qo7.LJ = 1;
            qo7.LJFF = payloadItem.getPayload();
            qo7.LJI = payloadItem.getPayloadType();
            qo7.LJII = payloadItem.getPayloadEncoding();
            LiveWsMessage LIZ = qo7.LIZ();
            YM4 ym42 = this.LJIJJLI;
            if (ym42 != null) {
                ym42.LIZ(LIZ);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setCallback(IMessageWsClient.Callback callback) {
        this.LIZLLL = callback;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setWebSocketServerTimeGap(long j) {
        if (isWsConnected()) {
            C31012CFc.LJIIJJI(j);
        }
    }

    public static CR6 LIZIZ(CR6 cr6, String str) {
        String str2;
        CommonMessageData commonMessageData;
        Gson gson = C09650Zl.LIZIZ;
        MessageJsonPassThroughModel messageJsonPassThroughModel = new MessageJsonPassThroughModel(str, GsonProtectorUtils.toJsonTree(gson, cr6).LJIIZILJ());
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LiveMtPbRequestsSetting.INSTANCE.getValue().getPassThroughApi());
        LIZ.append("/message/");
        if (cr6 != null && (commonMessageData = cr6.baseMessage) != null) {
            str2 = commonMessageData.method;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ArrayList arrayList = new ArrayList();
        String json = GsonProtectorUtils.toJson(gson, messageJsonPassThroughModel);
        kotlin.jvm.internal.o.LJIIIIZZ(json, "get().toJson(model)");
        Charset charset = PVC.LIZ;
        byte[] bytes = json.getBytes(charset);
        kotlin.jvm.internal.o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        LIZLLL.getClass();
        byte[] bArr = ((C65123Ph9) C65124PhA.LJFF(LIZIZ, arrayList, "application/json", bytes)).LIZ().LJ;
        kotlin.jvm.internal.o.LJIIIIZZ(bArr, "getInstance().post(\n    …         ).execute().body");
        Object fromJson = GsonProtectorUtils.fromJson(gson, new String(bArr, charset), (Class<Object>) MessageJsonPassThroughModel.class);
        kotlin.jvm.internal.o.LJIIIIZZ(fromJson, "get().fromJson(resultStr…ThroughModel::class.java)");
        MessageJsonPassThroughModel messageJsonPassThroughModel2 = (MessageJsonPassThroughModel) fromJson;
        Object fromJson2 = GsonProtectorUtils.fromJson(gson, (j) messageJsonPassThroughModel2.msg, (Class<Object>) ((IMessageService) CN1.LIZ(IMessageService.class)).getMessageClass(messageJsonPassThroughModel2.method));
        kotlin.jvm.internal.o.LJIIIIZZ(fromJson2, "get().fromJson(\n        …(model.method),\n        )");
        return (CR6) fromJson2;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void connectToWebSocket(java.util.Map<String, String> routeParams, String cursor) {
        kotlin.jvm.internal.o.LJIIIZ(routeParams, "routeParams");
        kotlin.jvm.internal.o.LJIIIZ(cursor, "cursor");
        String str = this.LJJ;
        if (TextUtils.isEmpty(str)) {
            IMessageWsClient.Callback callback = this.LIZLLL;
            if (callback != null) {
                callback.onWebSocketDisconnected();
                return;
            }
            return;
        }
        this.LJJIJL = str;
        String uri = UriProtector.parse(str).buildUpon().appendQueryParameter("live_region", (String) DataChannelGlobal.LJLJJI.mv0(C29034BaQ.class)).build().toString();
        HashMap hashMap = new HashMap(LIZJ());
        hashMap.putAll(routeParams);
        hashMap.putAll(C87243YLv.LIZJ());
        hashMap.put("cursor", cursor);
        this.LJJIL = C87245YLx.LIZJ();
        C32482Cow c32482Cow = this.LJIJJ;
        if (!c32482Cow.LIZIZ) {
            c32482Cow.LIZIZ = true;
            c32482Cow.LIZ = SystemClock.uptimeMillis();
        }
        C32079CiR.LJIIIZ(cursor, uri, false);
        this.LJIL.LIZ = new C87242YLu(uri, hashMap, this);
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        Context context = this.LJII;
        kotlin.jvm.internal.o.LJI(context);
        YM0 ym0 = this.LJIL;
        LIZLLL.getClass();
        this.LJIJJLI = ((INetworkService) CN1.LIZ(INetworkService.class)).registerWsChannel(context, uri, hashMap, ym0);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeHostWebSocketPayload(PayloadItem payloadItem, boolean z) {
        String str;
        String str2;
        kotlin.jvm.internal.o.LJIIIZ(payloadItem, "payloadItem");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.LJJIL) {
                str = "zstd";
            } else {
                str = "gzip";
            }
            linkedHashMap.put("compress_type_requested", str);
            if (this.LJJIL) {
                str2 = String.valueOf(C87245YLx.LIZIZ);
            } else {
                str2 = "";
            }
            linkedHashMap.put("dict_version_requested", str2);
            try {
                ProtoApiResult LJ = LJ(new Q9M(C87243YLv.LIZ(payloadItem, linkedHashMap)), false, true, 2, payloadItem.getMessageTrackTimeInfo().receiveMessageTime, C87246YLy.LIZJ(payloadItem), C87246YLy.LIZ(payloadItem), payloadItem.getExtraParams(), payloadItem.getCompressType(), z, C87246YLy.LIZIZ(payloadItem));
                LJ.payloadType = payloadItem.getPayloadType();
                LJ.logId = payloadItem.getLogId();
                try {
                    IMessageWsClient.Callback callback = this.LIZLLL;
                    if (callback != null) {
                        callback.onHostWebSocketPayloadDecoded(LJ, z);
                    }
                } catch (Exception e) {
                    e = e;
                    if (!C30922CBq.LIZIZ) {
                    } else {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeWebSocketPayload(PayloadItem payloadItem, boolean z) {
        Q9I q9l;
        kotlin.jvm.internal.o.LJIIIZ(payloadItem, "payloadItem");
        try {
            String str = "";
            String str2 = "zstd";
            if (!LiveGCOptimizeSettingV2.isEnableMessage()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!this.LJJIL) {
                    str2 = "gzip";
                }
                linkedHashMap.put("compress_type_requested", str2);
                if (this.LJJIL) {
                    str = String.valueOf(C87245YLx.LIZIZ);
                }
                linkedHashMap.put("dict_version_requested", str);
                q9l = new Q9M(C87243YLv.LIZ(payloadItem, linkedHashMap));
            } else {
                this.LJJIZ.LJLIL = 0;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (!this.LJJIL) {
                    str2 = "gzip";
                }
                linkedHashMap2.put("compress_type_requested", str2);
                if (this.LJJIL) {
                    str = String.valueOf(C87245YLx.LIZIZ);
                }
                linkedHashMap2.put("dict_version_requested", str);
                C87243YLv.LIZIZ(payloadItem, linkedHashMap2, this.LJJIZ, new AqS165S0100000_15(this, 852));
                C84689XLp c84689XLp = this.LJJIZ;
                c84689XLp.getClass();
                q9l = new Q9L(new C38487F8p(c84689XLp.LJLILLLLZI, c84689XLp.LJLIL), this.LJJIZ.LJLIL);
            }
            try {
                ProtoApiResult LJ = LJ(q9l, false, true, 1, payloadItem.getMessageTrackTimeInfo().receiveMessageTime, C87246YLy.LIZJ(payloadItem), C87246YLy.LIZ(payloadItem), payloadItem.getExtraParams(), payloadItem.getCompressType(), z, C87246YLy.LIZIZ(payloadItem));
                LJ.payloadType = payloadItem.getPayloadType();
                LJ.logId = payloadItem.getLogId();
                if (LJ.cursor == null) {
                    return;
                }
                try {
                    IMessageWsClient.Callback callback = this.LIZLLL;
                    if (callback != null) {
                        callback.onWebSocketPayloadDecoded(LJ, z);
                    }
                    C84689XLp c84689XLp2 = this.LJJIZ;
                    byte[] bArr = c84689XLp2.LJLILLLLZI;
                    if (bArr.length > 262144) {
                        c84689XLp2.LJLIL = 0;
                        int length = bArr.length;
                        int i = c84689XLp2.LJLJI;
                        if (length != i) {
                            c84689XLp2.LJLILLLLZI = new byte[i];
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    if (!C30922CBq.LIZIZ) {
                        if (e instanceof YM2) {
                            C87245YLx.LJFF = true;
                            YM4 ym4 = this.LJIJJLI;
                            if (ym4 != null) {
                                ym4.LIZIZ();
                            }
                            YM1.LIZIZ().LIZ();
                            IMessageWsClient.Callback callback2 = this.LIZLLL;
                            if (callback2 != null) {
                                callback2.onWebSocketDisconnected();
                            }
                            C0NB.LJIIIZ("LiveWs", "disconnect websocket due to zstd decompress fail");
                            return;
                        }
                        return;
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setData(long j, Context context) {
        Context applicationContext;
        this.LJ = j;
        if (context != null) {
            applicationContext = C16880lQ.LLLLL(context);
        } else {
            applicationContext = GlobalContext.getApplicationContext();
        }
        this.LJII = applicationContext;
        C84689XLp c84689XLp = this.LJJIZ;
        c84689XLp.LJLIL = 0;
        int length = c84689XLp.LJLILLLLZI.length;
        int i = c84689XLp.LJLJI;
        if (length != i) {
            c84689XLp.LJLILLLLZI = new byte[i];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", Long.valueOf(this.LJFF));
        linkedHashMap.put("room_id", Long.valueOf(this.LJ));
        linkedHashMap.put("is_anchor", Boolean.valueOf(C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)));
        HashMap hashMap = (HashMap) C32079CiR.LIZ;
        hashMap.clear();
        hashMap.putAll(linkedHashMap);
    }

    public C87241YLt(boolean z, long j, C32083CiV c32083CiV) {
        String str;
        this.LIZJ = c32083CiV;
        C84689XLp c84689XLp = new C84689XLp();
        c84689XLp.LJLJJI = true;
        this.LJJIZ = c84689XLp;
        this.LJJJ = C78996UzQ.LJJIJIIJI(C32085CiX.LJLIL);
        this.LJJJI = new C87244YLw(this);
        this.LJIIIIZZ = (MessageApi) Q7L.LIZIZ(MessageApi.class);
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.LJIIJ = str;
        this.LJFF = j;
        this.LJI = z;
        InterfaceC06390Mx LIZ = CN1.LIZ(IMessageService.class);
        kotlin.jvm.internal.o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.android.livesdk.MessageService");
        this.LJJIIJ = (MessageService) LIZ;
        this.LJIJJ = new C32482Cow(z, c32083CiV.LIZIZ);
        this.LJJJIL = LiveMessageForceHttpSetting.INSTANCE.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0360  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void apiCall(java.util.Map<java.lang.String, java.lang.String> r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87241YLt.apiCall(java.util.Map, int, boolean):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendHeartBeatMsg(long j, long j2, long j3, boolean z) {
        long j4;
        HeartBeat heartBeat = new HeartBeat();
        if (z) {
            j4 = this.LJ;
        } else {
            j4 = 0;
        }
        heartBeat.roomId = j4;
        heartBeat.sendPacketSeqId = j;
        byte[] LIZ = C64603PXb.LIZ(heartBeat, this.LJIJI);
        if (LIZ == null) {
            return;
        }
        sendWebSocketMessage("pb", "hb", LIZ, j2, j3);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendImEnterRoomMsg(String str, long j, long j2, long j3) {
        byte[] LIZ;
        String str2;
        String str3 = str;
        C32083CiV c32083CiV = this.LIZJ;
        long j4 = this.LJ;
        String identity = this.LJIIJ;
        ImEnterRoom_ProtoEncoder imEnterRoomProtoEncoder = this.LJIIZILJ;
        _PreviewRoom_ProtoEncoder previewProtoEncoder = this.LJIJ;
        c32083CiV.getClass();
        kotlin.jvm.internal.o.LJIIIZ(identity, "identity");
        kotlin.jvm.internal.o.LJIIIZ(imEnterRoomProtoEncoder, "imEnterRoomProtoEncoder");
        kotlin.jvm.internal.o.LJIIIZ(previewProtoEncoder, "previewProtoEncoder");
        EnumC32070CiI enumC32070CiI = c32083CiV.LIZ;
        EnumC32070CiI enumC32070CiI2 = EnumC32070CiI.PREVIEW;
        if (enumC32070CiI == enumC32070CiI2) {
            PreviewRoom previewRoom = new PreviewRoom();
            previewRoom.roomId = j4;
            previewRoom.liveId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
            previewRoom.identity = identity;
            if (str3 == null) {
                str3 = "";
            }
            previewRoom.cursor = str3;
            previewRoom.accountType = B83.LIZ().LIZIZ().getCurrentUser().getSecret();
            previewRoom.enterUniqId = j3;
            LIZ = C64603PXb.LIZ(previewRoom, previewProtoEncoder);
        } else {
            ImEnterRoom imEnterRoom = new ImEnterRoom();
            imEnterRoom.roomId = j4;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            imEnterRoom.roomTag = (String) dataChannelGlobal.mv0(C29035BaR.class);
            imEnterRoom.liveRegion = (String) dataChannelGlobal.mv0(C29034BaQ.class);
            imEnterRoom.liveId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
            imEnterRoom.identity = identity;
            imEnterRoom.cursor = str3;
            imEnterRoom.accountType = B83.LIZ().LIZIZ().getCurrentUser().getSecret();
            imEnterRoom.enterUniqueId = j3;
            imEnterRoom.filterWelcomeMsg = CardStruct.IStatusCode.DEFAULT;
            LIZ = C64603PXb.LIZ(imEnterRoom, imEnterRoomProtoEncoder);
        }
        if (LIZ == null) {
            return;
        }
        if (this.LIZJ.LIZ == enumC32070CiI2) {
            str2 = "im_preview_room";
        } else {
            str2 = "im_enter_room";
        }
        sendWebSocketMessage("pb", str2, LIZ, j, j2);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendWebSocketMessage(String encodeType, String payloadType, byte[] payload, long j, long j2) {
        kotlin.jvm.internal.o.LJIIIZ(encodeType, "encodeType");
        kotlin.jvm.internal.o.LJIIIZ(payloadType, "payloadType");
        kotlin.jvm.internal.o.LJIIIZ(payload, "payload");
        YM4 ym4 = this.LJIJJLI;
        if (ym4 != null && ym4.isConnected()) {
            QO7 qo7 = new QO7(10001);
            qo7.LIZJ = j;
            qo7.LJIIIIZZ = j2;
            qo7.LIZLLL = 1;
            qo7.LJ = 1;
            qo7.LJFF = payload;
            qo7.LJI = payloadType;
            qo7.LJII = encodeType;
            LiveWsMessage LIZ = qo7.LIZ();
            YM4 ym42 = this.LJIJJLI;
            if (ym42 != null) {
                ym42.LIZ(LIZ);
            }
        }
    }

    public final ProtoApiResult LJ(Q9I q9i, boolean z, boolean z2, int i, long j, long j2, long j3, java.util.Map<String, ? extends Object> map, String str, boolean z3, String str2) {
        ArrayList arrayList;
        C65124PhA.LIZLLL().getClass();
        InterfaceC31105CIr LJ = C65124PhA.LJ(ProtoMessageFetchResult.class);
        if (LJ != null) {
            Q9H q9h = new Q9H();
            q9h.LJIIL(q9i);
            ProtoMessageFetchResult protoMessageFetchResult = (ProtoMessageFetchResult) LJ.LIZ(q9h);
            if (z) {
                this.LJJ = protoMessageFetchResult.pushServer;
            }
            ProtoApiResult protoApiResult = new ProtoApiResult();
            if (!LiveMessageImCursorOptSetting.INSTANCE.getValue() || str2 == null || str2.length() == 0) {
                protoApiResult.cursor = protoMessageFetchResult.cursor;
            } else {
                protoApiResult.cursor = str2;
            }
            protoApiResult.fetchInterval = protoMessageFetchResult.fetchInterval;
            protoApiResult.now = protoMessageFetchResult.now;
            protoApiResult.messages = new LinkedList();
            protoApiResult.fetchType = protoMessageFetchResult.fetchType;
            protoApiResult.routeParams = protoMessageFetchResult.routeParams;
            protoApiResult.heartbeatDuration = protoMessageFetchResult.heartbeatDuration;
            protoApiResult.needAck = protoMessageFetchResult.needAck;
            String str3 = protoMessageFetchResult.internalExt;
            protoApiResult.internalExt = str3;
            protoApiResult.pushServer = protoMessageFetchResult.pushServer;
            this.LJIIJJI = str3;
            protoApiResult.dimension = j2;
            protoApiResult.enterUniqueId = j3;
            protoApiResult.isFirst = protoMessageFetchResult.isFirst;
            protoApiResult.messageFrom = i;
            protoApiResult.receiveMessageTime = j;
            protoApiResult.extraParams = map;
            protoApiResult.compressType = str;
            protoApiResult.historyNoMore = protoMessageFetchResult.historyNoMore;
            String str4 = protoMessageFetchResult.historyCommentCursor;
            protoApiResult.historyCommentCursor = str4;
            kotlin.jvm.internal.o.LJIIIIZZ(str4, "result.historyCommentCursor");
            if (str4.length() > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("historyCommentCursor = ");
                LIZ.append(protoMessageFetchResult.historyCommentCursor);
                LIZ.append("--hasMore=");
                LIZ.append(!protoMessageFetchResult.historyNoMore);
                C0NB.LJ("LiveMessageWebsocketClienthistory", X1D.LIZIZ(LIZ));
                HistoryInfo historyInfo = new HistoryInfo();
                historyInfo.setHasMore(!protoMessageFetchResult.historyNoMore);
                String str5 = protoMessageFetchResult.historyCommentCursor;
                kotlin.jvm.internal.o.LJIIIIZZ(str5, "result.historyCommentCursor");
                historyInfo.setCommentCursor(str5);
                ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Qm(this.LJ, historyInfo);
            }
            if (!z2) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = currentTimeMillis - this.LJIIIZ;
                this.LJIIL = j4;
                long j5 = ((j4 / 2) + protoMessageFetchResult.now) - currentTimeMillis;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setServerTimeGap = ");
                LIZ2.append(j5);
                C0NB.LIZIZ("LiveMessageWebsocketClient", X1D.LIZIZ(LIZ2));
                C31012CFc.LJIIJJI(j5);
                this.LJJII++;
                long j6 = this.LJJIII;
                long j7 = this.LJIIL;
                this.LJJIII = j6 + j7;
                C31495CXr c31495CXr = this.LIZJ.LIZIZ;
                long j8 = this.LJIIIZ;
                long j9 = protoMessageFetchResult.now;
                c31495CXr.getClass();
                long j10 = C31495CXr.LJLJI;
                if (j10 > 0 && j7 >= j10) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("api_call_start_time", Long.valueOf(j8));
                    hashMap.put("api_call_time_stamp", Long.valueOf(j9));
                    hashMap.put("api_delay", Long.valueOf(j7));
                    c31495CXr.LIZ(hashMap);
                    C0NB.LJIIIZ("LiveMessageMonitor", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, hashMap));
                    C0K2.LJII(0, "ttlive_fetch_message_time_out", hashMap);
                }
            }
            if (C32151Nz.LJJIIJZLJL(protoMessageFetchResult.messages)) {
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                C28176B4a.LIZIZ(c61878OQg, c61878OQg);
                return protoApiResult;
            }
            List<ProtoMessageFetchResult.BaseProtoMessage> list = protoMessageFetchResult.messages;
            if (list != null) {
                arrayList = new ArrayList();
                for (ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage : list) {
                    ProtoApiResult.ProtoMessage protoMessage = new ProtoApiResult.ProtoMessage();
                    protoMessage.method = baseProtoMessage.method;
                    protoMessage.payload = baseProtoMessage.payload;
                    protoMessage.msgId = baseProtoMessage.msgId;
                    protoMessage.msgType = baseProtoMessage.msgType;
                    protoMessage.isHistoryMsg = baseProtoMessage.isHistory;
                    arrayList.add(protoMessage);
                }
            } else {
                arrayList = null;
            }
            protoApiResult.protoMessages = arrayList;
            if (z3) {
                LJFF(protoApiResult);
            }
            return protoApiResult;
        }
        C28176B4a.LIZ("No ProtoDecoder found for ProtoMessageFetchResult.");
        throw new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
    }
}
