package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.IAudioWatermarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hd6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44488Hd6 implements InterfaceC44470Hco {
    public static final String LJIIIZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJI("pic/");
    public boolean LIZ;
    public boolean LIZIZ;
    public WaterMarkBuilder LIZLLL;
    public long LJ;
    public C44484Hd2 LJFF;
    public HOW LJI;
    public VEUtils.VEVideoFileInfo LJII;
    public final Context LIZJ = C16880lQ.LLLLJI(C60903NvH.LJ);
    public final CreativeInfo LJIIIIZZ = new CreativeInfo(null, 0, null, 7, null);

    @Override // X.InterfaceC44470Hco
    public final void LIZIZ() {
        WaterMarkListener waterMarkListener;
        this.LIZ = true;
        this.LIZIZ = true;
        HOW how = this.LJI;
        if (how != null) {
            how.reset();
        }
        C44484Hd2 c44484Hd2 = this.LJFF;
        if (c44484Hd2 != null && c44484Hd2.LIZIZ) {
            C44485Hd3 c44485Hd3 = c44484Hd2.LIZJ;
            if (c44485Hd3 != null) {
                C44484Hd2.LIZIZ(c44485Hd3);
            }
            InterfaceC153045zY interfaceC153045zY = c44484Hd2.LIZLLL;
            if (interfaceC153045zY != null) {
                interfaceC153045zY.destroy();
            }
            c44484Hd2.LIZLLL = null;
            c44484Hd2.LIZIZ = false;
        }
        WaterMarkBuilder waterMarkBuilder = this.LIZLLL;
        if (waterMarkBuilder != null && (waterMarkListener = waterMarkBuilder.listener) != null) {
            waterMarkListener.onCancel();
        }
    }

    @Override // X.InterfaceC44470Hco
    public final void LIZ() {
        WaterMarkBuilder waterMarkBuilder;
        List<String> list;
        List<String> list2;
        WaterMarkBuilder waterMarkBuilder2 = this.LIZLLL;
        if (waterMarkBuilder2 == null) {
            return;
        }
        if (waterMarkBuilder2.addInterMark) {
            LJ(false);
            if (AudioWatermarkServiceImpl.LIZLLL().enbaleAudioWatermarkTTSVC()) {
                IAudioWatermarkService LIZLLL = AudioWatermarkServiceImpl.LIZLLL();
                WaterMarkBuilder waterMarkBuilder3 = this.LIZLLL;
                if (waterMarkBuilder3 == null || (list = waterMarkBuilder3.ttsCreatorIdList) == null) {
                    list = C61878OQg.INSTANCE;
                }
                if (waterMarkBuilder3 == null || (list2 = waterMarkBuilder3.vcCreatorIdList) == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                LIZLLL.fetchAudioWatermarkInfo(list, list2, new AqS173S0100000_7(this, 319));
            }
            HOW how = this.LJI;
            o.LJI(how);
            WaterMarkBuilder waterMarkBuilder4 = this.LIZLLL;
            o.LJI(waterMarkBuilder4);
            how.LIZ(true, waterMarkBuilder4.author);
            HOW how2 = this.LJI;
            o.LJI(how2);
            WaterMarkBuilder waterMarkBuilder5 = this.LIZLLL;
            o.LJI(waterMarkBuilder5);
            how2.LIZ(false, waterMarkBuilder5.author);
        }
        WaterMarkBuilder waterMarkBuilder6 = this.LIZLLL;
        o.LJI(waterMarkBuilder6);
        if (waterMarkBuilder6.isInstagram) {
            C44172HVg.LJII.getClass();
            if (C44496HdE.LIZ() && this.LIZJ != null && (waterMarkBuilder = this.LIZLLL) != null) {
                int width = waterMarkBuilder.video.getWidth();
                WaterMarkBuilder waterMarkBuilder7 = this.LIZLLL;
                o.LJI(waterMarkBuilder7);
                int height = waterMarkBuilder7.video.getHeight();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(width));
                arrayList.add(Integer.valueOf(height));
                InterfaceC43114Gw2 LIZJ = C60903NvH.LJIIJJI().LIZJ();
                WaterMarkBuilder waterMarkBuilder8 = this.LIZLLL;
                o.LJI(waterMarkBuilder8);
                String str = waterMarkBuilder8.inputPath;
                WaterMarkBuilder waterMarkBuilder9 = this.LIZLLL;
                o.LJI(waterMarkBuilder9);
                InterfaceC45930I0w interfaceC45930I0w = waterMarkBuilder9.author;
                o.LJIIIIZZ(interfaceC45930I0w, "markBuilder!!.author");
                LIZJ.LIZJ(arrayList, str, interfaceC45930I0w, null, null);
            }
        }
    }

    public C44488Hd6() {
        C39579Fg7.LJ(LJIIIZ, false);
    }

    @Override // X.InterfaceC44470Hco
    public final void LIZJ(WaterMarkBuilder waterMarkBuilder) {
        this.LIZLLL = waterMarkBuilder;
    }

    public final void LJ(boolean z) {
        int i;
        WaterMarkBuilder waterMarkBuilder = this.LIZLLL;
        if (waterMarkBuilder != null) {
            o.LJI(waterMarkBuilder);
            if (waterMarkBuilder.video == null) {
                return;
            }
            if (this.LJI != null && !z) {
                return;
            }
            WaterMarkBuilder waterMarkBuilder2 = this.LIZLLL;
            o.LJI(waterMarkBuilder2);
            if (waterMarkBuilder2.isInstagram) {
                i = 2;
            } else {
                i = -1;
            }
            WaterMarkBuilder waterMarkBuilder3 = this.LIZLLL;
            o.LJI(waterMarkBuilder3);
            int width = waterMarkBuilder3.video.getWidth();
            WaterMarkBuilder waterMarkBuilder4 = this.LIZLLL;
            o.LJI(waterMarkBuilder4);
            int height = waterMarkBuilder4.video.getHeight();
            CreativeInfo creativeInfo = this.LJIIIIZZ;
            WaterMarkBuilder waterMarkBuilder5 = this.LIZLLL;
            o.LJI(waterMarkBuilder5);
            String bitRatedRatioUri = waterMarkBuilder5.video.getPlayAddrH264().getBitRatedRatioUri();
            o.LJIIIIZZ(bitRatedRatioUri, "markBuilder!!.video.playAddrH264.bitRatedRatioUri");
            this.LJI = HOV.LIZIZ(creativeInfo, i, bitRatedRatioUri, false, new int[]{width, height});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0158, code lost:
    
        if (r0.addEndMark != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017e, code lost:
    
        if (r1 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0181, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0165, code lost:
    
        r0 = r7.LIZLLL;
        kotlin.jvm.internal.o.LJI(r0);
        r0 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r0.inputPath);
        r7.LJII = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0172, code lost:
    
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0174, code lost:
    
        r0 = r7.LIZLLL;
        kotlin.jvm.internal.o.LJI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
    
        if (r0.listener != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0186, code lost:
    
        r0 = r7.LIZLLL;
        kotlin.jvm.internal.o.LJI(r0);
        r0.listener.onError(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0191, code lost:
    
        r7.LIZ = false;
        r7.LIZIZ = false;
        r0 = r7.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0197, code lost:
    
        if (r0 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0199, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        X.C10K.LIZIZ(new X.CallableC44476Hcu(r7, r0, r4, r3), X.C38995FSd.LIZLLL(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0163, code lost:
    
        if (X.C44496HdE.LIZ() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // X.InterfaceC44470Hco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder r8) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44488Hd6.waterMark(com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder):void");
    }

    public final void LIZLLL(int i, int i2, String str) {
        HOW how = this.LJI;
        if (how != null) {
            how.reset();
        }
        WaterMarkBuilder waterMarkBuilder = this.LIZLLL;
        o.LJI(waterMarkBuilder);
        if (waterMarkBuilder.listener != null) {
            WaterMarkBuilder waterMarkBuilder2 = this.LIZLLL;
            o.LJI(waterMarkBuilder2);
            waterMarkBuilder2.listener.onError(i2);
        }
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        WaterMarkBuilder waterMarkBuilder3 = this.LIZLLL;
        o.LJI(waterMarkBuilder3);
        C135335Sv.LIZ("mTmpPath", waterMarkBuilder3.inputPath);
        WaterMarkBuilder waterMarkBuilder4 = this.LIZLLL;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r22, int r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44488Hd6.LJFF(int, int, java.lang.String, boolean):void");
    }
}
