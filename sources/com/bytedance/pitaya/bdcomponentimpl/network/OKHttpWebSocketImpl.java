package com.bytedance.pitaya.bdcomponentimpl.network;

import X.C64600PWy;
import X.C64618PXq;
import X.C93268aO8;
import X.C93336aPE;
import X.InterfaceC93315aOt;
import X.PXX;
import X.X1D;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.net.IWebSocket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class OKHttpWebSocketImpl extends IWebSocket implements ICrashCallback {
    public static final C93268aO8 Companion = new C93268aO8();
    public final C93336aPE listener;
    public PXX socket;
    public final InterfaceC93315aOt stateCallback;
    public final String url;

    @Override // com.bytedance.pitaya.thirdcomponent.net.IWebSocket
    public InterfaceC93315aOt getStateCallback() {
        return null;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.IWebSocket
    public void close() {
        PXX pxx = this.socket;
        if (pxx != null) {
            pxx.LIZ(1001, "Manually shutdown");
        }
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.IWebSocket
    public void open() {
        C64600PWy c64600PWy = new C64600PWy();
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(getUrl());
        c64600PWy.LIZIZ(c64618PXq.LIZIZ(), this.listener);
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.IWebSocket
    public String getUrl() {
        return this.url;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.IWebSocket
    public void sendMessage(String message) {
        o.LJIIJ(message, "message");
        PXX pxx = this.socket;
        if (pxx != null) {
            pxx.LIZIZ(message);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKHttpWebSocketImpl(String url, InterfaceC93315aOt interfaceC93315aOt) {
        super(url, interfaceC93315aOt);
        o.LJIIJ(url, "url");
        this.url = url;
        this.listener = new C93336aPE(this);
    }

    @Override // com.bytedance.crash.ICrashCallback
    public void onCrash(CrashType type, String str, Thread thread) {
        String LIZIZ;
        o.LJIIJ(type, "type");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Client crash detecting! crash type is ");
        LIZ.append(type);
        LIZ.append(", in thread ");
        LIZ.append(thread);
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        if (type == CrashType.JAVA) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ2);
            LIZ2.append(", info is ");
            LIZ2.append(str);
            LIZIZ = X1D.LIZIZ(LIZ2);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ2);
            LIZ3.append(",Native stack is unavailable");
            LIZIZ = X1D.LIZIZ(LIZ3);
        }
        PitayaLogger.LIZIZ("DefaultSocket", LIZIZ);
        JSONObject put = new JSONObject().put("level", "ERROR").put("log", LIZIZ);
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
        format.toString();
        JSONObject put2 = new JSONObject().put("type", "logs").put("content", new JSONObject().put("logs", put.put("date", format))).put("from", "client").put("target", "browser");
        PXX pxx = this.socket;
        if (pxx != null) {
            pxx.LIZIZ(put2.toString());
        }
    }
}
