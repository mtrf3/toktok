package com.ss.android.ugc.aweme.audiomode.vopclone.service;

import X.C03880Dg;
import X.C16880lQ;
import X.C221108m2;
import X.C2VP;
import X.C35755E1n;
import X.C39519Ff9;
import X.C39579Fg7;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C66573QAv;
import X.C83073Wiz;
import X.C86853Y6v;
import X.C86856Y6y;
import X.C86857Y6z;
import X.E8I;
import X.ORY;
import X.X1D;
import X.XKQ;
import X.Y74;
import X.Y75;
import X.Y76;
import X.Y77;
import X.Y78;
import X.Y79;
import X.Y7A;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.SmartRouter;
import com.mammon.audiosdk.SAMICoreVopEngine;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.enums.SAMICoreVopLanguage;
import com.mammon.audiosdk.enums.SAMICoreVopProcessRecordAudioResult;
import com.mammon.audiosdk.enums.SAMICoreVopRecordingType;
import com.mammon.audiosdk.enums.SAMICoreVopSpeakerInfoCommand;
import com.mammon.audiosdk.enums.SAMICoreVopState;
import com.mammon.audiosdk.enums.SAMICoreVopTextType;
import com.mammon.audiosdk.structures.SAMICoreVopInitContext;
import com.mammon.audiosdk.structures.SAMICoreVopRecordingStatus;
import com.mammon.audiosdk.structures.SAMICoreVopSpeakerInfo;
import com.mammon.audiosdk.structures.SAMICoreVopTextInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.gamora.recorder.vopclone.VopCameraClientService;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import kotlin.jvm.internal.AqS28S0010000_15;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class VopCloneServiceImpl implements IVopCloneService {
    public static final /* synthetic */ int LJIIIZ = 0;
    public Y7A LIZLLL;
    public XKQ LJII;
    public boolean LJIIIIZZ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(Y78.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(Y79.LJLIL);
    public final TokenCert LIZJ = TokenCert.Companion.with("bpea-vop_record_voice");
    public final Vector<byte[]> LJ = new Vector<>();
    public final C66573QAv LJFF = new C66573QAv(this);
    public final C83073Wiz LJI = new C83073Wiz();

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v destroyEngine() {
        try {
            LJIILL().destroyEngine();
            try {
                Context context = Y75.LIZ;
                if (context != null) {
                    C16880lQ.LJJLIIIJL(context, Y75.LIZIZ);
                }
            } catch (Exception unused) {
            }
            Y75.LJI.clear();
            Y75.LIZIZ = null;
            Y75.LIZ = null;
            Y75.LIZLLL = false;
            Y75.LJ = false;
            Y75.LIZJ = false;
            Y75.LJFF = false;
            C86853Y6v c86853Y6v = new C86853Y6v(0);
            c86853Y6v.LJI = 0;
            return c86853Y6v;
        } catch (Throwable unused2) {
            C86853Y6v c86853Y6v2 = new C86853Y6v(0);
            c86853Y6v2.LJI = -6;
            return c86853Y6v2;
        }
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v getCurrentState() {
        SAMICoreVopState[] sAMICoreVopStateArr = new SAMICoreVopState[1];
        int currentState = LJIILL().getCurrentState(sAMICoreVopStateArr);
        SAMICoreVopState sAMICoreVopState = (SAMICoreVopState) ORY.LJJJ(sAMICoreVopStateArr);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(currentState);
        if (sAMICoreVopState == null) {
            sAMICoreVopState = SAMICoreVopState.Error;
        }
        c86853Y6v.LIZ = Integer.valueOf(sAMICoreVopState.getValue());
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LIZ() {
        Y7A y7a;
        XKQ xkq = this.LJII;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        C83073Wiz listener = this.LJI;
        o.LJIIIZ(listener, "listener");
        Y75.LJI.remove(listener);
        if (!this.LJIIIIZZ && (y7a = this.LIZLLL) != null && !y7a.LIZ) {
            C86853Y6v c86853Y6v = new C86853Y6v(0);
            c86853Y6v.LJI = 0;
            return c86853Y6v;
        }
        Y7A y7a2 = this.LIZLLL;
        if (y7a2 != null) {
            TokenCert tokenCert = this.LIZJ;
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZIZ();
            y7a2.LIZ = false;
            y7a2.LIZIZ.stop(tokenCert);
        }
        Y7A y7a3 = this.LIZLLL;
        if (y7a3 != null) {
            y7a3.LIZIZ.release(this.LIZJ);
        }
        Y7A y7a4 = this.LIZLLL;
        if (y7a4 != null) {
            y7a4.LIZIZ.removeCaptureListener(this.LJFF);
        }
        C86853Y6v c86853Y6v2 = new C86853Y6v(0);
        c86853Y6v2.LJI = 0;
        return c86853Y6v2;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LIZIZ() {
        int i;
        int i2;
        Y7A y7a;
        if (Y75.LJFF && Y75.LJ) {
            C86853Y6v c86853Y6v = new C86853Y6v(0);
            c86853Y6v.LJI = 0;
            c86853Y6v.LJII = true;
            return c86853Y6v;
        }
        C83073Wiz listener = this.LJI;
        o.LJIIIZ(listener, "listener");
        Y75.LJ = Y75.LIZ();
        ArrayList<Y77> arrayList = Y75.LJI;
        if (!arrayList.contains(listener)) {
            if (Y75.LJ) {
                listener.LIZLLL();
            }
            arrayList.add(listener);
        }
        this.LJ.clear();
        if (this.LJIIIIZZ && (y7a = this.LIZLLL) != null && y7a.LIZ) {
            C86853Y6v c86853Y6v2 = new C86853Y6v(0);
            c86853Y6v2.LJI = -2;
            return c86853Y6v2;
        }
        Y7A y7a2 = new Y7A();
        VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder();
        Integer num = E8I.LIZ().sampleRate;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 44100;
        }
        builder.setSampleRate(i);
        Integer num2 = E8I.LIZ().channel;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 1;
        }
        builder.setChannel(i2);
        VEAudioCaptureSettings build = builder.build();
        o.LJIIIIZZ(build, "Builder()\n              …                 .build()");
        y7a2.LIZIZ.init(build);
        this.LIZLLL = y7a2;
        y7a2.LIZIZ.addCaptureListener(this.LJFF);
        Y7A y7a3 = this.LIZLLL;
        if (y7a3 != null) {
            TokenCert policyPlaceholder = this.LIZJ;
            o.LJIIIZ(policyPlaceholder, "policyPlaceholder");
            ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZ();
            y7a3.LIZ = true;
            VEAudioCapture vEAudioCapture = y7a3.LIZIZ;
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100850, "com/ss/android/vesdk/VEAudioCapture", "start", vEAudioCapture, new Object[]{policyPlaceholder}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "6239386560197732096"));
            if (LIZJ.LIZ) {
                ((Integer) LIZJ.LIZIZ).intValue();
            } else {
                vEAudioCapture.start(policyPlaceholder);
            }
        }
        C86853Y6v c86853Y6v3 = new C86853Y6v(0);
        c86853Y6v3.LJI = 0;
        c86853Y6v3.LJII = false;
        return c86853Y6v3;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJFF() {
        SAMICoreVopSpeakerInfo sAMICoreVopSpeakerInfo = new SAMICoreVopSpeakerInfo();
        int speakerInfo = LJIILL().getSpeakerInfo(sAMICoreVopSpeakerInfo);
        boolean z = false;
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(speakerInfo);
        C86856Y6y c86856Y6y = new C86856Y6y(0);
        c86856Y6y.LIZIZ = sAMICoreVopSpeakerInfo.speakerId;
        c86856Y6y.LIZJ = Long.valueOf(sAMICoreVopSpeakerInfo.finishedTime);
        if (sAMICoreVopSpeakerInfo.isPrivate == 1) {
            z = true;
        }
        c86856Y6y.LIZ = Boolean.valueOf(z);
        c86856Y6y.LIZLLL = sAMICoreVopSpeakerInfo.updateTime;
        c86853Y6v.LJ = c86856Y6y;
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJII() {
        Integer num;
        Iterator<byte[]> it = this.LJ.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().length;
        }
        byte[] bArr = new byte[i];
        Iterator<byte[]> it2 = this.LJ.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            byte[] next = it2.next();
            System.arraycopy(next, 0, bArr, i2, next.length);
            i2 += next.length;
        }
        this.LJ.clear();
        SAMICoreVopProcessRecordAudioResult[] sAMICoreVopProcessRecordAudioResultArr = new SAMICoreVopProcessRecordAudioResult[1];
        int processRecordAudio = LJIILL().processRecordAudio(bArr, i, sAMICoreVopProcessRecordAudioResultArr);
        SAMICoreVopProcessRecordAudioResult sAMICoreVopProcessRecordAudioResult = (SAMICoreVopProcessRecordAudioResult) ORY.LJJJ(sAMICoreVopProcessRecordAudioResultArr);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(processRecordAudio);
        if (sAMICoreVopProcessRecordAudioResult != null) {
            num = Integer.valueOf(sAMICoreVopProcessRecordAudioResult.getValue());
        } else {
            num = null;
        }
        c86853Y6v.LIZIZ = num;
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIIIZZ() {
        SAMICoreVopTextInfo sAMICoreVopTextInfo = new SAMICoreVopTextInfo();
        int nextTextInfo = LJIILL().getNextTextInfo(sAMICoreVopTextInfo);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(nextTextInfo);
        C35755E1n c35755E1n = new C35755E1n(0);
        c35755E1n.LIZ = sAMICoreVopTextInfo.textJson;
        c35755E1n.LIZIZ = Integer.valueOf(sAMICoreVopTextInfo.textState.getValue());
        c86853Y6v.LIZJ = c35755E1n;
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIJJI() {
        SAMICoreVopRecordingStatus sAMICoreVopRecordingStatus = new SAMICoreVopRecordingStatus();
        int recordingStatus = LJIILL().getRecordingStatus(sAMICoreVopRecordingStatus);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(recordingStatus);
        C86857Y6z c86857Y6z = new C86857Y6z(0);
        c86857Y6z.LIZ = Integer.valueOf(sAMICoreVopRecordingStatus.requiredTextNum);
        c86857Y6z.LIZIZ = Integer.valueOf(sAMICoreVopRecordingStatus.successTextNum);
        c86857Y6z.LIZJ = Integer.valueOf(sAMICoreVopRecordingStatus.usedTextNum);
        c86853Y6v.LIZLLL = c86857Y6z;
        return c86853Y6v;
    }

    public final SAMICoreVopEngine LJIILL() {
        return (SAMICoreVopEngine) this.LIZ.getValue();
    }

    public final SAMICoreVopInitContext LJIILLIIL() {
        return (SAMICoreVopInitContext) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LIZLLL() {
        int manageSpeakerInfo = LJIILL().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.START_RECORD_TASK);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(manageSpeakerInfo);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJ() {
        int manageSpeakerInfo = LJIILL().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.SIGN_AGREEMENT);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(manageSpeakerInfo);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJI() {
        int manageSpeakerInfo = LJIILL().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.DELETE);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(manageSpeakerInfo);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIIZ() {
        double totalDurationMs = LJIILL().getTotalDurationMs();
        double currentPositionMs = LJIILL().getCurrentPositionMs();
        if (totalDurationMs == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            C86853Y6v c86853Y6v = new C86853Y6v(0);
            c86853Y6v.LJI = -5;
            return c86853Y6v;
        }
        C86853Y6v c86853Y6v2 = new C86853Y6v(0);
        c86853Y6v2.LJI = 0;
        c86853Y6v2.LJFF = Double.valueOf(currentPositionMs / totalDurationMs);
        return c86853Y6v2;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIJ() {
        int manageSpeakerInfo = LJIILL().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.START_BUILD_TASK);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(manageSpeakerInfo);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIIL() {
        int manageSpeakerInfo = LJIILL().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.SET_PUBLIC);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(manageSpeakerInfo);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v LJIILIIL() {
        int manageSpeakerInfo = LJIILL().manageSpeakerInfo(SAMICoreVopSpeakerInfoCommand.SET_PRIVATE);
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(manageSpeakerInfo);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final String LJIILJJIL() {
        String str = E8I.LIZ().modelKey;
        if (str == null) {
            return "audio_metrics";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v play() {
        int play = LJIILL().play();
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(play);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v preparePlayer() {
        int preparePlayer = LJIILL().preparePlayer();
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(preparePlayer);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v stop() {
        int stop = LJIILL().stop();
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(stop);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final C86853Y6v init(String str) {
        boolean z;
        Intent LJJLIIIJILLIZJL;
        boolean z2;
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        int i3;
        int i4;
        int i5;
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        o.LJIIIIZZ(validTopActivity, "getValidTopActivity()");
        int i6 = 1;
        if (Y75.LIZIZ == null) {
            Y75.LIZ = C16880lQ.LLLLL(validTopActivity);
            Y75.LIZIZ = new Y74();
            if (validTopActivity.getPackageManager().checkPermission("android.permission.BLUETOOTH", validTopActivity.getPackageName()) == 0) {
                z = true;
            } else {
                z = false;
            }
            Y75.LIZJ = z;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            Context context = Y75.LIZ;
            if (context != null && (LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(Y75.LIZIZ, context, intentFilter)) != null) {
                if (LJJLIIIJILLIZJL.getIntExtra("state", 0) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Y75.LIZLLL != z2) {
                    Y75.LIZLLL = z2;
                    C2VP.LIZIZ(new AqS28S0010000_15(z2, 1));
                }
                boolean LIZ = Y75.LIZ();
                if (Y75.LJ != LIZ) {
                    Y75.LJ = LIZ;
                    C2VP.LIZIZ(new AqS28S0010000_15(LIZ, 0));
                }
            }
        }
        String genVopSdkSavePath = VopCameraClientService.LIZ().genVopSdkSavePath();
        if (!C39579Fg7.LIZIZ(genVopSdkSavePath)) {
            C39579Fg7.LJ(genVopSdkSavePath, false);
        }
        VopCameraClientService.LIZ().initVESdk();
        Integer num = E8I.LIZ().language;
        if (num == null || num.intValue() != 0) {
            Integer num2 = E8I.LIZ().language;
            if (num2 == null || num2.intValue() != 1) {
                LJIILLIIL().language = SAMICoreVopLanguage.JAPANESE;
            } else {
                LJIILLIIL().language = SAMICoreVopLanguage.ENGLISH;
            }
        } else {
            LJIILLIIL().language = SAMICoreVopLanguage.JAPANESE;
        }
        SAMICoreVopInitContext LJIILLIIL = LJIILLIIL();
        String str2 = E8I.LIZ().vopServerUrl;
        if (str2 == null) {
            str2 = "https://sami-va.tiktokv.com/internal";
        }
        LJIILLIIL.vopServerUrl = str2;
        SAMICoreVopInitContext LJIILLIIL2 = LJIILLIIL();
        String str3 = E8I.LIZ().ttsServerUrl;
        if (str3 == null) {
            str3 = "https://sami-sg.tiktokv.com/internal";
        }
        LJIILLIIL2.ttsServerUrl = str3;
        LJIILLIIL().appKey = "BGJqbgQOfj";
        SAMICoreVopInitContext LJIILLIIL3 = LJIILLIIL();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("passport-auth", "session");
            jSONObject.put("x-tt-token", VopCameraClientService.LIZ().getUserTTToken());
            jSONObject.put("sdk-version", VopCameraClientService.LIZ().getSDKVersion());
            LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
            String str4 = "prod";
            if (localTestApi.enableBoe()) {
                String boeLane = localTestApi.getBoeLane();
                if (boeLane != null) {
                    str4 = boeLane;
                }
                jSONObject.put("X-TT-ENV", str4);
                jSONObject.put("X-USE-PPE", "1");
            } else if (localTestApi.enablePpe()) {
                String pPELane = localTestApi.getPPELane();
                if (pPELane != null) {
                    str4 = pPELane;
                }
                jSONObject.put("X-TT-ENV", str4);
                jSONObject.put("X-USE-PPE", "1");
            }
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "tokenObj.toString()");
        LJIILLIIL3.token = jSONObject2;
        SAMICoreVopInitContext LJIILLIIL4 = LJIILLIIL();
        Integer num3 = E8I.LIZ().connectionTimeout;
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = LiveExchangeConfirmThreshold.DEFAULT;
        }
        LJIILLIIL4.connectionTimeout = i;
        LJIILLIIL().tokenType = SAMICoreTokenType.TOKEN_TO_C_D;
        LJIILLIIL().snrModelPath = str;
        LJIILLIIL().saveFileDir = genVopSdkSavePath;
        SAMICoreVopInitContext LJIILLIIL5 = LJIILLIIL();
        Float f4 = E8I.LIZ().werThreshold;
        if (f4 != null) {
            f = f4.floatValue();
        } else {
            f = 0.2f;
        }
        LJIILLIIL5.werThreshold = f;
        SAMICoreVopInitContext LJIILLIIL6 = LJIILLIIL();
        Float f5 = E8I.LIZ().snrThreshold;
        if (f5 != null) {
            f2 = f5.floatValue();
        } else {
            f2 = 20.0f;
        }
        LJIILLIIL6.snrThreshold = f2;
        SAMICoreVopInitContext LJIILLIIL7 = LJIILLIIL();
        Integer num4 = E8I.LIZ().werFailedMaxTimes;
        if (num4 != null) {
            i2 = num4.intValue();
        } else {
            i2 = 3;
        }
        LJIILLIIL7.werFailedMaxTimes = i2;
        SAMICoreVopInitContext LJIILLIIL8 = LJIILLIIL();
        Float f6 = E8I.LIZ().cutoffLength;
        if (f6 != null) {
            f3 = f6.floatValue();
        } else {
            f3 = 0.3f;
        }
        LJIILLIIL8.cutoffLength = f3;
        SAMICoreVopInitContext LJIILLIIL9 = LJIILLIIL();
        Integer num5 = E8I.LIZ().resampleRate;
        if (num5 != null) {
            i3 = num5.intValue();
        } else {
            i3 = 24000;
        }
        LJIILLIIL9.resampleRate = i3;
        SAMICoreVopInitContext LJIILLIIL10 = LJIILLIIL();
        String str5 = E8I.LIZ().sampleTextContent;
        if (str5 == null) {
            str5 = "hello this is personal voice";
        }
        LJIILLIIL10.sampleTextContent = str5;
        Integer num6 = E8I.LIZ().textType;
        if (num6 == null || num6.intValue() != 50) {
            Integer num7 = E8I.LIZ().textType;
            if (num7 == null || num7.intValue() != 80) {
                LJIILLIIL().textType = SAMICoreVopTextType.PRIMARY;
            } else {
                LJIILLIIL().textType = SAMICoreVopTextType.STANDARD;
            }
        } else {
            LJIILLIIL().textType = SAMICoreVopTextType.PRIMARY;
        }
        LJIILLIIL().recordingType = SAMICoreVopRecordingType.PCM_S16;
        SAMICoreVopInitContext LJIILLIIL11 = LJIILLIIL();
        Integer num8 = E8I.LIZ().sampleRate;
        if (num8 != null) {
            i4 = num8.intValue();
        } else {
            i4 = 44100;
        }
        LJIILLIIL11.sampleRate = i4;
        SAMICoreVopInitContext LJIILLIIL12 = LJIILLIIL();
        Integer num9 = E8I.LIZ().channel;
        if (num9 != null) {
            i6 = num9.intValue();
        }
        LJIILLIIL12.channel = i6;
        SAMICoreVopInitContext LJIILLIIL13 = LJIILLIIL();
        Integer num10 = E8I.LIZ().maxBlockSize;
        if (num10 != null) {
            i5 = num10.intValue();
        } else {
            i5 = 512;
        }
        LJIILLIIL13.maxBlockSize = i5;
        LJIILLIIL().userId = VopCameraClientService.LIZ().getCurrentUserId();
        int init = LJIILL().init(LJIILLIIL());
        C86853Y6v c86853Y6v = new C86853Y6v(0);
        c86853Y6v.LJI = Integer.valueOf(init);
        return c86853Y6v;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final void LIZJ(Context context, String str) {
        String str2 = E8I.LIZ().webUrl;
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("&enter_from=");
        LIZ.append(str);
        String encode = URLEncoder.encode(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str2);
        LIZ2.append(encode);
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ2)).open(0, new Y76());
    }
}
