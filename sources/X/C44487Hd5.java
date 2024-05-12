package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import com.ss.android.vesdk.VEUtils;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hd5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44487Hd5 implements InterfaceC44470Hco {
    public static final String LJIIJJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJI("pic/");
    public boolean LIZ;
    public boolean LIZIZ;
    public final Context LIZJ;
    public String LIZLLL;
    public String LJ;
    public WaterMarkBuilder LJFF;
    public long LJI;
    public C44483Hd1 LJII;
    public HOW LJIIIIZZ;
    public VEUtils.VEVideoFileInfo LJIIIZ;
    public final CreativeInfo LJIIJ;

    @Override // X.InterfaceC44470Hco
    public final void LIZIZ() {
        this.LIZ = true;
        this.LIZIZ = true;
        this.LIZLLL = null;
        this.LJ = null;
        HOW how = this.LJIIIIZZ;
        if (how != null) {
            how.reset();
        }
        C44483Hd1 c44483Hd1 = this.LJII;
        if (c44483Hd1 != null && c44483Hd1.LIZIZ) {
            C44485Hd3 c44485Hd3 = c44483Hd1.LIZJ;
            if (c44485Hd3 != null) {
                C44483Hd1.LIZIZ(c44485Hd3);
            }
            InterfaceC153045zY interfaceC153045zY = c44483Hd1.LIZLLL;
            if (interfaceC153045zY != null) {
                interfaceC153045zY.destroy();
            }
            c44483Hd1.LIZLLL = null;
            c44483Hd1.LIZIZ = false;
        }
        WaterMarkBuilder waterMarkBuilder = this.LJFF;
        o.LJI(waterMarkBuilder);
        if (waterMarkBuilder.listener != null) {
            WaterMarkBuilder waterMarkBuilder2 = this.LJFF;
            o.LJI(waterMarkBuilder2);
            waterMarkBuilder2.listener.onCancel();
        }
    }

    @Override // X.InterfaceC44470Hco
    public final void LIZ() {
        String str;
        List<String> list;
        List<String> list2;
        WaterMarkBuilder waterMarkBuilder = this.LJFF;
        if (waterMarkBuilder == null) {
            return;
        }
        if (waterMarkBuilder.addInterMark) {
            LJ(false);
            InterfaceC45930I0w interfaceC45930I0w = null;
            if (AudioWatermarkServiceImpl.LIZLLL().enbaleAudioWatermarkTTSVC()) {
                IAudioWatermarkService LIZLLL = AudioWatermarkServiceImpl.LIZLLL();
                WaterMarkBuilder waterMarkBuilder2 = this.LJFF;
                if (waterMarkBuilder2 == null || (list = waterMarkBuilder2.ttsCreatorIdList) == null) {
                    list = C61878OQg.INSTANCE;
                }
                if (waterMarkBuilder2 == null || (list2 = waterMarkBuilder2.vcCreatorIdList) == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                LIZLLL.fetchAudioWatermarkInfo(list, list2, new AqS173S0100000_7(this, 317));
            } else {
                HOW how = this.LJIIIIZZ;
                if (how != null) {
                    WaterMarkBuilder waterMarkBuilder3 = this.LJFF;
                    if (waterMarkBuilder3 != null) {
                        str = waterMarkBuilder3.ttsVoiceCreatorDesc;
                        interfaceC45930I0w = waterMarkBuilder3.author;
                    } else {
                        str = null;
                    }
                    how.LJ(str, interfaceC45930I0w);
                }
            }
            HOW how2 = this.LJIIIIZZ;
            o.LJI(how2);
            WaterMarkBuilder waterMarkBuilder4 = this.LJFF;
            o.LJI(waterMarkBuilder4);
            how2.LIZ(true, waterMarkBuilder4.author);
            HOW how3 = this.LJIIIIZZ;
            o.LJI(how3);
            WaterMarkBuilder waterMarkBuilder5 = this.LJFF;
            o.LJI(waterMarkBuilder5);
            how3.LIZ(false, waterMarkBuilder5.author);
        }
        WaterMarkBuilder waterMarkBuilder6 = this.LJFF;
        o.LJI(waterMarkBuilder6);
        if (waterMarkBuilder6.isInstagram) {
            C44172HVg.LJII.getClass();
            if (C44496HdE.LIZ()) {
                LJI();
            }
        }
    }

    public final void LJI() {
        String str = this.LIZLLL;
        if (str != null && C44687HgJ.LIZIZ(str)) {
            return;
        }
        WaterMarkBuilder waterMarkBuilder = this.LJFF;
        o.LJI(waterMarkBuilder);
        String nickname = waterMarkBuilder.author.getNickname();
        WaterMarkBuilder waterMarkBuilder2 = this.LJFF;
        o.LJI(waterMarkBuilder2);
        try {
            C78764Uvg.LJIILJJIL(waterMarkBuilder2.author.getAvatarMedium(), new C44466Hck(this, nickname));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C44487Hd5() {
        Context LLLLJI = C16880lQ.LLLLJI(C60903NvH.LJ);
        o.LJIIIIZZ(LLLLJI, "getApplication().applicationContext");
        this.LIZJ = LLLLJI;
        this.LJIIJ = new CreativeInfo(null, 0, null, 7, null);
        C39579Fg7.LJ(LJIIJJI, false);
    }

    @Override // X.InterfaceC44470Hco
    public final void LIZJ(WaterMarkBuilder waterMarkBuilder) {
        this.LJFF = waterMarkBuilder;
    }

    public final void LJ(boolean z) {
        WaterMarkBuilder waterMarkBuilder = this.LJFF;
        if (waterMarkBuilder != null) {
            o.LJI(waterMarkBuilder);
            if (waterMarkBuilder.video == null) {
                return;
            }
            if (this.LJIIIIZZ != null && !z) {
                return;
            }
            WaterMarkBuilder waterMarkBuilder2 = this.LJFF;
            o.LJI(waterMarkBuilder2);
            int i = waterMarkBuilder2.saveType;
            WaterMarkBuilder waterMarkBuilder3 = this.LJFF;
            o.LJI(waterMarkBuilder3);
            int width = waterMarkBuilder3.video.getWidth();
            WaterMarkBuilder waterMarkBuilder4 = this.LJFF;
            o.LJI(waterMarkBuilder4);
            int height = waterMarkBuilder4.video.getHeight();
            CreativeInfo creativeInfo = this.LJIIJ;
            WaterMarkBuilder waterMarkBuilder5 = this.LJFF;
            o.LJI(waterMarkBuilder5);
            String bitRatedRatioUri = waterMarkBuilder5.video.getPlayAddrH264().getBitRatedRatioUri();
            o.LJIIIIZZ(bitRatedRatioUri, "markBuilder!!.video.playAddrH264.bitRatedRatioUri");
            this.LJIIIIZZ = HOV.LIZIZ(creativeInfo, i, bitRatedRatioUri, false, new int[]{width, height});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0153, code lost:
    
        if (X.C44496HdE.LIZ() != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    @Override // X.InterfaceC44470Hco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r8) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44487Hd5.waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder):void");
    }

    public final void LIZLLL(int i, int i2, String str) {
        this.LIZLLL = null;
        this.LJ = null;
        HOW how = this.LJIIIIZZ;
        if (how != null) {
            how.reset();
        }
        WaterMarkBuilder waterMarkBuilder = this.LJFF;
        o.LJI(waterMarkBuilder);
        if (waterMarkBuilder.listener != null) {
            WaterMarkBuilder waterMarkBuilder2 = this.LJFF;
            o.LJI(waterMarkBuilder2);
            waterMarkBuilder2.listener.onError(i2);
        }
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        WaterMarkBuilder waterMarkBuilder3 = this.LJFF;
        o.LJI(waterMarkBuilder3);
        C135335Sv.LIZ("mTmpPath", waterMarkBuilder3.inputPath);
        WaterMarkBuilder waterMarkBuilder4 = this.LJFF;
        o.LJI(waterMarkBuilder4);
        C135335Sv.LIZ("mOutPath", waterMarkBuilder4.outPath);
        C170666ms.LIZJ(new Exception(KMP.LJ("WaterMarkComposer ret: ", i)));
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C43882HKc.LIZLLL(1, "aweme_download_synthesis_error_rate", null, true);
            }
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject.put("ret", i);
            jSONObject.put("ext", i2);
            jSONObject.put("msg", str);
            C43882HKc.LIZ.LJIILLIIL("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r22, int r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44487Hd5.LJFF(int, int, java.lang.String, boolean):void");
    }
}
