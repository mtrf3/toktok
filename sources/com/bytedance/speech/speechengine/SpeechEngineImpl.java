package com.bytedance.speech.speechengine;

import X.C16880lQ;
import X.C39204Fa4;
import X.FJB;
import X.J9R;
import X.PDP;
import X.Q0C;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.os.Build;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.speech.speechengine.SpeechEngine;

/* loaded from: classes12.dex */
public class SpeechEngineImpl implements SpeechEngine {
    public static PDP j;
    public SpeechEngine.SpeechListener a = null;
    public String b = "";
    public String c = "Recorder";
    public int d = 1;
    public boolean e = true;
    public long f = -1;
    public Context g = null;
    public boolean h = false;
    public int i = 1024;

    private synchronized boolean a() {
        if (!this.e) {
            return true;
        }
        Context context = this.g;
        if (context != null) {
            if (context.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                return false;
            }
            if (((AudioManager) C16880lQ.LLILL(this.g, "audio")).getMode() != 0) {
                return false;
            }
        }
        return true;
    }

    private synchronized int b() {
        int i;
        int i2 = this.d;
        i = 5;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            i = 9;
                        }
                    }
                    i = 1;
                } else {
                    i = 7;
                }
            } else {
                i = 6;
            }
        }
        return i;
    }

    private native synchronized long createEngineToNative();

    private native synchronized void destroyEngineToNative(long j2);

    private native synchronized int feedAudioToNative(long j2, byte[] bArr, int i);

    private native synchronized int fetchResultToNative(long j2, int i, byte[] bArr);

    public static native synchronized String getVersionToNative();

    private native synchronized int initEngineToNative(long j2, AssetManager assetManager);

    public static native synchronized boolean isEngineSupportedToNative(String str);

    private native synchronized int processAudioToNative(long j2, byte[] bArr, int i, boolean z);

    private native synchronized int resetEngineToNative(long j2);

    private native synchronized int sendDirectiveToNative(long j2, int i, String str);

    private native synchronized void setOptionBooleanToNative(long j2, String str, boolean z);

    private native synchronized void setOptionIntToNative(long j2, String str, int i);

    private native synchronized void setOptionStringToNative(long j2, String str, String str2);

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized long createEngine() {
        long createEngineToNative;
        destroyEngine(this.f);
        createEngineToNative = createEngineToNative();
        this.f = createEngineToNative;
        return createEngineToNative;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void destroyEngine() {
        long j2 = this.f;
        if (j2 == -1) {
            return;
        }
        destroyEngineToNative(j2);
        this.f = -1L;
        PDP pdp = j;
        if (pdp != null) {
            pdp.LIZ(-1, 0, this.b, "");
        }
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int initEngine() {
        AssetManager assetManager;
        if (this.f == -1) {
            return -1;
        }
        if (this.h) {
            assetManager = this.g.getResources().getAssets();
        } else {
            assetManager = null;
        }
        if (this.i == 8192) {
            setOptionInt("tts_with_frontend", 1);
            setOptionString("tts_frontend_type", "unitTson");
        }
        int initEngineToNative = initEngineToNative(this.f, assetManager);
        if (initEngineToNative == 0) {
            setOptionString("device_info", J9R.LIZ);
        }
        PDP pdp = j;
        if (pdp != null) {
            pdp.LIZ(0, initEngineToNative, this.b, "");
        }
        return initEngineToNative;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int resetEngine() {
        long j2 = this.f;
        if (j2 == -1) {
            return -1;
        }
        return resetEngineToNative(j2);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setRemoteView(SurfaceView surfaceView) {
    }

    public static synchronized PDP c() {
        PDP pdp;
        synchronized (SpeechEngineImpl.class) {
            pdp = j;
        }
        return pdp;
    }

    static {
        SpeechEngineLoader.getInstance().load();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public String getVersion() {
        return getVersionToNative();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (r4 != 1000) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r1.equals("capt") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r1.equals("asr") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("au") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r1.equals("recorder") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r1.equals("voiceconv") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r1.equals("dialog") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1.equals("fulllink") == false) goto L7;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0015. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(int r4) {
        /*
            r3 = this;
            java.lang.String r1 = r3.c
            java.lang.String r0 = "Recorder"
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 != 0) goto Lc
            return r2
        Lc:
            java.lang.String r1 = r3.b
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1511396501: goto L59;
                case -1332085432: goto L50;
                case -1018583194: goto L46;
                case -799233858: goto L3d;
                case 3124: goto L34;
                case 96896: goto L2b;
                case 3046114: goto L22;
                case 1331753737: goto L19;
                default: goto L18;
            }
        L18:
            return r2
        L19:
            java.lang.String r0 = "fulllink"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L63
            goto L18
        L22:
            java.lang.String r0 = "capt"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L63
            goto L18
        L2b:
            java.lang.String r0 = "asr"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L63
            goto L18
        L34:
            java.lang.String r0 = "au"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L63
            goto L18
        L3d:
            java.lang.String r0 = "recorder"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L63
            goto L18
        L46:
            java.lang.String r0 = "voiceconv"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L63
            goto L18
        L50:
            java.lang.String r0 = "dialog"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L63
            goto L18
        L59:
            java.lang.String r0 = "voiceclone"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L69
            goto L18
        L63:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r4 != r0) goto L68
            r2 = 1
        L68:
            return r2
        L69:
            r0 = 2011(0x7db, float:2.818E-42)
            if (r4 == r0) goto L71
            r0 = 2012(0x7dc, float:2.82E-42)
            if (r4 != r0) goto L72
        L71:
            r2 = 1
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.speech.speechengine.SpeechEngineImpl.a(int):boolean");
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void destroyEngine(long j2) {
        destroyEngine();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public String getVersion(long j2) {
        return getVersion();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int initEngine(long j2) {
        return initEngine();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized boolean isEngineSupported(String str) {
        return isEngineSupportedToNative(str);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int resetEngine(long j2) {
        return resetEngine();
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setContext(Context context) {
        this.g = context;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setListener(SpeechEngine.SpeechListener speechListener) {
        this.a = speechListener;
    }

    public static synchronized void a(PDP pdp) {
        synchronized (SpeechEngineImpl.class) {
            j = pdp;
        }
    }

    public static boolean a(String str) {
        return isEngineSupportedToNative(str);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int feedAudio(byte[] bArr, int i) {
        if (this.f == -1) {
            return -1;
        }
        if (this.b.equals("afp")) {
            return processAudioToNative(this.f, bArr, i, true);
        }
        return feedAudioToNative(this.f, bArr, i);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int fetchResult(long j2, byte[] bArr) {
        if (this.b.equals("afp")) {
            return fetchResult(LinkMicRtcMixBitrateSetting.DEFAULT, bArr);
        }
        return -2000;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int sendDirective(int i, String str) {
        int sendDirectiveToNative;
        if (this.f == -1) {
            return -1;
        }
        if (a(i) && !a()) {
            sendDirectiveToNative = -700;
        } else {
            sendDirectiveToNative = sendDirectiveToNative(this.f, i, str);
        }
        PDP pdp = j;
        if (pdp != null) {
            pdp.LIZ(i, sendDirectiveToNative, this.b, str);
        }
        return sendDirectiveToNative;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setOptionBoolean(String str, boolean z) {
        if (this.f == -1) {
            return;
        }
        if (str == null) {
            return;
        }
        if (str.hashCode() == 1724100682 && str.equals("enable_check_record_permission")) {
            this.e = z;
        }
        setOptionBooleanToNative(this.f, str, z);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setOptionInt(String str, int i) {
        if (this.f == -1) {
            return;
        }
        if (str == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1782938240) {
            if (hashCode == 1524111045 && str.equals("tts_work_mode")) {
                this.i = i;
            }
        } else if (str.equals("recorder_preset")) {
            this.d = i;
        }
        setOptionIntToNative(this.f, str, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0044, code lost:
    
        if (r6.equals("tts_off_resource_path") != false) goto L28;
     */
    @Override // com.bytedance.speech.speechengine.SpeechEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void setOptionString(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r3 = r5.f     // Catch: java.lang.Throwable -> L60
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            if (r6 == 0) goto Lf
            if (r7 != 0) goto L11
        Lf:
            monitor-exit(r5)
            return
        L11:
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L60
            r0 = -1288521830(0xffffffffb332b79a, float:-4.161084E-8)
            if (r1 == r0) goto L3e
            r0 = -1269912457(0xffffffffb44eac77, float:-1.9247987E-7)
            if (r1 == r0) goto L35
            r0 = -1174706902(0xffffffffb9fb652a, float:-4.7949824E-4)
            if (r1 == r0) goto L4f
            r0 = 1700942440(0x65625268, float:6.6798435E22)
            if (r1 == r0) goto L2a
            goto L59
        L2a:
            java.lang.String r0 = "engine_name"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L59
            r5.b = r7     // Catch: java.lang.Throwable -> L60
            goto L59
        L35:
            java.lang.String r0 = "aed_resource_path"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L59
            goto L46
        L3e:
            java.lang.String r0 = "tts_off_resource_path"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L59
        L46:
            java.lang.String r0 = "android_asset://"
            boolean r0 = r7.startsWith(r0)     // Catch: java.lang.Throwable -> L60
            r5.h = r0     // Catch: java.lang.Throwable -> L60
            goto L59
        L4f:
            java.lang.String r0 = "recorder_data_source_type"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L59
            r5.c = r7     // Catch: java.lang.Throwable -> L60
        L59:
            long r0 = r5.f     // Catch: java.lang.Throwable -> L60
            r5.setOptionStringToNative(r0, r6, r7)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r5)
            return
        L60:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.speech.speechengine.SpeechEngineImpl.setOptionString(java.lang.String, java.lang.String):void");
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int fetchResult(int i, byte[] bArr) {
        long j2 = this.f;
        if (j2 == -1) {
            return -1;
        }
        return fetchResultToNative(j2, i, bArr);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int feedAudio(long j2, byte[] bArr, int i) {
        return feedAudio(bArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSpeechMessage(int r19, byte[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.speech.speechengine.SpeechEngineImpl.onSpeechMessage(int, byte[], int):void");
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public int processAudio(byte[] bArr, int i, boolean z) {
        long j2 = this.f;
        if (j2 == -1) {
            return -1;
        }
        return processAudioToNative(j2, bArr, i, z);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int sendDirective(int i, String str, Cert cert) {
        int i2;
        if (this.f == -1) {
            return -1;
        }
        if (a(i) && !a()) {
            i2 = -700;
        } else {
            String str2 = "sendDirective";
            try {
                if (a(i)) {
                    str2 = "sendDirectiveStartCapture";
                } else if (i == 2001 || i == 1001 || i == 1100) {
                    str2 = "sendDirectiveStopCapture";
                }
                FJB.LIZ.getClass();
                C39204Fa4.LIZ(cert, new String[]{"audio"}, "SpeechSDK", str2);
                if (str == null) {
                    str = "";
                }
                i2 = sendDirectiveToNative(this.f, i, str);
            } catch (Q0C e) {
                C16880lQ.LLLLIIL(e);
                i2 = -710;
            }
        }
        PDP pdp = j;
        if (pdp != null) {
            pdp.LIZ(i, i2, this.b, str);
        }
        return i2;
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setOptionBoolean(long j2, String str, boolean z) {
        setOptionBoolean(str, z);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setOptionInt(long j2, String str, int i) {
        setOptionInt(str, i);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized void setOptionString(long j2, String str, String str2) {
        setOptionString(str, str2);
    }

    @Override // com.bytedance.speech.speechengine.SpeechEngine
    public synchronized int sendDirective(long j2, int i, String str) {
        return sendDirective(i, str);
    }
}
