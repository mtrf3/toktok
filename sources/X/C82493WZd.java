package X;

import Y.ARunnableS27S0200000_8;
import android.os.Process;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.structures.SAMICoreAudioBin;
import com.mammon.audiosdk.structures.SAMICoreAudioConfig;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.mammon.audiosdk.structures.SAMICoreVcContextCreateParameter;
import com.mammon.audiosdk.structures.SAMICoreVcSpeakerParameter;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.WZd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82493WZd implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final ReentrantLock LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public SAMICore LJLJJLL;
    public volatile boolean LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public Effect LJLL;
    public C168316j5 LJLLI;
    public InterfaceC88472Yns<? super WZ5, C76800UCe> LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final C82478WYo LJLZ;
    public final C82478WYo LJZ;
    public final C82478WYo LJZI;
    public boolean LJZL;
    public final int LL;
    public int LLD;
    public boolean LLF;
    public final C82491WZb LLFF;

    static {
        TBT tbt = new TBT(C82493WZd.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    public final synchronized void LJII() {
        try {
            this.LJLJI.lock();
            if (!this.LJLJL) {
                return;
            }
            if (this.LJLJJI) {
                return;
            }
            this.LJLJJI = true;
            System.currentTimeMillis();
            SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
            sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Stop_Server;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("zxzzz_SamiSVC: Stop_Server START ... , isShootingScene = ");
            LIZ.append(this.LJLLLL);
            LIZ.append(", isPreviewScene = ");
            LIZ.append(this.LJLLL);
            LIZ.append(", thread_id = ");
            LIZ.append(Process.myTid());
            LIZ.append(", thread_name = ");
            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
            H78.LIZJ(X1D.LIZIZ(LIZ));
            int SAMICoreSetProperty = this.LJLJJLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("zxzzz_SamiSVC: ... Stop_Server STOP , isShootingScene = ");
            LIZ2.append(this.LJLLLL);
            LIZ2.append(", isPreviewScene = ");
            LIZ2.append(this.LJLLL);
            LIZ2.append(", thread_id = ");
            LIZ2.append(Process.myTid());
            LIZ2.append(", thread_name = ");
            LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
            H78.LIZJ(X1D.LIZIZ(LIZ2));
            if (SAMICoreSetProperty != 0) {
                LJIIIIZZ(new WZ5("EVENT_SDK_FAILED"));
            }
            LIZIZ(new AqS180S0100000_14(this, 296));
        } finally {
            this.LJLJI.unlock();
        }
    }

    public final ShortVideoContext LIZ() {
        return (ShortVideoContext) this.LJLILLLLZI.LIZ(this, LLFFF[0]);
    }

    public final void LIZJ() {
        try {
            this.LJLJI.lock();
            if (this.LJLJL) {
                this.LJLJL = false;
            } else {
                this.LJLJL = true;
                System.currentTimeMillis();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("zxzzz_SamiSVC: new SAMICore START ... , isShootingScene = ");
                LIZ.append(this.LJLLLL);
                LIZ.append(", isPreviewScene = ");
                LIZ.append(this.LJLLL);
                LIZ.append(", thread_id = ");
                LIZ.append(Process.myTid());
                LIZ.append(", thread_name = ");
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ));
                SAMICore sAMICore = new SAMICore();
                this.LJLJJLL = sAMICore;
                sAMICore.setListener(this.LLFF);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("zxzzz_SamiSVC: ... new SAMICore STOP , isShootingScene = ");
                LIZ2.append(this.LJLLLL);
                LIZ2.append(", isPreviewScene = ");
                LIZ2.append(this.LJLLL);
                LIZ2.append(", thread_id = ");
                LIZ2.append(Process.myTid());
                LIZ2.append(", thread_name = ");
                LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ2));
                SAMICoreVcContextCreateParameter sAMICoreVcContextCreateParameter = new SAMICoreVcContextCreateParameter();
                sAMICoreVcContextCreateParameter.url = "wss://sami.tiktokv.com/internal/api/v1/ws";
                sAMICoreVcContextCreateParameter.appKey = "vtSCUDJCnW";
                sAMICoreVcContextCreateParameter.tokenType = SAMICoreTokenType.TOKEN_TO_C_D;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("{\n    \"passport-auth\":\"session\",\n    \"x-tt-token\":\"");
                LIZ3.append(C60903NvH.LJIIJJI().getAccountService().getUserTTToken());
                LIZ3.append("\",\n    \"sdk-version\":\"");
                C60903NvH.LJIIJJI().getAccountService().getSDKVersion();
                LIZ3.append("2");
                LIZ3.append("\",\n    \"cookie\":\"sessionid=");
                LIZ3.append(((RBX) HG3.LJIILL()).getSessionKey());
                LIZ3.append("\"\n}");
                sAMICoreVcContextCreateParameter.token = X1D.LIZIZ(LIZ3);
                CreativeInfo creativeInfo = LIZ().creativeInfo;
                o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                sAMICoreVcContextCreateParameter.saveFileDir = C171196nj.LIZ(creativeInfo);
                sAMICoreVcContextCreateParameter.enableAudioCache = true;
                sAMICoreVcContextCreateParameter.audioCacheSize = 882000;
                sAMICoreVcContextCreateParameter.connectTimeout = LiveCenterDelayLoadSetting.DEFAULT;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("zxzzz_SamiSVC: createHandle START ... , isShootingScene = ");
                LIZ4.append(this.LJLLLL);
                LIZ4.append(", isPreviewScene = ");
                LIZ4.append(this.LJLLL);
                LIZ4.append(", thread_id = ");
                LIZ4.append(Process.myTid());
                LIZ4.append(", thread_name = ");
                LIZ4.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ4));
                int SAMICoreCreateHandleByIdentify = this.LJLJJLL.SAMICoreCreateHandleByIdentify(SAMICoreIdentify.SAMICoreIdentify_Streaming_VC_Online, sAMICoreVcContextCreateParameter);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("zxzzz_SamiSVC: ... createHandle STOP , isShootingScene = ");
                LIZ5.append(this.LJLLLL);
                LIZ5.append(", isPreviewScene = ");
                LIZ5.append(this.LJLLL);
                LIZ5.append(", thread_id = ");
                LIZ5.append(Process.myTid());
                LIZ5.append(", thread_name = ");
                LIZ5.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ5));
                if (SAMICoreCreateHandleByIdentify == 0) {
                    System.currentTimeMillis();
                    SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                    sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Open_Loudspeaker;
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("zxzzz_SamiSVC: Open_Loudspeaker START ... , isShootingScene = ");
                    LIZ6.append(this.LJLLLL);
                    LIZ6.append(", isPreviewScene = ");
                    LIZ6.append(this.LJLLL);
                    LIZ6.append(", thread_id = ");
                    LIZ6.append(Process.myTid());
                    LIZ6.append(", thread_name = ");
                    LIZ6.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ6));
                    int SAMICoreSetProperty = this.LJLJJLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("zxzzz_SamiSVC: ... Open_Loudspeaker STOP , isShootingScene = ");
                    LIZ7.append(this.LJLLLL);
                    LIZ7.append(", isPreviewScene = ");
                    LIZ7.append(this.LJLLL);
                    LIZ7.append(", thread_id = ");
                    LIZ7.append(Process.myTid());
                    LIZ7.append(", thread_name = ");
                    LIZ7.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ7));
                    if (SAMICoreSetProperty != 0) {
                        WZ5 wz5 = new WZ5("EVENT_SDK_FAILED");
                        wz5.LIZIZ = 2001;
                        LJIIIIZZ(wz5);
                        if (this.LJLLL) {
                            this.LJLZ.LJIIIIZZ("2001", "open_loudspeaker failed");
                            this.LJZ.LJIIIIZZ("2001", "open_loudspeaker failed");
                        }
                        if (this.LJLLLL) {
                            this.LJZI.LJIIIIZZ("2001", "open_loudspeaker failed");
                        }
                    }
                }
            }
        } finally {
            this.LJLJI.unlock();
        }
    }

    public final void LJ() {
        try {
            this.LJLJI.lock();
            if (this.LJLJL) {
                C82468WYe.LJI(LIZ(), this.LJLL);
                this.LJLZ.LIZIZ();
                this.LJZ.LIZIZ();
                this.LJZI.LIZIZ();
                System.currentTimeMillis();
                SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Audio_Start_Play;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("zxzzz_SamiSVC: Start_Play START ... , isShootingScene = ");
                LIZ.append(this.LJLLLL);
                LIZ.append(", isPreviewScene = ");
                LIZ.append(this.LJLLL);
                LIZ.append(", thread_id = ");
                LIZ.append(Process.myTid());
                LIZ.append(", thread_name = ");
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ));
                int SAMICoreSetProperty = this.LJLJJLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("zxzzz_SamiSVC: ... Start_Play STOP , isShootingScene = ");
                LIZ2.append(this.LJLLLL);
                LIZ2.append(", isPreviewScene = ");
                LIZ2.append(this.LJLLL);
                LIZ2.append(", thread_id = ");
                LIZ2.append(Process.myTid());
                LIZ2.append(", thread_name = ");
                LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ2));
                if (SAMICoreSetProperty != 0) {
                    LJIIIIZZ(new WZ5("EVENT_SDK_FAILED"));
                }
            }
        } finally {
            this.LJLJI.unlock();
        }
    }

    public final void LJI() {
        try {
            this.LJLJI.lock();
            if (this.LJLJL) {
                System.currentTimeMillis();
                SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Audio_Stop_Play;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("zxzzz_SamiSVC: Stop_Play START ... , isShootingScene = ");
                LIZ.append(this.LJLLLL);
                LIZ.append(", isPreviewScene = ");
                LIZ.append(this.LJLLL);
                LIZ.append(", thread_id = ");
                LIZ.append(Process.myTid());
                LIZ.append(", thread_name = ");
                LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ));
                int SAMICoreSetProperty = this.LJLJJLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("zxzzz_SamiSVC: ... Stop_Play STOP , isShootingScene = ");
                LIZ2.append(this.LJLLLL);
                LIZ2.append(", isPreviewScene = ");
                LIZ2.append(this.LJLLL);
                LIZ2.append(", thread_id = ");
                LIZ2.append(Process.myTid());
                LIZ2.append(", thread_name = ");
                LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                H78.LIZJ(X1D.LIZIZ(LIZ2));
                if (SAMICoreSetProperty != 0) {
                    LJIIIIZZ(new WZ5("EVENT_SDK_FAILED"));
                }
                LIZIZ(new AqS180S0100000_14(this, 295));
                if (this.LJLLL && this.LJZL) {
                    this.LJZ.LJII(CardStruct.IStatusCode.DEFAULT, "success", true);
                }
            }
        } finally {
            this.LJLJI.unlock();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82493WZd(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJI = new ReentrantLock();
        this.LJLJJLL = new SAMICore();
        this.LJLJLJ = "";
        this.LJLJLLL = "";
        this.LJLL = new Effect(null, 1, null);
        this.LJLLI = new C168316j5(null, null, null, null, null, null, 511);
        this.LJLLILLLL = C82502WZm.LJLIL;
        C82478WYo c82478WYo = new C82478WYo(LIZ());
        c82478WYo.LIZ(2);
        this.LJLZ = c82478WYo;
        C82478WYo c82478WYo2 = new C82478WYo(LIZ());
        c82478WYo2.LIZ(1);
        this.LJZ = c82478WYo2;
        C82478WYo c82478WYo3 = new C82478WYo(LIZ());
        c82478WYo3.LIZ(3);
        this.LJZI = c82478WYo3;
        this.LL = 60;
        this.LLF = true;
        this.LLFF = new C82491WZb(this);
    }

    public final void LIZIZ(InterfaceC88472Yns<? super JSONObject, C76800UCe> result) {
        o.LJIIIZ(result, "result");
        C82544WaS.LIZ(new ARunnableS27S0200000_8(result, this, 55));
    }

    public final void LJFF(Effect effect) {
        boolean z;
        o.LJIIIZ(effect, "effect");
        try {
            this.LJLJI.lock();
            String LJJJLZIJ = OUP.LJJJLZIJ(effect);
            String LJIJI = OUP.LJIJI(effect);
            if (this.LJLJL) {
                if (LJJJLZIJ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    WZ5 wz5 = new WZ5("EVENT_SDK_FAILED");
                    wz5.LIZIZ = 5001;
                    LJIIIIZZ(wz5);
                    if (this.LJLLL) {
                        this.LJLZ.LJIIIIZZ("5001", "empty speaker_id");
                        this.LJZ.LJIIIIZZ("5001", "empty speaker_id");
                    }
                    if (this.LJLLLL) {
                        this.LJZI.LJIIIIZZ("5001", "empty speaker_id");
                    }
                } else {
                    if (this.LJLLL) {
                        ShortVideoContext shortVideoContext = LIZ();
                        Effect effect2 = this.LJLL;
                        o.LJIIIZ(shortVideoContext, "shortVideoContext");
                        o.LJIIIZ(effect2, "effect");
                        C145995oB LJIIIZ = C82468WYe.LJIIIZ(shortVideoContext);
                        LJIIIZ.LIZLLL("effect_id", effect2.getEffect_id());
                        LJIIIZ.LIZLLL("effect_name", effect2.getName());
                        FMX.LJIIL("voice_effect_preview_record_vc_start", LJIIIZ.LIZ);
                    }
                    this.LJLJLJ = LJJJLZIJ;
                    this.LJLL = effect;
                    this.LJLJLLL = LJIJI;
                    C82478WYo c82478WYo = this.LJLZ;
                    c82478WYo.getClass();
                    c82478WYo.LIZJ = effect;
                    this.LJLZ.LIZIZ();
                    C82478WYo c82478WYo2 = this.LJZ;
                    c82478WYo2.getClass();
                    c82478WYo2.LIZJ = effect;
                    this.LJZ.LIZIZ();
                    C82478WYo c82478WYo3 = this.LJZI;
                    c82478WYo3.getClass();
                    c82478WYo3.LIZJ = effect;
                    this.LJZI.LIZIZ();
                    System.currentTimeMillis();
                    SAMICoreVcSpeakerParameter sAMICoreVcSpeakerParameter = new SAMICoreVcSpeakerParameter();
                    sAMICoreVcSpeakerParameter.speaker = LJJJLZIJ;
                    sAMICoreVcSpeakerParameter.enableSaveInputAudioData = true;
                    sAMICoreVcSpeakerParameter.enableSaveOutputAudioData = true;
                    sAMICoreVcSpeakerParameter.enableBackground = true;
                    sAMICoreVcSpeakerParameter.enablePlaying = true;
                    sAMICoreVcSpeakerParameter.playerCacheTime = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
                    SAMICoreAudioConfig sAMICoreAudioConfig = new SAMICoreAudioConfig();
                    sAMICoreVcSpeakerParameter.inputAudioConfig = sAMICoreAudioConfig;
                    sAMICoreAudioConfig.sampleRate = 44100;
                    sAMICoreAudioConfig.channel = 1;
                    sAMICoreAudioConfig.format = "s16le";
                    SAMICoreAudioConfig sAMICoreAudioConfig2 = new SAMICoreAudioConfig();
                    sAMICoreVcSpeakerParameter.outputAudioConfig = sAMICoreAudioConfig2;
                    sAMICoreAudioConfig2.sampleRate = 24000;
                    sAMICoreAudioConfig2.channel = 1;
                    sAMICoreAudioConfig2.format = "s16le";
                    SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                    sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Set_Speaker;
                    sAMICoreProperty.type = SAMICoreDataType.SAMICoreDataType_WebSocket_Vc_Speaker;
                    sAMICoreProperty.dataObjectArray = r0;
                    Object[] objArr = {sAMICoreVcSpeakerParameter};
                    sAMICoreProperty.dataArrayLen = 1;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("zxzzz_SamiSVC: WebSocket_Vc_Speaker START ... , isShootingScene = ");
                    LIZ.append(this.LJLLLL);
                    LIZ.append(", isPreviewScene = ");
                    LIZ.append(this.LJLLL);
                    LIZ.append(", thread_id = ");
                    LIZ.append(Process.myTid());
                    LIZ.append(", thread_name = ");
                    LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ));
                    SAMICore sAMICore = this.LJLJJLL;
                    SAMICorePropertyId sAMICorePropertyId = SAMICorePropertyId.SAMICorePropertyId_VC_Online;
                    sAMICore.SAMICoreSetProperty(sAMICorePropertyId, sAMICoreProperty);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("zxzzz_SamiSVC: ... WebSocket_Vc_Speaker STOP , isShootingScene = ");
                    LIZ2.append(this.LJLLLL);
                    LIZ2.append(", isPreviewScene = ");
                    LIZ2.append(this.LJLLL);
                    LIZ2.append(", thread_id = ");
                    LIZ2.append(Process.myTid());
                    LIZ2.append(", thread_name = ");
                    LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ2));
                    System.currentTimeMillis();
                    SAMICoreProperty sAMICoreProperty2 = new SAMICoreProperty();
                    sAMICoreProperty2.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Start_Server;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("zxzzz_SamiSVC: Start_Server START ... , isShootingScene = ");
                    LIZ3.append(this.LJLLLL);
                    LIZ3.append(", isPreviewScene = ");
                    LIZ3.append(this.LJLLL);
                    LIZ3.append(", thread_id = ");
                    LIZ3.append(Process.myTid());
                    LIZ3.append(", thread_name = ");
                    LIZ3.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ3));
                    int SAMICoreSetProperty = this.LJLJJLL.SAMICoreSetProperty(sAMICorePropertyId, sAMICoreProperty2);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("zxzzz_SamiSVC: ... Start_Server STOP , isShootingScene = ");
                    LIZ4.append(this.LJLLLL);
                    LIZ4.append(", isPreviewScene = ");
                    LIZ4.append(this.LJLLL);
                    LIZ4.append(", thread_id = ");
                    LIZ4.append(Process.myTid());
                    LIZ4.append(", thread_name = ");
                    LIZ4.append(C16880lQ.LLLLIIIILLL().getName());
                    H78.LIZJ(X1D.LIZIZ(LIZ4));
                    if (SAMICoreSetProperty != 0) {
                        LJIIIIZZ(new WZ5("EVENT_SDK_FAILED"));
                    }
                }
            }
        } finally {
            this.LJLJI.unlock();
        }
    }

    public final void LJIIIIZZ(WZ5 wz5) {
        this.LJLLILLLL.invoke(wz5);
    }

    public final int LIZLLL(byte[] bArr, boolean z) {
        try {
            this.LJLJI.lock();
            if (this.LJLJL) {
                System.currentTimeMillis();
                if (z) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length / 2];
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2 += 4) {
                        try {
                            bArr2[i] = bArr[i2];
                            bArr2[i + 1] = bArr[i2 + 1];
                            i += 2;
                        } catch (Exception unused) {
                            bArr = new byte[0];
                        }
                    }
                    bArr = bArr2;
                }
                this.LLD++;
                if (bArr.length != 0) {
                    System.currentTimeMillis();
                    SAMICoreAudioBin sAMICoreAudioBin = new SAMICoreAudioBin();
                    SAMICoreBlock sAMICoreBlock = new SAMICoreBlock();
                    sAMICoreBlock.dataType = SAMICoreDataType.SAMICoreDataType_AudioBin;
                    sAMICoreBlock.audioData = r0;
                    SAMICoreAudioBin[] sAMICoreAudioBinArr = {sAMICoreAudioBin};
                    sAMICoreBlock.numberAudioData = 1;
                    try {
                        sAMICoreAudioBin.audioData = bArr;
                        C82478WYo c82478WYo = this.LJLZ;
                        int length2 = bArr.length;
                        if (!c82478WYo.LIZLLL) {
                            c82478WYo.LJIIIIZZ += length2;
                        }
                        C82478WYo c82478WYo2 = this.LJZ;
                        int length3 = bArr.length;
                        if (!c82478WYo2.LIZLLL) {
                            c82478WYo2.LJIIIIZZ += length3;
                        }
                        C82478WYo c82478WYo3 = this.LJZI;
                        int length4 = bArr.length;
                        if (!c82478WYo3.LIZLLL) {
                            c82478WYo3.LJIIIIZZ += length4;
                        }
                        if (this.LLD % this.LL == 0) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("zxzzz_SamiSVC: SAMICoreProcess START ... , isShootingScene = ");
                            LIZ.append(this.LJLLLL);
                            LIZ.append(", isPreviewScene = ");
                            LIZ.append(this.LJLLL);
                            LIZ.append(", thread_id = ");
                            LIZ.append(Process.myTid());
                            LIZ.append(", thread_name = ");
                            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
                            H78.LIZJ(X1D.LIZIZ(LIZ));
                        }
                        this.LJLJJLL.SAMICoreProcess(sAMICoreBlock, null);
                        if (this.LLD % this.LL == 0) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("zxzzz_SamiSVC: ... SAMICoreProcess STOP , isShootingScene = ");
                            LIZ2.append(this.LJLLLL);
                            LIZ2.append(", isPreviewScene = ");
                            LIZ2.append(this.LJLLL);
                            LIZ2.append(", thread_id = ");
                            LIZ2.append(Process.myTid());
                            LIZ2.append(", thread_name = ");
                            LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
                            H78.LIZJ(X1D.LIZIZ(LIZ2));
                        }
                    } catch (Exception unused2) {
                    }
                    return 0;
                }
            }
            this.LJLJI.unlock();
            return -1;
        } finally {
            this.LJLJI.unlock();
        }
    }
}
