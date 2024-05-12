package com.bytedance.speech.speechengine;

import X.C16880lQ;

/* loaded from: classes17.dex */
public class SpeechEngineLoader {
    public PluginAdapter adapter;
    public boolean isLoaded;
    public static final String[] COMMON_LIB_ARRAY = {"audio_fingerprint_sdk"};
    public static final String[] SDK_LIB_ARRAY = {"speechsdk", "speechengine"};
    public static final String[] PLUGIN_LIB_ARRAY = {"speechspg", "speechepg"};

    /* loaded from: classes17.dex */
    public interface PluginAdapter {
        boolean loadFromHost(String str);

        boolean loadFromPlugin(String str);
    }

    /* loaded from: classes17.dex */
    public static class c {
        public static final SpeechEngineLoader LIZ = new SpeechEngineLoader();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r2 = com.bytedance.speech.speechengine.SpeechEngineLoader.SDK_LIB_ARRAY;
        r1 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r7 >= r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        r3 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r8.adapter.loadFromHost(r3) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("SpeechEngine load host library: ");
        r1.append(r3);
        r1.append(" failed!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        throw new java.lang.UnsatisfiedLinkError(X.X1D.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void load() {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.isLoaded     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L82
            java.lang.String[] r4 = com.bytedance.speech.speechengine.SpeechEngineLoader.COMMON_LIB_ARRAY     // Catch: java.lang.Throwable -> L84
            int r2 = r4.length     // Catch: java.lang.Throwable -> L84
            r7 = 0
            r1 = 0
        La:
            if (r1 >= r2) goto L34
            r3 = r4[r1]     // Catch: java.lang.Throwable -> L84
            com.bytedance.speech.speechengine.SpeechEngineLoader$PluginAdapter r0 = r8.adapter     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.loadFromHost(r3)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L19
            int r1 = r1 + 1
            goto La
        L19:
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "SpeechEngine load host library: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            r1.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = " failed!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L34:
            java.lang.String[] r6 = com.bytedance.speech.speechengine.SpeechEngineLoader.PLUGIN_LIB_ARRAY     // Catch: java.lang.Throwable -> L84
            int r0 = r6.length     // Catch: java.lang.Throwable -> L84
            r5 = 1
            if (r0 > 0) goto L3c
            r4 = 0
            goto L3d
        L3c:
            r4 = 1
        L3d:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L84
            r2 = 0
        L3f:
            if (r2 >= r3) goto L42
            goto L45
        L42:
            if (r4 != 0) goto L80
            goto L4f
        L45:
            r1 = r6[r2]     // Catch: java.lang.Throwable -> L84
            com.bytedance.speech.speechengine.SpeechEngineLoader$PluginAdapter r0 = r8.adapter     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.loadFromPlugin(r1)     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L53
        L4f:
            java.lang.String[] r2 = com.bytedance.speech.speechengine.SpeechEngineLoader.SDK_LIB_ARRAY     // Catch: java.lang.Throwable -> L84
            int r1 = r2.length     // Catch: java.lang.Throwable -> L84
            goto L56
        L53:
            int r2 = r2 + 1
            goto L3f
        L56:
            if (r7 >= r1) goto L80
            r3 = r2[r7]     // Catch: java.lang.Throwable -> L84
            com.bytedance.speech.speechengine.SpeechEngineLoader$PluginAdapter r0 = r8.adapter     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.loadFromHost(r3)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L65
            int r7 = r7 + 1
            goto L56
        L65:
            java.lang.UnsatisfiedLinkError r2 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "SpeechEngine load host library: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            r1.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = " failed!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L84
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L80:
            r8.isLoaded = r5     // Catch: java.lang.Throwable -> L84
        L82:
            monitor-exit(r8)
            return
        L84:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.speech.speechengine.SpeechEngineLoader.load():void");
    }

    public SpeechEngineLoader() {
        this.adapter = new b();
        this.isLoaded = false;
    }

    public static SpeechEngineLoader getInstance() {
        return c.LIZ;
    }

    /* loaded from: classes17.dex */
    public static class b implements PluginAdapter {
        @Override // com.bytedance.speech.speechengine.SpeechEngineLoader.PluginAdapter
        public final boolean loadFromHost(String str) {
            try {
                C16880lQ.LLJJJIL(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.bytedance.speech.speechengine.SpeechEngineLoader.PluginAdapter
        public final boolean loadFromPlugin(String str) {
            try {
                C16880lQ.LLJJJIL(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public synchronized void setAdapter(PluginAdapter pluginAdapter) {
        if (pluginAdapter != null) {
            this.adapter = pluginAdapter;
        } else {
            throw new NullPointerException("SpeechEngineLoader cant be null");
        }
    }
}
