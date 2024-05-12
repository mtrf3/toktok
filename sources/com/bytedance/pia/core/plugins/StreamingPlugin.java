package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.BQ6;
import X.C37238EjS;
import X.C37441Emj;
import X.C37450Ems;
import X.C37499Enf;
import X.C37558Eoc;
import X.C37561Eof;
import X.C37607EpP;
import X.C37613EpV;
import X.InterfaceC37454Emw;
import X.InterfaceC37464En6;
import X.InterfaceC37580Eoy;
import X.JBR;
import X.RunnableC37609EpR;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.plugins.StreamingPlugin;
import com.bytedance.pia.core.setting.Settings;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class StreamingPlugin extends AbstractC37502Eni {
    public final Map<String, String> LIZIZ;
    public final CountDownLatch LIZJ;
    public volatile String LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;
    public final AtomicReference<WebMessagePort> LJI;
    public final C37607EpP<String> LJII;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "streaming";
    }

    @Override // X.AbstractC37502Eni
    public final void LIZIZ() {
        C37441Emj c37441Emj = new C37441Emj();
        C37499Enf c37499Enf = this.LIZ;
        c37441Emj.LIZJ = c37499Enf;
        c37441Emj.LJII = "streaming";
        c37441Emj.LIZ = c37499Enf.LJ.toString();
        C37499Enf c37499Enf2 = this.LIZ;
        c37441Emj.LIZIZ = c37499Enf2.LIZJ.streaming;
        c37441Emj.LJIIIIZZ = c37499Enf2.LJIIL;
        C37561Eof LIZ = c37441Emj.LIZ();
        if (LIZ == null) {
            return;
        }
        try {
            C37558Eoc c37558Eoc = new C37558Eoc(LIZ);
            c37558Eoc.LJ(new BQ6() { // from class: X.Emv
                @Override // X.BQ6
                public final void accept(Object obj) {
                    StreamingPlugin streamingPlugin = StreamingPlugin.this;
                    streamingPlugin.getClass();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[Streaming] js error: ");
                    LIZ2.append((String) obj);
                    C37238EjS.LIZIZ(X1D.LIZIZ(LIZ2));
                    synchronized (streamingPlugin) {
                        streamingPlugin.LJFF = true;
                    }
                }
            });
            c37558Eoc.LJIILIIL.LIZIZ(Module.NAME, Module.class, this);
            c37558Eoc.LJFF();
            this.LIZ.LIZ(c37558Eoc, "streaming-worker");
        } catch (Throwable th) {
            C37238EjS.LIZLLL(4, "[Streaming] create streaming worker error:", th);
        }
    }

    @Override // X.AbstractC37502Eni
    public final void LJI() {
        View LJI = this.LIZ.LJI();
        if (!(LJI instanceof WebView)) {
            return;
        }
        C37613EpV.LIZIZ(new RunnableC37609EpR(0, this, LJI));
    }

    @Override // X.AbstractC37502Eni, X.InterfaceC37489EnV
    public final void release() {
        this.LIZJ.countDown();
    }

    /* loaded from: classes7.dex */
    public static class Module extends JSModule {
        public static final String NAME = "StreamingModule";
        public String chunkCache;
        public final StreamingPlugin plugin;

        @InterfaceC37580Eoy
        public void finish() {
        }

        @InterfaceC37580Eoy
        public void appendBody(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int lastIndexOf = str.lastIndexOf("<!-- chunk end -->");
            if (lastIndexOf == -1) {
                StringBuilder LIZ = X1D.LIZ();
                this.chunkCache = JBR.LJFF(LIZ, this.chunkCache, str, LIZ);
                return;
            }
            StreamingPlugin streamingPlugin = this.plugin;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.chunkCache);
            LIZ2.append(str.substring(0, lastIndexOf));
            String LIZIZ = X1D.LIZIZ(LIZ2);
            synchronized (streamingPlugin) {
                if (!streamingPlugin.LJFF) {
                    if (streamingPlugin.LJ) {
                        streamingPlugin.LJII.LIZ(LIZIZ);
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(streamingPlugin.LIZLLL);
                        LIZ3.append(LIZIZ);
                        streamingPlugin.LIZLLL = X1D.LIZIZ(LIZ3);
                        streamingPlugin.LIZJ.countDown();
                    }
                }
            }
            this.chunkCache = str.substring(lastIndexOf + 18);
        }

        @InterfaceC37580Eoy
        public void appendHeaders(ReadableMap readableMap) {
            if (readableMap == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (readableMap.getType(nextKey) == ReadableType.String) {
                    hashMap.put(nextKey, readableMap.getString(nextKey));
                }
            }
            StreamingPlugin streamingPlugin = this.plugin;
            synchronized (streamingPlugin) {
                if (!streamingPlugin.LJFF) {
                    if (streamingPlugin.LJ) {
                        C37238EjS.LIZLLL(6, "[Streaming] Can't append headers after responded!", null);
                    } else {
                        ((HashMap) streamingPlugin.LIZIZ).putAll(hashMap);
                    }
                }
            }
        }

        public Module(Context context, Object obj) {
            super(context, obj);
            this.chunkCache = "";
            this.plugin = (StreamingPlugin) obj;
        }
    }

    public StreamingPlugin(C37499Enf c37499Enf) {
        super(c37499Enf);
        this.LIZIZ = new HashMap();
        this.LIZJ = new CountDownLatch(1);
        this.LIZLLL = "";
        this.LJ = false;
        this.LJFF = false;
        this.LJI = new AtomicReference<>(null);
        this.LJII = new C37607EpP<>();
    }

    @Override // X.AbstractC37502Eni
    public final InterfaceC37464En6 LIZLLL(InterfaceC37454Emw interfaceC37454Emw) {
        boolean z;
        if (!interfaceC37454Emw.isForMainFrame()) {
            return null;
        }
        synchronized (this) {
            if (this.LJFF) {
                return null;
            }
            if (TextUtils.isEmpty(this.LIZLLL)) {
                try {
                    z = !this.LIZJ.await(Settings.LIZ().streamingInterceptTimeout, TimeUnit.SECONDS);
                } catch (Throwable th) {
                    C37238EjS.LIZLLL(4, "[Streaming] intercept html failed, error:", th);
                    synchronized (this) {
                        this.LJFF = true;
                        return null;
                    }
                }
            } else {
                z = false;
            }
            if (TextUtils.isEmpty(this.LIZLLL) || z) {
                synchronized (this) {
                    this.LJFF = true;
                }
                return null;
            }
            synchronized (this) {
                this.LJ = true;
            }
            return new C37450Ems(this.LIZIZ, this.LIZLLL);
        }
    }
}
