package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import ccb.t;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;
import com.bytedance.android.livesdk.livesetting.pullstream.DnsOptMethodSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeBytevc1EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHardwareDecodeH264EnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveHttpkDegradeEnabledSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurrySpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowSpeedSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveSlowTimeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkFastOpenDisableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkNtpEnableSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.PlayerEnableUploadTimeLineSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPrepareFixSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveSupportSetSurfaceTexture;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LivePreviewCardResourceOpt;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.texturerender.VideoSurface;
import defpackage.b1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VAE implements VBT, Handler.Callback {
    public t LJLIL;
    public VBU LJLILLLLZI;
    public InterfaceC79335VBr LJLJI;
    public VBG LJLJJI;
    public Handler LJLJJL;
    public HandlerThread LJLJL;
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    public final C79334VBq LJLJLJ = new C79334VBq(this);

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0096 A[Catch: JSONException -> 0x00d2, TryCatch #0 {JSONException -> 0x00d2, blocks: (B:100:0x0065, B:102:0x0069, B:104:0x0073, B:106:0x007e, B:108:0x0096, B:110:0x00a3, B:112:0x00ad, B:114:0x00b5, B:115:0x00c2, B:117:0x00c8), top: B:99:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0314 A[Catch: JSONException -> 0x041c, TryCatch #1 {JSONException -> 0x041c, blocks: (B:29:0x0175, B:33:0x0198, B:35:0x01a2, B:39:0x01fe, B:42:0x0213, B:45:0x0233, B:48:0x02e8, B:50:0x0314, B:51:0x0316, B:53:0x0350, B:57:0x037b, B:60:0x038b, B:62:0x03a5, B:64:0x03a9, B:66:0x03af, B:67:0x03b6, B:69:0x03c0, B:71:0x03c4, B:73:0x03ca, B:74:0x03d1, B:76:0x03f7, B:82:0x0387, B:83:0x0377, B:85:0x035d, B:86:0x0360), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03f7 A[Catch: JSONException -> 0x041c, TryCatch #1 {JSONException -> 0x041c, blocks: (B:29:0x0175, B:33:0x0198, B:35:0x01a2, B:39:0x01fe, B:42:0x0213, B:45:0x0233, B:48:0x02e8, B:50:0x0314, B:51:0x0316, B:53:0x0350, B:57:0x037b, B:60:0x038b, B:62:0x03a5, B:64:0x03a9, B:66:0x03af, B:67:0x03b6, B:69:0x03c0, B:71:0x03c4, B:73:0x03ca, B:74:0x03d1, B:76:0x03f7, B:82:0x0387, B:83:0x0377, B:85:0x035d, B:86:0x0360), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0387 A[Catch: JSONException -> 0x041c, TryCatch #1 {JSONException -> 0x041c, blocks: (B:29:0x0175, B:33:0x0198, B:35:0x01a2, B:39:0x01fe, B:42:0x0213, B:45:0x0233, B:48:0x02e8, B:50:0x0314, B:51:0x0316, B:53:0x0350, B:57:0x037b, B:60:0x038b, B:62:0x03a5, B:64:0x03a9, B:66:0x03af, B:67:0x03b6, B:69:0x03c0, B:71:0x03c4, B:73:0x03ca, B:74:0x03d1, B:76:0x03f7, B:82:0x0387, B:83:0x0377, B:85:0x035d, B:86:0x0360), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0377 A[Catch: JSONException -> 0x041c, TryCatch #1 {JSONException -> 0x041c, blocks: (B:29:0x0175, B:33:0x0198, B:35:0x01a2, B:39:0x01fe, B:42:0x0213, B:45:0x0233, B:48:0x02e8, B:50:0x0314, B:51:0x0316, B:53:0x0350, B:57:0x037b, B:60:0x038b, B:62:0x03a5, B:64:0x03a9, B:66:0x03af, B:67:0x03b6, B:69:0x03c0, B:71:0x03c4, B:73:0x03ca, B:74:0x03d1, B:76:0x03f7, B:82:0x0387, B:83:0x0377, B:85:0x035d, B:86:0x0360), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035d A[Catch: JSONException -> 0x041c, TryCatch #1 {JSONException -> 0x041c, blocks: (B:29:0x0175, B:33:0x0198, B:35:0x01a2, B:39:0x01fe, B:42:0x0213, B:45:0x0233, B:48:0x02e8, B:50:0x0314, B:51:0x0316, B:53:0x0350, B:57:0x037b, B:60:0x038b, B:62:0x03a5, B:64:0x03a9, B:66:0x03af, B:67:0x03b6, B:69:0x03c0, B:71:0x03c4, B:73:0x03ca, B:74:0x03d1, B:76:0x03f7, B:82:0x0387, B:83:0x0377, B:85:0x035d, B:86:0x0360), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0360 A[Catch: JSONException -> 0x041c, TryCatch #1 {JSONException -> 0x041c, blocks: (B:29:0x0175, B:33:0x0198, B:35:0x01a2, B:39:0x01fe, B:42:0x0213, B:45:0x0233, B:48:0x02e8, B:50:0x0314, B:51:0x0316, B:53:0x0350, B:57:0x037b, B:60:0x038b, B:62:0x03a5, B:64:0x03a9, B:66:0x03af, B:67:0x03b6, B:69:0x03c0, B:71:0x03c4, B:73:0x03ca, B:74:0x03d1, B:76:0x03f7, B:82:0x0387, B:83:0x0377, B:85:0x035d, B:86:0x0360), top: B:28:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZLLL() {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAE.LIZLLL():org.json.JSONObject");
    }

    public final boolean LJ() {
        t tVar = this.LJLIL;
        if (tVar != null && tVar.M() == EnumC48289IxJ.PLAYED) {
            return true;
        }
        return false;
    }

    public final void LJIIJ() {
        LJFF("stop: ");
        LJI(LIZJ(12, null));
    }

    public VAE(C79310VAs c79310VAs) {
        HandlerThread handlerThread;
        LivePlayThreadPrioritySettings livePlayThreadPrioritySettings = LivePlayThreadPrioritySettings.INSTANCE;
        VCI vci = VCI.ENABLE_UP_CTL;
        if (livePlayThreadPrioritySettings.isEnabled(vci)) {
            handlerThread = new HandlerThread("single-live-player-thread", livePlayThreadPrioritySettings.getThreadPriority(vci));
        } else {
            handlerThread = new HandlerThread("single-live-player-thread", 10);
        }
        this.LJLJL = handlerThread;
        handlerThread.start();
        this.LJLJJL = new Handler(this.LJLJL.getLooper(), this);
        LJI(LIZJ(18, c79310VAs));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4 A[Catch: Exception -> 0x0134, TryCatch #2 {Exception -> 0x0134, blocks: (B:15:0x0081, B:17:0x00a8, B:18:0x00bf, B:20:0x00c9, B:22:0x00d6, B:24:0x00e5, B:27:0x00ee, B:29:0x00f4, B:35:0x0104, B:37:0x010a, B:38:0x010c, B:44:0x012c), top: B:14:0x0081 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.ArrayList<java.lang.String> r16) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAE.LIZ(java.util.ArrayList):void");
    }

    public final boolean LIZIZ(String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchResolution: ");
        LIZ.append(str);
        LJFF(X1D.LIZIZ(LIZ));
        t tVar = this.LJLIL;
        tVar.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("playResolution:");
        LIZ2.append(str);
        X1D.LIZIZ(LIZ2);
        C46496IMq.LIZJ();
        tVar.q("playResolution");
        if (tVar.LLIILZL == EnumC48289IxJ.PAUSED && tVar.LLD != null) {
            C46496IMq.LIZJ();
            tVar.LLD.LJIILLIIL(false);
            if (tVar.y6.LIZ == 1) {
                tVar.LLD.LJJ(1, 1);
            }
        }
        if (tVar.LJLLJ.LIZLLL != 2 || tVar.LLIILII != EnumC47633Imj.PREPARED || str == null) {
            return false;
        }
        if (tVar.D3 == 1 && TextUtils.equals(tVar.LLZLLIL, "auto") && !TextUtils.equals(tVar.LLLILZLLLI, "auto") && !TextUtils.equals(str, "auto") && tVar.C3 && tVar.w8 == 0) {
            tVar.o(true);
        }
        if (TextUtils.equals(tVar.LLLILZLLLI, str)) {
            C0AX.LIZIZ("playResolution: same res=", str);
        } else {
            if (TextUtils.equals(str, "ao") && (!TextUtils.equals(tVar.LLZZJLIL, "flv") || tVar.i8 == 0)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("not support switch to audio, streamFormat: ");
                LIZ3.append(tVar.LLZZJLIL);
                LIZ3.append(", enableOnlyAudioInAoRes: ");
                UFE.LIZLLL(LIZ3, tVar.i8, LIZ3);
                return false;
            }
            tVar.LJLLI.LIZLLL();
            tVar.LLZLLLL = -1;
            tVar.LLLFFI = 0;
            VAD vad = tVar.LJLJJI;
            String str3 = tVar.LLLF;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("setting_");
            vad.LJJJJLI(0, str3, LiveGiftNewGifterBadgeSetting.DEFAULT, C025908h.LIZIZ(LIZ4, tVar.LLZLLIL, "_to_", str, LIZ4));
            VAD vad2 = tVar.LJLJJI;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("manual_abr_");
            vad2.a1 = C025908h.LIZIZ(LIZ5, tVar.LLZLLIL, "_to_", str, LIZ5);
            tVar.k1();
            if (tVar.D3 == 1 && !TextUtils.equals(str, "ao") && !TextUtils.equals(str, "auto") && tVar.LJLLJ.LJJ(str) && tVar.LLLI && tVar.LLLII.equals("abr_bb_4live")) {
                tVar.LLZLLIL = "auto";
                tVar.LJLLJ.LJJIFFI(str);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("keep auto, set default resolution: ");
                LIZ6.append(str);
                X1D.LIZIZ(LIZ6);
                C46496IMq.LIZJ();
                tVar.LJLJJI.I0 = str;
                if (tVar.w8 == 0) {
                    tVar.o(true);
                }
            } else {
                tVar.LLZLLIL = str;
                if (tVar.LLLI && tVar.LLLII.equals("abr_bb_4live") && TextUtils.equals(str, "auto")) {
                    tVar.o(false);
                }
            }
            if (TextUtils.equals(str, "auto")) {
                tVar.s7 = tVar.LJLLJ.LJI();
            } else {
                tVar.s7 = str;
            }
            tVar.LLLILZLLLI = str;
            long LIZLLL = tVar.LJLLJ.LIZLLL(tVar.s7, tVar.LLZZ);
            ((ArrayList) tVar.LJLJJI.t5).add(Long.valueOf(LIZLLL));
            VAN van = tVar.LJLLJ;
            if (van != null && TextUtils.equals("lls", van.LJIIZILJ(tVar.LLZLLIL, tVar.LLZZ)) && !tVar.w0()) {
                tVar.K0(6, "rtm playResolution change fails, codec is not supported, should use flv instead");
                tVar.j1(10);
                tVar.LLZZJLIL = "flv";
            }
            VAN van2 = tVar.LJLLJ;
            if (tVar.LLZLLIL.equals("auto")) {
                str2 = tVar.LJLLJ.LJI();
            } else {
                str2 = tVar.LLZLLIL;
            }
            String LJIIL = van2.LJIIL(str2, tVar.LLZZJLIL, tVar.LLZZ);
            if (tVar.LLLII.equals("rad") && str.equals("auto")) {
                tVar.LLZLLIL = tVar.LJLLJ.LJI();
            }
            if (TextUtils.isEmpty(LJIIL)) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("");
                LIZ7.append(str);
                LIZ7.append(" playUrl not exist");
                X1D.LIZIZ(LIZ7);
                C46496IMq.LJ();
                return false;
            }
            tVar.J1();
            tVar.LJLJJI.LJJJJ();
            tVar.K();
            tVar.E = true;
            if ("bytevc2".equals(tVar.LJLLJ.LJIJI(tVar.LLZLLIL, tVar.LLZZ)) && tVar.LJLLL != null) {
                C46496IMq.LJ();
                tVar.LJLLL.setSurface(null);
                VAD vad3 = tVar.LJLJJI;
                if (vad3 != null) {
                    vad3.LLIIZ = "bytevc2";
                }
            }
            tVar.h();
            if (tVar.LJLLL != null && tVar.LLILZ == 1 && TextUtils.equals(tVar.LJLLJ.LJFF("fhd", tVar.LLZZ), "hdr")) {
                C46496IMq.LIZJ();
                tVar.LJLLL.LJ(1091, 1);
            }
            tVar.LLZZZZ();
            if (tVar.K7 > 0) {
                tVar.u();
            }
            VAD vad4 = tVar.LJLJJI;
            vad4.LJLLJ = LJIIL;
            tVar.u1 = true;
            vad4.q2 = System.currentTimeMillis();
            if (TextUtils.equals(tVar.LJLLJ.LJFF("fhd", tVar.LLZZ), "hdr")) {
                if (tVar.z0(tVar.LLZLLIL) && tVar.A3 == 1 && tVar.LLFF == 1 && tVar.LLD != null) {
                    tVar.B();
                } else if (tVar.x0() && tVar.LLFF == 0 && tVar.LLD == null) {
                    tVar.C();
                }
            }
            if (!TextUtils.equals(tVar.LLZLLIL, "auto")) {
                tVar.LJLJJI.O0 = false;
            }
            tVar.O0(LJIIL);
        }
        return true;
    }

    public final void LJFF(String str) {
        StringBuilder LIZJ = b1.LIZJ(str, " <===> player hash:");
        LIZJ.append(hashCode());
        B4I.LIZJ("TTLivePlayer2", X1D.LIZIZ(LIZJ));
    }

    public final void LJI(Message message) {
        HandlerThread handlerThread = this.LJLJL;
        if (handlerThread != null && handlerThread.isAlive() && !this.LJLJL.isInterrupted()) {
            if (this.LJLJJL == null) {
                this.LJLJJL = new Handler(this.LJLJL.getLooper(), this);
            }
            this.LJLJJL.sendMessageDelayed(message, 0L);
        }
    }

    public final void LJII(SurfaceHolder surfaceHolder) {
        LJI(LIZJ(6, surfaceHolder));
    }

    public final void LJIIIIZZ(int i) {
        LJI(LIZJ(17, Integer.valueOf(i)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45, types: [android.view.Surface, X.Iwz, X.IxI, java.util.HashMap<java.lang.String, java.lang.Object>, android.view.SurfaceHolder, X.Usg, X.Izg, X.Usd, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r1v48 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String valueOf;
        VAJ vaj;
        int i;
        Object obj;
        ?? r1;
        t tVar;
        AudioManager audioManager;
        String valueOf2;
        String valueOf3;
        String str;
        switch (message.what) {
            case 1:
                VBM vbm = (VBM) message.obj;
                String str2 = vbm.LIZ;
                String str3 = vbm.LIZIZ;
                LJFF("setDataSource: with url");
                this.LJLIL.x1(str2);
                if (!C38354F3m.LJ(str3)) {
                    this.LJLIL.y1(43, str3);
                }
                return true;
            case 2:
                VBS vbs = (VBS) message.obj;
                String str4 = vbs.LIZ;
                java.util.Map<String, String> map = vbs.LIZIZ;
                if (str4.indexOf("://") <= 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("file://");
                    LIZ.append(str4);
                    this.LJLIL.r1(UriProtector.parse(X1D.LIZIZ(LIZ)).toString());
                } else {
                    android.net.Uri parse = UriProtector.parse(str4);
                    if (map != null) {
                        str = map.get("sdk_params");
                    } else {
                        str = "";
                    }
                    C2058586b[] c2058586bArr = {new C2058586b(parse.toString(), str)};
                    t tVar2 = this.LJLIL;
                    tVar2.getClass();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("setPlayUrls, sdkParam:");
                    LIZ2.append((String) c2058586bArr[0].LIZJ);
                    X1D.LIZIZ(LIZ2);
                    C46496IMq.LIZJ();
                    tVar2.q("setPlayURLS");
                    VAN van = tVar2.LJLLJ;
                    van.LIZ = c2058586bArr;
                    van.LJ = 0;
                    van.LIZLLL = 1;
                    ArrayList arrayList = new ArrayList();
                    C2058586b c2058586b = c2058586bArr[0];
                    String str5 = c2058586b.LIZ;
                    if (str5 != null) {
                        arrayList.add(str5);
                    }
                    CharSequence charSequence = c2058586b.LIZIZ;
                    if (charSequence != null) {
                        arrayList.add(charSequence);
                    }
                    String[] strArr = new String[arrayList.size()];
                    van.LIZJ = strArr;
                    arrayList.toArray(strArr);
                    tVar2.t1 = 0;
                    if (tVar2.LLLF != null && tVar2.LJLLJ.LJIIJJI().LIZ != tVar2.LLLF) {
                        tVar2.LLZZLLIL("setPlayURLs");
                    }
                }
                return true;
            case 3:
                LJFF("start: ");
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.LJLIL.q1(18, 0);
                    this.LJLIL.p1(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                    this.LJLIL.q1(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.LJLIL.p1(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                    this.LJLIL.q1(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(35, 1);
                    this.LJLIL.q1(33, 1);
                    this.LJLIL.q1(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(36, 1);
                }
                this.LJLIL.y1(72, C31880CfE.LIZ());
                this.LJLIL.q1(9, 2);
                this.LJLIL.T0();
                VBG vbg = this.LJLJJI;
                if (vbg != null) {
                    ((C79340VBw) vbg).LJJL();
                }
                return true;
            case 4:
                LJFF("prepareAsync: ");
                this.LJLIL.q1(2, 0);
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.LJLIL.q1(18, 0);
                    this.LJLIL.p1(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                    this.LJLIL.q1(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.LJLIL.p1(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                    this.LJLIL.q1(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(35, 1);
                    this.LJLIL.q1(33, 1);
                    this.LJLIL.q1(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(36, 1);
                }
                if (LiveSdkFastOpenDisableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(40, 0);
                }
                if (LiveSdkNtpEnableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(42, 1);
                }
                this.LJLIL.p1(((IHostAction) CN1.LIZ(IHostAction.class)).calcTargetLoudness(), 143);
                this.LJLIL.y1(72, C31880CfE.LIZ());
                this.LJLIL.q1(9, 2);
                this.LJLIL.T0();
                VBG vbg2 = this.LJLJJI;
                if (vbg2 != null) {
                    ((C79340VBw) vbg2).LJJL();
                }
                return true;
            case 5:
                Surface surface = (Surface) message.obj;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("setSurfaceDisplay: surface = ");
                if (surface == null) {
                    valueOf3 = "null";
                } else {
                    valueOf3 = String.valueOf(surface.hashCode());
                }
                LIZ3.append(valueOf3);
                LJFF(X1D.LIZIZ(LIZ3));
                this.LJLIL.z1(surface);
                return true;
            case 6:
                SurfaceHolder surfaceHolder = (SurfaceHolder) message.obj;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("setSurfaceDisplay: surface holder= ");
                if (surfaceHolder == null) {
                    valueOf2 = "null";
                } else {
                    valueOf2 = String.valueOf(surfaceHolder.hashCode());
                }
                LIZ4.append(valueOf2);
                LJFF(X1D.LIZIZ(LIZ4));
                this.LJLIL.A1(surfaceHolder);
                return true;
            case 7:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("setMute: ");
                LIZ5.append(booleanValue);
                LJFF(X1D.LIZIZ(LIZ5));
                t tVar3 = this.LJLIL;
                tVar3.getClass();
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("setMute: ");
                LIZ6.append(booleanValue);
                X1D.LIZIZ(LIZ6);
                C46496IMq.LIZJ();
                tVar3.Y6 = booleanValue;
                C79305VAn c79305VAn = tVar3.LJLLILLLL;
                InterfaceC47775Ip1 interfaceC47775Ip1 = c79305VAn.LIZIZ;
                if (interfaceC47775Ip1 != null) {
                    if (interfaceC47775Ip1.LJI()) {
                        float LIZ7 = c79305VAn.LIZ();
                        if (LIZ7 > 0.0f) {
                            c79305VAn.LIZJ = c79305VAn.LIZIZ() / LIZ7;
                        }
                        if (booleanValue) {
                            c79305VAn.LIZIZ.setVolume(0.0f, 0.0f);
                        } else {
                            InterfaceC47775Ip1 interfaceC47775Ip12 = c79305VAn.LIZIZ;
                            float f = c79305VAn.LIZJ;
                            interfaceC47775Ip12.setVolume(f, f);
                        }
                    } else {
                        c79305VAn.LIZIZ.LJIIJ(booleanValue);
                    }
                }
                tVar3.LJLJJI.h2 = booleanValue ? 1 : 0;
                return true;
            case 8:
                float floatValue = ((Float) message.obj).floatValue();
                LJFF("setVolume: ");
                t tVar4 = this.LJLIL;
                C79305VAn c79305VAn2 = tVar4.LJLLILLLL;
                if (c79305VAn2.LIZIZ != null && (audioManager = (AudioManager) C16880lQ.LLILL(c79305VAn2.LIZ, "audio")) != null) {
                    audioManager.setStreamVolume(3, (int) floatValue, 0);
                }
                tVar4.LJLJJI.getClass();
                return true;
            case 9:
                boolean booleanValue2 = ((Boolean) message.obj).booleanValue();
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("setSeiOpen: ");
                LIZ8.append(booleanValue2);
                LJFF(X1D.LIZIZ(LIZ8));
                if (!booleanValue2 && (tVar = this.LJLIL) != null) {
                    tVar.q1(41, 0);
                }
                return true;
            case 10:
                LIZIZ((String) message.obj);
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJFF("pause: ");
                t tVar5 = this.LJLIL;
                tVar5.getClass();
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("pause -- ");
                LIZ9.append(tVar5.u5);
                X1D.LIZIZ(LIZ9);
                C46496IMq.LIZJ();
                tVar5.q("pause");
                C48436Izg c48436Izg = tVar5.LJLLL;
                if (c48436Izg != null && c48436Izg.isPlaying()) {
                    VideoSurface videoSurface = tVar5.LLD;
                    if (videoSurface != null) {
                        videoSurface.LJIILLIIL(true);
                        if (tVar5.y6.LIZ == 1) {
                            tVar5.LLD.LJJ(1, 3);
                        }
                    }
                    tVar5.LLIILZL = EnumC48289IxJ.PAUSED;
                    if (tVar5.N7 == 1 && TextUtils.equals(tVar5.LLZZJLIL, "lls") && tVar5.F0()) {
                        tVar5.K0(5, "pause in rtm play");
                        tVar5.LLLLLL();
                    } else if (tVar5.I3 == 1) {
                        tVar5.LLLLLL();
                    } else {
                        tVar5.LJLLL.pause();
                    }
                }
                return true;
            case 12:
                LJFF("stop: ");
                this.LJLIL.LLLLLL();
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJFF("release: ");
                t tVar6 = this.LJLIL;
                tVar6.getClass();
                StringBuilder LIZ10 = X1D.LIZ();
                LIZ10.append("release start -- ");
                LIZ10.append(tVar6.u5);
                X1D.LIZIZ(LIZ10);
                C46496IMq.LIZJ();
                tVar6.t1();
                tVar6.u1(EnumC48169IvN.IDLE);
                InterfaceC48269Iwz interfaceC48269Iwz = tVar6.LJLJL;
                if (interfaceC48269Iwz != null) {
                    StringBuilder LIZ11 = X1D.LIZ();
                    LIZ11.append("release start -- ");
                    LIZ11.append(tVar6.u5);
                    ((VBU) interfaceC48269Iwz).LJ(X1D.LIZIZ(LIZ11));
                }
                tVar6.q("release");
                EnumC48289IxJ enumC48289IxJ = tVar6.LLIILZL;
                if (enumC48289IxJ == EnumC48289IxJ.PLAYED || enumC48289IxJ == EnumC48289IxJ.PAUSED || enumC48289IxJ == EnumC48289IxJ.PREPARING) {
                    tVar6.f("release", true);
                }
                if (tVar6.LLD != null && tVar6.I3 == 1) {
                    C46496IMq.LIZJ();
                    tVar6.LLD.LJJ(145, 1);
                }
                tVar6.g1();
                if (!VBO.LIZJ) {
                    tVar6.T4.shutdown();
                }
                tVar6.LJLJI.removeCallbacksAndMessages(null);
                C48436Izg c48436Izg2 = tVar6.LJLLL;
                if (c48436Izg2 != null) {
                    c48436Izg2.LJJI();
                    tVar6.LJLLL.release();
                    tVar6.LJLLL = null;
                    tVar6.LJLZ = null;
                    tVar6.LJZ = null;
                    tVar6.LJZI = null;
                    VAD vad = tVar6.LJLJJI;
                    vad.LLZZJLIL = null;
                    vad.LJJL(true);
                    C78575Usd c78575Usd = tVar6.O7;
                    if (c78575Usd != null) {
                        c78575Usd.LIZJ = null;
                        c78575Usd.LIZ = null;
                        c78575Usd.LIZIZ = null;
                        c78575Usd.LIZLLL = null;
                        tVar6.O7 = null;
                    }
                    tVar6.LLIILII = EnumC47633Imj.IDLE;
                    tVar6.LLIILZL = EnumC48289IxJ.IDLE;
                    C46496IMq.LIZJ();
                    tVar6.f107v5 = null;
                    VAJ vaj2 = tVar6.a6;
                    if (vaj2 != null) {
                        vaj2.LJIILJJIL();
                        tVar6.a6.LIZLLL(tVar6.u5);
                        VAJ vaj3 = tVar6.a6;
                        vaj3.getClass();
                        C46496IMq.LIZ();
                        synchronized (vaj3.LJJIFFI) {
                            VAR var = vaj3.LJJIII;
                            if (var != null) {
                                var.removeCallbacksAndMessages(null);
                                vaj3.LJJIII = null;
                            }
                            HandlerThread handlerThread = vaj3.LJJII;
                            if (handlerThread != null) {
                                handlerThread.quit();
                                vaj3.LJJII = null;
                            }
                        }
                        synchronized (vaj3.LJJIIJ) {
                            Handler handler = vaj3.LJJIIZ;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                                vaj3.LJJIIZ = null;
                            }
                            HandlerThread handlerThread2 = vaj3.LJJIIJZLJL;
                            if (handlerThread2 != null) {
                                handlerThread2.quit();
                                vaj3.LJJIIJZLJL = null;
                            }
                        }
                        tVar6.a6 = null;
                    }
                    tVar6.b6 = false;
                    tVar6.c6 = 0;
                    InterfaceC48269Iwz interfaceC48269Iwz2 = tVar6.LJLJL;
                    if (interfaceC48269Iwz2 != null) {
                        StringBuilder LIZ12 = X1D.LIZ();
                        LIZ12.append("release end -- ");
                        LIZ12.append(tVar6.u5);
                        ((VBU) interfaceC48269Iwz2).LJ(X1D.LIZIZ(LIZ12));
                    }
                    tVar6.u5 = -1;
                    tVar6.C7 = 0;
                    tVar6.D7 = 0;
                    tVar6.S6 = 0;
                    tVar6.LLLZLZ = "";
                    tVar6.C8 = EnumC62332cX.VeLivePlayerMirrorNone;
                }
                HandlerThread handlerThread3 = this.LJLJL;
                if (handlerThread3 != null) {
                    handlerThread3.quit();
                    this.LJLJL.interrupt();
                }
                return true;
            case 14:
                LJFF("releaseAsync: ");
                t tVar7 = this.LJLIL;
                tVar7.t1();
                tVar7.u1(EnumC48169IvN.IDLE);
                InterfaceC48269Iwz interfaceC48269Iwz3 = tVar7.LJLJL;
                if (interfaceC48269Iwz3 != null) {
                    StringBuilder LIZ13 = X1D.LIZ();
                    LIZ13.append("releaseAsync start -- ");
                    LIZ13.append(tVar7.u5);
                    ((VBU) interfaceC48269Iwz3).LJ(X1D.LIZIZ(LIZ13));
                }
                StringBuilder LIZ14 = X1D.LIZ();
                LIZ14.append("releaseAsync -- ");
                LIZ14.append(tVar7.u5);
                X1D.LIZIZ(LIZ14);
                C46496IMq.LIZJ();
                tVar7.q("releaseAsync");
                EnumC48289IxJ enumC48289IxJ2 = tVar7.LLIILZL;
                if (enumC48289IxJ2 == EnumC48289IxJ.PLAYED || enumC48289IxJ2 == EnumC48289IxJ.PAUSED || enumC48289IxJ2 == EnumC48289IxJ.PREPARING) {
                    tVar7.f("releaseAsync", false);
                }
                if (!VBO.LIZJ) {
                    tVar7.T4.shutdown();
                }
                tVar7.LJLJI.removeCallbacksAndMessages(null);
                C48436Izg c48436Izg3 = tVar7.LJLLL;
                if (c48436Izg3 != null) {
                    if ((tVar7.LLFF != 1 || tVar7.LLD == null) && tVar7.LJLZ != null) {
                        r1 = 0;
                        c48436Izg3.setDisplay(null);
                    } else {
                        r1 = 0;
                    }
                    tVar7.g1();
                    C48436Izg c48436Izg4 = tVar7.LJLLL;
                    tVar7.LJLLL = r1;
                    tVar7.LJLZ = r1;
                    tVar7.LJZ = r1;
                    tVar7.LJZI = r1;
                    VAD vad2 = tVar7.LJLJJI;
                    vad2.LLZZJLIL = r1;
                    vad2.LJJL(true);
                    C78575Usd c78575Usd2 = tVar7.O7;
                    if (c78575Usd2 != null) {
                        c78575Usd2.LIZJ = r1;
                        c78575Usd2.LIZ = r1;
                        c78575Usd2.LIZIZ = r1;
                        c78575Usd2.LIZLLL = r1;
                        tVar7.O7 = r1;
                    }
                    tVar7.LLIILII = EnumC47633Imj.IDLE;
                    tVar7.LLIILZL = EnumC48289IxJ.IDLE;
                    tVar7.S6 = 0;
                    tVar7.LLLZLZ = "";
                    if (VBO.LIZJ) {
                        RunnableC47632Imi runnableC47632Imi = new RunnableC47632Imi(c48436Izg4);
                        if (VBO.LIZJ) {
                            VBO.LIZ.submit(runnableC47632Imi);
                        }
                    } else {
                        C48056ItY.LIZ(new RunnableC47632Imi(c48436Izg4));
                    }
                    C46496IMq.LIZJ();
                    InterfaceC48269Iwz interfaceC48269Iwz4 = tVar7.LJLJL;
                    if (interfaceC48269Iwz4 != null) {
                        StringBuilder LIZ15 = X1D.LIZ();
                        LIZ15.append("releaseAsync end -- ");
                        LIZ15.append(tVar7.u5);
                        ((VBU) interfaceC48269Iwz4).LJ(X1D.LIZIZ(LIZ15));
                    }
                }
                HandlerThread handlerThread4 = this.LJLJL;
                if (handlerThread4 != null) {
                    handlerThread4.quit();
                    this.LJLJL.interrupt();
                }
                return true;
            case 15:
                this.LJLIL.LLLLILI();
                return true;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            default:
                return true;
            case 17:
                ((Integer) message.obj).intValue();
                return true;
            case 18:
                C79310VAs c79310VAs = (C79310VAs) message.obj;
                LJFF("init: ");
                c79310VAs.getClass();
                c79310VAs.LJ = new VBU(c79310VAs.LIZJ);
                Context LLLLL = C16880lQ.LLLLL(c79310VAs.LIZ);
                C79303VAl c79303VAl = new C79303VAl(LLLLL);
                c79303VAl.LJFF = 300000;
                c79303VAl.LIZJ = new R29();
                c79303VAl.LJ = false;
                if (c79310VAs.LIZIZ) {
                    i = 2;
                } else {
                    i = 1;
                }
                c79303VAl.LJI = i;
                c79303VAl.LIZIZ = c79310VAs.LJ;
                c79303VAl.LJIIIZ = c79310VAs.LJFF;
                c79303VAl.LIZLLL = new TMC();
                if (!LivePreviewCardResourceOpt.INSTANCE.isOpt()) {
                    C38027EwB c38027EwB = new C38027EwB(FSY.SERIAL);
                    c38027EwB.LIZIZ = "player-work-threads";
                    ExecutorService LIZ16 = C37191Eih.LIZ(c38027EwB);
                    StringBuilder LIZ17 = X1D.LIZ();
                    LIZ17.append("setCustomThreadPool: ");
                    LIZ17.append(LIZ16);
                    X1D.LIZIZ(LIZ17);
                    C46496IMq.LIZJ();
                    c79303VAl.LJIIIIZZ = LIZ16;
                }
                if (LLLLL != null) {
                    if (c79303VAl.LIZIZ != null) {
                        if (c79303VAl.LIZJ != null) {
                            c79310VAs.LIZLLL = new t(c79303VAl);
                            if (PlayerEnableUploadTimeLineSetting.INSTANCE.getValue()) {
                                t tVar8 = c79310VAs.LIZLLL;
                                tVar8.f101Y = true;
                                tVar8.LJLJJI.R = true;
                            }
                            if (DnsOptMethodSetting.INSTANCE.getValue() == 1) {
                                t tVar9 = c79310VAs.LIZLLL;
                                C28645BMb.LIZ().getClass();
                                VDR LIZJ = ((InterfaceC30713C3p) VCT.LIZIZ(InterfaceC30713C3p.class)).LIZJ();
                                tVar9.getClass();
                                StringBuilder LIZ18 = X1D.LIZ();
                                LIZ18.append("setDns:");
                                LIZ18.append(LIZJ);
                                X1D.LIZIZ(LIZ18);
                                C46496IMq.LIZJ();
                                tVar9.R = LIZJ;
                                tVar9.LJLJJI.LLIIIL = tVar9.f100X;
                            }
                            if (LiveHttpkDegradeEnabledSetting.INSTANCE.getValue()) {
                                c79310VAs.LIZLLL.q1(39, 1);
                            }
                            t obj2 = c79310VAs.LIZLLL;
                            o.LJIIIZ(obj2, "obj");
                            if (LivePlayThreadPrioritySettings.INSTANCE.isEnabled(VCI.ENABLE_DOWN_VLM_EXE)) {
                                Field[] fields = t.class.getDeclaredFields();
                                o.LJIIIIZZ(fields, "fields");
                                int length = fields.length;
                                for (int i2 = 0; i2 < length; i2++) {
                                    Field field = fields[i2];
                                    boolean isAccessible = field.isAccessible();
                                    if (!isAccessible) {
                                        field.setAccessible(true);
                                    }
                                    try {
                                        try {
                                            obj = field.get(obj2);
                                        } catch (IllegalAccessException e) {
                                            C16880lQ.LLLLIIL(e);
                                            if (!isAccessible) {
                                            }
                                        }
                                        if (obj != null && ExecutorService.class.isAssignableFrom(obj.getClass())) {
                                            ExecutorService executorService = (ExecutorService) obj;
                                            if (executorService instanceof ThreadPoolExecutor) {
                                                ThreadFactory factory = ((ThreadPoolExecutor) executorService).getThreadFactory();
                                                if (!(factory instanceof VCC)) {
                                                    o.LJIIIIZZ(factory, "factory");
                                                    ((ThreadPoolExecutor) executorService).setThreadFactory(new VCC(factory));
                                                }
                                            }
                                            if (!isAccessible) {
                                                field.setAccessible(false);
                                            }
                                        }
                                    } finally {
                                        if (!isAccessible) {
                                            field.setAccessible(false);
                                        }
                                    }
                                }
                            }
                            t tVar10 = c79310VAs.LIZLLL;
                            this.LJLIL = tVar10;
                            VBU vbu = c79310VAs.LJ;
                            this.LJLILLLLZI = vbu;
                            vbu.LIZ = this.LJLJLJ;
                            VBG vbg3 = this.LJLJJI;
                            if (vbg3 != null) {
                                vbu.LIZIZ = vbg3;
                            }
                            tVar10.q1(44, 0);
                            return true;
                        }
                        throw new IllegalArgumentException("mNetworkClient should not be null");
                    }
                    throw new IllegalArgumentException("mListener should not be null");
                }
                throw new IllegalArgumentException("mContext should not be null");
            case 19:
                boolean booleanValue3 = ((Boolean) message.obj).booleanValue();
                StringBuilder LIZ19 = X1D.LIZ();
                LIZ19.append("setPreviewFlag: ");
                LIZ19.append(booleanValue3);
                LJFF(X1D.LIZIZ(LIZ19));
                t tVar11 = this.LJLIL;
                VAD vad3 = tVar11.LJLJJI;
                if (vad3 != null) {
                    if (vad3.LJLZ && !booleanValue3) {
                        vad3.B3 = System.currentTimeMillis();
                    }
                    tVar11.LJLJJI.LJLZ = booleanValue3;
                }
                StringBuilder LJI = JBR.LJI("setPreviewFlag: ", booleanValue3, ", mLogService: ");
                LJI.append(tVar11.LJLJJI);
                X1D.LIZIZ(LJI);
                C46496IMq.LIZJ();
                return true;
            case 20:
                String str6 = (String) message.obj;
                StringBuilder LIZ20 = X1D.LIZ();
                LIZ20.append("setProjectKey: ");
                LIZ20.append(str6);
                LJFF(X1D.LIZIZ(LIZ20));
                this.LJLIL.LJLJJI.LJLLI = str6;
                return true;
            case 21:
                C51093K3l c51093K3l = (C51093K3l) message.obj;
                t tVar12 = this.LJLIL;
                StringBuilder LIZ21 = X1D.LIZ();
                LIZ21.append(c51093K3l.LIZ);
                LIZ21.append("-");
                LIZ21.append(c51093K3l.LIZIZ);
                tVar12.y1(63, X1D.LIZIZ(LIZ21));
                this.LJLIL.y1(64, c51093K3l.LIZJ);
                StringBuilder LIZ22 = X1D.LIZ();
                LIZ22.append(c51093K3l.LIZ);
                LIZ22.append(", ");
                LIZ22.append(c51093K3l.LIZIZ);
                LIZ22.append(", ");
                LIZ22.append(c51093K3l.LIZJ);
                LJFF(X1D.LIZIZ(LIZ22));
                return true;
            case 22:
                String str7 = (String) message.obj;
                if (!C38354F3m.LJ(str7)) {
                    this.LJLIL.y1(86, str7);
                }
                return true;
            case 23:
                boolean booleanValue4 = ((Boolean) message.obj).booleanValue();
                this.LJLIL.q1(76, booleanValue4 ? 1 : 0);
                this.LJLIL.q1(88, booleanValue4 ? 1 : 0);
                return true;
            case 24:
                boolean booleanValue5 = ((Boolean) message.obj).booleanValue();
                t tVar13 = this.LJLIL;
                if (tVar13 != null) {
                    tVar13.q1(56, booleanValue5 ? 1 : 0);
                }
                return true;
            case 25:
                LIZ((ArrayList) message.obj);
                return true;
            case 26:
                VBM vbm2 = (VBM) message.obj;
                String str8 = vbm2.LIZ;
                String str9 = vbm2.LIZIZ;
                LJFF("prepare: ");
                if (!C38354F3m.LJ(str9)) {
                    this.LJLIL.y1(43, str9);
                }
                if (LivePreviewPrepareFixSetting.INSTANCE.getValue()) {
                    if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                        this.LJLIL.q1(18, 0);
                        this.LJLIL.p1(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                        this.LJLIL.q1(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                        this.LJLIL.p1(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                        this.LJLIL.q1(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                    }
                    if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                        this.LJLIL.q1(35, 1);
                        this.LJLIL.q1(33, 1);
                        this.LJLIL.q1(34, 0);
                    }
                    if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                        this.LJLIL.q1(36, 1);
                    }
                    this.LJLIL.y1(72, C31880CfE.LIZ());
                    this.LJLIL.q1(9, 2);
                }
                this.LJLIL.X0(str8);
                return true;
            case 27:
                int intValue = ((Integer) message.obj).intValue();
                t tVar14 = this.LJLIL;
                if (tVar14 != null) {
                    tVar14.o1(intValue);
                }
                return true;
            case 28:
                LJFF("cancel: ");
                t tVar15 = this.LJLIL;
                if (tVar15 != null && (vaj = tVar15.a6) != null) {
                    vaj.LIZIZ();
                }
                return true;
            case 29:
                SurfaceTexture surfaceTexture = (SurfaceTexture) message.obj;
                if (LiveSupportSetSurfaceTexture.INSTANCE.isEnable()) {
                    StringBuilder LIZ23 = X1D.LIZ();
                    LIZ23.append("_setSurfaceTexture: surfaceTexture = ");
                    if (surfaceTexture == null) {
                        valueOf = "null";
                    } else {
                        valueOf = String.valueOf(surfaceTexture.hashCode());
                    }
                    LIZ23.append(valueOf);
                    LJFF(X1D.LIZIZ(LIZ23));
                    t tVar16 = this.LJLIL;
                    tVar16.q("setSurfaceTexture");
                    StringBuilder LIZ24 = X1D.LIZ();
                    LIZ24.append("setSurfaceTexture: ");
                    LIZ24.append(surfaceTexture);
                    X1D.LIZIZ(LIZ24);
                    C46496IMq.LIZJ();
                    InterfaceC48269Iwz interfaceC48269Iwz5 = tVar16.LJLJL;
                    if (interfaceC48269Iwz5 != null) {
                        StringBuilder LIZ25 = X1D.LIZ();
                        LIZ25.append("setSurfaceTexture: ");
                        LIZ25.append(surfaceTexture);
                        ((VBU) interfaceC48269Iwz5).LJ(X1D.LIZIZ(LIZ25));
                    }
                    if (surfaceTexture != null) {
                        tVar16.z1(new Surface(surfaceTexture));
                    } else {
                        tVar16.z1(null);
                        C48436Izg c48436Izg5 = tVar16.LJLLL;
                        if (c48436Izg5 != null) {
                            c48436Izg5.setSurface(null);
                        }
                    }
                }
                return true;
            case 30:
                VBM vbm3 = (VBM) message.obj;
                String str10 = vbm3.LIZ;
                String str11 = vbm3.LIZIZ;
                LJFF("prepare: ");
                if (!C38354F3m.LJ(str11)) {
                    this.LJLIL.y1(43, str11);
                }
                if (LiveNetAdaptiveEnableSetting.INSTANCE.getValue()) {
                    this.LJLIL.q1(18, 0);
                    this.LJLIL.p1(LiveNetAdaptiveHurrySpeedSetting.INSTANCE.getValue(), 19);
                    this.LJLIL.q1(17, LiveNetAdaptiveHurryTimeSetting.INSTANCE.getValue());
                    this.LJLIL.p1(LiveNetAdaptiveSlowSpeedSetting.INSTANCE.getValue(), 20);
                    this.LJLIL.q1(21, LiveNetAdaptiveSlowTimeSetting.INSTANCE.getValue());
                }
                if (LiveHardwareDecodeH264EnableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(35, 1);
                    this.LJLIL.q1(33, 1);
                    this.LJLIL.q1(34, 0);
                }
                if (LiveHardwareDecodeBytevc1EnableSetting.INSTANCE.getValue() == 1) {
                    this.LJLIL.q1(36, 1);
                }
                this.LJLIL.y1(72, C31880CfE.LIZ());
                this.LJLIL.q1(9, 2);
                this.LJLIL.X0(str10);
                return true;
        }
    }

    public static Message LIZJ(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    public final void LJIIIZ(InterfaceC79335VBr interfaceC79335VBr, VBG vbg) {
        this.LJLJI = interfaceC79335VBr;
        VBU vbu = this.LJLILLLLZI;
        if (vbu != null) {
            vbu.LIZIZ = vbg;
        }
        this.LJLJJI = vbg;
    }
}
