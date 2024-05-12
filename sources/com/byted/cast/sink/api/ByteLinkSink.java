package com.byted.cast.sink.api;

import android.app.Application;
import android.content.Context;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.RTCStatistics;
import com.byted.cast.sink.a.a;
import com.byted.cast.sink.api.multiple.IMultipleActiveControl;
import com.byted.cast.sink.api.multiple.IMultipleLoader;
import com.byted.cast.sink.api.multiple.IMultipleReverseControl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public class ByteLinkSink {
    public static Map<String, ByteLinkSink> b = new HashMap();
    public a a;

    public ByteLinkSink(ContextManager.CastContext castContext) {
        this.a = new a(castContext);
    }

    public static ByteLinkSink getInstance(ContextManager.CastContext castContext) {
        ByteLinkSink byteLinkSink;
        String contextId = castContext != null ? castContext.getContextId() : "bytelink_sink";
        synchronized (ByteLinkSink.class) {
            if (b.containsKey(contextId)) {
                byteLinkSink = b.get(contextId);
            } else {
                byteLinkSink = new ByteLinkSink(castContext);
                b.put(contextId, byteLinkSink);
            }
        }
        return byteLinkSink;
    }

    public void destroy() {
        this.a.a();
    }

    public void dumpMediaData(int i, int i2) {
        this.a.a(i, i2);
    }

    public IMultipleActiveControl getMultipleActiveControl() {
        return this.a.b();
    }

    public IMultipleLoader getMultipleLoader() {
        return this.a.c();
    }

    public Object getOption(int i, Object... objArr) {
        return this.a.a(i, objArr);
    }

    public ServerInfo getServerInfo() {
        return this.a.d();
    }

    public RTCStatistics getStatistics() {
        return this.a.e();
    }

    public void init(Context context, String str) {
        this.a.a(context, str);
    }

    public void notifyPreempt(boolean z, ClientInfo clientInfo) {
        this.a.a(z, clientInfo);
    }

    public void requestIdrFromSource(String str) {
        this.a.b(str);
    }

    public boolean reverseConnect(String str, int i) {
        return this.a.a(str, i);
    }

    public boolean reverseDisconnect() {
        return this.a.i();
    }

    public boolean reverseInvite() {
        return this.a.j();
    }

    public void sendMetaData(String str, String str2) {
        this.a.a(str, str2);
    }

    public void setAVSyncType(int i) {
        this.a.a(i);
    }

    public void setApplication(Application application) {
        this.a.a(application);
    }

    public void setAudioDropPolicyByMs(int i, int i2) {
        this.a.b(i, i2);
    }

    public void setAudioMaxDelayByMs(int i) {
        this.a.b(i);
    }

    public void setLogLevel(int i) {
        this.a.c(i);
    }

    public void setMultipleReverseControl(IMultipleReverseControl iMultipleReverseControl) {
        this.a.a(iMultipleReverseControl);
    }

    public void setOnLogMonitor(IOnLogMonitor iOnLogMonitor) {
        this.a.a(iOnLogMonitor);
    }

    public void setOption(int i, Object... objArr) {
        this.a.b(i, objArr);
    }

    public void setPreemptListener(IPreemptListener iPreemptListener) {
        this.a.a(iPreemptListener);
    }

    public void setRenderMode(int i) {
        this.a.d(i);
    }

    public void setServerListener(IServerListener iServerListener) {
        this.a.a(iServerListener);
    }

    public void startServer(String str) {
        this.a.c(str);
    }

    public void stopServer() {
        this.a.l();
    }
}
